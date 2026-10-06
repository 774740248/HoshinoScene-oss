package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class fy extends a.iq {
    public final a.ty d;
    public transient a.ey e;

    public fy(a.ey eyVar, a.ty tyVar) {
        super(eyVar);
        this.d = tyVar;
    }

    @Override // a.ey
    public final a.ty h() {
        a.ty tyVar = this.d;
        a.wv.s(tyVar);
        return tyVar;
    }

    @Override // a.iq
    public final void k() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a.ey eyVar = this.e;
        if (eyVar != null && eyVar != this) {
            a.ty tyVar = this.d;
            a.wv.s(tyVar);
            a.ry g = tyVar.g(a.gy.c);
            a.wv.s(g);
            a.w80 w80Var = (a.w80) eyVar;
            do {
                atomicReferenceFieldUpdater = a.w80.j;
            } while (atomicReferenceFieldUpdater.get(w80Var) == a.wv.n);
            java.lang.Object obj = atomicReferenceFieldUpdater.get(w80Var);
            a.at atVar = obj instanceof a.at ? (a.at) obj : null;
            if (atVar != null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.at.j;
                a.c90 c90Var = (a.c90) atomicReferenceFieldUpdater2.get(atVar);
                if (c90Var != null) {
                    c90Var.c();
                    atomicReferenceFieldUpdater2.set(atVar, a.e21.c);
                }
            }
        }
        this.e = a.cw.c;
    }

    public fy(a.ey eyVar) {
        this(eyVar, eyVar != null ? eyVar.h() : null);
    }
}
