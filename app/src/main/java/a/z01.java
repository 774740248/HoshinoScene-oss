package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z01 extends a.lj1 implements a.fp0 {
    public a.y01 g;
    public int h;
    public final /* synthetic */ a.b11 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(a.b11 b11Var, a.ey eyVar) {
        super(2, eyVar);
        this.i = b11Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.z01(this.i, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:22:0x0071, B:24:0x0082, B:7:0x0031, B:9:0x0042, B:13:0x004d, B:15:0x0059, B:17:0x005f, B:18:0x0064, B:28:0x008d, B:29:0x0092, B:25:0x0086), top: B:21:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:22:0x0071, B:24:0x0082, B:7:0x0031, B:9:0x0042, B:13:0x004d, B:15:0x0059, B:17:0x005f, B:18:0x0064, B:28:0x008d, B:29:0x0092, B:25:0x0086), top: B:21:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:22:0x0071, B:24:0x0082, B:7:0x0031, B:9:0x0042, B:13:0x004d, B:15:0x0059, B:17:0x005f, B:18:0x0064, B:28:0x008d, B:29:0x0092, B:25:0x0086), top: B:21:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:22:0x0071, B:24:0x0082, B:7:0x0031, B:9:0x0042, B:13:0x004d, B:15:0x0059, B:17:0x005f, B:18:0x0064, B:28:0x008d, B:29:0x0092, B:25:0x0086), top: B:21:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031 A[Catch: Exception -> 0x0029, TRY_ENTER, TryCatch #0 {Exception -> 0x0029, blocks: (B:22:0x0071, B:24:0x0082, B:7:0x0031, B:9:0x0042, B:13:0x004d, B:15:0x0059, B:17:0x005f, B:18:0x0064, B:28:0x008d, B:29:0x0092, B:25:0x0086), top: B:21:0x0071 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0082 -> B:5:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0086 -> B:5:0x0029). Please report as a decompilation issue!!! */
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
            a.kc0 r2 = a.kc0.s
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1e
            if (r1 != r5) goto L16
            a.y01 r1 = r10.g
            a.b20.q1(r11)     // Catch: java.lang.Exception -> L28
            r11 = r10
            goto L71
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            a.y01 r1 = r10.g
            a.b20.q1(r11)     // Catch: java.lang.Exception -> L28
            r11 = r10
            goto L4d
        L25:
            a.b20.q1(r11)
        L28:
            r11 = r10
        L29:
            java.util.ArrayList r1 = a.b11.r
            int r6 = r1.size()
            if (r6 <= 0) goto L93
            a.dc0.a(r2, r3)     // Catch: java.lang.Exception -> L29
            java.lang.Object r1 = a.qv.l2(r1)     // Catch: java.lang.Exception -> L29
            a.y01 r1 = (a.y01) r1     // Catch: java.lang.Exception -> L29
            long r6 = r1.c     // Catch: java.lang.Exception -> L29
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L4d
            r11.g = r1     // Catch: java.lang.Exception -> L29
            r11.h = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = a.wv.Q(r6, r11)     // Catch: java.lang.Exception -> L29
            if (r6 != r0) goto L4d
            return r0
        L4d:
            a.b11 r6 = r11.i     // Catch: java.lang.Exception -> L29
            java.lang.String r7 = r1.b     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = r1.f700a     // Catch: java.lang.Exception -> L29
            a.cp r9 = com.omarea.Scene.c     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = com.omarea.Scene.g     // Catch: java.lang.Exception -> L29
            if (r9 == 0) goto L8d
            boolean r8 = a.wv.e(r8, r9)     // Catch: java.lang.Exception -> L29
            if (r8 != 0) goto L62
            java.lang.String r8 = r1.f700a     // Catch: java.lang.Exception -> L29
            goto L64
        L62:
            java.lang.String r8 = ""
        L64:
            java.lang.String r9 = r1.d     // Catch: java.lang.Exception -> L29
            r11.g = r1     // Catch: java.lang.Exception -> L29
            r11.h = r5     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = a.b11.a(r6, r7, r8, r9, r11)     // Catch: java.lang.Exception -> L29
            if (r6 != r0) goto L71
            return r0
        L71:
            a.dc0.a(r2, r3)     // Catch: java.lang.Exception -> L29
            java.util.ArrayList r6 = a.b11.r     // Catch: java.lang.Exception -> L29
            java.lang.Object r7 = a.qv.l2(r6)     // Catch: java.lang.Exception -> L29
            a.y01 r7 = (a.y01) r7     // Catch: java.lang.Exception -> L29
            boolean r1 = a.wv.e(r7, r1)     // Catch: java.lang.Exception -> L29
            if (r1 == 0) goto L86
            r6.clear()     // Catch: java.lang.Exception -> L29
            goto L29
        L86:
            r6.clear()     // Catch: java.lang.Exception -> L29
            r6.add(r7)     // Catch: java.lang.Exception -> L29
            goto L29
        L8d:
            java.lang.String r1 = "self"
            a.wv.M1(r1)     // Catch: java.lang.Exception -> L29
            throw r3     // Catch: java.lang.Exception -> L29
        L93:
            a.no1 r11 = a.no1.f387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z01.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.z01) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
