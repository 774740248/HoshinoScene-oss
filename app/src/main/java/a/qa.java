package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qa extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFreezeApps h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityFreezeApps;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qa(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps = this.h;
            arrayList = activityFreezeApps.freezeApps;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                a.wv.v(str, "it");
                activityFreezeApps.enableApp(str);
            }
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.pa paVar = new a.pa(activityFreezeApps, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, paVar, this) == dzVar) {
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
        return ((a.qa) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
