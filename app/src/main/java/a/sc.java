package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sc extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ long i;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPerfBench j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(java.lang.String str, long j, com.omarea.vtools.activities.ActivityPerfBench activityPerfBench, a.ey eyVar) {
        super(2, eyVar);
        this.h = str;
        this.i = j;
        this.j = activityPerfBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sc(this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.q10 q10Var = a.q10.f457a;
            a.q10.L("cpu-bench", this.h, null);
            this.g = 1;
            if (a.wv.Q(this.i, this) == dzVar) {
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
        a.rc rcVar = new a.rc(this.j, null);
        this.g = 2;
        if (a.wv.S1(zx0Var, rcVar, this) == dzVar) {
            return dzVar;
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.sc) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
