package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qx0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.rx0 h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(a.rx0 rx0Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = rx0Var;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qx0(this.h, this.i, eyVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 14 */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.e30 K1 = new a.mo(this.h.E, 0, 6, 0).K1(this.i);
            this.g = 1;
            obj = K1.o(this);
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        a.io ioVar = (a.io) obj;
        android.graphics.drawable.Drawable drawable = ioVar.b;
        if (drawable == null) {
            android.content.Context context = this.h.E;
            java.lang.Object obj2 = a.zx.f748a;
            drawable = a.xx.b(context, 2131231235);
            a.wv.s(drawable);
            ioVar.b = drawable;
        }
        this.h.N1(drawable, this.i);
        java.lang.String str = ioVar.f236a;
        if (str == null || str.length() == 0) {
            str = this.i;
        }
        this.h.G.edit().putString(this.i, str).apply();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.qx0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
