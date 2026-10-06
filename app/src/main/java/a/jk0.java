package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jk0 extends a.wv implements a.fr1, a.f31, a.xe, a.gm0 {
    public final android.app.Activity W;
    public final android.content.Context X;
    public final android.os.Handler Y;
    public final a.bm0 Z;
    public final /* synthetic */ a.kk0 a0;

    /* JADX WARN: Type inference failed for: r1v0, types: [a.bm0, a.am0] */
    public jk0(a.kk0 kk0Var) {
        this.a0 = kk0Var;
        android.os.Handler handler = new android.os.Handler();
        this.Z = new a.bm0();
        this.W = kk0Var;
        if (kk0Var == null) {
            throw new java.lang.NullPointerException("context == null");
        }
        this.X = kk0Var;
        this.Y = handler;
    }

    @Override // a.wv
    public final android.view.View V0(int i) {
        return this.a0.findViewById(i);
    }

    @Override // a.wv
    public final boolean W0() {
        android.view.Window window = this.a0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // a.gm0
    public final void a(a.gk0 gk0Var) {
        this.a0.onAttachFragment(gk0Var);
    }

    @Override // a.mv0
    public final a.gv0 getLifecycle() {
        return this.a0.mFragmentLifecycleRegistry;
    }

    @Override // a.fr1
    public final a.er1 getViewModelStore() {
        return this.a0.getViewModelStore();
    }
}
