package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class yl1 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(a.yl1.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public a.gc0[] f713a;

    public final void a(a.gc0 gc0Var) {
        gc0Var.d((a.hc0) this);
        a.gc0[] gc0VarArr = this.f713a;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (gc0VarArr == null) {
            gc0VarArr = new a.gc0[4];
            this.f713a = gc0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= gc0VarArr.length) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(gc0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            a.wv.v(copyOf, "copyOf(this, newSize)");
            gc0VarArr = (a.gc0[]) copyOf;
            this.f713a = gc0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        gc0VarArr[i] = gc0Var;
        gc0Var.d = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.gc0 b(int r9) {
        /*
            r8 = this;
            a.gc0[] r0 = r8.f713a
            a.wv.s(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = a.yl1.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            a.wv.s(r4)
            r5 = r0[r2]
            a.wv.s(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            a.gc0[] r5 = r8.f713a
            a.wv.s(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            a.wv.s(r6)
            r7 = r5[r4]
            a.wv.s(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            a.wv.s(r4)
            r5 = r5[r2]
            a.wv.s(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            a.wv.s(r9)
            r2 = 0
            r9.d(r2)
            r9.d = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yl1.b(int):a.gc0");
    }

    public final void c(int i) {
        while (i > 0) {
            a.gc0[] gc0VarArr = this.f713a;
            a.wv.s(gc0VarArr);
            int i2 = (i - 1) / 2;
            a.gc0 gc0Var = gc0VarArr[i2];
            a.wv.s(gc0Var);
            a.gc0 gc0Var2 = gc0VarArr[i];
            a.wv.s(gc0Var2);
            if (gc0Var.compareTo(gc0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        a.gc0[] gc0VarArr = this.f713a;
        a.wv.s(gc0VarArr);
        a.gc0 gc0Var = gc0VarArr[i2];
        a.wv.s(gc0Var);
        a.gc0 gc0Var2 = gc0VarArr[i];
        a.wv.s(gc0Var2);
        gc0VarArr[i] = gc0Var;
        gc0VarArr[i2] = gc0Var2;
        gc0Var.d = i;
        gc0Var2.d = i2;
    }
}
