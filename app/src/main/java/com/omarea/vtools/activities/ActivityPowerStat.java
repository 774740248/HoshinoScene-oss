package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityPowerStat extends a.p5 {
    public static final /* synthetic */ a.gu0[] D;
    public int A;
    public final a.mr B;
    public final a.gy C;
    public final a.yq1 d = a.b20.i(this, 2131362044);
    public final a.yq1 e = a.b20.i(this, 2131362054);
    public final a.yq1 f = a.b20.i(this, 2131362069);
    public final a.yq1 g = a.b20.i(this, 2131362071);
    public final a.yq1 h = a.b20.i(this, 2131362072);
    public final a.yq1 i = a.b20.i(this, 2131362073);
    public final a.yq1 j = a.b20.i(this, 2131362077);
    public final a.yq1 k = a.b20.i(this, 2131362133);
    public final a.yq1 l = a.b20.i(this, 2131362457);
    public final a.yq1 m = a.b20.i(this, 2131362851);
    public final a.yq1 n = a.b20.i(this, 2131362906);
    public final a.yq1 o = a.b20.i(this, 2131362986);
    public final a.yq1 p = a.b20.i(this, 2131363035);
    public final a.yq1 q = a.b20.i(this, 2131363158);
    public final a.yq1 r = a.b20.i(this, 2131362598);
    public final a.yq1 s = a.b20.i(this, 2131363351);
    public final a.yq1 t = a.b20.i(this, 2131363354);
    public final a.yq1 u = a.b20.i(this, 2131363355);
    public final a.yq1 v = a.b20.i(this, 2131363365);
    public final a.yq1 w = a.b20.i(this, 2131361914);
    public final a.yq1 x = a.b20.i(this, 2131361921);
    public final a.au y;
    public final int z;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "avg_power", "getAvg_power()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        D = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "battery_capacity", "getBattery_capacity()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "battery_size", "getBattery_size()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "battery_stats", "getBattery_stats()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "battery_status", "getBattery_status()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "battery_temperature", "getBattery_temperature()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "battery_voltage", "getBattery_voltage()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "charge_controller", "getCharge_controller()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "electricity_adj_unit", "getElectricity_adj_unit()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "more_charge", "getMore_charge()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "nav_scene_service_not_active", "getNav_scene_service_not_active()Landroid/view/View;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "predict_time", "getPredict_time()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "screen_on_duration", "getScreen_on_duration()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "sort_by_time", "getSort_by_time()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "group_by_type", "getGroup_by_type()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "view_realtime_values", "getView_realtime_values()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "view_time", "getView_time()Lcom/omarea/ui/power/PowerStatView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "view_time_title", "getView_time_title()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "watt_mode", "getWatt_mode()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "action_delete", "getAction_delete()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityPowerStat.class, "action_history", "getAction_history()Landroid/widget/ImageButton;")};
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [a.gy, java.lang.Object] */
    public ActivityPowerStat() {
        a.au f = a.au.f();
        this.y = f;
        int h = f.h();
        this.z = h;
        this.A = h;
        this.B = new a.mr();
        this.C = new a.gy();
    }

    public final android.widget.TextView o() {
        return (android.widget.TextView) this.e.a(D[1]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558466);
        setBackArrow();
        a.gu0[] gu0VarArr = D;
        int i = 8;
        ((android.widget.TextView) this.l.a(gu0VarArr[8])).setOnClickListener(new a.qd(this, 0));
        int i2 = 9;
        ((android.widget.TextView) this.m.a(gu0VarArr[9])).setOnClickListener(new a.qd(this, 1));
        a.u20 u20Var = a.z80.f728a;
        a.wv.M0(a.wv.b(a.by0.f57a), null, new a.sd(this, null), 3);
        androidx.recyclerview.widget.RecyclerView p = p();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(1);
        linearLayoutManager.n1(1);
        linearLayoutManager.y = false;
        p.setLayoutManager(linearLayoutManager);
        ((android.widget.TextView) this.u.a(gu0VarArr[17])).setOnClickListener(new a.qd(this, 2));
        q().setOnClickListener(new a.qd(this, 3));
        com.omarea.ui.power.PowerStatView q = q();
        a.cp cpVar = com.omarea.Scene.c;
        q.setShowIcons(a.fs1.s("power_show_icons", true));
        a.gu0 gu0Var = gu0VarArr[13];
        a.yq1 yq1Var = this.q;
        ((android.widget.ImageView) yq1Var.a(gu0Var)).setAlpha(a.fs1.s("pu_sort_with_sum", true) ? 1.0f : 0.3f);
        a.gu0 gu0Var2 = gu0VarArr[14];
        a.yq1 yq1Var2 = this.r;
        ((android.widget.ImageView) yq1Var2.a(gu0Var2)).setAlpha(a.fs1.s("pu_group_mode", false) ? 1.0f : 0.3f);
        ((android.widget.ImageView) yq1Var.a(gu0VarArr[13])).setOnClickListener(new a.qd(this, 4));
        a.gu0 gu0Var3 = gu0VarArr[18];
        a.yq1 yq1Var3 = this.v;
        ((android.widget.ImageView) yq1Var3.a(gu0Var3)).setAlpha(a.fs1.s("pu_watt_mode", true) ? 0.3f : 1.0f);
        ((android.widget.ImageView) yq1Var3.a(gu0VarArr[18])).setOnClickListener(new a.qd(this, 5));
        ((android.widget.ImageView) yq1Var2.a(gu0VarArr[14])).setOnClickListener(new a.qd(this, 6));
        this.n.a(gu0VarArr[10]).setOnClickListener(new a.qd(this, 7));
        ((android.widget.ImageButton) this.w.a(gu0VarArr[19])).setOnClickListener(new a.qd(this, i));
        ((android.widget.ImageButton) this.x.a(gu0VarArr[20])).setOnClickListener(new a.qd(this, i2));
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952918));
        try {
            r();
        } catch (java.lang.Throwable th) {
            a.au auVar = this.y;
            if (auVar != null) {
                auVar.d = null;
                try {
                    auVar.m();
                } catch (java.lang.Throwable th2) {
                    return;
                }
            }
            try {
                r();
            } catch (java.lang.Throwable th3) {
            }
        }
    }

    public final androidx.recyclerview.widget.RecyclerView p() {
        return (androidx.recyclerview.widget.RecyclerView) this.g.a(D[3]);
    }

    public final com.omarea.ui.power.PowerStatView q() {
        return (com.omarea.ui.power.PowerStatView) this.t.a(D[16]);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5 A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #5 {all -> 0x00da, blocks: (B:14:0x00cf, B:16:0x00d5), top: B:13:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #2 {all -> 0x0114, blocks: (B:19:0x0109, B:21:0x010f), top: B:18:0x0109 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityPowerStat.r():void");
    }
}
