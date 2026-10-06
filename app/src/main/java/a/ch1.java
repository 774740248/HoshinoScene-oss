package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ch1 extends a.eh1 {
    public static final android.graphics.RectF h = new android.graphics.RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    public ch1(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // a.eh1
    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.f122a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        android.graphics.RectF rectF = h;
        rectF.set(this.b, this.c, this.d, this.e);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
