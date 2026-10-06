package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pg0 extends a.lj1 implements a.fp0 {
    public int g;
    public /* synthetic */ java.lang.Object h;
    public final /* synthetic */ a.rg0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(a.rg0 rg0Var, a.ey eyVar) {
        super(2, eyVar);
        this.i = rg0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.pg0 pg0Var = new a.pg0(this.i, eyVar);
        pg0Var.h = obj;
        return pg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004e -> B:7:0x002f). Please report as a decompilation issue!!! */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r7) {
        /*
            r6 = this;
            a.dz r0 = a.dz.c
            int r1 = r6.g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            a.cz r1 = r6.h
            a.cz r1 = (a.cz) r1
            a.b20.q1(r7)
            r7 = r1
            goto L2e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            a.cz r1 = r6.h
            a.cz r1 = (a.cz) r1
            a.b20.q1(r7)
            r7 = r1
            r1 = r6
            goto L42
        L27:
            a.b20.q1(r7)
            java.lang.Object r7 = r6.h
            a.cz r7 = (a.cz) r7
        L2e:
            r1 = r6
        L2f:
            boolean r4 = a.wv.D0(r7)
            if (r4 == 0) goto L51
            r1.h = r7
            r1.g = r3
            a.rg0 r4 = r1.i
            java.lang.Object r4 = a.rg0.a(r4, r1)
            if (r4 != r0) goto L42
            return r0
        L42:
            a.rg0 r4 = r1.i
            long r4 = r4.o
            r1.h = r7
            r1.g = r2
            java.lang.Object r4 = a.wv.Q(r4, r1)
            if (r4 != r0) goto L2f
            return r0
        L51:
            a.no1 r7 = a.no1.f387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pg0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.pg0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
