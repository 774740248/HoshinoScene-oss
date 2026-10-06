package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class be extends a.uu0 implements a.fp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityProcess e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be(com.omarea.vtools.activities.ActivityProcess activityProcess, int i) {
        super(2);
        this.d = i;
        this.e = activityProcess;
    }

    public final void a(a.mg1 mg1Var) {
        int i = this.d;
        com.omarea.vtools.activities.ActivityProcess activityProcess = this.e;
        int i2 = 1;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(mg1Var, "item");
                java.lang.String str = mg1Var.b;
                switch (str.hashCode()) {
                    case 98728:
                        if (str.equals("cpu")) {
                            i2 = 4;
                            break;
                        }
                        break;
                    case 110987:
                        if (str.equals("pid")) {
                            i2 = 16;
                            break;
                        }
                        break;
                    case 112800:
                        if (str.equals("res")) {
                            i2 = 8;
                            break;
                        }
                        break;
                    case 115792:
                        if (str.equals("uid")) {
                            i2 = 20;
                            break;
                        }
                        break;
                }
                activityProcess.p = i2;
                if (activityProcess.n) {
                    com.omarea.ui.procs.ProcessGroupView u = activityProcess.u();
                    if (u.k != i2) {
                        u.k = i2;
                        u.g();
                    }
                    activityProcess.u().d.i0(0);
                    return;
                }
                activityProcess.w().l0(0);
                a.nj njVar = activityProcess.m;
                if (njVar != null) {
                    njVar.i = i2;
                    njVar.s();
                    return;
                }
                return;
            default:
                a.wv.w(mg1Var, "item");
                java.lang.String str2 = mg1Var.b;
                if (a.wv.e(str2, "android")) {
                    i2 = 32;
                } else if (a.wv.e(str2, "other")) {
                    i2 = 4;
                }
                activityProcess.q = i2;
                if (activityProcess.n) {
                    com.omarea.ui.procs.ProcessGroupView u2 = activityProcess.u();
                    if (u2.l != i2) {
                        u2.l = i2;
                        u2.g();
                    }
                    activityProcess.u().d.i0(0);
                    return;
                }
                activityProcess.w().l0(0);
                a.nj njVar2 = activityProcess.m;
                if (njVar2 != null) {
                    njVar2.j = i2;
                    njVar2.s();
                    return;
                }
                return;
        }
    }

    @Override // a.fp0
    public final /* bridge */ /* synthetic */ java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((java.lang.Number) obj2).intValue();
                a((a.mg1) obj);
                return no1Var;
            default:
                ((java.lang.Number) obj2).intValue();
                a((a.mg1) obj);
                return no1Var;
        }
    }
}
