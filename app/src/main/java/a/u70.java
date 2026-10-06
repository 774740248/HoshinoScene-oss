package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u70 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f580a;
    public final android.app.Activity b;

    public u70(a.kk0 kk0Var, int i) {
        this.f580a = i;
        if (i == 1) {
            this.b = kk0Var;
        } else if (i != 2) {
            this.b = kk0Var;
        } else {
            this.b = kk0Var;
        }
    }

    public final void a() {
        switch (this.f580a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.View inflate = this.b.getLayoutInflater().inflate(2131558540, (android.view.ViewGroup) null);
                int i = a.x60.f681a;
                android.app.Activity activity = this.b;
                a.wv.v(inflate, "view");
                a.v60 m = a.fs1.m(activity, inflate, true);
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362838);
                java.lang.Boolean q = a.kf0.B.q();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                switchOptionItemView.setChecked(a.wv.e(q, bool));
                final int i2 = 0;
                switchOptionItemView.setOnClickListener(new a.t70());
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362839);
                switchOptionItemView2.setChecked(a.wv.e(a.jf0.b.q(), bool));
                final char c = 1;
                switchOptionItemView2.setOnClickListener(new a.t70());
                a.b20.a(switchOptionItemView2.getDescView(), "自定义", new a.cd1(27, this));
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView3 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362840);
                switchOptionItemView3.setChecked(a.ph0.i.r());
                final int i3 = 2;
                switchOptionItemView3.setOnClickListener(new a.t70());
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView4 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362842);
                switchOptionItemView4.setChecked(a.rg0.u.r());
                final int i4 = 3;
                switchOptionItemView4.setOnClickListener(new a.t70());
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView5 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362837);
                switchOptionItemView5.setChecked(a.wv.e(a.fg0.z.q(), bool));
                final int i5 = 4;
                switchOptionItemView5.setOnClickListener(new a.t70());
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView6 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362843);
                switchOptionItemView6.setChecked(a.wv.e(a.ag0.w.q(), bool));
                final int i6 = 5;
                switchOptionItemView6.setOnClickListener(new a.t70());
                final com.omarea.ui.SwitchOptionItemView switchOptionItemView7 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362841);
                switchOptionItemView7.setChecked(a.wv.e(a.uh0.f.q(), bool));
                final int i7 = 6;
                switchOptionItemView7.setOnClickListener(new a.t70());
                inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 21));
                return;
            default:
                a.nk nkVar = new a.nk(this.b, 18);
                nkVar.c(new a.xa(this, 16, nkVar));
                return;
        }
    }
}
