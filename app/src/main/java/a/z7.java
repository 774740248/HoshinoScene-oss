package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z7 extends a.fy {
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.ey eyVar) {
        super(eyVar);
        this.g = activityFastShare;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return com.omarea.vtools.activities.ActivityFastShare.q(this.g, this);
    }
}
