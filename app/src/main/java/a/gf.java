package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gf extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityStartSplash h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(com.omarea.vtools.activities.ActivityStartSplash activityStartSplash, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityStartSplash;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.gf(this.h, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Type inference failed for: r11v8, types: [a.ka1, java.lang.Object, java.io.Serializable] */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r11) {
        /*
            r10 = this;
            a.dz r0 = a.dz.c
            int r1 = r10.g
            r2 = 3
            r3 = 0
            r4 = 1
            java.lang.String r5 = "adb"
            r6 = 2
            com.omarea.vtools.activities.ActivityStartSplash r7 = r10.h
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r6) goto L21
            if (r1 != r2) goto L19
            a.b20.q1(r11)
            goto Ldb
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            a.b20.q1(r11)
            goto Lb8
        L26:
            a.b20.q1(r11)
            goto L48
        L2a:
            a.b20.q1(r11)
            a.q10 r11 = a.q10.f457a
            java.lang.String r1 = a.q10.t()
            boolean r1 = a.wv.e(r1, r5)
            if (r1 == 0) goto L3f
            boolean r1 = a.q10.r()
            if (r1 != 0) goto L50
        L3f:
            r10.g = r4
            java.lang.Boolean r11 = r11.H(r5, r10)
            if (r11 != r0) goto L48
            return r0
        L48:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L5a
        L50:
            a.hw r11 = new a.hw
            r11.<init>(r7)
            r11.run()
            goto Ldb
        L5a:
            a.fa0 r11 = com.omarea.vtools.activities.ActivityStartSplash.q
            r7.getClass()
            a.ka1 r11 = new a.ka1
            r11.<init>()
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: java.lang.Exception -> Lad
            java.lang.String r4 = "moe.shizuku.privileged.api"
            r8 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r8)     // Catch: java.lang.Exception -> Lad
            int r1 = r1.versionCode     // Catch: java.lang.Exception -> Lad
            r11.c = r1     // Catch: java.lang.Exception -> Lad
            java.lang.String r1 = "sh"
            java.lang.Process r1 = a.wv.l0(r1)
            java.util.concurrent.FutureTask r4 = new java.util.concurrent.FutureTask
            a.or0 r8 = new a.or0
            r8.<init>(r7, r11, r1, r6)
            r4.<init>(r8)
            a.k20 r11 = a.z80.b
            a.ay r8 = a.wv.b(r11)
            a.qf r9 = new a.qf
            r9.<init>(r4, r3)
            a.wv.M0(r8, r3, r9, r2)
            a.ay r11 = a.wv.b(r11)
            a.rf r8 = new a.rf
            r8.<init>(r4, r3)
            a.wv.M0(r11, r3, r8, r2)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> La8
            r8 = 7
            r4.get(r8, r11)     // Catch: java.lang.Exception -> La4 java.lang.Throwable -> La8
        La4:
            r1.destroy()
            goto Lad
        La8:
            r11 = move-exception
            r1.destroy()
            throw r11
        Lad:
            a.q10 r11 = a.q10.f457a
            r10.g = r6
            java.lang.Boolean r11 = r11.H(r5, r10)
            if (r11 != r0) goto Lb8
            return r0
        Lb8:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lc9
            a.hw r11 = new a.hw
            r11.<init>(r7)
            r11.run()
            goto Ldb
        Lc9:
            a.u20 r11 = a.z80.f728a
            a.zx0 r11 = a.by0.f57a
            a.ff r1 = new a.ff
            r1.<init>(r7, r3)
            r10.g = r2
            java.lang.Boolean r11 = a.wv.S1(r11, r1, r10)
            if (r11 != r0) goto Ldb
            return r0
        Ldb:
            a.no1 r11 = a.no1.f387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gf.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.gf) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
