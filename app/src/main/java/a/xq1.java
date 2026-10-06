package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xq1 extends a.zb1 implements a.fp0 {
    public int e;
    public /* synthetic */ java.lang.Object f;
    public final /* synthetic */ android.view.View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq1(android.view.View view, a.ey eyVar) {
        super(eyVar);
        this.g = view;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.xq1 xq1Var = new a.xq1(this.g, eyVar);
        xq1Var.f = obj;
        return xq1Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.e;
        android.view.View view = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.rg1 rg1Var = (a.rg1) this.f;
            this.f = rg1Var;
            this.e = 1;
            rg1Var.d = view;
            rg1Var.c = 3;
            rg1Var.f = this;
            return dzVar;
        }
        if (i == 1) {
            a.rg1 rg1Var2 = (a.rg1) this.f;
            a.b20.q1(obj);
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                a.wv.w(viewGroup, "<this>");
                a.rq1 rq1Var = new a.rq1(3, new a.sq1(viewGroup, null));
                this.f = null;
                this.e = 2;
                if (rg1Var2.b(rq1Var, this) == dzVar) {
                    return dzVar;
                }
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.xq1) a((a.rg1) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
