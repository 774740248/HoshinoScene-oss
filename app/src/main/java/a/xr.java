package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xr extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr(java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.h = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.xr(this.h, eyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
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
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            a.b20.q1(r6)
            goto L25
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            a.b20.q1(r6)
            a.me1 r6 = a.me1.p
            if (r6 == 0) goto L28
            r5.g = r2
            java.io.Serializable r6 = r6.f(r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            java.util.List r6 = (java.util.List) r6
            goto L29
        L28:
            r6 = 0
        L29:
            a.cp r0 = com.omarea.Scene.c
            android.content.SharedPreferences r0 = a.fs1.D()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L36
            goto L37
        L36:
            r2 = 0
        L37:
            java.lang.String r1 = "freeze_suspend"
            boolean r0 = r0.getBoolean(r1, r2)
            java.util.ArrayList r1 = r5.h
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == 0) goto L57
            boolean r3 = r6.contains(r2)
            if (r3 != 0) goto L43
        L57:
            java.lang.String r3 = "item"
            if (r0 == 0) goto L64
            a.tg1 r4 = a.me1.m
            a.wv.v(r2, r3)
            a.tg1.q(r2)
            goto L43
        L64:
            a.tg1 r4 = a.me1.m
            a.wv.v(r2, r3)
            a.tg1.e(r2)
            goto L43
        L6d:
            a.no1 r6 = a.no1.f387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xr.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.xr) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
