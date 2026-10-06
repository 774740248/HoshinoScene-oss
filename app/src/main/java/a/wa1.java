package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wa1 extends a.fy {
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ a.xa1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(a.xa1 xa1Var, a.ey eyVar) {
        super(eyVar);
        this.g = xa1Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
