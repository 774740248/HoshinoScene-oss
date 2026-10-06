package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m10 extends a.lj1 implements a.fp0 {
    public int g;
    public int h;

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r7) {
        /*
            r6 = this;
            a.dz r0 = a.dz.c
            int r1 = r6.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            int r1 = r6.g
            a.b20.q1(r7)
            r7 = r6
            goto L39
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            a.b20.q1(r7)
            r7 = r6
            r1 = r3
        L1e:
            r4 = 10
            if (r1 >= r4) goto L3b
            a.q10 r4 = a.q10.f457a
            r4 = 0
            boolean r4 = a.q10.T(r4)
            if (r4 != 0) goto L3b
            r7.g = r1
            r7.h = r2
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r4 = a.wv.Q(r4, r7)
            if (r4 != r0) goto L39
            return r0
        L39:
            int r1 = r1 + r2
            goto L1e
        L3b:
            a.q10.x = r2
            a.q10.w = r3
            java.lang.String r7 = a.q10.l
            java.lang.String r0 = "root"
            boolean r7 = a.wv.e(r7, r0)
            if (r7 == 0) goto L4e
            a.q10 r7 = a.q10.f457a
            r7.O(r3)
        L4e:
            a.no1 r7 = a.no1.f387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m10.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.m10) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
