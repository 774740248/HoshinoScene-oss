package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b1 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.gy h;
    public final /* synthetic */ android.content.Context i;
    public final /* synthetic */ java.lang.Runnable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a.gy gyVar, android.content.Context context, java.lang.Runnable runnable, a.ey eyVar) {
        super(2, eyVar);
        this.h = gyVar;
        this.i = context;
        this.j = runnable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.b1(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        a.gy gyVar = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            a.cp cpVar = com.omarea.Scene.c;
            android.app.Application t = a.fs1.t();
            gyVar.getClass();
            a.gy.S(t);
            a.q10 q10Var = a.q10.f457a;
            a.q10.E(null);
            this.g = 1;
            if (a.wv.Q(500L, this) == dzVar) {
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
        a.a1 a1Var = new a.a1(gyVar, this.i, this.j, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, a1Var, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.b1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
