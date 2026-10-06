package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kj0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.ij0 h;
    public final /* synthetic */ android.widget.TextView i;
    public final /* synthetic */ android.widget.SeekBar j;
    public final /* synthetic */ a.tj1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(a.ij0 ij0Var, android.widget.TextView textView, android.widget.SeekBar seekBar, a.tj1 tj1Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = ij0Var;
        this.i = textView;
        this.j = seekBar;
        this.k = tj1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.kj0(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                int intValue = ((java.lang.Number) this.h.getValue()).intValue();
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.jj0 jj0Var = new a.jj0(this.i, intValue, this.j, this.k, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, jj0Var, this) == dzVar) {
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
        return ((a.kj0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
