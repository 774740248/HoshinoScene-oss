package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ft1 implements a.gt1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowId f159a;

    public ft1(android.view.View view) {
        this.f159a = view.getWindowId();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof a.ft1) && ((a.ft1) obj).f159a.equals(this.f159a);
    }

    public final int hashCode() {
        return this.f159a.hashCode();
    }
}
