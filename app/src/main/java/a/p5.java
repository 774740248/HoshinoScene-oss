package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class p5 extends a.ml {
    public static final /* synthetic */ int c = 0;
    private android.content.Context ctx;
    private final boolean floatingAppBar;
    private int floatingStatusBarTop;
    public a.pl1 themeMode;

    public static final void access$refreshScrollableInsets(a.p5 p5Var, android.view.View view) {
        p5Var.getClass();
        view.post(new a.so(view, 18, p5Var));
    }

    public static /* synthetic */ void autoLayout$default(a.p5 p5Var, android.content.res.Configuration configuration, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoLayout");
        }
        if ((i & 1) != 0) {
            configuration = null;
        }
        p5Var.autoLayout(configuration);
    }

    public static /* synthetic */ void excludeFromRecent$default(a.p5 p5Var, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: excludeFromRecent");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        p5Var.excludeFromRecent(z);
    }

    public static /* synthetic */ void fullScreen$default(a.p5 p5Var, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fullScreen");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        p5Var.fullScreen(z);
    }

    public static a.du1 i(a.p5 p5Var, android.view.View view, android.view.View view2, a.du1 du1Var) {
        a.wv.w(p5Var, "this$0");
        a.wv.w(view, "$mainView");
        a.wv.w(view2, "v");
        a.ns0 f = du1Var.f107a.f(7);
        a.wv.v(f, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        boolean floatingAppBar = p5Var.getFloatingAppBar();
        int i = f.b;
        int i2 = floatingAppBar ? 0 : i;
        if (p5Var.getFloatingAppBar()) {
            p5Var.floatingStatusBarTop = i;
            android.view.View findViewById = view.findViewById(2131363296);
            if (findViewById != null) {
                android.view.ViewParent parent = findViewById.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), i, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                    if (viewGroup.getTag(2131363241) == null) {
                        viewGroup.setTag(2131363241, java.lang.Boolean.TRUE);
                        p5Var.getWindow().setStatusBarColor(0);
                        a.ju1 h = a.jq1.h(p5Var.getWindow().getDecorView());
                        if (h != null) {
                            h.b(p5Var.getThemeMode().b);
                        }
                        android.content.res.TypedArray obtainStyledAttributes = p5Var.obtainStyledAttributes(new int[]{android.R.attr.statusBarColor});
                        try {
                            int color = obtainStyledAttributes.getColor(0, -16777216);
                            obtainStyledAttributes.close();
                            viewGroup.setBackgroundColor(a.sv.d(color, 179));
                            a.b91 b91Var = new a.b91(viewGroup, !p5Var.getThemeMode().b);
                            viewGroup.addOnAttachStateChangeListener(b91Var.n);
                            if (viewGroup.isAttachedToWindow()) {
                                viewGroup.getViewTreeObserver().addOnPreDrawListener(b91Var.m);
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        boolean n = n(view2);
        int i3 = f.c;
        int i4 = f.f391a;
        int i5 = f.d;
        if (n) {
            p5Var.j(view2, i5);
            view2.setPadding(i4, i2, i3, view2.getPaddingBottom());
        } else {
            view2.setPadding(i4, i2, i3, 0);
        }
        int i6 = android.os.Build.VERSION.SDK_INT;
        a.ut1 tt1Var = i6 >= 30 ? new a.tt1(du1Var) : i6 >= 29 ? new a.st1(du1Var) : new a.qt1(du1Var);
        tt1Var.c(7, a.ns0.b(0, 0, 0, i5));
        return tt1Var.b();
    }

    public static boolean n(android.view.View view) {
        return (view instanceof androidx.core.widget.NestedScrollView) || (view instanceof android.widget.ScrollView) || (view instanceof androidx.recyclerview.widget.RecyclerView) || (view instanceof android.widget.ListView);
    }

    @Override // a.ml, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        a.wv.w(context, "newBase");
        a.vj1 vj1Var = a.nb1.d;
        if (a.gy.x().b()) {
            context = new a.zd1(context);
        }
        this.ctx = context;
        super.attachBaseContext(context);
    }

    public void autoLayout(android.content.res.Configuration configuration) {
        a.ju1 h = a.jq1.h(getWindow().getDecorView());
        if (configuration == null) {
            configuration = getResources().getConfiguration();
        }
        if (getDisplayRatio() <= 1.7777778f || configuration.orientation != 2) {
            if (h != null) {
                h.f271a.E(7);
            }
            if (h != null) {
                h.f271a.E(128);
                return;
            }
            return;
        }
        if (h != null) {
            h.f271a.v(7);
        }
        if (h != null) {
            h.f271a.v(128);
        }
    }

    public final void continueOnBackPressed(a.a31 a31Var) {
        a.wv.w(a31Var, "<this>");
        a31Var.b(false);
        getOnBackPressedDispatcher().b();
        a31Var.b(true);
    }

    public final void excludeFromRecent(boolean z) {
        try {
            java.lang.Object systemService = getSystemService("activity");
            a.wv.t(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            for (android.app.ActivityManager.AppTask appTask : ((android.app.ActivityManager) systemService).getAppTasks()) {
                if (appTask.getTaskInfo().id == getTaskId()) {
                    appTask.setExcludeFromRecents(z);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void fullScreen(boolean z) {
        a.ju1 h = a.jq1.h(getWindow().getDecorView());
        if (z) {
            if (h != null) {
                h.f271a.v(7);
            }
            if (h != null) {
                h.f271a.v(1);
            }
            a.h21.b.a(this);
            return;
        }
        if (h != null) {
            h.f271a.E(7);
        }
        if (h != null) {
            h.f271a.E(1);
        }
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        android.content.Context context = this.ctx;
        if (context != null) {
            return context;
        }
        a.wv.M1("ctx");
        throw null;
    }

    public final android.content.Context getContext() {
        return this;
    }

    public final float getDisplayRatio() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        return i > i2 ? i / i2 : i2 / i;
    }

    public boolean getFloatingAppBar() {
        return this.floatingAppBar;
    }

    @Override // a.ml, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.Context context = this.ctx;
        if (context == null) {
            a.wv.M1("ctx");
            throw null;
        }
        android.content.res.Resources resources = context.getResources();
        a.wv.v(resources, "ctx.resources");
        return resources;
    }

    public final a.pl1 getThemeMode() {
        a.pl1 pl1Var = this.themeMode;
        if (pl1Var != null) {
            return pl1Var;
        }
        a.wv.M1("themeMode");
        throw null;
    }

    public final void j(android.view.View view, int i) {
        if (n(view)) {
            if (view instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view).setClipToPadding(false);
            }
            if (getFloatingAppBar() && getFloatingAppBar()) {
                if (view.getTag(2131363242) == null) {
                    view.setTag(2131363242, java.lang.Integer.valueOf(view.getPaddingTop()));
                }
                java.lang.Object tag = view.getTag(2131363242);
                a.wv.t(tag, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) tag).intValue();
                int paddingLeft = view.getPaddingLeft();
                int i2 = intValue + this.floatingStatusBarTop;
                android.util.TypedValue typedValue = new android.util.TypedValue();
                view.setPadding(paddingLeft, i2 + (getTheme().resolveAttribute(2130968579, typedValue, true) ? android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : (int) (getResources().getDisplayMetrics().density * 56.0f)), view.getPaddingRight(), view.getPaddingBottom());
            }
            if (view.getTag(2131363243) == null) {
                view.setTag(2131363243, java.lang.Integer.valueOf(view.getPaddingBottom()));
            }
            java.lang.Object tag2 = view.getTag(2131363243);
            a.wv.t(tag2, "null cannot be cast to non-null type kotlin.Int");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((java.lang.Integer) tag2).intValue() + i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a.z21, java.lang.Object] */
    public final void k() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(android.R.id.content);
        if (viewGroup == null) {
            return;
        }
        a.z21 obj = new a.z21();
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.xp1.u(viewGroup, obj);
        a.vp1.c(viewGroup);
        final android.view.View childAt = viewGroup.getChildAt(0);
        if (childAt == null || childAt.getFitsSystemWindows()) {
            return;
        }
        a.xp1.u(childAt, new a.m5());
        android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup2 != null) {
            viewGroup2.setOnHierarchyChangeListener(new a.n5(this, childAt));
        }
        childAt.post(new a.so(childAt, 18, this));
        a.vp1.c(childAt);
    }

    public final void l() {
        int i = android.os.Build.VERSION.SDK_INT;
        getWindow().setNavigationBarColor(0);
        if (i >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        a.ju1 h = a.jq1.h(getWindow().getDecorView());
        if (h == null) {
            return;
        }
        h.a(getThemeMode().b);
    }

    public final void m(android.view.View view) {
        if (n(view)) {
            if (view.getTag(2131363244) == null) {
                view.setTag(2131363244, java.lang.Boolean.TRUE);
                a.m6 m6Var = new a.m6(this);
                java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                a.xp1.u(view, m6Var);
                return;
            }
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                a.wv.v(childAt, "view.getChildAt(i)");
                m(childAt);
            }
        }
    }

    @Override // a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        setThemeMode(a.ql1.e(this));
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        a.vj1 vj1Var = a.nb1.d;
        if (a.gy.x().b()) {
            android.view.LayoutInflater layoutInflater = getLayoutInflater();
            a.wv.v(layoutInflater, "activity.layoutInflater");
            layoutInflater.setFactory2(new a.wu0(this, a.gy.x()));
        }
        super.onCreate(bundle);
        setThemeMode(a.ql1.e(this));
        l();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.LinkedHashMap linkedHashMap = a.wr.h;
        linkedHashMap.remove(java.lang.Integer.valueOf(hashCode()));
        if (!linkedHashMap.isEmpty()) {
            android.util.LruCache lruCache = a.wr.g;
            java.util.Collection values = linkedHashMap.values();
            a.wv.v(values, "wallpaperStack.values");
            a.wr.f = (android.graphics.Bitmap) lruCache.get(a.qv.k2(values));
        }
        if (isTaskRoot()) {
            a.q10 q10Var = a.q10.f457a;
            if (a.wv.e(a.q10.t(), "basic")) {
                return;
            }
            a.wv.M0(a.wv.b(a.z80.b), null, new a.o5(this, null), 3);
        }
    }

    @Override // a.kk0, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void setBackArrow() {
        android.view.View findViewById = findViewById(2131363296);
        a.wv.t(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById;
        setSupportActionBar(toolbar);
        a.d1 supportActionBar = getSupportActionBar();
        a.wv.s(supportActionBar);
        supportActionBar.n();
        a.d1 supportActionBar2 = getSupportActionBar();
        a.wv.s(supportActionBar2);
        supportActionBar2.m(true);
        toolbar.setNavigationOnClickListener(new a.gv(18, this));
    }

    @Override // a.ml, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(i);
        k();
    }

    public final void setThemeMode(a.pl1 pl1Var) {
        a.wv.w(pl1Var, "<set-?>");
        this.themeMode = pl1Var;
    }

    @Override // a.ml, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        super.setContentView(view);
        k();
    }

    @Override // a.ml, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        a.wv.w(view, "view");
        super.setContentView(view, layoutParams);
        k();
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        a.vj1 vj1Var = a.nb1.d;
        if (a.gy.x().b()) {
            android.view.LayoutInflater layoutInflater = getLayoutInflater();
            a.wv.v(layoutInflater, "activity.layoutInflater");
            layoutInflater.setFactory2(new a.wu0(this, a.gy.x()));
        }
        super.onCreate(bundle, persistableBundle);
        setThemeMode(a.ql1.e(this));
        l();
    }
}
