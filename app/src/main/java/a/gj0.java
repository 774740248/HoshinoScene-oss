package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class gj0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ gj0(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f178a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        java.lang.String str;
        int i = this.f178a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ma1 ma1Var = (a.ma1) obj2;
                a.ij0 ij0Var = (a.ij0) obj;
                a.wv.w(ma1Var, "$currentValue");
                a.wv.w(ij0Var, "$inputHandler");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.TextView");
                java.lang.CharSequence text = ((android.widget.TextView) view).getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                if (a.wv.e(str, ma1Var.c)) {
                    return;
                }
                ma1Var.c = str;
                ij0Var.setValue(str);
                return;
            default:
                a.ej1 ej1Var = (a.ej1) obj2;
                android.widget.TextView textView = (android.widget.TextView) obj;
                a.wv.w(ej1Var, "this$0");
                if (z) {
                    return;
                }
                ej1Var.j(textView.getText().toString());
                return;
        }
    }
}
