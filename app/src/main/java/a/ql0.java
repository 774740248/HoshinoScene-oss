package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ql0 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ androidx.fragment.app.a d;
    public final /* synthetic */ java.lang.Object e;

    public ql0(a.rl0 rl0Var, androidx.fragment.app.a aVar) {
        this.e = rl0Var;
        this.d = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i = this.c;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                androidx.fragment.app.a aVar = this.d;
                a.gk0 gk0Var = aVar.c;
                aVar.k();
                a.ji1.f((android.view.ViewGroup) gk0Var.H.getParent(), ((a.rl0) obj).c.A()).e();
                return;
            default:
                android.view.View view2 = (android.view.View) obj;
                view2.removeOnAttachStateChangeListener(this);
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.vp1.c(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }

    public ql0(androidx.fragment.app.a aVar, android.view.View view) {
        this.d = aVar;
        this.e = view;
    }
}
