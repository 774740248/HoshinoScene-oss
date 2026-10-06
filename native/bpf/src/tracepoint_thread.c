/*
 * tracepoint_thread.c — "星野Scene" (com.omarea.vtools) per-thread scheduler
 *                        runtime tracker (sched_switch tracepoint).
 *
 * ============================================================================
 * PROVENANCE / RECOVERY NOTES  (原始来源与还原方法)
 * ============================================================================
 * Original source path (from .BTF debug info):
 *     /home/helloklf/scene-daemon/tracepoint_thread.c
 *
 * Recovered from the unstripped BPF ELF object `tracepoint_thread.o`
 * (29640 bytes) — the largest of the three. It retains a LARGE part of the
 * original source verbatim as BTF-embedded strings (with real code fragments),
 * a 71-entry symbol table, 5 maps and 5 DATASEC entries.
 *
 * RECOVERY METHOD:
 *   1. `strings -a` (.BTF) yielded ~50 source lines incl. the whole
 *      sched_switch() skeleton, the track_thread() calls, the stats/alert
 *      logic and the mid-run (timeout) branch. See
 *      analysis/tracepoint_thread.strings.txt lines 16-79.
 *   2. `.BTF` type info pinned:
 *        struct sched_switch_args { ... prev_comm[16]; u32 prev_pid;
 *          u32 prev_prio; u32 prev_state; char next_comm[16];
 *          u32 next_pid; u32 next_prio; }  (size 64; offsets in header below)
 *        struct bpf_map_def (20 B) + the 5 map VARs.
 *       NOTE: run_stats / run_event are NOT in .BTF (they were only used
 *       through pointers, so clang did not emit their type records). Their
 *       layout was recovered from the frame writes and the map value_size.
 *   3. `.reltracepoint/sched/sched_switch` relocations named the 5 maps.
 *   4. `maps` section = 5x20 bytes, decoded field-by-field (below).
 *   5. `llvm-objdump -d`: 7744-byte function, 154 basic blocks, helper ids
 *      0x01/0x02/0x05/0x08/0x19 and all immediates used to fix constants.
 *
 * CONFIDENCE: ~90% for control flow and semantics (fully traceable);
 *             ~75% for exact C *macro* phrasing of track_thread() (the macro
 *             body is known; whether the original used a macro, an inline
 *             function, or 4 manual unrollings cannot be distinguished from
 *             the object — it is inlined 4x regardless). [INFERRED]
 *
 * LICENSE: `license` section bytes = "GPL\0". The .strtab also carries a
 * symbol literally named "JNKLMOP" (the author's non-standard license token)
 * which we preserve below for evidence fidelity.
 * ============================================================================
 *
 * FUNCTIONAL SUMMARY
 * ------------------
 * Attached to the raw tracepoint `tracepoint/sched/sched_switch`. On every
 * context switch it tracks up to FOUR interesting threads ("slots"), whose
 * TIDs are stored by userspace in the `slots` array (values, not keys):
 *
 *   slots[0..3] = TID of watched thread (bit 32 = SLOT_SYSTEM marker)
 *
 * For each watched thread it measures how long the thread RUNS between two
 * consecutive switches (run_ns = now - run_start), accumulates per-slot
 * statistics (count / total / max / EWMA average) and pushes events to
 * userspace when:
 *   (a) a single run exceeds the userspace-configured `timeout_ns`
 *       (config[0]) -- a timeout alert; or
 *   (b) a run is statistically abnormal (count > 32 && run*10 > avg*25)
 *       -- a jank/spike alert;
 *   (c) the thread keeps running past timeout boundaries, once per doubling
 *       multiplier    -- a mid-run (still-running) alert, flag RUN_F_MID_RUN.
 *
 * Events carry a `flags` word: RUN_F_SYSTEM (watched slot is a system/global
 * slot) and/or RUN_F_MID_RUN (alert fired while the thread had not yet been
 * switched out).
 */
#include "bpf_common.h"

/* ------------------------------------------------------------------------ */
/* Constants (all recovered from instruction immediates)                     */
/* ------------------------------------------------------------------------ */

/*
 * SLOT_SYSTEM is defined in bpf_common.h (bit 32 = 0x100000000ULL). See there
 * for the disassembly evidence and the corrected-value note. It is referenced
 * (not redefined) here so the two files can never drift apart again.
 */

/* Event flag bits (the `flags` field of struct run_event). */
#define RUN_F_MID_RUN 0x1u        /* INFERRED name; set via `r6 |= 0x1` */
#define RUN_F_SYSTEM  0x2u        /* INFERRED name; value from `&= 2`   */

