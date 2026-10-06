package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class yc1 implements java.lang.Iterable {
    public a.uc1 c;
    public a.uc1 d;
    public final java.util.WeakHashMap e = new java.util.WeakHashMap();
    public int f = 0;

    public a.uc1 a(java.lang.Object obj) {
        a.uc1 uc1Var = this.c;
        while (uc1Var != null && !uc1Var.c.equals(obj)) {
            uc1Var = uc1Var.e;
        }
        return uc1Var;
    }

    public java.lang.Object b(java.lang.Object obj) {
        a.uc1 a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f--;
        java.util.WeakHashMap weakHashMap = this.e;
        if (!weakHashMap.isEmpty()) {
            java.util.Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((a.xc1) it.next()).a(a2);
            }
        }
        a.uc1 uc1Var = a2.f;
        if (uc1Var != null) {
            uc1Var.e = a2.e;
        } else {
            this.c = a2.e;
        }
        a.uc1 uc1Var2 = a2.e;
        if (uc1Var2 != null) {
            uc1Var2.f = uc1Var;
        } else {
            this.d = uc1Var;
        }
        a2.e = null;
        a2.f = null;
        return a2.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((a.wc1) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof a.yc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.yc1 r7 = (a.yc1) r7
            int r1 = r6.f
            int r3 = r7.f
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.wc1 r3 = (a.wc1) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.wc1 r4 = (a.wc1) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.wc1 r7 = (a.wc1) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yc1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        java.util.Iterator it = iterator();
        int i = 0;
        while (true) {
            a.wc1 wc1Var = (a.wc1) it;
            if (!wc1Var.hasNext()) {
                return i;
            }
            i += ((java.util.Map.Entry) wc1Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        a.tc1 tc1Var = new a.tc1(this.c, this.d, 0);
        this.e.put(tc1Var, java.lang.Boolean.FALSE);
        return tc1Var;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.util.Iterator it = iterator();
        while (true) {
            a.wc1 wc1Var = (a.wc1) it;
            if (!wc1Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((java.util.Map.Entry) wc1Var.next()).toString());
            if (wc1Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
