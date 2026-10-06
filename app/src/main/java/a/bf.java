package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class bf implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;
    public final /* synthetic */ java.lang.Object i;

    public /* synthetic */ bf(android.view.View view, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i) {
        this.c = i;
        this.d = view;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i;
        int i2 = this.c;
        java.lang.Object obj = this.i;
        java.lang.Object obj2 = this.h;
        java.lang.Object obj3 = this.g;
        java.lang.Object obj4 = this.f;
        java.lang.Object obj5 = this.e;
        android.view.View view2 = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ka1 ka1Var = (a.ka1) obj5;
                a.ka1 ka1Var2 = (a.ka1) obj4;
                a.v60 v60Var = (a.v60) obj3;
                java.lang.String str = (java.lang.String) obj2;
                com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = (com.omarea.vtools.activities.ActivityStartSplash) obj;
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(ka1Var, "$timeout");
                a.wv.w(ka1Var2, "$clickItems");
                a.wv.w(v60Var, "$dialog");
                a.wv.w(str, "$mode");
                a.wv.w(activityStartSplash, "this$0");
                if (((com.omarea.ui.SwitchOptionItemView) view2).i) {
                    if (ka1Var.c > 0 && (i = ka1Var2.c) < 10) {
                        ka1Var2.c = i + 1;
                        return;
                    }
                    v60Var.a();
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.O("scene1_contract", str);
                    if (!a.wv.e(str, "root")) {
                        if (a.wv.e(str, "adb")) {
                            activityStartSplash.l();
                            return;
                        } else {
                            activityStartSplash.v();
                            return;
                        }
                    }
                    a.ty tyVar = a.z80.b;
                    a.pf pfVar = new a.pf(activityStartSplash, null);
                    int i3 = 2 & 1;
                    a.ty tyVar2 = a.ob0.c;
                    if (i3 != 0) {
                        tyVar = tyVar2;
                    }
                    int i4 = (2 & 2) != 0 ? 1 : 0;
                    a.ty W = a.wv.W(tyVar2, tyVar, true);
                    a.u20 u20Var = a.z80.f728a;
                    if (W != u20Var && W.g(a.gy.c) == null) {
                        W = W.c(u20Var);
                    }
                    a.f av0Var = i4 == 2 ? new a.av0(W, pfVar) : new a.f(W, true);
                    av0Var.S(i4, av0Var, pfVar);
                    return;
                }
                return;
            default:
                android.widget.EditText editText = (android.widget.EditText) view2;
                a.v30 v30Var = (a.v30) obj5;
                android.widget.EditText editText2 = (android.widget.EditText) obj4;
                android.widget.EditText editText3 = (android.widget.EditText) obj3;
                a.wv.w(editText, "$widthInput");
                a.wv.w(v30Var, "this$0");
                a.wv.w(editText2, "$heightInput");
                a.wv.w(editText3, "$dpiInput");
                a.wv.w((android.util.DisplayMetrics) obj2, "$dm");
                a.wv.w((android.graphics.Point) obj, "$point");
                editText.setText(java.lang.String.valueOf(720));
                editText2.setText(java.lang.String.valueOf(v30Var.c(720)));
                editText3.setText(java.lang.String.valueOf((int) ((r2.densityDpi * 720) / r1.x)));
                return;
        }
    }
}
