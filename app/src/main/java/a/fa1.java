package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fa1 extends a.u {
    public final androidx.recyclerview.widget.RecyclerView d;
    public final a.ea1 e;

    public fa1(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.d = recyclerView;
        a.ea1 ea1Var = this.e;
        if (ea1Var != null) {
            this.e = ea1Var;
        } else {
            this.e = new a.ea1(this);
        }
    }

    @Override // a.u
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || this.d.P()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().d0(accessibilityEvent);
        }
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        this.f573a.onInitializeAccessibilityNodeInfo(view, g0Var.f165a);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.d;
        layoutManager.e0(recyclerView2.e, recyclerView2.j0, g0Var);
    }

    @Override // a.u
    public final boolean g(android.view.View view, int i, android.os.Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        if (super.g(view, i, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView.P() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        androidx.recyclerview.widget.a layoutManager = recyclerView.getLayoutManager();
        a.t91 t91Var = layoutManager.d.e;
        int i2 = layoutManager.q;
        int i3 = layoutManager.p;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (layoutManager.d.getMatrix().isIdentity() && layoutManager.d.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            paddingTop = layoutManager.d.canScrollVertically(1) ? (i2 - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom() : 0;
            if (layoutManager.d.canScrollHorizontally(1)) {
                paddingLeft = (i3 - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
            }
            paddingLeft = 0;
        } else if (i != 8192) {
            paddingTop = 0;
            paddingLeft = 0;
        } else {
            paddingTop = layoutManager.d.canScrollVertically(-1) ? -((i2 - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom()) : 0;
            if (layoutManager.d.canScrollHorizontally(-1)) {
                paddingLeft = -((i3 - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight());
            }
            paddingLeft = 0;
        }
        if (paddingTop == 0 && paddingLeft == 0) {
            return false;
        }
        layoutManager.d.k0(paddingLeft, paddingTop, true);
        return true;
    }
}
