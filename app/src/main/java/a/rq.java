package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rq implements a.z21 {
    public final /* synthetic */ a.vq c;

    public /* synthetic */ rq(a.vq vqVar) {
        this.c = vqVar;
    }

    public final void a(android.view.View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.c.a(0);
    }

    @Override // a.z21
    public final a.du1 u(android.view.View view, a.du1 du1Var) {
        int a2 = du1Var.a();
        a.vq vqVar = this.c;
        vqVar.m = a2;
        vqVar.n = du1Var.b();
        vqVar.o = du1Var.c();
        vqVar.e();
        return du1Var;
    }
}
