package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityEditor extends a.p5 implements android.view.View.OnClickListener {
    public static final /* synthetic */ a.gu0[] j;
    public final a.yq1 d = a.b20.i(this, 2131361943);
    public final a.yq1 e = a.b20.i(this, 2131362097);
    public final a.yq1 f = a.b20.i(this, 2131362098);
    public final a.yq1 g = a.b20.i(this, 2131363263);
    public java.lang.String h;
    public boolean i;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityEditor.class, "actions", "getActions()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        j = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityEditor.class, "btn_cancel", "getBtn_cancel()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityEditor.class, "btn_confirm", "getBtn_confirm()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityEditor.class, "text_content", "getText_content()Landroid/widget/EditText;")};
    }

    public final android.widget.EditText o() {
        return (android.widget.EditText) this.g.a(j[3]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == 2131362097) {
            android.widget.EditText o = o();
            java.lang.String str = this.h;
            a.wv.s(str);
            a.nu0 nu0Var = a.nu0.f395a;
            o.setText(a.nu0.d(str));
            return;
        }
        if (valueOf != null && valueOf.intValue() == 2131362098) {
            java.lang.String obj = o().getText().toString();
            java.lang.String str2 = this.h;
            a.wv.s(str2);
            if (a.gy.W(str2, obj)) {
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.X("OK", 0);
            } else {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.X("Fail!", 0);
            }
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.content.pm.PackageInfo packageInfo;
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.String str;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        int i = 1;
        if (intent != null) {
            android.os.Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("file")) {
                str = null;
            } else {
                android.os.Bundle extras2 = intent.getExtras();
                a.wv.s(extras2);
                str = extras2.getString("file");
            }
            this.h = str;
            android.os.Bundle extras3 = intent.getExtras();
            this.i = extras3 != null ? extras3.getBoolean("readonly", false) : false;
        }
        if (this.h == null) {
            finish();
            return;
        }
        try {
            packageInfo = getPackageManager().getPackageInfo("com.omarea.editor", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && applicationInfo.enabled && packageInfo.versionCode >= 1) {
            java.lang.String C = a.fs1.C(this, getApplicationInfo().packageName);
            java.lang.String C2 = a.fs1.C(this, "com.omarea.editor");
            if (C != null && C.length() > 0 && a.wv.e(C, C2)) {
                java.lang.String str2 = this.h;
                a.wv.s(str2);
                boolean z = this.i;
                try {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setComponent(new android.content.ComponentName("com.omarea.editor", "com.omarea.editor.EditorActivity"));
                    intent2.putExtra("file", str2);
                    intent2.putExtra("readonly", z);
                    intent2.addFlags(268435456);
                    startActivity(intent2);
                    finish();
                    return;
                } catch (android.content.ActivityNotFoundException unused2) {
                }
            }
        }
        int i2 = a.x60.f681a;
        java.lang.String string = getString(2131952212);
        a.wv.v(string, "activity.getString(R.string.editor_plugin_miss)");
        java.lang.String string2 = getString(2131952213);
        a.wv.v(string2, "activity.getString(R.str….editor_plugin_miss_desc)");
        a.fs1.i(this, string, string2, new a.g6(this, i), null);
        setContentView(2131558447);
        setBackArrow();
        a.gu0[] gu0VarArr = j;
        ((android.widget.Button) this.f.a(gu0VarArr[2])).setOnClickListener(this);
        ((android.widget.Button) this.e.a(gu0VarArr[1])).setOnClickListener(this);
        android.content.Intent intent3 = getIntent();
        if (intent3 != null) {
            android.os.Bundle extras4 = intent3.getExtras();
            if (extras4 != null && extras4.containsKey("rootMode")) {
                android.os.Bundle extras5 = intent3.getExtras();
                a.wv.s(extras5);
                extras5.getBoolean("rootMode");
            }
            if (this.h == null) {
                finish();
            } else {
                android.widget.EditText o = o();
                java.lang.String str3 = this.h;
                a.wv.s(str3);
                a.nu0 nu0Var = a.nu0.f395a;
                o.setText(a.nu0.d(str3));
            }
            if (this.i) {
                ((android.widget.LinearLayout) this.d.a(gu0VarArr[0])).setVisibility(8);
                o().setKeyListener(null);
                o().setTextIsSelectable(true);
            }
        }
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        java.lang.String str = this.h;
        if (str == null || !a.yi1.g2(str, "/")) {
            setTitle(getString(2131952897));
            return;
        }
        java.lang.String str2 = this.h;
        a.wv.s(str2);
        java.lang.String str3 = this.h;
        a.wv.s(str3);
        java.lang.String substring = str2.substring(a.yi1.q2(str3, "/", 6));
        a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
        setTitle(substring);
    }
}
