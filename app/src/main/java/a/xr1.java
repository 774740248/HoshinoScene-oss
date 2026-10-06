package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xr1 implements android.view.View.OnAttachStateChangeListener {

    public xr1() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        view.removeOnAttachStateChangeListener(this);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.vp1.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
