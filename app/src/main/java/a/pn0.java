package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pn0 extends a.mn1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f443a;
    public final /* synthetic */ java.util.ArrayList b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.util.ArrayList d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.util.ArrayList f;
    public final /* synthetic */ a.qn0 g;

    public pn0(a.qn0 qn0Var, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2, java.lang.Object obj3, java.util.ArrayList arrayList3) {
        this.g = qn0Var;
        this.f443a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    @Override // a.mn1, a.kn1
    public final void b() {
        a.qn0 qn0Var = this.g;
        java.lang.Object obj = this.f443a;
        if (obj != null) {
            qn0Var.u(obj, this.b, null);
        }
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            qn0Var.u(obj2, this.d, null);
        }
        java.lang.Object obj3 = this.e;
        if (obj3 != null) {
            qn0Var.u(obj3, this.f, null);
        }
    }

    @Override // a.kn1
    public final void d(a.ln1 ln1Var) {
        ln1Var.v(this);
    }
}
