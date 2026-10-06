package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class an0 extends a.lj1 implements a.fp0 {
    public boolean g;
    public int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ a.bn0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(boolean z, a.bn0 bn0Var, a.ey eyVar) {
        super(2, eyVar);
        this.i = z;
        this.j = bn0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.an0(this.i, this.j, eyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (a.b11.d() == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r8) {
        /*
            r7 = this;
            a.dz r0 = a.dz.c
            int r1 = r7.h
            a.bn0 r2 = r7.j
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            a.b20.q1(r8)
            goto L65
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            boolean r1 = r7.g
            a.b20.q1(r8)
            goto L3d
        L20:
            a.b20.q1(r8)
            a.en1 r8 = new a.en1
            r8.<init>()
            boolean r1 = r8.d()
            boolean r8 = r7.i
            if (r8 == 0) goto L51
            a.q10 r8 = a.q10.f457a
            r7.g = r1
            r7.h = r4
            java.lang.Object r8 = r8.x(r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L51
            a.b11 r8 = r2.u0
            r8.getClass()
            boolean r8 = a.b11.d()
            if (r8 != 0) goto L51
            goto L52
        L51:
            r4 = 0
        L52:
            a.u20 r8 = a.z80.f728a
            a.zx0 r8 = a.by0.f57a
            a.zm0 r5 = new a.zm0
            r6 = 0
            r5.<init>(r2, r1, r4, r6)
            r7.h = r3
            java.lang.Object r8 = a.wv.S1(r8, r5, r7)
            if (r8 != r0) goto L65
            return r0
        L65:
            a.no1 r8 = a.no1.f387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.an0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.an0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
