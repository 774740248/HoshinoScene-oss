package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gp implements java.util.Iterator, a.du0 {
    public final boolean[] c;
    public int d;

    public gp(boolean[] zArr) {
        this.c = zArr;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object next() {
        try {
            boolean[] zArr = this.c;
            int i = this.d;
            this.d = i + 1;
            return java.lang.Boolean.valueOf(zArr[i]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.d--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public final void b() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
