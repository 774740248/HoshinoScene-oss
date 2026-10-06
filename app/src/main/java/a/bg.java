package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class bg implements android.view.View.OnClickListener {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ a.v60 d;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView e;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView f;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView g;
    public final /* synthetic */ com.omarea.ui.SwitchOptionItemView h;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object j;
    public final /* synthetic */ java.lang.Object k;

    public /* synthetic */ bg(a.v60 v60Var, a.x81 x81Var, com.omarea.ui.SwitchOptionItemView switchOptionItemView, com.omarea.ui.SwitchOptionItemView switchOptionItemView2, com.omarea.ui.SwitchOptionItemView switchOptionItemView3, com.omarea.vtools.activities.ActivitySwap activitySwap, com.omarea.ui.SwitchOptionItemView switchOptionItemView4, com.omarea.ui.SwitchOptionItemView switchOptionItemView5) {
        this.d = v60Var;
        this.i = x81Var;
        this.e = switchOptionItemView;
        this.f = switchOptionItemView2;
        this.g = switchOptionItemView3;
        this.k = activitySwap;
        this.h = switchOptionItemView4;
        this.j = switchOptionItemView5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        int i2 = 0;
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = this.h;
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = this.g;
        com.omarea.ui.SwitchOptionItemView switchOptionItemView3 = this.f;
        com.omarea.ui.SwitchOptionItemView switchOptionItemView4 = this.e;
        a.v60 v60Var = this.d;
        java.lang.Object obj = this.k;
        java.lang.Object obj2 = this.j;
        java.lang.Object obj3 = this.i;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.x81 x81Var = (a.x81) obj3;
                com.omarea.vtools.activities.ActivitySwap activitySwap = (com.omarea.vtools.activities.ActivitySwap) obj;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView5 = (com.omarea.ui.SwitchOptionItemView) obj2;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(x81Var, "$radioGroupSimulator");
                a.wv.w(activitySwap, "this$0");
                v60Var.a();
                com.omarea.ui.SwitchOptionItemView switchOptionItemView6 = (com.omarea.ui.SwitchOptionItemView) x81Var.b();
                int i3 = 5;
                if (a.wv.e(switchOptionItemView6, switchOptionItemView4)) {
                    i2 = 5;
                } else if (!a.wv.e(switchOptionItemView6, switchOptionItemView3)) {
                    if (!a.wv.e(switchOptionItemView6, switchOptionItemView2)) {
                        return;
                    } else {
                        i2 = -2;
                    }
                }
                android.content.SharedPreferences sharedPreferences = activitySwap.N;
                if (sharedPreferences == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                sharedPreferences.edit().putBoolean("swap_use_loop", switchOptionItemView.i).putInt("swap_priority", i2).putBoolean("swap", switchOptionItemView5.i).apply();
                a.b81 b81Var = activitySwap.M;
                if (b81Var == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                java.lang.String string = activitySwap.getString(2131953213);
                a.wv.v(string, "getString(R.string.please_wait)");
                b81Var.b(string);
                new java.lang.Thread(new a.zf(activitySwap, i3)).start();
                return;
            default:
                a.qu1 qu1Var = (a.qu1) obj3;
                a.nk nkVar = (a.nk) obj2;
                a.u70 u70Var = (a.u70) obj;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(qu1Var, "$globalConfig");
                a.wv.w(nkVar, "$xposedExtension");
                a.wv.w(u70Var, "this$0");
                v60Var.a();
                qu1Var.d = switchOptionItemView4.i;
                qu1Var.f482a = switchOptionItemView3.i;
                qu1Var.b = switchOptionItemView2.i;
                qu1Var.c = switchOptionItemView.i;
                java.lang.Object obj4 = nkVar.e;
                if (((a.tr0) obj4) != null) {
                    try {
                        if (((a.tr0) obj4) != null) {
                            a.tr0 tr0Var = (a.tr0) obj4;
                            a.wv.s(tr0Var);
                            ((a.rr0) tr0Var).c("com.android.systemui_hide_su", qu1Var.f482a);
                            a.tr0 tr0Var2 = (a.tr0) nkVar.e;
                            a.wv.s(tr0Var2);
                            ((a.rr0) tr0Var2).c("android_dis_service_foreground", qu1Var.b);
                            a.tr0 tr0Var3 = (a.tr0) nkVar.e;
                            a.wv.s(tr0Var3);
                            ((a.rr0) tr0Var3).c("reverse_optimizer", qu1Var.c);
                            a.tr0 tr0Var4 = (a.tr0) nkVar.e;
                            a.wv.s(tr0Var4);
                            ((a.rr0) tr0Var4).c("android_scroll", qu1Var.d);
                            nkVar.V();
                            return;
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                android.app.Activity activity = u70Var.b;
                android.widget.Toast.makeText(activity, activity.getString(2131953325), 0).show();
                return;
        }
    }

    public /* synthetic */ bg(a.v60 v60Var, a.qu1 qu1Var, com.omarea.ui.SwitchOptionItemView switchOptionItemView, com.omarea.ui.SwitchOptionItemView switchOptionItemView2, com.omarea.ui.SwitchOptionItemView switchOptionItemView3, com.omarea.ui.SwitchOptionItemView switchOptionItemView4, a.nk nkVar, a.u70 u70Var) {
        this.d = v60Var;
        this.i = qu1Var;
        this.e = switchOptionItemView;
        this.f = switchOptionItemView2;
        this.g = switchOptionItemView3;
        this.h = switchOptionItemView4;
        this.j = nkVar;
        this.k = u70Var;
    }
}
