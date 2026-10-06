package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uj0 implements android.text.TextWatcher {
    public final /* synthetic */ a.ia1 c;
    public final /* synthetic */ a.ij0 d;
    public final /* synthetic */ android.widget.EditText e;

    public uj0(a.ia1 ia1Var, a.u41 u41Var, android.widget.EditText editText) {
        this.c = ia1Var;
        this.d = u41Var;
        this.e = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        a.ia1 ia1Var = this.c;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        try {
            double parseDouble = java.lang.Double.parseDouble(str);
            ia1Var.c = parseDouble;
            this.d.setValue(java.lang.Double.valueOf(parseDouble));
        } catch (java.lang.Exception unused) {
            this.e.setText(java.lang.String.valueOf(ia1Var.c));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
