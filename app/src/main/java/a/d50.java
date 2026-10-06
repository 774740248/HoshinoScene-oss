package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.i50 g;
    public final /* synthetic */ java.lang.String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ a.v60 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(a.i50 i50Var, java.lang.String str, boolean z, a.v60 v60Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = i50Var;
        this.h = str;
        this.i = z;
        this.j = v60Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.d50(this.g, this.h, this.i, this.j, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r10) {
        /*
            r9 = this;
            a.b20.q1(r10)
            a.kf1 r10 = new a.kf1
            a.i50 r0 = r9.g
            android.app.Activity r1 = r0.f225a
            r10.<init>(r1)
            java.lang.String r1 = r9.h
            java.lang.String r2 = "key"
            a.wv.w(r1, r2)
            a.lt0 r3 = a.kf1.n()
            a.q10 r4 = a.q10.f457a
            java.lang.String r4 = a.q10.n()
            if (r3 == 0) goto L77
            java.lang.String r5 = a.tg1.i()
            java.lang.String r6 = "/release-exchange"
            java.lang.String r5 = r5.concat(r6)
            a.lt0 r6 = new a.lt0
            r6.<init>()
            java.util.Locale r7 = r10.p()
            if (r7 == 0) goto L3d
            java.lang.String r8 = "locale"
            java.lang.String r7 = r7.getLanguage()
            r6.m(r7, r8)
        L3d:
            r6.m(r1, r2)
            java.lang.String r1 = "confirm"
            boolean r2 = r9.i
            r6.o(r1, r2)
            java.lang.String r1 = "device_info"
            r6.m(r3, r1)
            if (r4 == 0) goto L53
            java.lang.String r1 = "scene_version"
            r6.m(r4, r1)
        L53:
            a.lt0 r10 = a.qr0.h(r10, r5, r6)
            if (r10 == 0) goto L77
            com.omarea.model.ExchangeResponse r1 = new com.omarea.model.ExchangeResponse     // Catch: java.lang.Exception -> L77
            r1.<init>()     // Catch: java.lang.Exception -> L77
            java.lang.Class<com.omarea.model.ExchangeResponse> r1 = com.omarea.model.ExchangeResponse.class
            java.lang.Object r1 = a.qm1.f(r10, r1)     // Catch: java.lang.Exception -> L77
            r2 = r1
            com.omarea.model.ExchangeResponse r2 = (com.omarea.model.ExchangeResponse) r2     // Catch: java.lang.Exception -> L77
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L77
            java.lang.String r3 = "response.toString()"
            a.wv.v(r10, r3)     // Catch: java.lang.Exception -> L77
            r2.setDetail(r10)     // Catch: java.lang.Exception -> L77
            com.omarea.model.ExchangeResponse r1 = (com.omarea.model.ExchangeResponse) r1     // Catch: java.lang.Exception -> L77
        L75:
            r6 = r1
            goto L79
        L77:
            r1 = 0
            goto L75
        L79:
            r10 = 0
            r0.e(r10)
            if (r6 == 0) goto L92
            a.cp r10 = com.omarea.Scene.c
            a.i50 r3 = r9.g
            a.v60 r4 = r9.j
            java.lang.String r5 = r9.h
            a.u1 r10 = new a.u1
            r7 = 5
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            a.fs1.L(r10)
            goto La7
        L92:
            a.cp r0 = com.omarea.Scene.c
            android.app.Application r0 = a.fs1.t()
            r1 = 2131952790(0x7f130496, float:1.9542033E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "Scene.context.getString(…ring.license_no_response)"
            a.wv.v(r0, r1)
            a.fs1.X(r0, r10)
        La7:
            a.no1 r10 = a.no1.f387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d50.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.d50 d50Var = (a.d50) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        d50Var.e(no1Var);
        return no1Var;
    }
}
