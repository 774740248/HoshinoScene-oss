package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ub0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.vb0 f586a;

    public ub0(a.vb0 vb0Var) {
        this.f586a = vb0Var;
    }

    public final void a(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        a.vb0 vb0Var = this.f586a;
        if (vb0Var.u == textInputLayout.getEditText()) {
            return;
        }
        android.widget.EditText editText = vb0Var.u;
        a.tb0 tb0Var = vb0Var.x;
        if (editText != null) {
            editText.removeTextChangedListener(tb0Var);
            if (vb0Var.u.getOnFocusChangeListener() == vb0Var.b().e()) {
                vb0Var.u.setOnFocusChangeListener(null);
            }
        }
        android.widget.EditText editText2 = textInputLayout.getEditText();
        vb0Var.u = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(tb0Var);
        }
        vb0Var.b().m(vb0Var.u);
        vb0Var.i(vb0Var.b());
    }
}
