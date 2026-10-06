package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class zk1 implements a.cl1, a.z21 {
    @Override // a.z21
    public final a.du1 u(android.view.View view, a.du1 du1Var) {
        int i = a.p5.c;
        a.wv.w(view, "v");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), du1Var.f107a.f(8).d);
        int i2 = android.os.Build.VERSION.SDK_INT;
        a.ut1 tt1Var = i2 >= 30 ? new a.tt1(du1Var) : i2 >= 29 ? new a.st1(du1Var) : new a.qt1(du1Var);
        tt1Var.c(8, a.ns0.e);
        return tt1Var.b();
    }
}
