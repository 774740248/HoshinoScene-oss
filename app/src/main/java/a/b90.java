package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b90 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f34a;

    public b90(android.view.DisplayCutout displayCutout) {
        this.f34a = displayCutout;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.b90.class != obj.getClass()) {
            return false;
        }
        return a.x21.a(this.f34a, ((a.b90) obj).f34a);
    }

    public final int hashCode() {
        int hashCode;
        android.view.DisplayCutout displayCutout = this.f34a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.f34a + "}";
    }
}
