package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o41 {

    /* renamed from: a, reason: collision with root package name */
    public final com.omarea.krscript.model.ActionParamInfo f403a;
    public final a.kk0 b;
    public final boolean c;
    public final java.util.ArrayList d;
    public int e;

    public o41(com.omarea.krscript.model.ActionParamInfo actionParamInfo, a.kk0 kk0Var) {
        android.view.View decorView;
        a.wv.w(kk0Var, "context");
        this.f403a = actionParamInfo;
        this.b = kk0Var;
        android.view.Window window = kk0Var.getWindow();
        java.lang.Integer valueOf = (window == null || (decorView = window.getDecorView()) == null) ? null : java.lang.Integer.valueOf(decorView.getSystemUiVisibility());
        this.c = valueOf != null && (valueOf.intValue() & 8192) == 0;
        java.util.ArrayList<a.ng1> optionsFromShell = actionParamInfo.getOptionsFromShell();
        a.wv.s(optionsFromShell);
        this.d = optionsFromShell;
        this.e = a.fs1.z(actionParamInfo, optionsFromShell);
    }

    public final void a(android.widget.TextView textView, android.widget.TextView textView2) {
        int i = this.e;
        if (i > -1) {
            java.util.ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                textView.setText(((a.ng1) arrayList.get(this.e)).c);
                textView2.setText(((a.ng1) arrayList.get(this.e)).f381a);
                return;
            }
        }
        textView.setText("");
        textView2.setText("");
    }
}
