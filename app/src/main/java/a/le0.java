package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class le0 implements java.util.Iterator, a.du0 {
    public int c;
    public java.lang.Object d;
    public final java.util.ArrayDeque e;
    public final /* synthetic */ a.ne0 f;

    public le0(a.ne0 ne0Var) {
        this.f = ne0Var;
        this.c = 2;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.e = arrayDeque;
        boolean isDirectory = ne0Var.f379a.isDirectory();
        java.io.File file = ne0Var.f379a;
        if (isDirectory) {
            arrayDeque.push(a(file));
        } else if (!file.isFile()) {
            this.c = 3;
        } else {
            a.wv.w(file, "rootFile");
            arrayDeque.push(new a.je0(file));
        }
    }

    public final a.he0 a(java.io.File file) {
        int B = a.ai1.B(this.f.b);
        if (B == 0) {
            return new a.ke0(this, file);
        }
        if (B == 1) {
            return new a.ie0(this, file);
        }
        throw new java.lang.RuntimeException();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        java.io.File file;
        java.io.File a2;
        int i = this.c;
        if (i == 4) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int B = a.ai1.B(i);
        if (B == 0) {
            return true;
        }
        if (B != 2) {
            this.c = 4;
            while (true) {
                java.util.ArrayDeque arrayDeque = this.e;
                a.me0 me0Var = (a.me0) arrayDeque.peek();
                if (me0Var == null) {
                    file = null;
                    break;
                }
                a2 = me0Var.a();
                if (a2 == null) {
                    arrayDeque.pop();
                } else {
                    if (a.wv.e(a2, me0Var.f347a) || !a2.isDirectory() || arrayDeque.size() >= this.f.c) {
                        break;
                    }
                    arrayDeque.push(a(a2));
                }
            }
            file = a2;
            if (file != null) {
                this.d = file;
                this.c = 1;
            } else {
                this.c = 3;
            }
            if (this.c == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.c = 2;
        return this.d;
    }

    public final void d() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        d();
        throw null;
    }
}
