package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n7 extends a.lj1 implements a.fp0 {
    public java.lang.Throwable g;
    public int h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.ey eyVar) {
        super(2, eyVar);
        this.i = activityFastShare;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.n7(this.i, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r12) {
        /*
            r11 = this;
            a.dz r0 = a.dz.c
            int r1 = r11.h
            a.gy r2 = a.gy.e
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            com.omarea.vtools.activities.ActivityFastShare r9 = r11.i
            if (r1 == 0) goto L3c
            if (r1 == r8) goto L36
            if (r1 == r7) goto L32
            if (r1 == r6) goto L2e
            if (r1 == r5) goto L28
            if (r1 == r4) goto L22
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            java.lang.Throwable r0 = r11.g
            a.b20.q1(r12)
            goto L8d
        L28:
            java.lang.Throwable r1 = r11.g
            a.b20.q1(r12)
            goto L76
        L2e:
            a.b20.q1(r12)
            goto L65
        L32:
            a.b20.q1(r12)
            goto L51
        L36:
            a.b20.q1(r12)     // Catch: java.lang.Throwable -> L3a
            goto L48
        L3a:
            r12 = move-exception
            goto L68
        L3c:
            a.b20.q1(r12)
            r11.h = r8     // Catch: java.lang.Throwable -> L3a
            a.rd0 r12 = com.omarea.vtools.activities.ActivityFastShare.q(r9, r11)     // Catch: java.lang.Throwable -> L3a
            if (r12 != r0) goto L48
            return r0
        L48:
            r11.h = r7
            a.rd0 r12 = r2.B(r11)
            if (r12 != r0) goto L51
            return r0
        L51:
            a.rd0 r12 = (a.rd0) r12
            a.u20 r1 = a.z80.f728a
            a.zx0 r1 = a.by0.f57a
            a.m7 r2 = new a.m7
            r2.<init>(r9, r12, r3)
            r11.h = r6
            a.rd0 r12 = a.wv.S1(r1, r2, r11)
            if (r12 != r0) goto L65
            return r0
        L65:
            a.no1 r12 = a.no1.f387a
            return r12
        L68:
            r11.g = r12
            r11.h = r5
            java.lang.Object r1 = r2.B(r11)
            if (r1 != r0) goto L73
            return r0
        L73:
            r10 = r1
            r1 = r12
            r12 = r10
        L76:
            a.rd0 r12 = (a.rd0) r12
            a.u20 r2 = a.z80.f728a
            a.zx0 r2 = a.by0.f57a
            a.m7 r5 = new a.m7
            r5.<init>(r9, r12, r3)
            r11.g = r1
            r11.h = r4
            a.rd0 r12 = a.wv.S1(r2, r5, r11)
            if (r12 != r0) goto L8c
            return r0
        L8c:
            r0 = r1
        L8d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n7.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.n7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
