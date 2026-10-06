package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q41 extends a.wb0 {
    public final int e;
    public android.widget.EditText f;
    public final a.gv g;

    public q41(a.vb0 vb0Var, int i) {
        super(vb0Var);
        this.e = 2131230917;
        this.g = new a.gv(2, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // a.wb0
    public final void b() {
        q();
    }

    @Override // a.wb0
    public final int c() {
        return 2131953113;
    }

    @Override // a.wb0
    public final int d() {
        return this.e;
    }

    @Override // a.wb0
    public final android.view.View.OnClickListener f() {
        return this.g;
    }

    @Override // a.wb0
    public final boolean k() {
        return true;
    }

    @Override // a.wb0
    public final boolean l() {
        android.widget.EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod));
    }

    @Override // a.wb0
    public final void m(android.widget.EditText editText) {
        this.f = editText;
        q();
    }

    @Override // a.wb0
    public final void r() {
        android.widget.EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // a.wb0
    public final void s() {
        android.widget.EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        }
    }
}
