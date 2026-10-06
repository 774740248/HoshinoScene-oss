package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fd0 extends a.j {
    public final a.ed0 e = (ed0) new java.lang.ThreadLocal();

    @Override // a.j
    public final java.util.Random b() {
        java.lang.Object obj = this.e.get();
        a.wv.v(obj, "implStorage.get()");
        return (java.util.Random) obj;
    }
}
