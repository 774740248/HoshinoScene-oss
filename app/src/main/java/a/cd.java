package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cd extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, int i) {
        super(1);
        this.d = i;
        this.e = activityPowerBench;
    }

    public final java.lang.String a(int i) {
        int i2 = this.d;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                return java.lang.String.valueOf(((java.lang.Number) activityPowerBench.A().get(i)).intValue() / 1000);
            case 3:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPowerBench.U;
                return java.lang.String.valueOf(((java.lang.Number) activityPowerBench.A().get(i)).intValue() / 500);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
            case 5:
            default:
                return java.lang.String.valueOf(((java.lang.Number) activityPowerBench.R.get(i)).intValue() / 1000);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return java.lang.String.valueOf(((java.lang.Number) activityPowerBench.R.get(i)).intValue() / 1000);
        }
    }

    public final void c(int i) {
        int i2 = this.d;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                if (activityPowerBench.v().getProgress() < i) {
                    activityPowerBench.v().setProgress(i);
                    return;
                }
                return;
            default:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPowerBench.U;
                if (activityPowerBench.w().getProgress() > i) {
                    activityPowerBench.w().setProgress(i);
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ng1 ng1Var = (a.ng1) obj;
                a.wv.w(ng1Var, "it");
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                a.i61 F = activityPowerBench.F();
                java.lang.String str = ng1Var.c;
                a.wv.s(str);
                long parseLong = java.lang.Long.parseLong(str);
                F.a().delete("session", "id = ?", new java.lang.String[]{java.lang.String.valueOf(parseLong)});
                F.a().delete("records", "session = ?", new java.lang.String[]{java.lang.String.valueOf(parseLong)});
                return java.lang.Boolean.TRUE;
            case 1:
                a.x81 x81Var = (a.x81) obj;
                a.wv.w(x81Var, "it");
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPowerBench.U;
                java.lang.String str2 = ((java.lang.String[]) activityPowerBench.Q.a())[x81Var.c()];
                a.wv.v(str2, "calcModes[it.getCheckedIndex()]");
                ((android.widget.LinearLayout) activityPowerBench.l.a(com.omarea.vtools.activities.ActivityPowerBench.U[9])).setVisibility((a.wv.e(str2, "int") || a.wv.e(str2, "float")) ? 0 : 8);
                if (a.wv.e(str2, "pi")) {
                    a.cp cpVar = com.omarea.Scene.c;
                    java.lang.String string = activityPowerBench.getString(2131953149);
                    a.wv.v(string, "getString(R.string.pb_pi_warn)");
                    a.fs1.X(string, 0);
                }
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a(((java.lang.Number) obj).intValue());
            case 3:
                return a(((java.lang.Number) obj).intValue());
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                c(((java.lang.Number) obj).intValue());
                return no1Var;
            case 5:
                c(((java.lang.Number) obj).intValue());
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return a(((java.lang.Number) obj).intValue());
            default:
                return a(((java.lang.Number) obj).intValue());
        }
    }
}
