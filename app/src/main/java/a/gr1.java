package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gr1 extends a.jy {

    public java.lang.ref.WeakReference n;

    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        w(coordinatorLayout, appBarLayout, 0);
    }

    public void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
    }

    public static android.view.View z(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        return null;
    }

    /* renamed from: a, reason: collision with root package name */
    public a.hr1 f189a;
    public int b = 0;

    public gr1() {
    }

    @Override // a.jy
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        t(coordinatorLayout, view, i);
        if (this.f189a == null) {
            this.f189a = new a.hr1(view);
        }
        a.hr1 hr1Var = this.f189a;
        android.view.View view2 = hr1Var.f214a;
        hr1Var.b = view2.getTop();
        hr1Var.c = view2.getLeft();
        this.f189a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        a.hr1 hr1Var2 = this.f189a;
        if (hr1Var2.d != i2) {
            hr1Var2.d = i2;
            hr1Var2.a();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        a.hr1 hr1Var = this.f189a;
        if (hr1Var != null) {
            return hr1Var.d;
        }
        return 0;
    }

    public void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        coordinatorLayout.offsetChildToAnchor(view, i);
    }

    public gr1(int i) {
    }
}
