package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rs0 implements java.util.Iterator, a.du0 {
    public final int c;
    public final int d;
    public boolean e;
    public int f;

    public rs0(int i, int i2, int i3) {
        this.c = i3;
        this.d = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.e = z;
        this.f = z ? i : i2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(b());
    }

    public final int b() {
        int i = this.f;
        if (i != this.d) {
            this.f = this.c + i;
        } else {
            if (!this.e) {
                throw new java.util.NoSuchElementException();
            }
            this.e = false;
        }
        return i;
    }

    public final void c() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
