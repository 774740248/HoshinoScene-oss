package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xn1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.bp0 h;
    public final /* synthetic */ a.vn1 i;
    public final /* synthetic */ com.omarea.ui.TreemapView j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn1(a.bp0 bp0Var, a.vn1 vn1Var, com.omarea.ui.TreemapView treemapView, a.ey eyVar) {
        super(2, eyVar);
        this.h = bp0Var;
        this.i = vn1Var;
        this.j = treemapView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xn1(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.tn1 tn1Var;
        a.vn1 vn1Var = this.i;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            try {
                tn1Var = (a.tn1) this.h.i(vn1Var);
            } catch (java.lang.Exception unused) {
                tn1Var = null;
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.wn1 wn1Var = new a.wn1(this.j, vn1Var, tn1Var, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, wn1Var, this) == dzVar) {
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
        return ((a.xn1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
