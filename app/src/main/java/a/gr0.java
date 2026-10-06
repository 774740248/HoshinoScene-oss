package a;

import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gr0 extends a.gr1 {
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public int e;
    public int f;

    public gr0() {
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Rect();
        this.e = 0;
    }

    @Override // a.jy
    public final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        com.google.android.material.appbar.AppBarLayout v;
        a.du1 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (v = com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = android.view.View.MeasureSpec.getSize(i3);
        if (size > 0) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (a.rp1.b(v) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = v.getTotalScrollRange() + size;
        int measuredHeight = v.getMeasuredHeight();
        if ((ScrollingViewBehavior) this instanceof com.google.android.material.search.SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.checkLayoutParams(view, i, i2, android.view.View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // a.gr1
    public final void t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        com.google.android.material.appbar.AppBarLayout v = com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior.v(coordinatorLayout.getDependencies(view));
        if (v == null) {
            coordinatorLayout.offsetChildToAnchor(view, i);
            this.e = 0;
            return;
        }
        a.my myVar = (a.my) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) myVar).leftMargin;
        int bottom = v.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) myVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) myVar).rightMargin;
        int bottom2 = ((v.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((android.view.ViewGroup.MarginLayoutParams) myVar).bottomMargin;
        android.graphics.Rect rect = this.c;
        rect.set(paddingLeft, bottom, width, bottom2);
        a.du1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if (a.rp1.b(coordinatorLayout) && !a.rp1.b(view)) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
        }
        android.graphics.Rect rect2 = this.d;
        int i2 = myVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        a.wq0.b(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int u = u(v);
        view.layout(rect2.left, rect2.top - u, rect2.right, rect2.bottom - u);
        this.e = rect2.top - v.getBottom();
    }

    public final int u(android.view.View view) {
        int i;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof com.google.android.material.appbar.AppBarLayout) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            a.jy jyVar = ((a.my) appBarLayout.getLayoutParams()).f364a;
            int u = jyVar instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior ? ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) jyVar).u() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + u > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (u / i) + 1.0f;
            }
        }
        int i2 = this.f;
        return a.wv.y((int) (f * i2), 0, i2);
    }

    public gr0(int i) {
        super(0);
        this.c = new android.graphics.Rect();
        this.d = new android.graphics.Rect();
        this.e = 0;
    }
}
