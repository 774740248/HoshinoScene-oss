package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p7 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare g;
    public final /* synthetic */ a.rd0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.rd0 rd0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFastShare;
        this.h = rd0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.p7(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.g;
        activityFastShare.H = false;
        a.rd0 rd0Var = this.h;
        if (rd0Var != null) {
            a.pd0 pd0Var = a.pd0.d;
            a.qd0 qd0Var = a.qd0.g;
            a.qd0 qd0Var2 = a.qd0.h;
            a.qd0 qd0Var3 = rd0Var.d;
            a.pd0 pd0Var2 = rd0Var.f492a;
            if (pd0Var2 != pd0Var) {
                com.omarea.vtools.activities.ActivityFastShare.r(activityFastShare, rd0Var);
                if (qd0Var3 != qd0Var2 && qd0Var3 != qd0Var) {
                    activityFastShare.A(false);
                }
            }
            java.lang.String str = activityFastShare.D;
            if (str != null && str.length() != 0 && (pd0Var2 == pd0Var || qd0Var3 == qd0Var2 || qd0Var3 == qd0Var)) {
                activityFastShare.z(new a.l7(activityFastShare, 3), false);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.p7 p7Var = (a.p7) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        p7Var.e(no1Var);
        return no1Var;
    }
}
