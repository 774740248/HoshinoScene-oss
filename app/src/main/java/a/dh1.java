package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dh1 extends a.eh1 {
    public float b;
    public float c;

    @Override // a.eh1
    public final void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.f122a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
