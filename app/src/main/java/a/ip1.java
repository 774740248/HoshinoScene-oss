package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ip1 extends a.ws1 {
    public a.k30 k;
    public a.wq l;

    public ip1(a.ix ixVar) {
        super(ixVar);
    }

    @Override // a.i30
    public final void a(a.i30 i30Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (a.ai1.B(this.j) == 3) {
            a.ix ixVar = this.b;
            l(ixVar.y, ixVar.A, 1);
            return;
        }
        a.v80 v80Var = this.e;
        if (v80Var.c && !v80Var.j && this.d == 3) {
            a.ix ixVar2 = this.b;
            int i2 = ixVar2.k;
            if (i2 == 2) {
                a.ix ixVar3 = ixVar2.I;
                if (ixVar3 != null) {
                    if (ixVar3.e.e.j) {
                        v80Var.d((int) ((r5.g * ixVar2.r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                a.v80 v80Var2 = ixVar2.d.e;
                if (v80Var2.j) {
                    int i3 = ixVar2.M;
                    if (i3 == -1) {
                        f = v80Var2.g;
                        f2 = ixVar2.L;
                    } else if (i3 == 0) {
                        f3 = v80Var2.g * ixVar2.L;
                        i = (int) (f3 + 0.5f);
                        v80Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        v80Var.d(i);
                    } else {
                        f = v80Var2.g;
                        f2 = ixVar2.L;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    v80Var.d(i);
                }
            }
        }
        a.k30 k30Var = this.h;
        if (k30Var.c) {
            a.k30 k30Var2 = this.i;
            if (k30Var2.c) {
                if (k30Var.j && k30Var2.j && v80Var.j) {
                    return;
                }
                if (!v80Var.j && this.d == 3) {
                    a.ix ixVar4 = this.b;
                    if (ixVar4.j == 0 && !ixVar4.s()) {
                        a.k30 k30Var3 = (a.k30) k30Var.l.get(0);
                        a.k30 k30Var4 = (a.k30) k30Var2.l.get(0);
                        int i4 = k30Var3.g + k30Var.f;
                        int i5 = k30Var4.g + k30Var2.f;
                        k30Var.d(i4);
                        k30Var2.d(i5);
                        v80Var.d(i5 - i4);
                        return;
                    }
                }
                if (!v80Var.j && this.d == 3 && this.f674a == 1 && k30Var.l.size() > 0 && k30Var2.l.size() > 0) {
                    a.k30 k30Var5 = (a.k30) k30Var.l.get(0);
                    int i6 = (((a.k30) k30Var2.l.get(0)).g + k30Var2.f) - (k30Var5.g + k30Var.f);
                    int i7 = v80Var.m;
                    if (i6 < i7) {
                        v80Var.d(i6);
                    } else {
                        v80Var.d(i7);
                    }
                }
                if (v80Var.j && k30Var.l.size() > 0 && k30Var2.l.size() > 0) {
                    a.k30 k30Var6 = (a.k30) k30Var.l.get(0);
                    a.k30 k30Var7 = (a.k30) k30Var2.l.get(0);
                    int i8 = k30Var6.g;
                    int i9 = k30Var.f + i8;
                    int i10 = k30Var7.g;
                    int i11 = k30Var2.f + i10;
                    float f4 = this.b.T;
                    if (k30Var6 == k30Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    k30Var.d((int) ((((i10 - i8) - v80Var.g) * f4) + i8 + 0.5f));
                    k30Var2.d(k30Var.g + v80Var.g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v123, types: [a.wq, a.v80] */
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
            v80Var.d(ixVar5.j());
        }
        boolean z2 = v80Var.j;
        a.k30 k30Var = this.i;
        a.k30 k30Var2 = this.h;
        if (!z2) {
            a.ix ixVar6 = this.b;
            this.d = ixVar6.c0[1];
            if (ixVar6.w) {
                this.l = (wq) new a.v80(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (ixVar4 = this.b.I) != null && ixVar4.c0[1] == 1) {
                    int j = (ixVar4.j() - this.b.y.c()) - this.b.A.c();
                    a.ip1 ip1Var = ixVar4.e;
                    a.ws1.b(k30Var2, ip1Var.h, this.b.y.c());
                    a.ws1.b(k30Var, ip1Var.i, -this.b.A.c());
                    v80Var.d(j);
                    return;
                }
                if (i == 1) {
                    v80Var.d(this.b.j());
                }
            }
        } else if (this.d == 4 && (ixVar2 = (ixVar = this.b).I) != null && ixVar2.c0[1] == 1) {
            a.ip1 ip1Var2 = ixVar2.e;
            a.ws1.b(k30Var2, ip1Var2.h, ixVar.y.c());
            a.ws1.b(k30Var, ip1Var2.i, -this.b.A.c());
            return;
        }
        boolean z3 = v80Var.j;
        a.k30 k30Var3 = this.k;
        if (z3) {
            a.ix ixVar7 = this.b;
            if (ixVar7.f242a) {
                a.uw[] uwVarArr = ixVar7.F;
                a.uw uwVar = uwVarArr[2];
                a.uw uwVar2 = uwVar.d;
                if (uwVar2 != null && uwVarArr[3].d != null) {
                    if (ixVar7.s()) {
                        k30Var2.f = this.b.F[2].c();
                        k30Var.f = -this.b.F[3].c();
                    } else {
                        a.k30 h = a.ws1.h(this.b.F[2]);
                        if (h != null) {
                            a.ws1.b(k30Var2, h, this.b.F[2].c());
                        }
                        a.k30 h2 = a.ws1.h(this.b.F[3]);
                        if (h2 != null) {
                            a.ws1.b(k30Var, h2, -this.b.F[3].c());
                        }
                        k30Var2.b = true;
                        k30Var.b = true;
                    }
                    a.ix ixVar8 = this.b;
                    if (ixVar8.w) {
                        a.ws1.b(k30Var3, k30Var2, ixVar8.P);
                        return;
                    }
                    return;
                }
                if (uwVar2 != null) {
                    a.k30 h3 = a.ws1.h(uwVar);
                    if (h3 != null) {
                        a.ws1.b(k30Var2, h3, this.b.F[2].c());
                        a.ws1.b(k30Var, k30Var2, v80Var.g);
                        a.ix ixVar9 = this.b;
                        if (ixVar9.w) {
                            a.ws1.b(k30Var3, k30Var2, ixVar9.P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                a.uw uwVar3 = uwVarArr[3];
                if (uwVar3.d != null) {
                    a.k30 h4 = a.ws1.h(uwVar3);
                    if (h4 != null) {
                        a.ws1.b(k30Var, h4, -this.b.F[3].c());
                        a.ws1.b(k30Var2, k30Var, -v80Var.g);
                    }
                    a.ix ixVar10 = this.b;
                    if (ixVar10.w) {
                        a.ws1.b(k30Var3, k30Var2, ixVar10.P);
                        return;
                    }
                    return;
                }
                a.uw uwVar4 = uwVarArr[4];
                if (uwVar4.d != null) {
                    a.k30 h5 = a.ws1.h(uwVar4);
                    if (h5 != null) {
                        a.ws1.b(k30Var3, h5, 0);
                        a.ws1.b(k30Var2, k30Var3, -this.b.P);
                        a.ws1.b(k30Var, k30Var2, v80Var.g);
                        return;
                    }
                    return;
                }
                if ((ixVar7 instanceof a.ir0) || ixVar7.I == null || ixVar7.h(7).d != null) {
                    return;
                }
                a.ix ixVar11 = this.b;
                a.ws1.b(k30Var2, ixVar11.I.e.h, ixVar11.o());
                a.ws1.b(k30Var, k30Var2, v80Var.g);
                a.ix ixVar12 = this.b;
                if (ixVar12.w) {
                    a.ws1.b(k30Var3, k30Var2, ixVar12.P);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            v80Var.b(this);
        } else {
            a.ix ixVar13 = this.b;
            int i2 = ixVar13.k;
            if (i2 == 2) {
                a.ix ixVar14 = ixVar13.I;
                if (ixVar14 != null) {
                    a.v80 v80Var2 = ixVar14.e.e;
                    v80Var.l.add(v80Var2);
                    v80Var2.k.add(v80Var);
                    v80Var.b = true;
                    v80Var.k.add(k30Var2);
                    v80Var.k.add(k30Var);
                }
            } else if (i2 == 3 && !ixVar13.s()) {
                a.ix ixVar15 = this.b;
                if (ixVar15.j != 3) {
                    a.v80 v80Var3 = ixVar15.d.e;
                    v80Var.l.add(v80Var3);
                    v80Var3.k.add(v80Var);
                    v80Var.b = true;
                    v80Var.k.add(k30Var2);
                    v80Var.k.add(k30Var);
                }
            }
        }
        a.ix ixVar16 = this.b;
        a.uw[] uwVarArr2 = ixVar16.F;
        a.uw uwVar5 = uwVarArr2[2];
        a.uw uwVar6 = uwVar5.d;
        if (uwVar6 != null && uwVarArr2[3].d != null) {
            if (ixVar16.s()) {
                k30Var2.f = this.b.F[2].c();
                k30Var.f = -this.b.F[3].c();
            } else {
                a.k30 h6 = a.ws1.h(this.b.F[2]);
                a.k30 h7 = a.ws1.h(this.b.F[3]);
                h6.b(this);
                h7.b(this);
                this.j = 4;
            }
            if (this.b.w) {
                c(k30Var3, k30Var2, 1, this.l);
            }
        } else if (uwVar6 != null) {
            a.k30 h8 = a.ws1.h(uwVar5);
            if (h8 != null) {
                a.ws1.b(k30Var2, h8, this.b.F[2].c());
                c(k30Var, k30Var2, 1, v80Var);
                if (this.b.w) {
                    c(k30Var3, k30Var2, 1, this.l);
                }
                if (this.d == 3) {
                    a.ix ixVar17 = this.b;
                    if (ixVar17.L > 0.0f) {
                        a.nr0 nr0Var = ixVar17.d;
                        if (nr0Var.d == 3) {
                            nr0Var.e.k.add(v80Var);
                            v80Var.l.add(this.b.d.e);
                            v80Var.f279a = this;
                        }
                    }
                }
            }
        } else {
            a.uw uwVar7 = uwVarArr2[3];
            if (uwVar7.d != null) {
                a.k30 h9 = a.ws1.h(uwVar7);
                if (h9 != null) {
                    a.ws1.b(k30Var, h9, -this.b.F[3].c());
                    c(k30Var2, k30Var, -1, v80Var);
                    if (this.b.w) {
                        c(k30Var3, k30Var2, 1, this.l);
                    }
                }
            } else {
                a.uw uwVar8 = uwVarArr2[4];
                if (uwVar8.d != null) {
                    a.k30 h10 = a.ws1.h(uwVar8);
                    if (h10 != null) {
                        a.ws1.b(k30Var3, h10, 0);
                        c(k30Var2, k30Var3, -1, this.l);
                        c(k30Var, k30Var2, 1, v80Var);
                    }
                } else if (!(ixVar16 instanceof a.ir0) && (ixVar3 = ixVar16.I) != null) {
                    a.ws1.b(k30Var2, ixVar3.e.h, ixVar16.o());
                    c(k30Var, k30Var2, 1, v80Var);
                    if (this.b.w) {
                        c(k30Var3, k30Var2, 1, this.l);
                    }
                    if (this.d == 3) {
                        a.ix ixVar18 = this.b;
                        if (ixVar18.L > 0.0f) {
                            a.nr0 nr0Var2 = ixVar18.d;
                            if (nr0Var2.d == 3) {
                                nr0Var2.e.k.add(v80Var);
                                v80Var.l.add(this.b.d.e);
                                v80Var.f279a = this;
                            }
                        }
                    }
                }
            }
        }
        if (v80Var.l.size() == 0) {
            v80Var.c = true;
        }
    }

    @Override // a.ws1
    public final void e() {
        a.k30 k30Var = this.h;
        if (k30Var.j) {
            this.b.O = k30Var.g;
        }
    }

    @Override // a.ws1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // a.ws1
    public final boolean k() {
        return this.d != 3 || this.b.k == 0;
    }

    public final void m() {
        this.g = false;
        a.k30 k30Var = this.h;
        k30Var.c();
        k30Var.j = false;
        a.k30 k30Var2 = this.i;
        k30Var2.c();
        k30Var2.j = false;
        a.k30 k30Var3 = this.k;
        k30Var3.c();
        k30Var3.j = false;
        this.e.j = false;
    }

    public final java.lang.String toString() {
        return "VerticalRun " + this.b.W;
    }
}
