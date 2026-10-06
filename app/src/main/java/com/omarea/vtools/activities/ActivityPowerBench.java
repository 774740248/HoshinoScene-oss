package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityPowerBench extends a.p5 {
    public static final /* synthetic */ a.gu0[] U;
    public final a.yq1 A;
    public final a.yq1 B;
    public final a.yq1 C;
    public final a.yq1 D;
    public final a.vj1 E;
    public final a.ls F;
    public final java.lang.String G;
    public final java.util.ArrayList H;
    public a.h61 I;
    public final int J;
    public a.nt0 K;
    public final a.vj1 L;
    public final a.vj1 M;
    public final a.vj1 N;
    public final a.vj1 O;
    public final a.vj1 P;
    public final a.vj1 Q;
    public java.util.List R;
    public boolean[] S;
    public final a.vj1 T;
    public final a.yq1 d = a.b20.i(this, 2131363020);
    public final a.yq1 e = a.b20.i(this, 2131362316);
    public final a.yq1 f = a.b20.i(this, 2131362317);
    public final a.yq1 g = a.b20.i(this, 2131362300);
    public final a.yq1 h;
    public final a.yq1 i;
    public final a.yq1 j;
    public final a.yq1 k;
    public final a.yq1 l;
    public final a.yq1 m;
    public final a.yq1 n;
    public final a.yq1 o;
    public final a.yq1 p;
    public final a.yq1 q;
    public final a.yq1 r;
    public final a.yq1 s;
    public final a.yq1 t;
    public final a.yq1 u;
    public final a.yq1 v;
    public final a.yq1 w;
    public final a.yq1 x;
    public final a.yq1 y;
    public final a.yq1 z;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "rootView", "getRootView()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        U = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_title", "getCpu_title()Lcom/omarea/ui/BlurView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_title_text", "getCpu_title_text()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_options", "getCpu_options()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_test_options", "getCpu_test_options()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_load_type", "getCpu_load_type()Lcom/omarea/common/ui/Tags;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_threads", "getCpu_bench_threads()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_duration", "getCpu_bench_duration()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_period", "getCpu_bench_period()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_ram_access_opt", "getCpu_ram_access_opt()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_ram_access", "getCpu_ram_access()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_load", "getCpu_bench_load()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_test_options2", "getCpu_test_options2()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_cpuset", "getCpu_cpuset()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_min_freq", "getCpu_min_freq()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_max_freq", "getCpu_max_freq()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "ddr_min_freq", "getDdr_min_freq()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_temp_limit", "getCpu_temp_limit()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_perf_stat", "getCpu_perf_stat()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_stop", "getCpu_stop()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_start", "getCpu_start()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_chart_view", "getCpu_bench_chart_view()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_legend", "getCpu_bench_legend()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "chart_left_title", "getChart_left_title()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "chart_toggle_cycles", "getChart_toggle_cycles()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_export", "getCpu_bench_export()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_history", "getCpu_bench_history()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_chart", "getCpu_bench_chart()Lcom/omarea/ui/bench/CyclesPowerView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_cluster_legend", "getCpu_cluster_legend()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerBench.class, "cpu_bench_result", "getCpu_bench_result()Landroid/widget/TextView;")};
    }

    public ActivityPowerBench() {
        a.b20.i(this, 2131362314);
        this.h = a.b20.i(this, 2131362297);
        this.i = a.b20.i(this, 2131362280);
        this.j = a.b20.i(this, 2131362273);
        this.k = a.b20.i(this, 2131362278);
        this.l = a.b20.i(this, 2131362303);
        this.m = a.b20.i(this, 2131362302);
        this.n = a.b20.i(this, 2131362277);
        a.b20.i(this, 2131362315);
        this.o = a.b20.i(this, 2131362293);
        this.p = a.b20.i(this, 2131362299);
        this.q = a.b20.i(this, 2131362298);
        this.r = a.b20.i(this, 2131362346);
        this.s = a.b20.i(this, 2131362310);
        this.t = a.b20.i(this, 2131362301);
        a.b20.i(this, 2131362308);
        this.u = a.b20.i(this, 2131362306);
        this.v = a.b20.i(this, 2131362272);
        this.w = a.b20.i(this, 2131362276);
        this.x = a.b20.i(this, 2131362185);
        this.y = a.b20.i(this, 2131362209);
        this.z = a.b20.i(this, 2131362274);
        this.A = a.b20.i(this, 2131362275);
        this.B = a.b20.i(this, 2131362271);
        this.C = a.b20.i(this, 2131362281);
        this.D = a.b20.i(this, 2131362279);
        this.E = new a.vj1(a.b4.i);
        this.F = new a.ls();
        int i = 0;
        this.G = a.ls.m(0);
        this.H = new java.util.ArrayList();
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String n = new a.qc(this, a.fs1.t()).n();
        int parseInt = (n == null || n.length() == 0) ? 0 : java.lang.Integer.parseInt(n);
        this.J = parseInt;
        this.L = new a.vj1(new a.zc(this, 4));
        this.M = new a.vj1(new a.zc(this, 3));
        this.N = new a.vj1(a.b4.h);
        this.O = new a.vj1(new a.zc(this, 2));
        this.P = new a.vj1(new a.zc(this, 1));
        this.Q = new a.vj1(new a.zc(this, i));
        this.R = new java.util.ArrayList();
        boolean[] zArr = new boolean[parseInt];
        while (i < parseInt) {
            zArr[i] = true;
            i++;
        }
        this.S = zArr;
        this.T = new a.vj1(new a.zc(this, 10));
    }

    public static final void o(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.h61 h61Var, java.util.ArrayList arrayList) {
        activityPowerBench.y().setVisibility(8);
        activityPowerBench.x().setVisibility(8);
        a.gu0[] gu0VarArr = U;
        ((com.omarea.ui.BlurViewRelativeLayout) activityPowerBench.v.a(gu0VarArr[21])).setVisibility(0);
        ((android.widget.TextView) activityPowerBench.w.a(gu0VarArr[22])).setText(activityPowerBench.C(h61Var));
        android.widget.TextView t = activityPowerBench.t();
        t.setText((java.lang.CharSequence) null);
        a.b20.c(t, activityPowerBench.getString(2131953138) + "#I     " + h61Var.g + "mW\n");
        a.b20.c(t, activityPowerBench.B());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.g61 g61Var = (a.g61) it.next();
            boolean[] zArr = h61Var.f;
            if (zArr == null) {
                a.wv.M1("cpus");
                throw null;
            }
            a.b20.c(t, activityPowerBench.E(zArr, g61Var));
        }
        activityPowerBench.t().setVisibility(0);
        activityPowerBench.I = h61Var;
        java.util.ArrayList arrayList2 = activityPowerBench.H;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        a.cp cpVar = com.omarea.Scene.c;
        com.omarea.Scene.d.postDelayed(new a.xa(activityPowerBench, 6, arrayList), 50L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0554, code lost:
    
        if (a.yi1.B2(a.q10.L("path-basic-info", "/sys/module/migt/parameters", 10000L), "dir") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0a7d, code lost:
    
        if (a.wv.S1(r1, r2, r5) == r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0aac, code lost:
    
        if (a.wv.S1(r1, r2, r5) == r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0b90, code lost:
    
        if (a.wv.S1(r1, r2, r5) == r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0980, code lost:
    
        if (a.wv.S1(r1, r2, r5) == r7) goto L129;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0043. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x07f1 A[Catch: all -> 0x0bc7, TRY_LEAVE, TryCatch #2 {all -> 0x0bc7, blocks: (B:102:0x07eb, B:104:0x07f1), top: B:101:0x07eb }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x062c A[LOOP:3: B:129:0x0626->B:131:0x062c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x08be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x076e A[Catch: Exception -> 0x077d, TryCatch #1 {Exception -> 0x077d, blocks: (B:86:0x0735, B:88:0x076e, B:92:0x0777, B:96:0x0782), top: B:85:0x0735 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Type inference failed for: r0v16, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r0v40, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r0v41, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r0v60, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r12v14, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r13v49, types: [int] */
    /* JADX WARN: Type inference failed for: r13v55, types: [int] */
    /* JADX WARN: Type inference failed for: r15v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v32, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v36, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r8v59, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r9v16, types: [a.qo0] */
    /* JADX WARN: Type inference failed for: r9v24, types: [a.qo0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0a1a -> B:17:0x0a29). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(final com.omarea.vtools.activities.ActivityPowerBench r53, boolean[] r54, a.ey r55) {
        /*
            Method dump skipped, instructions count: 3050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityPowerBench.p(com.omarea.vtools.activities.ActivityPowerBench, boolean[], a.ey):java.lang.Object");
    }

    public static java.lang.String q(java.lang.String str, int i) {
        int max = java.lang.Math.max(0, i - str.length());
        if (max < 0) {
            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + max + '.').toString());
        }
        java.lang.String str2 = "";
        if (max != 0) {
            if (max != 1) {
                int length = " ".length();
                if (length != 0) {
                    if (length != 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(" ".length() * max);
                        a.rs0 it = new a.qs0(1, max, 1).iterator();
                        while (it.e) {
                            it.b();
                            sb.append((java.lang.CharSequence) " ");
                        }
                        str2 = sb.toString();
                        a.wv.v(str2, "{\n                    va…tring()\n                }");
                    } else {
                        char charAt = " ".charAt(0);
                        char[] cArr = new char[max];
                        for (int i2 = 0; i2 < max; i2++) {
                            cArr[i2] = charAt;
                        }
                        str2 = new java.lang.String(cArr);
                    }
                }
            } else {
                str2 = " ".toString();
            }
        }
        return a.ii1.e(str, str2);
    }

    public static java.lang.String r(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, int i) {
        activityPowerBench.getClass();
        return q(java.lang.String.valueOf(i), 11);
    }

    public static java.lang.String z(boolean[] zArr) {
        java.lang.Iterable iterable;
        a.wv.w(zArr, "<this>");
        a.qs0 qs0Var = new a.qs0(0, zArr.length - 1, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a.rs0 it = qs0Var.iterator();
        while (it.e) {
            java.lang.Object next = it.next();
            if (zArr[((java.lang.Number) next).intValue()]) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        int size = arrayList.size() - 1;
        if (size <= 0) {
            iterable = a.qb0.c;
        } else if (size == 1) {
            iterable = a.b20.y0(a.qv.k2(arrayList));
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
            int size2 = arrayList.size();
            for (int i = 1; i < size2; i++) {
                arrayList2.add(arrayList.get(i));
            }
            iterable = arrayList2;
        }
        java.util.ArrayList F0 = a.b20.F0(new a.y31(a.qv.e2(arrayList), a.qv.e2(arrayList)));
        java.util.Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            int intValue = ((java.lang.Number) it2.next()).intValue();
            if (((java.lang.Number) ((a.y31) a.qv.l2(F0)).d).intValue() + 1 == intValue) {
                F0.set(a.b20.d0(F0), new a.y31(((a.y31) a.qv.l2(F0)).c, java.lang.Integer.valueOf(intValue)));
            } else {
                F0.add(new a.y31(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue)));
            }
        }
        return a.qv.j2(F0, ",", null, null, a.o4.m, 30);
    }

    public final java.util.List A() {
        return (java.util.List) this.N.a();
    }

    public final java.lang.String B() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.F.getClass();
        java.util.ArrayList d = a.ls.d();
        a.wv.v(d, "cpuUtil.clusterInfo");
        java.util.Iterator it = a.qv.z2(d).iterator();
        while (it.hasNext()) {
            sb.append(q("cluster" + ((a.cs0) it.next()).f80a, 11));
        }
        sb.append(q("Power(mW)", 11));
        sb.append(q("-#I(mW)", 11));
        sb.append(q("Score", 11));
        sb.append(q("CPU(°C)", 11));
        sb.append(q("Score/mW", 11));
        sb.append(q("Cycles/mW", 11));
        sb.append("\n");
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "headers.toString()");
        return sb2;
    }

    public final java.lang.String C(a.h61 h61Var) {
        java.lang.String str = h61Var.e;
        boolean[] zArr = h61Var.f;
        if (zArr == null) {
            a.wv.M1("cpus");
            throw null;
        }
        java.lang.String z = z(zArr);
        int i = h61Var.c;
        int i2 = h61Var.d;
        java.lang.String e = (a.wv.e(str, "int") || a.wv.e(str, "float")) ? a.ii1.e(getString(2131953152), " 10    ") : "";
        java.lang.String str2 = (java.lang.String) ((java.util.Map) this.P.a()).get(str);
        return ((java.lang.String) this.E.a()) + "     " + str2 + "     " + h61Var.b + getString(2131953168) + "    " + e + "CPU " + z + "    " + getString(2131953163) + " " + i + "    " + getString(2131953131) + " " + i2;
    }

    public final android.widget.LinearLayout D() {
        return (android.widget.LinearLayout) this.d.a(U[0]);
    }

    public final java.lang.String E(boolean[] zArr, a.g61 g61Var) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.F.getClass();
        java.util.ArrayList d = a.ls.d();
        int i = 0;
        if (g61Var.h.length() > 0) {
            int size = d.size() + 6;
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(q("--------", 11));
            }
        }
        sb.append("\n");
        java.util.Iterator it = d.iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it.next();
            java.util.ArrayList b = g61Var.b();
            java.lang.String str = strArr[0];
            a.wv.v(str, "cluster[0]");
            java.lang.Object obj = b.get(java.lang.Integer.parseInt(str));
            a.wv.v(obj, "stat.frequencies[cluster[0].toInt()]");
            sb.append(r(this, ((java.lang.Number) obj).intValue()));
        }
        sb.append(r(this, g61Var.c));
        sb.append(r(this, g61Var.d));
        sb.append(r(this, g61Var.f));
        sb.append(r(this, g61Var.e));
        java.util.Iterator it2 = a.qv.z2(g61Var.a()).iterator();
        while (it2.hasNext()) {
            a.cs0 cs0Var = (a.cs0) it2.next();
            if (zArr[cs0Var.f80a]) {
                i += ((java.lang.Number) cs0Var.b).intValue();
            }
        }
        int i3 = g61Var.d;
        if (i3 > 0) {
            double d2 = i3;
            java.lang.String format = java.lang.String.format(" %.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(g61Var.f / d2)}, 1));
            a.wv.v(format, "format(format, *args)");
            sb.append(q(format, 11));
            java.lang.String format2 = java.lang.String.format(" %.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(i / d2)}, 1));
            a.wv.v(format2, "format(format, *args)");
            sb.append(q(format2, 11));
        }
        if (g61Var.h.length() > 0) {
            sb.append("\n");
            sb.append(g61Var.h);
        }
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "text.toString()");
        return sb2;
    }

    public final a.i61 F() {
        return (a.i61) this.T.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0268 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x030c -> B:13:0x0317). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(int r33, a.ey r34) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityPowerBench.G(int, a.ey):java.lang.Object");
    }

    public final void H() {
        java.lang.Object obj;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.F.getClass();
        java.util.ArrayList d = a.ls.d();
        a.wv.v(d, "cpuUtil.clusterInfo");
        java.util.Iterator it = a.qv.z2(d).iterator();
        while (true) {
            if (!it.hasNext()) {
                this.R = a.qv.s2(a.qv.w2(hashSet), new a.py(23));
                com.omarea.common.ui.SeekBar w = w();
                w.setFormatter(new a.cd(this, 6));
                w.setMax(this.R.size() - 1);
                w.setMin(0);
                w.setProgress(0);
                com.omarea.common.ui.SeekBar v = v();
                v.setFormatter(new a.cd(this, 7));
                v.setMax(this.R.size() - 1);
                v.setMin(0);
                v.setProgress(v.getMax());
                return;
            }
            a.cs0 cs0Var = (a.cs0) it.next();
            java.lang.Object obj2 = cs0Var.b;
            a.wv.v(obj2, "cluster.value");
            java.lang.Object[] objArr = (java.lang.Object[]) obj2;
            java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
            for (java.lang.Object obj3 : objArr) {
                java.lang.String str = (java.lang.String) obj3;
                a.wv.v(str, "it");
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (this.S[((java.lang.Number) obj).intValue()]) {
                    break;
                }
            }
            if (obj != null) {
                java.lang.String[] c = a.ls.c(cs0Var.f80a);
                a.wv.v(c, "cpuUtil.getAvailableFrequencies(cluster.index)");
                for (java.lang.String str2 : c) {
                    a.wv.v(str2, "freq");
                    hashSet.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                }
            }
        }
    }

    public final void I() {
        a.nt0 nt0Var = this.K;
        if (nt0Var != null) {
            a.wv.p(nt0Var);
        }
        this.K = null;
        int i = 0;
        x().setVisibility(0);
        y().setVisibility(0);
        a.q10 q10Var = a.q10.f457a;
        a.o4 o4Var = a.o4.n;
        a.lt0 lt0Var = new a.lt0();
        o4Var.i(lt0Var);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "json {\n            \"dura…to 1\n        }.toString()");
        a.q10.L("cpu-bench", lt0Var2, null);
        a.ls lsVar = this.F;
        lsVar.getClass();
        java.util.ArrayList d = a.ls.d();
        a.wv.v(d, "cpuUtil.clusterInfo");
        java.util.Iterator it = a.qv.z2(d).iterator();
        while (it.hasNext()) {
            a.cs0 cs0Var = (a.cs0) it.next();
            a.ls.u(this.G, cs0Var.f80a);
            java.lang.Object obj = cs0Var.b;
            a.wv.v(obj, "cluster.value");
            java.lang.Object N1 = a.op.N1((java.lang.Object[]) obj);
            a.wv.v(N1, "cluster.value.first()");
            lsVar.v(java.lang.String.valueOf(a.ls.h(java.lang.Integer.parseInt((java.lang.String) N1))), cs0Var.f80a);
        }
        D().post(new a.wc(this, i));
    }

    /* JADX WARN: Type inference failed for: r3v38, types: [a.ng1, java.lang.Object] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558465);
        H();
        a.gu0[] gu0VarArr = U;
        final int i = 2;
        android.widget.TextView textView = (android.widget.TextView) this.f.a(gu0VarArr[2]);
        java.lang.String string = getString(2131953143);
        a.wv.v(string, "getString(R.string.pb_more)");
        a.b20.a(textView, string, new a.zc(this, 8));
        int i2 = 5;
        com.omarea.common.ui.Tags tags = (com.omarea.common.ui.Tags) this.h.a(gu0VarArr[5]);
        java.util.Collection values = ((java.util.LinkedHashMap) this.O.a()).values();
        a.wv.v(values, "calcOptions.values");
        final int i3 = 0;
        final int i4 = 1;
        tags.a((java.lang.String[]) values.toArray(new java.lang.String[0]), 0).b = new a.cd(this, i4);
        com.omarea.common.ui.SeekBar u = u();
        boolean[] zArr = this.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (boolean z : zArr) {
            if (z) {
                arrayList.add(java.lang.Boolean.valueOf(z));
            }
        }
        u.setMax(arrayList.size());
        u.setProgress(u.getMax());
        com.omarea.common.ui.SeekBar seekBar = (com.omarea.common.ui.SeekBar) this.r.a(gu0VarArr[16]);
        seekBar.setMax(A().size() - 1);
        seekBar.setMin(0);
        seekBar.setProgress(seekBar.getMin());
        this.F.getClass();
        final int i5 = 3;
        if (a.gy.G()) {
            seekBar.setFormatter(new a.cd(this, i));
        } else {
            seekBar.setFormatter(new a.cd(this, i5));
        }
        com.omarea.common.ui.SeekBar seekBar2 = (com.omarea.common.ui.SeekBar) this.s.a(gu0VarArr[17]);
        a.en1 en1Var = new a.en1();
        if (((java.lang.Boolean) ((a.vj1) ((a.yu0) en1Var.f)).a()).booleanValue() && en1Var.d()) {
            seekBar2.setProgress(104);
        }
        w().setOnChange(new a.cd(this, 4));
        v().setOnChange(new a.cd(this, i2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i6 = 0; i6 < this.J; i6++) {
            a.ng1 obj = new a.ng1();
            obj.f381a = a.ii1.d("CPU ", i6);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i6);
            obj.c = sb.toString();
            obj.d = true;
            arrayList2.add(obj);
        }
        ((android.widget.TextView) this.o.a(gu0VarArr[13])).setOnClickListener(new a.wi(this, 25, arrayList2));
        android.widget.TextView t = t();
        java.io.File file = new java.io.File("/system/fonts/DroidSansMono.ttf");
        if (file.exists()) {
            t.setTypeface(android.graphics.Typeface.createFromFile(file));
        }
        ((android.widget.Button) this.u.a(gu0VarArr[20])).setOnClickListener(new a.vc(this));
        ((android.widget.ImageView) this.y.a(gu0VarArr[24])).setOnClickListener(new a.vc(this));
        ((android.widget.TextView) this.x.a(gu0VarArr[23])).setText(s().getShowFreq() ? "(MHz)" : "(M Cycles)");
        java.util.ArrayList j = new a.p4().j();
        java.util.ArrayList d = a.ls.d();
        a.wv.v(d, "cpuUtil.clusterInfo");
        java.util.Iterator it = d.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                a.b20.p1();
                throw null;
            }
            java.lang.String[] strArr = (java.lang.String[]) next;
            java.lang.String str = strArr.length > 1 ? "■ CPU " + a.op.N1(strArr) + "~" + a.op.Q1(strArr) + "  " : "■ CPU " + a.op.N1(strArr) + "  ";
            android.widget.TextView textView2 = (android.widget.TextView) this.C.a(gu0VarArr[28]);
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            java.lang.Object obj2 = j.get(i7);
            a.wv.v(obj2, "colors.get(cIndex)");
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Number) obj2).intValue()), 0, spannableString.length(), 33);
            textView2.append(spannableString);
            i7 = i8;
        }
        ((android.widget.ImageView) this.A.a(gu0VarArr[26])).setOnClickListener(new a.vc(this));
        ((android.widget.ImageView) this.z.a(gu0VarArr[25])).setOnClickListener(new a.vc(this));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.gd(this, null), 3);
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, 10));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
        I();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        a.p5.fullScreen$default(this, false, 1, null);
    }

    public final com.omarea.ui.bench.CyclesPowerView s() {
        return (com.omarea.ui.bench.CyclesPowerView) this.B.a(U[27]);
    }

    public final android.widget.TextView t() {
        return (android.widget.TextView) this.D.a(U[29]);
    }

    public final com.omarea.common.ui.SeekBar u() {
        return (com.omarea.common.ui.SeekBar) this.i.a(U[6]);
    }

    public final com.omarea.common.ui.SeekBar v() {
        return (com.omarea.common.ui.SeekBar) this.q.a(U[15]);
    }

    public final com.omarea.common.ui.SeekBar w() {
        return (com.omarea.common.ui.SeekBar) this.p.a(U[14]);
    }

    public final com.omarea.ui.BlurViewLinearLayout x() {
        return (com.omarea.ui.BlurViewLinearLayout) this.g.a(U[3]);
    }

    public final com.omarea.ui.BlurView y() {
        return (com.omarea.ui.BlurView) this.e.a(U[1]);
    }
}
