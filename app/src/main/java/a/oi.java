package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oi extends a.da1 {
    public static final /* synthetic */ int x = 0;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;

    public oi(a.ti tiVar, android.view.View view) {
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
        view.setOnClickListener(new a.wi(tiVar, 8, this));
        view.setOnLongClickListener(new a.ni(tiVar, 0, this));
    }
}
