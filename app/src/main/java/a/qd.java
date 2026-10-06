package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class qd implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerStat d;

    public /* synthetic */ qd(com.omarea.vtools.activities.ActivityPowerStat activityPowerStat, int i) {
        this.c = i;
        this.d = activityPowerStat;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [a.gy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [a.fp0, a.lj1] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityPowerStat activityPowerStat = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                new a.nk(22, 0).P(activityPowerStat);
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                activityPowerStat.startActivity(new android.content.Intent(activityPowerStat.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityChargeStat.class));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                activityPowerStat.q().setLadder(!activityPowerStat.q().getLadder());
                return;
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                activityPowerStat.q().setShowIcons(!activityPowerStat.q().getShowIcons());
                activityPowerStat.q().b();
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.N("power_show_icons", activityPowerStat.q().getShowIcons());
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                a.cp cpVar2 = com.omarea.Scene.c;
                boolean z = !a.fs1.s("pu_sort_with_sum", true);
                a.fs1.N("pu_sort_with_sum", z);
                view.setAlpha(z ? 1.0f : 0.3f);
                a.e91 adapter = activityPowerStat.p().getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.power.AdapterBatteryStats");
                a.wh whVar = (a.wh) adapter;
                if (whVar.h != z) {
                    whVar.h = z;
                    whVar.s();
                    whVar.f();
                    return;
                }
                return;
            case 5:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                a.cp cpVar3 = com.omarea.Scene.c;
                boolean z2 = !a.fs1.s("pu_watt_mode", true);
                a.fs1.N("pu_watt_mode", z2);
                view.setAlpha(z2 ? 0.3f : 1.0f);
                activityPowerStat.r();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                a.cp cpVar4 = com.omarea.Scene.c;
                boolean z3 = !a.fs1.s("pu_group_mode", false);
                a.fs1.N("pu_group_mode", z3);
                view.setAlpha(z3 ? 1.0f : 0.3f);
                a.e91 adapter2 = activityPowerStat.p().getAdapter();
                a.wh whVar2 = adapter2 instanceof a.wh ? (a.wh) adapter2 : null;
                if (whVar2 == null || whVar2.j == z3) {
                    return;
                }
                whVar2.j = z3;
                whVar2.s();
                whVar2.f();
                return;
            case 7:
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.ud((gy) (new java.lang.Object()), activityPowerStat, null), 3);
                return;
            case 8:
                a.gu0[] gu0VarArr9 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                activityPowerStat.y.n(activityPowerStat.A);
                android.widget.Toast.makeText(activityPowerStat.getContext(), activityPowerStat.getString(2131953220), 0).show();
                activityPowerStat.r();
                activityPowerStat.q().b();
                return;
            case 9:
                a.gu0[] gu0VarArr10 = com.omarea.vtools.activities.ActivityPowerStat.D;
                a.wv.w(activityPowerStat, "this$0");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
                new a.r40(activityPowerStat, activityPowerStat.getThemeMode(), activityPowerStat.A, new a.b10(8, activityPowerStat), 0).V(activityPowerStat.getSupportFragmentManager(), "BatteryRecords");
                return;
            default:
                activityPowerStat.startActivity(new android.content.Intent(activityPowerStat.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityChargeControl.class));
                return;
        }
    }
}
