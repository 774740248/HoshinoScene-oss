package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class x01 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f677a;
    public boolean b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;

    public x01(android.content.Context context) {
        this.f677a = 2;
        a.wv.w(context, "mContext");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558571, (android.view.ViewGroup) null);
        a.wv.v(inflate, "from(mContext).inflate(R…yout.fw_frame_time, null)");
        this.c = inflate;
        android.view.View findViewById = inflate.findViewById(2131362530);
        a.wv.v(findViewById, "view.findViewById(R.id.ft_view)");
        this.d = (com.omarea.ui.fps.FrameTimeView2) findViewById;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.screenOrientation = -1;
        layoutParams.type = 2003;
        if (context instanceof android.accessibilityservice.AccessibilityService) {
            layoutParams.type = 2032;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = -3;
        int i = 0;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.flags = 56;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        this.e = layoutParams;
        java.lang.Object systemService = context.getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f = (android.view.WindowManager) systemService;
        this.g = new a.cf0(i, this);
    }

    public static byte[] b() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 32; i += 2) {
            bArr[i / 2] = (byte) (java.lang.Character.digit("6bc1bee22e409f96e93d7e117393172a".charAt(i + 1), 16) + (java.lang.Character.digit("6bc1bee22e409f96e93d7e117393172a".charAt(i), 16) << 4));
        }
        return bArr;
    }

    // [修复] 原签名 a(String, a.a80)，但 jadx 将调用点内联为匿名 Runnable，改为 Runnable 以匹配调用点
    public final void a(java.lang.String str, java.lang.Runnable a80Var) {
        java.lang.Object valueOf;
        long longVersionCode;
        if (a.tg1.f().length() <= 0) {
            int i = a.x60.f681a;
            android.app.Activity activity = (android.app.Activity) this.e;
            java.lang.String string = activity.getString(2131953713);
            a.wv.v(string, "context.getString(R.string.user_sn_null)");
            java.lang.String string2 = ((android.app.Activity) this.e).getString(2131953714);
            a.wv.v(string2, "context.getString(R.string.user_sn_root)");
            a.fs1.a(activity, string, string2, null);
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from((android.app.Activity) this.e).inflate(2131558535, (android.view.ViewGroup) null);
        android.webkit.WebView webView = (android.webkit.WebView) inflate.findViewById(2131362963);
        final int i2 = 1;
        webView.getSettings().setJavaScriptEnabled(true);
        final int i3 = 0;
        android.content.pm.PackageInfo packageInfo = webView.getContext().getPackageManager().getPackageInfo(webView.getContext().getPackageName(), 0);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = java.lang.Long.valueOf(longVersionCode);
        } else {
            valueOf = java.lang.Integer.valueOf(packageInfo.versionCode);
        }
        java.lang.String str2 = a.wv.e(str, "paypal") ? "payment-guide-paypal.html" : a.wv.e(str, "wechat") ? "payment-guide-wx.html" : "payment-guide.html";
        java.lang.String str3 = str2 + "?t=" + ((java.lang.System.currentTimeMillis() / 1000) / 60) + "&version=" + valueOf;
        java.lang.String str4 = (!this.b || a.yi1.g2(str3, "paypal")) ? (java.lang.String) this.d : "file:///android_asset/addin/pay/";
        webView.setWebViewClient(new a.t2(1, this));
        webView.loadUrl(str4 + str3);
        int i4 = a.x60.f681a;
        final a.v60 m = a.fs1.m((android.app.Activity) this.e, inflate, true);
        android.view.View findViewById = inflate.findViewById(2131362098);
        findViewById.setOnClickListener(new a.p40(a80Var, 2));
        if (a.wv.e(str, "paypal")) {
            findViewById.setVisibility(8);
        }
        if (a.wv.e(str, "paypal")) {
            inflate.findViewById(2131362097).setOnClickListener(new a.b80(this));
        } else {
            inflate.findViewById(2131362097).setOnClickListener(new a.b80(this));
        }
    }

    public final void c(java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            ((android.app.Activity) this.e).startActivity(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void d() {
        final int i = 1;
        switch (this.f677a) {
            case 1:
                android.view.View inflate = android.view.LayoutInflater.from((android.app.Activity) this.e).inflate(2131558536, (android.view.ViewGroup) null);
                final int i2 = 0;
                inflate.findViewById(2131362958).setOnClickListener(new a.z70(this));
                inflate.findViewById(2131362961).setOnClickListener(new a.z70(this));
                final int i3 = 2;
                inflate.findViewById(2131362960).setOnClickListener(new a.z70(this));
                final int i4 = 3;
                inflate.findViewById(2131362959).setOnClickListener(new a.z70(this));
                a.wv.M0(a.wv.b(a.z80.b), null, new a.g80(this, inflate, null), 3);
                return;
            default:
                if (this.b) {
                    return;
                }
                ((android.view.WindowManager) this.f).addView((android.view.View) this.c, (android.view.WindowManager.LayoutParams) this.e);
                this.b = true;
                java.util.ArrayList arrayList = a.dc0.f93a;
                a.dc0.c((a.cf0) this.g);
                return;
        }
    }

    public x01() {
        java.lang.String obj;
        java.lang.String property;
        this.f677a = 0;
        this.c = "thermalopenssl.h";
        this.d = "6bc1bee22e409f96e93d7e117393172a";
        this.e = "UTF-8";
        this.f = "AES";
        this.g = "AES/CBC/PKCS5Padding";
        this.b = false;
        try {
            property = java.lang.System.getProperty("persist.vendor.aes_whitebox.encrypt");
        } catch (java.lang.Exception unused) {
        }
        if (property != null && property.length() != 0) {
            obj = a.yi1.G2(property).toString();
            if (!obj.equals("true") || obj.equals("1")) {
                this.b = true;
            }
            return;
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("get-prop", "persist.vendor.aes_whitebox.encrypt", null);
        obj = a.wv.e(L, "error") ? "" : a.yi1.G2(L).toString();
        if (obj.equals("true")) {
        }
        this.b = true;
    }

    public x01(android.app.Activity activity, a.c50 c50Var, a.b81 b81Var) {
        this.f677a = 1;
        a.wv.w(activity, "context");
        a.wv.w(c50Var, "exchangeHandler");
        a.wv.w(b81Var, "progressBarDialog");
        this.e = activity;
        this.f = c50Var;
        this.g = b81Var;
        this.b = true;
        this.c = "https://www.paypal.me/duduski";
        this.d = "https://vtools.oss-cn-beijing.aliyuncs.com/";
        a.wv.M0(a.wv.b(a.z80.b), null, new a.c80(this, null), 3);
    }
}
