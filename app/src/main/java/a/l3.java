package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l3 extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.b81 f308a;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAddinOnline b;

    public l3(a.b81 b81Var, com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline) {
        this.f308a = b81Var;
        this.b = activityAddinOnline;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        this.f308a.a();
        if (webView != null) {
            this.b.setTitle(webView.getTitle());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        java.lang.String string = this.b.getString(2131953213);
        a.wv.v(string, "getString(R.string.please_wait)");
        this.f308a.b(string);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
