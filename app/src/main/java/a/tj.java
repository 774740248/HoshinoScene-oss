package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tj extends a.da1 {
    public static final /* synthetic */ int y = 0;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;
    public final android.widget.CompoundButton x;

    public tj(a.xj xjVar, android.view.View view) {
        super(view);
        android.view.View findViewById = view.findViewById(2131361811);
        a.wv.v(findViewById, "view.findViewById(R.id.ItemIcon)");
        this.u = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(2131361825);
        a.wv.v(findViewById2, "view.findViewById(R.id.ItemTitle)");
        this.v = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131361823);
        a.wv.v(findViewById3, "view.findViewById(R.id.ItemText)");
        this.w = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(2131361817);
        a.wv.v(findViewById4, "view.findViewById(R.id.ItemSelected)");
        this.x = (android.widget.CompoundButton) findViewById4;
        view.setOnTouchListener(new a.sj(xjVar, 0, this));
        view.setOnClickListener(new a.wi(xjVar, 9, this));
        view.setOnLongClickListener(new a.ni(xjVar, 1, this));
    }
}
