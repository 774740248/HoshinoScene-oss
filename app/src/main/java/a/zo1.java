package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zo1 {
    public static final android.graphics.Matrix p = new android.graphics.Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f741a;
    public final android.graphics.Path b;
    public final android.graphics.Matrix c;
    public android.graphics.Paint d;
    public android.graphics.Paint e;
    public android.graphics.PathMeasure f;
    public final a.wo1 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public java.lang.String m;
    public java.lang.Boolean n;
    public final a.kp o;

    /* JADX WARN: Type inference failed for: r0v4, types: [a.rh1, a.kp] */
    public zo1() {
        this.c = new android.graphics.Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = (kp) new a.rh1();
        this.g = new a.wo1();
        this.f741a = new android.graphics.Path();
        this.b = new android.graphics.Path();
    }

    public final void a(a.wo1 wo1Var, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i, int i2) {
        int i3;
        float f;
        wo1Var.f668a.set(matrix);
        android.graphics.Matrix matrix2 = wo1Var.f668a;
        matrix2.preConcat(wo1Var.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = wo1Var.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            a.xo1 xo1Var = (a.xo1) arrayList.get(i4);
            if (xo1Var instanceof a.wo1) {
                a((a.wo1) xo1Var, matrix2, canvas, i, i2);
            } else if (xo1Var instanceof a.yo1) {
                a.yo1 yo1Var = (a.yo1) xo1Var;
                float f2 = i / this.j;
                float f3 = i2 / this.k;
                float min = java.lang.Math.min(f2, f3);
                android.graphics.Matrix matrix3 = this.c;
                matrix3.set(matrix2);
                matrix3.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) java.lang.Math.hypot(fArr[c], fArr[1]);
                i3 = i4;
                float hypot2 = (float) java.lang.Math.hypot(fArr[2], fArr[3]);
                float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = java.lang.Math.max(hypot, hypot2);
                float abs = max > 0.0f ? java.lang.Math.abs(f4) / max : 0.0f;
                if (abs != 0.0f) {
                    yo1Var.getClass();
                    android.graphics.Path path = this.f741a;
                    path.reset();
                    a.s41[] s41VarArr = yo1Var.f714a;
                    if (s41VarArr != null) {
                        a.s41.b(s41VarArr, path);
                    }
                    android.graphics.Path path2 = this.b;
                    path2.reset();
                    if (yo1Var instanceof a.uo1) {
                        path2.setFillType(yo1Var.c == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        a.vo1 vo1Var = (a.vo1) yo1Var;
                        float f5 = vo1Var.j;
                        if (f5 != 0.0f || vo1Var.k != 1.0f) {
                            float f6 = vo1Var.l;
                            float f7 = (f5 + f6) % 1.0f;
                            float f8 = (vo1Var.k + f6) % 1.0f;
                            if (this.f == null) {
                                this.f = new android.graphics.PathMeasure();
                            }
                            this.f.setPath(path, false);
                            float length = this.f.getLength();
                            float f9 = f7 * length;
                            float f10 = f8 * length;
                            path.reset();
                            if (f9 > f10) {
                                this.f.getSegment(f9, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f10, path, true);
                            } else {
                                f = 0.0f;
                                this.f.getSegment(f9, f10, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix3);
                        a.p4 p4Var = vo1Var.g;
                        if ((((android.graphics.Shader) p4Var.d) == null && p4Var.c == 0) ? false : true) {
                            if (this.e == null) {
                                android.graphics.Paint paint = new android.graphics.Paint(1);
                                this.e = paint;
                                paint.setStyle(android.graphics.Paint.Style.FILL);
                            }
                            android.graphics.Paint paint2 = this.e;
                            java.lang.Object obj = p4Var.d;
                            if (((android.graphics.Shader) obj) != null) {
                                android.graphics.Shader shader = (android.graphics.Shader) obj;
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(java.lang.Math.round(vo1Var.i * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i5 = p4Var.c;
                                float f11 = vo1Var.i;
                                android.graphics.PorterDuff.Mode mode = a.cp1.l;
                                paint2.setColor((i5 & 16777215) | (((int) (android.graphics.Color.alpha(i5) * f11)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(vo1Var.c == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        a.p4 p4Var2 = vo1Var.e;
                        if (((android.graphics.Shader) p4Var2.d) != null || p4Var2.c != 0) {
                            if (this.d == null) {
                                android.graphics.Paint paint3 = new android.graphics.Paint(1);
                                this.d = paint3;
                                paint3.setStyle(android.graphics.Paint.Style.STROKE);
                            }
                            android.graphics.Paint paint4 = this.d;
                            android.graphics.Paint.Join join = vo1Var.n;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            android.graphics.Paint.Cap cap = vo1Var.m;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(vo1Var.o);
                            java.lang.Object obj2 = p4Var2.d;
                            if (((android.graphics.Shader) obj2) != null) {
                                android.graphics.Shader shader2 = (android.graphics.Shader) obj2;
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(java.lang.Math.round(vo1Var.h * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i6 = p4Var2.c;
                                float f12 = vo1Var.h;
                                android.graphics.PorterDuff.Mode mode2 = a.cp1.l;
                                paint4.setColor((i6 & 16777215) | (((int) (android.graphics.Color.alpha(i6) * f12)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(vo1Var.f * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i4 = i3 + 1;
                c = 0;
            }
            i3 = i4;
            i4 = i3 + 1;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [a.rh1, a.kp] */
    public zo1(a.zo1 zo1Var) {
        this.c = new android.graphics.Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        a.rh1 rh1Var = new a.rh1();
        this.o = (kp) rh1Var;
        this.g = new a.wo1(zo1Var.g, (kp) rh1Var);
        this.f741a = new android.graphics.Path(zo1Var.f741a);
        this.b = new android.graphics.Path(zo1Var.b);
        this.h = zo1Var.h;
        this.i = zo1Var.i;
        this.j = zo1Var.j;
        this.k = zo1Var.k;
        this.l = zo1Var.l;
        this.m = zo1Var.m;
        java.lang.String str = zo1Var.m;
        if (str != null) {
            rh1Var.put(str, this);
        }
        this.n = zo1Var.n;
    }
}
