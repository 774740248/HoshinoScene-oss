package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ke0 extends a.he0 {
    public boolean b;
    public java.io.File[] c;
    public int d;
    public final /* synthetic */ a.le0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(a.le0 le0Var, java.io.File file) {
        super(file);
        a.wv.w(file, "rootDir");
        this.e = le0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0.length == 0) goto L22;
     */
    @Override // a.me0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File a() {
        /*
            r5 = this;
            boolean r0 = r5.b
            java.io.File r1 = r5.f347a
            a.le0 r2 = r5.e
            if (r0 != 0) goto L11
            a.ne0 r0 = r2.f
            r0.getClass()
            r0 = 1
            r5.b = r0
            return r1
        L11:
            java.io.File[] r0 = r5.c
            r3 = 0
            if (r0 == 0) goto L25
            int r4 = r5.d
            a.wv.s(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L1f
            goto L25
        L1f:
            a.ne0 r0 = r2.f
            r0.getClass()
            return r3
        L25:
            java.io.File[] r0 = r5.c
            if (r0 != 0) goto L46
            java.io.File[] r0 = r1.listFiles()
            r5.c = r0
            if (r0 != 0) goto L36
            a.ne0 r0 = r2.f
            r0.getClass()
        L36:
            java.io.File[] r0 = r5.c
            if (r0 == 0) goto L40
            a.wv.s(r0)
            int r0 = r0.length
            if (r0 != 0) goto L46
        L40:
            a.ne0 r0 = r2.f
            r0.getClass()
            return r3
        L46:
            java.io.File[] r0 = r5.c
            a.wv.s(r0)
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ke0.a():java.io.File");
    }
}
