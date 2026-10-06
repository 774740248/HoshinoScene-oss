package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xf0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ag0 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(a.ag0 ag0Var, long j, a.ey eyVar) {
        super(2, eyVar);
        this.g = ag0Var;
        this.h = j;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xf0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.oe1 oe1Var = new a.oe1();
        a.ag0 ag0Var = this.g;
        a.r51 r51Var = ag0Var.b;
        long j = this.h;
        a.y31 o = oe1Var.o(r51Var.b(j));
        if (o != null) {
            ag0Var.b.K(j, (java.lang.String) o.c);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.xf0 xf0Var = (a.xf0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        xf0Var.e(no1Var);
        return no1Var;
    }
}
