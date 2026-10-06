package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t2 extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f545a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ t2(int i, java.lang.Object obj) {
        this.f545a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        switch (this.f545a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                super.onPageFinished(webView, str);
                com.omarea.vtools.activities.ActionPageOnline actionPageOnline = (com.omarea.vtools.activities.ActionPageOnline) this.b;
                actionPageOnline.l.a();
                if (webView != null) {
                    actionPageOnline.setTitle(webView.getTitle());
                    return;
                }
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        switch (this.f545a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                super.onPageStarted(webView, str, bitmap);
                com.omarea.vtools.activities.ActionPageOnline actionPageOnline = (com.omarea.vtools.activities.ActionPageOnline) this.b;
                a.b81 b81Var = actionPageOnline.l;
                java.lang.String string = actionPageOnline.getString(2131953213);
                a.wv.v(string, "getString(R.string.please_wait)");
                b81Var.b(string);
                return;
            default:
                super.onPageStarted(webView, str, bitmap);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        switch (this.f545a) {
            case 1:
                return super.shouldInterceptRequest(webView, webResourceRequest);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        android.net.Uri url;
        java.lang.String scheme;
        java.lang.String str;
        android.net.Uri url2;
        int i = this.f545a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (webResourceRequest != null) {
                    try {
                        url = webResourceRequest.getUrl();
                    } catch (java.lang.Exception unused) {
                        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                    }
                } else {
                    url = null;
                }
                if (url != null && ((scheme = url.getScheme()) == null || !a.yi1.B2(scheme, "http"))) {
                    ((com.omarea.vtools.activities.ActionPageOnline) obj).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url.toString())));
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            default:
                if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (str = url2.toString()) == null) {
                    str = "";
                }
                if (a.yi1.B2(str, "https://www.paypal.")) {
                    ((a.x01) obj).c(str);
                    return true;
                }
                if (!a.yi1.B2(str, "mailto:")) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                ((a.x01) obj).c(str);
                return true;
        }
    }
}
