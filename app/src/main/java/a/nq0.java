package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nq0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ double h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(double d, a.ey eyVar) {
        super(2, eyVar);
        this.h = d;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.nq0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            java.lang.Double d = new java.lang.Double(this.h);
            this.g = 1;
            obj = q10Var.s("battery", d, this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return obj;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.nq0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
