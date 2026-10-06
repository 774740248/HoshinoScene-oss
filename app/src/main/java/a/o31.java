package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o31 implements a.av {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f402a;

    public o31(java.lang.Class cls) {
        a.wv.w(cls, "jClass");
        this.f402a = cls;
    }

    @Override // a.av
    public final java.lang.Class a() {
        return this.f402a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof a.o31) {
            if (a.wv.e(this.f402a, ((a.o31) obj).f402a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f402a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f402a.toString() + " (Kotlin reflection is not available)";
    }
}
