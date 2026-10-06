package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nm1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f385a;
    public boolean b;
    public java.lang.Object c;
    public java.lang.Object d;

    public nm1(int i) {
        if (i != 1) {
            return;
        }
        this.c = new android.util.SparseIntArray();
        this.d = new android.util.SparseIntArray();
        this.f385a = false;
        this.b = false;
    }

    public final int a(int i, int i2) {
        if (!this.b) {
            return c(i, i2);
        }
        int i3 = ((android.util.SparseIntArray) this.d).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = c(i, i2);
        ((android.util.SparseIntArray) this.d).put(i, c);
        return c;
    }

    public final int b(int i, int i2) {
        if (!this.f385a) {
            return i % i2;
        }
        int i3 = ((android.util.SparseIntArray) this.c).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = i % i2;
        ((android.util.SparseIntArray) this.c).put(i, i4);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.d
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            int r3 = r3 - r1
            r4 = r2
        L10:
            if (r4 > r3) goto L22
            int r5 = r4 + r3
            int r5 = r5 >>> r1
            int r6 = r0.keyAt(r5)
            if (r6 >= r8) goto L1e
            int r4 = r5 + 1
            goto L10
        L1e:
            int r5 = r5 + (-1)
            r3 = r5
            goto L10
        L22:
            int r4 = r4 - r1
            r3 = -1
            if (r4 < 0) goto L31
            int r5 = r0.size()
            if (r4 >= r5) goto L31
            int r0 = r0.keyAt(r4)
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 == r3) goto L49
            java.lang.Object r3 = r7.d
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r7.b(r0, r9)
            int r0 = r0 + r1
            if (r0 != r9) goto L4c
            int r3 = r3 + 1
            r0 = r2
            goto L4c
        L49:
            r0 = r2
            r3 = r0
            r4 = r3
        L4c:
            if (r4 >= r8) goto L5e
            int r0 = r0 + 1
            if (r0 != r9) goto L56
            int r3 = r3 + 1
            r0 = r2
            goto L5b
        L56:
            if (r0 <= r9) goto L5b
            int r3 = r3 + 1
            r0 = r1
        L5b:
            int r4 = r4 + 1
            goto L4c
        L5e:
            int r0 = r0 + r1
            if (r0 <= r9) goto L63
            int r3 = r3 + 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nm1.c(int, int):int");
    }

    public final void d() {
        ((android.util.SparseIntArray) this.c).clear();
    }
}
