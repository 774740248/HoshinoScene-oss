package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d61 {

    /* renamed from: a, reason: collision with root package name */
    public final a.pz0 f88a;
    public final a.h01 b;
    public a.c61 c;

    public d61(android.content.Context context, android.view.View view, int i) {
        a.pz0 pz0Var = new a.pz0(context);
        this.f88a = pz0Var;
        pz0Var.u(new a.vu0(7, this));
        a.h01 h01Var = new a.h01(2130969435, 0, context, view, pz0Var, false);
        this.b = h01Var;
        h01Var.g = i;
        h01Var.k = new a.f01(1, this);
    }

    public final void a() {
        a.h01 h01Var = this.b;
        if (h01Var.b()) {
            return;
        }
        if (h01Var.f == null) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        h01Var.d(0, 0, false, false);
    }
}
