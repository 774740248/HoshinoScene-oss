package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ab0 extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f6a;
    public final a.fa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(android.widget.EditText editText, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        super(inputConnection, false);
        a.fa0 fa0Var = new a.fa0(14, (java.lang.Object) null);
        this.f6a = editText;
        this.b = fa0Var;
        if (a.ta0.j != null) {
            a.ta0 a2 = a.ta0.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new android.os.Bundle();
            }
            a2.e.G(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        android.text.Editable editableText = this.f6a.getEditableText();
        this.b.getClass();
        return a.fa0.t(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        android.text.Editable editableText = this.f6a.getEditableText();
        this.b.getClass();
        return a.fa0.t(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
