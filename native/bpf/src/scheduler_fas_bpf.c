/*
 * scheduler_fas_bpf.c — "星野Scene" (com.omarea.vtools) frame-aware scheduling
 *                        (FAS) latency / pending-frame probe.
 *
 * ============================================================================
 * PROVENANCE / RECOVERY NOTES  (原始来源与还原方法)
 * ============================================================================
 * Original source path (from .BTF debug info):
 *     /mnt/d/Android/vtools-private/daemon/scheduler_fas_bpf.c
 *
 * Recovered from the unstripped BPF ELF object `bpf_arm64_bpfel.o`
 * (4832 bytes), which retains most of the original source as BTF strings,
 * a full symbol table, a `maps` section and a `.bss` section.
 *
 * RECOVERY METHOD:
 *   1. `strings -a` (.BTF) yielded the near-verbatim bodies of BOTH programs
 *      (analysis/bpf_arm64_bpfel.strings.txt lines 6-25).
 *   2. `.BTF` type info gave the exact `struct event { u32 time; u32 pending; }`
 *      (size 8) and `struct bpf_map_def` layout + the three map VARs.
 *   3. `.reluretprobe/libgui` / `.reluretprobe/libgui_acquire` relocations named
 *      the referenced maps (track_config, pending_count, events).
 *   4. `maps` section = 3x20 bytes, decoded field-by-field (see below).
 *   5. `llvm-objdump -d`: helper ids 0x01 (lookup), 0x7d (ktime_get_boot_ns),
 *      0x19 (perf_event_output); immediates `r2 = 0x4` (clamp) and
 *      `r1 = 0xffffffff` (PENDING_UNKNOWN sentinel).
 *
 * CONFIDENCE: ~97% (both bodies are essentially embedded; only the two named
 * constants PENDING_UNKNOWN / MAX_PENDING needed values, taken from immediates).
 * ============================================================================
 *
 * FUNCTIONAL SUMMARY
 * ------------------
 * This is the "帧率感知调度 / Frame-Aware Scheduling (FAS)" probe. It hooks the
 * RETURN of two functions in Android's libgui (SurfaceFlinger client queue):
 *   - uretprobe/libgui          : the frame *enqueue* path  (pending_t::increment)
 *   - uretprobe/libgui_acquire  : the frame *acquire/consume* path (decrement)
 *
 * On each enqueue it increments a per-CPU-agnostic "pending frame" counter
 * (saturated at MAX_PENDING) and emits an event carrying the boot-time and the
 * current pending count. On each acquire it decrements the counter. Userspace
 * (scene-daemon) reads the perf ring buffer and correlates "pending" with
 * scheduling decisions to detect frame-queue backlog / jank.
 *
 * The `track_config` map (1 element, key 0) is a userspace-controlled enable
 * flag: when 0, the enqueue path skips the counter update but STILL emits the
 * event (so the tracer can be observed without perturbing state).
 */
#include "bpf_common.h"

/*
 * PENDING_UNKNOWN — sentinel used when the pending counter is unavailable or
 * tracking is disabled. Recovered from the immediate `r1 = 0xffffffff`
 * (stored as u32 into event.pending at offset 4) => (u32)-1.
 */
#define PENDING_UNKNOWN 0xffffffffu  /* INFERRED name; value from immediate */

/*
 * MAX_PENDING — saturation cap for the pending-frame counter.
 * Recovered from `r2 = 0x4 ; if (r2 > v) skip ; v = 4` clamp in
 * uretprobe_libgui (the counter is capped to 4).
 */
#define MAX_PENDING 4                /* INFERRED name; value from immediate */

/*
 * Event emitted for every libgui enqueue.
 * .BTF pinned the exact layout & size (8 bytes):
 *   time    : u32 @ offset 0  (low 32 bits of bpf_ktime_get_boot_ns())
 *   pending : u32 @ offset 4  (current pending-frame count, or PENDING_UNKNOWN)
 */
struct event {
	u32 time;
	u32 pending;
};

/*
 * --- Maps (decoded verbatim from the 60-byte `maps` section) --------------
 *   events        : {PERF_EVENT_ARRAY, key=4, value=4, max_entries=1024, flags=0}
 *   pending_count : {ARRAY,            key=4, value=8, max_entries=1,    flags=0}
 *   track_config  : {ARRAY,            key=4, value=4, max_entries=1,    flags=0}
 * Order below matches .BTF DATASEC `maps` order and the symbol offsets
 * (events@0, pending_count@0x14, track_config@0x28).
 */
struct bpf_map_def SEC("maps") events = {
	.type        = BPF_MAP_TYPE_PERF_EVENT_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u32),
	.max_entries = 1024,
	.map_flags   = 0,
};

struct bpf_map_def SEC("maps") pending_count = {
	.type        = BPF_MAP_TYPE_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u64),
	.max_entries = 1,
	.map_flags   = 0,
};

struct bpf_map_def SEC("maps") track_config = {
	.type        = BPF_MAP_TYPE_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u32),
	.max_entries = 1,
	.map_flags   = 0,
};

/*
 * The original ELF had a `.bss` section holding an 8-byte symbol named
 * `unused` (BTF: VAR `unused` of type `const void *`). It is dead code /
 * a harmless placeholder that some toolchains emit. Reproduced for fidelity.
 */
const void *unused SEC(".bss") = 0;

/*
 * Original `.strtab` section string for the license variable is `__license`
 * (BTF VAR name), with the license section content "Dual MIT/GPL".
 */
char __license[] SEC("license") = "Dual MIT/GPL";

/**
 * uretprobe_libgui() - uretprobe attached to `uretprobe/libgui`.
 * @ctx: pt_regs of the probed return site (opaque).
 *
 * Increments the pending-frame counter (when tracking is enabled), saturating
 * at MAX_PENDING, and emits a `struct event` (boot time + pending count).
 * Return: always 0.
 */
SEC("uretprobe/libgui")
int uretprobe_libgui(struct pt_regs *ctx)
{
	struct event event = {};
	u32 key = 0;

	event.time = bpf_ktime_get_boot_ns();
	event.pending = PENDING_UNKNOWN;

	u32 *enabled = bpf_map_lookup_elem(&track_config, &key);
	if (enabled && *enabled) {
		u64 *pending = bpf_map_lookup_elem(&pending_count, &key);
		if (pending) {
			u64 v = *pending + 1;
			if (v > MAX_PENDING)   /* saturate */
				v = MAX_PENDING;
			*pending = v;
			event.pending = (u32)v;
		}
	}

	bpf_perf_event_output(ctx, &events, BPF_F_CURRENT_CPU,
			      &event, sizeof(event));
	return 0;
}

/**
 * uretprobe_libgui_acquire() - uretprobe attached to `uretprobe/libgui_acquire`.
 * @ctx: pt_regs of the probed return site (opaque).
 *
 * Decrements the pending-frame counter if it is currently > 0. Emits nothing.
 * Return: always 0.
 */
SEC("uretprobe/libgui_acquire")
int uretprobe_libgui_acquire(struct pt_regs *ctx)
{
	u32 key = 0;

	u64 *pending = bpf_map_lookup_elem(&pending_count, &key);
	if (pending && *pending > 0) {
		*pending = *pending - 1;
	}

	return 0;
}
