package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b51 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.d51 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ a.z41 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ java.util.ArrayList k;
    public final /* synthetic */ java.util.ArrayList l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(a.d51 d51Var, long j, a.z41 z41Var, boolean z, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, a.ey eyVar) {
        super(2, eyVar);
        this.g = d51Var;
        this.h = j;
        this.i = z41Var;
        this.j = z;
        this.k = arrayList;
        this.l = arrayList2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.b51(this.g, this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.ui.fps.PerfStallDimensionChart chart_data;
        com.omarea.ui.fps.PerfStallDimensionChart chart_data2;
        com.omarea.ui.fps.PerfStallDimensionChart chart_data3;
        a.b20.q1(obj);
        a.d51 d51Var = this.g;
        long j = d51Var.d;
        long j2 = this.h;
        a.no1 no1Var = a.no1.f387a;
        if (j == j2 && d51Var.c == this.i) {
            if (!this.j) {
                d51Var.setVisibility(8);
                return no1Var;
            }
            d51Var.setVisibility(0);
            chart_data = d51Var.getChart_data();
            int i = com.omarea.ui.fps.PerfStallDimensionChart.t;
            chart_data.getClass();
            java.util.ArrayList arrayList = this.k;
            a.wv.w(arrayList, "data");
            chart_data.n = arrayList;
            chart_data.o = "MISS";
            chart_data.p = 10;
            chart_data2 = d51Var.getChart_data();
            chart_data2.setSessionId(j2);
            chart_data3 = d51Var.getChart_data();
            chart_data3.setData(this.l);
        }
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.b51) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
