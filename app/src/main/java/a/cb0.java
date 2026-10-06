package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cb0 implements android.text.InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f64a;
    public a.bb0 b;

    public cb0(android.widget.TextView textView) {
        this.f64a = textView;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        android.widget.TextView textView = this.f64a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b = a.ta0.a().b();
        if (b != 0) {
            if (b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return a.ta0.a().f(0, charSequence.length(), charSequence);
            }
            if (b != 3) {
                return charSequence;
            }
        }
        a.ta0 a2 = a.ta0.a();
        if (this.b == null) {
            this.b = new a.bb0(textView, this);
        }
        a2.g(this.b);
        return charSequence;
    }
}
