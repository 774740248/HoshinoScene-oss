package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lj extends a.da1 {
    public static final /* synthetic */ int B = 0;
    public final /* synthetic */ a.nj A;
    public final android.widget.ImageView u;
    public final android.widget.TextView v;
    public final android.widget.TextView w;
    public final android.widget.TextView x;
    public final android.widget.TextView y;
    public final android.widget.TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(a.nj njVar, android.view.View view) {
        super(view);
        this.A = njVar;
        android.view.View findViewById = view.findViewById(2131361842);
        a.wv.v(findViewById, "view.findViewById(R.id.ProcessIcon)");
        this.u = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(2131361841);
        a.wv.v(findViewById2, "view.findViewById(R.id.ProcessFriendlyName)");
        this.v = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131361846);
        a.wv.v(findViewById3, "view.findViewById(R.id.ProcessName)");
        this.w = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(2131361849);
        a.wv.v(findViewById4, "view.findViewById(R.id.ProcessPID)");
        this.x = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = view.findViewById(2131361851);
        a.wv.v(findViewById5, "view.findViewById(R.id.ProcessRES)");
        this.y = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = view.findViewById(2131361835);
        a.wv.v(findViewById6, "view.findViewById(R.id.ProcessCPU)");
        this.z = (android.widget.TextView) findViewById6;
        view.setOnClickListener(new a.wi(this, 14, njVar));
    }
}
