package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bh1 extends a.fh1 {
    public final a.dh1 c;
    public final float d;
    public final float e;

    public bh1(a.dh1 dh1Var, float f, float f2) {
        this.c = dh1Var;
        this.d = f;
        this.e = f2;
    }

    @Override // a.fh1
    public final void a(android.graphics.Matrix matrix, a.ug1 ug1Var, int i, android.graphics.Canvas canvas) {
        a.dh1 dh1Var = this.c;
        float f = dh1Var.c;
        float f2 = this.e;
        float f3 = dh1Var.b;
        float f4 = this.d;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, (float) java.lang.Math.hypot(f - f2, f3 - f4), 0.0f);
        android.graphics.Matrix matrix2 = this.f149a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        ug1Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = a.ug1.i;
        iArr[0] = ug1Var.f;
        iArr[1] = ug1Var.e;
        iArr[2] = ug1Var.d;
        android.graphics.Paint paint = ug1Var.c;
        float f5 = rectF.left;
        paint.setShader(new android.graphics.LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, a.ug1.j, android.graphics.Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        a.dh1 dh1Var = this.c;
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan((dh1Var.c - this.e) / (dh1Var.b - this.d)));
    }
}
