package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hx0 {
    public static final a.hx0 b = new a.hx0(new a.jx0(a.gx0.a(new java.util.Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final a.ix0 f221a;

    public hx0(a.jx0 jx0Var) {
        this.f221a = jx0Var;
    }

    public static a.hx0 a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        java.lang.String[] split = str.split(",", -1);
        int length = split.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = a.fx0.a(split[i]);
        }
        return new a.hx0(new a.jx0(a.gx0.a(localeArr)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof a.hx0) {
            if (this.f221a.equals(((a.hx0) obj).f221a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f221a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f221a.toString();
    }
}
