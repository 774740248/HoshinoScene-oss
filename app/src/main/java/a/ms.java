package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class ms {

    public ms() {
        this(null);
    }
    public static final java.util.LinkedHashMap b = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361a = "pro_key_expire_date";

    public ms(android.app.Application application) {
    }

    public final java.lang.String a() {
        java.util.LinkedHashMap linkedHashMap = b;
        java.lang.String str = this.f361a;
        if (!linkedHashMap.containsKey(str)) {
            a.q10 q10Var = a.q10.f457a;
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.D().getString("random_id2", "");
            a.wv.s(string);
            java.lang.String g = a.q10.g(string);
            if (g != null && g.length() > 0 && !a.wv.e(g, "error")) {
                linkedHashMap.put(str, g);
            }
        }
        if (linkedHashMap.containsKey(str)) {
            return (java.lang.String) linkedHashMap.get(str);
        }
        return null;
    }

    public final void b() {
        java.util.LinkedHashMap linkedHashMap = b;
        java.lang.String str = this.f361a;
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.remove(str);
        }
        a();
    }

    public final java.lang.String toString() {
        java.lang.String a2 = a();
        return a2 == null ? "" : a2;
    }
}
