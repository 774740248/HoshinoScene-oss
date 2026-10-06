package a;

import android.app.Activity;
import androidx.activity.contextaware.OnContextAvailableListener;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ml extends a.kk0 implements a.ql, a.nk1 {
    private static final java.lang.String DELEGATE_TAG = "androidx:appcompat";
    private a.xl mDelegate;
    private android.content.res.Resources mResources;

    public ml() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a.kl(this));
        addOnContextAvailableListener((OnContextAvailableListener) new a.ll(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        h();
        a.km kmVar = (a.km) getDelegate();
        kmVar.z();
        ((android.view.ViewGroup) kmVar.C.findViewById(android.R.id.content)).addView(view, layoutParams);
        kmVar.o.a(kmVar.n.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        android.content.res.Configuration configuration;
        a.km kmVar = (a.km) getDelegate();
        kmVar.Q = true;
        int i = kmVar.U;
        if (i == -100) {
            i = a.xl.d;
        }
        int F = kmVar.F(context, i);
        int i2 = 0;
        if (a.xl.c(context) && a.xl.c(context)) {
            if (!a.es.a()) {
                synchronized (a.xl.k) {
                    try {
                        a.hx0 hx0Var = a.xl.e;
                        if (hx0Var == null) {
                            if (a.xl.f == null) {
                                a.xl.f = a.hx0.a(a.b20.Z0(context));
                            }
                            if (!((a.jx0) a.xl.f.f221a).f274a.isEmpty()) {
                                a.xl.e = a.xl.f;
                            }
                        } else if (!hx0Var.equals(a.xl.f)) {
                            a.hx0 hx0Var2 = a.xl.e;
                            a.xl.f = hx0Var2;
                            a.b20.R0(context, ((a.jx0) hx0Var2.f221a).f274a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!a.xl.h) {
                a.xl.c.execute(new a.ul(context, i2));
            }
        }
        a.hx0 s = a.km.s(context);
        if (a.km.m0 && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(a.km.w(context, F, s, null, false));
            } catch (java.lang.IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof a.dy) {
            try {
                ((a.dy) context).a(a.km.w(context, F, s, null, false));
            } catch (java.lang.IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (a.km.l0) {
            int i3 = android.os.Build.VERSION.SDK_INT;
            android.content.res.Configuration configuration2 = new android.content.res.Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            android.content.res.Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            android.content.res.Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new android.content.res.Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i4 = configuration3.mcc;
                    int i5 = configuration4.mcc;
                    if (i4 != i5) {
                        configuration.mcc = i5;
                    }
                    int i6 = configuration3.mnc;
                    int i7 = configuration4.mnc;
                    if (i6 != i7) {
                        configuration.mnc = i7;
                    }
                    a.cm.a(configuration3, configuration4, configuration);
                    int i8 = configuration3.touchscreen;
                    int i9 = configuration4.touchscreen;
                    if (i8 != i9) {
                        configuration.touchscreen = i9;
                    }
                    int i10 = configuration3.keyboard;
                    int i11 = configuration4.keyboard;
                    if (i10 != i11) {
                        configuration.keyboard = i11;
                    }
                    int i12 = configuration3.keyboardHidden;
                    int i13 = configuration4.keyboardHidden;
                    if (i12 != i13) {
                        configuration.keyboardHidden = i13;
                    }
                    int i14 = configuration3.navigation;
                    int i15 = configuration4.navigation;
                    if (i14 != i15) {
                        configuration.navigation = i15;
                    }
                    int i16 = configuration3.navigationHidden;
                    int i17 = configuration4.navigationHidden;
                    if (i16 != i17) {
                        configuration.navigationHidden = i17;
                    }
                    int i18 = configuration3.orientation;
                    int i19 = configuration4.orientation;
                    if (i18 != i19) {
                        configuration.orientation = i19;
                    }
                    int i20 = configuration3.screenLayout & 15;
                    int i21 = configuration4.screenLayout & 15;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 192;
                    int i23 = configuration4.screenLayout & 192;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 48;
                    int i25 = configuration4.screenLayout & 48;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 768;
                    int i27 = configuration4.screenLayout & 768;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 15;
                    int i33 = configuration4.uiMode & 15;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.uiMode & 48;
                    int i35 = configuration4.uiMode & 48;
                    if (i34 != i35) {
                        configuration.uiMode |= i35;
                    }
                    int i36 = configuration3.screenWidthDp;
                    int i37 = configuration4.screenWidthDp;
                    if (i36 != i37) {
                        configuration.screenWidthDp = i37;
                    }
                    int i38 = configuration3.screenHeightDp;
                    int i39 = configuration4.screenHeightDp;
                    if (i38 != i39) {
                        configuration.screenHeightDp = i39;
                    }
                    int i40 = configuration3.smallestScreenWidthDp;
                    int i41 = configuration4.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration.smallestScreenWidthDp = i41;
                    }
                    int i42 = configuration3.densityDpi;
                    int i43 = configuration4.densityDpi;
                    if (i42 != i43) {
                        configuration.densityDpi = i43;
                    }
                }
            }
            android.content.res.Configuration w = a.km.w(context, F, s, configuration, true);
            a.dy dyVar = new a.dy(context, 2132017724);
            dyVar.a(w);
            try {
                if (context.getTheme() != null) {
                    android.content.res.Resources.Theme theme = dyVar.getTheme();
                    if (i3 >= 29) {
                        a.vb1.a(theme);
                    } else {
                        synchronized (a.ub1.f587a) {
                            if (!a.ub1.c) {
                                try {
                                    java.lang.reflect.Method declaredMethod = android.content.res.Resources.Theme.class.getDeclaredMethod("rebase", new java.lang.Class[0]);
                                    a.ub1.b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (java.lang.NoSuchMethodException e) {
                                    android.util.Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                a.ub1.c = true;
                            }
                            java.lang.reflect.Method method = a.ub1.b;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new java.lang.Object[0]);
                                } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                                    android.util.Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    a.ub1.b = null;
                                }
                            }
                        }
                    }
                }
            } catch (java.lang.NullPointerException unused3) {
            }
            context = dyVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a.d1 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // a.nw, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a.d1 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int i) {
        a.km kmVar = (a.km) getDelegate();
        kmVar.z();
        return (T) kmVar.n.findViewById(i);
    }

    public a.xl getDelegate() {
        if (this.mDelegate == null) {
            a.to toVar = a.xl.c;
            this.mDelegate = new a.km(this, null, this, this);
        }
        return this.mDelegate;
    }

    public a.g1 getDrawerToggleDelegate() {
        a.km kmVar = (a.km) getDelegate();
        kmVar.getClass();
        return new a.zl(kmVar, 3);
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
        a.km kmVar = (a.km) getDelegate();
        if (kmVar.r == null) {
            kmVar.D();
            a.d1 d1Var = kmVar.q;
            kmVar.r = new a.jj1(d1Var != null ? d1Var.e() : kmVar.m);
        }
        return kmVar.r;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = this.mResources;
        if (resources == null) {
            int i = a.dp1.f103a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public a.d1 getSupportActionBar() {
        a.km kmVar = (a.km) getDelegate();
        kmVar.D();
        return kmVar.q;
    }

    @Override // a.nk1
    public android.content.Intent getSupportParentActivityIntent() {
        return a.b20.h0(this);
    }

    public final void h() {
        android.view.View decorView = getWindow().getDecorView();
        a.wv.w(decorView, "<this>");
        decorView.setTag(2131363356, this);
        android.view.View decorView2 = getWindow().getDecorView();
        a.wv.w(decorView2, "<this>");
        decorView2.setTag(2131363359, this);
        android.view.View decorView3 = getWindow().getDecorView();
        a.wv.w(decorView3, "<this>");
        decorView3.setTag(2131363358, this);
        android.view.View decorView4 = getWindow().getDecorView();
        a.wv.w(decorView4, "<this>");
        decorView4.setTag(2131363357, this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.km kmVar = (a.km) getDelegate();
        if (kmVar.H && kmVar.B) {
            kmVar.D();
            a.d1 d1Var = kmVar.q;
            if (d1Var != null) {
                d1Var.g();
            }
        }
        a.nm a2 = a.nm.a();
        android.content.Context context = kmVar.m;
        synchronized (a2) {
            a.lb1 lb1Var = a2.f384a;
            synchronized (lb1Var) {
                a.sx0 sx0Var = (a.sx0) lb1Var.b.get(context);
                if (sx0Var != null) {
                    sx0Var.a();
                }
            }
        }
        kmVar.T = new android.content.res.Configuration(kmVar.m.getResources().getConfiguration());
        kmVar.p(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(a.ok1 ok1Var) {
        ok1Var.getClass();
        android.content.Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = a.b20.h0(this);
        }
        if (supportParentActivityIntent != null) {
            android.content.ComponentName component = supportParentActivityIntent.getComponent();
            android.content.Context context = ok1Var.d;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(context.getPackageManager());
            }
            java.util.ArrayList arrayList = ok1Var.c;
            int size = arrayList.size();
            try {
                for (android.content.Intent i0 = a.b20.i0(context, component); i0 != null; i0 = a.b20.i0(context, i0.getComponent())) {
                    arrayList.add(size, i0);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new java.lang.IllegalArgumentException(e);
            }
        }
    }

    @Override // a.kk0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(a.hx0 hx0Var) {
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a.d1 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, android.view.Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, android.view.Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        ((a.km) getDelegate()).z();
    }

    @Override // a.kk0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }

    public void onPrepareSupportNavigateUpTaskStack(a.ok1 ok1Var) {
    }

    @Override // a.kk0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((a.km) getDelegate()).p(true, false);
    }

    @Override // a.kk0, android.app.Activity
    public void onStop() {
        super.onStop();
        a.km kmVar = (a.km) getDelegate();
        kmVar.D();
        a.d1 d1Var = kmVar.q;
        if (d1Var != null) {
            d1Var.o(false);
        }
    }

    @Override // a.ql
    public void onSupportActionModeFinished(a.o2 o2Var) {
    }

    @Override // a.ql
    public void onSupportActionModeStarted(a.o2 o2Var) {
    }

    @java.lang.Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        android.content.Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        a.ok1 ok1Var = new a.ok1(this);
        onCreateSupportNavigateUpTaskStack(ok1Var);
        onPrepareSupportNavigateUpTaskStack(ok1Var);
        java.util.ArrayList arrayList = ok1Var.c;
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        java.lang.Object obj = a.zx.f748a;
        a.vx.a(ok1Var.d, intentArr, null);
        try {
            int i = a.n6.b;
            a.h6.a(this);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(java.lang.CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().n(charSequence);
    }

    @Override // a.ql
    public a.o2 onWindowStartingSupportActionMode(a.n2 n2Var) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a.d1 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        h();
        getDelegate().j(i);
    }

    public void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
        a.km kmVar = (a.km) getDelegate();
        if (kmVar.l instanceof android.app.Activity) {
            kmVar.D();
            a.d1 d1Var = kmVar.q;
            if (d1Var instanceof a.et1) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            kmVar.r = null;
            if (d1Var != null) {
                d1Var.h();
            }
            kmVar.q = null;
            if (toolbar != null) {
                java.lang.Object obj = kmVar.l;
                a.an1 an1Var = new a.an1(toolbar, obj instanceof android.app.Activity ? ((android.app.Activity) obj).getTitle() : kmVar.s, kmVar.o);
                kmVar.q = an1Var;
                kmVar.o.d = an1Var.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                kmVar.o.d = null;
            }
            kmVar.b();
        }
    }

    @java.lang.Deprecated
    public void setSupportProgress(int i) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @java.lang.Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((a.km) getDelegate()).V = i;
    }

    public a.o2 startSupportActionMode(a.n2 n2Var) {
        return getDelegate().o(n2Var);
    }

    @Override // a.nw
    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(android.content.Intent intent) {
        a.t11.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().i(i);
    }

    public boolean supportShouldUpRecreateTask(android.content.Intent intent) {
        return a.t11.c(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        h();
        getDelegate().k(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        h();
        getDelegate().l(view, layoutParams);
    }
}
