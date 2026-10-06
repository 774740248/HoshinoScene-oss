package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    public long f481a = 0;
    public a.qu b;

    public final void a(int i) {
        if (i < 64) {
            this.f481a &= ~(1 << i);
            return;
        }
        a.qu quVar = this.b;
        if (quVar != null) {
            quVar.a(i - 64);
        }
    }

    public final int b(int i) {
        a.qu quVar = this.b;
        if (quVar == null) {
            return i >= 64 ? java.lang.Long.bitCount(this.f481a) : java.lang.Long.bitCount(this.f481a & ((1 << i) - 1));
        }
        if (i < 64) {
            return java.lang.Long.bitCount(this.f481a & ((1 << i) - 1));
        }
        return java.lang.Long.bitCount(this.f481a) + quVar.b(i - 64);
    }

    public final void c() {
        if (this.b == null) {
            this.b = new a.qu();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.f481a & (1 << i)) != 0;
        }
        c();
        return this.b.d(i - 64);
    }

    public final void e(int i, boolean z) {
        if (i >= 64) {
            c();
            this.b.e(i - 64, z);
            return;
        }
        long j = this.f481a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f481a = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (z2 || this.b != null) {
            c();
            this.b.e(0, z2);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.b.f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f481a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f481a = j3;
        long j4 = j - 1;
        this.f481a = (j3 & j4) | java.lang.Long.rotateRight((~j4) & j3, 1);
        a.qu quVar = this.b;
        if (quVar != null) {
            if (quVar.d(0)) {
                h(63);
            }
            this.b.f(0);
        }
        return z;
    }

    public final void g() {
        this.f481a = 0L;
        a.qu quVar = this.b;
        if (quVar != null) {
            quVar.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f481a |= 1 << i;
        } else {
            c();
            this.b.h(i - 64);
        }
    }

    public final java.lang.String toString() {
        if (this.b == null) {
            return java.lang.Long.toBinaryString(this.f481a);
        }
        return this.b.toString() + "xx" + java.lang.Long.toBinaryString(this.f481a);
    }
}
