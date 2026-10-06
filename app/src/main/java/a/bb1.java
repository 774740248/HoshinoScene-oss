package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bb1 implements a.qy {

    /* renamed from: a, reason: collision with root package name */
    public final float f38a;

    public bb1(float f) {
        this.f38a = f;
    }

    @Override // a.qy
    public final float a(android.graphics.RectF rectF) {
        return java.lang.Math.min(rectF.width(), rectF.height()) * this.f38a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a.bb1) && this.f38a == ((a.bb1) obj).f38a;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.f38a)});
    }
}
