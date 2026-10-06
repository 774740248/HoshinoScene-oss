package a;

import android.view.MenuItem.OnMenuItemClickListener;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class an1 extends a.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.bn1 f20a;
    public final android.view.Window.Callback b;
    public final a.ym1 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final java.util.ArrayList g = new java.util.ArrayList();
    public final a.hw h = new a.hw(1, this);

    public an1(androidx.appcompat.widget.Toolbar toolbar, java.lang.CharSequence charSequence, a.em emVar) {
        a.ym1 ym1Var = new a.ym1(this);
        toolbar.getClass();
        a.bn1 bn1Var = new a.bn1(toolbar, false);
        this.f20a = bn1Var;
        emVar.getClass();
        this.b = emVar;
        bn1Var.k = emVar;
        toolbar.setOnMenuItemClickListener((OnMenuItemClickListener) ym1Var);
        if (!bn1Var.g) {
            bn1Var.h = charSequence;
            if ((bn1Var.b & 8) != 0) {
                androidx.appcompat.widget.Toolbar toolbar2 = bn1Var.f47a;
                toolbar2.setTitle(charSequence);
                if (bn1Var.g) {
                    a.jq1.p(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.c = new a.ym1(this);
    }

    @Override // a.d1
    public final boolean a() {
        a.j2 j2Var;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f20a.f47a.mMenuView;
        return (actionMenuView == null || (j2Var = actionMenuView.mPresenter) == null || !j2Var.f()) ? false : true;
    }

    @Override // a.d1
    public final boolean b() {
        a.xz0 xz0Var;
        a.um1 um1Var = this.f20a.f47a.O;
        if (um1Var == null || (xz0Var = um1Var.d) == null) {
            return false;
        }
        if (um1Var == null) {
            xz0Var = null;
        }
        if (xz0Var == null) {
            return true;
        }
        xz0Var.collapseActionView();
        return true;
    }

    @Override // a.d1
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        java.util.ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        a.ai1.t(arrayList.get(0));
        throw null;
    }

    @Override // a.d1
    public final int d() {
        return this.f20a.b;
    }

    @Override // a.d1
    public final android.content.Context e() {
        return this.f20a.f47a.getContext();
    }

    @Override // a.d1
    public final boolean f() {
        a.bn1 bn1Var = this.f20a;
        androidx.appcompat.widget.Toolbar toolbar = bn1Var.f47a;
        a.hw hwVar = this.h;
        toolbar.removeCallbacks(hwVar);
        androidx.appcompat.widget.Toolbar toolbar2 = bn1Var.f47a;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.m(toolbar2, hwVar);
        return true;
    }

    @Override // a.d1
    public final void g() {
    }

    @Override // a.d1
    public final void h() {
        this.f20a.f47a.removeCallbacks(this.h);
    }

    @Override // a.d1
    public final boolean i(int i, android.view.KeyEvent keyEvent) {
        android.view.Menu r = r();
        if (r == null) {
            return false;
        }
        r.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return r.performShortcut(i, keyEvent, 0);
    }

    @Override // a.d1
    public final boolean j(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // a.d1
    public final boolean k() {
        return this.f20a.f47a.isOverflowMenuShowPending();
    }

    @Override // a.d1
    public final void l(boolean z) {
    }

    @Override // a.d1
    public final void m(boolean z) {
        a.bn1 bn1Var = this.f20a;
        bn1Var.a((bn1Var.b & (-5)) | 4);
    }

    @Override // a.d1
    public final void n() {
    }

    @Override // a.d1
    public final void o(boolean z) {
    }

    @Override // a.d1
    public final void p(java.lang.CharSequence charSequence) {
        a.bn1 bn1Var = this.f20a;
        if (bn1Var.g) {
            return;
        }
        bn1Var.h = charSequence;
        if ((bn1Var.b & 8) != 0) {
            androidx.appcompat.widget.Toolbar toolbar = bn1Var.f47a;
            toolbar.setTitle(charSequence);
            if (bn1Var.g) {
                a.jq1.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, a.zm1, a.n01] */
    public final android.view.Menu r() {
        boolean z = this.e;
        a.bn1 bn1Var = this.f20a;
        if (!z) {
            zm1 obj = new zm1();
            obj.d = this;
            a.ym1 ym1Var = new a.ym1(this);
            androidx.appcompat.widget.Toolbar toolbar = bn1Var.f47a;
            toolbar.P = obj;
            toolbar.Q = ym1Var;
            androidx.appcompat.widget.ActionMenuView actionMenuView = toolbar.mMenuView;
            if (actionMenuView != null) {
                actionMenuView.mActionMenuPresenterCallback = obj;
                actionMenuView.mMenuBuilderCallback = ym1Var;
            }
            this.e = true;
        }
        return bn1Var.f47a.getMenu();
    }
}
