package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s90 extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f522a;
    public a.pq1 b;
    public final a.hw c = new a.hw(7, this);
    public final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout d;

    public s90(androidx.drawerlayout.widget.DrawerLayout drawerLayout, int i) {
        this.d = drawerLayout;
        this.f522a = i;
    }

    @Override // a.oq1
    public final int d(android.view.View view, int i) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
            return java.lang.Math.max(-view.getWidth(), java.lang.Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return java.lang.Math.max(width - view.getWidth(), java.lang.Math.min(i, width));
    }

    @Override // a.oq1
    public final int e(android.view.View view, int i) {
        return view.getTop();
    }

    @Override // a.oq1
    public final int f(android.view.View view) {
        this.d.getClass();
        if (this.d.isDrawerVisible(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // a.oq1
    public final void h(int i, int i2) {
        int i3 = i & 1;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        android.view.View d = i3 == 1 ? drawerLayout.findDrawerWithGravity(3) : drawerLayout.findDrawerWithGravity(5);
        if (d == null || drawerLayout.getDrawerLockMode(d) != 0) {
            return;
        }
        this.b.b(d, i2);
    }

    @Override // a.oq1
    public final void i() {
        this.d.postDelayed(this.c, 160L);
    }

    @Override // a.oq1
    public final void j(android.view.View view, int i) {
        ((a.q90) view.getLayoutParams()).c = false;
        int i2 = this.f522a == 3 ? 5 : 3;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        android.view.View d = drawerLayout.findDrawerWithGravity(i2);
        if (d != null) {
            drawerLayout.closeDrawer(d);
        }
    }

    @Override // a.oq1
    public final void k(int i) {
        int i2;
        int size;
        int size2;
        android.view.View rootView;
        int size3;
        android.view.View view = this.b.t;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        int i3 = drawerLayout.mRightDragger.mAbsGravity;
        int i4 = drawerLayout.mLeftCallback.mAbsGravity;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((a.q90) view.getLayoutParams()).b;
            if (f == 0.0f) {
                a.q90 q90Var = (a.q90) view.getLayoutParams();
                if ((q90Var.d & 1) == 1) {
                    q90Var.d = 0;
                    java.util.List arrayList = drawerLayout.mListeners;
                    if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                        a.ai1.t(drawerLayout.mListeners.get(size3));
                        throw null;
                    }
                    drawerLayout.openDrawer(view, false);
                    drawerLayout.openDrawer(view);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                a.q90 q90Var2 = (a.q90) view.getLayoutParams();
                if ((q90Var2.d & 1) == 0) {
                    q90Var2.d = 1;
                    java.util.List arrayList2 = drawerLayout.mListeners;
                    if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
                        a.ai1.t(drawerLayout.mListeners.get(size2));
                        throw null;
                    }
                    drawerLayout.openDrawer(view, true);
                    drawerLayout.openDrawer(view);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != drawerLayout.mDrawerState) {
            drawerLayout.mDrawerState = i2;
            java.util.List arrayList3 = drawerLayout.mListeners;
            if (arrayList3 == null || (size = arrayList3.size() - 1) < 0) {
                return;
            }
            a.ai1.t(drawerLayout.mListeners.get(size));
            throw null;
        }
    }

    @Override // a.oq1
    public final void l(android.view.View view, int i, int i2) {
        int width = view.getWidth();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        float width2 = (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.setDrawerViewOffset(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // a.oq1
    public final void m(android.view.View view, float f, float f2) {
        int i;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        drawerLayout.getClass();
        float f3 = ((a.q90) view.getLayoutParams()).b;
        int width = view.getWidth();
        if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.b.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // a.oq1
    public final boolean n(android.view.View view, int i) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.d;
        drawerLayout.getClass();
        return this.d.isDrawerVisible(view) && drawerLayout.checkDrawerViewAbsoluteGravity(view, this.f522a) && drawerLayout.getDrawerLockMode(view) == 0;
    }
    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: s90.a");
    }
}
