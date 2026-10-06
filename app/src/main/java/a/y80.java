package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class y80 extends a.lk1 {
    public int e;

    public y80(int i) {
        super(0L, a.pk1.g);
        this.e = i;
    }

    public abstract void a(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException);

    public abstract a.ey b();

    public java.lang.Throwable c(java.lang.Object obj) {
        a.dw dwVar = obj instanceof a.dw ? (a.dw) obj : null;
        if (dwVar != null) {
            return dwVar.f110a;
        }
        return null;
    }

    public java.lang.Object d(java.lang.Object obj) {
        return obj;
    }

    public final void e(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            a.b20.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        a.wv.s(th);
        a.wv.v0(b().h(), new java.lang.Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract java.lang.Object g();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = a.no1.f387a;
        a.fa0 fa0Var = this.d;
        try {
            a.ey b = b();
            a.wv.t(b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            a.w80 w80Var = (a.w80) b;
            a.ey eyVar = w80Var.g;
            java.lang.Object obj2 = w80Var.i;
            a.ty h = eyVar.h();
            java.lang.Object Q1 = a.wv.Q1(h, obj2);
            a.lo1 R1 = Q1 != a.wv.F ? a.wv.R1(eyVar, h, Q1) : null;
            try {
                a.ty h2 = eyVar.h();
                java.lang.Object g = g();
                java.lang.Throwable c = c(g);
                a.nt0 nt0Var = (c == null && a.wv.E0(this.e)) ? (a.nt0) h2.g(a.gy.f) : null;
                if (nt0Var != null && !nt0Var.a()) {
                    java.util.concurrent.CancellationException w = ((a.wt0) nt0Var).w();
                    a(g, w);
                    eyVar.j(a.b20.I(w));
                } else if (c != null) {
                    eyVar.j(a.b20.I(c));
                } else {
                    eyVar.j(d(g));
                }
                if (R1 == null || R1.T()) {
                    a.wv.r1(h, Q1);
                }
                try {
                    fa0Var.getClass();
                } catch (java.lang.Throwable th) {
                    obj = a.b20.I(th);
                }
                e(null, a.bc1.a(obj));
            } catch (java.lang.Throwable th2) {
                if (R1 == null || R1.T()) {
                    a.wv.r1(h, Q1);
                }
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                fa0Var.getClass();
            } catch (java.lang.Throwable th4) {
                obj = a.b20.I(th4);
            }
            e(th3, a.bc1.a(obj));
        }
    }
}
