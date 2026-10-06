package a;

import java.util.Map;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ey0 implements java.util.Iterator, java.util.Map.Entry {
    public int c;
    public final /* synthetic */ a.jq f;
    public boolean e = false;
    public int d = -1;

    public ey0(a.jq jqVar) {
        this.f = jqVar;
        this.c = jqVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.e) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        int i = this.d;
        a.jq jqVar = this.f;
        java.lang.Object d = jqVar.d(i, 0);
        if (key != d && (key == null || !key.equals(d))) {
            return false;
        }
        java.lang.Object value = entry.getValue();
        java.lang.Object d2 = jqVar.d(this.d, 1);
        return value == d2 || (value != null && value.equals(d2));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (!this.e) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f.d(this.d, 0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (!this.e) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f.d(this.d, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.e) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.d;
        a.jq jqVar = this.f;
        java.lang.Object d = jqVar.d(i, 0);
        java.lang.Object d2 = jqVar.d(this.d, 1);
        return (d == null ? 0 : d.hashCode()) ^ (d2 != null ? d2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.d++;
        this.e = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new java.lang.IllegalStateException();
        }
        this.f.j(this.d);
        this.d--;
        this.c--;
        this.e = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.e) {
            return this.f.k(this.d, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final java.lang.String toString() {
        return getKey() + "=" + getValue();
    }
}
