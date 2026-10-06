package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k31 implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    public final android.view.View c;
    public android.view.ViewTreeObserver d;
    public final java.lang.Runnable e;

    public k31(android.view.View view, java.lang.Runnable runnable) {
        this.c = view;
        this.d = view.getViewTreeObserver();
        this.e = runnable;
    }

    public static void a(android.view.View view, java.lang.Runnable runnable) {
        if (view == null) {
            throw new java.lang.NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new java.lang.NullPointerException("runnable == null");
        }
        a.k31 k31Var = new a.k31(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(k31Var);
        view.addOnAttachStateChangeListener(k31Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.d.isAlive();
        android.view.View view = this.c;
        if (isAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.e.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        boolean isAlive = this.d.isAlive();
        android.view.View view2 = this.c;
        if (isAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
