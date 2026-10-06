package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFpsSession extends a.p5 {
    public static final /* synthetic */ a.gu0[] I0;
    public final a.yq1 A;
    public final a.yq1 A0;
    public final a.yq1 B;
    public final a.yq1 B0;
    public final a.yq1 C;
    public final a.yq1 C0;
    public final a.yq1 D;
    public final a.r51 D0;
    public final a.yq1 E;
    public java.lang.String E0;
    public final a.yq1 F;
    public java.lang.String F0;
    public final a.yq1 G;
    public a.qo0 G0;
    public final a.yq1 H;
    public final a.eu H0;
    public final a.yq1 I;
    public final a.yq1 J;
    public final a.yq1 K;
    public final a.yq1 L;
    public final a.yq1 M;
    public final a.yq1 N;
    public final a.yq1 O;
    public final a.yq1 P;
    public final a.yq1 Q;
    public final a.yq1 R;
    public final a.yq1 S;
    public final a.yq1 T;
    public final a.yq1 U;
    public final a.yq1 V;
    public final a.yq1 W;
    public final a.yq1 X;
    public final a.yq1 Y;
    public final a.yq1 Z;
    public final a.yq1 a0;
    public final a.yq1 b0;
    public final a.yq1 c0;
    public final a.yq1 d;
    public final a.yq1 d0;
    public final a.yq1 e;
    public final a.yq1 e0;
    public final a.yq1 f;
    public final a.yq1 f0;
    public final a.yq1 g;
    public final a.yq1 g0;
    public final a.yq1 h;
    public final a.yq1 h0;
    public final a.yq1 i;
    public final a.yq1 i0;
    public final a.yq1 j;
    public final a.yq1 j0;
    public final a.yq1 k;
    public final a.yq1 k0;
    public final a.yq1 l;
    public final a.yq1 l0;
    public final a.yq1 m;
    public final a.yq1 m0;
    public final a.yq1 n;
    public final a.yq1 n0;
    public final a.yq1 o;
    public final a.yq1 o0;
    public final a.yq1 p;
    public final a.yq1 p0;
    public final a.yq1 q;
    public final a.yq1 q0;
    public final a.yq1 r;
    public final a.yq1 r0;
    public final a.yq1 s;
    public final a.yq1 s0;
    public final a.yq1 t;
    public final a.yq1 t0;
    public final a.yq1 u;
    public final a.yq1 u0;
    public final a.yq1 v;
    public final a.yq1 v0;
    public final a.yq1 w;
    public final a.yq1 w0;
    public final a.yq1 x;
    public final a.yq1 x0;
    public final a.yq1 y;
    public final a.yq1 y0;
    public final a.yq1 z;
    public final a.yq1 z0;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "layout_app_bar", "getLayout_app_bar()Landroid/view/View;");
        a.na1.f375a.getClass();
        I0 = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "module_filter", "getModule_filter()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "module_compare", "getModule_compare()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "module_share", "getModule_share()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "module_export", "getModule_export()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "session_detail", "getSession_detail()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "fps_warning_container", "getFps_warning_container()Lcom/omarea/ui/BlurView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "fps_warning", "getFps_warning()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_info", "getChart_info()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_platform", "getChart_platform()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_phone", "getChart_phone()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_os", "getChart_os()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_mode", "getChart_mode()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "fps_remark_hint", "getFps_remark_hint()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "session_logo", "getSession_logo()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_session_time", "getChart_session_time()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_session_name", "getChart_session_name()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_view_size", "getChart_view_size()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_fps_overview", "getChart_fps_overview()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_fps_max", "getChart_fps_max()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_fps_min", "getChart_fps_min()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_fps_avg", "getChart_fps_avg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_fps_cv", "getChart_fps_cv()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_other_overview", "getChart_other_overview()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_low_fps", "getChart_low_fps()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_soc_temp", "getChart_soc_temp()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_temp_max", "getChart_temp_max()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_power_avg", "getChart_power_avg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension", "getChart_dimension()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_right", "getChart_right()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_right_icon", "getChart_right_icon()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_session", "getChart_session()Lcom/omarea/ui/fps/FpsDataView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_jank", "getChart_jank()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension_jank", "getChart_dimension_jank()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_jank_view", "getChart_jank_view()Lcom/omarea/ui/fps/FpsJankView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "jank", "getJank()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "big_jank", "getBig_jank()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_ftime", "getChart_ftime()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension_ftime", "getChart_dimension_ftime()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_ftime_view", "getChart_ftime_view()Lcom/omarea/ui/fps/FrameTimeView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "ftime_max", "getFtime_max()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_2", "getChart_2()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension2", "getChart_dimension2()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_load_stat", "getCpu_load_stat()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_core_options", "getCpu_core_options()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_loads", "getChart_cpu_loads()Lcom/omarea/ui/fps/CpuLoadsView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_loads_legend", "getChart_cpu_loads_legend()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_3", "getChart_3()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension3", "getChart_dimension3()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_freq_stat", "getCpu_freq_stat()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_core_options4", "getCpu_core_options4()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_stat_switch", "getCpu_stat_switch()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_frequencies", "getChart_cpu_frequencies()Lcom/omarea/ui/fps/CpuFrequencyView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_frequencies_stat", "getChart_cpu_frequencies_stat()Lcom/omarea/ui/fps/CpuFrequencyStat;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_frequencies_legend", "getChart_cpu_frequencies_legend()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cycles", "getChart_cycles()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension_cycles", "getChart_dimension_cycles()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_cycles_stat", "getCpu_cycles_stat()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_cycles", "getChart_cpu_cycles()Lcom/omarea/ui/fps/CpuCyclesView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_cycles_legend", "getChart_cpu_cycles_legend()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_gpu", "getChart_gpu()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension4", "getChart_dimension4()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "gpu_freq_stat", "getGpu_freq_stat()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "gpu_usage_stat", "getGpu_usage_stat()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_gpu_frequency", "getChart_gpu_frequency()Lcom/omarea/ui/fps/GpuLoadView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_ddr", "getChart_ddr()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension_ddr", "getChart_dimension_ddr()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "ddr_freq_stat", "getDdr_freq_stat()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_ddr_frequency", "getChart_ddr_frequency()Lcom/omarea/ui/fps/DDRView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_power", "getChart_power()Landroid/widget/FrameLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_power_mA", "getChart_power_mA()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension5", "getChart_dimension5()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_toggle_w_text", "getChart_toggle_w_text()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_toggle_w", "getChart_toggle_w()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_battery_io", "getChart_battery_io()Lcom/omarea/ui/fps/BatteryIOView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_battery_legend", "getChart_battery_legend()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "battery_io_max", "getBattery_io_max()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "battery_io_min", "getBattery_io_min()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "battery_io_avg", "getBattery_io_avg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_power_watt", "getChart_power_watt()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension5_2", "getChart_dimension5_2()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_toggle_ma_text", "getChart_toggle_ma_text()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_toggle_ma", "getChart_toggle_ma()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_power_w", "getChart_power_w()Lcom/omarea/ui/fps/PowerView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_power_legend", "getChart_power_legend()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "power_max", "getPower_max()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "power_min", "getPower_min()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "power_avg", "getPower_avg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_t", "getChart_cpu_t()Lcom/omarea/ui/BlurViewRelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_dimension6", "getChart_dimension6()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "chart_cpu_temperature", "getChart_cpu_temperature()Lcom/omarea/ui/fps/CpuTemperatureView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_temperature_max", "getCpu_temperature_max()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_temperature_min", "getCpu_temperature_min()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "cpu_temperature_avg", "getCpu_temperature_avg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "session_perf_stall", "getSession_perf_stall()Lcom/omarea/ui/fps/PerfStallDimensionList;"), new a.d81(com.omarea.vtools.activities.ActivityFpsSession.class, "session_threads", "getSession_threads()Lcom/omarea/ui/BlurViewLinearLayout;")};
    }

    public ActivityFpsSession() {
        a.b20.i(this, 2131362729);
        this.d = a.b20.i(this, 2131362821);
        this.e = a.b20.i(this, 2131362811);
        this.f = a.b20.i(this, 2131362829);
        this.g = a.b20.i(this, 2131362820);
        this.h = a.b20.i(this, 2131363084);
        this.i = a.b20.i(this, 2131362517);
        this.j = a.b20.i(this, 2131362516);
        this.k = a.b20.i(this, 2131362182);
        this.l = a.b20.i(this, 2131362192);
        this.m = a.b20.i(this, 2131362191);
        this.n = a.b20.i(this, 2131362189);
        this.o = a.b20.i(this, 2131362188);
        this.p = a.b20.i(this, 2131362515);
        this.q = a.b20.i(this, 2131362202);
        this.r = a.b20.i(this, 2131362204);
        this.s = a.b20.i(this, 2131362203);
        this.t = a.b20.i(this, 2131362215);
        a.b20.i(this, 2131362177);
        this.u = a.b20.i(this, 2131362175);
        this.v = a.b20.i(this, 2131362176);
        this.w = a.b20.i(this, 2131362173);
        this.x = a.b20.i(this, 2131362174);
        a.b20.i(this, 2131362190);
        this.y = a.b20.i(this, 2131362187);
        this.z = a.b20.i(this, 2131362207);
        this.A = a.b20.i(this, 2131362208);
        this.B = a.b20.i(this, 2131362194);
        a.b20.i(this, 2131362159);
        this.C = a.b20.i(this, 2131362199);
        this.D = a.b20.i(this, 2131362200);
        this.E = a.b20.i(this, 2131362201);
        this.F = a.b20.i(this, 2131362183);
        a.b20.i(this, 2131362172);
        this.G = a.b20.i(this, 2131362184);
        this.H = a.b20.i(this, 2131362673);
        this.I = a.b20.i(this, 2131362081);
        this.J = a.b20.i(this, 2131362178);
        a.b20.i(this, 2131362170);
        this.K = a.b20.i(this, 2131362179);
        this.L = a.b20.i(this, 2131362531);
        a.b20.i(this, 2131362137);
        a.b20.i(this, 2131362160);
        this.M = a.b20.i(this, 2131362296);
        this.N = a.b20.i(this, 2131362288);
        this.O = a.b20.i(this, 2131362149);
        this.P = a.b20.i(this, 2131362150);
        a.b20.i(this, 2131362138);
        a.b20.i(this, 2131362161);
        this.Q = a.b20.i(this, 2131362295);
        this.R = a.b20.i(this, 2131362289);
        this.S = a.b20.i(this, 2131362307);
        this.T = a.b20.i(this, 2131362146);
        this.U = a.b20.i(this, 2131362148);
        this.V = a.b20.i(this, 2131362147);
        this.W = a.b20.i(this, 2131362153);
        a.b20.i(this, 2131362168);
        this.X = a.b20.i(this, 2131362294);
        this.Y = a.b20.i(this, 2131362144);
        this.Z = a.b20.i(this, 2131362145);
        this.a0 = a.b20.i(this, 2131362180);
        a.b20.i(this, 2131362162);
        this.b0 = a.b20.i(this, 2131362587);
        this.c0 = a.b20.i(this, 2131362595);
        this.d0 = a.b20.i(this, 2131362181);
        this.e0 = a.b20.i(this, 2131362155);
        a.b20.i(this, 2131362169);
        this.f0 = a.b20.i(this, 2131362345);
        this.g0 = a.b20.i(this, 2131362156);
        this.h0 = a.b20.i(this, 2131362193);
        this.i0 = a.b20.i(this, 2131362196);
        a.b20.i(this, 2131362163);
        this.j0 = a.b20.i(this, 2131362213);
        this.k0 = a.b20.i(this, 2131362212);
        this.l0 = a.b20.i(this, 2131362142);
        a.b20.i(this, 2131362143);
        this.m0 = a.b20.i(this, 2131362065);
        this.n0 = a.b20.i(this, 2131362066);
        this.o0 = a.b20.i(this, 2131362064);
        this.p0 = a.b20.i(this, 2131362198);
        a.b20.i(this, 2131362164);
        this.q0 = a.b20.i(this, 2131362211);
        this.r0 = a.b20.i(this, 2131362210);
        this.s0 = a.b20.i(this, 2131362197);
        a.b20.i(this, 2131362195);
        this.t0 = a.b20.i(this, 2131362979);
        this.u0 = a.b20.i(this, 2131362980);
        this.v0 = a.b20.i(this, 2131362975);
        this.w0 = a.b20.i(this, 2131362151);
        a.b20.i(this, 2131362165);
        this.x0 = a.b20.i(this, 2131362152);
        this.y0 = a.b20.i(this, 2131362312);
        this.z0 = a.b20.i(this, 2131362313);
        this.A0 = a.b20.i(this, 2131362311);
        this.B0 = a.b20.i(this, 2131363085);
        this.C0 = a.b20.i(this, 2131363086);
        a.cp cpVar = com.omarea.Scene.c;
        this.D0 = new a.r51(a.fs1.t());
        this.E0 = "";
        this.H0 = new a.eu();
    }

    public static final void o(final com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, final long j) {
        activityFpsSession.getClass();
        a.t8 t8Var = new a.t8(activityFpsSession, 4);
        a.gu0[] gu0VarArr = I0;
        ((android.widget.ImageView) activityFpsSession.D.a(gu0VarArr[30])).setOnClickListener(t8Var);
        ((android.widget.ImageView) activityFpsSession.N.a(gu0VarArr[44])).setOnClickListener(new a.t8(activityFpsSession, 5));
        final int i = 0;
        ((android.widget.ImageView) activityFpsSession.M.a(gu0VarArr[43])).setOnClickListener(new a.v8(activityFpsSession));
        ((android.widget.ImageView) activityFpsSession.R.a(gu0VarArr[50])).setOnClickListener(new a.t8(activityFpsSession, 6));
        ((android.widget.ImageView) activityFpsSession.S.a(gu0VarArr[51])).setOnClickListener(new a.t8(activityFpsSession, 7));
        int i2 = 1;
        ((android.widget.ImageView) activityFpsSession.Q.a(gu0VarArr[49])).setOnClickListener(new a.v8(activityFpsSession));
        a.gu0 gu0Var = gu0VarArr[46];
        a.yq1 yq1Var = activityFpsSession.P;
        android.widget.TextView textView = (android.widget.TextView) yq1Var.a(gu0Var);
        android.text.SpannableString spannableString = new android.text.SpannableString("■ Total  ");
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(activityFpsSession.t().getMainColor()), 0, spannableString.length(), 33);
        textView.append(spannableString);
        com.omarea.ui.fps.CpuLoadsView t = activityFpsSession.t();
        java.util.ArrayList<java.lang.Integer> colors = t.getColors();
        java.util.ArrayList<java.lang.String[]> clusters = t.getClusters();
        a.wv.v(clusters, "clusters");
        java.util.Iterator it = clusters.iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            a.yq1 yq1Var2 = activityFpsSession.Z;
            java.lang.String str = "■ CPU ";
            if (!hasNext) {
                android.widget.TextView textView2 = (android.widget.TextView) yq1Var2.a(gu0VarArr[59]);
                android.text.SpannableString spannableString2 = new android.text.SpannableString("  ■ TEMP(℃)");
                spannableString2.setSpan(new android.text.style.ForegroundColorSpan(activityFpsSession.t().getMainColor()), 0, spannableString2.length(), 33);
                textView2.append(spannableString2);
                final int i4 = 2;
                ((android.widget.ImageView) activityFpsSession.X.a(gu0VarArr[57])).setOnClickListener(new a.v8(activityFpsSession));
                com.omarea.ui.fps.CpuFrequencyView r = activityFpsSession.r();
                java.util.ArrayList<java.lang.Integer> colors2 = r.getColors();
                java.util.ArrayList<java.lang.String[]> clusters2 = r.getClusters();
                a.wv.v(clusters2, "clusters");
                int i5 = 0;
                for (java.lang.Object obj : clusters2) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    java.lang.String[] strArr = (java.lang.String[]) obj;
                    java.lang.String str2 = strArr.length > 1 ? str + a.op.N1(strArr) + "~" + a.op.Q1(strArr) + "  " : str + a.op.N1(strArr) + "  ";
                    android.widget.TextView textView3 = (android.widget.TextView) activityFpsSession.V.a(gu0VarArr[54]);
                    android.text.SpannableString spannableString3 = new android.text.SpannableString(str2);
                    java.lang.Integer num = colors2.get(i5);
                    a.wv.v(num, "colors.get(cIndex)");
                    spannableString3.setSpan(new android.text.style.ForegroundColorSpan(num.intValue()), 0, spannableString3.length(), 33);
                    textView3.append(spannableString3);
                    i5 = i6;
                    str = str;
                }
                ((android.widget.EditText) activityFpsSession.p.a(gu0VarArr[13])).addTextChangedListener(new a.yf1(3, new a.a9(activityFpsSession, j)));
                return;
            }
            java.lang.Object next = it.next();
            int i7 = i3 + 1;
            if (i3 < 0) {
                a.b20.p1();
                throw null;
            }
            java.lang.String[] strArr2 = (java.lang.String[]) next;
            java.util.Iterator it2 = it;
            java.lang.String str3 = strArr2.length > i2 ? "■ CPU " + a.op.N1(strArr2) + "~" + a.op.Q1(strArr2) + "  " : "■ CPU " + a.op.N1(strArr2) + "  ";
            android.widget.TextView textView4 = (android.widget.TextView) yq1Var.a(gu0VarArr[46]);
            android.text.SpannableString spannableString4 = new android.text.SpannableString(str3);
            java.lang.Integer num2 = colors.get(i3);
            a.wv.v(num2, "colors.get(cIndex)");
            a.yq1 yq1Var3 = yq1Var;
            spannableString4.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, spannableString4.length(), 33);
            textView4.append(spannableString4);
            android.widget.TextView textView5 = (android.widget.TextView) yq1Var2.a(gu0VarArr[59]);
            android.text.SpannableString spannableString5 = new android.text.SpannableString(str3);
            java.lang.Integer num3 = colors.get(i3);
            a.wv.v(num3, "colors.get(cIndex)");
            spannableString5.setSpan(new android.text.style.ForegroundColorSpan(num3.intValue()), 0, spannableString5.length(), 33);
            textView5.append(spannableString5);
            i3 = i7;
            it = it2;
            yq1Var = yq1Var3;
            i2 = 1;
        }
    }

    @Override // a.p5, a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        autoLayout(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x06d1, code lost:
    
        if (a.wv.e(r3, "") != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06fb  */
    /* JADX WARN: Type inference failed for: r10v8, types: [a.fp0, a.lj1] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 2016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFpsSession.onCreate(android.os.Bundle):void");
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity, a.k6
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        a.wv.w(strArr, "permissions");
        a.wv.w(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 17) {
            a.qo0 qo0Var = this.G0;
            this.G0 = null;
            java.lang.Integer valueOf = iArr.length != 0 ? java.lang.Integer.valueOf(iArr[0]) : null;
            if (valueOf == null || valueOf.intValue() != 0 || qo0Var == null) {
                return;
            }
            qo0Var.b();
        }
    }

    public final void p(java.lang.StringBuilder sb) {
        android.widget.TextView textView = (android.widget.TextView) this.j.a(I0[7]);
        textView.post(new a.ua0(textView, sb, this, 17));
    }

    public final void q(a.qo0 qo0Var) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            qo0Var.b();
            return;
        }
        if (a.zx.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            qo0Var.b();
            return;
        }
        this.G0 = qo0Var;
        requestPermissions(new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 17);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = getString(2131952777);
        a.wv.v(string, "getString(R.string.kr_write_external_storage)");
        a.fs1.X(string, 0);
    }

    public final com.omarea.ui.fps.CpuFrequencyView r() {
        return (com.omarea.ui.fps.CpuFrequencyView) this.T.a(I0[52]);
    }

    public final com.omarea.ui.fps.CpuFrequencyStat s() {
        return (com.omarea.ui.fps.CpuFrequencyStat) this.U.a(I0[53]);
    }

    public final com.omarea.ui.fps.CpuLoadsView t() {
        return (com.omarea.ui.fps.CpuLoadsView) this.O.a(I0[45]);
    }

    public final com.omarea.ui.BlurViewRelativeLayout u() {
        return (com.omarea.ui.BlurViewRelativeLayout) this.i0.a(I0[70]);
    }

    public final com.omarea.ui.BlurViewRelativeLayout v() {
        return (com.omarea.ui.BlurViewRelativeLayout) this.p0.a(I0[79]);
    }

    public final com.omarea.ui.fps.FpsDataView w() {
        return (com.omarea.ui.fps.FpsDataView) this.E.a(I0[31]);
    }

    public final android.widget.TextView x() {
        return (android.widget.TextView) this.s.a(I0[16]);
    }

    public final android.widget.LinearLayout y() {
        return (android.widget.LinearLayout) this.h.a(I0[5]);
    }

    public final java.lang.String z(long j) {
        a.r51 r51Var = this.D0;
        com.omarea.model.FpsWatchSession l = r51Var.l(j);
        java.lang.String str = l != null ? l.cloudId : null;
        if (str == null || str.length() == 0) {
            a.y31 o = new a.oe1().o(r51Var.b(j));
            if (o == null) {
                return null;
            }
            r51Var.K(j, (java.lang.String) o.c);
            return (java.lang.String) o.d;
        }
        a.oe1 oe1Var = new a.oe1();
        try {
            java.lang.String concat = a.tg1.i().concat("/pvp/user-report-url");
            a.ne1 ne1Var = new a.ne1(str, 1);
            a.lt0 lt0Var = new a.lt0();
            ne1Var.i(lt0Var);
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "id: String): String? {\n …\n            }.toString()");
            return oe1Var.k(concat, lt0Var2);
        } catch (java.lang.Exception e) {
            e.getMessage();
            return null;
        }
    }
}
