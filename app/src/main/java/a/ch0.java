package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ch0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.dh0 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ android.widget.TextView[] j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch0(a.dh0 dh0Var, java.lang.String str, a.ey eyVar, android.widget.TextView[] textViewArr) {
        super(2, eyVar);
        this.h = dh0Var;
        this.i = str;
        this.j = textViewArr;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ch0(this.h, this.i, eyVar, this.j);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.dh0 dh0Var = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.xa1 xa1Var = dh0Var.j;
            this.g = 1;
            obj = xa1Var.b(this.i, this);
            if (obj == dzVar) {
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
        java.lang.String valueOf = java.lang.String.valueOf(((a.va1) obj).f629a);
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.bh0 bh0Var = new a.bh0(dh0Var, valueOf, null, this.j);
        this.g = 2;
        if (a.wv.S1(zx0Var, bh0Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ch0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
