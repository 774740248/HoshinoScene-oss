package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yd0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.w21 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ a.w60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd0(a.w21 w21Var, a.w60 w60Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = w21Var;
        this.i = str;
        this.j = w60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        java.lang.String str = this.i;
        return new a.yd0(this.h, this.j, str, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.String string;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.w21 w21Var = this.h;
            a.wd0 l = a.gy.l(a.yi1.v2(a.b20.m0(w21Var.f649a, 2131886084), "${APK}", this.i));
            if (l.c) {
                string = null;
            } else {
                boolean e = a.wv.e((java.lang.String) l.d, "error");
                android.content.Context context = w21Var.f649a;
                string = e ? context.getString(2131952275) : a.yi1.g2(l.f658a, "INSTALL_FAILED_MISSING_SPLIT") ? context.getString(2131952274) : l.f658a;
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.xd0 xd0Var = new a.xd0(w21Var, this.j, string, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, xd0Var, this) == dzVar) {
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
        return ((a.yd0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
