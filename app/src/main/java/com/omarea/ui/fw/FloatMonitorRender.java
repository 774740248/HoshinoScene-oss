package com.omarea.ui.fw;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class FloatMonitorRender extends android.widget.LinearLayout {
    public static final /* synthetic */ a.gu0[] S;
    public static final android.text.style.ForegroundColorSpan T;
    public static final android.text.style.StyleSpan U;
    public final a.vj1 A;
    public final a.vj1 B;
    public final android.app.ActivityManager.MemoryInfo C;
    public final boolean D;
    public final a.vj1 E;
    public a.qi1 F;
    public int G;
    public java.util.ArrayList H;
    public java.lang.Integer[] I;
    public final java.lang.StringBuilder J;
    public int K;
    public a.e11[] L;
    public android.text.SpannableString M;
    public long N;
    public java.lang.String O;
    public long P;
    public int Q;
    public int R;
    public final a.yq1 c;
    public final a.yq1 d;
    public final a.yq1 e;
    public final a.yq1 f;
    public final a.yq1 g;
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
    public android.widget.LinearLayout u;
    public android.widget.LinearLayout v;
    public final a.m11 w;
    public final a.ls x;
    public final a.qp0 y;
    public final a.lz0 z;

    static {
        a.d81 d81Var = new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_cpu", "getFw_cpu()Landroid/view/View;");
        a.na1.f375a.getClass();
        S = new a.gu0[]{d81Var, new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_gpu", "getFw_gpu()Landroid/view/View;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_battery", "getFw_battery()Landroid/view/View;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_chart_list", "getFw_chart_list()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_other_info", "getFw_other_info()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_perf_event", "getFw_perf_event()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_perf_event_text", "getFw_perf_event_text()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_perf_event_cores", "getFw_perf_event_cores()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_cpu_load", "getFw_cpu_load()Lcom/omarea/ui/fw/FloatMonitorChartView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_cpu_freq", "getFw_cpu_freq()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_gpu_load", "getFw_gpu_load()Lcom/omarea/ui/fw/FloatMonitorChartView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_gpu_freq", "getFw_gpu_freq()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_battery_chart", "getFw_battery_chart()Lcom/omarea/ui/fw/FloatMonitorBatteryView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_battery_level", "getFw_battery_level()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_battery_temp", "getFw_battery_temp()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_mem", "getFw_mem()Landroid/view/View;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_mem_ratio_chart", "getFw_mem_ratio_chart()Lcom/omarea/ui/fw/FloatMonitorChartView;"), new a.d81(com.omarea.ui.fw.FloatMonitorRender.class, "fw_mem_ratio_text", "getFw_mem_ratio_text()Landroid/widget/TextView;")};
        T = new android.text.style.ForegroundColorSpan(-1);
        U = new android.text.style.StyleSpan(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v39, types: [a.qp0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [a.lz0, java.lang.Object] */
    public FloatMonitorRender(android.content.Context context, int i) {
        super(context);
        a.wv.w(context, "context");
        this.c = a.b20.j(this, 2131362544);
        this.d = a.b20.j(this, 2131362559);
        this.e = a.b20.j(this, 2131362539);
        this.f = a.b20.j(this, 2131362543);
        this.g = a.b20.j(this, 2131362569);
        this.h = a.b20.j(this, 2131362573);
        this.i = a.b20.j(this, 2131362575);
        this.j = a.b20.j(this, 2131362574);
        this.k = a.b20.j(this, 2131362547);
        this.l = a.b20.j(this, 2131362546);
        this.m = a.b20.j(this, 2131362562);
        this.n = a.b20.j(this, 2131362561);
        this.o = a.b20.j(this, 2131362540);
        this.p = a.b20.j(this, 2131362541);
        this.q = a.b20.j(this, 2131362542);
        this.r = a.b20.j(this, 2131362565);
        this.s = a.b20.j(this, 2131362566);
        this.t = a.b20.j(this, 2131362567);
        this.w = new a.m11();
        this.x = new a.ls();
        this.y = new a.qp0();
        this.z = new a.lz0();
        this.A = new a.vj1(new a.hg0(this, 1));
        this.B = new a.vj1(new a.hg0(this, 0));
        this.C = new android.app.ActivityManager.MemoryInfo();
        a.q10 q10Var = a.q10.f457a;
        this.D = a.wv.e(a.q10.t(), "root");
        this.E = new a.vj1(a.kg0.d);
        this.G = -1;
        this.H = new java.util.ArrayList();
        this.J = new java.lang.StringBuilder();
        this.K = -1;
        a.cp cpVar = com.omarea.Scene.c;
        this.Q = a.fs1.D().getInt("monitor_general2_flags", 6391);
        int i2 = a.fs1.D().getInt("monitor_general2_refresh", 1000);
        this.R = i2 < 100 ? 100 : i2;
        this.Q = i;
        setLayout(context);
    }

    public static void a(com.omarea.ui.fw.FloatMonitorRender floatMonitorRender, int i, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, a.k11 k11Var, a.ia1 ia1Var, a.ka1 ka1Var, java.lang.Integer num, int i2, int i3, double d, boolean z, int i4) {
        java.lang.String str;
        int i5;
        a.wv.w(floatMonitorRender, "this$0");
        a.wv.w(ia1Var, "$cpuLoad");
        a.wv.w(ka1Var, "$maxFreq");
        if (floatMonitorRender.isAttachedToWindow()) {
            if (l(i, 65520)) {
                floatMonitorRender.getFw_other_info().setText(spannableStringBuilder);
            }
            if (l(i, 65536)) {
                if (floatMonitorRender.getFw_perf_event_cores().getChildCount() <= 0 && (i5 = floatMonitorRender.G) > 0) {
                    int i6 = -1;
                    for (i5 = floatMonitorRender.G; i6 < i5; i5 = i5) {
                        java.lang.CharSequence valueOf = i6 < 0 ? "#" : java.lang.String.valueOf(i6);
                        android.widget.LinearLayout fw_perf_event_cores = floatMonitorRender.getFw_perf_event_cores();
                        android.widget.TextView textView = new android.widget.TextView(floatMonitorRender.getContext());
                        textView.setText(valueOf);
                        textView.setTextSize(1, 5.0f);
                        textView.setGravity(17);
                        floatMonitorRender.q(textView, i6 == floatMonitorRender.K);
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(a.b20.N(textView, 10.4f), a.b20.N(textView, 10.4f));
                        layoutParams.setMarginEnd(a.b20.N(textView, 0.5f));
                        textView.setLayoutParams(layoutParams);
                        textView.setOnClickListener(new a.yg(i6, 2, floatMonitorRender));
                        fw_perf_event_cores.addView(textView);
                        i6++;
                    }
                }
                floatMonitorRender.getFw_perf_event_text().setText(charSequence == null ? "#PERF" : charSequence);
            }
            if (!l(i, 1) || k11Var == null) {
                str = "MHz";
            } else {
                floatMonitorRender.getFw_cpu_load().a(100.0f, (float) (100 - ia1Var.c));
                android.widget.TextView fw_cpu_freq = floatMonitorRender.getFw_cpu_freq();
                java.lang.String valueOf2 = java.lang.String.valueOf(ka1Var.c);
                if (valueOf2.length() > 3) {
                    valueOf2 = valueOf2.substring(0, valueOf2.length() - 3);
                    a.wv.v(valueOf2, "this as java.lang.String…ing(startIndex, endIndex)");
                } else if (valueOf2.length() == 0) {
                    valueOf2 = "0";
                }
                str = "MHz";
                fw_cpu_freq.setText(valueOf2.concat(str));
            }
            if (l(i, 2) && num != null) {
                floatMonitorRender.getFw_gpu_freq().setText(num + str);
                if (i2 > -1) {
                    floatMonitorRender.getFw_gpu_load().a(100.0f, 100.0f - i2);
                }
            }
            if (l(i, 4)) {
                com.omarea.ui.fw.FloatMonitorBatteryView fw_battery_chart = floatMonitorRender.getFw_battery_chart();
                fw_battery_chart.getClass();
                int i7 = 100 - ((int) (((100.0d - i3) * 100.0d) / 100.0d));
                fw_battery_chart.l = i7;
                fw_battery_chart.t = d;
                fw_battery_chart.m = i7;
                fw_battery_chart.invalidate();
                floatMonitorRender.getFw_battery_temp().setText(d + "℃");
                floatMonitorRender.getFw_battery_level().setText(i3 + "%" + (z ? "+" : ""));
            }
            if (i4 >= 0) {
                floatMonitorRender.getFw_mem_ratio_chart().a(100.0f, 100 - i4);
                floatMonitorRender.getFw_mem_ratio_text().setText(i4 + "%");
            }
        }
    }

    public static void b(com.omarea.ui.fw.FloatMonitorRender floatMonitorRender, int i) {
        a.wv.w(floatMonitorRender, "this$0");
        floatMonitorRender.K = i;
        int childCount = floatMonitorRender.getFw_perf_event_cores().getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = floatMonitorRender.getFw_perf_event_cores().getChildAt(i2);
            a.wv.t(childAt, "null cannot be cast to non-null type android.widget.TextView");
            android.widget.TextView textView = (android.widget.TextView) childAt;
            boolean z = true;
            if ((i2 != 0 || floatMonitorRender.K >= 0) && i2 != floatMonitorRender.K + 1) {
                z = false;
            }
            floatMonitorRender.q(textView, z);
        }
        a.e11[] e11VarArr = floatMonitorRender.L;
        if (e11VarArr != null) {
            floatMonitorRender.getFw_perf_event_text().setText(floatMonitorRender.h(e11VarArr));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.ia1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v20, types: [a.i11, a.k11, a.h11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.omarea.ui.fw.FloatMonitorRender r34, a.ey r35) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.fw.FloatMonitorRender.c(com.omarea.ui.fw.FloatMonitorRender, a.ey):java.lang.Object");
    }

    public static void d(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence) {
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("\n");
        }
        if (charSequence instanceof android.text.SpannableString) {
            spannableStringBuilder.append(charSequence);
            return;
        }
        java.lang.String obj = charSequence.toString();
        android.text.SpannableString spannableString = new android.text.SpannableString(obj);
        spannableString.setSpan(T, 0, obj.length(), 33);
        spannableString.setSpan(U, 0, obj.length(), 33);
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
    }

    public static void e(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, int i, java.lang.String str2) {
        if (i <= 0) {
            return;
        }
        java.lang.String j = (str2 == null || str2.length() == 0) ? j(i) : a.ii1.f(j(i), " ", str2);
        d(spannableStringBuilder, str);
        spannableStringBuilder.append("\n ");
        spannableStringBuilder.append((java.lang.CharSequence) j);
    }

    public static java.lang.String g(java.lang.String str, int i) {
        if (100 <= i && i < 10000) {
            return p(i / 1000.0d);
        }
        java.lang.String valueOf = java.lang.String.valueOf(i / 1024);
        return valueOf.length() > 2 ? valueOf : valueOf.concat(str);
    }

    private final android.app.ActivityManager getActivityManager() {
        return (android.app.ActivityManager) this.B.a();
    }

    private final android.view.View getFw_battery() {
        return this.e.a(S[2]);
    }

    private final com.omarea.ui.fw.FloatMonitorBatteryView getFw_battery_chart() {
        return (com.omarea.ui.fw.FloatMonitorBatteryView) this.o.a(S[12]);
    }

    private final android.widget.TextView getFw_battery_level() {
        return (android.widget.TextView) this.p.a(S[13]);
    }

    private final android.widget.TextView getFw_battery_temp() {
        return (android.widget.TextView) this.q.a(S[14]);
    }

    private final android.widget.LinearLayout getFw_chart_list() {
        return (android.widget.LinearLayout) this.f.a(S[3]);
    }

    private final android.view.View getFw_cpu() {
        return this.c.a(S[0]);
    }

    private final android.widget.TextView getFw_cpu_freq() {
        return (android.widget.TextView) this.l.a(S[9]);
    }

    private final com.omarea.ui.fw.FloatMonitorChartView getFw_cpu_load() {
        return (com.omarea.ui.fw.FloatMonitorChartView) this.k.a(S[8]);
    }

    private final android.view.View getFw_gpu() {
        return this.d.a(S[1]);
    }

    private final android.widget.TextView getFw_gpu_freq() {
        return (android.widget.TextView) this.n.a(S[11]);
    }

    private final com.omarea.ui.fw.FloatMonitorChartView getFw_gpu_load() {
        return (com.omarea.ui.fw.FloatMonitorChartView) this.m.a(S[10]);
    }

    private final android.view.View getFw_mem() {
        return this.r.a(S[15]);
    }

    private final com.omarea.ui.fw.FloatMonitorChartView getFw_mem_ratio_chart() {
        return (com.omarea.ui.fw.FloatMonitorChartView) this.s.a(S[16]);
    }

    private final android.widget.TextView getFw_mem_ratio_text() {
        return (android.widget.TextView) this.t.a(S[17]);
    }

    private final android.widget.TextView getFw_other_info() {
        return (android.widget.TextView) this.g.a(S[4]);
    }

    private final android.widget.LinearLayout getFw_perf_event() {
        return (android.widget.LinearLayout) this.h.a(S[5]);
    }

    private final android.widget.LinearLayout getFw_perf_event_cores() {
        return (android.widget.LinearLayout) this.j.a(S[7]);
    }

    private final android.widget.TextView getFw_perf_event_text() {
        return (android.widget.TextView) this.i.a(S[6]);
    }

    private final java.lang.String getGpuMemoryText() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.P <= 2000) {
            return this.O;
        }
        this.y.getClass();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String str = null;
        if (a.q10.t().equals("root")) {
            if (a.qp0.j()) {
                if (a.qp0.b == null) {
                    a.qp0.b = "";
                    if (a.qp0.l(a.q10.k(2000L, "cat /proc/mali/memory_usage | grep \"Total\" | cut -f2 -d \"(\" | cut -f1 -d \" \""))) {
                        a.qp0.b = "cat /proc/mali/memory_usage | grep \"Total\" | cut -f2 -d \"(\" | cut -f1 -d \" \"";
                    } else if (a.qp0.l(a.qp0.a())) {
                        a.qp0.b = "/proc/mtk_mali/gpu_memory";
                    } else if (a.qp0.l(a.qp0.b())) {
                        a.qp0.b = "/proc/mali/memory_usage";
                    }
                }
                if (!a.qp0.b.isEmpty()) {
                    try {
                        if ("/proc/mtk_mali/gpu_memory".equals(a.qp0.b)) {
                            java.lang.String a2 = a.qp0.a();
                            if (a.qp0.l(a2)) {
                                str = ((java.lang.Long.parseLong(a2) * 4) / 1024) + "MB";
                            }
                        } else if ("/proc/mali/memory_usage".equals(a.qp0.b)) {
                            java.lang.String b = a.qp0.b();
                            if (a.qp0.l(b)) {
                                str = ((java.lang.Long.parseLong(b) / 1024) / 1024) + "MB";
                            }
                        } else {
                            java.lang.String str2 = a.qp0.b;
                            a.wv.w(str2, "cmd");
                            java.lang.String k = a.q10.k(2000L, str2);
                            if (a.qp0.l(k)) {
                                str = ((java.lang.Long.parseLong(k) / 1024) / 1024) + "MB";
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                str = "?MB";
            } else if (a.qp0.d) {
                a.nu0 nu0Var = a.nu0.f395a;
                try {
                    str = ((java.lang.Long.parseLong(a.nu0.d("/sys/devices/virtual/kgsl/kgsl/page_alloc")) / 1024) / 1024) + "MB";
                } catch (java.lang.Exception unused2) {
                    a.qp0.d = false;
                }
            }
        }
        this.O = str;
        this.P = currentTimeMillis;
        return str;
    }

    private final boolean getKernelMemInfo() {
        return ((java.lang.Boolean) this.E.a()).booleanValue();
    }

    private final int getPhysicalMemPercent() {
        android.app.ActivityManager activityManager = getActivityManager();
        android.app.ActivityManager.MemoryInfo memoryInfo = this.C;
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        if (j <= 0) {
            return 0;
        }
        return (int) (((j - memoryInfo.availMem) * 100) / j);
    }

    private final a.pj1 getSwapUtils() {
        return (a.pj1) this.A.a();
    }

    public static java.lang.String j(int i) {
        long j = i;
        return j >= 1000000 ? a.ii1.e(p(i / 1000000.0d), "G") : j >= 10000 ? a.ii1.e(p(i / 1000.0d), "M") : a.ai1.c(i, "K");
    }

    public static boolean l(int i, int i2) {
        return (i & i2) != 0;
    }

    public static void n(android.view.View view, android.widget.LinearLayout linearLayout) {
        android.view.ViewParent parent = view.getParent();
        if (parent == linearLayout) {
            return;
        }
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        linearLayout.addView(view);
    }

    public static java.lang.String p(double d) {
        int i = (int) ((d * 10) + 0.5d);
        int i2 = i / 10;
        int i3 = i % 10;
        if (i3 == 0) {
            return java.lang.String.valueOf(i2);
        }
        return i2 + "." + i3;
    }

    private final void setChartGridEnabled(boolean z) {
        android.view.ViewGroup viewGroup;
        if (!z) {
            if (this.u == null && this.v == null) {
                return;
            }
            android.view.View[] viewArr = {getFw_cpu(), getFw_gpu(), getFw_battery(), getFw_mem()};
            for (int i = 0; i < 4; i++) {
                n(viewArr[i], getFw_chart_list());
            }
            android.widget.LinearLayout linearLayout = this.u;
            if (linearLayout != null) {
                android.view.ViewParent parent = linearLayout.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(linearLayout);
                }
            }
            android.widget.LinearLayout linearLayout2 = this.v;
            if (linearLayout2 != null) {
                android.view.ViewParent parent2 = linearLayout2.getParent();
                viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(linearLayout2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = (int) ((getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        android.widget.LinearLayout linearLayout3 = this.u;
        if (linearLayout3 == null) {
            linearLayout3 = new android.widget.LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = i2;
            linearLayout3.setLayoutParams(layoutParams);
            this.u = linearLayout3;
        }
        android.widget.LinearLayout linearLayout4 = this.v;
        if (linearLayout4 == null) {
            linearLayout4 = new android.widget.LinearLayout(getContext());
            linearLayout4.setOrientation(0);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = 0;
            linearLayout4.setLayoutParams(layoutParams2);
            this.v = linearLayout4;
        }
        n(getFw_cpu(), linearLayout3);
        n(getFw_gpu(), linearLayout3);
        n(getFw_battery(), linearLayout4);
        n(getFw_mem(), linearLayout4);
        if (linearLayout3.getParent() != getFw_chart_list()) {
            android.view.ViewParent parent3 = linearLayout3.getParent();
            android.view.ViewGroup viewGroup3 = parent3 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent3 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(linearLayout3);
            }
            getFw_chart_list().addView(linearLayout3, 0);
        }
        if (linearLayout4.getParent() != getFw_chart_list()) {
            android.view.ViewParent parent4 = linearLayout4.getParent();
            viewGroup = parent4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent4 : null;
            if (viewGroup != null) {
                viewGroup.removeView(linearLayout4);
            }
            getFw_chart_list().addView(linearLayout4, 1);
        }
    }

    private final void setLayout(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(2131558574, (android.view.ViewGroup) this, true);
        java.io.File file = new java.io.File("/system/fonts/DroidSansMono.ttf");
        if (file.exists()) {
            getFw_other_info().setTypeface(android.graphics.Typeface.createFromFile(file));
            getFw_perf_event_text().setTypeface(android.graphics.Typeface.createFromFile(file));
        }
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    public final void f() {
        if (getChildCount() == 0) {
            return;
        }
        getFw_cpu().setVisibility(m(1) ? 0 : 8);
        getFw_gpu().setVisibility(m(2) ? 0 : 8);
        getFw_battery().setVisibility(m(4) ? 0 : 8);
        getFw_mem().setVisibility(m(8) ? 0 : 8);
        boolean m = m(15);
        boolean m2 = m(65520);
        boolean m3 = m(65536);
        getFw_chart_list().setVisibility(m ? 0 : 8);
        getFw_other_info().setVisibility(m2 ? 0 : 8);
        getFw_perf_event().setVisibility(m3 ? 0 : 8);
        getFw_other_info().setText((java.lang.CharSequence) null);
        getFw_perf_event_text().setText((java.lang.CharSequence) null);
        android.widget.TextView fw_other_info = getFw_other_info();
        android.view.ViewGroup.LayoutParams layoutParams = getFw_other_info().getLayoutParams();
        a.wv.t(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = (m(16384) || m(32768)) ? a.b20.N(this, 72.0f) : m(32) ? a.b20.N(this, 69.0f) : a.b20.N(this, 65.0f);
        fw_other_info.setLayoutParams(layoutParams2);
        android.view.View childAt = getChildAt(0);
        a.wv.t(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) childAt;
        boolean r0 = !(java.lang.Integer.bitCount(15 & this.Q) != 4 || m2);
        setChartGridEnabled(r0);
        if (m && (m2 || m3)) {
            linearLayout.setOrientation(0);
            getFw_chart_list().setOrientation(1);
        } else {
            linearLayout.setOrientation(1);
            getFw_chart_list().setOrientation((r0) ? 1 : 0);
        }
        requestLayout();
    }

    public final int getFlags() {
        return this.Q;
    }

    public final int getRefreshInterval() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.e11, java.lang.Object] */
    public final java.lang.CharSequence h(a.e11[] e11VarArr) {
        a.e11 e11Var;
        if (e11VarArr.length == 0) {
            return "#PERF";
        }
        int length = e11VarArr.length;
        int i = this.K;
        if (i < 0 || i >= length) {
            a.e11 obj = new a.e11();
            for (a.e11 e11Var2 : e11VarArr) {
                obj.f115a += e11Var2.f115a;
                obj.b += e11Var2.b;
                obj.c += e11Var2.c;
                obj.d += e11Var2.d;
                obj.e += e11Var2.e;
                obj.f += e11Var2.f;
                obj.g += e11Var2.g;
                obj.h += e11Var2.h;
            }
            int i2 = this.G;
            if (i2 < 1) {
                i2 = 1;
            }
            obj.f115a /= i2;
            obj.b /= i2;
            obj.c /= i2;
            obj.d /= i2;
            obj.e /= i2;
            obj.f /= i2;
            obj.g /= i2;
            obj.h /= i2;
            e11Var = obj;
        } else {
            e11Var = e11VarArr[i];
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i3 = e11Var.b;
        int i4 = e11Var.f115a;
        e(spannableStringBuilder, "cache-misses", i3, ((long) i4) <= 0 ? null : a.ii1.e(p((i3 * 100.0d) / i4), "%"));
        e(spannableStringBuilder, "mem-access", e11Var.c, null);
        e(spannableStringBuilder, "raw-stall", e11Var.d, null);
        e(spannableStringBuilder, "stall-backend", e11Var.e, null);
        e(spannableStringBuilder, "stall-backend-membound", e11Var.f, null);
        e(spannableStringBuilder, "stall-frontend", e11Var.g, null);
        e(spannableStringBuilder, "stall-frontend-membound", e11Var.h, null);
        return spannableStringBuilder.length() == 0 ? "#PERF" : spannableStringBuilder;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:61|(1:63)(1:157)|64|65|66|(3:67|68|69)|(3:107|108|(9:110|(11:112|113|114|(4:116|117|118|(7:120|(2:122|123)(1:143)|124|125|(4:127|(2:139|140)(2:129|(1:131))|132|133)(2:141|142)|134|138))(1:148)|144|(0)(0)|124|125|(0)(0)|134|138)|151|152|102|103|104|105|56))|71|(8:73|(7:94|95|(2:80|81)(1:93)|82|83|(4:85|(1:87)|88|89)(2:91|92)|90)|78|(0)(0)|82|83|(0)(0)|90)|101|102|103|104|105|56) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00ef, code lost:
    
        if (r12 > 0.0d) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0280 A[Catch: Exception -> 0x028c, TRY_LEAVE, TryCatch #0 {Exception -> 0x028c, blocks: (B:118:0x0270, B:120:0x0277, B:122:0x0280), top: B:117:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c9 A[Catch: Exception -> 0x034a, TryCatch #2 {Exception -> 0x034a, blocks: (B:140:0x029d, B:132:0x02aa, B:134:0x02cf, B:131:0x02a7, B:141:0x02c9, B:71:0x02e7, B:73:0x02f0, B:75:0x0308), top: B:139:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0378 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x031b A[Catch: Exception -> 0x0312, TRY_LEAVE, TryCatch #5 {Exception -> 0x0312, blocks: (B:95:0x030f, B:80:0x031b), top: B:94:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x033e A[Catch: Exception -> 0x0362, TryCatch #6 {Exception -> 0x0362, blocks: (B:104:0x034d, B:87:0x0331, B:88:0x0334, B:90:0x0344, B:91:0x033e, B:158:0x0355, B:159:0x0361), top: B:103:0x034d }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r27, a.k11 r28, a.i11 r29, a.ey r30) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.fw.FloatMonitorRender.i(int, a.k11, a.i11, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(a.ey r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.fw.FloatMonitorRender.k(a.ey):java.lang.Object");
    }

    public final boolean m(int i) {
        return (i & this.Q) != 0;
    }

    public final void o() {
        a.qi1 qi1Var = this.F;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
        }
        this.F = null;
        long j = this.R;
        if (j < 100) {
            j = 100;
        }
        this.F = a.wv.M0(a.wv.b(a.z80.b), null, new a.lg0(this, j, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a.qi1 qi1Var = this.F;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }

    public final void q(android.widget.TextView textView, boolean z) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(a.b20.N(this, 1.5f));
        gradientDrawable.setColor(z ? -855638017 : 1157627903);
        textView.setBackground(gradientDrawable);
        textView.setTextColor(z ? -16777216 : -1);
    }

    public final void setFlags(int i) {
        this.Q = i;
        f();
    }

    public final void setRefreshInterval(int i) {
        if (i < 100) {
            i = 100;
        }
        if (this.R == i) {
            return;
        }
        this.R = i;
        if (!isAttachedToWindow() || isInEditMode()) {
            return;
        }
        o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v39, types: [a.qp0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [a.lz0, java.lang.Object] */
    public FloatMonitorRender(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.c = a.b20.j(this, 2131362544);
        this.d = a.b20.j(this, 2131362559);
        this.e = a.b20.j(this, 2131362539);
        this.f = a.b20.j(this, 2131362543);
        this.g = a.b20.j(this, 2131362569);
        this.h = a.b20.j(this, 2131362573);
        this.i = a.b20.j(this, 2131362575);
        this.j = a.b20.j(this, 2131362574);
        this.k = a.b20.j(this, 2131362547);
        this.l = a.b20.j(this, 2131362546);
        this.m = a.b20.j(this, 2131362562);
        this.n = a.b20.j(this, 2131362561);
        this.o = a.b20.j(this, 2131362540);
        this.p = a.b20.j(this, 2131362541);
        this.q = a.b20.j(this, 2131362542);
        this.r = a.b20.j(this, 2131362565);
        this.s = a.b20.j(this, 2131362566);
        this.t = a.b20.j(this, 2131362567);
        this.w = new a.m11();
        this.x = new a.ls();
        this.y = new a.qp0();
        this.z = new a.lz0();
        this.A = new a.vj1(new a.hg0(this, 1));
        this.B = new a.vj1(new a.hg0(this, 0));
        this.C = new android.app.ActivityManager.MemoryInfo();
        a.q10 q10Var = a.q10.f457a;
        this.D = a.wv.e(a.q10.t(), "root");
        this.E = new a.vj1(a.kg0.d);
        this.G = -1;
        this.H = new java.util.ArrayList();
        this.J = new java.lang.StringBuilder();
        this.K = -1;
        a.cp cpVar = com.omarea.Scene.c;
        this.Q = a.fs1.D().getInt("monitor_general2_flags", 6391);
        int i = a.fs1.D().getInt("monitor_general2_refresh", 1000);
        this.R = i < 100 ? 100 : i;
        setLayout(context);
    }
}
