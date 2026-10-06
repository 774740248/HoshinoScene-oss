/*
 * bpf_common.h — Shared definitions for the "星野Scene" (com.omarea.vtools)
 * eBPF tracing / scheduling subsystem.
 *
 * ============================================================================
 * PROVENANCE / RECOVERY NOTES  (原始来源与还原方法)
 * ============================================================================
 * This header is a RECONSTRUCTION aid produced by statically analysing the
 * three UNSTRIPPED BPF ELF objects recovered from the last debug APK of
 * com.omarea.vtools ("星野Scene"). The original C sources were lost; only the
 * compiled `.o` files survived.
 *
 *   kprobe_sys_execve.o   -> src/kprobe_sys_execve.c
 *        orig path (BTF): /mnt/d/Android/vtools-private/daemon/kprobe_sys_execve.c
 *   tracepoint_thread.o   -> src/tracepoint_thread.c
 *        orig path (BTF): /home/helloklf/scene-daemon/tracepoint_thread.c
 *   bpf_arm64_bpfel.o     -> src/scheduler_fas_bpf.c
 *        orig path (BTF): /mnt/d/Android/vtools-private/daemon/scheduler_fas_bpf.c
 *
 * Evidence used (all preserved under ../analysis and ../disasm):
 *   - .BTF section : embedded original SOURCE STRINGS + full type info
 *                    (struct field names/offsets/sizes, VAR + DATASEC layouts).
 *   - `maps` section raw bytes : authoritative struct bpf_map_def field values.
 *   - `.rel<prog>` relocation tables : which maps each program references.
 *   - `llvm-objdump -d` : BPF ISA disassembly (helper call numbers, immediates).
 *   - `.symtab` : symbol names / sizes / types.
 *
 * Toolchain fingerprint: objects were built with
 *     clang -target bpf -O2 -g
 * They use the OLD-style `struct bpf_map_def` placed in a `maps` section
 * (NOT BTF-defined maps) — characteristic of an Android-era, self-contained
 * bpf_helpers.h (BCC/vtools-private lineage), consistent with the leaked
 * source path /mnt/d/Android/vtools-private/daemon/.
 *
 * We reproduce that EXACT style so the recovered objects relink the same way
 * and re-emit the same helper opcodes.
 *
 * CONFIDENCE: HIGH for structs/maps/helper ABI (taken verbatim from the ELF);
 * MEDIUM for macro *semantic* naming (each such item is marked [INFERRED]).
 */

#ifndef SCENE_BPF_COMMON_H
#define SCENE_BPF_COMMON_H

/* ------------------------------------------------------------------------ */
/* Integer primitives — the .BTF confirms exactly these typedef names.       */
/* ------------------------------------------------------------------------ */
typedef unsigned char      __u8;
typedef unsigned int       __u32;
typedef int                __s32;
typedef unsigned long long __u64;
typedef long long          __s64;

typedef __u32 u32;
typedef __u64 u64;
typedef __s32 s32;
typedef __s64 s64;

/*
 * Forward declaration of the kernel's `struct pt_regs`. kprobe / uretprobe
 * programs receive `struct pt_regs *ctx`; the recovered programs treat it as
 * opaque (no field access), matching BTF which shows only `FWD pt_regs`.
 */
struct pt_regs;

#define SEC(NAME) __attribute__((section(NAME), used))

/* ------------------------------------------------------------------------ */
/* Classic (old-style) map definition — 20 bytes, exactly as in `maps`.       */
/* Layout: [ type | key_size | value_size | max_entries | map_flags ] (u32).  */
/* ------------------------------------------------------------------------ */
struct bpf_map_def {
	unsigned int type;
	unsigned int key_size;
	unsigned int value_size;
	unsigned int max_entries;
	unsigned int map_flags;
};

/* ---- map type enum values observed in the three `maps` sections ---- */
#define BPF_MAP_TYPE_ARRAY            2
#define BPF_MAP_TYPE_PERF_EVENT_ARRAY 4

