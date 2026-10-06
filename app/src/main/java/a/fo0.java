package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fo0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.jo0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo0(a.jo0 jo0Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = jo0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.fo0(this.h, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
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
            r2 = 0
            a.jo0 r3 = r7.h
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L26
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            a.b20.q1(r8)
            goto L58
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            a.b20.q1(r8)
            goto L46
        L22:
            a.b20.q1(r8)
            goto L3b
        L26:
            a.b20.q1(r8)
            a.a3 r8 = new a.a3
            a.kk0 r1 = r3.K()
            r8.<init>(r1)
            r7.g = r6
            java.lang.Object r8 = r8.a(r2, r7)
            if (r8 != r0) goto L3b
            return r0
        L3b:
            r7.g = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = a.wv.Q(r5, r7)
            if (r8 != r0) goto L46
            return r0
        L46:
            a.u20 r8 = a.z80.f728a
            a.zx0 r8 = a.by0.f57a
            a.eo0 r1 = new a.eo0
            r1.<init>(r3, r2)
            r7.g = r4
            java.lang.Object r8 = a.wv.S1(r8, r1, r7)
            if (r8 != r0) goto L58
            return r0
        L58:
            a.no1 r8 = a.no1.f387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fo0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.fo0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
