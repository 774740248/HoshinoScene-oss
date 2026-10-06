package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wo1 extends a.xo1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f668a;
    public final java.util.ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final android.graphics.Matrix j;
    public final int k;
    public java.lang.String l;

    public wo1() {
        this.f668a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new android.graphics.Matrix();
        this.l = null;
    }

    @Override // a.xo1
    public final boolean a() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((a.xo1) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // a.xo1
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((a.xo1) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        android.graphics.Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public java.lang.String getGroupName() {
        return this.l;
    }

    public android.graphics.Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [a.yo1, a.vo1] */
    public wo1(a.wo1 wo1Var, a.kp kpVar) {
        a.yo1 yo1Var;
        this.f668a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.j = matrix;
        this.l = null;
        this.c = wo1Var.c;
        this.d = wo1Var.d;
        this.e = wo1Var.e;
        this.f = wo1Var.f;
        this.g = wo1Var.g;
        this.h = wo1Var.h;
        this.i = wo1Var.i;
        java.lang.String str = wo1Var.l;
        this.l = str;
        this.k = wo1Var.k;
        if (str != null) {
            kpVar.put(str, this);
        }
        matrix.set(wo1Var.j);
        java.util.ArrayList arrayList = wo1Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            a.vo1 obj = (vo1) arrayList.get(i);
            if ((wo1) obj instanceof a.wo1) {
                this.b.add(new a.wo1((a.wo1) obj, kpVar));
            } else {
                if (obj instanceof a.vo1) {
                    a.vo1 vo1Var = (a.vo1) obj;
                    vo1 yo1Var2 = new vo1(vo1Var);
                    yo1Var2.f = 0.0f;
                    yo1Var2.h = 1.0f;
                    yo1Var2.i = 1.0f;
                    yo1Var2.j = 0.0f;
                    yo1Var2.k = 1.0f;
                    yo1Var2.l = 0.0f;
                    yo1Var2.m = android.graphics.Paint.Cap.BUTT;
                    yo1Var2.n = android.graphics.Paint.Join.MITER;
                    yo1Var2.o = 4.0f;
                    yo1Var2.e = vo1Var.e;
                    yo1Var2.f = vo1Var.f;
                    yo1Var2.h = vo1Var.h;
                    yo1Var2.g = vo1Var.g;
                    yo1Var2.c = vo1Var.c;
                    yo1Var2.i = vo1Var.i;
                    yo1Var2.j = vo1Var.j;
                    yo1Var2.k = vo1Var.k;
                    yo1Var2.l = vo1Var.l;
                    yo1Var2.m = vo1Var.m;
                    yo1Var2.n = vo1Var.n;
                    yo1Var2.o = vo1Var.o;
                    yo1Var = yo1Var2;
                } else if ((uo1) obj instanceof a.uo1) {
                    yo1Var = new vo1((a.uo1) obj);
                } else {
                    throw new java.lang.IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(yo1Var);
                java.lang.Object obj2 = yo1Var.b;
                if (obj2 != null) {
                    kpVar.put(obj2, yo1Var);
                }
            }
        }
    }
}
