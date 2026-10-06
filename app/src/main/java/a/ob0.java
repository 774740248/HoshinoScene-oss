package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ob0 implements a.ty, java.io.Serializable {

    public ob0() {
    }

    public static final a.ob0 c = new a.ob0();

    @Override // a.ty
    public final a.ty c(a.ty tyVar) {
        a.wv.w(tyVar, "context");
        return tyVar;
    }

    @Override // a.ty
    public final a.ty d(a.sy syVar) {
        a.wv.w(syVar, "key");
        return this;
    }

    @Override // a.ty
    public final a.ry g(a.sy syVar) {
        a.wv.w(syVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // a.ty
    public final java.lang.Object k(java.lang.Object obj, a.fp0 fp0Var) {
        return obj;
    }

    public final java.lang.String toString() {
        return "EmptyCoroutineContext";
    }
}
