package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dy0 implements java.util.Set {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.jq d;

    public /* synthetic */ dy0(a.jq jqVar, int i) {
        this.c = i;
        this.d = jqVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.jq jqVar = this.d;
                int f = jqVar.f();
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    jqVar.i(entry.getKey(), entry.getValue());
                }
                return f != jqVar.f();
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.c;
        a.jq jqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                jqVar.c();
                return;
            default:
                jqVar.c();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.c;
        a.jq jqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                int g = jqVar.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                java.lang.Object d = jqVar.d(g, 1);
                java.lang.Object value = entry.getValue();
                return d == value || (d != null && d.equals(value));
            default:
                return jqVar.g(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                a.kp e = this.d.e();
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!e.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a.jq.l(this, obj);
            default:
                return a.jq.l(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = this.c;
        a.jq jqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i2 = 0;
                for (int f = jqVar.f() - 1; f >= 0; f--) {
                    java.lang.Object d = jqVar.d(f, 0);
                    java.lang.Object d2 = jqVar.d(f, 1);
                    i2 += (d == null ? 0 : d.hashCode()) ^ (d2 == null ? 0 : d2.hashCode());
                }
                return i2;
            default:
                int i3 = 0;
                for (int f2 = jqVar.f() - 1; f2 >= 0; f2--) {
                    java.lang.Object d3 = jqVar.d(f2, 0);
                    i3 += d3 == null ? 0 : d3.hashCode();
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.c;
        a.jq jqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return jqVar.f() == 0;
            default:
                return jqVar.f() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        int i = this.c;
        a.jq jqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return new a.ey0(jqVar);
            default:
                return new a.cy0(jqVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                a.jq jqVar = this.d;
                int g = jqVar.g(obj);
                if (g < 0) {
                    return false;
                }
                jqVar.j(g);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                a.kp e = this.d.e();
                int i = e.e;
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    e.remove(it.next());
                }
                return i != e.e;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                return a.jq.q(this.d.e(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.c;
        a.jq jqVar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return jqVar.f();
            default:
                return jqVar.f();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                return this.d.r(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                throw new java.lang.UnsupportedOperationException();
            default:
                a.jq jqVar = this.d;
                int f = jqVar.f();
                java.lang.Object[] objArr = new java.lang.Object[f];
                for (int i = 0; i < f; i++) {
                    objArr[i] = jqVar.d(i, 0);
                }
                return objArr;
        }
    }
}
