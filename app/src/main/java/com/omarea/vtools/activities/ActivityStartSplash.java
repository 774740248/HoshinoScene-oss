package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityStartSplash extends a.ml {
    public static final a.fa0 q;
    public static final /* synthetic */ a.gu0[] r;
    public static boolean s;
    public final a.yq1 c = a.b20.i(this, 2131362787);
    public final a.yq1 d = a.b20.i(this, 2131362789);
    public final a.yq1 e = a.b20.i(this, 2131362802);
    public final a.yq1 f = a.b20.i(this, 2131363189);
    public final a.yq1 g = a.b20.i(this, 2131362511);
    public final a.yq1 h = a.b20.i(this, 2131363173);
    public final a.yq1 i = a.b20.i(this, 2131363174);
    public final a.yq1 j = a.b20.i(this, 2131363369);
    public final a.vj1 k = new a.vj1(new a.of(this, 2));
    public final a.vj1 l = new a.vj1(new a.of(this, 0));
    public final a.vj1 m = new a.vj1(new a.of(this, 1));
    public final long n = java.lang.System.currentTimeMillis();
    public java.lang.String o = "";
    public final java.lang.String p = "/storage/emulated/0/Android/data/com.omarea.vtools/up.sh";

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "mode_adb", "getMode_adb()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        r = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "mode_basic", "getMode_basic()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "mode_root", "getMode_root()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "start_state_text", "getStart_state_text()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "footer_menu", "getFooter_menu()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "splash_bg", "getSplash_bg()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "splash_title", "getSplash_title()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityStartSplash.class, "working_mode", "getWorking_mode()Landroid/widget/LinearLayout;")};
        q = new a.fa0(13, 0);
    }

    public static final java.lang.Object i(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar) {
        activityStartSplash.getClass();
        java.lang.Object a2 = new a.lu(activityStartSplash, new a.ye(activityStartSplash, 1), new a.ye(activityStartSplash, 2)).a(eyVar);
        return a2 == a.dz.c ? a2 : a.no1.f387a;
    }

    public static final java.lang.Object j(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar) {
        activityStartSplash.getClass();
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.O("working_mode", "root");
        a.u20 u20Var = a.z80.f728a;
        java.lang.Object S1 = a.wv.S1(a.by0.f57a, new a.vf(activityStartSplash, null), eyVar);
        return S1 == a.dz.c ? S1 : a.no1.f387a;
    }

    public final void k() {
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E("working_mode", "");
        java.lang.String E2 = a.fs1.E("scene1_contract", "");
        if (E == null || E.length() == 0 || !a.wv.e(E, E2)) {
            o();
        } else {
            u(new a.xa(E, 8, this));
        }
    }

    public final void l() {
        if (a.wk.e != null) {
            a.wk.i.cancel(256);
            a.wk.e = null;
        }
        a.gy.S(this);
        s().setText(getString(2131953344));
        a.cp cpVar = com.omarea.Scene.c;
        if (a.wv.e(a.fs1.E("scene1_contract", ""), "adb")) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.gf(this, null), 3);
        } else {
            t("adb");
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [a.fp0, a.lj1] */
    public final void m() {
        if (a.wk.e != null) {
            a.wk.i.cancel(256);
            a.wk.e = null;
        }
        a.gy.S(this);
        a.q10 q10Var = a.q10.f457a;
        if (!a.wv.e(a.q10.t(), "basic")) {
            a.wv.v1(new a.lj1(2, null));
        }
        v();
    }

    public final void n() {
        s().setText(getString(2131953344));
        a.cp cpVar = com.omarea.Scene.c;
        if (!a.wv.e(a.fs1.E("scene1_contract", ""), "root")) {
            t("root");
            return;
        }
        a.ty tyVar = a.z80.b;
        a.Cif cif = new a.Cif(this, null);
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
        a.f av0Var = i2 == 2 ? new a.av0(W, cif) : new a.f(W, true);
        av0Var.S(i2, av0Var, cif);
    }

    public final void o() {
        int i = 1;
        boolean z = !new a.ep1(this).a();
        a.yq1 yq1Var = this.e;
        a.gu0[] gu0VarArr = r;
        int i2 = 2;
        if (z) {
            ((android.widget.LinearLayout) yq1Var.a(gu0VarArr[2])).setVisibility(8);
        }
        s().setText(getString(2131953361));
        a.gu0 gu0Var = gu0VarArr[7];
        a.yq1 yq1Var2 = this.j;
        if (((android.widget.LinearLayout) yq1Var2.a(gu0Var)).getVisibility() != 0) {
            ((android.widget.LinearLayout) yq1Var2.a(gu0VarArr[7])).setVisibility(0);
        }
        ((android.widget.LinearLayout) this.d.a(gu0VarArr[1])).setOnClickListener(new a.ze(this, i));
        ((android.widget.LinearLayout) this.c.a(gu0VarArr[0])).setOnClickListener(new a.ze(this, i2));
        ((android.widget.LinearLayout) yq1Var.a(gu0VarArr[2])).setOnClickListener(new a.ze(this, 3));
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        a.ql1.e(this);
        android.content.Intent intent = getIntent();
        if (intent != null && intent.hasExtra("port")) {
            java.lang.String stringExtra = getIntent().getStringExtra("port");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.Integer c2 = a.wi1.c2(stringExtra);
            if (c2 != null) {
                int intValue = c2.intValue();
                a.vj1 vj1Var = a.ep1.b;
                a.fs1.v().f544a = intValue;
                a.q10 q10Var = a.q10.f457a;
                if (1 <= intValue && intValue < 65535) {
                    a.q10.c = intValue;
                }
            }
        }
        setContentView(2131558469);
        int i = 0;
        p().postDelayed(new a.ye(this, i), 750L);
        a.cp cpVar = com.omarea.Scene.c;
        new a.la0(a.fs1.t()).a(false);
        if (a.fs1.D().contains("agreement_v6")) {
            k();
        } else {
            android.view.View inflate = getLayoutInflater().inflate(2131558559, (android.view.ViewGroup) null);
            int i2 = a.x60.f681a;
            a.wv.v(inflate, "view");
            a.v60 m = a.fs1.m(this, inflate, false);
            android.webkit.WebView webView = (android.webkit.WebView) inflate.findViewById(2131361956);
            webView.setWebViewClient(new android.webkit.WebViewClient());
            webView.loadUrl("http://vtools.omarea.com/scene-policy.html");
            ((android.widget.Button) inflate.findViewById(2131362097)).setOnClickListener(new a.ze(this, i));
            ((android.widget.Button) inflate.findViewById(2131362098)).setOnClickListener(new a.af(m, this, i));
        }
        if (a.fs1.s("keep_alive", true)) {
            android.content.Context applicationContext = getApplicationContext();
            a.wv.v(applicationContext, "applicationContext");
            android.content.ComponentName componentName = new android.content.ComponentName(a.fs1.t(), (java.lang.Class<?>) com.omarea.vtools.services.KeepAliveService.class);
            java.lang.Object systemService = applicationContext.getSystemService("activity");
            a.wv.t(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (((android.app.ActivityManager) systemService).getRunningServiceControlPanel(componentName) != null) {
                return;
            }
            android.content.Context applicationContext2 = getApplicationContext();
            a.wv.v(applicationContext2, "applicationContext");
            java.lang.Object systemService2 = applicationContext2.getSystemService("accessibility");
            a.wv.t(systemService2, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) systemService2).getEnabledAccessibilityServiceList(-1).iterator();
            while (it.hasNext()) {
                java.lang.String id = it.next().getId();
                a.wv.v(id, "serviceInfo.id");
                if (a.yi1.h2(id, "AccessibilitySceneMode", false)) {
                    return;
                }
            }
            startForegroundService(new android.content.Intent(getApplicationContext(), (java.lang.Class<?>) com.omarea.vtools.services.KeepAliveService.class));
        }
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        android.util.Log.d("Scene", ">>>>启动耗时" + (java.lang.System.currentTimeMillis() - this.n));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        ((a.b81) this.k.a()).a();
        super.onPause();
    }

    public final android.widget.LinearLayout p() {
        return (android.widget.LinearLayout) this.g.a(r[4]);
    }

    public final android.widget.ImageView q() {
        return (android.widget.ImageView) this.h.a(r[5]);
    }

    public final android.widget.LinearLayout r() {
        return (android.widget.LinearLayout) this.i.a(r[6]);
    }

    public final android.widget.TextView s() {
        return (android.widget.TextView) this.f.a(r[3]);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [a.ka1, java.lang.Object] */
    public final void t(java.lang.String str) {
        android.view.View inflate = getLayoutInflater().inflate((a.wv.e(str, "root") || a.wv.e(str, "adb")) ? 2131558518 : 2131558514, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(2131362255)).setText(a.wv.e(str, "root") ? getString(2131953333) : a.wv.e(str, "adb") ? getString(2131953329) : getString(2131953332));
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(this, inflate, false);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(2131362098);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131361955);
        java.util.Timer timer = new java.util.Timer("SplashTimeout");
        a.ka1 obj = new a.ka1();
        int i2 = 3;
        obj.c = a.wv.e(str, "root") ? 9 : a.wv.e(str, "adb") ? 3 : 1;
        a.ka1 obj2 = new a.ka1();
        timer.schedule(new a.x5(obj, button, timer, this, 1), 0L, 1000L);
        m.b.add(new a.p60(i2, timer));
        inflate.findViewById(2131362097).setOnClickListener(new a.af(m, this, 1));
        button.setOnClickListener(new a.bf(switchOptionItemView, obj, obj2, m, str, this, 0));
    }

    public final void u(java.lang.Runnable runnable) {
        java.lang.String d = a.pe0.d(this, "busybox");
        if (!a.ai1.w(d)) {
            android.content.res.AssetManager assets = getAssets();
            a.wv.v(assets, "assets");
            if (!a.wv.e(a.pe0.g(assets, "toolkit/busybox", "busybox", this), d)) {
                return;
            }
        }
        java.lang.String a2 = new a.v10(this).a();
        if (a2 == null) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("Unable to extract file!", 0);
            return;
        }
        this.o = a2;
        a.q10 q10Var = a.q10.f457a;
        a.vj1 vj1Var = a.ep1.b;
        a.q10.F(a2, a.fs1.v());
        runnable.run();
    }

    public final void v() {
        s().setText("Completed!");
        startActivity(new android.content.Intent(getApplicationContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityMain.class));
        s = true;
        finish();
    }
}
