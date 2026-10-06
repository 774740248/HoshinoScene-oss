package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i51 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.k51 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ java.util.ArrayList j;
    public final /* synthetic */ java.util.ArrayList k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(a.k51 k51Var, long j, boolean z, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, a.ey eyVar) {
        super(2, eyVar);
        this.g = k51Var;
        this.h = j;
        this.i = z;
        this.j = arrayList;
        this.k = arrayList2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.i51(this.g, this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        android.widget.TextView chart_dimension_b;
        android.widget.TextView chart_dimension_b2;
        com.omarea.ui.fps.PerfStallDimensionChart chart_data;
        com.omarea.ui.fps.PerfStallDimensionChart chart_data2;
        com.omarea.ui.fps.PerfStallDimensionChart chart_data3;
        android.widget.TextView chart_dimension_b3;
        a.b20.q1(obj);
        a.k51 k51Var = this.g;
        long j = k51Var.d;
        long j2 = this.h;
        a.no1 no1Var = a.no1.f387a;
        if (j != j2) {
            return no1Var;
        }
        if (!this.i) {
            k51Var.setVisibility(8);
            return no1Var;
        }
        k51Var.setVisibility(0);
        java.util.ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            chart_dimension_b3 = k51Var.getChart_dimension_b();
            chart_dimension_b3.setVisibility(8);
        } else {
            chart_dimension_b = k51Var.getChart_dimension_b();
            chart_dimension_b.setText("STALL(%)");
            chart_dimension_b2 = k51Var.getChart_dimension_b();
            chart_dimension_b2.setVisibility(0);
        }
        chart_data = k51Var.getChart_data();
        chart_data.getClass();
        chart_data.n = arrayList;
        chart_data.o = "STALL";
        chart_data.p = 100;
        chart_data2 = k51Var.getChart_data();
        chart_data2.setSessionId(j2);
        chart_data3 = k51Var.getChart_data();
        chart_data3.setData(this.k);
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.i51) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
