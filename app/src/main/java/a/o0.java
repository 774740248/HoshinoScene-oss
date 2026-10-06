package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o0 extends a.lj1 implements a.fp0 {
    public int g;

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.wv.Q(5000L, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        a.q10 q10Var = a.q10.f457a;
        if (!a.wv.e(a.q10.t(), "basic")) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("daemon层窗口监测和无障碍服务，建议只开启其中一个", 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.o0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
