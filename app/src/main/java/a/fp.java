package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fp implements java.util.Collection, a.du0 {
    public final java.lang.Object[] c;
    public final boolean d;

    public fp(java.lang.Object[] objArr, boolean z) {
        a.wv.w(objArr, "values");
        this.c = objArr;
        this.d = z;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return a.op.K1(this.c, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        a.wv.w(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!a.op.K1(this.c, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.lang.Object[] objArr = this.c;
        a.wv.w(objArr, "array");
        return new a.tq1(objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.c;
        a.wv.w(objArr, "<this>");
        if (this.d && a.wv.e(objArr.getClass(), java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        a.wv.v(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        a.wv.w(objArr, "array");
        return a.b20.s1(this, objArr);
    }
}
