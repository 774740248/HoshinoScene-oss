package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class g implements a.ry {

    public g() {
        this(null);
    }
    public final a.sy c;

    public g(a.sy syVar) {
        this.c = syVar;
    }

    @Override // a.ty
    public final a.ty c(a.ty tyVar) {
        a.wv.w(tyVar, "context");
        return a.wv.Z0(this, tyVar);
    }

    @Override // a.ty
    public a.ty d(a.sy syVar) {
        return a.wv.R0(this, syVar);
    }

    @Override // a.ry
    public final a.sy getKey() {
        return this.c;
    }

    @Override // a.ty
    public final java.lang.Object k(java.lang.Object obj, a.fp0 fp0Var) {
        return fp0Var.g(obj, this);
    }
}
