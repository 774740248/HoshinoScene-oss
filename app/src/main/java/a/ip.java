package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ip implements a.lp {
    public final a.mp b;
    public final a.ej1 c;

    /* renamed from: a, reason: collision with root package name */
    public int f237a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public ip(a.mp mpVar, a.ej1 ej1Var) {
        this.b = mpVar;
        this.c = ej1Var;
    }

    @Override // a.lp
    public final float a(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f237a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // a.lp
    public final float b(a.mp mpVar, boolean z) {
        float i = i(mpVar.f358a);
        h(mpVar.f358a, z);
        a.lp lpVar = mpVar.d;
        int k = lpVar.k();
        for (int i2 = 0; i2 < k; i2++) {
            a.bi1 f = lpVar.f(i2);
            e(f, lpVar.i(f) * i, z);
        }
        return i;
    }

    @Override // a.lp
    public final void c(a.bi1 bi1Var, float f) {
        if (f == 0.0f) {
            h(bi1Var, true);
            return;
        }
        int i = this.h;
        a.mp mpVar = this.b;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = bi1Var.b;
            this.f[0] = -1;
            bi1Var.k++;
            bi1Var.a(mpVar);
            this.f237a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.e;
            if (i2 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f237a; i4++) {
            int i5 = this.e[i];
            int i6 = bi1Var.b;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.e;
        if (i7 >= iArr3.length && this.f237a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = java.util.Arrays.copyOf(this.g, i10);
            this.e = java.util.Arrays.copyOf(this.e, this.d);
            this.f = java.util.Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = bi1Var.b;
        this.g[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f[i7] = this.h;
            this.h = i7;
        }
        bi1Var.k++;
        bi1Var.a(mpVar);
        int i11 = this.f237a + 1;
        this.f237a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i11 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    @Override // a.lp
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f237a; i2++) {
            a.bi1 bi1Var = ((a.bi1[]) this.c.f)[this.e[i]];
            if (bi1Var != null) {
                bi1Var.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f237a = 0;
    }

    @Override // a.lp
    public final boolean d(a.bi1 bi1Var) {
        int i = this.h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f237a; i2++) {
            if (this.e[i] == bi1Var.b) {
                return true;
            }
            i = this.f[i];
        }
        return false;
    }

    @Override // a.lp
    public final void e(a.bi1 bi1Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            a.mp mpVar = this.b;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = bi1Var.b;
                this.f[0] = -1;
                bi1Var.k++;
                bi1Var.a(mpVar);
                this.f237a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f237a; i4++) {
                int i5 = this.e[i];
                int i6 = bi1Var.b;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f[i];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            bi1Var.b(mpVar);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        bi1Var.k--;
                        this.f237a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.e;
            if (i7 >= iArr4.length && this.f237a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.j = false;
                this.i = i7 - 1;
                this.g = java.util.Arrays.copyOf(this.g, i10);
                this.e = java.util.Arrays.copyOf(this.e, this.d);
                this.f = java.util.Arrays.copyOf(this.f, this.d);
            }
            this.e[i7] = bi1Var.b;
            this.g[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f[i7] = this.h;
                this.h = i7;
            }
            bi1Var.k++;
            bi1Var.a(mpVar);
            this.f237a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr8 = this.e;
            if (i11 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    @Override // a.lp
    public final a.bi1 f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f237a; i3++) {
            if (i3 == i) {
                return ((a.bi1[]) this.c.f)[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // a.lp
    public final void g(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f237a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    @Override // a.lp
    public final float h(a.bi1 bi1Var, boolean z) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f237a) {
            if (this.e[i] == bi1Var.b) {
                if (i == this.h) {
                    this.h = this.f[i];
                } else {
                    int[] iArr = this.f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    bi1Var.b(this.b);
                }
                bi1Var.k--;
                this.f237a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // a.lp
    public final float i(a.bi1 bi1Var) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f237a; i2++) {
            if (this.e[i] == bi1Var.b) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // a.lp
    public final void j() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f237a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // a.lp
    public final int k() {
        return this.f237a;
    }

    public final java.lang.String toString() {
        int i = this.h;
        java.lang.String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f237a; i2++) {
            str = (a.ii1.e(str, " -> ") + this.g[i] + " : ") + ((a.bi1[]) this.c.f)[this.e[i]];
            i = this.f[i];
        }
        return str;
    }
}
