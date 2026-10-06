package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tb0 extends a.ol1 {
    public final /* synthetic */ a.vb0 c;

    public tb0(a.vb0 vb0Var) {
        this.c = vb0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        this.c.b().a();
    }

    @Override // a.ol1, android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        this.c.b().b();
    }
}
