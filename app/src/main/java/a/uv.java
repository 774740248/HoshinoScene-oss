package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uv implements a.ty, java.io.Serializable {
    public final a.ty c;
    public final a.ry d;

    public uv(a.ry ryVar, a.ty tyVar) {
        a.wv.w(tyVar, "left");
        a.wv.w(ryVar, "element");
        this.c = tyVar;
        this.d = ryVar;
    }

    @Override // a.ty
    public final a.ty c(a.ty tyVar) {
        return a.wv.Z0(this, tyVar);
    }

    @Override // a.ty
    public final a.ty d(a.sy syVar) {
        a.wv.w(syVar, "key");
        a.ry ryVar = this.d;
        a.ry g = ryVar.g(syVar);
        a.ty tyVar = this.c;
        if (g != null) {
            return tyVar;
        }
        a.ty d = tyVar.d(syVar);
        return d == tyVar ? this : d == a.ob0.c ? ryVar : new a.uv(ryVar, d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof a.uv) {
                a.uv uvVar = (a.uv) obj;
                uvVar.getClass();
                int i = 2;
                a.uv uvVar2 = uvVar;
                int i2 = 2;
                while (true) {
                    a.ty tyVar = uvVar2.c;
                    uvVar2 = tyVar instanceof a.uv ? (a.uv) tyVar : null;
                    if (uvVar2 == null) {
                        break;
                    }
                    i2++;
                }
                a.uv uvVar3 = this;
                while (true) {
                    a.ty tyVar2 = uvVar3.c;
                    uvVar3 = tyVar2 instanceof a.uv ? (a.uv) tyVar2 : null;
                    if (uvVar3 == null) {
                        break;
                    }
                    i++;
                }
                if (i2 == i) {
                    a.uv uvVar4 = this;
                    while (true) {
                        a.ry ryVar = uvVar4.d;
                        if (!a.wv.e(uvVar.g(ryVar.getKey()), ryVar)) {
                            break;
                        }
                        a.ty tyVar3 = uvVar4.c;
                        if (tyVar3 instanceof a.uv) {
                            uvVar4 = (a.uv) tyVar3;
                        } else {
                            a.wv.t(tyVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            a.ry ryVar2 = (a.ry) tyVar3;
                            if (a.wv.e(uvVar.g(ryVar2.getKey()), ryVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // a.ty
    public final a.ry g(a.sy syVar) {
        a.wv.w(syVar, "key");
        a.uv uvVar = this;
        while (true) {
            a.ry g = uvVar.d.g(syVar);
            if (g != null) {
                return g;
            }
            a.ty tyVar = uvVar.c;
            if (!(tyVar instanceof a.uv)) {
                return tyVar.g(syVar);
            }
            uvVar = (a.uv) tyVar;
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode();
    }

    @Override // a.ty
    public final java.lang.Object k(java.lang.Object obj, a.fp0 fp0Var) {
        return fp0Var.g(this.c.k(obj, fp0Var), this.d);
    }

    public final java.lang.String toString() {
        return "[" + ((java.lang.String) k("", a.tv.e)) + ']';
    }
}
