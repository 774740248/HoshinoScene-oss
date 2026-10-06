package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jx extends a.ix {
    public java.util.ArrayList d0 = new java.util.ArrayList();
    public final a.nk e0 = new a.nk(this);
    public final a.j30 f0;
    public a.zw g0;
    public boolean h0;
    public final a.zv0 i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public a.lt[] n0;
    public a.lt[] o0;
    public int p0;
    public boolean q0;
    public boolean r0;

    /* JADX WARN: Type inference failed for: r0v2, types: [a.j30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, a.xq] */
    public jx() {
        a.j30 obj = new a.j30();
        obj.b = true;
        obj.c = true;
        obj.e = new java.util.ArrayList();
        new java.util.ArrayList();
        obj.f = null;
        obj.g = (xq) (new java.lang.Object());
        obj.h = new java.util.ArrayList();
        obj.f245a = this;
        obj.d = this;
        this.f0 = obj;
        this.g0 = null;
        this.h0 = false;
        this.i0 = new a.zv0();
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new a.lt[4];
        this.o0 = new a.lt[4];
        this.p0 = 263;
        this.q0 = false;
        this.r0 = false;
    }

    @Override // a.ix
    public final void A(boolean z, boolean z2) {
        super.A(z, z2);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            ((a.ix) this.d0.get(i)).A(z, z2);
        }
    }

    public final void C(a.ix ixVar, int i) {
        if (i == 0) {
            int i2 = this.l0 + 1;
            a.lt[] ltVarArr = this.o0;
            if (i2 >= ltVarArr.length) {
                this.o0 = (a.lt[]) java.util.Arrays.copyOf(ltVarArr, ltVarArr.length * 2);
            }
            a.lt[] ltVarArr2 = this.o0;
            int i3 = this.l0;
            ltVarArr2[i3] = new a.lt(ixVar, 0, this.h0);
            this.l0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.m0 + 1;
            a.lt[] ltVarArr3 = this.n0;
            if (i4 >= ltVarArr3.length) {
                this.n0 = (a.lt[]) java.util.Arrays.copyOf(ltVarArr3, ltVarArr3.length * 2);
            }
            a.lt[] ltVarArr4 = this.n0;
            int i5 = this.m0;
            ltVarArr4[i5] = new a.lt(ixVar, 1, this.h0);
            this.m0 = i5 + 1;
        }
    }

    public final void D(a.zv0 zv0Var) {
        b(zv0Var);
        int size = this.d0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            a.ix ixVar = (a.ix) this.d0.get(i);
            boolean[] zArr = ixVar.H;
            zArr[0] = false;
            zArr[1] = false;
            if (ixVar instanceof a.hq) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                a.ix ixVar2 = (a.ix) this.d0.get(i2);
                if (ixVar2 instanceof a.hq) {
                    a.hq hqVar = (a.hq) ixVar2;
                    for (int i3 = 0; i3 < hqVar.e0; i3++) {
                        a.ix ixVar3 = hqVar.d0[i3];
                        int i4 = hqVar.f0;
                        if (i4 == 0 || i4 == 1) {
                            ixVar3.H[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            ixVar3.H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            a.ix ixVar4 = (a.ix) this.d0.get(i5);
            ixVar4.getClass();
            if ((ixVar4 instanceof a.hi0) || (ixVar4 instanceof a.zq0)) {
                ixVar4.b(zv0Var);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            a.ix ixVar5 = (a.ix) this.d0.get(i6);
            if (ixVar5 instanceof a.jx) {
                int[] iArr = ixVar5.c0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                if (i7 == 2) {
                    ixVar5.x(1);
                }
                if (i8 == 2) {
                    ixVar5.y(1);
                }
                ixVar5.b(zv0Var);
                if (i7 == 2) {
                    ixVar5.x(i7);
                }
                if (i8 == 2) {
                    ixVar5.y(i8);
                }
            } else {
                ixVar5.h = -1;
                ixVar5.i = -1;
                int[] iArr2 = this.c0;
                int i9 = iArr2[0];
                int[] iArr3 = ixVar5.c0;
                if (i9 != 2 && iArr3[0] == 4) {
                    a.uw uwVar = ixVar5.x;
                    int i10 = uwVar.e;
                    int m = m();
                    a.uw uwVar2 = ixVar5.z;
                    int i11 = m - uwVar2.e;
                    uwVar.g = zv0Var.j(uwVar);
                    uwVar2.g = zv0Var.j(uwVar2);
                    zv0Var.d(uwVar.g, i10);
                    zv0Var.d(uwVar2.g, i11);
                    ixVar5.h = 2;
                    ixVar5.N = i10;
                    int i12 = i11 - i10;
                    ixVar5.J = i12;
                    int i13 = ixVar5.Q;
                    if (i12 < i13) {
                        ixVar5.J = i13;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    a.uw uwVar3 = ixVar5.y;
                    int i14 = uwVar3.e;
                    int j = j();
                    a.uw uwVar4 = ixVar5.A;
                    int i15 = j - uwVar4.e;
                    uwVar3.g = zv0Var.j(uwVar3);
                    uwVar4.g = zv0Var.j(uwVar4);
                    zv0Var.d(uwVar3.g, i14);
                    zv0Var.d(uwVar4.g, i15);
                    if (ixVar5.P > 0 || ixVar5.V == 8) {
                        a.uw uwVar5 = ixVar5.B;
                        a.bi1 j2 = zv0Var.j(uwVar5);
                        uwVar5.g = j2;
                        zv0Var.d(j2, ixVar5.P + i14);
                    }
                    ixVar5.i = 2;
                    ixVar5.O = i14;
                    int i16 = i15 - i14;
                    ixVar5.K = i16;
                    int i17 = ixVar5.R;
                    if (i16 < i17) {
                        ixVar5.K = i17;
                    }
                }
                if (!(ixVar5 instanceof a.hi0) && !(ixVar5 instanceof a.zq0)) {
                    ixVar5.b(zv0Var);
                }
            }
        }
        if (this.l0 > 0) {
            a.b20.d(this, zv0Var, 0);
        }
        if (this.m0 > 0) {
            a.b20.d(this, zv0Var, 1);
        }
    }

    public final boolean E(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = z & true;
        a.j30 j30Var = this.f0;
        a.jx jxVar = j30Var.f245a;
        int i2 = jxVar.i(0);
        int i3 = jxVar.i(1);
        int n = jxVar.n();
        int o = jxVar.o();
        java.util.ArrayList arrayList = j30Var.e;
        a.ip1 ip1Var = jxVar.e;
        a.nr0 nr0Var = jxVar.d;
        if (z6 && (i2 == 2 || i3 == 2)) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a.ws1 ws1Var = (a.ws1) it.next();
                if (ws1Var.f == i && !ws1Var.k()) {
                    z6 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z6 && i2 == 2) {
                    jxVar.x(1);
                    jxVar.z(j30Var.d(jxVar, 0));
                    nr0Var.e.d(jxVar.m());
                }
            } else if (z6 && i3 == 2) {
                jxVar.y(1);
                jxVar.w(j30Var.d(jxVar, 1));
                ip1Var.e.d(jxVar.j());
            }
        }
        int[] iArr = jxVar.c0;
        if (i == 0) {
            z2 = false;
            int i4 = iArr[0];
            if (i4 == 1 || i4 == 4) {
                int m = jxVar.m() + n;
                nr0Var.i.d(m);
                nr0Var.e.d(m - n);
                z4 = true;
                z3 = true;
            } else {
                z3 = true;
                z4 = z2;
            }
        } else {
            z2 = false;
            z3 = true;
            int i5 = iArr[1];
            if (i5 == 1 || i5 == 4) {
                int j = jxVar.j() + o;
                ip1Var.i.d(j);
                ip1Var.e.d(j - o);
                z4 = true;
            }
            z4 = z2;
        }
        j30Var.g();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a.ws1 ws1Var2 = (a.ws1) it2.next();
            if (ws1Var2.f == i && (ws1Var2.b != jxVar || ws1Var2.g)) {
                ws1Var2.e();
            }
        }
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            a.ws1 ws1Var3 = (a.ws1) it3.next();
            if (ws1Var3.f == i && (z4 || ws1Var3.b != jxVar)) {
                if (!ws1Var3.h.j || !ws1Var3.i.j || (!(ws1Var3 instanceof a.mt) && !ws1Var3.e.j)) {
                    z5 = z2;
                    break;
                }
            }
        }
        z5 = z3;
        jxVar.x(i2);
        jxVar.y(i3);
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff A[LOOP:4: B:48:0x00fd->B:49:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jx.F():void");
    }

    @Override // a.ix
    public final void t() {
        this.i0.r();
        this.j0 = 0;
        this.k0 = 0;
        this.d0.clear();
        super.t();
    }

    @Override // a.ix
    public final void v(a.ej1 ej1Var) {
        super.v(ej1Var);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            ((a.ix) this.d0.get(i)).v(ej1Var);
        }
    }
}
