package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o51 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ java.util.List d;
    public final /* synthetic */ int e;
    public final /* synthetic */ java.util.ArrayList f;
    public final /* synthetic */ java.util.List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(java.util.List list, int i, java.util.ArrayList arrayList, java.util.List list2) {
        super(1);
        this.d = list;
        this.e = i;
        this.f = arrayList;
        this.g = list2;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        java.lang.Object obj2;
        a.zt0 zt0Var = (a.zt0) obj;
        a.wv.w(zt0Var, "$this$$receiver");
        java.util.List list = this.d;
        int i = this.e;
        zt0Var.m(java.lang.Double.valueOf(((a.bm1) list.get(i)).c), "loadAvg");
        zt0Var.m(java.lang.Double.valueOf(((a.bm1) list.get(i)).e), "loadMax");
        zt0Var.m(java.lang.Double.valueOf(((a.bm1) list.get(i)).d), "loadSum");
        zt0Var.m(java.lang.Long.valueOf(((a.bm1) list.get(i)).b), "duration");
        zt0Var.m(((a.bm1) list.get(i)).a(), "comm");
        java.util.ArrayList arrayList = this.f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.util.Iterator it2 = this.g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((a.am1) obj2).b == longValue) {
                    break;
                }
            }
            a.am1 am1Var = (a.am1) obj2;
            arrayList2.add(am1Var != null ? java.lang.Double.valueOf(am1Var.f) : 0);
        }
        zt0Var.t("loads", arrayList2);
        return a.no1.f387a;
    }
}
