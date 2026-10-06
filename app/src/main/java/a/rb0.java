package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rb0 implements java.util.Map, java.io.Serializable, a.du0 {

    public rb0() {
    }

    public static final a.rb0 c = new a.rb0();

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return false;
        }
        a.wv.w((java.lang.Void) obj, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return a.sb0.c;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return a.sb0.c;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final java.lang.String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return a.qb0.c;
    }
}
