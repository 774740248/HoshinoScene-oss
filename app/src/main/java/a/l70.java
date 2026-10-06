package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l70 extends a.m60 {
    public static final a.fs1 A0;
    public static final /* synthetic */ a.gu0[] B0;
    public final a.yq1 m0 = a.b20.h(2131362106, this);
    public final a.yq1 n0;
    public final a.yq1 o0;
    public final a.yq1 p0;
    public final a.yq1 q0;
    public final a.yq1 r0;
    public final a.yq1 s0;
    public boolean t0;
    public com.omarea.krscript.model.RunnableNode u0;
    public java.lang.Runnable v0;
    public java.lang.String w0;
    public java.util.HashMap x0;
    public int y0;
    public java.lang.Runnable z0;

    static {
        a.d81 d81Var = new a.d81(a.l70.class, "btn_hide", "getBtn_hide()Landroid/widget/ImageButton;");
        a.na1.f375a.getClass();
        B0 = new a.gu0[]{d81Var, new a.d81(a.l70.class, "top_bar", "getTop_bar()Landroid/widget/LinearLayout;"), new a.d81(a.l70.class, "title", "getTitle()Landroid/widget/TextView;"), new a.d81(a.l70.class, "desc", "getDesc()Landroid/widget/TextView;"), new a.d81(a.l70.class, "shell_output", "getShell_output()Landroid/widget/TextView;"), new a.d81(a.l70.class, "bottom_actions", "getBottom_actions()Landroid/widget/LinearLayout;"), new a.d81(a.l70.class, "btn_copy", "getBtn_copy()Landroid/widget/Button;"), new a.d81(a.l70.class, "btn_exit", "getBtn_exit()Landroid/widget/Button;"), new a.d81(a.l70.class, "action_progress", "getAction_progress()Landroid/widget/ProgressBar;")};
        A0 = new a.fs1(29, 0);
    }

    public l70() {
        a.b20.h(2131363299, this);
        this.n0 = a.b20.h(2131363290, this);
        this.o0 = a.b20.h(2131362354, this);
        this.p0 = a.b20.h(2131363140, this);
        a.b20.h(2131362088, this);
        this.q0 = a.b20.h(2131362099, this);
        this.r0 = a.b20.h(2131362102, this);
        this.s0 = a.b20.h(2131361934, this);
    }

    @Override // a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        android.app.Dialog dialog;
        android.view.Window window;
        a.wv.w(view, "view");
        a.kk0 d = d();
        if (d != null && (dialog = this.h0) != null && (window = dialog.getWindow()) != null) {
            int i = a.x60.f681a;
            a.fs1.R(window, d);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            android.content.Context context = view.getContext();
            a.wv.v(context, "view.context");
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // a.m60
    public final android.app.Dialog T() {
        a.kk0 K = K();
        int i = this.y0;
        if (i == 0) {
            i = 2132018314;
        }
        return new android.app.Dialog(K, i);
    }

    public final android.widget.Button W() {
        return (android.widget.Button) this.r0.a(B0[7]);
    }

    public final android.widget.ImageButton X() {
        return (android.widget.ImageButton) this.m0.a(B0[0]);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, a.ma1] */
    @Override // a.gk0
    public final void o() {
        final int i = 1;
        this.F = true;
        com.omarea.krscript.model.RunnableNode runnableNode = this.u0;
        final int i2 = 0;
        if (runnableNode == null) {
            S(false, false);
            return;
        }
        if (runnableNode.getReloadPage()) {
            X().setVisibility(8);
        }
        a.ma1 obj = new a.ma1();
        X().setOnClickListener(new a.g70(this));
        W().setOnClickListener(new a.wi(this, 5, obj));
        a.gu0[] gu0VarArr = B0;
        ((android.widget.Button) this.q0.a(gu0VarArr[6])).setOnClickListener(new a.g70(this));
        if (runnableNode.getInterruptable()) {
            X().setVisibility(0);
            W().setVisibility(0);
        } else {
            X().setVisibility(8);
            W().setVisibility(8);
        }
        int length = runnableNode.getTitle().length();
        a.yq1 yq1Var = this.n0;
        if (length == 0) {
            ((android.widget.TextView) yq1Var.a(gu0VarArr[2])).setVisibility(8);
        } else {
            ((android.widget.TextView) yq1Var.a(gu0VarArr[2])).setText(runnableNode.getTitle());
        }
        int length2 = runnableNode.getDesc().length();
        a.yq1 yq1Var2 = this.o0;
        if (length2 == 0) {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[3])).setVisibility(8);
        } else {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[3])).setText(runnableNode.getDesc());
        }
        a.gu0 gu0Var = gu0VarArr[8];
        a.yq1 yq1Var3 = this.s0;
        ((android.widget.ProgressBar) yq1Var3.a(gu0Var)).setIndeterminate(true);
        a.j70 j70Var = new a.j70(new a.k70(this, runnableNode, obj), (android.widget.TextView) this.p0.a(gu0VarArr[4]), (android.widget.ProgressBar) yq1Var3.a(gu0VarArr[8]));
        a.kh1 kh1Var = new a.kh1();
        a.kk0 d = d();
        java.lang.String str = this.w0;
        if (str == null) {
            a.wv.M1("script");
            throw null;
        }
        java.lang.Runnable runnable = this.v0;
        if (runnable != null) {
            kh1Var.a(d, runnableNode, str, runnable, this.x0, j70Var);
        } else {
            a.wv.M1("onExit");
            throw null;
        }
    }

    @Override // a.m60, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        a.wv.w(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        java.lang.Runnable runnable = this.z0;
        if (runnable != null) {
            runnable.run();
        }
        this.z0 = null;
        if (d() != null) {
            int i = a.x60.f681a;
        }
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        android.view.View inflate = layoutInflater.inflate(2131558588, viewGroup);
        a.wv.v(inflate, "inflater.inflate(R.layou…kr_dialog_log, container)");
        return inflate;
    }
}
