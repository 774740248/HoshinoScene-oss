package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s2 extends android.webkit.WebChromeClient {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511a;
    public final /* synthetic */ a.p5 b;

    public /* synthetic */ s2(a.p5 p5Var, int i) {
        this.f511a = i;
        this.b = p5Var;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
        int i = this.f511a;
        final int i2 = 0;
        a.p5 p5Var = this.b;
        final int i3 = 1;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i4 = a.x60.f681a;
                a.v60 b = a.fs1.b(new android.app.AlertDialog.Builder((com.omarea.vtools.activities.ActionPageOnline) p5Var).setMessage(str2).setPositiveButton(2131952077, new a.f41(1)).setOnDismissListener(new a.r2()).create());
                if (b != null) {
                    b.b(false);
                }
                return true;
            default:
                int i5 = a.x60.f681a;
                a.v60 b2 = a.fs1.b(new android.app.AlertDialog.Builder((com.omarea.vtools.activities.ActivityAddinOnline) p5Var).setMessage(str2).setPositiveButton(2131952077, new a.f41(2)).setOnDismissListener(new a.r2()).create());
                if (b2 != null) {
                    b2.b(false);
                }
                return true;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, final android.webkit.JsResult jsResult) {
        int i = this.f511a;
        final int i2 = 0;
        a.p5 p5Var = this.b;
        final int i3 = 1;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i4 = a.x60.f681a;
                a.v60 b = a.fs1.b(new android.app.AlertDialog.Builder((com.omarea.vtools.activities.ActionPageOnline) p5Var).setMessage(str2).setPositiveButton(2131952077, new a.q2()).setNeutralButton(2131952076, new a.q2()).create());
                if (b != null) {
                    b.b(false);
                }
                return true;
            default:
                int i5 = a.x60.f681a;
                android.app.AlertDialog.Builder message = new android.app.AlertDialog.Builder((com.omarea.vtools.activities.ActivityAddinOnline) p5Var).setMessage(str2);
                final int i6 = 2;
                final int i7 = 3;
                a.v60 b2 = a.fs1.b(message.setPositiveButton(2131952077, new a.q2()).setNeutralButton(2131952076, new a.q2()).create());
                if (b2 != null) {
                    b2.b(false);
                }
                return true;
        }
    }
}
