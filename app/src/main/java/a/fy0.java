package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fy0 implements java.util.Collection {
    public final /* synthetic */ a.jq c;

    public fy0(a.jq jqVar) {
        this.c = jqVar;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.c.c();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.c.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new a.cy0(this.c, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        a.jq jqVar = this.c;
        int h = jqVar.h(obj);
        if (h < 0) {
            return false;
        }
        jqVar.j(h);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        a.jq jqVar = this.c;
        int f = jqVar.f();
        int i = 0;
        boolean z = false;
        while (i < f) {
            if (collection.contains(jqVar.d(i, 1))) {
                jqVar.j(i);
                i--;
                f--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        a.jq jqVar = this.c;
        int f = jqVar.f();
        int i = 0;
        boolean z = false;
        while (i < f) {
            if (!collection.contains(jqVar.d(i, 1))) {
                jqVar.j(i);
                i--;
                f--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c.f();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return this.c.r(1, objArr);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        a.jq jqVar = this.c;
        int f = jqVar.f();
        java.lang.Object[] objArr = new java.lang.Object[f];
        for (int i = 0; i < f; i++) {
            objArr[i] = jqVar.d(i, 1);
        }
        return objArr;
    }
}
