package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class o1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.io.Serializable e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ o1(java.lang.Object obj, java.io.Serializable serializable, boolean z, java.lang.Object obj2, int i) {
        this.c = i;
        this.d = obj;
        this.e = serializable;
        this.f = z;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        boolean z = this.f;
        java.lang.Object obj = this.g;
        java.io.Serializable serializable = this.e;
        java.lang.Object obj2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.a2 a2Var = (a.a2) obj2;
                com.omarea.krscript.model.SwitchNode switchNode = (com.omarea.krscript.model.SwitchNode) serializable;
                java.lang.Runnable runnable = (java.lang.Runnable) obj;
                int i2 = a.a2.d0;
                a.wv.w(a2Var, "this$0");
                a.wv.w(switchNode, "$item");
                a.wv.w(runnable, "$onCompleted");
                java.lang.String setState = switchNode.getSetState();
                if (setState == null) {
                    return;
                }
                a2Var.T(switchNode, setState, runnable, new a.z1(z));
                return;
            case 1:
                a.a2 a2Var2 = (a.a2) obj2;
                com.omarea.krscript.model.SwitchNode switchNode2 = (com.omarea.krscript.model.SwitchNode) serializable;
                java.lang.Runnable runnable2 = (java.lang.Runnable) obj;
                int i3 = a.a2.d0;
                a.wv.w(a2Var2, "this$0");
                a.wv.w(switchNode2, "$item");
                a.wv.w(runnable2, "$onCompleted");
                java.lang.String setState2 = switchNode2.getSetState();
                if (setState2 == null) {
                    return;
                }
                a2Var2.T(switchNode2, setState2, runnable2, new a.z1(z));
                return;
            default:
                com.omarea.vtools.activities.ActivityChargeStat activityChargeStat = (com.omarea.vtools.activities.ActivityChargeStat) obj2;
                java.lang.String str = (java.lang.String) serializable;
                java.lang.String str2 = (java.lang.String) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityChargeStat.v;
                a.wv.w(activityChargeStat, "this$0");
                a.wv.w(str, "$title");
                a.wv.w(str2, "$sumInfo");
                activityChargeStat.setTitle(str);
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityChargeStat.v;
                ((com.omarea.ui.BatteryRealtimeStatus) activityChargeStat.j.a(gu0VarArr2[6])).setVisibility(z ? 0 : 8);
                if (activityChargeStat.q) {
                    activityChargeStat.r = a.wt.g;
                }
                ((com.omarea.ui.charge.ChargeCurveView) activityChargeStat.k.a(gu0VarArr2[7])).d(activityChargeStat.r);
                com.omarea.ui.charge.ChargeTimeView chargeTimeView = (com.omarea.ui.charge.ChargeTimeView) activityChargeStat.m.a(gu0VarArr2[9]);
                chargeTimeView.d = activityChargeStat.r;
                chargeTimeView.invalidate();
                com.omarea.ui.charge.ChargeTempView chargeTempView = (com.omarea.ui.charge.ChargeTempView) activityChargeStat.l.a(gu0VarArr2[8]);
                chargeTempView.d = activityChargeStat.r;
                chargeTempView.invalidate();
                android.widget.TextView textView = (android.widget.TextView) activityChargeStat.e.a(gu0VarArr2[1]);
                textView.setText(str2);
                textView.setVisibility(str2.length() == 0 ? 8 : 0);
                return;
        }
    }
}
