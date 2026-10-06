package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ad extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityPowerBench;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ad(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.h;
            boolean[] zArr = activityPowerBench.S;
            this.g = 1;
            if (com.omarea.vtools.activities.ActivityPowerBench.p(activityPowerBench, zArr, this) == dzVar) {
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
        return ((a.ad) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
