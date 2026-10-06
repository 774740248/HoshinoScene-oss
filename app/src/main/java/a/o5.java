package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o5 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.p5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(a.p5 p5Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = p5Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.o5(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.wv.Q(1000L, this) == dzVar) {
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
        a.q10 q10Var = a.q10.f457a;
        java.lang.String packageName = this.h.getContext().getPackageName();
        a.wv.v(packageName, "context.packageName");
        this.g = 2;
        if (q10Var.i("meminfo", new java.lang.String[]{packageName}, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.o5) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
