package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hn1 implements java.util.Iterator, a.du0 {
    public final java.util.Iterator c;
    public final /* synthetic */ a.hq0 d;

    public hn1(a.hq0 hq0Var) {
        this.d = hq0Var;
        this.c = ((a.qg1) hq0Var.c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return this.d.b.i(this.c.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
