package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lg extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityThreadsStat h;
    public final /* synthetic */ java.lang.String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.omarea.vtools.activities.ActivityThreadsStat activityThreadsStat, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityThreadsStat;
        this.i = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lg(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityThreadsStat activityThreadsStat = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.e30 N1 = new a.mo(activityThreadsStat.getContext(), 0, 6, 0).N1(this.i);
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
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.kg kgVar = new a.kg(activityThreadsStat, (android.graphics.drawable.Drawable) obj, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, kgVar, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.lg) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
