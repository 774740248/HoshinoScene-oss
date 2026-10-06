package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vc0 {
    public static final java.util.HashMap c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a.ob1 f630a;
    public final android.content.Context b;

    public vc0(android.content.Context context) {
        this.b = context;
        this.f630a = new a.ob1(context);
    }

    public final java.lang.String a(java.lang.String str) {
        if (str.startsWith("file:///android_asset/")) {
            str = str.substring(22);
        }
        if (!str.contains("/")) {
            return b(str);
        }
        str.substring(0, str.lastIndexOf("/") + 1);
        return b(str);
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2 = null;
        if (str.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap = c;
        if (hashMap.containsKey(str)) {
            return (java.lang.String) hashMap.get(str);
        }
        boolean endsWith = str.endsWith(".sh");
        android.content.Context context = this.b;
        if (!endsWith) {
            if (str.startsWith("file:///android_asset/")) {
                str = str.substring(22);
            }
            java.lang.String str3 = a.pe0.f434a;
            java.lang.String g = a.pe0.g(context.getAssets(), str, str.startsWith("file:///android_asset/") ? str.substring(22) : str, context);
            if (g == null) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.g2(this, 11, str));
            } else if (!hashMap.containsKey(str)) {
                hashMap.put(str, g);
            }
            return g;
        }
        if (str.isEmpty()) {
            return null;
        }
        if (hashMap.containsKey(str)) {
            return (java.lang.String) hashMap.get(str);
        }
        if (str.startsWith("file:///android_asset/")) {
            str = str.substring(22);
        }
        try {
            a.wv.w(context, "context");
            a.wv.w(str, "fileName");
            java.io.InputStream open = context.getAssets().open(str);
            a.wv.v(open, "context.assets.open(fileName)");
            byte[] bytes = this.f630a.a(new java.lang.String(a.wv.c1(open)), false).getBytes(a.bu.f53a);
            java.lang.String substring = str.startsWith("file:///android_asset/") ? str.substring(22) : str;
            if (!a.pe0.i(context, substring, a.pe0.b(bytes))) {
                return null;
            }
            str2 = a.pe0.d(context, substring);
            hashMap.put(str, str2);
            return str2;
        } catch (java.lang.Exception unused) {
            return str2;
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap = c;
        if (hashMap.containsKey(str)) {
            return (java.lang.String) hashMap.get(str);
        }
        if (str.startsWith("file:///android_asset/")) {
            str = str.substring(22);
        } else if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        try {
            java.lang.String[] list = this.b.getAssets().list(str);
            if (list == null || list.length <= 0) {
                return a(str);
            }
            for (java.lang.String str2 : list) {
                c(str + "/" + str2);
            }
            java.lang.String d = d(str);
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, d);
            }
            return d;
        } catch (java.lang.Exception e) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.g2(this, 11, str + "\n" + e.getMessage()));
            return "";
        }
    }

    public final java.lang.String d(java.lang.String str) {
        java.lang.String str2 = a.pe0.f434a;
        if (str.startsWith("file:///android_asset/")) {
            str = str.substring(22);
        }
        return a.pe0.d(this.b, str);
    }
}
