package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cr0 extends a.zx0 implements a.f30 {
    private volatile a.cr0 _immediate;
    public final android.os.Handler e;
    public final java.lang.String f;
    public final boolean g;
    public final a.cr0 h;

    public cr0(android.os.Handler handler, java.lang.String str, boolean z) {
        this.e = handler;
        this.f = str;
        this.g = z;
        this._immediate = z ? this : null;
        a.cr0 cr0Var = this._immediate;
        if (cr0Var == null) {
            cr0Var = new a.cr0(handler, str, true);
            this._immediate = cr0Var;
        }
        this.h = cr0Var;
    }

    @Override // a.f30
    public final a.c90 b(long j, final java.lang.Runnable runnable, a.ty tyVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.e.postDelayed(runnable, j)) {
            return new a.br0();
        }
        l(tyVar, runnable);
        return a.e21.c;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof a.cr0) && ((a.cr0) obj).e == this.e;
    }

    @Override // a.f30
    public final void f(long j, a.at atVar) {
        a.g2 g2Var = new a.g2(atVar, this, 15);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.e.postDelayed(g2Var, j)) {
            atVar.r(new a.lc1(this, 13, g2Var));
        } else {
            l(atVar.g, g2Var);
        }
    }

    @Override // a.xy
    public final void h(a.ty tyVar, java.lang.Runnable runnable) {
        if (this.e.post(runnable)) {
            return;
        }
        l(tyVar, runnable);
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.e);
    }

    @Override // a.xy
    public final boolean j() {
        return (this.g && a.wv.e(android.os.Looper.myLooper(), this.e.getLooper())) ? false : true;
    }

    public final void l(a.ty tyVar, java.lang.Runnable runnable) {
        a.wv.o(tyVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        a.z80.b.h(tyVar, runnable);
    }

    @Override // a.xy
    public final java.lang.String toString() {
        a.cr0 cr0Var;
        java.lang.String str;
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        if (this == zx0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                cr0Var = ((a.cr0) zx0Var).h;
            } catch (java.lang.UnsupportedOperationException unused) {
                cr0Var = null;
            }
            str = this == cr0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.f;
        if (str2 == null) {
            str2 = this.e.toString();
        }
        return this.g ? a.ii1.e(str2, ".immediate") : str2;
    }

    public cr0(android.os.Handler handler) {
        this(handler, null, false);
    }
}
