package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zg0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.dh0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ java.lang.Runnable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg0(a.dh0 dh0Var, int i, java.lang.Runnable runnable, a.ey eyVar) {
        super(2, eyVar);
        this.h = dh0Var;
        this.i = i;
        this.j = runnable;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zg0(this.h, this.i, this.j, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070 A[RETURN] */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r13) {
        /*
            r12 = this;
            a.dz r0 = a.dz.c
            int r1 = r12.g
            a.no1 r2 = a.no1.f387a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            a.b20.q1(r13)
            goto L70
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            a.b20.q1(r13)
            goto L5b
        L21:
            a.b20.q1(r13)
            goto L50
        L25:
            a.b20.q1(r13)
            a.dh0 r13 = r12.h
            a.xa1 r13 = r13.j
            r12.g = r5
            r13.getClass()
            a.q10 r6 = a.q10.f457a
            java.lang.String r7 = "set-refresh-rate"
            int r13 = r12.i
            java.lang.String r8 = java.lang.String.valueOf(r13)
            java.lang.Long r9 = new java.lang.Long
            r10 = 500(0x1f4, double:2.47E-321)
            r9.<init>(r10)
            r11 = 8
            r10 = r12
            java.lang.Object r13 = a.q10.K(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L4c
            goto L4d
        L4c:
            r13 = r2
        L4d:
            if (r13 != r0) goto L50
            return r0
        L50:
            r12.g = r4
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r13 = a.wv.Q(r4, r12)
            if (r13 != r0) goto L5b
            return r0
        L5b:
            a.u20 r13 = a.z80.f728a
            a.zx0 r13 = a.by0.f57a
            a.yg0 r1 = new a.yg0
            java.lang.Runnable r4 = r12.j
            r5 = 0
            r1.<init>(r4, r5)
            r12.g = r3
            java.lang.Object r13 = a.wv.S1(r13, r1, r12)
            if (r13 != r0) goto L70
            return r0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zg0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.zg0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
