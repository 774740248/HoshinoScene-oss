package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zq0 extends a.ix {
    public float d0 = -1.0f;
    public int e0 = -1;
    public int f0 = -1;
    public a.uw g0 = this.y;
    public int h0 = 0;

    public zq0() {
        this.G.clear();
        this.G.add(this.g0);
        int length = this.F.length;
        for (int i = 0; i < length; i++) {
            this.F[i] = this.g0;
        }
    }

    @Override // a.ix
    public final void B(a.zv0 zv0Var) {
        if (this.I == null) {
            return;
        }
        a.uw uwVar = this.g0;
        zv0Var.getClass();
        int m = a.zv0.m(uwVar);
        if (this.h0 == 1) {
            this.N = m;
            this.O = 0;
            w(this.I.j());
            z(0);
            return;
        }
        this.N = 0;
        this.O = m;
        z(this.I.m());
        w(0);
    }

    public final void C(int i) {
        if (this.h0 == i) {
            return;
        }
        this.h0 = i;
        java.util.ArrayList arrayList = this.G;
        arrayList.clear();
        if (this.h0 == 1) {
            this.g0 = this.x;
        } else {
            this.g0 = this.y;
        }
        arrayList.add(this.g0);
        a.uw[] uwVarArr = this.F;
        int length = uwVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            uwVarArr[i2] = this.g0;
        }
    }

    @Override // a.ix
    public final void b(a.zv0 zv0Var) {
        a.jx jxVar = (a.jx) this.I;
        if (jxVar == null) {
            return;
        }
        a.uw h = jxVar.h(2);
        a.uw h2 = jxVar.h(4);
        a.ix ixVar = this.I;
        boolean z = ixVar != null && ixVar.c0[0] == 2;
        if (this.h0 == 0) {
            h = jxVar.h(3);
            h2 = jxVar.h(5);
            a.ix ixVar2 = this.I;
            z = ixVar2 != null && ixVar2.c0[1] == 2;
        }
        if (this.e0 != -1) {
            a.bi1 j = zv0Var.j(this.g0);
            zv0Var.e(j, zv0Var.j(h), this.e0, 8);
            if (z) {
                zv0Var.f(zv0Var.j(h2), j, 0, 5);
                return;
            }
            return;
        }
        if (this.f0 != -1) {
            a.bi1 j2 = zv0Var.j(this.g0);
            a.bi1 j3 = zv0Var.j(h2);
            zv0Var.e(j2, j3, -this.f0, 8);
            if (z) {
                zv0Var.f(j2, zv0Var.j(h), 0, 5);
                zv0Var.f(j3, j2, 0, 5);
                return;
            }
            return;
        }
        if (this.d0 != -1.0f) {
            a.bi1 j4 = zv0Var.j(this.g0);
            a.bi1 j5 = zv0Var.j(h2);
            float f = this.d0;
            a.mp k = zv0Var.k();
            k.d.c(j4, -1.0f);
            k.d.c(j5, f);
            zv0Var.c(k);
        }
    }

    @Override // a.ix
    public final boolean c() {
        return true;
    }

    @Override // a.ix
    public final a.uw h(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
            case 5:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.h0 == 1) {
                    return this.g0;
                }
                break;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                if (this.h0 == 0) {
                    return this.g0;
                }
                break;
        }
        throw new java.lang.AssertionError(a.ai1.z(i));
    }
}
