package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gi0 {

    /* renamed from: a, reason: collision with root package name */
    public int f177a;
    public a.uw d;
    public a.uw e;
    public a.uw f;
    public a.uw g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ a.hi0 r;
    public a.ix b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public gi0(a.hi0 hi0Var, int i, a.uw uwVar, a.uw uwVar2, a.uw uwVar3, a.uw uwVar4, int i2) {
        this.r = hi0Var;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.q = 0;
        this.f177a = i;
        this.d = uwVar;
        this.e = uwVar2;
        this.f = uwVar3;
        this.g = uwVar4;
        this.h = hi0Var.j0;
        this.i = hi0Var.f0;
        this.j = hi0Var.k0;
        this.k = hi0Var.g0;
        this.q = i2;
    }

    public final void a(a.ix ixVar) {
        int i = this.f177a;
        a.hi0 hi0Var = this.r;
        if (i == 0) {
            int D = hi0Var.D(ixVar, this.q);
            if (ixVar.c0[0] == 3) {
                this.p++;
                D = 0;
            }
            this.l = D + (ixVar.V != 8 ? hi0Var.C0 : 0) + this.l;
            int C = hi0Var.C(ixVar, this.q);
            if (this.b == null || this.c < C) {
                this.b = ixVar;
                this.c = C;
                this.m = C;
            }
        } else {
            int D2 = hi0Var.D(ixVar, this.q);
            int C2 = hi0Var.C(ixVar, this.q);
            if (ixVar.c0[1] == 3) {
                this.p++;
                C2 = 0;
            }
            this.m = C2 + (ixVar.V != 8 ? hi0Var.D0 : 0) + this.m;
            if (this.b == null || this.c < D2) {
                this.b = ixVar;
                this.c = D2;
                this.l = D2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        a.hi0 hi0Var;
        int i2;
        int i3;
        a.ix ixVar;
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            hi0Var = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= hi0Var.O0) {
                break;
            }
            a.ix ixVar2 = hi0Var.N0[i8];
            if (ixVar2 != null) {
                ixVar2.u();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= hi0Var.O0) {
                break;
            }
            if (hi0Var.N0[i14].V == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f177a != 0) {
            a.ix ixVar3 = this.b;
            ixVar3.X = hi0Var.q0;
            int i15 = this.h;
            if (i > 0) {
                i15 += hi0Var.C0;
            }
            a.uw uwVar = ixVar3.x;
            a.uw uwVar2 = ixVar3.z;
            if (z) {
                uwVar2.a(this.f, i15);
                if (z2) {
                    uwVar.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.b.x.a(uwVar2, 0);
                }
            } else {
                uwVar.a(this.d, i15);
                if (z2) {
                    uwVar2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.b.z.a(uwVar, 0);
                }
            }
            int i16 = 0;
            a.ix ixVar4 = null;
            while (i16 < i9) {
                int i17 = this.n + i16;
                if (i17 >= hi0Var.O0) {
                    return;
                }
                a.ix ixVar5 = hi0Var.N0[i17];
                if (i16 == 0) {
                    ixVar5.f(ixVar5.y, this.e, this.i);
                    int i18 = hi0Var.r0;
                    float f = hi0Var.x0;
                    if (this.n == 0) {
                        i3 = hi0Var.t0;
                        i2 = -1;
                        if (i3 != -1) {
                            f = hi0Var.z0;
                            i18 = i3;
                            ixVar5.Y = i18;
                            ixVar5.T = f;
                        }
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i3 = hi0Var.v0) != i2) {
                        f = hi0Var.B0;
                        i18 = i3;
                    }
                    ixVar5.Y = i18;
                    ixVar5.T = f;
                }
                if (i16 == i9 - 1) {
                    ixVar5.f(ixVar5.A, this.g, this.k);
                }
                if (ixVar4 != null) {
                    a.uw uwVar3 = ixVar5.y;
                    int i19 = hi0Var.D0;
                    a.uw uwVar4 = ixVar4.A;
                    uwVar3.a(uwVar4, i19);
                    a.uw uwVar5 = ixVar5.y;
                    if (i16 == i11) {
                        int i20 = this.i;
                        if (uwVar5.f()) {
                            uwVar5.f = i20;
                        }
                    }
                    uwVar4.a(uwVar5, 0);
                    if (i16 == i12 + 1) {
                        int i21 = this.k;
                        if (uwVar4.f()) {
                            uwVar4.f = i21;
                        }
                    }
                }
                if (ixVar5 != ixVar3) {
                    if (z) {
                        int i22 = hi0Var.E0;
                        if (i22 == 0) {
                            ixVar5.z.a(uwVar2, 0);
                        } else if (i22 == 1) {
                            ixVar5.x.a(uwVar, 0);
                        } else if (i22 == 2) {
                            ixVar5.x.a(uwVar, 0);
                            ixVar5.z.a(uwVar2, 0);
                        }
                    } else {
                        int i23 = hi0Var.E0;
                        if (i23 == 0) {
                            ixVar5.x.a(uwVar, 0);
                        } else if (i23 == 1) {
                            ixVar5.z.a(uwVar2, 0);
                        } else if (i23 == 2) {
                            if (z3) {
                                ixVar5.x.a(this.d, this.h);
                                ixVar5.z.a(this.f, this.j);
                            } else {
                                ixVar5.x.a(uwVar, 0);
                                ixVar5.z.a(uwVar2, 0);
                            }
                        }
                        i16++;
                        ixVar4 = ixVar5;
                    }
                }
                i16++;
                ixVar4 = ixVar5;
            }
            return;
        }
        a.ix ixVar6 = this.b;
        ixVar6.Y = hi0Var.r0;
        int i24 = this.i;
        if (i > 0) {
            i24 += hi0Var.D0;
        }
        a.uw uwVar6 = this.e;
        a.uw uwVar7 = ixVar6.y;
        uwVar7.a(uwVar6, i24);
        a.uw uwVar8 = ixVar6.A;
        if (z2) {
            uwVar8.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.b.A.a(uwVar7, 0);
        }
        if (hi0Var.F0 == 3 && !ixVar6.w) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.n + (z ? (i9 - 1) - i25 : i25);
                if (i26 >= hi0Var.O0) {
                    break;
                }
                ixVar = hi0Var.N0[i26];
                if (ixVar.w) {
                    break;
                }
            }
        }
        ixVar = ixVar6;
        int i27 = 0;
        a.ix ixVar7 = null;
        while (i27 < i9) {
            int i28 = z ? (i9 - 1) - i27 : i27;
            int i29 = this.n + i28;
            if (i29 >= hi0Var.O0) {
                return;
            }
            a.ix ixVar8 = hi0Var.N0[i29];
            if (i27 == 0) {
                ixVar8.f(ixVar8.x, this.d, this.h);
            }
            if (i28 == 0) {
                int i30 = hi0Var.q0;
                float f2 = hi0Var.w0;
                if (this.n == 0) {
                    i7 = hi0Var.s0;
                    i4 = i30;
                    i5 = -1;
                    if (i7 != -1) {
                        f2 = hi0Var.y0;
                        i6 = i7;
                        ixVar8.X = i6;
                        ixVar8.S = f2;
                    }
                } else {
                    i4 = i30;
                    i5 = -1;
                }
                if (!z2 || (i7 = hi0Var.u0) == i5) {
                    i6 = i4;
                    ixVar8.X = i6;
                    ixVar8.S = f2;
                } else {
                    f2 = hi0Var.A0;
                    i6 = i7;
                    ixVar8.X = i6;
                    ixVar8.S = f2;
                }
            }
            if (i27 == i9 - 1) {
                ixVar8.f(ixVar8.z, this.f, this.j);
            }
            if (ixVar7 != null) {
                a.uw uwVar9 = ixVar8.x;
                int i31 = hi0Var.C0;
                a.uw uwVar10 = ixVar7.z;
                uwVar9.a(uwVar10, i31);
                a.uw uwVar11 = ixVar8.x;
                if (i27 == i11) {
                    int i32 = this.h;
                    if (uwVar11.f()) {
                        uwVar11.f = i32;
                    }
                }
                uwVar10.a(uwVar11, 0);
                if (i27 == i12 + 1) {
                    int i33 = this.j;
                    if (uwVar10.f()) {
                        uwVar10.f = i33;
                    }
                }
            }
            if (ixVar8 != ixVar6) {
                int i34 = hi0Var.F0;
                c = 3;
                if (i34 == 3 && ixVar.w && ixVar8 != ixVar && ixVar8.w) {
                    ixVar8.B.a(ixVar.B, 0);
                } else if (i34 == 0) {
                    ixVar8.y.a(uwVar7, 0);
                } else if (i34 == 1) {
                    ixVar8.A.a(uwVar8, 0);
                } else if (z3) {
                    ixVar8.y.a(this.e, this.i);
                    ixVar8.A.a(this.g, this.k);
                } else {
                    ixVar8.y.a(uwVar7, 0);
                    ixVar8.A.a(uwVar8, 0);
                }
            } else {
                c = 3;
            }
            i27++;
            ixVar7 = ixVar8;
        }
    }

    public final int c() {
        return this.f177a == 1 ? this.m - this.r.D0 : this.m;
    }

    public final int d() {
        return this.f177a == 0 ? this.l - this.r.C0 : this.l;
    }

    public final void e(int i) {
        a.hi0 hi0Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            hi0Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= hi0Var.O0) {
                break;
            }
            a.ix ixVar = hi0Var.N0[i2];
            if (this.f177a == 0) {
                if (ixVar != null) {
                    int[] iArr = ixVar.c0;
                    if (iArr[0] == 3 && ixVar.j == 0) {
                        hi0Var.E(ixVar, 1, i5, iArr[1], ixVar.j());
                    }
                }
            } else if (ixVar != null) {
                int[] iArr2 = ixVar.c0;
                if (iArr2[1] == 3 && ixVar.k == 0) {
                    hi0Var.E(ixVar, iArr2[0], ixVar.m(), 1, i5);
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i7 = this.o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.n + i8;
            if (i9 >= hi0Var.O0) {
                return;
            }
            a.ix ixVar2 = hi0Var.N0[i9];
            if (this.f177a == 0) {
                int m = ixVar2.m();
                int i10 = hi0Var.C0;
                if (ixVar2.V == 8) {
                    i10 = 0;
                }
                this.l = m + i10 + this.l;
                int C = hi0Var.C(ixVar2, this.q);
                if (this.b == null || this.c < C) {
                    this.b = ixVar2;
                    this.c = C;
                    this.m = C;
                }
            } else {
                int D = hi0Var.D(ixVar2, this.q);
                int C2 = hi0Var.C(ixVar2, this.q);
                int i11 = hi0Var.D0;
                if (ixVar2.V == 8) {
                    i11 = 0;
                }
                this.m = C2 + i11 + this.m;
                if (this.b == null || this.c < D) {
                    this.b = ixVar2;
                    this.c = D;
                    this.l = D;
                }
            }
        }
    }

    public final void f(int i, a.uw uwVar, a.uw uwVar2, a.uw uwVar3, a.uw uwVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f177a = i;
        this.d = uwVar;
        this.e = uwVar2;
        this.f = uwVar3;
        this.g = uwVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
