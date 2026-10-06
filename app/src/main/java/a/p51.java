package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p51 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ java.util.List d;
    public final /* synthetic */ long e;
    public final /* synthetic */ a.r51 f;
    public final /* synthetic */ com.omarea.model.FpsWatchSession g;
    public final /* synthetic */ a.l51 h;
    public final /* synthetic */ a.jt0 i;
    public final /* synthetic */ java.lang.String[] j;
    public final /* synthetic */ java.util.List k;
    public final /* synthetic */ java.util.ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(java.util.ArrayList arrayList, long j, a.r51 r51Var, com.omarea.model.FpsWatchSession fpsWatchSession, a.l51 l51Var, a.jt0 jt0Var, java.lang.String[] strArr, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        super(1);
        this.d = arrayList;
        this.e = j;
        this.f = r51Var;
        this.g = fpsWatchSession;
        this.h = l51Var;
        this.i = jt0Var;
        this.j = strArr;
        this.k = arrayList2;
        this.l = arrayList3;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.zt0 zt0Var = (a.zt0) obj;
        a.wv.w(zt0Var, "$this$$receiver");
        a.n51 n51Var = new a.n51(this.e, this.f, this.g, this.h, this.i);
        a.lt0 lt0Var = new a.lt0();
        n51Var.i(lt0Var);
        zt0Var.m(lt0Var, "session");
        a.lc1 lc1Var = new a.lc1(this.j, 5, this.i);
        a.lt0 lt0Var2 = new a.lt0();
        lc1Var.i(lt0Var2);
        zt0Var.m(lt0Var2, "data");
        java.util.List list = this.d;
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
        int i = 0;
        for (java.lang.Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                a.b20.p1();
                throw null;
            }
            a.o51 o51Var = new a.o51(this.k, i, this.l, (java.util.List) obj2);
            a.lt0 lt0Var3 = new a.lt0();
            o51Var.i(lt0Var3);
            arrayList.add(lt0Var3);
            i = i2;
        }
        zt0Var.t("threads", arrayList);
        return a.no1.f387a;
    }
}
