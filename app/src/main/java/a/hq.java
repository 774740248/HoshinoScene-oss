package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hq extends a.kr0 {
    public int f0;
    public boolean g0;
    public int h0;

    @Override // a.ix
    public final void b(a.zv0 zv0Var) {
        boolean z;
        int i;
        int i2;
        a.uw[] uwVarArr = this.F;
        a.uw uwVar = this.x;
        uwVarArr[0] = uwVar;
        a.uw uwVar2 = this.y;
        int i3 = 2;
        uwVarArr[2] = uwVar2;
        a.uw uwVar3 = this.z;
        uwVarArr[1] = uwVar3;
        a.uw uwVar4 = this.A;
        uwVarArr[3] = uwVar4;
        for (a.uw uwVar5 : uwVarArr) {
            uwVar5.g = zv0Var.j(uwVar5);
        }
        int i4 = this.f0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        a.uw uwVar6 = uwVarArr[i4];
        for (int i5 = 0; i5 < this.e0; i5++) {
            a.ix ixVar = this.d0[i5];
            if ((this.g0 || ixVar.c()) && ((((i2 = this.f0) == 0 || i2 == 1) && ixVar.c0[0] == 3 && ixVar.x.d != null && ixVar.z.d != null) || ((i2 == 2 || i2 == 3) && ixVar.c0[1] == 3 && ixVar.y.d != null && ixVar.A.d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = uwVar.e() || uwVar3.e();
        boolean z3 = uwVar2.e() || uwVar4.e();
        int i6 = (z || !(((i = this.f0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.e0) {
            a.ix ixVar2 = this.d0[i7];
            if (this.g0 || ixVar2.c()) {
                a.bi1 j = zv0Var.j(ixVar2.F[this.f0]);
                int i8 = this.f0;
                a.uw uwVar7 = ixVar2.F[i8];
                uwVar7.g = j;
                a.uw uwVar8 = uwVar7.d;
                int i9 = (uwVar8 == null || uwVar8.b != this) ? 0 : uwVar7.e;
                if (i8 == 0 || i8 == i3) {
                    a.bi1 bi1Var = uwVar6.g;
                    int i10 = this.h0 - i9;
                    a.mp k = zv0Var.k();
                    a.bi1 l = zv0Var.l();
                    l.d = 0;
                    k.c(bi1Var, j, l, i10);
                    zv0Var.c(k);
                } else {
                    a.bi1 bi1Var2 = uwVar6.g;
                    int i11 = this.h0 + i9;
                    a.mp k2 = zv0Var.k();
                    a.bi1 l2 = zv0Var.l();
                    l2.d = 0;
                    k2.b(bi1Var2, j, l2, i11);
                    zv0Var.c(k2);
                }
                zv0Var.e(uwVar6.g, j, this.h0 + i9, i6);
            }
            i7++;
            i3 = 2;
        }
        int i12 = this.f0;
        if (i12 == 0) {
            zv0Var.e(uwVar3.g, uwVar.g, 0, 8);
            zv0Var.e(uwVar.g, this.I.z.g, 0, 4);
            zv0Var.e(uwVar.g, this.I.x.g, 0, 0);
            return;
        }
        if (i12 == 1) {
            zv0Var.e(uwVar.g, uwVar3.g, 0, 8);
            zv0Var.e(uwVar.g, this.I.x.g, 0, 4);
            zv0Var.e(uwVar.g, this.I.z.g, 0, 0);
        } else if (i12 == 2) {
            zv0Var.e(uwVar4.g, uwVar2.g, 0, 8);
            zv0Var.e(uwVar2.g, this.I.A.g, 0, 4);
            zv0Var.e(uwVar2.g, this.I.y.g, 0, 0);
        } else if (i12 == 3) {
            zv0Var.e(uwVar2.g, uwVar4.g, 0, 8);
            zv0Var.e(uwVar2.g, this.I.y.g, 0, 4);
            zv0Var.e(uwVar2.g, this.I.A.g, 0, 0);
        }
    }

    @Override // a.ix
    public final boolean c() {
        return true;
    }

    @Override // a.ix
    public final java.lang.String toString() {
        java.lang.String j = a.ai1.j(new java.lang.StringBuilder("[Barrier] "), this.W, " {");
        for (int i = 0; i < this.e0; i++) {
            a.ix ixVar = this.d0[i];
            if (i > 0) {
                j = a.ii1.e(j, ", ");
            }
            j = j + ixVar.W;
        }
        return a.ii1.e(j, "}");
    }
}
