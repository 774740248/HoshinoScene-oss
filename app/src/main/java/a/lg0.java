package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lg0 extends a.lj1 implements a.fp0 {
    public int g;
    public /* synthetic */ java.lang.Object h;
    public final /* synthetic */ com.omarea.ui.fw.FloatMonitorRender i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg0(com.omarea.ui.fw.FloatMonitorRender floatMonitorRender, long j, a.ey eyVar) {
        super(2, eyVar);
        this.i = floatMonitorRender;
        this.j = j;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.lg0 lg0Var = new a.lg0(this.i, this.j, eyVar);
        lg0Var.h = obj;
        return lg0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:7:0x002e). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            a.cz r1 = r6.h
            a.cz r1 = (a.cz) r1
            a.b20.q1(r7)
            goto L2d
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            a.cz r1 = r6.h
            a.cz r1 = (a.cz) r1
            a.b20.q1(r7)     // Catch: java.lang.Exception -> L23
        L23:
            r7 = r6
            goto L41
        L25:
            a.b20.q1(r7)
            java.lang.Object r7 = r6.h
            a.cz r7 = (a.cz) r7
            r1 = r7
        L2d:
            r7 = r6
        L2e:
            boolean r4 = a.wv.D0(r1)
            if (r4 == 0) goto L4e
            com.omarea.ui.fw.FloatMonitorRender r4 = r7.i     // Catch: java.lang.Exception -> L41
            r7.h = r1     // Catch: java.lang.Exception -> L41
            r7.g = r3     // Catch: java.lang.Exception -> L41
            java.lang.Object r4 = com.omarea.ui.fw.FloatMonitorRender.c(r4, r7)     // Catch: java.lang.Exception -> L41
            if (r4 != r0) goto L41
            return r0
        L41:
            r7.h = r1
            r7.g = r2
            long r4 = r7.j
            java.lang.Object r4 = a.wv.Q(r4, r7)
            if (r4 != r0) goto L2e
            return r0
        L4e:
            a.no1 r7 = a.no1.f387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lg0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.lg0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
