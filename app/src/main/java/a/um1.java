package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class um1 implements a.o01 {
    public a.pz0 c;
    public a.xz0 d;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar e;

    public um1(androidx.appcompat.widget.Toolbar toolbar) {
        this.e = toolbar;
    }

    @Override // a.o01
    public final void a(a.pz0 pz0Var, boolean z) {
    }

    @Override // a.o01
    public final boolean c(a.zi1 zi1Var) {
        return false;
    }

    @Override // a.o01
    public final boolean d() {
        return false;
    }

    @Override // a.o01
    public final void g() {
        if (this.d != null) {
            a.pz0 pz0Var = this.c;
            if (pz0Var != null) {
                int size = pz0Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.c.getItem(i) == this.d) {
                        return;
                    }
                }
            }
            i(this.d);
        }
    }

    @Override // a.o01
    public final void h(android.content.Context context, a.pz0 pz0Var) {
        a.xz0 xz0Var;
        a.pz0 pz0Var2 = this.c;
        if (pz0Var2 != null && (xz0Var = this.d) != null) {
            pz0Var2.d(xz0Var);
        }
        this.c = pz0Var;
    }

    @Override // a.o01
    public final boolean i(a.xz0 xz0Var) {
        androidx.appcompat.widget.Toolbar toolbar = this.e;
        android.view.KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof a.mv) {
            ((a.mv) callback).c();
        }
        toolbar.removeView(toolbar.mExpandedActionView);
        toolbar.removeView(toolbar.mCollapseButtonView);
        toolbar.mExpandedActionView = null;
        java.util.ArrayList arrayList = toolbar.mHiddenViews;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((android.view.View) arrayList.get(size));
        }
        arrayList.clear();
        this.d = null;
        toolbar.requestLayout();
        xz0Var.C = false;
        xz0Var.n.p(false);
        toolbar.ensureContentInsets();
        return true;
    }

    @Override // a.o01
    public final boolean j(a.xz0 xz0Var) {
        androidx.appcompat.widget.Toolbar toolbar = this.e;
        toolbar.ensureCollapseButtonView();
        android.view.ViewParent parent = toolbar.mCollapseButtonView.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
            }
            toolbar.addView(toolbar.mCollapseButtonView);
        }
        android.view.View actionView = xz0Var.getActionView();
        toolbar.mExpandedActionView = actionView;
        this.d = xz0Var;
        android.view.ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
            }
            a.vm1 h = androidx.appcompat.widget.Toolbar.h();
            h.f59a = (toolbar.mButtonGravity & 112) | 8388611;
            h.b = 2;
            toolbar.mExpandedActionView.setLayoutParams(h);
            toolbar.addView(toolbar.mExpandedActionView);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((a.vm1) childAt.getLayoutParams()).b != 2 && childAt != toolbar.mMenuView) {
                toolbar.removeViewAt(childCount);
                toolbar.mHiddenViews.add(childAt);
            }
        }
        toolbar.requestLayout();
        xz0Var.C = true;
        xz0Var.n.p(false);
        android.view.KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof a.mv) {
            ((a.mv) callback).b();
        }
        toolbar.ensureContentInsets();
        return true;
    }
    public void e(a.n01 p0) {
        throw new UnsupportedOperationException("Method not decompiled: um1.e");
    }
}
