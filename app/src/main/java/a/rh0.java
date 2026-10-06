package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rh0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.uh0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh0(a.uh0 uh0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = uh0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.rh0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.uh0.a(this.h, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.rh0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
