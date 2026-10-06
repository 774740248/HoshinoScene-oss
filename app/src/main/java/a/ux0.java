package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class ux0 {

    public ux0() {
        this(0);
    }

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f612a;
    public int b;
    public final int c;
    public int d;
    public int e;

    public ux0(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.f612a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                java.lang.Object obj2 = this.f612a.get(obj);
                if (obj2 != null) {
                    this.d++;
                    return obj2;
                }
                this.e++;
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.b++;
                put = this.f612a.put(obj, obj2);
                if (put != null) {
                    this.b--;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        c(this.c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L47
            java.util.LinkedHashMap r0 = r2.f612a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L47
            goto L14
        L12:
            r3 = move-exception
            goto L66
        L14:
            int r0 = r2.b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L45
            java.util.LinkedHashMap r0 = r2.f612a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L45
        L21:
            java.util.LinkedHashMap r0 = r2.f612a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r0 = r2.f612a     // Catch: java.lang.Throwable -> L12
            r0.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r2.b     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + (-1)
            r2.b = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ux0.c(int):void");
    }

    public final synchronized java.lang.String toString() {
        int i;
        int i2;
        try {
            i = this.d;
            i2 = this.e + i;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return java.lang.String.format(java.util.Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
