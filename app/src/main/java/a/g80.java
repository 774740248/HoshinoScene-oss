package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g80 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.x01 h;
    public final /* synthetic */ android.view.View i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(a.x01 x01Var, android.view.View view, a.ey eyVar) {
        super(2, eyVar);
        this.h = x01Var;
        this.i = view;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.g80(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.wv.Q(500L, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
                return a.no1.f387a;
            }
            a.b20.q1(obj);
        }
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.f80 f80Var = new a.f80(this.h, this.i, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, f80Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.g80) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
