package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gm1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f183a;
    public final int b;
    public final int c;
    public final int d;

    public gm1(int i, int i2, int i3, int i4) {
        this.f183a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.gm1)) {
            return false;
        }
        a.gm1 gm1Var = (a.gm1) obj;
        return this.f183a == gm1Var.f183a && this.b == gm1Var.b && this.c == gm1Var.c && this.d == gm1Var.d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.d) + ((java.lang.Integer.hashCode(this.c) + ((java.lang.Integer.hashCode(this.b) + (java.lang.Integer.hashCode(this.f183a) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TimeLines(max=" + this.f183a + ", columns=" + this.b + ", lineInterval=" + this.c + ", textInterval=" + this.d + ")";
    }
}
