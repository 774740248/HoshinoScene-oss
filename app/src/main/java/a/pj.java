package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pj {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f438a;
    public final android.widget.TextView b;
    public final android.widget.TextView c;

    public pj(android.view.View view) {
        android.view.View findViewById = view.findViewById(2131361842);
        a.wv.v(findViewById, "view.findViewById(R.id.ProcessIcon)");
        this.f438a = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(2131361841);
        a.wv.v(findViewById2, "view.findViewById(R.id.ProcessFriendlyName)");
        this.b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131361835);
        a.wv.v(findViewById3, "view.findViewById(R.id.ProcessCPU)");
        this.c = (android.widget.TextView) findViewById3;
    }
}
