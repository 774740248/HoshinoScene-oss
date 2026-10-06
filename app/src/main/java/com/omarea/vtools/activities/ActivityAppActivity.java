package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppActivity extends a.p5 {
    public static final /* synthetic */ a.gu0[] n;
    public final a.yq1 d = a.b20.i(this, 2131361938);
    public final a.yq1 e = a.b20.i(this, 2131361941);
    public final a.yq1 f = a.b20.i(this, 2131362447);
    public final a.yq1 g = a.b20.i(this, 2131362448);
    public final a.yq1 h = a.b20.i(this, 2131362449);
    public final a.yq1 i = a.b20.i(this, 2131362451);
    public final a.yq1 j = a.b20.i(this, 2131363190);
    public final a.yq1 k = a.b20.i(this, 2131363191);
    public java.lang.String l = "";
    public java.lang.String m = "";

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "action_save", "getAction_save()Landroid/widget/Button;");
        a.na1.f375a.getClass();
        n = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "action_start", "getAction_start()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "edit_activity", "getEdit_activity()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "edit_icon", "getEdit_icon()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "edit_pkg", "getEdit_pkg()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "edit_title", "getEdit_title()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "state_enable", "getState_enable()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppActivity.class, "state_exported", "getState_exported()Landroid/widget/TextView;")};
    }

    public final void loadData() {
        java.lang.String string;
        java.lang.String string2;
        android.content.pm.PackageManager packageManager = getPackageManager();
        final int i = 0;
        final android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(new android.content.ComponentName(this.l, this.m), 0);
        a.wv.v(activityInfo, "pm.getActivityInfo(Compo…me(pkgName, activity), 0)");
        java.lang.String obj = activityInfo.loadLabel(packageManager).toString();
        a.gu0[] gu0VarArr = n;
        ((com.omarea.common.ui.InputView) this.i.a(gu0VarArr[5])).setText(obj);
        setTitle(obj);
        com.omarea.common.ui.InputView inputView = (com.omarea.common.ui.InputView) this.f.a(gu0VarArr[2]);
        java.lang.String str = activityInfo.name;
        a.wv.v(str, "activityInfo.name");
        inputView.setText(str);
        com.omarea.common.ui.InputView inputView2 = (com.omarea.common.ui.InputView) this.h.a(gu0VarArr[4]);
        java.lang.String str2 = activityInfo.packageName;
        a.wv.v(str2, "activityInfo.packageName");
        inputView2.setText(str2);
        ((android.widget.ImageView) this.g.a(gu0VarArr[3])).setImageDrawable(activityInfo.loadIcon(packageManager));
        android.widget.TextView textView = (android.widget.TextView) this.k.a(gu0VarArr[7]);
        if (activityInfo.exported) {
            textView.setTextColor(-16711936);
            string = getString(2131951851);
        } else {
            textView.setTextColor(-65536);
            string = getString(2131951856);
        }
        textView.setText(string);
        android.widget.TextView textView2 = (android.widget.TextView) this.j.a(gu0VarArr[6]);
        if (activityInfo.enabled) {
            textView2.setTextColor(-16711936);
            string2 = getString(2131952224);
        } else {
            textView2.setTextColor(-65536);
            string2 = getString(2131953072);
        }
        textView2.setText(string2);
        final int i2 = 1;
        ((android.widget.Button) this.e.a(gu0VarArr[1])).setOnClickListener(new a.q3());
        ((android.widget.Button) this.d.a(gu0VarArr[0])).setOnClickListener(new a.q3());
    }

    public final android.content.Intent o() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        a.gu0[] gu0VarArr = n;
        intent.setComponent(new android.content.ComponentName(((com.omarea.common.ui.InputView) this.h.a(gu0VarArr[4])).getText().toString(), ((com.omarea.common.ui.InputView) this.f.a(gu0VarArr[2])).getText().toString()));
        intent.addFlags(268435456);
        return intent;
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        super.onCreate(bundle);
        setContentView(2131558433);
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
        toolbar.setNavigationOnClickListener(new a.gv(15, this));
        android.content.Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("activity") || !extras.containsKey("packageName")) {
            return;
        }
        this.l = java.lang.String.valueOf(extras.getString("packageName"));
        this.m = java.lang.String.valueOf(extras.getString("activity"));
        try {
            loadData();
        } catch (java.lang.Throwable th) {
            a.b20.I(th);
        }
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    public final void p() {
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "basic")) {
            android.widget.Toast.makeText(this, getString(2131951849), 1).show();
            return;
        }
        a.gu0[] gu0VarArr = n;
        java.lang.String i = a.ai1.i("am start -n '", ((com.omarea.common.ui.InputView) this.h.a(gu0VarArr[4])).getText().toString(), "/", ((com.omarea.common.ui.InputView) this.f.a(gu0VarArr[2])).getText().toString(), "'");
        a.wv.w(i, "shell");
        a.q10.l(i);
    }
}
