package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rg1 implements java.util.Iterator, a.ey, a.du0 {

    public rg1() {
    }

    public int c;
    public java.lang.Object d;
    public java.util.Iterator e;
    public a.ey f;

    public final java.lang.RuntimeException a() {
        int i = this.c;
        if (i == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.c);
    }

    public final java.lang.Object b(a.rq1 rq1Var, a.ey eyVar) {
        java.lang.Object obj;
        java.util.Iterator it = rq1Var.iterator();
        boolean hasNext = it.hasNext();
        java.lang.Object obj2 = a.dz.c;
        java.lang.Object obj3 = a.no1.f387a;
        if (hasNext) {
            this.e = it;
            this.c = 2;
            this.f = eyVar;
            a.wv.w(eyVar, "frame");
            obj = obj2;
        } else {
            obj = obj3;
        }
        return obj == obj2 ? obj : obj3;
    }

    @Override // a.ey
    public final a.ty h() {
        return a.ob0.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                java.util.Iterator it = this.e;
                a.wv.s(it);
                if (it.hasNext()) {
                    this.c = 2;
                    return true;
                }
                this.e = null;
            }
            this.c = 5;
            a.ey eyVar = this.f;
            a.wv.s(eyVar);
            this.f = null;
            eyVar.j(a.no1.f387a);
        }
    }

    @Override // a.ey
    public final void j(java.lang.Object obj) {
        a.b20.q1(obj);
        this.c = 4;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.c;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new java.util.NoSuchElementException();
        }
        if (i == 2) {
            this.c = 1;
            java.util.Iterator it = this.e;
            a.wv.s(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.c = 0;
        java.lang.Object obj = this.d;
        this.d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
