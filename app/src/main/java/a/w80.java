package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w80 extends a.y80 implements a.ez, a.ey {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater j = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.w80.class, java.lang.Object.class, "_reusableCancellableContinuation");
    private volatile java.lang.Object _reusableCancellableContinuation;
    public final a.xy f;
    public final a.ey g;
    public java.lang.Object h;
    public final java.lang.Object i;

    public w80(a.xy xyVar, a.fy fyVar) {
        super(-1);
        this.f = xyVar;
        this.g = fyVar;
        this.h = a.wv.m;
        a.ty tyVar = fyVar.d;
        a.wv.s(tyVar);
        java.lang.Object k = tyVar.k(0, a.wl1.e);
        a.wv.s(k);
        this.i = k;
    }

    @Override // a.y80
    public final void a(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException) {
        if (obj instanceof a.ew) {
            ((a.ew) obj).b.i(cancellationException);
        }
    }

    @Override // a.y80
    public final a.ey b() {
        return this;
    }

    @Override // a.ez
    public final a.ez f() {
        a.ey eyVar = this.g;
        if (eyVar instanceof a.ez) {
            return (a.ez) eyVar;
        }
        return null;
    }

    @Override // a.y80
    public final java.lang.Object g() {
        java.lang.Object obj = this.h;
        this.h = a.wv.m;
        return obj;
    }

    @Override // a.ey
    public final a.ty h() {
        return this.g.h();
    }

    @Override // a.ey
    public final void j(java.lang.Object obj) {
        a.ey eyVar = this.g;
        a.ty h = eyVar.h();
        java.lang.Throwable a2 = a.bc1.a(obj);
        java.lang.Object dwVar = a2 == null ? obj : new a.dw(a2, false);
        a.xy xyVar = this.f;
        if (xyVar.j()) {
            this.h = dwVar;
            this.e = 0;
            xyVar.h(h, this);
            return;
        }
        a.jc0 a3 = a.xl1.a();
        if (a3.e >= 4294967296L) {
            this.h = dwVar;
            this.e = 0;
            a.hp hpVar = a3.g;
            if (hpVar == null) {
                hpVar = new a.hp();
                a3.g = hpVar;
            }
            hpVar.addLast(this);
            return;
        }
        a3.n(true);
        try {
            a.ty h2 = eyVar.h();
            java.lang.Object Q1 = a.wv.Q1(h2, this.i);
            try {
                eyVar.j(obj);
                do {
                } while (a3.p());
            } finally {
                a.wv.r1(h2, Q1);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.f + ", " + a.b20.u1(this.g) + ']';
    }
}
