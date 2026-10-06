package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tw0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.vw0 f569a;

    public tw0(a.vw0 vw0Var) {
        this.f569a = vw0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
        if (i == 1) {
            a.vw0 vw0Var = this.f569a;
            if (vw0Var.B.getInputMethodMode() == 2 || vw0Var.B.getContentView() == null) {
                return;
            }
            android.os.Handler handler = vw0Var.x;
            a.ow0 ow0Var = vw0Var.t;
            handler.removeCallbacks(ow0Var);
            ow0Var.run();
        }
    }
}
