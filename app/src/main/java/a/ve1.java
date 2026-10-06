package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ve1 extends a.fy {
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ a.be1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve1(a.be1 be1Var, a.ey eyVar) {
        super(eyVar);
        this.g = be1Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.r(null, this);
    }
}
