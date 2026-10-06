package com.omarea.ui.apps;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class Games extends android.widget.LinearLayout {
    public static final /* synthetic */ a.gu0[] l;
    public final a.yq1 c;
    public final a.yq1 d;
    public final a.yq1 e;
    public final a.yq1 f;
    public final a.yq1 g;
    public final a.yq1 h;
    public final a.wp0 i;
    public final java.lang.String j;
    public final a.b81 k;

    static {
        a.d81 d81Var = new a.d81(com.omarea.ui.apps.Games.class, "fast_share", "getFast_share()Landroid/widget/ImageButton;");
        a.na1.f375a.getClass();
        l = new a.gu0[]{d81Var, new a.d81(com.omarea.ui.apps.Games.class, "games", "getGames()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.ui.apps.Games.class, "lock", "getLock()Landroid/widget/CheckBox;"), new a.d81(com.omarea.ui.apps.Games.class, "remote_play", "getRemote_play()Landroid/widget/ImageButton;"), new a.d81(com.omarea.ui.apps.Games.class, "sort", "getSort()Landroid/widget/ImageButton;"), new a.d81(com.omarea.ui.apps.Games.class, "sort_confirm", "getSort_confirm()Landroid/widget/ImageButton;")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [a.wp0, java.lang.Object] */
    public Games(final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.c = a.b20.j(this, 2131362478);
        this.d = a.b20.j(this, 2131362582);
        this.e = a.b20.j(this, 2131362750);
        this.f = a.b20.j(this, 2131363012);
        this.g = a.b20.j(this, 2131363157);
        this.h = a.b20.j(this, 2131363159);
        this.i = new a.wp0();
        this.j = "sorted_packages";
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.b);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.NavItem)");
        final int i = 1;
        android.view.LayoutInflater.from(context).inflate(2131558618, (android.view.ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        g(null);
        h();
        this.k = new a.b81((android.app.Activity) context, null);
        final int i2 = 0;
        getSort().setOnClickListener(new a.rp0(this));
        getSort_confirm().setOnClickListener(new a.rp0(this));
        android.widget.CheckBox lock = getLock();
        a.cp cpVar = com.omarea.Scene.c;
        lock.setChecked(a.fs1.s("games_visible", true));
        final int i3 = 2;
        getLock().setOnClickListener(new a.rp0(this));
        getGames().setVisibility(getLock().isChecked() ? 0 : 8);
        getSort().setVisibility(getGames().getVisibility());
        getRemote_play().setOnClickListener(new a.sp0());
        getFast_share().setOnClickListener(new a.sp0());
    }

    public static void a(com.omarea.ui.apps.Games games, com.omarea.model.AppInfo appInfo) {
        a.wv.w(games, "this$0");
        a.wv.w(appInfo, "$appInfo");
        android.content.Context context = games.getContext();
        a.wv.v(context, "context");
        a.wv.v(context.getResources().getStringArray(2130903050), "context.resources.getStr…y.config_games_blacklist)");
        a.wv.s(context.getPackageManager());
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("games", 0);
        a.wv.s(sharedPreferences);
        java.lang.String packageName = appInfo.getPackageName();
        a.wv.w(packageName, "app");
        sharedPreferences.edit().putBoolean(packageName, false).apply();
        a.fh fhVar = (a.fh) games.getGames().getAdapter();
        if (fhVar != null) {
            fhVar.g.remove(appInfo);
            fhVar.j.remove(appInfo);
            fhVar.f();
        }
    }

    public static void b(com.omarea.ui.apps.Games games, android.view.View view) {
        a.wv.w(games, "this$0");
        a.wp0 wp0Var = games.i;
        wp0Var.f670a = false;
        a.e91 adapter = games.getGames().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppGrid2");
        a.fh fhVar = (a.fh) adapter;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.omarea.model.AppInfo appInfo : (Iterable<com.omarea.model.AppInfo>) (fhVar.l ? fhVar.g : fhVar.j)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(appInfo.getPackageName());
        }
        games.getShortConfig().edit().clear().putString(games.j, sb.toString()).apply();
        fhVar.q(wp0Var.f670a);
        games.getSort().setVisibility(0);
        view.setVisibility(8);
        games.getLock().setVisibility(0);
    }

    public static void c(com.omarea.ui.apps.Games games, android.view.View view) {
        a.wv.w(games, "this$0");
        games.getSort_confirm().setVisibility(0);
        view.setVisibility(8);
        games.getLock().setVisibility(8);
        a.wp0 wp0Var = games.i;
        wp0Var.f670a = true;
        a.e91 adapter = games.getGames().getAdapter();
        a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterAppGrid2");
        ((a.fh) adapter).q(wp0Var.f670a);
    }

    public static void d(com.omarea.ui.apps.Games games, android.view.View view) {
        a.wv.w(games, "this$0");
        a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
        boolean isChecked = ((android.widget.CompoundButton) view).isChecked();
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.N("games_visible", isChecked);
        games.getGames().setVisibility(isChecked ? 0 : 8);
        games.getSort().setVisibility(games.getGames().getVisibility());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.booleanValue() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.omarea.ui.apps.Games r2, com.omarea.model.AppInfo r3) {
        /*
            r2.getClass()
            java.lang.Boolean r0 = r3.enabled
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            java.lang.Boolean r0 = r3.suspended
            java.lang.String r1 = "appInfo.suspended"
            a.wv.v(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
        L18:
            java.lang.String r0 = r3.getPackageName()
            a.tg1 r1 = a.me1.m
            a.tg1.t(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.enabled = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.suspended = r0
            androidx.recyclerview.widget.RecyclerView r0 = r2.getGames()
            a.e91 r0 = r0.getAdapter()
            a.fh r0 = (a.fh) r0
            if (r0 == 0) goto L38
            r0.f()
        L38:
            a.me1 r0 = a.me1.p
            if (r0 == 0) goto L43
            java.lang.String r1 = r3.getPackageName()
            r0.m(r1)
        L43:
            a.l1 r0 = new a.l1
            android.content.Context r2 = r2.getContext()
            java.lang.String r1 = "this.context"
            a.wv.v(r2, r1)
            r1 = 2
            r0.<init>(r2, r1)
            java.lang.String r2 = r3.getPackageName()
            java.lang.String r3 = "packageName"
            a.wv.w(r2, r3)
            android.content.Context r3 = r0.b     // Catch: java.lang.Exception -> L68
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Exception -> L68
            android.content.Intent r2 = r3.getLaunchIntentForPackage(r2)     // Catch: java.lang.Exception -> L68
            r0.n(r2)     // Catch: java.lang.Exception -> L68
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.ui.apps.Games.f(com.omarea.ui.apps.Games, com.omarea.model.AppInfo):void");
    }

    private final android.widget.ImageButton getFast_share() {
        return (android.widget.ImageButton) this.c.a(l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.recyclerview.widget.RecyclerView getGames() {
        return (androidx.recyclerview.widget.RecyclerView) this.d.a(l[1]);
    }

    private final android.widget.CheckBox getLock() {
        return (android.widget.CheckBox) this.e.a(l[2]);
    }

    private final android.widget.ImageButton getRemote_play() {
        return (android.widget.ImageButton) this.f.a(l[3]);
    }

    private final android.content.SharedPreferences getShortConfig() {
        android.content.SharedPreferences sharedPreferences = getContext().getSharedPreferences("apps_sort", 0);
        a.wv.v(sharedPreferences, "context.getSharedPrefere…t\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final android.widget.ImageButton getSort() {
        return (android.widget.ImageButton) this.g.a(l[4]);
    }

    private final android.widget.ImageButton getSort_confirm() {
        return (android.widget.ImageButton) this.h.a(l[5]);
    }

    public final void g(android.content.res.Configuration configuration) {
        if (configuration == null) {
            configuration = getResources().getConfiguration();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(2131362582);
        int i = configuration.orientation == 2 ? 6 : 4;
        androidx.recyclerview.widget.a layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).z1(i);
        } else if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(i));
        }
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = a.b20.N(this, configuration.orientation == 2 ? 150.0f : 230.0f);
        recyclerView.setLayoutParams(layoutParams);
    }

    public final void h() {
        a.wv.M0(a.wv.b(a.z80.b), null, new a.bq0(getShortConfig(), this, null), 3);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g(configuration);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.5f);
        }
    }
}
