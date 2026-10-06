package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sf extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar, boolean z) {
        super(2, eyVar);
        this.h = z;
        this.i = activityStartSplash;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sf(this.i, eyVar, this.h);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            boolean z = this.h;
            com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = this.i;
            if (z) {
                this.g = 1;
                if (com.omarea.vtools.activities.ActivityStartSplash.j(activityStartSplash, this) == dzVar) {
                    return dzVar;
                }
            } else {
                ((a.i50) activityStartSplash.l.a()).c();
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
        return ((a.sf) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
