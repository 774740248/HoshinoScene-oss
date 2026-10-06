package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class km1 extends a.mf1 implements java.lang.Runnable {
    public final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public km1(long r2, a.lm1 r4) {
        /*
            r1 = this;
            a.ty r0 = r4.d
            a.wv.s(r0)
            r1.<init>(r4, r0)
            r1.g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.km1.<init>(long, a.lm1):void");
    }

    @Override // a.f, a.wt0
    public final java.lang.String J() {
        return super.J() + "(timeMillis=" + this.g + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.wv.d0(this.e);
        p(new a.jm1("Timed out waiting for " + this.g + " ms", this));
    }
}
