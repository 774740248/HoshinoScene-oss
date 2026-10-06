package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uw {
    public final a.ix b;
    public final int c;
    public a.uw d;
    public a.bi1 g;

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashSet f610a = null;
    public int e = 0;
    public int f = -1;

    public uw(a.ix ixVar, int i) {
        this.b = ixVar;
        this.c = i;
    }

    public final void a(a.uw uwVar, int i) {
        b(uwVar, i, -1, false);
    }

    public final boolean b(a.uw uwVar, int i, int i2, boolean z) {
        if (uwVar == null) {
            h();
            return true;
        }
        if (!z && !g(uwVar)) {
            return false;
        }
        this.d = uwVar;
        if (uwVar.f610a == null) {
            uwVar.f610a = new java.util.HashSet();
        }
        this.d.f610a.add(this);
        if (i > 0) {
            this.e = i;
        } else {
            this.e = 0;
        }
        this.f = i2;
        return true;
    }

    public final int c() {
        a.uw uwVar;
        if (this.b.V == 8) {
            return 0;
        }
        int i = this.f;
        return (i <= -1 || (uwVar = this.d) == null || uwVar.b.V != 8) ? this.e : i;
    }

    public final a.uw d() {
        int i = this.c;
        int B = a.ai1.B(i);
        a.ix ixVar = this.b;
        switch (B) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
            case 5:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
            case 7:
            case 8:
                return null;
            case 1:
                return ixVar.z;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return ixVar.A;
            case 3:
                return ixVar.x;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return ixVar.y;
            default:
                throw new java.lang.AssertionError(a.ai1.z(i));
        }
    }

    public final boolean e() {
        java.util.HashSet hashSet = this.f610a;
        if (hashSet == null) {
            return false;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((a.uw) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.d != null;
    }

    public final boolean g(a.uw uwVar) {
        if (uwVar == null) {
            return false;
        }
        int i = this.c;
        a.ix ixVar = uwVar.b;
        int i2 = uwVar.c;
        if (i2 == i) {
            return i != 6 || (ixVar.w && this.b.w);
        }
        switch (a.ai1.B(i)) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (ixVar instanceof a.zq0) {
                    return z || i2 == 8;
                }
                return z;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                boolean z2 = i2 == 3 || i2 == 5;
                if (ixVar instanceof a.zq0) {
                    return z2 || i2 == 9;
                }
                return z2;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new java.lang.AssertionError(a.ai1.z(i));
        }
    }

    public final void h() {
        java.util.HashSet hashSet;
        a.uw uwVar = this.d;
        if (uwVar != null && (hashSet = uwVar.f610a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public final void i() {
        a.bi1 bi1Var = this.g;
        if (bi1Var == null) {
            this.g = new a.bi1(1);
        } else {
            bi1Var.c();
        }
    }

    public final java.lang.String toString() {
        return this.b.W + ":" + a.ai1.z(this.c);
    }
}
