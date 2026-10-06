package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class qt0 extends a.wt0 {

    public qt0() {
        this(null);
    }
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(a.nt0 nt0Var) {
        super(true);
        boolean z = true;
        F(nt0Var);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.wt0.d;
        a.ou ouVar = (a.ou) atomicReferenceFieldUpdater.get(this);
        a.pu puVar = ouVar instanceof a.pu ? (a.pu) ouVar : null;
        if (puVar != null) {
            a.wt0 n = puVar.n();
            while (!n.z()) {
                a.ou ouVar2 = (a.ou) atomicReferenceFieldUpdater.get(n);
                a.pu puVar2 = ouVar2 instanceof a.pu ? (a.pu) ouVar2 : null;
                if (puVar2 != null) {
                    n = puVar2.n();
                }
            }
            this.e = z;
        }
        z = false;
        this.e = z;
    }

    @Override // a.wt0
    public final boolean A() {
        return true;
    }

    @Override // a.wt0
    public final boolean z() {
        return this.e;
    }
}
