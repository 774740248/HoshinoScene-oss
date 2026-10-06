package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zl0 implements a.yl0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f739a;
    public final int b;
    public final /* synthetic */ a.am0 c;

    public zl0(a.am0 am0Var, int i, int i2) {
        this.c = am0Var;
        this.f739a = i;
        this.b = i2;
    }

    @Override // a.yl0
    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        a.am0 am0Var = this.c;
        a.gk0 gk0Var = am0Var.t;
        int i = this.f739a;
        if (gk0Var == null || i >= 0 || !gk0Var.e().I()) {
            return am0Var.J(arrayList, arrayList2, i, this.b);
        }
        return false;
    }
}
