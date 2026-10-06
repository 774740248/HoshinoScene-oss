package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fc extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOplusORMS g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityOplusORMS;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.fc(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.cp cpVar = com.omarea.Scene.c;
        com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS = this.g;
        java.lang.String string = activityOplusORMS.getString(2131953111);
        a.wv.v(string, "getString(R.string.orms_no_change)");
        a.fs1.X(string, 0);
        a.b81 b81Var = activityOplusORMS.g;
        if (b81Var != null) {
            b81Var.a();
            return a.no1.f387a;
        }
        a.wv.M1("progressBarDialog");
        throw null;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.fc fcVar = (a.fc) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        fcVar.e(no1Var);
        return no1Var;
    }
}