/*
 * MIN_SAMPLE_NS — minimum run length (ns) before a sample is accounted.
 * Evidence: `r1 = 0xf4240 ; if (r1 > run) skip`  => 1,000,000 ns = 1 ms.
 */
#define MIN_SAMPLE_NS 1000000ULL  /* INFERRED name; value from immediate */

/*
 * Statistical alert thresholds.
 *   - sample count gate: `r1 = count; r2 = 0x21; if (r2 > count) skip`
 *     => count must be > 32 (0x21 == 33).
 *   - ratio gate:        `run*10 > avg*25`.
 */
#define ALERT_MIN_COUNT   32      /* INFERRED name; count > 32 */
#define ALERT_RUN_FACTOR  10      /* INFERRED name; run   * 10 */
#define ALERT_AVG_FACTOR  25      /* INFERRED name; avg   * 25 */

/*
 * EWMA average update: avg = avg ? ((avg * 7 + run) >> 3) : run.
 * (evidence: `r1 *= 7; r1 += run; r1 >>= 3`)
 */
#define AVG_WEIGHT  7             /* INFERRED name */
#define AVG_SHIFT   3             /* INFERRED name */

/* `slots` / `stats` / `run_start` geometry (from the maps section). */
#define SLOT_COUNT      4
#define SLOT_RUN_KEYS   3         /* k_start, k_alert, k_cpu per slot */
#define CONFIG_TIMEOUT_KEY 0      /* config[0] = timeout_ns */

/* ------------------------------------------------------------------------ */
/* Structures                                                                */
/* ------------------------------------------------------------------------ */

/*
 * sched_switch_args — raw tracepoint context for
 * `tracepoint/sched/sched_switch`. Bit offsets are EXACTLY as in .BTF:
 *   pad @ 0 (8B), prev_comm[16] @ 8, prev_pid @ 24, prev_prio @ 28,
 *   prev_state @ 32, next_comm[16] @ 40, next_pid @ 56, next_prio @ 60.
 * Total size = 64 (with 8-byte alignment after pad + prev_state).
 * Only prev_pid (0x18) and next_pid (0x38) are read by the program.
 */
struct sched_switch_args {
	__u64 pad;              /* 0x00  (common tracepoint header) */
	char  prev_comm[16];    /* 0x08 */
	u32   prev_pid;         /* 0x18 */
	u32   prev_prio;        /* 0x1c */
	__u64 prev_state;       /* 0x20 (u32 in kernel; padded here) */
	char  next_comm[16];    /* 0x28 */
	u32   next_pid;         /* 0x38 */
	u32   next_prio;        /* 0x3c */
};

/*
 * run_stats — per-slot running statistics (stats map value, size 0x20).
 * Layout recovered from the accumulation code:
 *   +0x00 count    (incremented once per accepted sample)
 *   +0x08 total_ns (sum of run durations)
 *   +0x10 max_ns   (max single run)
 *   +0x18 avg_ns   (EWMA of run durations)
 */
struct run_stats {
	u64 count;      /* 0x00 */
	u64 total_ns;   /* 0x08 */
	u64 max_ns;     /* 0x10 */
	u64 avg_ns;     /* 0x18 */
};

/*
 * run_event — alert record pushed to userspace (perf `events`, size 0x28=40).
 * Layout recovered from the frame writes:
 *   +0x00 tid     (u32)
 *   +0x04 cpu     (u32)
 *   +0x08 run_ns  (u64)
 *   +0x10 ts      (u64, = now)
 *   +0x18 flags   (u64, RUN_F_* | base_flags)
 *   +0x20 avg_ns  (u64)
 */
struct run_event {
	u32 tid;        /* 0x00 */
	u32 cpu;        /* 0x04 */
	u64 run_ns;     /* 0x08 */
	u64 ts;         /* 0x10 */
	u64 flags;      /* 0x18 */
	u64 avg_ns;     /* 0x20 */
};

/* ------------------------------------------------------------------------ */
/* Maps — decoded verbatim from the 100-byte `maps` section                  */
/*   config    @0x00 : {ARRAY,            key=4, value=8,  max=1,    flags=0} */
/*   slots     @0x14 : {ARRAY,            key=4, value=8,  max=4,    flags=0} */
/*   run_start @0x28 : {ARRAY,            key=4, value=8,  max=12,   flags=0} */
/*   stats     @0x3c : {ARRAY,            key=4, value=32, max=4,    flags=0} */
/*   events    @0x50 : {PERF_EVENT_ARRAY, key=4, value=4,  max=1024, flags=0} */
/* ------------------------------------------------------------------------ */
struct bpf_map_def SEC("maps") config = {
	.type        = BPF_MAP_TYPE_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u64),
	.max_entries = 1,
	.map_flags   = 0,
};

