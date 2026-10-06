package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class k30 implements a.i30 {
    public final a.ws1 d;
    public int f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public a.ws1 f279a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public a.v80 i = null;
    public boolean j = false;
    public final java.util.ArrayList k = new java.util.ArrayList();
    public final java.util.ArrayList l = new java.util.ArrayList();

    public k30(a.ws1 ws1Var) {
        this.d = ws1Var;
    }

    @Override // a.i30
    public final void a(a.i30 i30Var) {
        java.util.ArrayList arrayList = this.l;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((a.k30) it.next()).j) {
                return;
            }
        }
        this.c = true;
        a.ws1 ws1Var = this.f279a;
        if (ws1Var != null) {
            ws1Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        java.util.Iterator it2 = arrayList.iterator();
        a.k30 k30Var = null;
        int i = 0;
        while (it2.hasNext()) {
            a.k30 k30Var2 = (a.k30) it2.next();
            if (!(k30Var2 instanceof a.v80)) {
                i++;
                k30Var = k30Var2;
            }
        }
        if (k30Var != null && i == 1 && k30Var.j) {
            a.v80 v80Var = this.i;
            if (v80Var != null) {
                if (!v80Var.j) {
                    return;
                } else {
                    this.f = this.h * v80Var.g;
                }
            }
            d(k30Var.g + this.f);
        }
        a.ws1 ws1Var2 = this.f279a;
        if (ws1Var2 != null) {
            ws1Var2.a(this);
        }
    }

    public final void b(a.i30 i30Var) {
        this.k.add(i30Var);
        if (this.j) {
            i30Var.a(i30Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.d.b.W);
        sb.append(":");
        sb.append(a.ai1.C(this.e));
        sb.append("(");
        sb.append(this.j ? java.lang.Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
