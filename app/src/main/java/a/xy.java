package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xy extends a.g implements a.hy {
    public static final a.wy d = new a.wy(0);

    public xy() {
        super(a.gy.c);
    }

    @Override // a.g, a.ty
    public final a.ty d(a.sy syVar) {
        a.wv.w(syVar, "key");
        boolean z = syVar instanceof a.h;
        a.ob0 ob0Var = a.ob0.c;
        if (z) {
            a.h hVar = (a.h) syVar;
            a.sy syVar2 = this.c;
            a.wv.w(syVar2, "key");
            if ((syVar2 == hVar || hVar.d == syVar2) && ((a.ry) hVar.c.i(this)) != null) {
                return ob0Var;
            }
        } else if (a.gy.c == syVar) {
            return ob0Var;
        }
        return this;
    }

    @Override // a.g, a.ty
    public final a.ry g(a.sy syVar) {
        a.wv.w(syVar, "key");
        if (!(syVar instanceof a.h)) {
            if (a.gy.c == syVar) {
                return this;
            }
            return null;
        }
        a.h hVar = (a.h) syVar;
        a.sy syVar2 = this.c;
        a.wv.w(syVar2, "key");
        if (syVar2 != hVar && hVar.d != syVar2) {
            return null;
        }
        a.ry ryVar = (a.ry) hVar.c.i(this);
        if (ryVar instanceof a.ry) {
            return ryVar;
        }
        return null;
    }

    public abstract void h(a.ty tyVar, java.lang.Runnable runnable);

    public boolean j() {
        return !(this instanceof a.ko1);
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + '@' + a.b20.b0(this);
    }
}
