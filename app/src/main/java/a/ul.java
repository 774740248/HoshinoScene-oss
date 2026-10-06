package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ul implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.content.Context d;

    public /* synthetic */ ul(android.content.Context context, int i) {
        this.c = i;
        this.d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.c
            android.content.Context r1 = r11.d
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L14;
                default: goto L7;
            }
        L7:
            a.dp r0 = new a.dp
            r2 = 5
            r0.<init>(r2)
            a.fa0 r2 = a.b20.m
            r3 = 0
            a.b20.E1(r1, r0, r2, r3)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r5 = 0
            r6 = 1
            r7 = 0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            a.ul r2 = new a.ul
            r3 = 2
            r2.<init>(r1, r3)
            r0.execute(r2)
            return
        L2f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            r3 = 1
            if (r0 < r2) goto Lb1
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r2 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r2)
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            int r2 = r2.getComponentEnabledSetting(r0)
            if (r2 == r3) goto Lb1
            boolean r2 = a.es.a()
            java.lang.String r4 = "locale"
            if (r2 == 0) goto L86
            a.np r2 = a.xl.i
            java.util.Iterator r2 = r2.iterator()
        L55:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L74
            java.lang.Object r5 = r2.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            a.xl r5 = (a.xl) r5
            if (r5 == 0) goto L55
            a.km r5 = (a.km) r5
            android.content.Context r5 = r5.m
            if (r5 == 0) goto L55
            java.lang.Object r2 = r5.getSystemService(r4)
            goto L75
        L74:
            r2 = 0
        L75:
            if (r2 == 0) goto L8b
            android.os.LocaleList r2 = a.wl.a(r2)
            a.hx0 r5 = new a.hx0
            a.jx0 r6 = new a.jx0
            r6.<init>(r2)
            r5.<init>(r6)
            goto L8d
        L86:
            a.hx0 r5 = a.xl.e
            if (r5 == 0) goto L8b
            goto L8d
        L8b:
            a.hx0 r5 = a.hx0.b
        L8d:
            a.ix0 r2 = r5.f221a
            a.jx0 r2 = (a.jx0) r2
            android.os.LocaleList r2 = r2.f274a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Laa
            java.lang.String r2 = a.b20.Z0(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto Laa
            android.os.LocaleList r2 = a.vl.a(r2)
            a.wl.b(r4, r2)
        Laa:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r3, r3)
        Lb1:
            a.xl.h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ul.run():void");
    }
}
