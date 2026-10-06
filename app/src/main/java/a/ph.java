package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ph extends a.da1 {
    public static final /* synthetic */ int y = 0;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;
    public final android.widget.TextView x;

    public ph(a.wh whVar, android.view.View view) {
        super(view);
        android.view.View findViewById = view.findViewById(2131362659);
        a.wv.v(findViewById, "view.findViewById(R.id.itemExpand)");
        this.u = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(2131362666);
        a.wv.v(findViewById2, "view.findViewById(R.id.itemTitle)");
        this.v = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131362657);
        a.wv.v(findViewById3, "view.findViewById(R.id.itemAvgIO)");
        this.w = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(2131362658);
        a.wv.v(findViewById4, "view.findViewById(R.id.itemCounts)");
        this.x = (android.widget.TextView) findViewById4;
        view.setOnClickListener(new a.wi(this, 13, whVar));
    }
}
