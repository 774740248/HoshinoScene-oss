package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ua1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f585a;
    public final int b;
    public final int c;
    public final float d;

    public ua1(float f, int i, int i2, int i3) {
        this.f585a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.ua1)) {
            return false;
        }
        a.ua1 ua1Var = (a.ua1) obj;
        return this.f585a == ua1Var.f585a && this.b == ua1Var.b && this.c == ua1Var.c && java.lang.Float.compare(this.d, ua1Var.d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.d) + ((java.lang.Integer.hashCode(this.c) + ((java.lang.Integer.hashCode(this.b) + (java.lang.Integer.hashCode(this.f585a) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Mode(modeId=" + this.f585a + ", width=" + this.b + ", height=" + this.c + ", refreshRate=" + this.d + ")";
    }
}
