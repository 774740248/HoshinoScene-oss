package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ci1 implements a.lp {

    /* renamed from: a, reason: collision with root package name */
    public int f72a = 16;
    public final int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d = new int[16];
    public float[] e = new float[16];
    public int[] f = new int[16];
    public int[] g = new int[16];
    public int h = 0;
    public int i = -1;
    public final a.mp j;
    public final a.ej1 k;

    public ci1(a.mp mpVar, a.ej1 ej1Var) {
        this.j = mpVar;
        this.k = ej1Var;
        clear();
    }

    @Override // a.lp
    public final float a(int i) {
        int i2 = this.h;
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.e[i3];
            }
            i3 = this.g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // a.lp
    public final float b(a.mp mpVar, boolean z) {
        float i = i(mpVar.f358a);
        h(mpVar.f358a, z);
        a.ci1 ci1Var = (a.ci1) mpVar.d;
        int i2 = ci1Var.h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = ci1Var.d[i4];
            if (i5 != -1) {
                e(((a.bi1[]) this.k.f)[i5], ci1Var.e[i4] * i, z);
                i3++;
            }
            i4++;
        }
        return i;
    }

    @Override // a.lp
    public final void c(a.bi1 bi1Var, float f) {
        if (f > -0.001f && f < 0.001f) {
            h(bi1Var, true);
            return;
        }
        int i = 0;
        if (this.h == 0) {
            m(0, bi1Var, f);
            l(bi1Var, 0);
            this.i = 0;
            return;
        }
        int n = n(bi1Var);
        if (n != -1) {
            this.e[n] = f;
            return;
        }
        int i2 = this.h + 1;
        int i3 = this.f72a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.d = java.util.Arrays.copyOf(this.d, i4);
            this.e = java.util.Arrays.copyOf(this.e, i4);
            this.f = java.util.Arrays.copyOf(this.f, i4);
            this.g = java.util.Arrays.copyOf(this.g, i4);
            this.c = java.util.Arrays.copyOf(this.c, i4);
            for (int i5 = this.f72a; i5 < i4; i5++) {
                this.d[i5] = -1;
                this.c[i5] = -1;
            }
            this.f72a = i4;
        }
        int i6 = this.h;
        int i7 = this.i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.d[i7];
            int i11 = bi1Var.b;
            if (i10 == i11) {
                this.e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f72a) {
                i = -1;
                break;
            } else if (this.d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m(i, bi1Var, f);
        if (i8 != -1) {
            this.f[i] = i8;
            int[] iArr = this.g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f[i] = -1;
            if (this.h > 0) {
                this.g[i] = this.i;
                this.i = i;
            } else {
                this.g[i] = -1;
            }
        }
        int i12 = this.g[i];
        if (i12 != -1) {
            this.f[i12] = i;
        }
        l(bi1Var, i);
    }

    @Override // a.lp
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            a.bi1 f = f(i2);
            if (f != null) {
                f.b(this.j);
            }
        }
        for (int i3 = 0; i3 < this.f72a; i3++) {
            this.d[i3] = -1;
            this.c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.b[i4] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    @Override // a.lp
    public final boolean d(a.bi1 bi1Var) {
        return n(bi1Var) != -1;
    }

    @Override // a.lp
    public final void e(a.bi1 bi1Var, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int n = n(bi1Var);
            if (n == -1) {
                c(bi1Var, f);
                return;
            }
            float[] fArr = this.e;
            float f2 = fArr[n] + f;
            fArr[n] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[n] = 0.0f;
            h(bi1Var, z);
        }
    }

    @Override // a.lp
    public final a.bi1 f(int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((a.bi1[]) this.k.f)[this.d[i3]];
            }
            i3 = this.g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a.lp
    public final void g(float f) {
        int i = this.h;
        int i2 = this.i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // a.lp
    public final float h(a.bi1 bi1Var, boolean z) {
        int[] iArr;
        int i;
        int n = n(bi1Var);
        if (n == -1) {
            return 0.0f;
        }
        int i2 = bi1Var.b;
        int i3 = i2 % 16;
        int[] iArr2 = this.b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.d[i4] == i2) {
                int[] iArr3 = this.c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.c;
                    i = iArr[i4];
                    if (i == -1 || this.d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.e[n];
        if (this.i == n) {
            this.i = this.g[n];
        }
        this.d[n] = -1;
        int[] iArr4 = this.f;
        int i5 = iArr4[n];
        if (i5 != -1) {
            int[] iArr5 = this.g;
            iArr5[i5] = iArr5[n];
        }
        int i6 = this.g[n];
        if (i6 != -1) {
            iArr4[i6] = iArr4[n];
        }
        this.h--;
        bi1Var.k--;
        if (z) {
            bi1Var.b(this.j);
        }
        return f;
    }

    @Override // a.lp
    public final float i(a.bi1 bi1Var) {
        int n = n(bi1Var);
        if (n != -1) {
            return this.e[n];
        }
        return 0.0f;
    }

    @Override // a.lp
    public final void j() {
        int i = this.h;
        int i2 = this.i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // a.lp
    public final int k() {
        return this.h;
    }

    public final void l(a.bi1 bi1Var, int i) {
        int[] iArr;
        int i2 = bi1Var.b % 16;
        int[] iArr2 = this.b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.c[i] = -1;
    }

    public final void m(int i, a.bi1 bi1Var, float f) {
        this.d[i] = bi1Var.b;
        this.e[i] = f;
        this.f[i] = -1;
        this.g[i] = -1;
        bi1Var.a(this.j);
        bi1Var.k++;
        this.h++;
    }

    public final int n(a.bi1 bi1Var) {
        if (this.h == 0) {
            return -1;
        }
        int i = bi1Var.b;
        int i2 = this.b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.d[i2] != i);
        if (i2 != -1 && this.d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final java.lang.String toString() {
        java.lang.String str = hashCode() + " { ";
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            a.bi1 f = f(i2);
            if (f != null) {
                java.lang.String str2 = str + f + " = " + a(i2) + " ";
                int n = n(f);
                java.lang.String e = a.ii1.e(str2, "[p: ");
                int i3 = this.f[n];
                a.ej1 ej1Var = this.k;
                java.lang.String e2 = a.ii1.e(i3 != -1 ? e + ((a.bi1[]) ej1Var.f)[this.d[this.f[n]]] : a.ii1.e(e, "none"), ", n: ");
                str = a.ii1.e(this.g[n] != -1 ? e2 + ((a.bi1[]) ej1Var.f)[this.d[this.g[n]]] : a.ii1.e(e2, "none"), "]");
            }
        }
        return a.ii1.e(str, " }");
    }
}
