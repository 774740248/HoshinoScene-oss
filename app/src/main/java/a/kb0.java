package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kb0 implements android.text.TextWatcher {
    public final android.widget.EditText c;
    public a.jb0 e;
    public final boolean d = false;
    public boolean f = true;

    public kb0(android.widget.EditText editText) {
        this.c = editText;
    }

    public static void a(android.widget.EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            android.text.Editable editableText = editText.getEditableText();
            int selectionStart = android.text.Selection.getSelectionStart(editableText);
            int selectionEnd = android.text.Selection.getSelectionEnd(editableText);
            a.ta0 a2 = a.ta0.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                android.text.Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                android.text.Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                android.text.Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        android.widget.EditText editText = this.c;
        if (editText.isInEditMode() || !this.f) {
            return;
        }
        if ((this.d || a.ta0.j != null) && i2 <= i3 && (charSequence instanceof android.text.Spannable)) {
            int b = a.ta0.a().b();
            if (b != 0) {
                if (b == 1) {
                    a.ta0.a().f(i, i3 + i, (android.text.Spannable) charSequence);
                    return;
                } else if (b != 3) {
                    return;
                }
            }
            a.ta0 a2 = a.ta0.a();
            if (this.e == null) {
                this.e = new a.jb0(editText);
            }
            a2.g(this.e);
        }
    }
}
