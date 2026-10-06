package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qf1 extends a.lj1 implements a.fp0 {
    public int g;
    public int h;
    public final /* synthetic */ long i;
    public final /* synthetic */ a.rf1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(long j, a.rf1 rf1Var, a.ey eyVar) {
        super(2, eyVar);
        this.i = j;
        this.j = rf1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.qf1(this.i, this.j, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:5:0x003f). Please report as a decompilation issue!!! */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r9) {
        /*
            r8 = this;
            a.dz r0 = a.dz.c
            int r1 = r8.h
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            int r1 = r8.g
            a.b20.q1(r9)
            r9 = r8
            goto L3f
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            a.b20.q1(r9)
            r9 = 0
            r1 = r9
            r9 = r8
        L1e:
            r3 = 5
            if (r1 >= r3) goto L41
            a.rf1 r3 = r9.j
            long r4 = r3.b
            long r6 = r9.i
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L41
            boolean r3 = a.rf1.a(r3)
            if (r3 == 0) goto L32
            goto L41
        L32:
            r9.g = r1
            r9.h = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = a.wv.Q(r3, r9)
            if (r3 != r0) goto L3f
            return r0
        L3f:
            int r1 = r1 + r2
            goto L1e
        L41:
            a.no1 r9 = a.no1.f387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qf1.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.qf1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
