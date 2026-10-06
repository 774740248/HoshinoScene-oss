package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b6 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeStat h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.omarea.vtools.activities.ActivityChargeStat activityChargeStat, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityChargeStat;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.b6(this.h, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (a.mr.a() != false) goto L16;
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
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            a.b20.q1(r6)
            goto L56
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            a.b20.q1(r6)
            a.q10 r6 = a.q10.f457a
            java.lang.String r6 = a.q10.t()
            java.lang.String r1 = "root"
            boolean r6 = a.wv.e(r6, r1)
            if (r6 == 0) goto L56
            com.omarea.vtools.activities.ActivityChargeStat r6 = r5.h
            a.mr r1 = r6.s
            boolean r1 = r1.f()
            if (r1 != 0) goto L43
            a.mr r1 = r6.s
            boolean r1 = r1.e()
            if (r1 != 0) goto L43
            a.mr r1 = r6.s
            r1.getClass()
            boolean r1 = a.mr.a()
            if (r1 == 0) goto L56
        L43:
            a.u20 r1 = a.z80.f728a
            a.zx0 r1 = a.by0.f57a
            a.a6 r3 = new a.a6
            r4 = 0
            r3.<init>(r6, r4)
            r5.g = r2
            java.lang.Object r6 = a.wv.S1(r1, r3, r5)
            if (r6 != r0) goto L56
            return r0
        L56:
            a.no1 r6 = a.no1.f387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b6.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.b6) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
