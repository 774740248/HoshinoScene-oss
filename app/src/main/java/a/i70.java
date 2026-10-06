package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i70 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.j70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i70(a.j70 j70Var, a.ey eyVar) {
        super(2, eyVar);
        this.h = j70Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.i70(this.h, eyVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            a.b20.q1(r6)
            r6 = r5
            goto L37
        Le:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L16:
            a.b20.q1(r6)
            r6 = r5
        L1a:
            a.j70 r1 = r6.h
            boolean r3 = r1.l
            if (r3 != 0) goto L2c
            java.lang.StringBuffer r1 = r1.j
            int r1 = r1.length()
            if (r1 <= 0) goto L29
            goto L2c
        L29:
            a.no1 r6 = a.no1.f387a
            return r6
        L2c:
            r6.g = r2
            r3 = 16
            java.lang.Object r1 = a.wv.Q(r3, r6)
            if (r1 != r0) goto L37
            return r0
        L37:
            int r1 = a.j70.m
            a.j70 r1 = r6.h
            r1.a()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i70.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.i70) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
