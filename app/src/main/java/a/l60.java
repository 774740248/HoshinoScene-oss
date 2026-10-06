package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l60 extends a.wv {
    public final /* synthetic */ a.wv W;
    public final /* synthetic */ a.m60 X;

    public l60(a.m60 m60Var, a.dk0 dk0Var) {
        this.X = m60Var;
        this.W = dk0Var;
    }

    @Override // a.wv
    public final android.view.View V0(int i) {
        a.wv wvVar = this.W;
        if (wvVar.W0()) {
            return wvVar.V0(i);
        }
        android.app.Dialog dialog = this.X.h0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // a.wv
    public final boolean W0() {
        return this.W.W0() || this.X.l0;
    }
}
