package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ec0 extends a.gc0 {
    public final a.zs e;
    public final /* synthetic */ a.ic0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec0(a.ic0 ic0Var, long j, a.at atVar) {
        super(j);
        this.f = ic0Var;
        this.e = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((a.at) this.e).x(this.f);
    }

    @Override // a.gc0
    public final java.lang.String toString() {
        return super.toString() + this.e;
    }
}
