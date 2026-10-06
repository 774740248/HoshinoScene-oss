package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hi0 extends a.kr0 {
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public java.util.ArrayList J0;
    public a.ix[] K0;
    public a.ix[] L0;
    public int[] M0;
    public a.ix[] N0;
    public int O0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public int m0;
    public int n0;
    public a.xq o0;
    public a.zw p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    public final int C(a.ix ixVar, int i) {
        if (ixVar == null) {
            return 0;
        }
        int[] iArr = ixVar.c0;
        if (iArr[1] == 3) {
            int i2 = ixVar.k;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (ixVar.r * i);
                if (i3 != ixVar.j()) {
                    E(ixVar, iArr[0], ixVar.m(), 1, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return ixVar.j();
            }
            if (i2 == 3) {
                return (int) ((ixVar.m() * ixVar.L) + 0.5f);
            }
        }
        return ixVar.j();
    }

    public final int D(a.ix ixVar, int i) {
        if (ixVar == null) {
            return 0;
        }
        int[] iArr = ixVar.c0;
        if (iArr[0] == 3) {
            int i2 = ixVar.j;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (ixVar.o * i);
                if (i3 != ixVar.m()) {
                    E(ixVar, 1, i3, iArr[1], ixVar.j());
                }
                return i3;
            }
            if (i2 == 1) {
                return ixVar.m();
            }
            if (i2 == 3) {
                return (int) ((ixVar.j() * ixVar.L) + 0.5f);
            }
        }
        return ixVar.m();
    }

    public final void E(a.ix ixVar, int i, int i2, int i3, int i4) {
        a.zw zwVar;
        a.ix ixVar2;
        while (true) {
            zwVar = this.p0;
            if (zwVar != null || (ixVar2 = this.I) == null) {
                break;
            } else {
                this.p0 = ((a.jx) ixVar2).g0;
            }
        }
        a.xq xqVar = this.o0;
        xqVar.f692a = i;
        xqVar.b = i3;
        xqVar.c = i2;
        xqVar.d = i4;
        zwVar.a(ixVar, xqVar);
        ixVar.z(this.o0.e);
        ixVar.w(this.o0.f);
        a.xq xqVar2 = this.o0;
        ixVar.w = xqVar2.h;
        int i5 = xqVar2.g;
        ixVar.P = i5;
        ixVar.w = i5 > 0;
    }

    @Override // a.kr0, a.ir0
    public final void a() {
        for (int i = 0; i < this.e0; i++) {
            a.ix ixVar = this.d0[i];
        }
    }

    @Override // a.ix
    public final void b(a.zv0 zv0Var) {
        a.ix ixVar;
        super.b(zv0Var);
        a.ix ixVar2 = this.I;
        boolean z = ixVar2 != null ? ((a.jx) ixVar2).h0 : false;
        int i = this.G0;
        java.util.ArrayList arrayList = this.J0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ((a.gi0) arrayList.get(i2)).b(i2, z, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.M0 != null && this.L0 != null && this.K0 != null) {
                for (int i3 = 0; i3 < this.O0; i3++) {
                    this.N0[i3].u();
                }
                int[] iArr = this.M0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                a.ix ixVar3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    a.ix ixVar4 = this.L0[z ? (i4 - i6) - 1 : i6];
                    if (ixVar4 != null && ixVar4.V != 8) {
                        a.uw uwVar = ixVar4.x;
                        if (i6 == 0) {
                            ixVar4.f(uwVar, this.x, this.j0);
                            ixVar4.X = this.q0;
                            ixVar4.S = this.w0;
                        }
                        if (i6 == i4 - 1) {
                            ixVar4.f(ixVar4.z, this.z, this.k0);
                        }
                        if (i6 > 0) {
                            ixVar4.f(uwVar, ixVar3.z, this.C0);
                            ixVar3.f(ixVar3.z, uwVar, 0);
                        }
                        ixVar3 = ixVar4;
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    a.ix ixVar5 = this.K0[i7];
                    if (ixVar5 != null && ixVar5.V != 8) {
                        a.uw uwVar2 = ixVar5.y;
                        if (i7 == 0) {
                            ixVar5.f(uwVar2, this.y, this.f0);
                            ixVar5.Y = this.r0;
                            ixVar5.T = this.x0;
                        }
                        if (i7 == i5 - 1) {
                            ixVar5.f(ixVar5.A, this.A, this.g0);
                        }
                        if (i7 > 0) {
                            ixVar5.f(uwVar2, ixVar3.A, this.D0);
                            ixVar3.f(ixVar3.A, uwVar2, 0);
                        }
                        ixVar3 = ixVar5;
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.I0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        a.ix[] ixVarArr = this.N0;
                        if (i10 < ixVarArr.length && (ixVar = ixVarArr[i10]) != null && ixVar.V != 8) {
                            a.ix ixVar6 = this.L0[i8];
                            a.ix ixVar7 = this.K0[i9];
                            if (ixVar != ixVar6) {
                                ixVar.f(ixVar.x, ixVar6.x, 0);
                                ixVar.f(ixVar.z, ixVar6.z, 0);
                            }
                            if (ixVar != ixVar7) {
                                ixVar.f(ixVar.y, ixVar7.y, 0);
                                ixVar.f(ixVar.A, ixVar7.A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((a.gi0) arrayList.get(0)).b(0, z, true);
        }
        this.l0 = false;
    }
}
