package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class qn1 extends a.ln1 {
    public int B;
    public java.util.ArrayList z = new java.util.ArrayList();
    public boolean A = true;
    public boolean C = false;
    public int D = 0;

    @Override // a.ln1
    public final void A(a.b20 b20Var) {
        this.u = b20Var;
        this.D |= 8;
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((a.ln1) this.z.get(i)).A(b20Var);
        }
    }

    @Override // a.ln1
    public final void B(android.animation.TimeInterpolator timeInterpolator) {
        this.D |= 1;
        java.util.ArrayList arrayList = this.z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((a.ln1) this.z.get(i)).B(timeInterpolator);
            }
        }
        this.f = timeInterpolator;
    }

    @Override // a.ln1
    public final void C(a.fa0 fa0Var) {
        super.C(fa0Var);
        this.D |= 4;
        if (this.z != null) {
            for (int i = 0; i < this.z.size(); i++) {
                ((a.ln1) this.z.get(i)).C(fa0Var);
            }
        }
    }

    @Override // a.ln1
    public final void D() {
        this.D |= 2;
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((a.ln1) this.z.get(i)).D();
        }
    }

    @Override // a.ln1
    public final void E(long j) {
        this.d = j;
    }

    @Override // a.ln1
    public final java.lang.String G(java.lang.String str) {
        java.lang.String G = super.G(str);
        for (int i = 0; i < this.z.size(); i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(((a.ln1) this.z.get(i)).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public final void H(a.ln1 ln1Var) {
        this.z.add(ln1Var);
        ln1Var.k = this;
        long j = this.e;
        if (j >= 0) {
            ln1Var.z(j);
        }
        if ((this.D & 1) != 0) {
            ln1Var.B(this.f);
        }
        if ((this.D & 2) != 0) {
            ln1Var.D();
        }
        if ((this.D & 4) != 0) {
            ln1Var.C(this.v);
        }
        if ((this.D & 8) != 0) {
            ln1Var.A(this.u);
        }
    }

    @Override // a.ln1
    public final void a(a.kn1 kn1Var) {
        super.a(kn1Var);
    }

    @Override // a.ln1
    public final void b(android.view.View view) {
        for (int i = 0; i < this.z.size(); i++) {
            ((a.ln1) this.z.get(i)).b(view);
        }
        this.h.add(view);
    }

    @Override // a.ln1
    public final void d(a.sn1 sn1Var) {
        if (s(sn1Var.b)) {
            java.util.Iterator it = this.z.iterator();
            while (it.hasNext()) {
                a.ln1 ln1Var = (a.ln1) it.next();
                if (ln1Var.s(sn1Var.b)) {
                    ln1Var.d(sn1Var);
                    sn1Var.c.add(ln1Var);
                }
            }
        }
    }

    @Override // a.ln1
    public final void f(a.sn1 sn1Var) {
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((a.ln1) this.z.get(i)).f(sn1Var);
        }
    }

    @Override // a.ln1
    public final void g(a.sn1 sn1Var) {
        if (s(sn1Var.b)) {
            java.util.Iterator it = this.z.iterator();
            while (it.hasNext()) {
                a.ln1 ln1Var = (a.ln1) it.next();
                if (ln1Var.s(sn1Var.b)) {
                    ln1Var.g(sn1Var);
                    sn1Var.c.add(ln1Var);
                }
            }
        }
    }

    @Override // a.ln1
    /* renamed from: j */
    public final a.ln1 clone() {
        a.qn1 qn1Var = (a.qn1) super.clone();
        qn1Var.z = new java.util.ArrayList();
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            a.ln1 clone = ((a.ln1) this.z.get(i)).clone();
            qn1Var.z.add(clone);
            clone.k = qn1Var;
        }
        return qn1Var;
    }

    @Override // a.ln1
    public final void l(android.view.ViewGroup viewGroup, a.ej1 ej1Var, a.ej1 ej1Var2, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        long j = this.d;
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            a.ln1 ln1Var = (a.ln1) this.z.get(i);
            if (j > 0 && (this.A || i == 0)) {
                long j2 = ln1Var.d;
                if (j2 > 0) {
                    ln1Var.E(j2 + j);
                } else {
                    ln1Var.E(j);
                }
            }
            ln1Var.l(viewGroup, ej1Var, ej1Var2, arrayList, arrayList2);
        }
    }

    @Override // a.ln1
    public final void u(android.view.View view) {
        super.u(view);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((a.ln1) this.z.get(i)).u(view);
        }
    }

    @Override // a.ln1
    public final void v(a.kn1 kn1Var) {
        super.v(kn1Var);
    }

    @Override // a.ln1
    public final void w(android.view.View view) {
        for (int i = 0; i < this.z.size(); i++) {
            ((a.ln1) this.z.get(i)).w(view);
        }
        this.h.remove(view);
    }

    @Override // a.ln1
    public final void x(android.view.ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.z.size();
        for (int i = 0; i < size; i++) {
            ((a.ln1) this.z.get(i)).x(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a.pn1, a.kn1] */
    @Override // a.ln1
    public final void y() {
        if (this.z.isEmpty()) {
            F();
            m();
            return;
        }
        pn1 obj = new pn1();
        obj.f444a = this;
        java.util.Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((a.ln1) it.next()).a(obj);
        }
        this.B = this.z.size();
        if (this.A) {
            java.util.Iterator it2 = this.z.iterator();
            while (it2.hasNext()) {
                ((a.ln1) it2.next()).y();
            }
            return;
        }
        for (int i = 1; i < this.z.size(); i++) {
            ((a.ln1) this.z.get(i - 1)).a(new a.cd0(this, 2, (a.ln1) this.z.get(i)));
        }
        a.ln1 ln1Var = (a.ln1) this.z.get(0);
        if (ln1Var != null) {
            ln1Var.y();
        }
    }

    @Override // a.ln1
    public final void z(long j) {
        java.util.ArrayList arrayList;
        this.e = j;
        if (j < 0 || (arrayList = this.z) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a.ln1) this.z.get(i)).z(j);
        }
    }
}
