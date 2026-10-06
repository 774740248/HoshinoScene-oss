package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ix {
    public final a.uw A;
    public final a.uw B;
    public final a.uw C;
    public final a.uw D;
    public final a.uw E;
    public final a.uw[] F;
    public final java.util.ArrayList G;
    public final boolean[] H;
    public a.ix I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public java.lang.Object U;
    public int V;
    public java.lang.String W;
    public int X;
    public int Y;
    public final float[] Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f242a = false;
    public final a.ix[] a0;
    public a.mt b;
    public final a.ix[] b0;
    public a.mt c;
    public final int[] c0;
    public final a.nr0 d;
    public final a.ip1 e;
    public final boolean[] f;
    public final int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final int[] l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public final int[] u;
    public float v;
    public boolean w;
    public final a.uw x;
    public final a.uw y;
    public final a.uw z;

    /* JADX WARN: Type inference failed for: r2v0, types: [a.nr0, a.ws1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.ip1, a.ws1] */
    public ix() {
        a.nr0 ws1Var = new a.nr0(this);
        ws1Var.h.e = 4;
        ws1Var.i.e = 5;
        ws1Var.f = 0;
        this.d = ws1Var;
        a.ip1 ws1Var2 = new a.ip1(this);
        a.k30 k30Var = new a.k30(ws1Var2);
        ws1Var2.k = k30Var;
        ws1Var2.l = null;
        ws1Var2.h.e = 6;
        ws1Var2.i.e = 7;
        k30Var.e = 8;
        ws1Var2.f = 1;
        this.e = ws1Var2;
        this.f = new boolean[]{true, true};
        this.g = new int[]{0, 0, 0, 0};
        this.h = -1;
        this.i = -1;
        this.j = 0;
        this.k = 0;
        this.l = new int[2];
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = -1;
        this.t = 1.0f;
        this.u = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.v = 0.0f;
        this.w = false;
        a.uw uwVar = new a.uw(this, 2);
        this.x = uwVar;
        a.uw uwVar2 = new a.uw(this, 3);
        this.y = uwVar2;
        a.uw uwVar3 = new a.uw(this, 4);
        this.z = uwVar3;
        a.uw uwVar4 = new a.uw(this, 5);
        this.A = uwVar4;
        a.uw uwVar5 = new a.uw(this, 6);
        this.B = uwVar5;
        a.uw uwVar6 = new a.uw(this, 8);
        this.C = uwVar6;
        a.uw uwVar7 = new a.uw(this, 9);
        this.D = uwVar7;
        a.uw uwVar8 = new a.uw(this, 7);
        this.E = uwVar8;
        this.F = new a.uw[]{uwVar, uwVar3, uwVar2, uwVar4, uwVar5, uwVar8};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.G = arrayList;
        this.H = new boolean[2];
        this.c0 = new int[]{1, 1};
        this.I = null;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        this.V = 0;
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = new float[]{-1.0f, -1.0f};
        this.a0 = new a.ix[]{null, null};
        this.b0 = new a.ix[]{null, null};
        arrayList.add(uwVar);
        arrayList.add(uwVar2);
        arrayList.add(uwVar3);
        arrayList.add(uwVar4);
        arrayList.add(uwVar6);
        arrayList.add(uwVar7);
        arrayList.add(uwVar8);
        arrayList.add(uwVar5);
    }

    public void A(boolean z, boolean z2) {
        int i;
        int i2;
        a.nr0 nr0Var = this.d;
        boolean z3 = z & nr0Var.g;
        a.ip1 ip1Var = this.e;
        boolean z4 = z2 & ip1Var.g;
        int i3 = nr0Var.h.g;
        int i4 = ip1Var.h.g;
        int i5 = nr0Var.i.g;
        int i6 = ip1Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.N = i3;
        }
        if (z4) {
            this.O = i4;
        }
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.c0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.J)) {
                i8 = i2;
            }
            this.J = i8;
            int i10 = this.Q;
            if (i8 < i10) {
                this.J = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.K)) {
                i9 = i;
            }
            this.K = i9;
            int i11 = this.R;
            if (i9 < i11) {
                this.K = i11;
            }
        }
    }

    public void B(a.zv0 zv0Var) {
        int i;
        int i2;
        a.uw uwVar = this.x;
        zv0Var.getClass();
        int m = a.zv0.m(uwVar);
        int m2 = a.zv0.m(this.y);
        int m3 = a.zv0.m(this.z);
        int m4 = a.zv0.m(this.A);
        a.nr0 nr0Var = this.d;
        a.k30 k30Var = nr0Var.h;
        if (k30Var.j) {
            a.k30 k30Var2 = nr0Var.i;
            if (k30Var2.j) {
                m = k30Var.g;
                m3 = k30Var2.g;
            }
        }
        a.ip1 ip1Var = this.e;
        a.k30 k30Var3 = ip1Var.h;
        if (k30Var3.j) {
            a.k30 k30Var4 = ip1Var.i;
            if (k30Var4.j) {
                m2 = k30Var3.g;
                m4 = k30Var4.g;
            }
        }
        int i3 = m4 - m2;
        if (m3 - m < 0 || i3 < 0 || m == Integer.MIN_VALUE || m == Integer.MAX_VALUE || m2 == Integer.MIN_VALUE || m2 == Integer.MAX_VALUE || m3 == Integer.MIN_VALUE || m3 == Integer.MAX_VALUE || m4 == Integer.MIN_VALUE || m4 == Integer.MAX_VALUE) {
            m = 0;
            m2 = 0;
            m3 = 0;
            m4 = 0;
        }
        int i4 = m3 - m;
        int i5 = m4 - m2;
        this.N = m;
        this.O = m2;
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.c0;
        if (iArr[0] == 1 && i4 < (i2 = this.J)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.K)) {
            i5 = i;
        }
        this.J = i4;
        this.K = i5;
        int i6 = this.R;
        if (i5 < i6) {
            this.K = i6;
        }
        int i7 = this.Q;
        if (i4 < i7) {
            this.J = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(a.zv0 r58) {
        /*
            Method dump skipped, instructions count: 1629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ix.b(a.zv0):void");
    }

    public boolean c() {
        return this.V != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0322 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x040e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(a.zv0 r33, boolean r34, boolean r35, boolean r36, boolean r37, a.bi1 r38, a.bi1 r39, int r40, boolean r41, a.uw r42, a.uw r43, int r44, int r45, int r46, int r47, float r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ix.d(a.zv0, boolean, boolean, boolean, boolean, a.bi1, a.bi1, int, boolean, a.uw, a.uw, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i, a.ix ixVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    e(2, ixVar, i2, 0);
                    e(4, ixVar, i2, 0);
                    h(7).a(ixVar.h(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        e(3, ixVar, i2, 0);
                        e(5, ixVar, i2, 0);
                        h(7).a(ixVar.h(i2), 0);
                        return;
                    }
                    return;
                }
            }
            a.uw h = h(2);
            a.uw h2 = h(4);
            a.uw h3 = h(3);
            a.uw h4 = h(5);
            boolean z2 = true;
            if ((h == null || !h.f()) && (h2 == null || !h2.f())) {
                e(2, ixVar, 2, 0);
                e(4, ixVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((h3 == null || !h3.f()) && (h4 == null || !h4.f())) {
                e(3, ixVar, 3, 0);
                e(5, ixVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                h(7).a(ixVar.h(7), 0);
                return;
            } else if (z) {
                h(8).a(ixVar.h(8), 0);
                return;
            } else {
                if (z2) {
                    h(9).a(ixVar.h(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            a.uw h5 = h(2);
            a.uw h6 = ixVar.h(i2);
            a.uw h7 = h(4);
            h5.a(h6, 0);
            h7.a(h6, 0);
            h(8).a(h6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            a.uw h8 = ixVar.h(i2);
            h(3).a(h8, 0);
            h(5).a(h8, 0);
            h(9).a(h8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            h(2).a(ixVar.h(2), 0);
            h(4).a(ixVar.h(4), 0);
            h(8).a(ixVar.h(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            h(3).a(ixVar.h(3), 0);
            h(5).a(ixVar.h(5), 0);
            h(9).a(ixVar.h(i2), 0);
            return;
        }
        a.uw h9 = h(i);
        a.uw h10 = ixVar.h(i2);
        if (h9.g(h10)) {
            if (i == 6) {
                a.uw h11 = h(3);
                a.uw h12 = h(5);
                if (h11 != null) {
                    h11.h();
                }
                if (h12 != null) {
                    h12.h();
                }
                i3 = 0;
            } else if (i == 3 || i == 5) {
                a.uw h13 = h(6);
                if (h13 != null) {
                    h13.h();
                }
                a.uw h14 = h(7);
                if (h14.d != h10) {
                    h14.h();
                }
                a.uw d = h(i).d();
                a.uw h15 = h(9);
                if (h15.f()) {
                    d.h();
                    h15.h();
                }
            } else if (i == 2 || i == 4) {
                a.uw h16 = h(7);
                if (h16.d != h10) {
                    h16.h();
                }
                a.uw d2 = h(i).d();
                a.uw h17 = h(8);
                if (h17.f()) {
                    d2.h();
                    h17.h();
                }
            }
            h9.a(h10, i3);
        }
    }

    public final void f(a.uw uwVar, a.uw uwVar2, int i) {
        if (uwVar.b == this) {
            e(uwVar.c, uwVar2.b, uwVar2.c, i);
        }
    }

    public final void g(a.zv0 zv0Var) {
        zv0Var.j(this.x);
        zv0Var.j(this.y);
        zv0Var.j(this.z);
        zv0Var.j(this.A);
        if (this.P > 0) {
            zv0Var.j(this.B);
        }
    }

    public a.uw h(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return null;
            case 1:
                return this.x;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return this.y;
            case 3:
                return this.z;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return this.A;
            case 5:
                return this.B;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return this.E;
            case 7:
                return this.C;
            case 8:
                return this.D;
            default:
                throw new java.lang.AssertionError(a.ai1.z(i));
        }
    }

    public final int i(int i) {
        int[] iArr = this.c0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int j() {
        if (this.V == 8) {
            return 0;
        }
        return this.K;
    }

    public final a.ix k(int i) {
        a.uw uwVar;
        a.uw uwVar2;
        if (i != 0) {
            if (i == 1 && (uwVar2 = (uwVar = this.A).d) != null && uwVar2.d == uwVar) {
                return uwVar2.b;
            }
            return null;
        }
        a.uw uwVar3 = this.z;
        a.uw uwVar4 = uwVar3.d;
        if (uwVar4 == null || uwVar4.d != uwVar3) {
            return null;
        }
        return uwVar4.b;
    }

    public final a.ix l(int i) {
        a.uw uwVar;
        a.uw uwVar2;
        if (i != 0) {
            if (i == 1 && (uwVar2 = (uwVar = this.y).d) != null && uwVar2.d == uwVar) {
                return uwVar2.b;
            }
            return null;
        }
        a.uw uwVar3 = this.x;
        a.uw uwVar4 = uwVar3.d;
        if (uwVar4 == null || uwVar4.d != uwVar3) {
            return null;
        }
        return uwVar4.b;
    }

    public final int m() {
        if (this.V == 8) {
            return 0;
        }
        return this.J;
    }

    public final int n() {
        a.ix ixVar = this.I;
        return (ixVar == null || !(ixVar instanceof a.jx)) ? this.N : ((a.jx) ixVar).j0 + this.N;
    }

    public final int o() {
        a.ix ixVar = this.I;
        return (ixVar == null || !(ixVar instanceof a.jx)) ? this.O : ((a.jx) ixVar).k0 + this.O;
    }

    public final void p(int i, a.ix ixVar, int i2, int i3, int i4) {
        h(i).b(ixVar.h(i2), i3, i4, true);
    }

    public final boolean q(int i) {
        a.uw uwVar;
        a.uw uwVar2;
        int i2 = i * 2;
        a.uw[] uwVarArr = this.F;
        a.uw uwVar3 = uwVarArr[i2];
        a.uw uwVar4 = uwVar3.d;
        return (uwVar4 == null || uwVar4.d == uwVar3 || (uwVar2 = (uwVar = uwVarArr[i2 + 1]).d) == null || uwVar2.d != uwVar) ? false : true;
    }

    public final boolean r() {
        a.uw uwVar = this.x;
        a.uw uwVar2 = uwVar.d;
        if (uwVar2 != null && uwVar2.d == uwVar) {
            return true;
        }
        a.uw uwVar3 = this.z;
        a.uw uwVar4 = uwVar3.d;
        return uwVar4 != null && uwVar4.d == uwVar3;
    }

    public final boolean s() {
        a.uw uwVar = this.y;
        a.uw uwVar2 = uwVar.d;
        if (uwVar2 != null && uwVar2.d == uwVar) {
            return true;
        }
        a.uw uwVar3 = this.A;
        a.uw uwVar4 = uwVar3.d;
        return uwVar4 != null && uwVar4.d == uwVar3;
    }

    public void t() {
        this.x.h();
        this.y.h();
        this.z.h();
        this.A.h();
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.I = null;
        this.v = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        int[] iArr = this.c0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.U = null;
        this.V = 0;
        this.X = 0;
        this.Y = 0;
        float[] fArr = this.Z;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.h = -1;
        this.i = -1;
        int[] iArr2 = this.u;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.j = 0;
        this.k = 0;
        this.o = 1.0f;
        this.r = 1.0f;
        this.n = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.m = 0;
        this.p = 0;
        this.s = -1;
        this.t = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.H;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("");
        sb.append(this.W != null ? a.ai1.j(new java.lang.StringBuilder("id: "), this.W, " ") : "");
        sb.append("(");
        sb.append(this.N);
        sb.append(", ");
        sb.append(this.O);
        sb.append(") - (");
        sb.append(this.J);
        sb.append(" x ");
        sb.append(this.K);
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        a.ix ixVar = this.I;
        if (ixVar != null && (ixVar instanceof a.jx)) {
            ((a.jx) ixVar).getClass();
        }
        java.util.ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a.uw) arrayList.get(i)).h();
        }
    }

    public void v(a.ej1 ej1Var) {
        this.x.i();
        this.y.i();
        this.z.i();
        this.A.i();
        this.B.i();
        this.E.i();
        this.C.i();
        this.D.i();
    }

    public final void w(int i) {
        this.K = i;
        int i2 = this.R;
        if (i < i2) {
            this.K = i2;
        }
    }

    public final void x(int i) {
        this.c0[0] = i;
    }

    public final void y(int i) {
        this.c0[1] = i;
    }

    public final void z(int i) {
        this.J = i;
        int i2 = this.Q;
        if (i < i2) {
            this.J = i2;
        }
    }
}
