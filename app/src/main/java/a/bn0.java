package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bn0 extends a.gk0 {
    public static final /* synthetic */ a.gu0[] x0;
    public final a.yq1 W = a.b20.h(2131362247, this);
    public final a.yq1 X = a.b20.h(2131362248, this);
    public final a.yq1 Y = a.b20.h(2131362330, this);
    public final a.yq1 Z = a.b20.h(2131362331, this);
    public final a.yq1 a0 = a.b20.h(2131362332, this);
    public final a.yq1 b0 = a.b20.h(2131362334, this);
    public final a.yq1 c0 = a.b20.h(2131362335, this);
    public final a.yq1 d0 = a.b20.h(2131362336, this);
    public final a.yq1 e0 = a.b20.h(2131362337, this);
    public final a.yq1 f0 = a.b20.h(2131362441, this);
    public final a.yq1 g0 = a.b20.h(2131362442, this);
    public final a.yq1 h0 = a.b20.h(2131362471, this);
    public final a.yq1 i0 = a.b20.h(2131362472, this);
    public final a.yq1 j0 = a.b20.h(2131362500, this);
    public final a.yq1 k0 = a.b20.h(2131362499, this);
    public final a.yq1 l0 = a.b20.h(2131362883, this);
    public final a.yq1 m0 = a.b20.h(2131362893, this);
    public final a.yq1 n0 = a.b20.h(2131362899, this);
    public final a.yq1 o0 = a.b20.h(2131362906, this);
    public final a.yq1 p0 = a.b20.h(2131362909, this);
    public final a.yq1 q0 = a.b20.h(2131362912, this);
    public final a.yq1 r0 = a.b20.h(2131362964, this);
    public final a.yq1 s0 = a.b20.h(2131362965, this);
    public java.lang.String t0 = "";
    public final a.b11 u0 = new a.b11();
    public final android.content.SharedPreferences v0;
    public final a.u71 w0;

    static {
        a.d81 d81Var = new a.d81(a.bn0.class, "config_author", "getConfig_author()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        x0 = new a.gu0[]{d81Var, new a.d81(a.bn0.class, "config_author_icon", "getConfig_author_icon()Landroid/widget/ImageButton;"), new a.d81(a.bn0.class, "custom_balance", "getCustom_balance()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "custom_fast", "getCustom_fast()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "custom_features", "getCustom_features()Landroid/widget/ImageButton;"), new a.d81(a.bn0.class, "custom_modes", "getCustom_modes()Landroid/widget/LinearLayout;"), new a.d81(a.bn0.class, "custom_performance", "getCustom_performance()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "custom_powersave", "getCustom_powersave()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "custom_state", "getCustom_state()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "dynamic_control", "getDynamic_control()Landroid/widget/Switch;"), new a.d81(a.bn0.class, "dynamic_control_opts", "getDynamic_control_opts()Landroid/widget/LinearLayout;"), new a.d81(a.bn0.class, "extreme_performance", "getExtreme_performance()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.bn0.class, "extreme_performance_on", "getExtreme_performance_on()Landroid/widget/Switch;"), new a.d81(a.bn0.class, "first_mode_view", "getFirst_mode_view()Landroid/widget/LinearLayout;"), new a.d81(a.bn0.class, "first_mode", "getFirst_mode()Lcom/omarea/ui/SelectView;"), new a.d81(a.bn0.class, "nav_app_scene", "getNav_app_scene()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.bn0.class, "nav_freeze", "getNav_freeze()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "nav_more", "getNav_more()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.bn0.class, "nav_scene_service_not_active", "getNav_scene_service_not_active()Landroid/view/View;"), new a.d81(a.bn0.class, "nav_skip_ad", "getNav_skip_ad()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(a.bn0.class, "nav_thermal", "getNav_thermal()Landroid/widget/TextView;"), new a.d81(a.bn0.class, "pedestal_mode", "getPedestal_mode()Landroid/widget/Switch;"), new a.d81(a.bn0.class, "pedestal_mode_view", "getPedestal_mode_view()Landroid/widget/LinearLayout;")};
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [a.b11, java.lang.Object] */
    public bn0() {
        a.cp cpVar = com.omarea.Scene.c;
        this.v0 = a.fs1.t().getSharedPreferences("powercfg", 0);
        this.w0 = new a.u71();
    }

    public static final java.lang.Object S(a.bn0 bn0Var, a.ey eyVar) {
        java.lang.Object C;
        bn0Var.getClass();
        C = a.q10.f457a.C("", "", "stop", "manual", "", false, false, eyVar);
        return C == a.dz.c ? C : a.no1.f387a;
    }

    public static /* synthetic */ void a0(a.bn0 bn0Var, java.lang.String str, int i) {
        if ((i & 1) != 0) {
            str = "normal";
        }
        bn0Var.Z(str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a7, code lost:
    
        if (r4 == null) goto L12;
     */
    @Override // a.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bn0.C(android.view.View, android.os.Bundle):void");
    }

    public final void T(java.lang.Runnable runnable) {
        if (!a.tg1.p()) {
            runnable.run();
            return;
        }
        int i = a.x60.f681a;
        a.kk0 K = K();
        java.lang.String m = m(2131952862);
        a.wv.v(m, "getString(R.string.make_choice)");
        java.lang.String m2 = m(2131953429);
        a.wv.v(m2, "getString(R.string.schedule_remove_outside)");
        a.fs1.Z(K, m, m2, new a.xa(this, 20, runnable), null, 16);
    }

    public final android.widget.ImageButton U() {
        return (android.widget.ImageButton) this.a0.a(x0[4]);
    }

    public final android.widget.LinearLayout V() {
        return (android.widget.LinearLayout) this.b0.a(x0[5]);
    }

    public final android.widget.TextView W() {
        return (android.widget.TextView) this.e0.a(x0[8]);
    }

    public final android.widget.Switch X() {
        return (android.widget.Switch) this.f0.a(x0[9]);
    }

    public final android.widget.TextView Y() {
        return (android.widget.TextView) this.q0.a(x0[20]);
    }

    public final void Z(java.lang.String str, boolean z) {
        android.content.Context applicationContext = L().getApplicationContext();
        a.wv.v(applicationContext, "this.requireContext().applicationContext");
        a.re1 re1Var = new a.re1(applicationContext);
        a.cp cpVar = com.omarea.Scene.c;
        a.wv.M0(a.wv.b(a.z80.b), null, new a.um0(re1Var, str, z, !a.wv.e(a.fs1.E("CLOUD_PROFILE_BRANCH", "normal"), str), this, null), 3);
    }

    public final void b0(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(f(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityCpuControl.class);
        intent.putExtra("cpuModeName", str);
        R(intent);
    }

    public final void c0(java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            R(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0187, code lost:
    
        if (r4.equals("FAS_RS") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x018e, code lost:
    
        if (r4.equals("SOURCE_OUTSIDE") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0161, code lost:
    
        if (r11.length() != 0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0() {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bn0.d0():void");
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        return layoutInflater.inflate(2131558568, viewGroup, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (a.wv.e(a.fs1.E("machine", r1), r1) == false) goto L24;
     */
    @Override // a.gk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bn0.y():void");
    }
}
