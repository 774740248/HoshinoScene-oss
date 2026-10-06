package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d7 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityCpuControl;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.d7(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        int i2 = 1;
        if (i == 0) {
            a.b20.q1(obj);
            this.g = 1;
            if (a.wv.Q(50L, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        int i3 = a.x60.f681a;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.h;
        java.lang.String string = activityCpuControl.getString(2131953730);
        a.wv.v(string, "getString(R.string.warn)");
        java.lang.String string2 = activityCpuControl.getString(2131953200);
        a.wv.v(string2, "getString(R.string.perf_warn)");
        a.fs1.K(activityCpuControl, 2131558560, string, string2, new a.hs(7), new a.o6(activityCpuControl, i2)).b(false);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.d7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
