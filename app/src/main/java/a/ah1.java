package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ah1 extends a.fh1 {
    public final a.ch1 c;

    public ah1(a.ch1 ch1Var) {
        this.c = ch1Var;
    }

    @Override // a.fh1
    public final void a(android.graphics.Matrix matrix, a.ug1 ug1Var, int i, android.graphics.Canvas canvas) {
        a.ch1 ch1Var = this.c;
        float f = ch1Var.f;
        float f2 = ch1Var.g;
        android.graphics.RectF rectF = new android.graphics.RectF(ch1Var.b, ch1Var.c, ch1Var.d, ch1Var.e);
        ug1Var.getClass();
        boolean z = f2 < 0.0f;
        android.graphics.Path path = ug1Var.g;
        int[] iArr = a.ug1.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = ug1Var.f;
            iArr[2] = ug1Var.e;
            iArr[3] = ug1Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = ug1Var.d;
            iArr[2] = ug1Var.e;
            iArr[3] = ug1Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = a.ug1.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, android.graphics.Shader.TileMode.CLAMP);
        android.graphics.Paint paint = ug1Var.b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawPath(path, ug1Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