struct bpf_map_def SEC("maps") slots = {
	.type        = BPF_MAP_TYPE_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u64),
	.max_entries = SLOT_COUNT,
	.map_flags   = 0,
};

struct bpf_map_def SEC("maps") run_start = {
	.type        = BPF_MAP_TYPE_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u64),
	.max_entries = SLOT_COUNT * SLOT_RUN_KEYS,
	.map_flags   = 0,
};

struct bpf_map_def SEC("maps") stats = {
	.type        = BPF_MAP_TYPE_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(struct run_stats),
	.max_entries = SLOT_COUNT,
	.map_flags   = 0,
};

struct bpf_map_def SEC("maps") events = {
	.type        = BPF_MAP_TYPE_PERF_EVENT_ARRAY,
	.key_size    = sizeof(u32),
	.value_size  = sizeof(u32),
	.max_entries = 1024,
	.map_flags   = 0,
};

char LICENSE[] SEC("license") = "GPL";  /* original bytes: 47 50 4c 00 */

/*
 * ------------------------------------------------------------------------
 * track_thread() — the per-slot tracing core.
 *
 * The object inlines this exactly 4 times (once per slot), so whether the
 * original was a `static inline` function or a macro CANNOT be determined
 * from the binary. The BTF string table shows call-site text of the form
 *
 *     track_thread(ctx, (u32)v0, 0, (v0 & SLOT_SYSTEM) ? RUN_F_SYSTEM : 0, now);
 *
 * which is reproduced below. We implement it as a macro so the recovered
 * source compiles to the same inlined shape.       [INFERRED: macro form]
 *
 * @ctx   : sched_switch tracepoint context
 * @tid   : the watched TID (0 => slot unused, skip entirely)
 * @slot  : slot index 0..3 (keys the run_start/stats maps)
 * @flags : base_flags, RUN_F_SYSTEM if the slot is a system slot, else 0
 * @now   : bpf_ktime_get_ns() sampled at entry
 * ------------------------------------------------------------------------
 */
