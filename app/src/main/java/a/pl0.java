package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pl0 extends a.gk0 {
    public static final /* synthetic */ a.gu0[] W0;
    public java.util.Timer J0;
    public java.lang.String L0;
    public final boolean M0;
    public final a.vj1 N0;
    public final int O0;
    public android.os.BatteryManager P0;
    public android.app.ActivityManager Q0;
    public final a.nk R0;
    public final a.vj1 S0;
    public int T0;
    public final a.vj1 U0;
    public final a.m11 V0;
    public final a.yq1 W = a.b20.h(2131361947, this);
    public final a.yq1 X = a.b20.h(2131361948, this);
    public final a.yq1 Y = a.b20.h(2131361949, this);
    public final a.yq1 Z = a.b20.h(2131361950, this);
    public final a.yq1 a0 = a.b20.h(2131361951, this);
    public final a.yq1 b0 = a.b20.h(2131362286, this);
    public final a.yq1 c0 = a.b20.h(2131362290, this);
    public final a.yq1 d0 = a.b20.h(2131362305, this);
    public final a.yq1 e0 = a.b20.h(2131362324, this);
    public final a.yq1 f0 = a.b20.h(2131362608, this);
    public final a.yq1 g0 = a.b20.h(2131362609, this);
    public final a.yq1 h0 = a.b20.h(2131362610, this);
    public final a.yq1 i0 = a.b20.h(2131362611, this);
    public final a.yq1 j0 = a.b20.h(2131362613, this);
    public final a.yq1 k0 = a.b20.h(2131362614, this);
    public final a.yq1 l0 = a.b20.h(2131362616, this);
    public final a.yq1 m0 = a.b20.h(2131362617, this);
    public final a.yq1 n0 = a.b20.h(2131362618, this);
    public final a.yq1 o0 = a.b20.h(2131362619, this);
    public final a.yq1 p0 = a.b20.h(2131362620, this);
    public final a.yq1 q0 = a.b20.h(2131362621, this);
    public final a.yq1 r0 = a.b20.h(2131362622, this);
    public final a.yq1 s0 = a.b20.h(2131362623, this);
    public final a.yq1 t0 = a.b20.h(2131362624, this);
    public final a.yq1 u0 = a.b20.h(2131362625, this);
    public final a.yq1 v0 = a.b20.h(2131362626, this);
    public final a.yq1 w0 = a.b20.h(2131362627, this);
    public final a.yq1 x0 = a.b20.h(2131362628, this);
    public final a.yq1 y0 = a.b20.h(2131362629, this);
    public final a.yq1 z0 = a.b20.h(2131362630, this);
    public final a.yq1 A0 = a.b20.h(2131362631, this);
    public final a.yq1 B0 = a.b20.h(2131362632, this);
    public final a.yq1 C0 = a.b20.h(2131362633, this);
    public final a.yq1 D0 = a.b20.h(2131362634, this);
    public final a.yq1 E0 = a.b20.h(2131362635, this);
    public final a.yq1 F0 = a.b20.h(2131362636, this);
    public final a.yq1 G0 = a.b20.h(2131362637, this);
    public final a.yq1 H0 = a.b20.h(2131362638, this);
    public final a.ls I0 = new a.ls();
    public final a.lz0 K0 = new a.lz0();

    static {
        a.d81 d81Var = new a.d81(a.pl0.class, "adapter_view1", "getAdapter_view1()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        W0 = new a.gu0[]{d81Var, new a.d81(a.pl0.class, "adapter_view2", "getAdapter_view2()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.pl0.class, "adapter_view2_1", "getAdapter_view2_1()Landroid/widget/LinearLayout;"), new a.d81(a.pl0.class, "adapter_view3", "getAdapter_view3()Landroid/widget/LinearLayout;"), new a.d81(a.pl0.class, "adapter_views", "getAdapter_views()Landroid/widget/LinearLayout;"), new a.d81(a.pl0.class, "cpu_core_list", "getCpu_core_list()Lcom/omarea/common/ui/OverScrollGridView;"), new a.d81(a.pl0.class, "cpu_core_total_load", "getCpu_core_total_load()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "cpu_soc_platform", "getCpu_soc_platform()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "cput_temperature", "getCput_temperature()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_battery", "getHome_battery()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.pl0.class, "home_battery_capacity", "getHome_battery_capacity()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_battery_edit", "getHome_battery_edit()Landroid/widget/ImageView;"), new a.d81(a.pl0.class, "home_battery_now", "getHome_battery_now()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_battery_temperature", "getHome_battery_temperature()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_cpu", "getHome_cpu()Landroid/widget/RelativeLayout;"), new a.d81(a.pl0.class, "home_cpu_chat", "getHome_cpu_chat()Lcom/omarea/ui/CpuBigBarView;"), new a.d81(a.pl0.class, "home_device_name", "getHome_device_name()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_gpu", "getHome_gpu()Landroid/widget/LinearLayout;"), new a.d81(a.pl0.class, "home_gpu_chat", "getHome_gpu_chat()Lcom/omarea/ui/CpuChartView;"), new a.d81(a.pl0.class, "home_gpu_freq", "getHome_gpu_freq()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_gpu_info", "getHome_gpu_info()Landroid/widget/FrameLayout;"), new a.d81(a.pl0.class, "home_gpu_info_text", "getHome_gpu_info_text()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_gpu_load", "getHome_gpu_load()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_help", "getHome_help()Landroid/widget/LinearLayout;"), new a.d81(a.pl0.class, "home_mainview", "getHome_mainview()Landroid/widget/LinearLayout;"), new a.d81(a.pl0.class, "home_memory", "getHome_memory()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.pl0.class, "home_memory_clear", "getHome_memory_clear()Landroid/widget/ImageButton;"), new a.d81(a.pl0.class, "home_memory_compact", "getHome_memory_compact()Landroid/widget/ImageButton;"), new a.d81(a.pl0.class, "home_memory_ratio", "getHome_memory_ratio()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_memory_total", "getHome_memory_total()Lcom/omarea/ui/MemoryChartView;"), new a.d81(a.pl0.class, "home_process_list", "getHome_process_list()Landroid/widget/ListView;"), new a.d81(a.pl0.class, "home_raminfo_text", "getHome_raminfo_text()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_ramstat", "getHome_ramstat()Lcom/omarea/ui/RamBarView;"), new a.d81(a.pl0.class, "home_root", "getHome_root()Lcom/omarea/common/ui/OverScrollView;"), new a.d81(a.pl0.class, "home_running_time", "getHome_running_time()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_swap_cached", "getHome_swap_cached()Landroid/widget/TextView;"), new a.d81(a.pl0.class, "home_swapstat", "getHome_swapstat()Lcom/omarea/ui/RamBarView;"), new a.d81(a.pl0.class, "home_zramsize_text", "getHome_zramsize_text()Landroid/widget/TextView;")};
    }

    /* JADX WARN: Type inference failed for: r0v77, types: [a.lz0, java.lang.Object] */
    public pl0() {
        a.cp cpVar = com.omarea.Scene.c;
        this.L0 = a.fs1.E("gpu_info", "");
        a.q10 q10Var = a.q10.f457a;
        this.M0 = a.wv.e(a.q10.t(), "basic");
        this.N0 = new a.vj1(new a.jl0(this, 1));
        java.lang.String n = new a.qc(this, a.fs1.t()).n();
        int i = 0;
        this.O0 = (n == null || n.length() == 0) ? 0 : java.lang.Integer.parseInt(n);
        this.R0 = new a.nk(a.fs1.t(), 14);
        this.S0 = new a.vj1(a.uk0.f);
        this.U0 = new a.vj1(new a.jl0(this, i));
        this.V0 = new a.m11();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(a.pl0 r33, a.ey r34) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pl0.S(a.pl0, a.ey):java.lang.Object");
    }

    public static java.lang.String U() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() / 1000;
        long j = 3600;
        long j2 = 60;
        return a.ai1.l(new java.lang.Object[]{java.lang.Long.valueOf(elapsedRealtime / j), java.lang.Long.valueOf((elapsedRealtime % j) / j2), java.lang.Long.valueOf(elapsedRealtime % j2)}, 3, "%02d:%02d:%02d", "format(format, *args)");
    }

    @Override // a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        a.wv.w(view, "view");
        T(null);
        java.lang.Object systemService = L().getSystemService("activity");
        a.wv.t(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.Q0 = (android.app.ActivityManager) systemService;
        java.lang.Object systemService2 = L().getSystemService("batterymanager");
        a.wv.t(systemService2, "null cannot be cast to non-null type android.os.BatteryManager");
        this.P0 = (android.os.BatteryManager) systemService2;
        a.gu0[] gu0VarArr = W0;
        a.gu0 gu0Var = gu0VarArr[26];
        a.yq1 yq1Var = this.w0;
        final int i = 0;
        ((android.widget.ImageButton) yq1Var.a(gu0Var)).setOnClickListener(new a.yk0(this));
        a.gu0 gu0Var2 = gu0VarArr[27];
        a.yq1 yq1Var2 = this.x0;
        final int i2 = 2;
        ((android.widget.ImageButton) yq1Var2.a(gu0Var2)).setOnClickListener(new a.yk0(this));
        final int i3 = 1;
        ((android.widget.ImageButton) yq1Var2.a(gu0VarArr[27])).setOnLongClickListener(new a.cw0(i3, this));
        final int i4 = 3;
        ((android.widget.LinearLayout) this.t0.a(gu0VarArr[23])).setOnClickListener(new a.yk0(this));
        final int i5 = 4;
        ((android.widget.ImageView) this.h0.a(gu0VarArr[11])).setOnClickListener(new a.yk0(this));
        final int i6 = 5;
        Z().setOnItemClickListener(new a.og1(i6, this));
        a.ko0 ko0Var = this.R;
        if (ko0Var == null) {
            throw new java.lang.IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        a.wv.M0(a.b20.e0(ko0Var), null, new a.hl0(this, null), 3);
        android.widget.ListView listView = (android.widget.ListView) this.A0.a(gu0VarArr[30]);
        a.rj rjVar = new a.rj(L());
        rjVar.g = 1;
        rjVar.c();
        listView.setAdapter((android.widget.ListAdapter) rjVar);
        listView.setOnTouchListener(new a.aa0(i2, this));
        listView.setOnItemClickListener(new a.qk0(listView, i3, this));
        ((android.widget.TextView) this.m0.a(gu0VarArr[16])).setText(a.wv.x1(android.os.Build.VERSION.SDK_INT));
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root")) {
            ((com.omarea.ui.BlurViewLinearLayout) this.v0.a(gu0VarArr[25])).setOnClickListener(new a.yk0(this));
            final int i7 = 6;
            ((android.widget.RelativeLayout) this.k0.a(gu0VarArr[14])).setOnClickListener(new a.yk0(this));
        } else {
            ((android.widget.ImageButton) yq1Var.a(gu0VarArr[26])).setVisibility(8);
            ((android.widget.ImageButton) yq1Var2.a(gu0VarArr[27])).setVisibility(8);
        }
        ((com.omarea.ui.BlurViewLinearLayout) this.f0.a(gu0VarArr[9])).setOnClickListener(new a.yk0(this));
    }

    public final void T(android.content.res.Configuration configuration) {
        if (configuration == null) {
            configuration = j().getConfiguration();
        }
        a.vj1 vj1Var = a.ql1.f470a;
        android.graphics.Point f = a.ql1.f(K());
        float f2 = f.y / f.x;
        int i = configuration.orientation;
        a.yq1 yq1Var = this.u0;
        a.yq1 yq1Var2 = this.a0;
        a.gu0[] gu0VarArr = W0;
        if (i != 2 || f2 > 0.5625d) {
            ((android.widget.LinearLayout) yq1Var2.a(gu0VarArr[4])).setOrientation(1);
            android.widget.LinearLayout V = V();
            android.view.ViewGroup.LayoutParams layoutParams = V().getLayoutParams();
            a.wv.t(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -2;
            layoutParams2.weight = 0.0f;
            V.setLayoutParams(layoutParams2);
            com.omarea.ui.BlurViewLinearLayout W = W();
            android.view.ViewGroup.LayoutParams layoutParams3 = W().getLayoutParams();
            a.wv.t(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = -1;
            layoutParams4.height = -2;
            layoutParams4.weight = 0.0f;
            W.setLayoutParams(layoutParams4);
            android.widget.LinearLayout X = X();
            android.view.ViewGroup.LayoutParams layoutParams5 = X().getLayoutParams();
            a.wv.t(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.topMargin = 0;
            layoutParams6.bottomMargin = 0;
            X.setLayoutParams(layoutParams6);
            try {
                V().removeView(Y());
                ((android.widget.LinearLayout) yq1Var.a(gu0VarArr[24])).addView(Y());
                return;
            } catch (java.lang.Throwable th) {
                a.b20.I(th);
                return;
            }
        }
        ((android.widget.LinearLayout) yq1Var2.a(gu0VarArr[4])).setOrientation(0);
        android.widget.LinearLayout V2 = V();
        android.view.ViewGroup.LayoutParams layoutParams7 = V().getLayoutParams();
        a.wv.t(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams8 = (android.widget.LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.width = 0;
        layoutParams8.height = -1;
        layoutParams8.weight = 1.0f;
        V2.setLayoutParams(layoutParams8);
        com.omarea.ui.BlurViewLinearLayout W2 = W();
        android.view.ViewGroup.LayoutParams layoutParams9 = W().getLayoutParams();
        a.wv.t(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams10 = (android.widget.LinearLayout.LayoutParams) layoutParams9;
        layoutParams10.width = 0;
        layoutParams10.height = -1;
        layoutParams10.weight = 1.0f;
        W2.setLayoutParams(layoutParams10);
        android.widget.LinearLayout X2 = X();
        android.view.ViewGroup.LayoutParams layoutParams11 = X().getLayoutParams();
        a.wv.t(layoutParams11, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams12 = (android.widget.LinearLayout.LayoutParams) layoutParams11;
        layoutParams12.topMargin = a.b20.M(L(), 16.0f);
        layoutParams12.bottomMargin = a.b20.M(L(), 16.0f);
        X2.setLayoutParams(layoutParams12);
        try {
            ((android.widget.LinearLayout) yq1Var.a(gu0VarArr[24])).removeView(Y());
            V().addView(Y());
        } catch (java.lang.Throwable th2) {
            a.b20.I(th2);
        }
    }

    public final android.widget.LinearLayout V() {
        return (android.widget.LinearLayout) this.W.a(W0[0]);
    }

    public final com.omarea.ui.BlurViewLinearLayout W() {
        return (com.omarea.ui.BlurViewLinearLayout) this.X.a(W0[1]);
    }

    public final android.widget.LinearLayout X() {
        return (android.widget.LinearLayout) this.Y.a(W0[2]);
    }

    public final android.widget.LinearLayout Y() {
        return (android.widget.LinearLayout) this.Z.a(W0[3]);
    }

    public final com.omarea.common.ui.OverScrollGridView Z() {
        return (com.omarea.common.ui.OverScrollGridView) this.b0.a(W0[5]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(3:10|11|12)(2:27|28))(3:29|30|(1:32)(1:33))|13|(6:15|(2:17|(4:19|20|21|22))|24|20|21|22)(2:25|26)))|35|6|7|(0)(0)|13|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:11:0x0025, B:13:0x0043, B:15:0x004f, B:17:0x006f, B:20:0x0080, B:25:0x009e, B:26:0x00a4, B:30:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:11:0x0025, B:13:0x0043, B:15:0x004f, B:17:0x006f, B:20:0x0080, B:25:0x009e, B:26:0x00a4, B:30:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(a.ey r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof a.ml0
            if (r0 == 0) goto L13
            r0 = r14
            a.ml0 r0 = (a.ml0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a.ml0 r0 = new a.ml0
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.g
            a.dz r1 = a.dz.c
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            a.pl0 r0 = r0.f
            a.b20.q1(r14)     // Catch: java.lang.Exception -> La5
            r1 = r0
            goto L43
        L2a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L32:
            a.b20.q1(r14)
            a.lz0 r14 = r13.K0     // Catch: java.lang.Exception -> La5
            r0.f = r13     // Catch: java.lang.Exception -> La5
            r0.i = r3     // Catch: java.lang.Exception -> La5
            java.lang.Object r14 = r14.b(r0)     // Catch: java.lang.Exception -> La5
            if (r14 != r1) goto L42
            return r1
        L42:
            r1 = r13
        L43:
            r2 = r14
            a.jz0 r2 = (a.jz0) r2     // Catch: java.lang.Exception -> La5
            android.app.ActivityManager$MemoryInfo r14 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> La5
            r14.<init>()     // Catch: java.lang.Exception -> La5
            android.app.ActivityManager r0 = r1.Q0     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L9e
            r0.getMemoryInfo(r14)     // Catch: java.lang.Exception -> La5
            long r3 = r14.totalMem     // Catch: java.lang.Exception -> La5
            r0 = 1024(0x400, float:1.435E-42)
            long r5 = (long) r0     // Catch: java.lang.Exception -> La5
            long r3 = r3 / r5
            int r0 = r2.b     // Catch: java.lang.Exception -> La5
            int r7 = r2.c     // Catch: java.lang.Exception -> La5
            int r0 = r0 + r7
            long r9 = (long) r0     // Catch: java.lang.Exception -> La5
            long r7 = r14.availMem     // Catch: java.lang.Exception -> La5
            long r7 = r7 / r5
            a.vj1 r14 = r1.S0     // Catch: java.lang.Exception -> La5
            java.lang.Object r14 = r14.a()     // Catch: java.lang.Exception -> La5
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Exception -> La5
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Exception -> La5
            if (r14 == 0) goto L7f
            a.q10 r14 = a.q10.f457a     // Catch: java.lang.Exception -> La5
            java.lang.String r14 = a.q10.t()     // Catch: java.lang.Exception -> La5
            java.lang.String r0 = "basic"
            boolean r14 = a.wv.e(r14, r0)     // Catch: java.lang.Exception -> La5
            if (r14 != 0) goto L7f
            r5 = r9
            goto L80
        L7f:
            r5 = r7
        L80:
            int r14 = r2.d     // Catch: java.lang.Exception -> La5
            int r0 = r2.e     // Catch: java.lang.Exception -> La5
            int r11 = r14 - r0
            a.vj1 r14 = r1.N0     // Catch: java.lang.Exception -> La5
            java.lang.Object r14 = r14.a()     // Catch: java.lang.Exception -> La5
            a.pj1 r14 = (a.pj1) r14     // Catch: java.lang.Exception -> La5
            java.lang.Long r12 = r14.h()     // Catch: java.lang.Exception -> La5
            a.cp r14 = com.omarea.Scene.c     // Catch: java.lang.Exception -> La5
            a.zk0 r14 = new a.zk0     // Catch: java.lang.Exception -> La5
            r0 = r14
            r0.<init>()     // Catch: java.lang.Exception -> La5
            a.fs1.L(r14)     // Catch: java.lang.Exception -> La5
            goto La5
        L9e:
            java.lang.String r14 = "activityManager"
            a.wv.M1(r14)     // Catch: java.lang.Exception -> La5
            r14 = 0
            throw r14     // Catch: java.lang.Exception -> La5
        La5:
            a.no1 r14 = a.no1.f387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pl0.a0(a.ey):java.lang.Object");
    }

    @Override // a.gk0, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        this.F = true;
        T(configuration);
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        return layoutInflater.inflate(2131558564, viewGroup, false);
    }

    @Override // a.gk0
    public final void x() {
        java.util.Timer timer = this.J0;
        if (timer != null) {
            this.T0 = 0;
            timer.cancel();
            this.J0 = null;
        }
        this.F = true;
    }

    @Override // a.gk0
    public final void y() {
        this.F = true;
        if (this.C) {
            return;
        }
        K().setTitle(m(2131951876));
        java.util.Timer timer = this.J0;
        if (timer != null) {
            this.T0 = 0;
            timer.cancel();
            this.J0 = null;
        }
        this.T0 = 0;
        java.util.Timer timer2 = new java.util.Timer("HomeMonitor");
        timer2.schedule(new a.hr(6, this), 0L, 1500L);
        this.J0 = timer2;
    }
}
