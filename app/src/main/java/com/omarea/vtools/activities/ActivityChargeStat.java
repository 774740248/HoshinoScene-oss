package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityChargeStat extends a.p5 {
    public static final /* synthetic */ a.gu0[] v;
    public final a.yq1 d = a.b20.i(this, 2131362133);
    public final a.yq1 e = a.b20.i(this, 2131362136);
    public final a.yq1 f = a.b20.i(this, 2131362457);
    public final a.yq1 g = a.b20.i(this, 2131362850);
    public final a.yq1 h = a.b20.i(this, 2131362981);
    public final a.yq1 i = a.b20.i(this, 2131362982);
    public final a.yq1 j = a.b20.i(this, 2131363351);
    public final a.yq1 k = a.b20.i(this, 2131363352);
    public final a.yq1 l = a.b20.i(this, 2131363353);
    public final a.yq1 m = a.b20.i(this, 2131363354);
    public final a.yq1 n = a.b20.i(this, 2131361914);
    public final a.yq1 o = a.b20.i(this, 2131361921);
    public final a.au p = a.au.e();
    public boolean q = true;
    public int r = a.wt.g;
    public final a.mr s = new a.mr();
    public final a.gy t = new a.gy();
    public java.util.Timer u;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "charge_controller", "getCharge_controller()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        v = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "charge_sum", "getCharge_sum()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "electricity_adj_unit", "getElectricity_adj_unit()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "more_battery_stats", "getMore_battery_stats()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "power_mode", "getPower_mode()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "power_mode_title", "getPower_mode_title()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "view_realtime_values", "getView_realtime_values()Lcom/omarea/ui/BatteryRealtimeStatus;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "view_speed", "getView_speed()Lcom/omarea/ui/charge/ChargeCurveView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "view_temperature", "getView_temperature()Lcom/omarea/ui/charge/ChargeTempView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "view_time", "getView_time()Lcom/omarea/ui/charge/ChargeTimeView;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "action_delete", "getAction_delete()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityChargeStat.class, "action_history", "getAction_history()Landroid/widget/ImageButton;")};
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityChargeStat.o():void");
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558443);
        setBackArrow();
        a.gu0[] gu0VarArr = v;
        ((android.widget.TextView) this.f.a(gu0VarArr[2])).setOnClickListener(new a.z5(this, 0));
        ((android.widget.TextView) this.g.a(gu0VarArr[3])).setOnClickListener(new a.z5(this, 1));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.b6(this, null), 3);
        ((android.widget.ImageView) this.h.a(gu0VarArr[4])).setOnClickListener(new a.z5(this, 2));
        ((android.widget.ImageButton) this.n.a(gu0VarArr[10])).setOnClickListener(new a.z5(this, 3));
        ((android.widget.ImageButton) this.o.a(gu0VarArr[11])).setOnClickListener(new a.z5(this, 4));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        java.util.Timer timer = this.u;
        if (timer != null) {
            timer.cancel();
        }
        this.u = null;
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952892));
        java.util.Timer timer = new java.util.Timer("ActivityChargeTimer");
        timer.schedule(new a.hr(2, this), 40L, 2000L);
        this.u = timer;
    }
}
