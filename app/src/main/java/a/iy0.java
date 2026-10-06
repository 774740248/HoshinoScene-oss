package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class iy0 extends a.e {
    public final /* synthetic */ a.jy0 c;

    public iy0(a.jy0 jy0Var) {
        this.c = jy0Var;
    }

    @Override // a.e, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj == null || (obj instanceof a.hy0)) {
            return super.contains((a.hy0) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new a.hq0(new a.rq1(1, new a.qs0(0, size() - 1, 1)), new a.b10(13, this)).iterator();
    }
}
