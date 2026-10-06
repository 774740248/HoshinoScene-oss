package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class hj0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ a.vj0 d;
    public final /* synthetic */ a.qo0 e;

    public /* synthetic */ hj0(android.view.View view, a.vj0 vj0Var, a.oj0 oj0Var) {
        this.c = view;
        this.d = vj0Var;
        this.e = oj0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.View view = this.c;
        a.wv.w(view, "$view");
        a.vj0 vj0Var = this.d;
        a.wv.w(vj0Var, "this$0");
        a.qo0 qo0Var = this.e;
        a.wv.w(qo0Var, "$onKeyboardHide");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        if (view.getRootView().getHeight() - rect.bottom > 200) {
            vj0Var.b = true;
        } else if (vj0Var.b && view.hasFocus()) {
            vj0Var.b = false;
            qo0Var.b();
        }
    }
}
