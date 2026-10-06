package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zv0 {
    public static int o = 1000;
    public static boolean p = true;
    public final a.w61 b;
    public a.mp[] e;
    public final a.ej1 k;
    public a.mp n;

    /* renamed from: a, reason: collision with root package name */
    public int f746a = 0;
    public int c = 32;
    public int d = 32;
    public boolean f = false;
    public boolean[] g = new boolean[32];
    public int h = 1;
    public int i = 0;
    public int j = 32;
    public a.bi1[] l = new a.bi1[o];
    public int m = 0;

    /* JADX WARN: Type inference failed for: r2v3, types: [a.w61, a.mp] */
    public zv0() {
        this.e = null;
        this.e = new a.mp[32];
        q();
        a.ej1 ej1Var = new a.ej1(1);
        this.k = ej1Var;
        a.w61 mpVar = (w61) new a.mp(ej1Var);
        mpVar.f = new a.bi1[128];
        mpVar.g = new a.bi1[128];
        mpVar.h = 0;
        mpVar.i = new a.v61(mpVar);
        this.b = mpVar;
        if (p) {
            this.n = new a.yv0(ej1Var);
        } else {
            this.n = new a.mp(ej1Var);
        }
    }

    public static int m(a.uw uwVar) {
        a.bi1 bi1Var = uwVar.g;
        if (bi1Var != null) {
            return (int) (bi1Var.e + 0.5f);
        }
        return 0;
    }

    public final a.bi1 a(int i) {
        a.bi1 bi1Var = (a.bi1) ((a.a61) this.k.e).a();
        if (bi1Var == null) {
            bi1Var = new a.bi1(i);
            bi1Var.l = i;
        } else {
            bi1Var.c();
            bi1Var.l = i;
        }
        int i2 = this.m;
        int i3 = o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            o = i4;
            this.l = (a.bi1[]) java.util.Arrays.copyOf(this.l, i4);
        }
        a.bi1[] bi1VarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        bi1VarArr[i5] = bi1Var;
        return bi1Var;
    }

    public final void b(a.bi1 bi1Var, a.bi1 bi1Var2, int i, float f, a.bi1 bi1Var3, a.bi1 bi1Var4, int i2, int i3) {
        a.mp k = k();
        if (bi1Var2 == bi1Var3) {
            k.d.c(bi1Var, 1.0f);
            k.d.c(bi1Var4, 1.0f);
            k.d.c(bi1Var2, -2.0f);
        } else if (f == 0.5f) {
            k.d.c(bi1Var, 1.0f);
            k.d.c(bi1Var2, -1.0f);
            k.d.c(bi1Var3, -1.0f);
            k.d.c(bi1Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                k.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            k.d.c(bi1Var, -1.0f);
            k.d.c(bi1Var2, 1.0f);
            k.b = i;
        } else if (f >= 1.0f) {
            k.d.c(bi1Var4, -1.0f);
            k.d.c(bi1Var3, 1.0f);
            k.b = -i2;
        } else {
            float f2 = 1.0f - f;
            k.d.c(bi1Var, f2 * 1.0f);
            k.d.c(bi1Var2, f2 * (-1.0f));
            k.d.c(bi1Var3, (-1.0f) * f);
            k.d.c(bi1Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                k.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            k.a(this, i3);
        }
        c(k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
    
        if (r5.k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r5.k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00db, code lost:
    
        if (r5.k <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00de, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e8, code lost:
    
        if (r5.k <= 1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(a.mp r17) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zv0.c(a.mp):void");
    }

    public final void d(a.bi1 bi1Var, int i) {
        int i2 = bi1Var.c;
        if (i2 == -1) {
            bi1Var.e = i;
            bi1Var.f = true;
            int i3 = bi1Var.j;
            for (int i4 = 0; i4 < i3; i4++) {
                bi1Var.i[i4].g(bi1Var, false);
            }
            bi1Var.j = 0;
            return;
        }
        if (i2 == -1) {
            a.mp k = k();
            k.f358a = bi1Var;
            float f = i;
            bi1Var.e = f;
            k.b = f;
            k.e = true;
            c(k);
            return;
        }
        a.mp mpVar = this.e[i2];
        if (mpVar.e) {
            mpVar.b = i;
            return;
        }
        if (mpVar.d.k() == 0) {
            mpVar.e = true;
            mpVar.b = i;
            return;
        }
        a.mp k2 = k();
        if (i < 0) {
            k2.b = i * (-1);
            k2.d.c(bi1Var, 1.0f);
        } else {
            k2.b = i;
            k2.d.c(bi1Var, -1.0f);
        }
        c(k2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(a.bi1 r7, a.bi1 r8, int r9, int r10) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = 8
            if (r10 != r2) goto L29
            boolean r3 = r8.f
            if (r3 == 0) goto L29
            int r3 = r7.c
            r4 = -1
            if (r3 != r4) goto L29
            float r8 = r8.e
            float r9 = (float) r9
            float r8 = r8 + r9
            r7.e = r8
            r7.f = r1
            int r8 = r7.j
            r9 = r0
        L1a:
            if (r9 >= r8) goto L26
            a.mp[] r10 = r7.i
            r10 = r10[r9]
            r10.g(r7, r0)
            int r9 = r9 + 1
            goto L1a
        L26:
            r7.j = r0
            return
        L29:
            a.mp r3 = r6.k()
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == 0) goto L49
            if (r9 >= 0) goto L38
            int r9 = r9 * (-1)
            r0 = r1
        L38:
            float r9 = (float) r9
            r3.b = r9
            if (r0 != 0) goto L3e
            goto L49
        L3e:
            a.lp r9 = r3.d
            r9.c(r7, r4)
            a.lp r7 = r3.d
            r7.c(r8, r5)
            goto L53
        L49:
            a.lp r9 = r3.d
            r9.c(r7, r5)
            a.lp r7 = r3.d
            r7.c(r8, r4)
        L53:
            if (r10 == r2) goto L58
            r3.a(r6, r10)
        L58:
            r6.c(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zv0.e(a.bi1, a.bi1, int, int):void");
    }

    public final void f(a.bi1 bi1Var, a.bi1 bi1Var2, int i, int i2) {
        a.mp k = k();
        a.bi1 l = l();
        l.d = 0;
        k.b(bi1Var, bi1Var2, l, i);
        if (i2 != 8) {
            k.d.c(i(i2), (int) (k.d.i(l) * (-1.0f)));
        }
        c(k);
    }

    public final void g(a.bi1 bi1Var, a.bi1 bi1Var2, int i, int i2) {
        a.mp k = k();
        a.bi1 l = l();
        l.d = 0;
        k.c(bi1Var, bi1Var2, l, i);
        if (i2 != 8) {
            k.d.c(i(i2), (int) (k.d.i(l) * (-1.0f)));
        }
        c(k);
    }

    public final void h(a.mp mpVar) {
        boolean z = p;
        a.ej1 ej1Var = this.k;
        if (z) {
            a.mp mpVar2 = this.e[this.i];
            if (mpVar2 != null) {
                ((a.a61) ej1Var.c).b(mpVar2);
            }
        } else {
            a.mp mpVar3 = this.e[this.i];
            if (mpVar3 != null) {
                ((a.a61) ej1Var.d).b(mpVar3);
            }
        }
        a.mp[] mpVarArr = this.e;
        int i = this.i;
        mpVarArr[i] = mpVar;
        a.bi1 bi1Var = mpVar.f358a;
        bi1Var.c = i;
        this.i = i + 1;
        bi1Var.d(mpVar);
    }

    public final a.bi1 i(int i) {
        if (this.h + 1 >= this.d) {
            n();
        }
        a.bi1 a2 = a(4);
        int i2 = this.f746a + 1;
        this.f746a = i2;
        this.h++;
        a2.b = i2;
        a2.d = i;
        ((a.bi1[]) this.k.f)[i2] = a2;
        a.w61 w61Var = this.b;
        w61Var.i.c = a2;
        float[] fArr = a2.h;
        java.util.Arrays.fill(fArr, 0.0f);
        fArr[a2.d] = 1.0f;
        w61Var.i(a2);
        return a2;
    }

    public final a.bi1 j(java.lang.Object obj) {
        a.bi1 bi1Var = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.d) {
            n();
        }
        if (obj instanceof a.uw) {
            a.uw uwVar = (a.uw) obj;
            bi1Var = uwVar.g;
            if (bi1Var == null) {
                uwVar.i();
                bi1Var = uwVar.g;
            }
            int i = bi1Var.b;
            a.ej1 ej1Var = this.k;
            if (i == -1 || i > this.f746a || ((a.bi1[]) ej1Var.f)[i] == null) {
                if (i != -1) {
                    bi1Var.c();
                }
                int i2 = this.f746a + 1;
                this.f746a = i2;
                this.h++;
                bi1Var.b = i2;
                bi1Var.l = 1;
                ((a.bi1[]) ej1Var.f)[i2] = bi1Var;
            }
        }
        return bi1Var;
    }

    public final a.mp k() {
        boolean z = p;
        a.ej1 ej1Var = this.k;
        if (z) {
            a.mp mpVar = (a.mp) ((a.a61) ej1Var.c).a();
            if (mpVar == null) {
                return new a.yv0(ej1Var);
            }
            mpVar.f358a = null;
            mpVar.d.clear();
            mpVar.b = 0.0f;
            mpVar.e = false;
            return mpVar;
        }
        a.mp mpVar2 = (a.mp) ((a.a61) ej1Var.d).a();
        if (mpVar2 == null) {
            return new a.mp(ej1Var);
        }
        mpVar2.f358a = null;
        mpVar2.d.clear();
        mpVar2.b = 0.0f;
        mpVar2.e = false;
        return mpVar2;
    }

    public final a.bi1 l() {
        if (this.h + 1 >= this.d) {
            n();
        }
        a.bi1 a2 = a(3);
        int i = this.f746a + 1;
        this.f746a = i;
        this.h++;
        a2.b = i;
        ((a.bi1[]) this.k.f)[i] = a2;
        return a2;
    }

    public final void n() {
        int i = this.c * 2;
        this.c = i;
        this.e = (a.mp[]) java.util.Arrays.copyOf(this.e, i);
        a.ej1 ej1Var = this.k;
        ej1Var.f = (a.bi1[]) java.util.Arrays.copyOf((a.bi1[]) ej1Var.f, this.c);
        int i2 = this.c;
        this.g = new boolean[i2];
        this.d = i2;
        this.j = i2;
    }

    public final void o(a.w61 w61Var) {
        a.ej1 ej1Var;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            a.mp mpVar = this.e[i];
            int i2 = 1;
            if (mpVar.f358a.l != 1) {
                float f = 0.0f;
                if (mpVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            int i8 = this.i;
                            ej1Var = this.k;
                            if (i6 >= i8) {
                                break;
                            }
                            a.mp mpVar2 = this.e[i6];
                            if (mpVar2.f358a.l != i2 && !mpVar2.e && mpVar2.b < f) {
                                int i9 = i2;
                                while (i9 < this.h) {
                                    a.bi1 bi1Var = ((a.bi1[]) ej1Var.f)[i9];
                                    float i10 = mpVar2.d.i(bi1Var);
                                    if (i10 > f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f3 = bi1Var.g[i11] / i10;
                                            if ((f3 < f2 && i11 == i7) || i11 > i7) {
                                                i7 = i11;
                                                f2 = f3;
                                                i4 = i6;
                                                i5 = i9;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            a.mp mpVar3 = this.e[i4];
                            mpVar3.f358a.c = -1;
                            mpVar3.f(((a.bi1[]) ej1Var.f)[i5]);
                            a.bi1 bi1Var2 = mpVar3.f358a;
                            bi1Var2.c = i4;
                            bi1Var2.d(mpVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.h / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        p(w61Var);
        for (int i12 = 0; i12 < this.i; i12++) {
            a.mp mpVar4 = this.e[i12];
            mpVar4.f358a.e = mpVar4.b;
        }
    }

    public final void p(a.mp mpVar) {
        for (int i = 0; i < this.h; i++) {
            this.g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.h * 2) {
                return;
            }
            a.bi1 bi1Var = mpVar.f358a;
            if (bi1Var != null) {
                this.g[bi1Var.b] = true;
            }
            a.bi1 d = mpVar.d(this.g);
            if (d != null) {
                boolean[] zArr = this.g;
                int i3 = d.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.i; i5++) {
                    a.mp mpVar2 = this.e[i5];
                    if (mpVar2.f358a.l != 1 && !mpVar2.e && mpVar2.d.d(d)) {
                        float i6 = mpVar2.d.i(d);
                        if (i6 < 0.0f) {
                            float f2 = (-mpVar2.b) / i6;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    a.mp mpVar3 = this.e[i4];
                    mpVar3.f358a.c = -1;
                    mpVar3.f(d);
                    a.bi1 bi1Var2 = mpVar3.f358a;
                    bi1Var2.c = i4;
                    bi1Var2.d(mpVar3);
                }
            } else {
                z = true;
            }
        }
    }

    public final void q() {
        boolean z = p;
        a.ej1 ej1Var = this.k;
        int i = 0;
        if (z) {
            while (true) {
                a.mp[] mpVarArr = this.e;
                if (i >= mpVarArr.length) {
                    return;
                }
                a.mp mpVar = mpVarArr[i];
                if (mpVar != null) {
                    ((a.a61) ej1Var.c).b(mpVar);
                }
                this.e[i] = null;
                i++;
            }
        } else {
            while (true) {
                a.mp[] mpVarArr2 = this.e;
                if (i >= mpVarArr2.length) {
                    return;
                }
                a.mp mpVar2 = mpVarArr2[i];
                if (mpVar2 != null) {
                    ((a.a61) ej1Var.d).b(mpVar2);
                }
                this.e[i] = null;
                i++;
            }
        }
    }

    public final void r() {
        a.ej1 ej1Var;
        int i = 0;
        while (true) {
            ej1Var = this.k;
            a.bi1[] bi1VarArr = (a.bi1[]) ej1Var.f;
            if (i >= bi1VarArr.length) {
                break;
            }
            a.bi1 bi1Var = bi1VarArr[i];
            if (bi1Var != null) {
                bi1Var.c();
            }
            i++;
        }
        a.a61 a61Var = (a.a61) ej1Var.e;
        a.bi1[] bi1VarArr2 = this.l;
        int i2 = this.m;
        a61Var.getClass();
        if (i2 > bi1VarArr2.length) {
            i2 = bi1VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            a.bi1 bi1Var2 = bi1VarArr2[i3];
            int i4 = a61Var.c;
            java.lang.Object[] objArr = a61Var.b;
            if (i4 < objArr.length) {
                objArr[i4] = bi1Var2;
                a61Var.c = i4 + 1;
            }
        }
        this.m = 0;
        java.util.Arrays.fill((a.bi1[]) ej1Var.f, (java.lang.Object) null);
        this.f746a = 0;
        a.w61 w61Var = this.b;
        w61Var.h = 0;
        w61Var.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            this.e[i5].getClass();
        }
        q();
        this.i = 0;
        if (p) {
            this.n = new a.yv0(ej1Var);
        } else {
            this.n = new a.mp(ej1Var);
        }
    }
}
