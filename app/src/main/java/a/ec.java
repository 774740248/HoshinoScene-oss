package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ec extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOplusORMS g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityOplusORMS;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ec(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityOplusORMS.i;
        com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS = this.g;
        activityOplusORMS.p().setText(this.h);
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.X("OK, ^_^", 0);
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
        a.ec ecVar = (a.ec) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ecVar.e(no1Var);
        return no1Var;
    }
}