#define track_thread(_ctx, _tid, _slot, _flags, _now)                         \
	do {                                                                  \
		u32 __slot = (_slot);                                         \
		u32 __tid  = (u32)(_tid);                                     \
		u64 __now  = (_now);                                          \
		u64 __base = (u64)(_flags);                                   \
		if (!__tid)                                                   \
			break;                                                \
		/* keys for this slot's 3 run_start entries */                \
		u32 __k_start = __slot * SLOT_RUN_KEYS;                       \
		u32 __k_alert = __k_start + 1;                                \
		u32 __k_cpu   = __k_start + 2;                                \
		u32 __timeout_key = CONFIG_TIMEOUT_KEY;                       \
		/* -------- switch-in: this thread started running -------- */ \
		if ((_ctx)->next_pid == __tid) {                              \
			u64 __cpu = bpf_get_smp_processor_id();               \
			u64 __zero = 0;                                       \
			bpf_map_update_elem(&run_start, &__k_start,           \
					    &__now, BPF_ANY);                 \
			bpf_map_update_elem(&run_start, &__k_alert,           \
					    &__zero, BPF_ANY);                \
			bpf_map_update_elem(&run_start, &__k_cpu,             \
					    &__cpu, BPF_ANY);                 \
		/* -------- switch-out: this thread stopped running ------ */ \
		} else if ((_ctx)->prev_pid == __tid) {                       \
			u64 *__startp =                                       \
			    bpf_map_lookup_elem(&run_start, &__k_start);      \
			u64 __s = __startp ? *__startp : 0;                   \
			if (__s && __now > __s) {                             \
				u64 __run = __now - __s;                      \
				struct run_stats *__st =                      \
				    bpf_map_lookup_elem(&stats, &__slot);     \
				if (__st && __run >= MIN_SAMPLE_NS) {         \
					__st->count++;                        \
					__st->total_ns += __run;              \
					if (__run > __st->max_ns)             \
						__st->max_ns = __run;         \
					__st->avg_ns = __st->avg_ns           \
					    ? ((__st->avg_ns * AVG_WEIGHT + __run) \
					       >> AVG_SHIFT)                  \
					    : __run;                          \
					u64 *__timeout =                      \
					    bpf_map_lookup_elem(&config,      \
								&__timeout_key);  \
					u64 __timeout_ns =                    \
					    __timeout ? *__timeout : 0;       \
					if ((__timeout_ns && __run > __timeout_ns) || \
					    (__st->count > ALERT_MIN_COUNT && \
					     __run * ALERT_RUN_FACTOR >        \
					     __st->avg_ns * ALERT_AVG_FACTOR)) { \
						struct run_event __ev = {};    \
						__ev.tid    = __tid;           \
						__ev.cpu    = bpf_get_smp_processor_id(); \
						__ev.flags  = __base;          \
						__ev.run_ns = __run;           \
						__ev.ts     = __now;           \
						__ev.avg_ns = __st->avg_ns;    \
						bpf_perf_event_output(_ctx,    \
						    &events, BPF_F_CURRENT_CPU, \
						    &__ev, sizeof(__ev));      \
					}                                     \
				}                                             \
				/* always clear start + alert after a run */   \
				u64 __reset = 0;                             \
				bpf_map_update_elem(&run_start, &__k_start,  \
						    &__reset, BPF_ANY);        \
				bpf_map_update_elem(&run_start, &__k_alert,  \
						    &__reset, BPF_ANY);        \
			} else {                                              \
				/* ---- mid-run (still-running) alert ---- */  \
				u64 *__timeout =                              \
				    bpf_map_lookup_elem(&config, &__timeout_key); \
				u64 __timeout_ns =                            \
				    __timeout ? *__timeout : 0;               \
				if (__timeout_ns) {                           \
					u64 __run = __now - __s;              \
					u64 __mult = __run / __timeout_ns;    \
					u64 *__alerted =                      \
					    bpf_map_lookup_elem(&run_start,    \
								&__k_alert);      \
					u64 __last = __alerted ? *__alerted : 0; \
					u64 __next = __last ? (__last << 1) : 1; \
					if (__mult >= __next) {               \
						u64 *__cpup =                 \
						    bpf_map_lookup_elem(&run_start, \
									&__k_cpu);    \
						struct run_stats *__st =      \
						    bpf_map_lookup_elem(&stats, &__slot); \
						struct run_event __ev = {};    \
						__ev.tid    = __tid;           \
						__ev.cpu    = __cpup ? (u32)*__cpup : 0; \
						__ev.flags  = RUN_F_MID_RUN | __base; \
						__ev.run_ns = __run;           \
						__ev.ts     = __now;           \
						__ev.avg_ns = __st ? __st->avg_ns : 0; \
						bpf_perf_event_output(_ctx,    \
						    &events, BPF_F_CURRENT_CPU, \
						    &__ev, sizeof(__ev));      \
						bpf_map_update_elem(&run_start, \
						    &__k_alert, &__mult, BPF_ANY); \
					}                                     \
				}                                             \
			}                                                     \
		}                                                             \
	} while (0)

/**
 * sched_switch() - raw tracepoint handler for `tracepoint/sched/sched_switch`.
 * @ctx: struct sched_switch_args * (tracepoint context).
 *
 * Snapshots the 4 watched TIDs, then tracks each of them. Return: always 0.
 */
SEC("tracepoint/sched/sched_switch")
int sched_switch(struct sched_switch_args *ctx)
{
	u64 now = bpf_ktime_get_ns();

	u32 k0 = 0, k1 = 1, k2 = 2, k3 = 3;

	u64 *e0 = bpf_map_lookup_elem(&slots, &k0);
	u64 *e1 = bpf_map_lookup_elem(&slots, &k1);
	u64 *e2 = bpf_map_lookup_elem(&slots, &k2);
	u64 *e3 = bpf_map_lookup_elem(&slots, &k3);

	u64 v0 = e0 ? *e0 : 0, v1 = e1 ? *e1 : 0;
	u64 v2 = e2 ? *e2 : 0, v3 = e3 ? *e3 : 0;

	track_thread(ctx, (u32)v0, 0,
		     (v0 & SLOT_SYSTEM) ? RUN_F_SYSTEM : 0, now);
	track_thread(ctx, (u32)v1, 1,
		     (v1 & SLOT_SYSTEM) ? RUN_F_SYSTEM : 0, now);
	track_thread(ctx, (u32)v2, 2,
		     (v2 & SLOT_SYSTEM) ? RUN_F_SYSTEM : 0, now);
	track_thread(ctx, (u32)v3, 3,
		     (v3 & SLOT_SYSTEM) ? RUN_F_SYSTEM : 0, now);

	return 0;
}
