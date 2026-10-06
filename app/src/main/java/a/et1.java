package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class et1 extends a.d1 implements a.j1 {
    public static final android.view.animation.AccelerateInterpolator y = new android.view.animation.AccelerateInterpolator();
    public static final android.view.animation.DecelerateInterpolator z = new android.view.animation.DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f136a;
    public android.content.Context b;
    public androidx.appcompat.widget.ActionBarOverlayLayout c;
    public androidx.appcompat.widget.ActionBarContainer d;
    public a.d20 e;
    public androidx.appcompat.widget.ActionBarContextView f;
    public final android.view.View g;
    public boolean h;
    public a.dt1 i;
    public a.dt1 j;
    public a.n2 k;
    public boolean l;
    public final java.util.ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public a.ur1 s;
    public boolean t;
    public boolean u;
    public final a.ct1 v;
    public final a.ct1 w;
    public final a.vu0 x;

    public et1(android.app.Activity activity, boolean z2) {
        new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a.ct1(this, 0);
        this.w = new a.ct1(this, 1);
        this.x = new a.vu0(1, this);
        android.view.View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(android.R.id.content);
    }

    @Override // a.d1
    public final boolean b() {
        a.um1 um1Var;
        a.d20 d20Var = this.e;
        if (d20Var == null || (um1Var = ((a.bn1) d20Var).f47a.O) == null || um1Var.d == null) {
            return false;
        }
        a.um1 um1Var2 = ((a.bn1) d20Var).f47a.O;
        a.xz0 xz0Var = um1Var2 == null ? null : um1Var2.d;
        if (xz0Var == null) {
            return true;
        }
        xz0Var.collapseActionView();
        return true;
    }

    @Override // a.d1
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        java.util.ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        a.ai1.t(arrayList.get(0));
        throw null;
    }

    @Override // a.d1
    public final int d() {
        return ((a.bn1) this.e).b;
    }

    @Override // a.d1
    public final android.content.Context e() {
        if (this.b == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f136a.getTheme().resolveAttribute(2130968586, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new android.view.ContextThemeWrapper(this.f136a, i);
            } else {
                this.b = this.f136a;
            }
        }
        return this.b;
    }

    @Override // a.d1
    public final void g() {
        t(this.f136a.getResources().getBoolean(2131034112));
    }

    @Override // a.d1
    public final boolean i(int i, android.view.KeyEvent keyEvent) {
        a.pz0 pz0Var;
        a.dt1 dt1Var = this.i;
        if (dt1Var == null || (pz0Var = dt1Var.f) == null) {
            return false;
        }
        pz0Var.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return pz0Var.performShortcut(i, keyEvent, 0);
    }

    @Override // a.d1
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        m(z2);
    }

    @Override // a.d1
    public final void m(boolean z2) {
        int i = z2 ? 4 : 0;
        a.bn1 bn1Var = (a.bn1) this.e;
        int i2 = bn1Var.b;
        this.h = true;
        bn1Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // a.d1
    public final void n() {
        this.e.getClass();
    }

    @Override // a.d1
    public final void o(boolean z2) {
        a.ur1 ur1Var;
        this.t = z2;
        if (z2 || (ur1Var = this.s) == null) {
            return;
        }
        ur1Var.a();
    }

    @Override // a.d1
    public final void p(java.lang.CharSequence charSequence) {
        a.bn1 bn1Var = (a.bn1) this.e;
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

    @Override // a.d1
    public final a.o2 q(a.bm bmVar) {
        a.dt1 dt1Var = this.i;
        if (dt1Var != null) {
            dt1Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.killMode();
        a.dt1 dt1Var2 = new a.dt1(this, this.f.getContext(), bmVar);
        a.pz0 pz0Var = dt1Var2.f;
        pz0Var.x();
        try {
            if (!dt1Var2.g.f(dt1Var2, pz0Var)) {
                return null;
            }
            this.i = dt1Var2;
            dt1Var2.h();
            this.f.initForMode(dt1Var2);
            r(true);
            return dt1Var2;
        } finally {
            pz0Var.w();
        }
    }

    public final void r(boolean z2) {
        a.sr1 l;
        a.sr1 sr1Var;
        if (z2) {
            if (!this.q) {
                this.q = true;
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (this.q) {
            this.q = false;
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.d;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (!a.up1.c(actionBarContainer)) {
            if (z2) {
                ((a.bn1) this.e).f47a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((a.bn1) this.e).f47a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            a.bn1 bn1Var = (a.bn1) this.e;
            l = a.jq1.a(bn1Var.f47a);
            l.a(0.0f);
            l.c(100L);
            l.d(new a.tr1(bn1Var, 4));
            sr1Var = this.f.setupAnimatorToVisibility(0, 200L);
        } else {
            a.bn1 bn1Var2 = (a.bn1) this.e;
            a.sr1 a2 = a.jq1.a(bn1Var2.f47a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new a.tr1(bn1Var2, 0));
            l = this.f.setupAnimatorToVisibility(8, 100L);
            sr1Var = a2;
        }
        a.ur1 ur1Var = new a.ur1();
        java.util.ArrayList arrayList = ur1Var.f605a;
        arrayList.add(l);
        android.view.View view = (android.view.View) l.f537a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        android.view.View view2 = (android.view.View) sr1Var.f537a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(sr1Var);
        ur1Var.b();
    }

    public final void s(android.view.View view) {
        a.d20 wrapper;
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) view.findViewById(2131362349);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback((a.j1) this);
        }
        android.view.KeyEvent.Callback findViewById = view.findViewById(2131361903);
        if (findViewById instanceof a.d20) {
            wrapper = (a.d20) findViewById;
        } else {
            if (!(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
                throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((androidx.appcompat.widget.Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (androidx.appcompat.widget.ActionBarContextView) view.findViewById(2131361913);
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) view.findViewById(2131361905);
        this.d = actionBarContainer;
        a.d20 d20Var = this.e;
        if (d20Var == null || this.f == null || actionBarContainer == null) {
            throw new java.lang.IllegalStateException(a.et1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        android.content.Context context = ((a.bn1) d20Var).f47a.getContext();
        this.f136a = context;
        if ((((a.bn1) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        n();
        t(context.getResources().getBoolean(2131034112));
        android.content.res.TypedArray obtainStyledAttributes = this.f136a.obtainStyledAttributes(null, a.u81.f583a, 2130968581, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.mOverlayMode) {
                throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            androidx.appcompat.widget.ActionBarContainer actionBarContainer2 = this.d;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.xp1.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void t(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((a.bn1) this.e).getClass();
        } else {
            ((a.bn1) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((a.bn1) this.e).f47a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void u(boolean z2) {
        int i = 0;
        boolean z3 = this.q || !this.p;
        a.vu0 vu0Var = this.x;
        android.view.View view = this.g;
        if (!z3) {
            if (this.r) {
                this.r = false;
                a.ur1 ur1Var = this.s;
                if (ur1Var != null) {
                    ur1Var.a();
                }
                int i2 = this.n;
                a.ct1 ct1Var = this.v;
                if (i2 != 0 || (!this.t && !z2)) {
                    ct1Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                a.ur1 ur1Var2 = new a.ur1();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = new int[]{0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                a.sr1 a2 = a.jq1.a(this.d);
                a2.e(f);
                android.view.View view2 = (android.view.View) a2.f537a.get();
                if (view2 != null) {
                    a.rr1.a(view2.animate(), vu0Var != null ? new a.pr1(vu0Var, i, view2) : null);
                }
                boolean z4 = ur1Var2.e;
                java.util.ArrayList arrayList = ur1Var2.f605a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.o && view != null) {
                    a.sr1 a3 = a.jq1.a(view);
                    a3.e(f);
                    if (!ur1Var2.e) {
                        arrayList.add(a3);
                    }
                }
                android.view.animation.AccelerateInterpolator accelerateInterpolator = y;
                boolean z5 = ur1Var2.e;
                if (!z5) {
                    ur1Var2.c = accelerateInterpolator;
                }
                if (!z5) {
                    ur1Var2.b = 250L;
                }
                if (!z5) {
                    ur1Var2.d = ct1Var;
                }
                this.s = ur1Var2;
                ur1Var2.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        a.ur1 ur1Var3 = this.s;
        if (ur1Var3 != null) {
            ur1Var3.a();
        }
        this.d.setVisibility(0);
        int i3 = this.n;
        a.ct1 ct1Var2 = this.w;
        if (i3 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr3 = new int[]{0, 0};
                this.d.getLocationInWindow(iArr3);
                f2 -= iArr3[1];
            }
            this.d.setTranslationY(f2);
            a.ur1 ur1Var4 = new a.ur1();
            a.sr1 a4 = a.jq1.a(this.d);
            a4.e(0.0f);
            android.view.View view3 = (android.view.View) a4.f537a.get();
            if (view3 != null) {
                a.rr1.a(view3.animate(), vu0Var != null ? new a.pr1(vu0Var, i, view3) : null);
            }
            boolean z6 = ur1Var4.e;
            java.util.ArrayList arrayList2 = ur1Var4.f605a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                a.sr1 a5 = a.jq1.a(view);
                a5.e(0.0f);
                if (!ur1Var4.e) {
                    arrayList2.add(a5);
                }
            }
            android.view.animation.DecelerateInterpolator decelerateInterpolator = z;
            boolean z7 = ur1Var4.e;
            if (!z7) {
                ur1Var4.c = decelerateInterpolator;
            }
            if (!z7) {
                ur1Var4.b = 250L;
            }
            if (!z7) {
                ur1Var4.d = ct1Var2;
            }
            this.s = ur1Var4;
            ur1Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            ct1Var2.a();
        }
        androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.vp1.c(actionBarOverlayLayout);
        }
    }

    public et1(android.app.Dialog dialog) {
        new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a.ct1(this, 0);
        this.w = new a.ct1(this, 1);
        this.x = new a.vu0(1, this);
        s(dialog.getWindow().getDecorView());
    }
}
