package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pn1 extends a.mn1 {

    public pn1() {
    }


    /* renamed from: a, reason: collision with root package name */
    public a.qn1 f444a;

    @Override // a.mn1, a.kn1
    public final void b() {
        a.qn1 qn1Var = this.f444a;
        if (qn1Var.C) {
            return;
        }
        qn1Var.F();
        qn1Var.C = true;
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        a.qn1 qn1Var = this.f444a;
        int i = qn1Var.B - 1;
        qn1Var.B = i;
        if (i == 0) {
            qn1Var.C = false;
            qn1Var.m();
        }
        ln1Var.v(this);
    }
}
