package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ee extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityProcess h;
    public final /* synthetic */ com.omarea.model.ProcessInfo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(com.omarea.model.ProcessInfo processInfo, com.omarea.vtools.activities.ActivityProcess activityProcess, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityProcess;
        this.i = processInfo;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ee(this.i, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        com.omarea.vtools.activities.ActivityProcess activityProcess = this.h;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            obj = com.omarea.vtools.activities.ActivityProcess.o(this.i, activityProcess, this);
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
        a.de deVar = new a.de((com.omarea.model.ProcessInfo) obj, activityProcess, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, deVar, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ee) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
