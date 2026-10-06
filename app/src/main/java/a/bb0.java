package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bb0 extends a.ra0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f37a;
    public final java.lang.ref.WeakReference b;

    public bb0(android.widget.TextView textView, a.cb0 cb0Var) {
        this.f37a = new java.lang.ref.WeakReference(textView);
        this.b = new java.lang.ref.WeakReference(cb0Var);
    }

    @Override // a.ra0
    public final void a() {
        android.text.InputFilter[] filters;
        int length;
        android.widget.TextView textView = (android.widget.TextView) this.f37a.get();
        android.text.InputFilter inputFilter = (android.text.InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (android.text.InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    java.lang.CharSequence text = textView.getText();
                    a.ta0 a2 = a.ta0.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a2.getClass();
                        length = text.length();
                    }
                    java.lang.CharSequence f = a2.f(0, length, text);
                    if (text == f) {
                        return;
                    }
                    int selectionStart = android.text.Selection.getSelectionStart(f);
                    int selectionEnd = android.text.Selection.getSelectionEnd(f);
                    textView.setText(f);
                    if (f instanceof android.text.Spannable) {
                        android.text.Spannable spannable = (android.text.Spannable) f;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            android.text.Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            android.text.Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                android.text.Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
