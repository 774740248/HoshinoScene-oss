package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mo1 implements a.ry, a.sy {

    public mo1() {
    }

    public static final a.mo1 c = new a.mo1();

    @Override // a.ty
    public final a.ty c(a.ty tyVar) {
        a.wv.w(tyVar, "context");
        return a.wv.Z0(this, tyVar);
    }

    @Override // a.ty
    public final a.ty d(a.sy syVar) {
        return a.wv.R0(this, syVar);
    }

    @Override // a.ty
    public final a.ry g(a.sy syVar) {
        return a.wv.Y(this, syVar);
    }

    @Override // a.ry
    public final a.sy getKey() {
        return this;
    }

    @Override // a.ty
    public final java.lang.Object k(java.lang.Object obj, a.fp0 fp0Var) {
        return fp0Var.g(obj, this);
    }
}
