package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zn1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.bp0 h;
    public final /* synthetic */ a.vn1 i;
    public final /* synthetic */ com.omarea.ui.TreemapView j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn1(a.bp0 bp0Var, a.vn1 vn1Var, com.omarea.ui.TreemapView treemapView, int i, boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.h = bp0Var;
        this.i = vn1Var;
        this.j = treemapView;
        this.k = i;
        this.l = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zn1(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            try {
                arrayList = (java.util.ArrayList) this.h.i(this.i);
            } catch (java.lang.Exception unused) {
                arrayList = null;
            }
            java.util.ArrayList arrayList2 = arrayList;
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.yn1 yn1Var = new a.yn1(this.j, arrayList2, this.i, this.k, this.l, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, yn1Var, this) == dzVar) {
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
        return ((a.zn1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
