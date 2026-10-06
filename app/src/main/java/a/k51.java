package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k51 extends android.widget.LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final a.z41 c;
    public long d;
    public final a.vj1 e;
    public final a.vj1 f;
    public final a.vj1 g;
    public final a.vj1 h;
    public final a.vj1 i;
    public final a.vj1 j;

    public k51(android.content.Context context) {
        super(context);
        this.c = a.z41.Stall;
        this.e = new a.vj1(new a.h51(this, 5));
        this.f = new a.vj1(new a.h51(this, 1));
        this.g = new a.vj1(new a.h51(this, 2));
        this.h = new a.vj1(new a.h51(this, 4));
        this.i = new a.vj1(new a.h51(this, 0));
        this.j = new a.vj1(new a.h51(this, 3));
        setLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.omarea.ui.fps.PerfStallDimensionChart getChart_data() {
        java.lang.Object a2 = this.i.a();
        a.wv.v(a2, "<get-chart_data>(...)");
        return (com.omarea.ui.fps.PerfStallDimensionChart) a2;
    }

    private final android.widget.TextView getChart_dimension_a() {
        java.lang.Object a2 = this.f.a();
        a.wv.v(a2, "<get-chart_dimension_a>(...)");
        return (android.widget.TextView) a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getChart_dimension_b() {
        java.lang.Object a2 = this.g.a();
        a.wv.v(a2, "<get-chart_dimension_b>(...)");
        return (android.widget.TextView) a2;
    }

    private final android.view.View getChart_dimension_help() {
        java.lang.Object a2 = this.j.a();
        a.wv.v(a2, "<get-chart_dimension_help>(...)");
        return (android.view.View) a2;
    }

    private final android.widget.TextView getChart_legends() {
        java.lang.Object a2 = this.h.a();
        a.wv.v(a2, "<get-chart_legends>(...)");
        return (android.widget.TextView) a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.r51 getStorage() {
        return (a.r51) this.e.a();
    }

    private final void setLayout(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(2131558616, (android.view.ViewGroup) this, true);
        getChart_dimension_help().setOnClickListener(new a.wi(context, 12, this));
    }

    public final void setDimension(long j) {
        java.lang.Integer valueOf;
        this.d = j;
        getChart_dimension_a().setText(this.c.d);
        getChart_dimension_b().setText("STALL(%)");
        getChart_dimension_b().setVisibility(0);
        getChart_legends().setText("");
        java.util.ArrayList<java.lang.Integer> colors = getChart_data().getColors();
        java.util.ArrayList<java.lang.String[]> clusters = getChart_data().getClusters();
        a.wv.v(clusters, "chart_data.clusters");
        int i = 0;
        for (java.lang.Object obj : clusters) {
            int i2 = i + 1;
            if (i < 0) {
                a.b20.p1();
                throw null;
            }
            java.lang.String[] strArr = (java.lang.String[]) obj;
            java.lang.String str = strArr.length > 1 ? "■ CPU " + a.op.N1(strArr) + "~" + a.op.Q1(strArr) + "  " : "■ CPU " + a.op.N1(strArr) + "  ";
            if (i < colors.size()) {
                valueOf = colors.get(i);
            } else {
                a.vj1 vj1Var = a.du.f;
                valueOf = java.lang.Integer.valueOf(a.tg1.h());
            }
            a.wv.v(valueOf, "if (cIndex < colors.size…rtLightBlue\n            }");
            int intValue = valueOf.intValue();
            android.widget.TextView chart_legends = getChart_legends();
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(intValue), 0, spannableString.length(), 33);
            chart_legends.append(spannableString);
            i = i2;
        }
        android.widget.TextView chart_legends2 = getChart_legends();
        android.text.SpannableString spannableString2 = new android.text.SpannableString("  ■ STALL(%)");
        a.vj1 vj1Var2 = a.du.f;
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(a.tg1.h()), 0, spannableString2.length(), 33);
        chart_legends2.append(spannableString2);
        setVisibility(8);
        long j2 = this.d;
        if (j2 < 1) {
            return;
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.j51(this, j2, null), 3);
    }

    public final void setTooltipGroup(a.eu euVar) {
        getChart_data().setTooltipGroup(euVar);
    }
}
