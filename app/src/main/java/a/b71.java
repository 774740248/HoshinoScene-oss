package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b71 extends a.da1 {
    public final /* synthetic */ a.d71 A;
    public final android.widget.ImageView u;
    public final android.widget.ImageView v;
    public final android.widget.TextView w;
    public final android.widget.TextView x;
    public final android.widget.TextView y;
    public final android.widget.TextView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(a.d71 d71Var, android.view.View view) {
        super(view);
        this.A = d71Var;
        android.view.View findViewById = view.findViewById(2131361840);
        a.wv.v(findViewById, "view.findViewById(R.id.ProcessExpand)");
        this.u = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(2131361842);
        a.wv.v(findViewById2, "view.findViewById(R.id.ProcessIcon)");
        this.v = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131361841);
        a.wv.v(findViewById3, "view.findViewById(R.id.ProcessFriendlyName)");
        this.w = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = view.findViewById(2131361846);
        a.wv.v(findViewById4, "view.findViewById(R.id.ProcessName)");
        this.x = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = view.findViewById(2131361851);
        a.wv.v(findViewById5, "view.findViewById(R.id.ProcessRES)");
        this.y = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = view.findViewById(2131361835);
        a.wv.v(findViewById6, "view.findViewById(R.id.ProcessCPU)");
        this.z = (android.widget.TextView) findViewById6;
    }

    public final void u(a.z61 z61Var) {
        a.d71 d71Var = this.A;
        com.omarea.ui.procs.ProcessGroupView processGroupView = d71Var.g;
        this.w.setText(com.omarea.ui.procs.ProcessGroupView.d(processGroupView, com.omarea.ui.procs.ProcessGroupView.c(processGroupView, z61Var)));
        float f = z61Var.g;
        com.omarea.ui.procs.ProcessGroupView processGroupView2 = d71Var.g;
        this.z.setText(com.omarea.ui.procs.ProcessGroupView.a(processGroupView2, f));
        this.y.setText(com.omarea.ui.procs.ProcessGroupView.b(processGroupView2, z61Var.h));
    }
}
