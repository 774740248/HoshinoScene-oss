package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w61 extends a.mp {
    public a.bi1[] f;
    public a.bi1[] g;
    public int h;
    public a.v61 i;

    @Override // a.mp
    public final a.bi1 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            a.bi1[] bi1VarArr = this.f;
            a.bi1 bi1Var = bi1VarArr[i2];
            if (!zArr[bi1Var.b]) {
                a.v61 v61Var = this.i;
                v61Var.c = bi1Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = v61Var.c.h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    a.bi1 bi1Var2 = bi1VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = bi1Var2.h[i3];
                            float f3 = v61Var.c.h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // a.mp
    public final void h(a.mp mpVar, boolean z) {
        a.bi1 bi1Var = mpVar.f358a;
        if (bi1Var == null) {
            return;
        }
        a.lp lpVar = mpVar.d;
        int k = lpVar.k();
        for (int i = 0; i < k; i++) {
            a.bi1 f = lpVar.f(i);
            float a2 = lpVar.a(i);
            a.v61 v61Var = this.i;
            v61Var.c = f;
            boolean z2 = f.f42a;
            float[] fArr = bi1Var.h;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = v61Var.c.h;
                    float f2 = (fArr[i2] * a2) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (java.lang.Math.abs(f2) < 1.0E-4f) {
                        v61Var.c.h[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    v61Var.d.j(v61Var.c);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * a2;
                        if (java.lang.Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        v61Var.c.h[i3] = f4;
                    } else {
                        v61Var.c.h[i3] = 0.0f;
                    }
                }
                i(f);
            }
            this.b = (mpVar.b * a2) + this.b;
        }
        j(bi1Var);
    }

    public final void i(a.bi1 bi1Var) {
        int i;
        int i2 = this.h + 1;
        a.bi1[] bi1VarArr = this.f;
        if (i2 > bi1VarArr.length) {
            a.bi1[] bi1VarArr2 = (a.bi1[]) java.util.Arrays.copyOf(bi1VarArr, bi1VarArr.length * 2);
            this.f = bi1VarArr2;
            this.g = (a.bi1[]) java.util.Arrays.copyOf(bi1VarArr2, bi1VarArr2.length * 2);
        }
        a.bi1[] bi1VarArr3 = this.f;
        int i3 = this.h;
        bi1VarArr3[i3] = bi1Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && bi1VarArr3[i3].b > bi1Var.b) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = this.h;
                if (i6 >= i) {
                    break;
                }
                this.g[i6] = this.f[i6];
                i6++;
            }
            java.util.Arrays.sort(this.g, 0, i, new a.u61(i5, this));
            while (i5 < this.h) {
                this.f[i5] = this.g[i5];
                i5++;
            }
        }
        bi1Var.f42a = true;
        bi1Var.a(this);
    }

    public final void j(a.bi1 bi1Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == bi1Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        bi1Var.f42a = false;
                        return;
                    } else {
                        a.bi1[] bi1VarArr = this.f;
                        int i3 = i + 1;
                        bi1VarArr[i] = bi1VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // a.mp
    public final java.lang.String toString() {
        java.lang.String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            a.bi1 bi1Var = this.f[i];
            a.v61 v61Var = this.i;
            v61Var.c = bi1Var;
            str = str + v61Var + " ";
        }
        return str;
    }
}
