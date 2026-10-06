package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ko extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.String g;
    public final /* synthetic */ a.mo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(a.mo moVar, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = str;
        this.h = moVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ko(this.h, this.g, eyVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:2|3)|(8:5|(1:7)|8|9|10|(1:17)|14|15)|22|8|9|10|(1:12)|17|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r5 = r0.I1(r1);
     */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r5) {
        /*
            r4 = this;
            a.mo r0 = r4.h
            java.lang.String r1 = r4.g
            a.b20.q1(r5)
            android.content.pm.PackageManager r5 = r0.J1()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r2 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            android.content.pm.ApplicationInfo r2 = r5.applicationInfo     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r2 == 0) goto L23
            android.content.pm.PackageManager r3 = r0.J1()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            java.lang.CharSequence r2 = r2.loadLabel(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r2 != 0) goto L24
            goto L23
        L1f:
            r5 = move-exception
            goto L43
        L21:
            r2 = r1
            goto L44
        L23:
            r2 = r1
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r3.<init>()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r3.append(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L44
            if (r5 == 0) goto L3e
            android.content.pm.PackageManager r3 = r0.J1()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L44
            android.graphics.drawable.Drawable r5 = r5.loadIcon(r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L44
            if (r5 != 0) goto L48
        L3e:
            android.graphics.drawable.Drawable r5 = r0.I1(r1)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L44
            goto L48
        L43:
            throw r5
        L44:
            android.graphics.drawable.Drawable r5 = r0.I1(r1)
        L48:
            a.io r0 = new a.io
            r0.<init>(r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ko.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ko) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
