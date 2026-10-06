package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gq0 implements java.util.Iterator, a.du0 {
    public java.lang.Object c;
    public int d = -2;
    public final /* synthetic */ a.hq0 e;

    public gq0(a.hq0 hq0Var) {
        this.e = hq0Var;
    }

    public final void a() {
        java.lang.Object i;
        int i2 = this.d;
        a.hq0 hq0Var = this.e;
        if (i2 == -2) {
            i = ((a.qo0) hq0Var.c).b();
        } else {
            a.bp0 bp0Var = hq0Var.b;
            java.lang.Object obj = this.c;
            a.wv.s(obj);
            i = bp0Var.i(obj);
        }
        this.c = i;
        this.d = i == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d < 0) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.d < 0) {
            a();
        }
        if (this.d == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.c;
        a.wv.t(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.d = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
