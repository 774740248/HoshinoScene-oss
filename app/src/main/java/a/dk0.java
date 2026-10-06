package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dk0 extends a.wv {
    public final /* synthetic */ a.gk0 W;

    public dk0(a.gk0 gk0Var) {
        this.W = gk0Var;
    }

    @Override // a.wv
    public final android.view.View V0(int i) {
        a.gk0 gk0Var = this.W;
        android.view.View view = gk0Var.H;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new java.lang.IllegalStateException("Fragment " + gk0Var + " does not have a view");
    }

    @Override // a.wv
    public final boolean W0() {
        return this.W.H != null;
    }
}
