package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class rp extends a.l31 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f500a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(a.rp.class, java.lang.Object.class, "_consensus");
    private volatile java.lang.Object _consensus = a.b20.f30a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L17;
     */
    @Override // a.l31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a.rp.f500a
            java.lang.Object r1 = r0.get(r4)
            a.qm1 r2 = a.b20.f30a
            if (r1 != r2) goto L28
            a.qm1 r3 = r4.c(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L28
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = r3
            goto L28
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
        L28:
            r4.b(r5, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rp.a(java.lang.Object):java.lang.Object");
    }

    public abstract void b(java.lang.Object obj, java.lang.Object obj2);

    public abstract a.qm1 c(java.lang.Object obj);
}
