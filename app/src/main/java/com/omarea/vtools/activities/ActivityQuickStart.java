package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityQuickStart extends android.app.Activity {
    public static final /* synthetic */ a.gu0[] f;
    public final a.yq1 c = a.b20.i(this, 2131363189);
    public java.lang.String d;
    public java.lang.String e;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityQuickStart.class, "start_state_text", "getStart_state_text()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        f = new a.gu0[]{d81Var};
    }

    public final java.lang.String a() {
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        a.wv.M1("appPackageName");
        throw null;
    }

    public final android.widget.TextView b() {
        return (android.widget.TextView) this.c.a(f[0]);
    }

    public final void c() {
        android.content.pm.PackageManager packageManager = getPackageManager();
        android.content.pm.ApplicationInfo applicationInfo = null;
        try {
        } catch (java.lang.Exception unused) {
            b().setText(getString(2131952366));
        }
        if (this.e == null) {
            android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(a());
            if (launchIntentForPackage != null) {
                a.wv.M0(a.wv.b(a.z80.f728a), null, new a.ie(launchIntentForPackage, this, null), 3);
                return;
            }
            try {
                applicationInfo = packageManager.getApplicationInfo(a(), 0);
            } catch (java.lang.Exception unused2) {
            }
            b().setText(applicationInfo == null ? getString(2131952368) : getString(2131952366));
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN");
        java.lang.String a2 = a();
        java.lang.String str = this.e;
        a.wv.s(str);
        intent.setComponent(new android.content.ComponentName(a2, str));
        intent.setFlags(268500992);
        a.wv.M0(a.wv.b(a.z80.f728a), null, new a.je(intent, this, null), 3);
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.content.pm.ApplicationInfo applicationInfo;
        super.onCreate(bundle);
        setContentView(2131558467);
        android.app.ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        android.view.View decorView = getWindow().getDecorView();
        a.wv.v(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("packageName")) {
            b().setText(getString(2131952365));
            return;
        }
        java.lang.String string = extras.getString("packageName");
        a.wv.s(string);
        this.d = string;
        if (extras.containsKey("className")) {
            java.lang.String string2 = extras.getString("className");
            a.wv.s(string2);
            this.e = string2;
        }
        try {
            applicationInfo = getPackageManager().getApplicationInfo(a(), 0);
        } catch (java.lang.Exception unused) {
            applicationInfo = null;
        }
        if (applicationInfo != null && applicationInfo.enabled && (applicationInfo.flags & 1073741824) == 0) {
            c();
        } else {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.he(new a.lu(this, new a.g2(this, a()), null), null), 3);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        finish();
    }
}
