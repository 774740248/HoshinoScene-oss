package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.k50 g;
    public final /* synthetic */ a.ma1 h;
    public final /* synthetic */ a.f60 i;
    public final /* synthetic */ a.qo0 j;
    public final /* synthetic */ a.ha1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p50(a.k50 k50Var, a.ma1 ma1Var, a.f60 f60Var, a.qo0 qo0Var, a.ha1 ha1Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = k50Var;
        this.h = ma1Var;
        this.i = f60Var;
        this.j = qo0Var;
        this.k = ha1Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.p50(this.g, this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.k50 k50Var = this.g;
        if (!k50Var.f283a.isEmpty()) {
            ((a.w60) this.h.c).a();
            int i = a.x60.f681a;
            a.ml mlVar = this.i.f145a;
            java.lang.String string = mlVar.getString(2131952391);
            a.wv.v(string, "activity.getString(R.string.fs_batch_overwrite)");
            java.util.List list = k50Var.f283a;
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) ((a.y31) it.next()).d);
            }
            a.fs1.i(mlVar, string, a.qv.j2(arrayList, "\n", null, null, null, 62), new a.u1(this.h, this.i, this.k, this.j, 6), null);
        } else {
            this.j.b();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.p50 p50Var = (a.p50) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        p50Var.e(no1Var);
        return no1Var;
    }
}
