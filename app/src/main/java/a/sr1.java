package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f537a;

    public sr1(android.view.View view) {
        this.f537a = new java.lang.ref.WeakReference(view);
    }

    public final void a(float f) {
        android.view.View view = (android.view.View) this.f537a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        android.view.View view = (android.view.View) this.f537a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        android.view.View view = (android.view.View) this.f537a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(a.vr1 vr1Var) {
        android.view.View view = (android.view.View) this.f537a.get();
        if (view != null) {
            if (vr1Var != null) {
                view.animate().setListener(new a.qr1(this, vr1Var, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        android.view.View view = (android.view.View) this.f537a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
