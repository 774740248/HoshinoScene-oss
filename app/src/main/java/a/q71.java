package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q71 {
    public static final java.util.HashMap f;
    public static final java.util.LinkedHashMap g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f463a;
    public final android.content.pm.PackageManager b;
    public final android.content.SharedPreferences c;
    public final java.util.HashMap d;
    public final java.util.HashMap e;

    static {
        a.y31[] y31VarArr = {new a.y31(0, "root"), new a.y31(1000, "system"), new a.y31(1001, "radio"), new a.y31(1002, "bluetooth"), new a.y31(1010, "wifi"), new a.y31(1013, "media"), new a.y31(1019, "drm"), new a.y31(1027, "nfc"), new a.y31(1036, "logd"), new a.y31(1041, "audioserver"), new a.y31(1046, "mediacodec"), new a.y31(1047, "cameraserver"), new a.y31(1053, "webview_zygote"), new a.y31(1058, "tombstoned"), new a.y31(1066, "statsd"), new a.y31(1067, "incidentd"), new a.y31(1073, "network_stack"), new a.y31(2000, "shell"), new a.y31(9997, "everybody"), new a.y31(9999, "nobody")};
        java.util.HashMap hashMap = new java.util.HashMap(a.b20.B0(20));
        a.op.R1(hashMap, y31VarArr);
        f = hashMap;
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        a.wv.v(entrySet, "WELL_KNOWN.entries");
        int B0 = a.b20.B0(a.op.J1(entrySet, 10));
        if (B0 < 16) {
            B0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(B0);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object value = entry.getValue();
            a.wv.v(value, "it.value");
            java.util.Locale locale = java.util.Locale.ENGLISH;
            linkedHashMap.put(a.ai1.k(locale, "ENGLISH", (java.lang.String) value, locale, "this as java.lang.String).toLowerCase(locale)"), entry.getKey());
        }
        g = linkedHashMap;
    }

    public q71(android.content.Context context) {
        a.wv.w(context, "context");
        this.f463a = context;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        a.wv.v(packageManager, "context.packageManager");
        this.b = packageManager;
        this.c = context.getSharedPreferences("ProcessNameCache", 0);
        this.d = new java.util.HashMap(64);
        this.e = new java.util.HashMap(128);
    }

    public static java.lang.String a(java.util.ArrayList arrayList) {
        java.lang.Object next;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(8);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.omarea.model.ProcessInfo) it.next()).name;
            if (str != null) {
                int l2 = a.yi1.l2(str, ':', false, 6);
                if (l2 >= 0) {
                    str = str.substring(0, l2);
                    a.wv.v(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                if (d(str)) {
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str);
                    if (num == null) {
                        num = 0;
                    }
                    linkedHashMap.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
                }
            }
        }
        java.util.Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((java.lang.Number) ((java.util.Map.Entry) next).getValue()).intValue();
                do {
                    java.lang.Object next2 = it2.next();
                    int intValue2 = ((java.lang.Number) ((java.util.Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (java.lang.String) entry.getKey();
        }
        return null;
    }

    public static boolean b(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        return a.yi1.g2(k, "webview") || a.yi1.g2(k, "trichrome") || a.wv.e(k, "com.android.chrome") || a.yi1.B2(k, "org.chromium.");
    }

    public static boolean d(java.lang.String str) {
        if (str.length() == 0 || a.yi1.f2(str, '/') || a.yi1.f2(str, ' ') || a.yi1.f2(str, '@') || !a.yi1.f2(str, '.')) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '.' && charAt != '_') {
                return false;
            }
        }
        return true;
    }

    public static boolean e(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        return a.yi1.g2(k, "webview") || a.yi1.g2(k, "sandboxed_process") || a.yi1.g2(k, "trichrome");
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.String string;
        android.content.pm.PackageManager packageManager = this.b;
        java.util.HashMap hashMap = this.e;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        try {
            string = packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (java.lang.Exception unused) {
            string = this.c.getString(str, null);
            if (string == null) {
                string = str;
            }
            a.wv.v(string, "{\n            nameCache.… ?: packageName\n        }");
        }
        hashMap.put(str, string);
        return string;
    }

    public final java.lang.String f(int i) {
        java.lang.String str;
        try {
            java.lang.String nameForUid = this.b.getNameForUid(i);
            str = nameForUid != null ? a.yi1.F2(nameForUid).toString() : null;
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception unused) {
        }
        if (str.length() == 0) {
            str = null;
            if (str != null || a.yi1.f2(str, '/') || a.yi1.f2(str, ' ') || a.yi1.f2(str, '@')) {
                return null;
            }
            return str;
        }
        if (a.yi1.B2(str, "android.uid.") && a.yi1.A2(str, "android.uid.")) {
            str = str.substring(12);
            a.wv.v(str, "this as java.lang.String).substring(startIndex)");
        }
        if (str != null) {
            return null;
        }
        return str;
    }

    public final java.lang.String g(java.lang.String str, int i) {
        if (str.length() == 0 || a.wv.e(str, java.lang.String.valueOf(i))) {
            return a.ii1.d("uid:", i);
        }
        java.lang.String string = this.f463a.getString(2131953266, str, java.lang.String.valueOf(i));
        a.wv.v(string, "{\n            context.ge…uid.toString())\n        }");
        return string;
    }
}
