package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.r00(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        if (a.q10.g != null) {
            java.lang.String str = this.g;
            a.wv.w(str, "message");
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X(str, 1);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.r00 r00Var = (a.r00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        r00Var.e(no1Var);
        return no1Var;
    }
}
