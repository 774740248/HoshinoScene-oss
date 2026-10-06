package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lk implements a.qy {

    /* renamed from: a, reason: collision with root package name */
    public final a.qy f322a;
    public final float b;

    public lk(float f, a.qy qyVar) {
        while (qyVar instanceof a.lk) {
            qyVar = ((a.lk) qyVar).f322a;
            f += ((a.lk) qyVar).b;
        }
        this.f322a = qyVar;
        this.b = f;
    }

    @Override // a.qy
    public final float a(android.graphics.RectF rectF) {
        return java.lang.Math.max(0.0f, this.f322a.a(rectF) + this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a.lk)) {
            return false;
        }
        a.lk lkVar = (a.lk) obj;
        return this.f322a.equals(lkVar.f322a) && this.b == lkVar.b;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f322a, java.lang.Float.valueOf(this.b)});
    }
}
