package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class cf1 implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69a;
    public final /* synthetic */ a.qr0 b;

    public /* synthetic */ cf1(a.qr0 qr0Var, int i) {
        this.f69a = i;
        this.b = qr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r9 = this;
            int r0 = r9.f69a
            java.lang.String r1 = "Scene"
            java.lang.String r2 = "device_info"
            java.lang.String r3 = "locale"
            r4 = 0
            java.lang.String r5 = ""
            java.lang.String r6 = "this$0"
            a.qr0 r7 = r9.b
            switch(r0) {
                case 0: goto Lec;
                case 1: goto La6;
                case 2: goto L60;
                default: goto L12;
            }
        L12:
            a.be1 r7 = (a.be1) r7
            a.wv.w(r7, r6)
            java.lang.String r0 = a.tg1.i()
            java.lang.String r1 = "/scene-magisk-modules"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r0 = r7.k(r0, r5)
            int r1 = r0.length()
            if (r1 <= 0) goto L5f
            int r1 = r0.length()     // Catch: java.lang.Exception -> L37
            if (r1 <= 0) goto L37
            a.jt0 r1 = new a.jt0     // Catch: java.lang.Exception -> L37
            r1.<init>(r0)     // Catch: java.lang.Exception -> L37
            goto L38
        L37:
            r1 = r4
        L38:
            r0 = 0
            if (r1 == 0) goto L42
            java.util.List r2 = r1.f269a
            int r2 = r2.size()
            goto L43
        L42:
            r2 = r0
        L43:
            if (r2 <= 0) goto L5f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L4a:
            if (r0 >= r2) goto L5f
            a.wv.s(r1)
            a.lt0 r3 = r1.c(r0)
            com.omarea.model.MagiskModuleUnofficial r3 = a.be1.q(r3)
            if (r3 == 0) goto L5c
            r4.add(r3)
        L5c:
            int r0 = r0 + 1
            goto L4a
        L5f:
            return r4
        L60:
            a.kf1 r7 = (a.kf1) r7
            java.lang.String r0 = "/payment-alipay"
            a.wv.w(r7, r6)
            a.lt0 r6 = a.kf1.n()
            if (r6 == 0) goto La4
            java.lang.String r5 = a.tg1.i()     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r5.concat(r0)     // Catch: java.lang.Exception -> L9e
            a.lt0 r5 = new a.lt0     // Catch: java.lang.Exception -> L9e
            r5.<init>()     // Catch: java.lang.Exception -> L9e
            java.util.Locale r8 = r7.p()     // Catch: java.lang.Exception -> L9e
            if (r8 == 0) goto L87
            java.lang.String r8 = r8.getLanguage()     // Catch: java.lang.Exception -> L9e
            r5.m(r8, r3)     // Catch: java.lang.Exception -> L9e
        L87:
            r5.m(r6, r2)     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r7.g(r5, r0)     // Catch: java.lang.Exception -> L9e
            java.lang.CharSequence r0 = a.yi1.F2(r0)     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L9e
            int r1 = r0.length()     // Catch: java.lang.Exception -> L9e
            if (r1 <= 0) goto La5
            r4 = r0
            goto La5
        L9e:
            java.lang.String r0 = "Cloud Request(alipay), Fail!"
            android.util.Log.e(r1, r0)
            goto La5
        La4:
            r4 = r5
        La5:
            return r4
        La6:
            a.kf1 r7 = (a.kf1) r7
            java.lang.String r0 = "/payment-wechat"
            a.wv.w(r7, r6)
            a.lt0 r6 = a.kf1.n()
            if (r6 == 0) goto Lea
            java.lang.String r5 = a.tg1.i()     // Catch: java.lang.Exception -> Le4
            java.lang.String r0 = r5.concat(r0)     // Catch: java.lang.Exception -> Le4
            a.lt0 r5 = new a.lt0     // Catch: java.lang.Exception -> Le4
            r5.<init>()     // Catch: java.lang.Exception -> Le4
            java.util.Locale r8 = r7.p()     // Catch: java.lang.Exception -> Le4
            if (r8 == 0) goto Lcd
            java.lang.String r8 = r8.getLanguage()     // Catch: java.lang.Exception -> Le4
            r5.m(r8, r3)     // Catch: java.lang.Exception -> Le4
        Lcd:
            r5.m(r6, r2)     // Catch: java.lang.Exception -> Le4
            java.lang.String r0 = r7.g(r5, r0)     // Catch: java.lang.Exception -> Le4
            java.lang.CharSequence r0 = a.yi1.F2(r0)     // Catch: java.lang.Exception -> Le4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Le4
            int r1 = r0.length()     // Catch: java.lang.Exception -> Le4
            if (r1 <= 0) goto Leb
            r4 = r0
            goto Leb
        Le4:
            java.lang.String r0 = "Cloud Request(wechat), Fail!"
            android.util.Log.e(r1, r0)
            goto Leb
        Lea:
            r4 = r5
        Leb:
            return r4
        Lec:
            a.kf1 r7 = (a.kf1) r7
            a.wv.w(r7, r6)
            java.lang.String r0 = a.tg1.i()
            java.lang.String r1 = "/scene-announcement"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r0 = r7.k(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cf1.call():java.lang.Object");
    }
}
