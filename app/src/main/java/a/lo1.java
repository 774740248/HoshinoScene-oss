package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lo1 extends a.mf1 {
    public final java.lang.ThreadLocal g;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lo1(a.ey r3, a.ty r4) {
        /*
            r2 = this;
            a.mo1 r0 = a.mo1.c
            a.ry r1 = r4.g(r0)
            if (r1 != 0) goto Ld
            a.ty r0 = r4.c(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.g = r0
            a.ty r3 = r3.h()
            a.gy r0 = a.gy.c
            a.ry r3 = r3.g(r0)
            boolean r3 = r3 instanceof a.xy
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = a.wv.Q1(r4, r3)
            a.wv.r1(r4, r3)
            r2.U(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lo1.<init>(a.ey, a.ty):void");
    }

    public final boolean T() {
        boolean z = this.threadLocalIsSet && this.g.get() == null;
        this.g.remove();
        return !z;
    }

    public final void U(a.ty tyVar, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.g.set(new a.y31(tyVar, obj));
    }

    @Override // a.mf1, a.wt0
    public final void n(java.lang.Object obj) {
        if (this.threadLocalIsSet) {
            a.y31 y31Var = (a.y31) this.g.get();
            if (y31Var != null) {
                a.wv.r1((a.ty) y31Var.c, y31Var.d);
            }
            this.g.remove();
        }
        java.lang.Object l1 = a.wv.l1(obj);
        a.ey eyVar = this.f;
        a.ty h = eyVar.h();
        java.lang.Object Q1 = a.wv.Q1(h, null);
        a.lo1 R1 = Q1 != a.wv.F ? a.wv.R1(eyVar, h, Q1) : null;
        try {
            this.f.j(l1);
        } finally {
            if (R1 == null || R1.T()) {
                a.wv.r1(h, Q1);
            }
        }
    }
}
