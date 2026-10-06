package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ej0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123a;
    public final /* synthetic */ a.ij0 b;
    public final /* synthetic */ a.vj0 c;
    public final /* synthetic */ android.widget.EditText d;
    public final /* synthetic */ java.io.Serializable e;

    public /* synthetic */ ej0(java.io.Serializable serializable, a.ij0 ij0Var, a.vj0 vj0Var, android.widget.EditText editText, int i) {
        this.f123a = i;
        this.e = serializable;
        this.b = ij0Var;
        this.c = vj0Var;
        this.d = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        java.lang.CharSequence text;
        java.lang.String obj;
        java.lang.CharSequence text2;
        java.lang.String obj2;
        int i2 = this.f123a;
        java.lang.String str = "";
        android.widget.EditText editText = this.d;
        a.vj0 vj0Var = this.c;
        a.ij0 ij0Var = this.b;
        java.io.Serializable serializable = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ia1 ia1Var = (a.ia1) serializable;
                a.wv.w(ia1Var, "$currentValue");
                a.wv.w(ij0Var, "$inputHandler");
                a.wv.w(vj0Var, "this$0");
                a.wv.w(editText, "$editText");
                if (i != 3 && i != 5 && i != 6) {
                    return false;
                }
                if (textView != null && (text = textView.getText()) != null && (obj = text.toString()) != null) {
                    str = obj;
                }
                try {
                    double parseDouble = java.lang.Double.parseDouble(str);
                    ia1Var.c = parseDouble;
                    ij0Var.setValue(java.lang.Double.valueOf(parseDouble));
                    if (i != 3) {
                        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
                        a.wv.t(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                        editText.clearFocus();
                    }
                } catch (java.lang.Exception unused) {
                    editText.setText(java.lang.String.valueOf(ia1Var.c));
                }
                return true;
            default:
                a.ma1 ma1Var = (a.ma1) serializable;
                a.wv.w(ma1Var, "$currentValue");
                a.wv.w(ij0Var, "$inputHandler");
                a.wv.w(vj0Var, "this$0");
                a.wv.w(editText, "$editText");
                if (i != 3 && i != 5 && i != 6) {
                    return false;
                }
                if (textView != null && (text2 = textView.getText()) != null && (obj2 = text2.toString()) != null) {
                    str = obj2;
                }
                ma1Var.c = str;
                ij0Var.setValue(str);
                if (i != 3) {
                    java.lang.Object systemService2 = editText.getContext().getSystemService("input_method");
                    a.wv.t(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((android.view.inputmethod.InputMethodManager) systemService2).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    editText.clearFocus();
                }
                return true;
        }
    }
}
