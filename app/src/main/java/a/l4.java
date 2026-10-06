package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l4 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppDetails e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(com.omarea.vtools.activities.ActivityAppDetails activityAppDetails, int i) {
        super(1);
        this.d = i;
        this.e = activityAppDetails;
    }

    public final void a(int i) {
        int i2 = this.d;
        com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                activityAppDetails.R.j(activityAppDetails.L, java.lang.Integer.valueOf(i), null);
                activityAppDetails.x();
                return;
            default:
                activityAppDetails.R.j(activityAppDetails.L, null, java.lang.Integer.valueOf(i));
                activityAppDetails.x();
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            case 1:
                a(((java.lang.Number) obj).intValue());
                return no1Var;
            default:
                a.x81 x81Var = (a.x81) obj;
                a.wv.w(x81Var, "it");
                boolean z = x81Var.c() == 1;
                com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = this.e;
                activityAppDetails.V = z;
                activityAppDetails.q().setEnabled(activityAppDetails.V);
                java.lang.String str = activityAppDetails.L;
                boolean z2 = activityAppDetails.V;
                a.yi yiVar = activityAppDetails.S;
                yiVar.getClass();
                a.wv.w(str, "app");
                ((android.content.SharedPreferences) yiVar.d).edit().putBoolean(str, z2).apply();
                if (activityAppDetails.V) {
                    activityAppDetails.t().setVisibility(8);
                    activityAppDetails.r().setVisibility(activityAppDetails.q().isChecked() ? 0 : 8);
                } else {
                    activityAppDetails.t().setVisibility(activityAppDetails.s().getVisibility());
                    activityAppDetails.r().setVisibility(8);
                }
                if (((java.lang.Boolean) activityAppDetails.T.h.a()).booleanValue()) {
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppDetails.X;
                    ((android.widget.LinearLayout) activityAppDetails.q.a(gu0VarArr[15])).setVisibility(((android.widget.LinearLayout) activityAppDetails.o.a(gu0VarArr[13])).getVisibility());
                }
                return no1Var;
        }
    }
}
