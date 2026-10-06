package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cy0 implements java.util.Iterator {
    public final int c;
    public int d;
    public int e;
    public boolean f = false;
    public final /* synthetic */ a.jq g;

    public cy0(a.jq jqVar, int i) {
        this.g = jqVar;
        this.c = i;
        this.d = jqVar.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object d = this.g.d(this.e, this.c);
        this.e++;
        this.f = true;
        return d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new java.lang.IllegalStateException();
        }
        int i = this.e - 1;
        this.e = i;
        this.d--;
        this.f = false;
        this.g.j(i);
    }
}
