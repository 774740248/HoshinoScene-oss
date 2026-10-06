package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nr0 extends a.ws1 {
    public static final int[] k = new int[2];

    public nr0(a.ix ixVar) {
        super(ixVar);
    }

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // a.i30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(a.i30 r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nr0.a(a.i30):void");
    }

    @Override // a.ws1
    public final void d() {
        a.ix ixVar;
        a.ix ixVar2;
        a.ix ixVar3;
        a.ix ixVar4;
        a.ix ixVar5 = this.b;
        boolean z = ixVar5.f242a;
        a.v80 v80Var = this.e;
        if (z) {
            v80Var.d(ixVar5.m());
        }
        boolean z2 = v80Var.j;
        a.k30 k30Var = this.i;
        a.k30 k30Var2 = this.h;
        if (!z2) {
            a.ix ixVar6 = this.b;
            int i = ixVar6.c0[0];
            this.d = i;
            if (i != 3) {
                if (i == 4 && (((ixVar4 = ixVar6.I) != null && ixVar4.c0[0] == 1) || ixVar4.c0[0] == 4)) {
                    int m = (ixVar4.m() - this.b.x.c()) - this.b.z.c();
                    a.nr0 nr0Var = ixVar4.d;
                    a.ws1.b(k30Var2, nr0Var.h, this.b.x.c());
                    a.ws1.b(k30Var, nr0Var.i, -this.b.z.c());
                    v80Var.d(m);
                    return;
                }
                if (i == 1) {
                    v80Var.d(ixVar6.m());
                }
            }
        } else if (this.d == 4 && (((ixVar2 = (ixVar = this.b).I) != null && ixVar2.c0[0] == 1) || ixVar2.c0[0] == 4)) {
            a.ws1.b(k30Var2, ixVar2.d.h, ixVar.x.c());
            a.ws1.b(k30Var, ixVar2.d.i, -this.b.z.c());
            return;
        }
        if (v80Var.j) {
            a.ix ixVar7 = this.b;
            if (ixVar7.f242a) {
                a.uw[] uwVarArr = ixVar7.F;
                a.uw uwVar = uwVarArr[0];
                a.uw uwVar2 = uwVar.d;
                if (uwVar2 != null && uwVarArr[1].d != null) {
                    if (ixVar7.r()) {
                        k30Var2.f = this.b.F[0].c();
                        k30Var.f = -this.b.F[1].c();
                        return;
                    }
                    a.k30 h = a.ws1.h(this.b.F[0]);
                    if (h != null) {
                        a.ws1.b(k30Var2, h, this.b.F[0].c());
                    }
                    a.k30 h2 = a.ws1.h(this.b.F[1]);
                    if (h2 != null) {
                        a.ws1.b(k30Var, h2, -this.b.F[1].c());
                    }
                    k30Var2.b = true;
                    k30Var.b = true;
                    return;
                }
                if (uwVar2 != null) {
                    a.k30 h3 = a.ws1.h(uwVar);
                    if (h3 != null) {
                        a.ws1.b(k30Var2, h3, this.b.F[0].c());
                        a.ws1.b(k30Var, k30Var2, v80Var.g);
                        return;
                    }
                    return;
                }
                a.uw uwVar3 = uwVarArr[1];
                if (uwVar3.d != null) {
                    a.k30 h4 = a.ws1.h(uwVar3);
                    if (h4 != null) {
                        a.ws1.b(k30Var, h4, -this.b.F[1].c());
                        a.ws1.b(k30Var2, k30Var, -v80Var.g);
                        return;
                    }
                    return;
                }
                if ((ixVar7 instanceof a.ir0) || ixVar7.I == null || ixVar7.h(7).d != null) {
                    return;
                }
                a.ix ixVar8 = this.b;
                a.ws1.b(k30Var2, ixVar8.I.d.h, ixVar8.n());
                a.ws1.b(k30Var, k30Var2, v80Var.g);
                return;
            }
        }
        if (this.d == 3) {
            a.ix ixVar9 = this.b;
            int i2 = ixVar9.j;
            if (i2 == 2) {
                a.ix ixVar10 = ixVar9.I;
                if (ixVar10 != null) {
                    a.v80 v80Var2 = ixVar10.e.e;
                    v80Var.l.add(v80Var2);
                    v80Var2.k.add(v80Var);
                    v80Var.b = true;
                    v80Var.k.add(k30Var2);
                    v80Var.k.add(k30Var);
                }
            } else if (i2 == 3) {
                if (ixVar9.k == 3) {
                    k30Var2.f279a = this;
                    k30Var.f279a = this;
                    a.ip1 ip1Var = ixVar9.e;
                    ip1Var.h.f279a = this;
                    ip1Var.i.f279a = this;
                    v80Var.f279a = this;
                    if (ixVar9.s()) {
                        v80Var.l.add(this.b.e.e);
                        this.b.e.e.k.add(v80Var);
                        a.ip1 ip1Var2 = this.b.e;
                        ip1Var2.e.f279a = this;
                        v80Var.l.add(ip1Var2.h);
                        v80Var.l.add(this.b.e.i);
                        this.b.e.h.k.add(v80Var);
                        this.b.e.i.k.add(v80Var);
                    } else if (this.b.r()) {
                        this.b.e.e.l.add(v80Var);
                        v80Var.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(v80Var);
                    }
                } else {
                    a.v80 v80Var3 = ixVar9.e.e;
                    v80Var.l.add(v80Var3);
                    v80Var3.k.add(v80Var);
                    this.b.e.h.k.add(v80Var);
                    this.b.e.i.k.add(v80Var);
                    v80Var.b = true;
                    v80Var.k.add(k30Var2);
                    v80Var.k.add(k30Var);
                    k30Var2.l.add(v80Var);
                    k30Var.l.add(v80Var);
                }
            }
        }
        a.ix ixVar11 = this.b;
        a.uw[] uwVarArr2 = ixVar11.F;
        a.uw uwVar4 = uwVarArr2[0];
        a.uw uwVar5 = uwVar4.d;
        if (uwVar5 != null && uwVarArr2[1].d != null) {
            if (ixVar11.r()) {
                k30Var2.f = this.b.F[0].c();
                k30Var.f = -this.b.F[1].c();
                return;
            }
            a.k30 h5 = a.ws1.h(this.b.F[0]);
            a.k30 h6 = a.ws1.h(this.b.F[1]);
            h5.b(this);
            h6.b(this);
            this.j = 4;
            return;
        }
        if (uwVar5 != null) {
            a.k30 h7 = a.ws1.h(uwVar4);
            if (h7 != null) {
                a.ws1.b(k30Var2, h7, this.b.F[0].c());
                c(k30Var, k30Var2, 1, v80Var);
                return;
            }
            return;
        }
        a.uw uwVar6 = uwVarArr2[1];
        if (uwVar6.d != null) {
            a.k30 h8 = a.ws1.h(uwVar6);
            if (h8 != null) {
                a.ws1.b(k30Var, h8, -this.b.F[1].c());
                c(k30Var2, k30Var, -1, v80Var);
                return;
            }
            return;
        }
        if ((ixVar11 instanceof a.ir0) || (ixVar3 = ixVar11.I) == null) {
            return;
        }
        a.ws1.b(k30Var2, ixVar3.d.h, ixVar11.n());
        c(k30Var, k30Var2, 1, v80Var);
    }

    @Override // a.ws1
    public final void e() {
        a.k30 k30Var = this.h;
        if (k30Var.j) {
            this.b.N = k30Var.g;
        }
    }

    @Override // a.ws1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // a.ws1
    public final boolean k() {
        return this.d != 3 || this.b.j == 0;
    }

    public final void n() {
        this.g = false;
        a.k30 k30Var = this.h;
        k30Var.c();
        k30Var.j = false;
        a.k30 k30Var2 = this.i;
        k30Var2.c();
        k30Var2.j = false;
        this.e.j = false;
    }

    public final java.lang.String toString() {
        return "HorizontalRun " + this.b.W;
    }
}
