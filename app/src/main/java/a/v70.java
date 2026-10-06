package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v70 {

    /* renamed from: a, reason: collision with root package name */
    public final a.p5 f626a;

    public v70(a.p5 p5Var, int i) {
        if (i != 1) {
            a.wv.w(p5Var, "activity");
            this.f626a = p5Var;
        } else {
            a.wv.w(p5Var, "context");
            this.f626a = p5Var;
        }
    }

    public final void a(boolean z, a.qo0 qo0Var) {
        a.p5 p5Var = this.f626a;
        android.view.View inflate = android.view.LayoutInflater.from(p5Var).inflate(2131558557, (android.view.ViewGroup) null);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363276);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363275);
        a.cp cpVar = com.omarea.Scene.c;
        switchOptionItemView.setChecked(a.fs1.D().getBoolean("theme_fg_blur", true));
        switchOptionItemView2.setChecked(z && a.fs1.D().getBoolean("theme_bg_blur", false));
        if (!z) {
            switchOptionItemView2.setEnabled(false);
        }
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(p5Var, inflate, true);
        m.b(false);
        inflate.findViewById(2131362098).setOnClickListener(new a.d41(switchOptionItemView, switchOptionItemView2, qo0Var, m, 8));
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 24));
    }
}
