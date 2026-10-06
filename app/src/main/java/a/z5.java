package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class z5 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeStat d;

    public /* synthetic */ z5(com.omarea.vtools.activities.ActivityChargeStat activityChargeStat, int i) {
        this.c = i;
        this.d = activityChargeStat;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [a.fp0, a.lj1] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityChargeStat activityChargeStat = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.wv.w(activityChargeStat, "this$0");
                new a.nk(22, 0).P(activityChargeStat);
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.wv.w(activityChargeStat, "this$0");
                activityChargeStat.startActivity(new android.content.Intent(activityChargeStat.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPowerStat.class));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.wv.w(activityChargeStat, "this$0");
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.gu0 gu0Var = gu0VarArr4[7];
                a.yq1 yq1Var = activityChargeStat.k;
                com.omarea.ui.charge.ChargeCurveView chargeCurveView = (com.omarea.ui.charge.ChargeCurveView) yq1Var.a(gu0Var);
                boolean z = !chargeCurveView.h;
                chargeCurveView.h = z;
                view.setAlpha(z ? 1.0f : 0.3f);
                ((android.widget.TextView) activityChargeStat.i.a(gu0VarArr4[5])).setText(activityChargeStat.getString(z ? 2131952124 : 2131952122));
                ((com.omarea.ui.charge.ChargeCurveView) yq1Var.a(gu0VarArr4[7])).d(activityChargeStat.r);
                return;
            case 3:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.wv.w(activityChargeStat, "this$0");
                int i2 = activityChargeStat.r;
                a.au auVar = activityChargeStat.p;
                auVar.n(i2);
                android.widget.Toast.makeText(activityChargeStat.getContext(), activityChargeStat.getString(2131953220), 0).show();
                if (!activityChargeStat.q) {
                    activityChargeStat.r = auVar.h();
                }
                activityChargeStat.o();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.wv.w(activityChargeStat, "this$0");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
                new a.r40(activityChargeStat, activityChargeStat.getThemeMode(), activityChargeStat.r, new a.b10(4, activityChargeStat), 1).V(activityChargeStat.getSupportFragmentManager(), "BatteryRecords");
                return;
            default:
                activityChargeStat.startActivity(new android.content.Intent(activityChargeStat.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityChargeControl.class));
                return;
        }
    }
}
