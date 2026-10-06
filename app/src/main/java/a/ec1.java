package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ec1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f120a;
    public final boolean b;

    public ec1(boolean z, boolean z2) {
        this.f120a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.ec1)) {
            return false;
        }
        a.ec1 ec1Var = (a.ec1) obj;
        return this.f120a == ec1Var.f120a && this.b == ec1Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f120a;
        int i = (z) ? 1 : 0;
        if (z) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.b;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final java.lang.String toString() {
        return "CopyPreferences(spaceCheck=" + this.f120a + ", parallel=" + this.b + ")";
    }
}
