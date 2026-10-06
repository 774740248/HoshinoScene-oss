package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class v80 extends a.k30 {

    public v80() {
        this(null);
    }
    public int m;

    public v80(a.ws1 ws1Var) {
        super(ws1Var);
        if (ws1Var instanceof a.nr0) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // a.k30
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            a.i30 i30Var = (a.i30) it.next();
            i30Var.a(i30Var);
        }
    }
}
