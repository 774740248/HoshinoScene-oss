package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SearchInputEditText extends android.widget.EditText {
    public a.qo0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchInputEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
    }

    public final a.qo0 getOnBackPressed() {
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        a.qo0 qo0Var;
        if (i == 4 && keyEvent != null && keyEvent.getAction() == 1 && (qo0Var = this.c) != null && ((java.lang.Boolean) qo0Var.b()).booleanValue()) {
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public final void setOnBackPressed(a.qo0 qo0Var) {
        this.c = qo0Var;
    }
}
