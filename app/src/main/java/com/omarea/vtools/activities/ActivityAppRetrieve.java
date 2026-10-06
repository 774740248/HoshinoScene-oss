package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppRetrieve extends a.p5 {
    public static final /* synthetic */ a.gu0[] k;
    public a.b81 g;
    public java.lang.ref.WeakReference h;
    public android.content.pm.PackageManager j;
    public final a.yq1 d = a.b20.i(this, 2131362033);
    public final a.yq1 e = a.b20.i(this, 2131362474);
    public final a.yq1 f = a.b20.i(this, 2131362604);
    public final android.os.Handler i = new android.os.Handler(android.os.Looper.getMainLooper());

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppRetrieve.class, "apps_force_reset", "getApps_force_reset()Landroid/widget/ImageView;");
        a.na1.f375a.getClass();
        k = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppRetrieve.class, "fab_confirm", "getFab_confirm()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;"), new a.d81(com.omarea.vtools.activities.ActivityAppRetrieve.class, "hidden_app", "getHidden_app()Lcom/omarea/common/ui/OverScrollListView;")};
    }

    public static final void o(com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve) {
        a.nh nhVar;
        activityAppRetrieve.getClass();
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) activityAppRetrieve.e.a(k[1]);
        java.lang.ref.WeakReference weakReference = activityAppRetrieve.h;
        floatingActionButton.setVisibility((weakReference == null || (nhVar = (a.nh) weakReference.get()) == null || !nhVar.d()) ? 8 : 0);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558437);
        setBackArrow();
        android.content.pm.PackageManager packageManager = getPackageManager();
        a.wv.v(packageManager, "packageManager");
        this.j = packageManager;
        this.g = new a.b81(this, null);
        q().addHeaderView(getLayoutInflater().inflate(2131558631, (android.view.ViewGroup) null));
        a.gu0[] gu0VarArr = k;
        final int i = 1;
        final int i2 = 0;
        ((com.google.android.material.floatingactionbutton.FloatingActionButton) this.e.a(gu0VarArr[1])).setOnClickListener(new a.q4(this));
        a.q10 q10Var = a.q10.f457a;
        boolean e = a.wv.e(a.q10.t(), "root");
        a.yq1 yq1Var = this.d;
        if (e) {
            ((android.widget.ImageView) yq1Var.a(gu0VarArr[0])).setOnClickListener(new a.q4(this));
        } else {
            ((android.widget.ImageView) yq1Var.a(gu0VarArr[0])).setVisibility(8);
        }
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        r();
    }

    public final com.omarea.model.AppInfo p(android.content.pm.ApplicationInfo applicationInfo) {
        com.omarea.model.AppInfo appInfo = new com.omarea.model.AppInfo();
        android.content.pm.PackageManager packageManager = this.j;
        if (packageManager == null) {
            a.wv.M1("pm");
            throw null;
        }
        java.lang.CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) loadLabel);
        appInfo.setAppName(sb.toString());
        java.lang.String str = applicationInfo.packageName;
        a.wv.v(str, "it.packageName");
        appInfo.setPackageName(str);
        appInfo.enabled = java.lang.Boolean.valueOf(applicationInfo.enabled);
        appInfo.path = applicationInfo.sourceDir;
        return appInfo;
    }

    public final com.omarea.common.ui.OverScrollListView q() {
        return (com.omarea.common.ui.OverScrollListView) this.f.a(k[2]);
    }

    public final void r() {
        a.b81 b81Var = this.g;
        if (b81Var == null) {
            a.wv.M1("progressBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.ty tyVar = a.z80.b;
        a.s4 s4Var = new a.s4(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, s4Var) : new a.f(W, true);
        av0Var.S(i2, av0Var, s4Var);
    }
}
