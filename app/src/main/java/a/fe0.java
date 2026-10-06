package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fe0 extends a.fy {
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ a.gy g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe0(a.gy gyVar, a.ey eyVar) {
        super(eyVar);
        this.g = gyVar;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.M(this);
    }
}
