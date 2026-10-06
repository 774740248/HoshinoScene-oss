package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ju extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.lu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(a.lu luVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = luVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ju(this.g, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.lang.String s0 = a.wv.s0(false);
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.O("su_alias7", s0);
        this.g.b.run();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ju juVar = (a.ju) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        juVar.e(no1Var);
        return no1Var;
    }
}
