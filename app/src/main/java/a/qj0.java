package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qj0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.ij0 h;
    public final /* synthetic */ android.widget.CompoundButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj0(a.ij0 ij0Var, android.widget.CompoundButton compoundButton, a.ey eyVar) {
        super(2, eyVar);
        this.h = ij0Var;
        this.i = compoundButton;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qj0(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                boolean booleanValue = ((java.lang.Boolean) this.h.getValue()).booleanValue();
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.pj0 pj0Var = new a.pj0(this.i, booleanValue, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, pj0Var, this) == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.qj0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
