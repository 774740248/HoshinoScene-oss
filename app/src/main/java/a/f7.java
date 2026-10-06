package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f7 extends a.fy {
    public com.omarea.vtools.activities.ActivityCpuControl f;
    public /* synthetic */ java.lang.Object g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, a.ey eyVar) {
        super(eyVar);
        this.h = activityCpuControl;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return com.omarea.vtools.activities.ActivityCpuControl.p(this.h, this);
    }
}
