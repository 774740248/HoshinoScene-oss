package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityChargeControl extends a.p5 {
    public static final /* synthetic */ a.gu0[] L;
    public java.util.Timer F;
    public android.content.SharedPreferences H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final a.yq1 d = a.b20.i(this, 2131362053);
    public final a.yq1 e = a.b20.i(this, 2131362058);
    public final a.yq1 f = a.b20.i(this, 2131362060);
    public final a.yq1 g = a.b20.i(this, 2131362061);
    public final a.yq1 h = a.b20.i(this, 2131362062);
    public final a.yq1 i = a.b20.i(this, 2131362063);
    public final a.yq1 j = a.b20.i(this, 2131362067);
    public final a.yq1 k = a.b20.i(this, 2131362070);
    public final a.yq1 l = a.b20.i(this, 2131362074);
    public final a.yq1 m = a.b20.i(this, 2131362075);
    public final a.yq1 n = a.b20.i(this, 2131362076);
    public final a.yq1 o = a.b20.i(this, 2131362092);
    public final a.yq1 p = a.b20.i(this, 2131362093);
    public final a.yq1 q = a.b20.i(this, 2131362094);
    public final a.yq1 r = a.b20.i(this, 2131363089);
    public final a.yq1 s = a.b20.i(this, 2131363090);
    public final a.yq1 t = a.b20.i(this, 2131363091);
    public final a.yq1 u = a.b20.i(this, 2131363103);
    public final a.yq1 v = a.b20.i(this, 2131363104);
    public final a.yq1 w = a.b20.i(this, 2131363105);
    public final a.yq1 x = a.b20.i(this, 2131363106);
    public final a.yq1 y = a.b20.i(this, 2131363107);
    public final a.yq1 z = a.b20.i(this, 2131363108);
    public final a.yq1 A = a.b20.i(this, 2131363109);
    public final a.yq1 B = a.b20.i(this, 2131363110);
    public final a.yq1 C = a.b20.i(this, 2131363115);
    public final a.yq1 D = a.b20.i(this, 2131363116);
    public final a.yq1 E = a.b20.i(this, 2131363351);
    public final a.mr G = new a.mr();

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_bp_level_desc", "getBattery_bp_level_desc()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        L = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_charge_speed_ext", "getBattery_charge_speed_ext()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_forgery", "getBattery_forgery()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_forgery_full_now", "getBattery_forgery_full_now()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_forgery_ratio", "getBattery_forgery_ratio()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_get_up", "getBattery_get_up()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_night_mode", "getBattery_night_mode()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_sleep", "getBattery_sleep()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_uevent", "getBattery_uevent()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_usb", "getBattery_usb()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "battery_usb_uevent", "getBattery_usb_uevent()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "bp_cardview", "getBp_cardview()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "bp_disable_charge", "getBp_disable_charge()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "bp_enable_charge", "getBp_enable_charge()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_bp", "getSettings_bp()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_bp_level", "getSettings_bp_level()Landroid/widget/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_cdp_disable", "getSettings_cdp_disable()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_pd", "getSettings_pd()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_pd_state", "getSettings_pd_state()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_pd_support", "getSettings_pd_support()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_qc", "getSettings_qc()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_qc_limit", "getSettings_qc_limit()Landroid/widget/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_qc_limit_current", "getSettings_qc_limit_current()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_qc_limit_desc", "getSettings_qc_limit_desc()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_qc_panel", "getSettings_qc_panel()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_step_charge", "getSettings_step_charge()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "settings_step_charge_enabled", "getSettings_step_charge_enabled()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityChargeControl.class, "view_realtime_values", "getView_realtime_values()Lcom/omarea/ui/BatteryRealtimeStatus;")};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.fp0, a.lj1] */
    public static void r() {
        int P;
        a.ty tyVar = a.z80.b;
        a.fp0 lj1Var = new a.lj1(2, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, lj1Var) : new a.f(W, true);
        av0Var.S(i2, av0Var, lj1Var);
        do {
            P = av0Var.P(av0Var.C());
            if (P == 0) {
                return;
            }
        } while (P != 1);
    }

    public final android.widget.Switch o() {
        return (android.widget.Switch) this.x.a(L[20]);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0342  */
    /* JADX WARN: Type inference failed for: r12v1, types: [a.r5] */
    /* JADX WARN: Type inference failed for: r9v2, types: [a.r5] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityChargeControl.onCreate(android.os.Bundle):void");
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
        java.util.Timer timer = this.F;
        if (timer != null) {
            a.wv.s(timer);
            timer.cancel();
            this.F = null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, a.ma1] */
    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952893));
        android.widget.Switch o = o();
        android.content.SharedPreferences sharedPreferences = this.H;
        if (sharedPreferences == null) {
            a.wv.M1("spf");
            throw null;
        }
        o.setChecked(sharedPreferences.getBoolean("qc_booster", false));
        a.gu0[] gu0VarArr = L;
        android.widget.Switch r0 = (android.widget.Switch) this.r.a(gu0VarArr[14]);
        android.content.SharedPreferences sharedPreferences2 = this.H;
        if (sharedPreferences2 == null) {
            a.wv.M1("spf");
            throw null;
        }
        r0.setChecked(sharedPreferences2.getBoolean("bp", false));
        android.widget.Switch r02 = (android.widget.Switch) this.t.a(gu0VarArr[16]);
        android.content.SharedPreferences sharedPreferences3 = this.H;
        if (sharedPreferences3 == null) {
            a.wv.M1("spf");
            throw null;
        }
        r02.setChecked(sharedPreferences3.getBoolean("cdp_disable", false));
        android.content.SharedPreferences sharedPreferences4 = this.H;
        if (sharedPreferences4 == null) {
            a.wv.M1("spf");
            throw null;
        }
        int i = sharedPreferences4.getInt("bp_level", 90);
        ((android.widget.SeekBar) this.s.a(gu0VarArr[15])).setProgress(i - 30);
        a.gu0 gu0Var = gu0VarArr[0];
        a.yq1 yq1Var = this.d;
        android.widget.TextView textView = (android.widget.TextView) yq1Var.a(gu0Var);
        java.lang.String string = ((android.widget.TextView) yq1Var.a(gu0VarArr[0])).getContext().getString(2131952019);
        a.wv.v(string, "battery_bp_level_desc.co…string.battery_bp_status)");
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i - 20)}, 2, string, "format(format, *args)", textView);
        android.widget.SeekBar p = p();
        android.content.SharedPreferences sharedPreferences5 = this.H;
        if (sharedPreferences5 == null) {
            a.wv.M1("spf");
            throw null;
        }
        p.setProgress(sharedPreferences5.getInt("charge_limit_ma", 3000) / 100);
        android.widget.EditText editText = (android.widget.EditText) this.A.a(gu0VarArr[23]);
        android.content.SharedPreferences sharedPreferences6 = this.H;
        if (sharedPreferences6 == null) {
            a.wv.M1("spf");
            throw null;
        }
        editText.setText(sharedPreferences6.getInt("charge_limit_ma", 3000) + "mA");
        a.gy.q(this);
        a.ma1 obj = new a.ma1();
        obj.c = "";
        java.lang.Object obj2 = new a.ma1();
        java.lang.Object obj3 = new a.ma1();
        java.util.Timer timer = new java.util.Timer("ActivityChargeController");
        timer.schedule(new a.x5(this, obj, obj2, obj3, 0), 0L, 3000L);
        this.F = timer;
        s();
    }

    public final android.widget.SeekBar p() {
        return (android.widget.SeekBar) this.y.a(L[21]);
    }

    public final java.lang.String q(int i) {
        java.lang.String string = getString(2131952031);
        a.wv.v(string, "getString(R.string.battery_night_mode_time)");
        return a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(i / 60), java.lang.Integer.valueOf(i % 60)}, 2, string, "format(format, *args)");
    }

    public final void s() {
        this.G.getClass();
        int b = a.mr.b();
        int c = a.mr.c();
        a.yq1 yq1Var = this.h;
        a.gu0[] gu0VarArr = L;
        if (b > 0) {
            ((android.widget.TextView) yq1Var.a(gu0VarArr[4])).setText(b + "%");
            ((android.widget.TextView) yq1Var.a(gu0VarArr[4])).setOnClickListener(new a.q5(this, 10));
        } else {
            ((android.widget.TextView) yq1Var.a(gu0VarArr[4])).setOnClickListener(new a.q5(this, 11));
        }
        a.yq1 yq1Var2 = this.g;
        if (c > 0) {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[3])).setText(c + "mAh");
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[3])).setOnClickListener(new a.q5(this, 12));
        } else {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[3])).setOnClickListener(new a.q5(this, 13));
        }
        a.yq1 yq1Var3 = this.f;
        if (b >= 1 || c >= 1) {
            ((com.omarea.ui.BlurViewLinearLayout) yq1Var3.a(gu0VarArr[2])).setVisibility(0);
        } else {
            ((com.omarea.ui.BlurViewLinearLayout) yq1Var3.a(gu0VarArr[2])).setVisibility(8);
        }
    }
}
