package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class InputView extends android.widget.LinearLayout {
    public int c;
    public a.bp0 d;
    public final android.widget.TextView e;
    public final android.widget.EditText f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        setOrientation(1);
        setBackgroundResource(2131231083);
        int a2 = a(10);
        setPadding(a2, a(4), a2, a(4));
        android.view.View.inflate(getContext(), 2131558724, this);
        android.view.View findViewById = findViewById(2131362652);
        a.wv.v(findViewById, "findViewById(R.id.input_view_title)");
        this.e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(2131362651);
        a.wv.v(findViewById2, "findViewById(R.id.input_view_edit)");
        android.widget.EditText editText = (android.widget.EditText) findViewById2;
        this.f = editText;
        editText.addTextChangedListener(new a.yf1(2, this));
        if (attributeSet == null) {
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.j81.f249a);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.InputView)");
        try {
            setTitle(obtainStyledAttributes.getText(7));
            java.lang.CharSequence text = obtainStyledAttributes.getText(3);
            if (text != null) {
                setHint(text);
            }
            java.lang.CharSequence text2 = obtainStyledAttributes.getText(2);
            if (text2 != null) {
                setText(text2);
            }
            if (obtainStyledAttributes.hasValue(6)) {
                setInputType(obtainStyledAttributes.getInt(6, 1));
            }
            setMaxLength(obtainStyledAttributes.getInt(5, 0));
            int i = obtainStyledAttributes.getInt(4, 0);
            if (i > 0) {
                editText.setMinLines(i);
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            if (i2 != -1) {
                editText.setGravity(i2);
            }
            setEnabled(obtainStyledAttributes.getBoolean(0, true));
            obtainStyledAttributes.recycle();
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final android.widget.EditText getEditText() {
        return this.f;
    }

    public final java.lang.CharSequence getHint() {
        return this.f.getHint();
    }

    public final int getInputType() {
        return this.f.getInputType();
    }

    public final int getMaxLength() {
        return this.c;
    }

    public final a.bp0 getOnTextChanged() {
        return this.d;
    }

    public final java.lang.CharSequence getText() {
        android.text.Editable text = this.f.getText();
        a.wv.v(text, "editText.text");
        return text;
    }

    public final java.lang.CharSequence getTitle() {
        return this.e.getText();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f.setEnabled(z);
    }

    public final void setHint(java.lang.CharSequence charSequence) {
        this.f.setHint(charSequence);
    }

    public final void setInputType(int i) {
        this.f.setInputType(i);
    }

    public final void setMaxLength(int i) {
        this.c = i;
        this.f.setFilters(i > 0 ? new android.text.InputFilter.LengthFilter[]{new android.text.InputFilter.LengthFilter(i)} : new android.text.InputFilter[0]);
    }

    public final void setOnTextChanged(a.bp0 bp0Var) {
        this.d = bp0Var;
    }

    public final void setText(java.lang.CharSequence charSequence) {
        a.wv.w(charSequence, "value");
        android.widget.EditText editText = this.f;
        editText.setText(charSequence);
        editText.setSelection(editText.getText().length());
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        this.e.setText(charSequence);
    }
}
