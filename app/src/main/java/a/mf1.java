package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class mf1 extends a.f implements a.ez {

    public mf1() {
        this(null, null);
    }
    public final a.ey f;

    public mf1(a.ey eyVar, a.ty tyVar) {
        super(tyVar, true);
        this.f = eyVar;
    }

    @Override // a.wt0
    public final boolean H() {
        return true;
    }

    @Override // a.ez
    public final a.ez f() {
        a.ey eyVar = this.f;
        if (eyVar instanceof a.ez) {
            return (a.ez) eyVar;
        }
        return null;
    }

    @Override // a.wt0
    public void m(java.lang.Object obj) {
        a.wv.t1(a.wv.B0(this.f), a.wv.l1(obj), null);
    }

    @Override // a.wt0
    public void n(java.lang.Object obj) {
        this.f.j(a.wv.l1(obj));
    }
}
