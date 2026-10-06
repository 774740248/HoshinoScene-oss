package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z3 extends a.uu0 implements a.fp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppConfig2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2, int i) {
        super(2);
        this.d = i;
        this.e = activityAppConfig2;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.no1 no1Var = a.no1.f387a;
        com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = this.e;
        int i = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.mg1 mg1Var = (a.mg1) obj;
                ((java.lang.Number) obj2).intValue();
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(mg1Var, "<anonymous parameter 0>");
                        com.omarea.vtools.activities.ActivityAppConfig2.t(activityAppConfig2);
                        return no1Var;
                    default:
                        a.wv.w(mg1Var, "<anonymous parameter 0>");
                        com.omarea.vtools.activities.ActivityAppConfig2.t(activityAppConfig2);
                        return no1Var;
                }
            default:
                a.mg1 mg1Var2 = (a.mg1) obj;
                ((java.lang.Number) obj2).intValue();
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(mg1Var2, "<anonymous parameter 0>");
                        com.omarea.vtools.activities.ActivityAppConfig2.t(activityAppConfig2);
                        return no1Var;
                    default:
                        a.wv.w(mg1Var2, "<anonymous parameter 0>");
                        com.omarea.vtools.activities.ActivityAppConfig2.t(activityAppConfig2);
                        return no1Var;
                }
        }
    }
}
