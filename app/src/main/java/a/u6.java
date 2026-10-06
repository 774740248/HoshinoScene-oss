package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u6 implements java.util.Map.Entry, a.du0 {
    public final /* synthetic */ java.util.List c;

    public u6(java.util.List list) {
        this.c = list;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return (java.lang.String) this.c.get(0);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) this.c.get(1)));
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
