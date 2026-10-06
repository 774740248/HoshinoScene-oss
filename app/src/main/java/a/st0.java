package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class st0 extends a.at {
    public final a.wt0 k;

    public st0(a.ey eyVar, a.wt0 wt0Var) {
        super(eyVar);
        this.k = wt0Var;
    }

    @Override // a.at
    public final java.lang.Throwable n(a.wt0 wt0Var) {
        java.lang.Throwable c;
        java.lang.Object C = this.k.C();
        return (!(C instanceof a.ut0) || (c = ((a.ut0) C).c()) == null) ? C instanceof a.dw ? ((a.dw) C).f110a : wt0Var.w() : c;
    }

    @Override // a.at
    public final java.lang.String u() {
        return "AwaitContinuation";
    }
}
