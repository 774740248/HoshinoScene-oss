package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class eh extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.fh h;
    public final /* synthetic */ com.omarea.model.AppInfo i;
    public final /* synthetic */ a.ch j;
    public final /* synthetic */ a.ch k;
    public final /* synthetic */ java.lang.String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(a.fh fhVar, com.omarea.model.AppInfo appInfo, a.ch chVar, a.ch chVar2, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = fhVar;
        this.i = appInfo;
        this.j = chVar;
        this.k = chVar2;
        this.l = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.eh(this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.e30 N1 = this.h.h.N1(this.i.getPackageName());
            this.g = 1;
            obj = N1.o(this);
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
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.widget.ImageView imageView = this.j.w;
        a.wv.s(imageView);
        if (drawable != null && a.wv.e(this.k.u, this.l)) {
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.dh dhVar = new a.dh(imageView, drawable, null);
            this.g = 2;
            if (a.wv.S1(zx0Var, dhVar, this) == dzVar) {
                return dzVar;
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.eh) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
