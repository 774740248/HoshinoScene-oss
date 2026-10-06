package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d implements a.qy {

    /* renamed from: a, reason: collision with root package name */
    public final float f87a;

    public d(float f) {
        this.f87a = f;
    }

    @Override // a.qy
    public final float a(android.graphics.RectF rectF) {
        return this.f87a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a.d) && this.f87a == ((a.d) obj).f87a;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.f87a)});
    }
}
