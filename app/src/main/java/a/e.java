package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class e implements java.util.Collection, a.du0 {
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
    public boolean contains(java.lang.Object obj) {
        if (isEmpty()) {
            return false;
        }
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            if (a.wv.e(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        a.wv.w(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
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
        return ((a.iy0) this).c.f275a.groupCount() + 1;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return a.b20.r1(this);
    }

    public final java.lang.String toString() {
        return a.qv.j2(this, ", ", "[", "]", new a.b10(11, this), 24);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        a.wv.w(objArr, "array");
        return a.b20.s1(this, objArr);
    }
}
