package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActionPageOnline extends a.p5 {
    public static final /* synthetic */ a.gu0[] p;
    public a.j41 m;
    public java.util.Timer o;
    public final a.yq1 d = a.b20.i(this, 2131362679);
    public final a.yq1 e = a.b20.i(this, 2131362680);
    public final a.yq1 f = a.b20.i(this, 2131362681);
    public final a.yq1 g = a.b20.i(this, 2131362682);
    public final a.yq1 h = a.b20.i(this, 2131362683);
    public final a.yq1 i = a.b20.i(this, 2131362684);
    public final a.yq1 j = a.b20.i(this, 2131362686);
    public final a.yq1 k = a.b20.i(this, 2131362687);
    public final a.b81 l = new a.b81(this, null);
    public final int n = 65400;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_download_name", "getKr_download_name()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        p = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_download_name_copy", "getKr_download_name_copy()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_download_progress", "getKr_download_progress()Landroid/widget/ProgressBar;"), new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_download_state", "getKr_download_state()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_download_url", "getKr_download_url()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_download_url_copy", "getKr_download_url_copy()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_online_root", "getKr_online_root()Landroid/widget/RelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActionPageOnline.class, "kr_online_webview", "getKr_online_webview()Landroid/webkit/WebView;")};
    }

    public final android.webkit.WebView o() {
        return (android.webkit.WebView) this.k.a(p[7]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.lang.String str;
        if (i == this.n) {
            android.net.Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            a.j41 j41Var = this.m;
            if (j41Var != null) {
                if (data != null) {
                    try {
                        str = a.fs1.B(this, data);
                    } catch (java.lang.Exception unused) {
                        str = null;
                    }
                    a.j41 j41Var2 = this.m;
                    if (j41Var2 != null) {
                        j41Var2.a(str);
                    }
                } else {
                    j41Var.a(null);
                }
            }
            this.m = null;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        java.lang.String uuid;
        super.onCreate(bundle);
        setContentView(2131558429);
        android.view.View findViewById = findViewById(2131363296);
        a.wv.t(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById;
        setSupportActionBar(toolbar);
        setTitle(2131951876);
        a.d1 supportActionBar = getSupportActionBar();
        a.wv.s(supportActionBar);
        supportActionBar.n();
        a.d1 supportActionBar2 = getSupportActionBar();
        a.wv.s(supportActionBar2);
        final int i = 1;
        supportActionBar2.m(true);
        final int i2 = 0;
        toolbar.setNavigationOnClickListener(new a.p2(this));
        android.content.Intent intent = getIntent();
        if (intent.getExtras() != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("title")) {
                java.lang.String string = extras.getString("title");
                a.wv.s(string);
                setTitle(string);
            }
            android.view.Window window = getWindow();
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            if (!getThemeMode().f442a) {
                window.setStatusBarColor(-1);
                window.setNavigationBarColor(0);
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    window.setNavigationBarContrastEnforced(false);
                }
                a.ju1 h = a.jq1.h(window.getDecorView());
                if (h != null) {
                    h.b(true);
                    h.a(true);
                }
            }
            getWindow().getDecorView().setSystemUiVisibility(1024);
            a.gu0[] gu0VarArr = p;
            ((android.widget.RelativeLayout) this.j.a(gu0VarArr[6])).setFitsSystemWindows(true);
            if (extras.containsKey("config")) {
                java.lang.String string2 = extras.getString("config");
                a.wv.s(string2);
                p(string2);
            } else if (extras.containsKey("url")) {
                java.lang.String string3 = extras.getString("url");
                a.wv.s(string3);
                p(string3);
            }
            if (extras.containsKey("downloadUrl")) {
                a.f90 f90Var = new a.f90(this);
                java.lang.String string4 = extras.getString("downloadUrl");
                a.wv.s(string4);
                if (extras.containsKey("taskId")) {
                    uuid = extras.getString("taskId");
                    a.wv.s(uuid);
                } else {
                    uuid = java.util.UUID.randomUUID().toString();
                }
                java.lang.String str = uuid;
                a.wv.v(str, "if (extras.containsKey(\"…D.randomUUID().toString()");
                final int i3 = 2;
                if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    f90Var.c(str, 0);
                    requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
                    int i4 = a.x60.f681a;
                    java.lang.String string5 = getString(2131952777);
                    a.wv.v(string5, "getString(R.string.kr_write_external_storage)");
                    a.fs1.F(this, "", string5, null);
                } else {
                    java.lang.Long a2 = f90Var.a(string4, null, null, str, null);
                    if (a2 != null) {
                        ((android.widget.TextView) this.h.a(gu0VarArr[4])).setText(string4);
                        boolean z = extras.containsKey("autoClose") && extras.getBoolean("autoClose");
                        f90Var.c(str, 0);
                        long longValue = a2.longValue();
                        ((android.widget.LinearLayout) this.g.a(gu0VarArr[3])).setVisibility(0);
                        java.lang.Object systemService = getSystemService("download");
                        a.wv.t(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                        android.app.DownloadManager.Query filterById = new android.app.DownloadManager.Query().setFilterById(longValue);
                        ((android.widget.ImageButton) this.e.a(gu0VarArr[1])).setOnClickListener(new a.p2(this));
                        ((android.widget.ImageButton) this.i.a(gu0VarArr[5])).setOnClickListener(new a.p2(this));
                        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                        a.f90 f90Var2 = new a.f90(this);
                        java.util.Timer timer = new java.util.Timer("ProgressPolling");
                        this.o = timer;
                        timer.schedule(new a.v2((android.app.DownloadManager) systemService, filterById, this, handler, f90Var2, longValue, str, z), 200L, 500L);
                    } else {
                        f90Var.c(str, -1);
                    }
                }
            }
        }
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, i));
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        java.util.Timer timer = this.o;
        if (timer != null) {
            timer.cancel();
            this.o = null;
        }
        super.onDestroy();
    }

    public final void p(java.lang.String str) {
        o().setVisibility(0);
        o().setWebChromeClient(new a.s2(this, 0));
        o().setWebViewClient(new a.t2(0, this));
        o().loadUrl(str);
        new a.nk(o(), new a.w1(1, this)).D(this, a.yi1.B2(str, "file:///android_asset"));
    }
}
