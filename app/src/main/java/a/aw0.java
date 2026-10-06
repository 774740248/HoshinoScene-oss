package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class aw0 implements java.util.Iterator, a.du0 {
    public java.lang.String c;
    public boolean d;
    public final /* synthetic */ a.rq1 e;

    public aw0(a.rq1 rq1Var) {
        this.e = rq1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == null && !this.d) {
            java.lang.String readLine = ((java.io.BufferedReader) this.e.b).readLine();
            this.c = readLine;
            if (readLine == null) {
                this.d = true;
            }
        }
        return this.c != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.c;
        this.c = null;
        a.wv.s(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
