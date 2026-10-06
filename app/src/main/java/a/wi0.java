package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class wi0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.ux0 f664a = new a.ux0(16);
    public static final java.util.concurrent.ThreadPoolExecutor b;
    public static final java.lang.Object c;
    public static final a.rh1 d;

    /* JADX WARN: Type inference failed for: r9v0, types: [a.hb1, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        a.hb1 obj = new a.hb1();
        obj.f202a = "fonts-androidx";
        obj.b = 10;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), (java.util.concurrent.ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new a.hb1();
        d = new a.rh1();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.vi0 a(java.lang.String r7, android.content.Context r8, a.ol r9, int r10) {
        /*
            a.ux0 r0 = a.wi0.f664a
            java.lang.Object r1 = r0.a(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            a.vi0 r7 = new a.vi0
            r7.<init>(r1)
            return r7
        L10:
            a.tk r9 = a.b20.a0(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            int r1 = r9.d
            r2 = 1
            r3 = -3
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1e
        L1c:
            r2 = r3
            goto L3e
        L1e:
            r2 = -2
            goto L3e
        L20:
            java.lang.Object r1 = r9.e
            a.cj0[] r1 = (a.cj0[]) r1
            if (r1 == 0) goto L3e
            int r4 = r1.length
            if (r4 != 0) goto L2a
            goto L3e
        L2a:
            int r2 = r1.length
            r4 = 0
            r5 = r4
        L2d:
            if (r5 >= r2) goto L3d
            r6 = r1[r5]
            int r6 = r6.e
            if (r6 == 0) goto L3a
            if (r6 >= 0) goto L38
            goto L1c
        L38:
            r2 = r6
            goto L3e
        L3a:
            int r5 = r5 + 1
            goto L2d
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto L46
            a.vi0 r7 = new a.vi0
            r7.<init>(r2)
            return r7
        L46:
            java.lang.Object r9 = r9.e
            a.cj0[] r9 = (a.cj0[]) r9
            a.vu0 r1 = a.do1.f102a
            android.graphics.Typeface r8 = r1.w(r8, r9, r10)
            if (r8 == 0) goto L5b
            r0.b(r7, r8)
            a.vi0 r7 = new a.vi0
            r7.<init>(r8)
            return r7
        L5b:
            a.vi0 r7 = new a.vi0
            r7.<init>(r3)
            return r7
        L61:
            a.vi0 r7 = new a.vi0
            r8 = -1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wi0.a(java.lang.String, android.content.Context, a.ol, int):a.vi0");
    }
}
