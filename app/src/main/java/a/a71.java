package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a71 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.procs.ProcessGroupView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(com.omarea.ui.procs.ProcessGroupView processGroupView, a.ey eyVar) {
        super(2, eyVar);
        this.h = processGroupView;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.a71(this.h, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r6 == r0) goto L14;
     */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r6) {
        /*
            r5 = this;
            a.dz r0 = a.dz.c
            int r1 = r5.g
            a.no1 r2 = a.no1.f387a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            a.b20.q1(r6)
            goto L44
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            a.b20.q1(r6)
            r5.g = r3
            int r6 = com.omarea.ui.procs.ProcessGroupView.t
            com.omarea.ui.procs.ProcessGroupView r6 = r5.h
            android.content.Context r1 = r6.getContext()
            java.lang.String r3 = "context"
            a.wv.v(r1, r3)
            boolean r1 = a.wv.I1(r1)
            if (r1 == 0) goto L40
            a.u20 r1 = a.z80.f728a
            a.zx0 r1 = a.by0.f57a
            a.f71 r3 = new a.f71
            r4 = 0
            r3.<init>(r6, r4)
            java.lang.Object r6 = a.wv.S1(r1, r3, r5)
            if (r6 != r0) goto L40
            goto L41
        L40:
            r6 = r2
        L41:
            if (r6 != r0) goto L44
            return r0
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a71.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.a71) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
