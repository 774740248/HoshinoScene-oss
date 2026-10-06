package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e7 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl h;
    public final /* synthetic */ java.lang.String[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, java.lang.String[] strArr, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityCpuControl;
        this.i = strArr;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.e7(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
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
        int i2 = a.x60.f681a;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.h;
        java.lang.String string = activityCpuControl.getString(2131953730);
        a.wv.v(string, "getString(R.string.warn)");
        java.lang.String string2 = activityCpuControl.getString(2131953201);
        a.wv.v(string2, "getString(R.string.perf_warn2)");
        a.fs1.Z(activityCpuControl, string, string2, new a.so(activityCpuControl, 20, this.i), null, 16).b(false);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.e7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
