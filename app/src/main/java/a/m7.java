package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m7 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare g;
    public final /* synthetic */ a.rd0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.rd0 rd0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityFastShare;
        this.h = rd0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.m7(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFastShare.P;
        com.omarea.vtools.activities.ActivityFastShare activityFastShare = this.g;
        activityFastShare.x().setVisibility(0);
        a.rd0 rd0Var = this.h;
        if (rd0Var != null) {
            if (rd0Var.d == a.qd0.h) {
                com.omarea.vtools.activities.ActivityFastShare.r(activityFastShare, rd0Var);
                return a.no1.f387a;
            }
        }
        activityFastShare.u().setText(activityFastShare.getString(2131952392));
        activityFastShare.v().setIndeterminate(false);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.m7 m7Var = (a.m7) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        m7Var.e(no1Var);
        return no1Var;
    }
}
