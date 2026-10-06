package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h41 implements android.text.TextWatcher {
    public final /* synthetic */ a.c41 c;
    public final /* synthetic */ android.widget.EditText d;
    public final /* synthetic */ android.widget.ImageView e;
    public final /* synthetic */ android.view.View f;

    public h41(a.c41 c41Var, android.widget.EditText editText, android.widget.ImageView imageView, android.view.View view) {
        this.c = c41Var;
        this.d = editText;
        this.e = imageView;
        this.f = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        a.wv.v(this.d, "textView");
        android.widget.ImageView imageView = this.e;
        a.wv.v(imageView, "invalidView");
        android.view.View view = this.f;
        a.wv.v(view, "preview");
        a.wv.s(editable);
        java.lang.String obj = editable.toString();
        this.c.getClass();
        a.c41.d(imageView, view, obj);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }
}