/* ---- bpf_map_update_elem flags (from the `r4 = 0x0` immediates) ---- */
#define BPF_ANY 0

/* ---- bpf_perf_event_output flags (from the `r3 = 0xffffffff` immediates) ---- */
#define BPF_F_CURRENT_CPU 0xffffffffULL

/*
 * SLOT_SYSTEM — bit 32 (2^32) of a `slots` u64 value; marks a "system/CPU"
 * slot that must carry the RUN_F_SYSTEM event flag.
 *
 * Recovered from `tracepoint_thread.o` disassembly:
 *   `rX = v; rX >>= 0x1f; rX &= 0x2` @ insn 97-98 / 256-257 / 411-412 / 565-566
 * clang lowers `(v & (1ULL<<k)) ? N : 0` to `(v >> k) & N`, so a shift of
 * 0x1f (31) proves the tested bit is 31+1 = 32 -> mask = 0x100000000ULL.
 * (An earlier recovery wrote 0x80000000u, i.e. bit 31 — that was WRONG; the
 *  u64 mask below is authoritative and reproduces `>>= 0x1f; &= 0x2`.)
 */
#define SLOT_SYSTEM 0x100000000ULL

/* ------------------------------------------------------------------------ */
/* Helper ABI.                                                                */
/*                                                                            */
/* The originals did NOT link full libbpf; they declared one function pointer */
/* per helper, initialised to the BPF_FUNC_* id. clang lowers each indirect   */
/* call to `call <imm>` — exactly reproducing the observed disassembly.       */
/*                                                                            */
/* Helper ids (verified against `call <imm>` in disasm):                      */
/*   0x01  map_lookup_elem        0x05  ktime_get_ns                         */
/*   0x02  map_update_elem        0x7d  ktime_get_boot_ns                    */
/*   0x08  get_smp_processor_id   0x0e  get_current_pid_tgid                 */
/*   0x0f  get_current_uid_gid    0x10  get_current_comm                     */
/*   0x19  perf_event_output                                                  */
/* ------------------------------------------------------------------------ */
#define BPF_FUNC_map_lookup_elem       1
#define BPF_FUNC_map_update_elem       2
#define BPF_FUNC_ktime_get_ns          5
#define BPF_FUNC_ktime_get_boot_ns     125
#define BPF_FUNC_get_smp_processor_id  8
#define BPF_FUNC_get_current_pid_tgid  14
#define BPF_FUNC_get_current_uid_gid   15
#define BPF_FUNC_get_current_comm      16
#define BPF_FUNC_perf_event_output     25

#define BPF_HELPER_DECL(ret, name, ...)                                  \
	static ret (*bpf_##name)(__VA_ARGS__) =                          \
		(void *)BPF_FUNC_##name

BPF_HELPER_DECL(void *, map_lookup_elem, void *map, const void *key);
BPF_HELPER_DECL(long, map_update_elem,
		void *map, const void *key, const void *value, __u64 flags);
BPF_HELPER_DECL(__u64, ktime_get_ns, void);
BPF_HELPER_DECL(__u64, ktime_get_boot_ns, void);
BPF_HELPER_DECL(__u32, get_smp_processor_id, void);
BPF_HELPER_DECL(__u64, get_current_pid_tgid, void);
BPF_HELPER_DECL(__u64, get_current_uid_gid, void);
BPF_HELPER_DECL(long, get_current_comm, void *buf, __u32 size);
BPF_HELPER_DECL(long, perf_event_output,
		void *ctx, void *map, __u64 flags, void *data, __u64 size);

/*
 * kprobe_sys_execve.o uses `bpf_get_current_comm(&event.comm, sizeof(...))`
 * where comm is a `char[16]`. BTF pinned the arg order (buf, size). The
 * generic prototype above is sufficient; no extra wrapper needed.
 */

#endif /* SCENE_BPF_COMMON_H */
