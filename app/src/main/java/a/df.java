package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class df extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.hw g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(a.hw hwVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = hwVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.df(this.g, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (a.wv.e(a.pe0.g(r3, "toolkit/busybox", "busybox", r10), r2) == false) goto L32;
     */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.df.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.df dfVar = (a.df) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        dfVar.e(no1Var);
        return no1Var;
    }
}
