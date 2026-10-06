package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAddinOnline extends a.p5 {
    public static final /* synthetic */ a.gu0[] g;
    public a.j41 e;
    public final a.yq1 d = a.b20.i(this, 2131363362);
    public final int f = 65400;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAddinOnline.class, "vtools_online", "getVtools_online()Landroid/webkit/WebView;");
        a.na1.f375a.getClass();
        g = new a.gu0[]{d81Var};
    }

    public final android.webkit.WebView o() {
        return (android.webkit.WebView) this.d.a(g[0]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.lang.String str;
        if (i == this.f) {
            android.net.Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            a.j41 j41Var = this.e;
            if (j41Var != null) {
                if (data != null) {
                    try {
                        str = a.fs1.B(this, data);
                    } catch (java.lang.Exception unused) {
                        str = null;
                    }
                    a.j41 j41Var2 = this.e;
                    if (j41Var2 != null) {
                        j41Var2.a(str);
                    }
                } else {
                    j41Var.a(null);
                }
            }
            this.e = null;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        super.onCreate(bundle);
        setContentView(2131558431);
        int i = 2;
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, i));
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(-1);
        getWindow().setNavigationBarColor(0);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        a.ju1 h = a.jq1.h(getWindow().getDecorView());
        int i2 = 1;
        if (h != null) {
            h.b(true);
            h.a(true);
        }
        if (getIntent().getExtras() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("url")) {
            android.webkit.WebView o = o();
            java.lang.String string = extras.getString("url");
            a.wv.s(string);
            o.loadUrl(string);
        }
        a.b81 b81Var = new a.b81(this, null);
        o().setWebChromeClient(new a.s2(this, i2));
        o().setWebViewClient(new a.l3(b81Var, this));
        o().getSettings().setJavaScriptEnabled(true);
        o().getSettings().setLoadWithOverviewMode(true);
        o().getSettings().setUseWideViewPort(true);
        java.lang.String url = o().getUrl();
        if (url != null && (a.yi1.B2(url, "https://vtools.oss-cn-beijing.aliyuncs.com/") || a.yi1.B2(url, "https://vtools.omarea.com/"))) {
            new a.nk(o(), new a.w1(i, this)).D(this, false);
        }
        o().addJavascriptInterface(new a.n3(this, this), "SceneUI");
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        o().clearCache(true);
        o().removeAllViews();
        o().destroy();
        super.onDestroy();
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }
}
