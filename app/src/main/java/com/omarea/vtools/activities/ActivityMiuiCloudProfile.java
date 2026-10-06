package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityMiuiCloudProfile extends a.p5 {
    public static final /* synthetic */ a.gu0[] s;
    public boolean l;
    public a.xt0 m;
    public android.view.Menu r;
    public final a.yq1 d = a.b20.i(this, 2131361943);
    public final a.yq1 e = a.b20.i(this, 2131362228);
    public final a.yq1 f = a.b20.i(this, 2131362340);
    public final a.yq1 g = a.b20.i(this, 2131362341);
    public final a.yq1 h = a.b20.i(this, 2131362342);
    public final a.yq1 i = a.b20.i(this, 2131362343);
    public final a.yq1 j = a.b20.i(this, 2131362344);
    public final java.lang.String k = "/sdcard/Android/scene-config.json";
    public final java.lang.String n = "/data/data/com.xiaomi.joyose/databases";
    public final java.lang.String o = "booster_config";
    public final java.lang.String p = "common_config";
    public java.lang.String q = "booster_config";

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "actions", "getActions()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        s = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "cloud_config", "getCloud_config()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "db_default_cloud_boost", "getDb_default_cloud_boost()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "db_smartp_boost", "getDb_smartp_boost()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "db_smartp_common", "getDb_smartp_common()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "db_teg_boost", "getDb_teg_boost()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityMiuiCloudProfile.class, "db_teg_common", "getDb_teg_common()Landroid/widget/TextView;")};
    }

    public final void o() {
        ((android.widget.LinearLayout) this.d.a(s[0])).setVisibility(0);
        p().setVisibility(8);
        this.m = null;
        java.lang.Integer[] numArr = {2131361938, 2131361902, 2131361923, 2131361916, 2131361930};
        for (int i = 0; i < 5; i++) {
            int intValue = numArr[i].intValue();
            android.view.Menu menu = this.r;
            if (menu == null) {
                a.wv.M1("menu");
                throw null;
            }
            android.view.MenuItem findItem = menu.findItem(intValue);
            if (findItem != null) {
                findItem.setVisible(false);
            }
        }
        android.view.Menu menu2 = this.r;
        if (menu2 == null) {
            a.wv.M1("menu");
            throw null;
        }
        android.view.MenuItem findItem2 = menu2.findItem(2131361936);
        if (findItem2 == null) {
            return;
        }
        findItem2.setVisible(true);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.lang.String str;
        super.onActivityResult(i, i2, intent);
        if (i == 99) {
            java.lang.String str2 = this.k;
            a.wv.w(str2, "path");
            a.nu0 nu0Var = a.nu0.f395a;
            java.lang.String obj = a.yi1.F2(a.nu0.d(str2)).toString();
            if (a.wv.e(obj, a.yi1.F2(p().getText().toString()).toString())) {
                o();
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = getString(2131953071);
                a.wv.v(string, "getString(R.string.muui_no_change)");
                a.fs1.X(string, 0);
                return;
            }
            try {
                p().setText(new a.lt0(obj).toString());
                r();
                return;
            } catch (java.lang.Exception unused) {
                p().setText(obj);
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string2 = getString(2131952939);
                a.wv.v(string2, "getString(R.string.miui_format_error)");
                a.fs1.X(string2, 1);
                return;
            }
        }
        if (i2 != -1 || intent == null) {
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("file")) {
            android.widget.Toast.makeText(this, getString(2131952532), 0).show();
            return;
        }
        android.os.Bundle extras2 = intent.getExtras();
        a.wv.s(extras2);
        java.lang.String string3 = extras2.getString("file");
        a.wv.s(string3);
        a.xt0 xt0Var = this.m;
        if (xt0Var == null || (str = xt0Var.b) == null) {
            str = "";
        }
        if ((a.yi1.g2(string3, "SmartP") && a.yi1.g2(str, "teg_config")) || (a.yi1.g2(string3, "teg_config") && a.yi1.g2(str, "SmartP"))) {
            int i3 = a.x60.f681a;
            java.lang.String string4 = getString(2131952953);
            a.wv.v(string4, "getString(R.string.miui_target_error)");
            a.fs1.G(this, string4, null);
            return;
        }
        java.lang.String str3 = this.p;
        boolean g2 = a.yi1.g2(string3, str3);
        java.lang.String str4 = this.o;
        if ((g2 && a.yi1.g2(this.q, str4)) || (a.yi1.g2(string3, str4) && a.yi1.g2(this.q, str3))) {
            int i4 = a.x60.f681a;
            java.lang.String string5 = getString(2131952954);
            a.wv.v(string5, "getString(R.string.miui_target_error2)");
            a.fs1.G(this, a.ai1.l(new java.lang.Object[]{str4, str3}, 2, string5, "format(format, *args)"), null);
            return;
        }
        if (!a.gy.n(string3)) {
            int i5 = a.x60.f681a;
            java.lang.String string6 = getString(2131952944);
            a.wv.v(string6, "getString(R.string.miui_import_not_found)");
            a.fs1.G(this, a.ai1.l(new java.lang.Object[]{string3}, 1, string6, "format(format, *args)"), null);
            return;
        }
        try {
            a.lt0 lt0Var = new a.lt0(a.nu0.d(string3));
            int i6 = a.x60.f681a;
            java.lang.String string7 = getString(2131952942);
            a.wv.v(string7, "getString(R.string.miui_import)");
            java.lang.String string8 = getString(2131952943);
            a.wv.v(string8, "getString(R.string.miui_import_confirm)");
            java.lang.String format = java.lang.String.format(string8, java.util.Arrays.copyOf(new java.lang.Object[]{string3}, 1));
            a.wv.v(format, "format(format, *args)");
            a.fs1.i(this, string7, format, new a.xa(this, 2, lt0Var), null);
        } catch (java.lang.Exception unused2) {
            int i7 = a.x60.f681a;
            java.lang.String string9 = getString(2131952940);
            a.wv.v(string9, "getString(R.string.miui_format_error2)");
            a.fs1.G(this, a.ai1.l(new java.lang.Object[]{string3}, 1, string9, "format(format, *args)"), null);
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558458);
        setBackArrow();
        a.gu0[] gu0VarArr = s;
        final int i = 3;
        final int i2 = 0;
        ((android.widget.TextView) this.g.a(gu0VarArr[3])).setOnClickListener(new a.lb(this));
        final int i3 = 1;
        ((android.widget.TextView) this.i.a(gu0VarArr[5])).setOnClickListener(new a.lb(this));
        final int i4 = 4;
        final int i5 = 2;
        ((android.widget.TextView) this.h.a(gu0VarArr[4])).setOnClickListener(new a.lb(this));
        ((android.widget.TextView) this.j.a(gu0VarArr[6])).setOnClickListener(new a.lb(this));
        ((android.widget.TextView) this.f.a(gu0VarArr[2])).setOnClickListener(new a.lb(this));
        try {
            getContext().getPackageManager().getPackageInfo("bin.mt.plus", 0);
            this.l = true;
        } catch (java.lang.Exception unused) {
        }
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, 9));
        android.os.StrictMode.VmPolicy.Builder builder = new android.os.StrictMode.VmPolicy.Builder();
        android.os.StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        a.wv.w(menu, "menu");
        getMenuInflater().inflate(2131689479, menu);
        this.r = menu;
        return true;
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.mb(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        java.lang.String str;
        a.wv.w(menuItem, "item");
        int i = 0;
        if (this.m != null || menuItem.getItemId() == 2131361936) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131361931) {
                o();
            } else if (itemId == 2131361938) {
                r();
            } else if (itemId == 2131361902) {
                try {
                    a.lt0 lt0Var = new a.lt0(p().getText().toString());
                    a.xt0 xt0Var = this.m;
                    a.lt0 a2 = xt0Var != null ? a.xt0.a(xt0Var, lt0Var) : null;
                    if (a2 != null) {
                        java.lang.String obj = p().getText().toString();
                        java.lang.String p = a2.p(2);
                        if (a.wv.e(obj, p)) {
                            a.cp cpVar = com.omarea.Scene.c;
                            java.lang.String string = getString(2131952945);
                            a.wv.v(string, "getString(R.string.miui_no_rule_matched)");
                            a.fs1.X(string, 0);
                        } else {
                            int i2 = a.x60.f681a;
                            java.lang.String string2 = getString(2131952948);
                            a.wv.v(string2, "getString(R.string.miui_override)");
                            java.lang.String string3 = getString(2131952949);
                            a.wv.v(string3, "getString(R.string.miui_override_confirm)");
                            a.fs1.i(this, string2, string3, new a.xa(this, 3, p), null);
                        }
                    } else {
                        a.cp cpVar2 = com.omarea.Scene.c;
                        java.lang.String string4 = getString(2131952952);
                        a.wv.v(string4, "getString(R.string.miui_rule_matched)");
                        a.fs1.X(string4, 0);
                    }
                } catch (java.lang.Exception unused) {
                    a.cp cpVar3 = com.omarea.Scene.c;
                    java.lang.String string5 = getString(2131952941);
                    a.wv.v(string5, "getString(R.string.miui_format_error3)");
                    a.fs1.X(string5, 0);
                }
            } else if (itemId == 2131361923) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
                intent.putExtra("extension", ".json");
                startActivityForResult(intent, 1);
            } else if (itemId == 2131361916) {
                try {
                    a.lt0 lt0Var2 = new a.lt0(p().getText().toString());
                    a.xt0 xt0Var2 = this.m;
                    if (xt0Var2 == null || (str = xt0Var2.b) == null) {
                        str = "";
                    }
                    java.lang.String i3 = a.ai1.i("/sdcard/[", str, "][", this.q, "].json");
                    int i4 = a.x60.f681a;
                    android.content.Context context = getContext();
                    java.lang.String string6 = getString(2131952937);
                    a.wv.v(string6, "getString(R.string.miui_export)");
                    java.lang.String string7 = getString(2131952951);
                    a.wv.v(string7, "getString(R.string.miui_reset_confirm)");
                    a.fs1.i(context, string6, a.ai1.l(new java.lang.Object[]{i3}, 1, string7, "format(format, *args)"), new a.xa(i3, 1, lt0Var2), null);
                } catch (java.lang.Exception unused2) {
                    a.cp cpVar4 = com.omarea.Scene.c;
                    java.lang.String string8 = getString(2131952939);
                    a.wv.v(string8, "getString(R.string.miui_format_error)");
                    a.fs1.X(string8, 0);
                }
            } else if (itemId == 2131361936) {
                int i5 = a.x60.f681a;
                java.lang.String string9 = getString(2131952950);
                a.wv.v(string9, "getString(R.string.miui_reset)");
                java.lang.String string10 = getString(2131952938);
                a.wv.v(string10, "getString(R.string.miui_export_desc)");
                a.fs1.i(this, string9, string10, new a.kb(this, i), null);
            } else if (itemId == 2131361930) {
                java.lang.String obj2 = p().getText().toString();
                java.lang.String str2 = this.k;
                a.gy.W(str2, obj2);
                try {
                    a.q10 q10Var = a.q10.f457a;
                    a.q10.k(2000L, "am stack list | grep bin.mt.plus | cut -f1 -d ':' | cut -f2 -d '=' | xargs am stack remove");
                    android.content.ComponentName componentName = new android.content.ComponentName("bin.mt.plus", "bin.mt.plus.OpenFileActivity");
                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                    intent2.setComponent(componentName);
                    intent2.addFlags(16384);
                    intent2.addFlags(8388608);
                    intent2.setDataAndType(android.net.Uri.fromFile(new java.io.File(str2)), "application/json");
                    startActivityForResult(intent2, 99);
                } catch (java.lang.Exception unused3) {
                }
            }
        } else {
            a.cp cpVar5 = com.omarea.Scene.c;
            a.fs1.X("请先选择一个配置库进入编辑！", 0);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle("特定场景优化");
    }

    @Override // androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        a.wv.w(bundle, "instanceState");
        super.onSaveInstanceState(bundle);
        bundle.clear();
    }

    public final android.widget.EditText p() {
        return (android.widget.EditText) this.e.a(s[1]);
    }

    public final void q(java.lang.String str, java.lang.String str2) {
        android.view.Menu menu;
        java.lang.String str3 = this.n + "/" + str;
        if (!a.wv.e(str, "default_cloud.db")) {
            a.wv.w(str3, "path");
            if (!new java.io.File(str3).exists()) {
                a.q10 q10Var = a.q10.f457a;
                java.lang.String L = a.q10.L("path-basic-info", str3, 10000L);
                if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                    a.cp cpVar = com.omarea.Scene.c;
                    java.lang.String string = getString(2131952946);
                    a.wv.v(string, "getString(R.string.miui_not_found)");
                    java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{str3}, 1));
                    a.wv.v(format, "format(format, *args)");
                    a.fs1.X(format, 0);
                    return;
                }
            }
        }
        a.xt0 m = a.tg1.m(getContext(), str);
        java.lang.String b = a.wv.e(str2, "booster_config") ? m.b("booster_config") : m.b("common_config");
        try {
            p().setText(new a.lt0(b).p(2));
            this.q = str2;
            java.lang.Integer[] numArr = {2131361938, 2131361923, 2131361916};
            for (int i = 0; i < 3; i++) {
                int intValue = numArr[i].intValue();
                android.view.Menu menu2 = this.r;
                if (menu2 == null) {
                    a.wv.M1("menu");
                    throw null;
                }
                android.view.MenuItem findItem = menu2.findItem(intValue);
                if (findItem != null) {
                    findItem.setVisible(true);
                }
            }
            if (a.wv.e(this.q, "booster_config")) {
                android.view.Menu menu3 = this.r;
                if (menu3 == null) {
                    a.wv.M1("menu");
                    throw null;
                }
                android.view.MenuItem findItem2 = menu3.findItem(2131361902);
                if (findItem2 != null) {
                    findItem2.setVisible(true);
                }
            }
            menu = this.r;
        } catch (java.lang.Exception unused) {
            a.cp cpVar2 = com.omarea.Scene.c;
            java.lang.String string2 = getString(2131952941);
            a.wv.v(string2, "getString(R.string.miui_format_error3)");
            a.fs1.X(string2, 0);
            p().setText(b);
        }
        if (menu == null) {
            a.wv.M1("menu");
            throw null;
        }
        android.view.MenuItem findItem3 = menu.findItem(2131361936);
        if (findItem3 != null) {
            findItem3.setVisible(false);
        }
        android.view.Menu menu4 = this.r;
        if (menu4 == null) {
            a.wv.M1("menu");
            throw null;
        }
        android.view.MenuItem findItem4 = menu4.findItem(2131361930);
        if (findItem4 != null) {
            findItem4.setVisible(this.l);
        }
        p().setVisibility(0);
        ((android.widget.LinearLayout) this.d.a(s[0])).setVisibility(8);
        this.m = m;
    }

    public final void r() {
        a.xt0 xt0Var;
        a.xt0 xt0Var2;
        if (this.m != null) {
            try {
                a.lt0 lt0Var = new a.lt0(p().getText().toString());
                if (!a.wv.e(this.q, this.o) ? !((xt0Var = this.m) == null || !xt0Var.f(lt0Var, "common_config")) : !((xt0Var2 = this.m) == null || !xt0Var2.f(lt0Var, "booster_config"))) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X(">_<!", 0);
                    return;
                }
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string = getString(2131952947);
                a.wv.v(string, "getString(R.string.miui_ok_need_reboot)");
                a.fs1.X(string, 0);
                o();
            } catch (java.lang.Exception unused) {
                a.cp cpVar3 = com.omarea.Scene.c;
                java.lang.String string2 = getString(2131952939);
                a.wv.v(string2, "getString(R.string.miui_format_error)");
                a.fs1.X(string2, 0);
            }
        }
    }
}
