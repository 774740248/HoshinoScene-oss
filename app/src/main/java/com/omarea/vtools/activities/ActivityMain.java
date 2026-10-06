package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityMain extends a.p5 {
    public static final /* synthetic */ a.gu0[] i;
    public final a.yq1 d = a.b20.i(this, 2131361919);
    public final a.yq1 e = a.b20.i(this, 2131361933);
    public final a.yq1 f = a.b20.i(this, 2131361939);
    public final a.yq1 g = a.b20.i(this, 2131363233);
    public final a.yq1 h = a.b20.i(this, 2131363235);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityMain.class, "action_graph", "getAction_graph()Landroid/widget/ImageButton;");
        a.na1.f375a.getClass();
        i = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityMain.class, "action_power", "getAction_power()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityMain.class, "action_settings", "getAction_settings()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityMain.class, "tab_content", "getTab_content()Landroidx/viewpager/widget/ViewPager;"), new a.d81(com.omarea.vtools.activities.ActivityMain.class, "tab_list", "getTab_list()Lcom/google/android/material/tabs/TabLayout;")};
    }

    @Override // a.p5, a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        autoLayout(configuration);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.omarea.vtools.activities.ActivityStartSplash.q.getClass();
        if (com.omarea.vtools.activities.ActivityStartSplash.s) {
            a.q10 q10Var = a.q10.f457a;
            if (!a.wv.e(a.q10.t(), "adb") || a.q10.r()) {
                setContentView(2131558457);
                setSupportActionBar((androidx.appcompat.widget.Toolbar) findViewById(2131363296));
                a.gu0[] gu0VarArr = i;
                com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.h.a(gu0VarArr[4]);
                androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) this.h.a(gu0VarArr[3]);
                a.am0 supportFragmentManager = getSupportFragmentManager();
                a.wv.v(supportFragmentManager, "supportFragmentManager");
                a.zj1 zj1Var = new a.zj1(tabLayout, viewPager, this, supportFragmentManager, 2131558654);
                java.lang.String string = getString(2131951879);
                a.wv.v(string, "getString(R.string.app_nav)");
                android.content.Context context = getContext();
                java.lang.Object obj = a.zx.f748a;
                android.graphics.drawable.Drawable b = a.xx.b(context, 2131230847);
                a.wv.s(b);
                a.fa0 fa0Var = a.fm0.Z;
                a.pl1 themeMode = getThemeMode();
                fa0Var.getClass();
                a.wv.w(themeMode, "themeMode");
                zj1Var.a(string, b, new a.fm0());
                java.lang.String string2 = getString(2131951875);
                a.wv.v(string2, "getString(R.string.app_home)");
                android.graphics.drawable.Drawable b2 = a.xx.b(getContext(), 2131230845);
                a.wv.s(b2);
                zj1Var.a(string2, b2, new a.pl0());
                if (a.wv.e(a.q10.t(), "root")) {
                    java.lang.String string3 = getString(2131951881);
                    a.wv.v(string3, "getString(R.string.app_tuner)");
                    android.graphics.drawable.Drawable b3 = a.xx.b(getContext(), 2131230867);
                    a.wv.s(b3);
                    zj1Var.a(string3, b3, new a.bn0());
                    if (new a.ep1(this).a()) {
                        java.lang.String string4 = getString(2131951882);
                        a.wv.v(string4, "getString(R.string.app_user)");
                        android.graphics.drawable.Drawable b4 = a.xx.b(getContext(), 2131230868);
                        a.wv.s(b4);
                        zj1Var.a(string4, b4, new a.jo0());
                    }
                }
                final int i2 = 0;
                final int i3 = 1;
                if (a.wv.e(a.q10.t(), "basic")) {
                    ((android.widget.ImageButton) this.h.a(gu0VarArr[0])).setVisibility(8);
                    ((android.widget.ImageButton) this.e.a(gu0VarArr[1])).setVisibility(8);
                }
                ((androidx.viewpager.widget.ViewPager) this.h.a(gu0VarArr[3])).setOffscreenPageLimit(4);
                ((androidx.viewpager.widget.ViewPager) this.h.a(gu0VarArr[3])).setAdapter(zj1Var.g);
                com.google.android.material.tabs.TabLayout.Tab f = ((com.google.android.material.tabs.TabLayout) this.h.a(gu0VarArr[4])).getTabAt(1);
                if (f != null) {
                    com.google.android.material.tabs.TabLayout tabLayout2 = f.parent;
                    if (tabLayout2 == null) {
                        throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    tabLayout2.selectTab(f, true);
                }
                try {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.hb(this, null), 3);
                } catch (java.lang.Exception unused) {
                }
                a.gu0[] gu0VarArr2 = i;
                ((android.widget.ImageButton) this.h.a(gu0VarArr2[0])).setOnClickListener(new a.fb(this));
                ((android.widget.ImageButton) this.e.a(gu0VarArr2[1])).setOnClickListener(new a.fb(this));
                final int i4 = 2;
                ((android.widget.ImageButton) this.f.a(gu0VarArr2[2])).setOnClickListener(new a.fb(this));
                a.p5.autoLayout$default(this, null, 1, null);
                a.ib ibVar = new a.ib(this, 1);
                getOnBackPressedDispatcher().addCallback(this, ibVar);
                a.cd1 cd1Var = new a.cd1(23, ibVar);
                a.am0 supportFragmentManager2 = getSupportFragmentManager();
                a.gb gbVar = new a.gb(cd1Var);
                if (supportFragmentManager2.k == null) {
                    supportFragmentManager2.k = new java.util.ArrayList();
                }
                supportFragmentManager2.k.add(gbVar);
                cd1Var.b();
                getOnBackPressedDispatcher().addCallback(this, new a.ib(this, 0));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityStartSplash.class);
        intent.addFlags(65536);
        intent.addFlags(1073741824);
        startActivity(intent);
        finishAfterTransition();
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        a.am0 supportFragmentManager = getSupportFragmentManager();
        a.wv.v(supportFragmentManager, "supportFragmentManager");
        supportFragmentManager.c.f().clear();
        super.onDestroy();
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity, a.k6
    public final void onRequestPermissionsResult(int i2, java.lang.String[] strArr, int[] iArr) {
        a.wv.w(strArr, "permissions");
        a.wv.w(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.D().getLong("last_update", 0L) + 43200000 < java.lang.System.currentTimeMillis()) {
            if (a.fs1.D().getBoolean("get_next_release", false)) {
                a.tg1.b(new a.tg1(5), this, 10);
            } else {
                a.tg1.b(new a.tg1(5), this, 9);
            }
            a.fs1.D().edit().putLong("last_update", java.lang.System.currentTimeMillis()).apply();
        }
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.r() && a.wv.e(a.q10.t(), "root") && a.fs1.D().getLong("hardware_report", 0L) + 259200000 < java.lang.System.currentTimeMillis()) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.jb(this, null), 3);
            a.fs1.D().edit().putLong("hardware_report", java.lang.System.currentTimeMillis()).apply();
        }
    }
}
