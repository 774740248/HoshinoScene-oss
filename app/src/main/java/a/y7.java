package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class y7 extends a.lj1 implements a.fp0 {
    public a.rd0 g;
    public int h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFastShare i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.ey eyVar) {
        super(2, eyVar);
        this.i = activityFastShare;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.y7(this.i, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0085 -> B:16:0x003d). Please report as a decompilation issue!!! */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r11) {
        /*
            r10 = this;
            a.dz r0 = a.dz.c
            int r1 = r10.h
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L13
            if (r1 == r5) goto L28
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
        L13:
            a.b20.q1(r11)
            goto L3c
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            a.rd0 r1 = r10.g
            a.b20.q1(r11)
            r11 = r1
            r1 = r0
            r0 = r10
            goto L6a
        L28:
            a.b20.q1(r11)
            r1 = r0
            r0 = r10
            goto L4c
        L2e:
            a.b20.q1(r11)
            r10.h = r6
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r11 = a.wv.Q(r6, r10)
            if (r11 != r0) goto L3c
            return r0
        L3c:
            r11 = r10
        L3d:
            a.gy r1 = a.gy.e
            r11.h = r5
            java.lang.Object r1 = r1.B(r11)
            if (r1 != r0) goto L48
            return r0
        L48:
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L4c:
            a.rd0 r11 = (a.rd0) r11
            if (r11 == 0) goto L78
            com.omarea.vtools.activities.ActivityFastShare r6 = r0.i
            a.w60 r7 = r6.N
            if (r7 == 0) goto L6a
            a.u20 r7 = a.z80.f728a
            a.zx0 r7 = a.by0.f57a
            a.x7 r8 = new a.x7
            r8.<init>(r6, r2)
            r0.g = r11
            r0.h = r4
            java.lang.Object r6 = a.wv.S1(r7, r8, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            a.cp r6 = com.omarea.Scene.c
            a.so r6 = new a.so
            r7 = 22
            com.omarea.vtools.activities.ActivityFastShare r8 = r0.i
            r6.<init>(r8, r7, r11)
            a.fs1.L(r6)
        L78:
            r0.g = r2
            r0.h = r3
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = a.wv.Q(r6, r0)
            if (r11 != r1) goto L85
            return r1
        L85:
            r11 = r0
            r0 = r1
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y7.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.y7) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
