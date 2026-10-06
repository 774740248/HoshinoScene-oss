package com.omarea.ui.fps;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class PerfStallDimensionList extends android.widget.LinearLayout {
    public final a.vj1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerfStallDimensionList(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.c = new a.vj1(new a.cd1(16, this));
        setLayout(context);
    }

    private final android.widget.LinearLayout getList() {
        java.lang.Object a2 = this.c.a();
        a.wv.v(a2, "<get-list>(...)");
        return (android.widget.LinearLayout) a2;
    }

    private final void setLayout(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(2131558617, (android.view.ViewGroup) this, true);
    }

    public final void a(long j, a.eu euVar) {
        a.wv.w(euVar, "tooltipGroup");
        a.z41 z41Var = a.z41.CacheMisses;
        a.z41 z41Var2 = a.z41.MemAccess;
        a.z41 z41Var3 = a.z41.Stall;
        a.z41[] z41VarArr = {z41Var, z41Var2, z41Var3, a.z41.StallFrontend, a.z41.StallFrontendMembound, a.z41.StallBackend, a.z41.StallBackendMembound};
        for (int i = 0; i < 7; i++) {
            a.z41 z41Var4 = z41VarArr[i];
            if (z41Var4 == z41Var3) {
                android.content.Context context = getContext();
                a.wv.v(context, "this.context");
                a.k51 k51Var = new a.k51(context);
                k51Var.setTooltipGroup(euVar);
                k51Var.setTag(z41Var4);
                getList().addView(k51Var, new android.widget.LinearLayout.LayoutParams(-1, -2));
                k51Var.setDimension(j);
            } else {
                android.content.Context context2 = getContext();
                a.wv.v(context2, "this.context");
                a.d51 d51Var = new a.d51(context2);
                d51Var.setTooltipGroup(euVar);
                d51Var.setTag(z41Var4);
                getList().addView(d51Var, new android.widget.LinearLayout.LayoutParams(-1, -2));
                d51Var.c(j, z41Var4);
            }
        }
    }
}
