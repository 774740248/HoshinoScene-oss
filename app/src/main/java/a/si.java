package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class si extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.io.File h;
    public final /* synthetic */ a.ti i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(java.io.File file, a.ti tiVar, a.ey eyVar) {
        super(2, eyVar);
        this.h = file;
        this.i = tiVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.si(this.h, this.i, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r4.m.length() > r5.length()) goto L21;
     */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r8) {
        /*
            r7 = this;
            a.dz r0 = a.dz.c
            int r1 = r7.g
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            a.b20.q1(r8)
            goto L96
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            a.b20.q1(r8)
            java.io.File r8 = r7.h
            java.io.File r1 = r8.getParentFile()
            r3 = 0
            a.ti r4 = r7.i
            if (r1 == 0) goto L57
            java.lang.String r5 = r1.getAbsolutePath()
            boolean r6 = r1.exists()
            if (r6 == 0) goto L53
            boolean r1 = r1.canRead()
            if (r1 == 0) goto L53
            boolean r1 = r4.n
            if (r1 != 0) goto L51
            java.lang.String r1 = r4.m
            java.lang.String r6 = "parentPath"
            a.wv.v(r5, r6)
            boolean r1 = a.yi1.B2(r1, r5)
            if (r1 == 0) goto L51
            java.lang.String r1 = r4.m
            int r1 = r1.length()
            int r5 = r5.length()
            if (r1 > r5) goto L53
        L51:
            r1 = r2
            goto L54
        L53:
            r1 = r3
        L54:
            r4.l = r1
            goto L59
        L57:
            r4.l = r3
        L59:
            boolean r1 = r8.exists()
            if (r1 == 0) goto L81
            boolean r1 = r8.canRead()
            if (r1 == 0) goto L81
            a.pi r1 = new a.pi
            r1.<init>()
            java.io.File[] r1 = r8.listFiles(r1)
            if (r1 == 0) goto L7f
            a.py r5 = new a.py
            r6 = 11
            r5.<init>(r6)
            a.ri r6 = new a.ri
            r6.<init>(r5, r3)
            a.op.U1(r1, r6)
        L7f:
            r4.f = r1
        L81:
            r4.h = r8
            a.u20 r8 = a.z80.f728a
            a.zx0 r8 = a.by0.f57a
            a.qi r1 = new a.qi
            r3 = 0
            r1.<init>(r4, r3)
            r7.g = r2
            java.lang.Object r8 = a.wv.S1(r8, r1, r7)
            if (r8 != r0) goto L96
            return r0
        L96:
            a.no1 r8 = a.no1.f387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.si.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.si) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
