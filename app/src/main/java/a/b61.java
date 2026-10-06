package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b61 extends a.a61 {
    public final java.lang.Object d;

    public b61(int i) {
        super(i, 1);
        this.d = new java.lang.Object();
    }

    @Override // a.a61
    public final java.lang.Object a() {
        java.lang.Object a2;
        synchronized (this.d) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // a.a61
    public final boolean b(java.lang.Object obj) {
        boolean b;
        synchronized (this.d) {
            b = super.b(obj);
        }
        return b;
    }
}
