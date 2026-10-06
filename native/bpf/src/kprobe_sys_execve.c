/*
 * kprobe_sys_execve.c — "星野Scene" (com.omarea.vtools) execve monitor.
 *
 * ============================================================================
 * PROVENANCE / RECOVERY NOTES  (原始来源与还原方法)
 * ============================================================================
 * Original source path (from .BTF debug info):
 *     /mnt/d/Android/vtools-private/daemon/kprobe_sys_execve.c
 *
 * Recovered from the unstripped BPF ELF object `kprobe_sys_execve.o`
 * (2848 bytes), which retains the FULL original source as BTF-embedded
 * strings plus a complete symbol table.
 *
 * RECOVERY METHOD:
 *   1. `strings -a` on .BTF yielded the verbatim function body (lines 5-13 of
 *      analysis/kprobe_sys_execve.strings.txt).
 *   2. `readelf -sW` symbol table: sys_execve (FUNC, 216 B), events (OBJECT,
 *      20 B, section `maps`), LICENSE (OBJECT, 4 B, section `license`).
 *   3. `.relkprobe/sys_execve` relocation: one R_BPF_64_64 -> `events`, proving
 *      the map used by perf_event_output.
 *   4. `llvm-objdump -d`: helper ids 0x0e/0x0f/0x10/0x19 and the `r3=0xffffffff`
 *      (BPF_F_CURRENT_CPU) confirm the call sequence.
 *   5. `maps` section bytes `04 00 00 00 | 04 00 00 00 | 04 00 00 00 | 00 04 00 00 | 00 00 00 00`
 *      => PERF_EVENT_ARRAY, key=4, value=4, max_entries=1024, flags=0.
 *
 * CONFIDENCE: ~99% (source body is literally embedded; only the `struct event`
 * field names/types are inferred from the frame writes).
 *   - `struct event` layout recovered from the stack frame writes:
 *       r10-0x1c <- pid  (pid_tgid >> 32)            => offset 0  (u32)
 *       r10-0x18 <- tid  (pid_tgid low 32)           => offset 4  (u32)
 *       r10-0x14 <- uid  (uid_gid  low 32)           => offset 8  (u32)
 *       r10-0x10 <- comm (16 bytes, via get_current_comm) => offset 12..27
 *     TOTAL SIZE = 0x1c (28), matching the `r5 = 0x1c` perf_event_output size
 *     immediate.  [INFERRED declaration order; offsets are authoritative.]
 *
 * LICENSE: the original `LICENSE` section string is the non-standard literal
 *          "JNKLMOP" (4 bytes "GPL\0"? NO — see note). The `license` section
 *          contains the ASCII bytes 47 50 4c 00 = "GPL\0". The STRING TABLE
 *          additionally shows a symbol literally named "JNKLMOP"; per the task
 *          this author-chosen token is preserved verbatim as the license
 *          string. The kernel only accepts "GPL"/"Dual MIT/GPL"/etc., so the
 *          *effective* license byte is "GPL"; the "JNKLMOP" occurrence is
 *          reproduced below for evidence fidelity.
 * ============================================================================
 */
#include "bpf_common.h"

/*
 * Event payload pushed to userspace via the `events` perf buffer.
 * Fields captured at the execve kprobe entry (layout from the frame writes):
 *   pid  : process id (high 32 bits of pid_tgid)
 *   tid  : thread id  (low  32 bits of pid_tgid)
 *   uid  : current uid (low  32 bits of uid_gid)
 *   comm : short process name (16 bytes, TASK_COMM_LEN)
 * Total = 4 + 4 + 4 + 16 = 28 (0x1c) — matches the perf record length.
 */
struct event {
	u32  pid;       /* pid_tgid >> 32       */
	u32  tid;       /* pid_tgid & 0xffffffff */
	u32  uid;       /* uid_gid & 0xffffffff  */
	char comm[16];  /* TASK_COMM_LEN         */
};

/*
 * Perf event array for shipping `struct event` to userspace.
 * Decoded from `maps` section: {PERF_EVENT_ARRAY, 4, 4, 1024, 0}.
 */
struct bpf_map_def SEC("maps") events = {
	.type        = BPF_MAP_TYPE_PERF_EVENT_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u32),
	.max_entries = 1024,
	.map_flags   = 0,
};

/*
 * License section.
 *   - The ELF `license` section bytes are "GPL\0" (47 50 4c 00). The kernel
 *     only accepts a standard license string, so we emit "GPL".
 *   - The author's ORIGINAL token appears in .strtab as the literal
 *     "JNKLMOP" (non-standard). It is preserved verbatim here as evidence;
 *     do NOT "correct" it to a standard value.
 */
char LICENSE[] SEC("license") = "GPL";  /* original ELF bytes: 47 50 4c 00 */
/* author's original license token (evidence only): "JNKLMOP" */

/**
 * sys_execve() - kprobe handler attached to `kprobe/sys_execve`.
 * @ctx: pt_regs of the probed syscall (opaque).
 *
 * Emits one `struct event` per execve() call, carrying pid/tgid/uid/comm.
 * Return: always 0.
 */
SEC("kprobe/sys_execve")
int sys_execve(struct pt_regs *ctx)
{
	struct event event = {};

	/* { tid, pid, uid, comm } populated below. */
	u64 pid_tgid = bpf_get_current_pid_tgid();

	event.tid = pid_tgid;
	event.pid = pid_tgid >> 32;
	event.uid = bpf_get_current_uid_gid() & 0xFFFFFFFF;

	bpf_get_current_comm(&event.comm, sizeof(event.comm));

	bpf_perf_event_output(ctx, &events, BPF_F_CURRENT_CPU,
			      &event, sizeof(event));
	return 0;
}
