package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uc1 implements java.util.Map.Entry {
    public final java.lang.Object c;
    public final java.lang.Object d;
    public a.uc1 e;
    public a.uc1 f;

    public uc1(java.lang.Object obj, java.lang.Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a.uc1)) {
            return false;
        }
        a.uc1 uc1Var = (a.uc1) obj;
        return this.c.equals(uc1Var.c) && this.d.equals(uc1Var.d);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.c.hashCode() ^ this.d.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.c + "=" + this.d;
    }
}
