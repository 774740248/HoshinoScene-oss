package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g30 implements java.util.Iterator, a.du0 {
    public int c = -1;
    public int d;
    public int e;
    public a.ss0 f;
    public int g;
    public final /* synthetic */ a.h30 h;

    public g30(a.h30 h30Var) {
        this.h = h30Var;
        int i = h30Var.b;
        int length = h30Var.f200a.length();
        if (length < 0) {
            throw new java.lang.IllegalArgumentException(a.ai1.e("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.d = i;
        this.e = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [a.qs0, a.ss0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [a.qs0, a.ss0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 0
            if (r0 >= 0) goto Lc
            r8.c = r1
            r0 = 0
            r8.f = r0
            goto L81
        Lc:
            a.h30 r2 = r8.h
            int r3 = r2.c
            r4 = 1
            java.lang.CharSequence r5 = r2.f200a
            r6 = -1
            if (r3 <= 0) goto L1d
            int r7 = r8.g
            int r7 = r7 + r4
            r8.g = r7
            if (r7 >= r3) goto L23
        L1d:
            int r3 = r5.length()
            if (r0 <= r3) goto L33
        L23:
            a.ss0 r0 = new a.ss0
            int r1 = r8.d
            int r2 = a.yi1.i2(r5)
            r0.<init>(r1, r2, r4)
            r8.f = r0
            r8.e = r6
            goto L7f
        L33:
            int r0 = r8.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            a.fp0 r2 = r2.d
            java.lang.Object r0 = r2.g(r5, r0)
            a.y31 r0 = (a.y31) r0
            if (r0 != 0) goto L53
            a.ss0 r0 = new a.ss0
            int r1 = r8.d
            int r2 = a.yi1.i2(r5)
            r0.<init>(r1, r2, r4)
            r8.f = r0
            r8.e = r6
            goto L7f
        L53:
            java.lang.Object r2 = r0.c
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r5) goto L6c
            a.ss0 r3 = a.ss0.f
            goto L74
        L6c:
            a.ss0 r5 = new a.ss0
            int r6 = r2 + (-1)
            r5.<init>(r3, r6, r4)
            r3 = r5
        L74:
            r8.f = r3
            int r2 = r2 + r0
            r8.d = r2
            if (r0 != 0) goto L7c
            r1 = r4
        L7c:
            int r2 = r2 + r1
            r8.e = r2
        L7f:
            r8.c = r4
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g30.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c == 0) {
            throw new java.util.NoSuchElementException();
        }
        a.ss0 ss0Var = this.f;
        a.wv.t(ss0Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f = null;
        this.c = -1;
        return ss0Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
