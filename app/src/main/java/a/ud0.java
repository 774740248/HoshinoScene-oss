package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ud0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.vd0 h;
    public final /* synthetic */ a.mc1 i;
    public final /* synthetic */ android.widget.ImageView j;
    public final /* synthetic */ java.lang.String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(a.vd0 vd0Var, a.mc1 mc1Var, android.widget.ImageView imageView, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = vd0Var;
        this.i = mc1Var;
        this.j = imageView;
        this.k = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ud0(this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            android.graphics.drawable.Drawable M1 = this.h.M1(this.i);
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.td0 td0Var = new a.td0(M1, this.j, this.k, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, td0Var, this) == dzVar) {
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
        return ((a.ud0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
