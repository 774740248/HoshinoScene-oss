package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yg1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.gh1[] f708a = new a.gh1[4];
    public final android.graphics.Matrix[] b = new android.graphics.Matrix[4];
    public final android.graphics.Matrix[] c = new android.graphics.Matrix[4];
    public final android.graphics.PointF d = new android.graphics.PointF();
    public final android.graphics.Path e = new android.graphics.Path();
    public final android.graphics.Path f = new android.graphics.Path();
    public final a.gh1 g = new a.gh1();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final android.graphics.Path j = new android.graphics.Path();
    public final android.graphics.Path k = new android.graphics.Path();
    public final boolean l = true;

    public yg1() {
        for (int i = 0; i < 4; i++) {
            this.f708a[i] = new a.gh1();
            this.b[i] = new android.graphics.Matrix();
            this.c[i] = new android.graphics.Matrix();
        }
    }

    public final void a(a.wg1 wg1Var, float f, android.graphics.RectF rectF, a.pe peVar, android.graphics.Path path) {
        int i;
        android.graphics.Matrix[] matrixArr;
        float[] fArr;
        android.graphics.Matrix[] matrixArr2;
        a.gh1[] gh1VarArr;
        android.graphics.Path path2;
        a.pe peVar2;
        int i2;
        a.yg1 yg1Var = this;
        a.pe peVar3 = peVar;
        android.graphics.Path path3 = path;
        path.rewind();
        android.graphics.Path path4 = yg1Var.e;
        path4.rewind();
        android.graphics.Path path5 = yg1Var.f;
        path5.rewind();
        path5.addRect(rectF, android.graphics.Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i = 4;
            matrixArr = yg1Var.c;
            fArr = yg1Var.h;
            matrixArr2 = yg1Var.b;
            gh1VarArr = yg1Var.f708a;
            if (i3 >= 4) {
                break;
            }
            a.qy qyVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? wg1Var.f : wg1Var.e : wg1Var.h : wg1Var.g;
            a.b20 b20Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? wg1Var.b : wg1Var.f661a : wg1Var.d : wg1Var.c;
            a.gh1 gh1Var = gh1VarArr[i3];
            b20Var.getClass();
            b20Var.U(f, qyVar.a(rectF), gh1Var);
            int i4 = i3 + 1;
            float f2 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            android.graphics.PointF pointF = yg1Var.d;
            if (i3 == 1) {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            a.gh1 gh1Var2 = gh1VarArr[i3];
            fArr[0] = gh1Var2.c;
            fArr[1] = gh1Var2.d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f2);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            a.gh1 gh1Var3 = gh1VarArr[i5];
            fArr[0] = gh1Var3.f176a;
            fArr[1] = gh1Var3.b;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path3.moveTo(fArr[0], fArr[1]);
            } else {
                path3.lineTo(fArr[0], fArr[1]);
            }
            gh1VarArr[i5].b(matrixArr2[i5], path3);
            if (peVar3 != null) {
                a.gh1 gh1Var4 = gh1VarArr[i5];
                android.graphics.Matrix matrix = matrixArr2[i5];
                java.util.BitSet bitSet = ((a.gz0) peVar3.c).f;
                gh1Var4.getClass();
                bitSet.set(i5, false);
                a.fh1[] fh1VarArr = ((a.gz0) peVar3.c).d;
                gh1Var4.a(gh1Var4.f);
                fh1VarArr[i5] = new a.zg1(new java.util.ArrayList(gh1Var4.h), new android.graphics.Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            a.gh1 gh1Var5 = gh1VarArr[i5];
            fArr[0] = gh1Var5.c;
            fArr[1] = gh1Var5.d;
            matrixArr2[i5].mapPoints(fArr);
            a.gh1 gh1Var6 = gh1VarArr[i7];
            float f3 = gh1Var6.f176a;
            float[] fArr2 = yg1Var.i;
            fArr2[0] = f3;
            fArr2[1] = gh1Var6.b;
            matrixArr2[i7].mapPoints(fArr2);
            float max = java.lang.Math.max(((float) java.lang.Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            a.gh1 gh1Var7 = gh1VarArr[i5];
            fArr[0] = gh1Var7.c;
            fArr[1] = gh1Var7.d;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                java.lang.Math.abs(rectF.centerX() - fArr[0]);
            } else {
                java.lang.Math.abs(rectF.centerY() - fArr[1]);
            }
            a.gh1 gh1Var8 = yg1Var.g;
            gh1Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? wg1Var.j : wg1Var.i : wg1Var.l : wg1Var.k).getClass();
            gh1Var8.c(max, 0.0f);
            android.graphics.Path path6 = yg1Var.j;
            path6.reset();
            gh1Var8.b(matrixArr[i5], path6);
            if (yg1Var.l && (yg1Var.b(path6, i5) || yg1Var.b(path6, i7))) {
                path6.op(path6, path5, android.graphics.Path.Op.DIFFERENCE);
                fArr[0] = gh1Var8.f176a;
                fArr[1] = gh1Var8.b;
                matrixArr[i5].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                gh1Var8.b(matrixArr[i5], path4);
                peVar2 = peVar;
                path2 = path;
            } else {
                path2 = path;
                gh1Var8.b(matrixArr[i5], path2);
                peVar2 = peVar;
            }
            if (peVar2 != null) {
                android.graphics.Matrix matrix2 = matrixArr[i5];
                ((a.gz0) peVar2.c).f.set(i5 + 4, false);
                a.fh1[] fh1VarArr2 = ((a.gz0) peVar2.c).e;
                gh1Var8.a(gh1Var8.f);
                fh1VarArr2[i5] = new a.zg1(new java.util.ArrayList(gh1Var8.h), new android.graphics.Matrix(matrix2));
            }
            yg1Var = this;
            path3 = path2;
            i5 = i6;
            i = 4;
            peVar3 = peVar2;
        }
        android.graphics.Path path7 = path3;
        path.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, android.graphics.Path.Op.UNION);
    }

    public final boolean b(android.graphics.Path path, int i) {
        android.graphics.Path path2 = this.k;
        path2.reset();
        this.f708a[i].b(this.b[i], path2);
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, android.graphics.Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
