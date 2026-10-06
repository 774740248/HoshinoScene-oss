package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nv0 {

    public nv0() {
    }


    /* renamed from: a, reason: collision with root package name */
    public a.fv0 f398a;
    public a.kv0 b;

    public final void a(a.mv0 mv0Var, a.ev0 ev0Var) {
        a.fv0 a2 = ev0Var.a();
        a.fv0 fv0Var = this.f398a;
        a.wv.w(fv0Var, "state1");
        if (a2.compareTo(fv0Var) < 0) {
            fv0Var = a2;
        }
        this.f398a = fv0Var;
        this.b.c(mv0Var, ev0Var);
        this.f398a = a2;
    }
}
