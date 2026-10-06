package com.omarea.vtools.activities;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppXposedDetails extends a.p5 {
    public static final /* synthetic */ a.gu0[] s;
    public a.pu1 n;
    public a.pu1 o;
    public boolean p;
    public a.tr0 q;
    public final a.yq1 d = a.b20.i(this, 2131361969);
    public final a.yq1 e = a.b20.i(this, 2131361971);
    public final a.yq1 f = a.b20.i(this, 2131361976);
    public final a.yq1 g = a.b20.i(this, 2131361978);
    public final a.yq1 h = a.b20.i(this, 2131361979);
    public final a.yq1 i = a.b20.i(this, 2131361981);
    public final a.yq1 j = a.b20.i(this, 2131361982);
    public final a.yq1 k = a.b20.i(this, 2131361983);
    public final a.yq1 l = a.b20.i(this, 2131361984);
    public java.lang.String m = "";
    public final a.w4 r = new a.w4(this);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_dpi", "getApp_details_dpi()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        s = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_excludetask", "getApp_details_excludetask()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_icon", "getApp_details_icon()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_name", "getApp_details_name()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_packagename", "getApp_details_packagename()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_scrollopt", "getApp_details_scrollopt()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_vaddins_notactive", "getApp_details_vaddins_notactive()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_vaddins_notinstall", "getApp_details_vaddins_notinstall()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedDetails.class, "app_details_web_debug", "getApp_details_web_debug()Landroid/widget/Switch;")};
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        try {
            if (this.q != null) {
                unbindService(this.r);
                this.q = null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final android.widget.TextView o() {
        return (android.widget.TextView) this.d.a(s[0]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558439);
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
        toolbar.setNavigationOnClickListener(new a.v4(this, 1));
        int i = 4;
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, i));
        a.wv.v(getSharedPreferences("global", 0), "getSharedPreferences(Spf…PF, Context.MODE_PRIVATE)");
        if (getIntent() == null) {
            setResult(0, getIntent());
            finish();
            return;
        }
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("app")) {
            setResult(0, getIntent());
            finish();
            return;
        }
        java.lang.String string = extras.getString("app");
        a.wv.s(string);
        this.m = string;
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.D().getBoolean("dynamic_control", false);
        a.gu0[] gu0VarArr = s;
        ((android.widget.ImageView) this.f.a(gu0VarArr[2])).setOnClickListener(new a.v4(this, 2));
        this.n = new a.pu1(this.m);
        this.o = new a.pu1(this.m);
        if (q().b >= 96) {
            o().setText(java.lang.String.valueOf(q().b));
        }
        ((android.widget.Switch) this.e.a(gu0VarArr[1])).setOnClickListener(new a.v4(this, 3));
        ((android.widget.Switch) this.i.a(gu0VarArr[5])).setOnClickListener(new a.v4(this, i));
        ((android.widget.Switch) this.l.a(gu0VarArr[8])).setOnClickListener(new a.v4(this, 5));
        if (com.omarea.xposed.XposedCheck.xposedIsRunning()) {
            if (q().b >= 96) {
                o().setText(java.lang.String.valueOf(q().b));
            } else {
                o().setText(getString(2131951791));
            }
            o().setOnClickListener(new a.v4(this, 6));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        a.wv.w(menu, "menu");
        getMenuInflater().inflate(2131689482, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        a.wv.w(menuItem, "item");
        if (menuItem.getItemId() == 2131361938) {
            s();
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(1:3)(1:66)|4|5|6|(1:8)(1:64)|9|(1:62)(1:12)|13|(4:54|55|56|(7:58|25|(1:27)(1:43)|28|29|30|(2:32|33)(2:35|(2:37|38)(2:39|40))))|15|(2:17|(5:19|(2:48|49)|21|22|(1:24)(2:44|45))(1:52))(1:53)|25|(0)(0)|28|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
    
        android.widget.Toast.makeText(getApplicationContext(), getString(2131953734), 0).show();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    @Override // a.p5, a.kk0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityAppXposedDetails.onResume():void");
    }

    public final a.pu1 p() {
        a.pu1 pu1Var = this.o;
        if (pu1Var != null) {
            return pu1Var;
        }
        a.wv.M1("originConfig");
        throw null;
    }

    public final a.pu1 q() {
        a.pu1 pu1Var = this.n;
        if (pu1Var != null) {
            return pu1Var;
        }
        a.wv.M1("sceneConfigInfo");
        throw null;
    }

    public final void r() {
        int i = a.x60.f681a;
        android.content.Context context = getContext();
        java.lang.String string = getString(2131953323);
        a.wv.v(string, "getString(R.string.scene_addin_miss)");
        java.lang.String string2 = getString(2131953324);
        a.wv.v(string2, "getString(R.string.scene_addin_miss_desc)");
        a.fs1.Z(context, string, string2, new a.fw(26, this), null, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: Exception -> 0x0093, TRY_LEAVE, TryCatch #0 {Exception -> 0x0093, blocks: (B:2:0x0000, B:4:0x000f, B:6:0x001d, B:8:0x002b, B:11:0x003a, B:12:0x004a, B:14:0x004e, B:19:0x0042), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r4 = this;
            a.pu1 r0 = r4.q()     // Catch: java.lang.Exception -> L93
            int r0 = r0.b     // Catch: java.lang.Exception -> L93
            a.pu1 r1 = r4.p()     // Catch: java.lang.Exception -> L93
            int r1 = r1.b     // Catch: java.lang.Exception -> L93
            r2 = 0
            if (r0 != r1) goto L42
            a.pu1 r0 = r4.q()     // Catch: java.lang.Exception -> L93
            boolean r0 = r0.c     // Catch: java.lang.Exception -> L93
            a.pu1 r1 = r4.p()     // Catch: java.lang.Exception -> L93
            boolean r1 = r1.c     // Catch: java.lang.Exception -> L93
            if (r0 != r1) goto L42
            a.pu1 r0 = r4.q()     // Catch: java.lang.Exception -> L93
            boolean r0 = r0.d     // Catch: java.lang.Exception -> L93
            a.pu1 r1 = r4.p()     // Catch: java.lang.Exception -> L93
            boolean r1 = r1.d     // Catch: java.lang.Exception -> L93
            if (r0 != r1) goto L42
            a.pu1 r0 = r4.q()     // Catch: java.lang.Exception -> L93
            boolean r0 = r0.e     // Catch: java.lang.Exception -> L93
            a.pu1 r1 = r4.p()     // Catch: java.lang.Exception -> L93
            boolean r1 = r1.e     // Catch: java.lang.Exception -> L93
            if (r0 == r1) goto L3a
            goto L42
        L3a:
            android.content.Intent r0 = r4.getIntent()     // Catch: java.lang.Exception -> L93
            r4.setResult(r2, r0)     // Catch: java.lang.Exception -> L93
            goto L4a
        L42:
            android.content.Intent r0 = r4.getIntent()     // Catch: java.lang.Exception -> L93
            r1 = -1
            r4.setResult(r1, r0)     // Catch: java.lang.Exception -> L93
        L4a:
            a.tr0 r0 = r4.q     // Catch: java.lang.Exception -> L93
            if (r0 == 0) goto L93
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L93
            r0.<init>()     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = "dpi"
            a.pu1 r3 = r4.q()     // Catch: java.lang.Exception -> L93
            int r3 = r3.b     // Catch: java.lang.Exception -> L93
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = "excludeRecent"
            a.pu1 r3 = r4.q()     // Catch: java.lang.Exception -> L93
            boolean r3 = r3.c     // Catch: java.lang.Exception -> L93
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = "smoothScroll"
            a.pu1 r3 = r4.q()     // Catch: java.lang.Exception -> L93
            boolean r3 = r3.d     // Catch: java.lang.Exception -> L93
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = "webDebug"
            a.pu1 r3 = r4.q()     // Catch: java.lang.Exception -> L93
            boolean r3 = r3.e     // Catch: java.lang.Exception -> L93
            r0.put(r1, r3)     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.toString(r2)     // Catch: java.lang.Exception -> L93
            a.tr0 r1 = r4.q     // Catch: java.lang.Exception -> L93
            a.wv.s(r1)     // Catch: java.lang.Exception -> L93
            a.pu1 r2 = r4.q()     // Catch: java.lang.Exception -> L93
            java.lang.String r2 = r2.f452a     // Catch: java.lang.Exception -> L93
            a.rr0 r1 = (a.rr0) r1     // Catch: java.lang.Exception -> L93
            r1.d(r2, r0)     // Catch: java.lang.Exception -> L93
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityAppXposedDetails.s():void");
    }

    public final void t() {
        int i;
        if (this.q != null) {
            try {
                int integer = getResources().getInteger(2131427330);
                try {
                    i = getPackageManager().getPackageInfo("com.omarea.vaddin", 0).versionCode;
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    i = 0;
                }
                if (integer > i) {
                    if (this.q != null) {
                        unbindService(this.r);
                        this.q = null;
                    }
                    r();
                    return;
                }
                a.tr0 tr0Var = this.q;
                a.wv.s(tr0Var);
                org.json.JSONObject jSONObject = new org.json.JSONObject(((a.rr0) tr0Var).b(this.m));
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                a.wv.v(keys, "config.keys()");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (next != null) {
                        switch (next.hashCode()) {
                            case -743846049:
                                if (!next.equals("webDebug")) {
                                    break;
                                } else {
                                    q().e = jSONObject.getBoolean(next);
                                    p().e = q().e;
                                    break;
                                }
                            case 99677:
                                if (!next.equals("dpi")) {
                                    break;
                                } else {
                                    q().b = jSONObject.getInt(next);
                                    p().b = q().b;
                                    break;
                                }
                            case 539018453:
                                if (!next.equals("excludeRecent")) {
                                    break;
                                } else {
                                    q().c = jSONObject.getBoolean(next);
                                    p().c = q().c;
                                    break;
                                }
                            case 848088603:
                                if (!next.equals("smoothScroll")) {
                                    break;
                                } else {
                                    q().d = jSONObject.getBoolean(next);
                                    p().d = q().d;
                                    break;
                                }
                        }
                    }
                }
                a.gu0[] gu0VarArr = s;
                ((android.widget.Switch) this.i.a(gu0VarArr[5])).setChecked(q().d);
                ((android.widget.Switch) this.e.a(gu0VarArr[1])).setChecked(q().c);
                ((android.widget.Switch) this.l.a(gu0VarArr[8])).setChecked(q().e);
                if (q().b >= 96) {
                    o().setText(java.lang.String.valueOf(q().b));
                } else {
                    o().setText("默认");
                }
            } catch (java.lang.Exception unused) {
                android.widget.Toast.makeText(getApplicationContext(), getString(2131953326), 0).show();
            }
        }
    }
}
