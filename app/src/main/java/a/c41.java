package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63a;
    public final com.omarea.krscript.model.ActionParamInfo b;
    public final android.content.Context c;

    public c41(com.omarea.krscript.model.ActionParamInfo actionParamInfo, a.kk0 kk0Var, int i) {
        this.f63a = i;
        if (i == 1) {
            a.wv.w(kk0Var, "context");
            this.b = actionParamInfo;
            this.c = kk0Var;
            return;
        }
        if (i == 2) {
            a.wv.w(kk0Var, "context");
            this.b = actionParamInfo;
            this.c = kk0Var;
        } else if (i == 3) {
            a.wv.w(kk0Var, "context");
            this.b = actionParamInfo;
            this.c = kk0Var;
        } else if (i != 4) {
            a.wv.w(kk0Var, "context");
            this.b = actionParamInfo;
            this.c = kk0Var;
        } else {
            a.wv.w(kk0Var, "context");
            this.b = actionParamInfo;
            this.c = kk0Var;
        }
    }

    public static java.lang.String b(int i, int i2, int i3, int i4) {
        return a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)}, 4, "#%02x%02x%02x%02x", "format(format, *args)");
    }

    public static boolean d(android.widget.ImageView imageView, android.view.View view, java.lang.String str) {
        try {
            int parseColor = android.graphics.Color.parseColor(str);
            imageView.setVisibility(8);
            view.setVisibility(0);
            view.setBackground(new android.graphics.drawable.ColorDrawable(parseColor));
            return true;
        } catch (java.lang.Exception unused) {
            imageView.setVisibility(0);
            view.setVisibility(8);
            return false;
        }
    }

    public final boolean a(com.omarea.krscript.model.ActionParamInfo actionParamInfo) {
        switch (this.f63a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (actionParamInfo.getValueFromShell() != null) {
                    if (!a.wv.e(actionParamInfo.getValueFromShell(), "1")) {
                        java.lang.String valueFromShell = actionParamInfo.getValueFromShell();
                        a.wv.s(valueFromShell);
                        java.lang.String lowerCase = valueFromShell.toLowerCase(java.util.Locale.ROOT);
                        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!a.wv.e(lowerCase, "true")) {
                            return false;
                        }
                    }
                } else {
                    if (actionParamInfo.getValue() == null) {
                        return false;
                    }
                    if (!a.wv.e(actionParamInfo.getValue(), "1")) {
                        java.lang.String value = actionParamInfo.getValue();
                        a.wv.s(value);
                        java.lang.String lowerCase2 = value.toLowerCase(java.util.Locale.ROOT);
                        a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!a.wv.e(lowerCase2, "true")) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                if (actionParamInfo.getValueFromShell() != null) {
                    if (!a.wv.e(actionParamInfo.getValueFromShell(), "1")) {
                        java.lang.String valueFromShell2 = actionParamInfo.getValueFromShell();
                        a.wv.s(valueFromShell2);
                        java.lang.String lowerCase3 = valueFromShell2.toLowerCase(java.util.Locale.ROOT);
                        a.wv.v(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!a.wv.e(lowerCase3, "true")) {
                            return false;
                        }
                    }
                } else {
                    if (actionParamInfo.getValue() == null) {
                        return false;
                    }
                    if (!a.wv.e(actionParamInfo.getValue(), "1")) {
                        java.lang.String value2 = actionParamInfo.getValue();
                        a.wv.s(value2);
                        java.lang.String lowerCase4 = value2.toLowerCase(java.util.Locale.ROOT);
                        a.wv.v(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!a.wv.e(lowerCase4, "true")) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    public final android.view.View c() {
        final int i = 1;
        final int i2 = 0;
        switch (this.f63a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.View inflate = android.view.LayoutInflater.from(this.c).inflate(2131558594, (android.view.ViewGroup) null);
                android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(2131362691);
                checkBox.setTag(this.b.getName());
                checkBox.setChecked(a(this.b));
                java.lang.String label = this.b.getLabel();
                if (label != null && label.length() != 0) {
                    checkBox.setText(this.b.getLabel());
                }
                checkBox.setOnClickListener(new a.b41(i2));
                return inflate;
            case 1:
                android.view.View inflate2 = android.view.LayoutInflater.from(this.c).inflate(2131558595, (android.view.ViewGroup) null);
                android.widget.EditText editText = (android.widget.EditText) inflate2.findViewById(2131362695);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(2131362692);
                android.view.View findViewById = inflate2.findViewById(2131362694);
                editText.setTag(this.b.getName());
                editText.addTextChangedListener(new a.h41(this, editText, imageView, findViewById));
                if (this.b.getValueFromShell() != null) {
                    java.lang.String valueFromShell = this.b.getValueFromShell();
                    a.wv.s(valueFromShell);
                    editText.setText(valueFromShell);
                } else if (this.b.getValue() != null) {
                    java.lang.String value = this.b.getValue();
                    a.wv.s(value);
                    editText.setText(value);
                }
                a.wv.v(imageView, "invalidView");
                a.wv.v(findViewById, "preview");
                d(imageView, findViewById, editText.getText().toString());
                inflate2.findViewById(2131362693).setOnClickListener(new a.d41(this, editText, imageView, findViewById, 0));
                return inflate2;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                android.view.View inflate3 = android.view.LayoutInflater.from(this.c).inflate(2131558603, (android.view.ViewGroup) null);
                android.widget.EditText editText2 = (android.widget.EditText) inflate3.findViewById(2131362711);
                editText2.setTag(this.b.getName());
                if (this.b.getValueFromShell() != null) {
                    editText2.setText(this.b.getValueFromShell());
                } else if (this.b.getValue() != null) {
                    editText2.setText(this.b.getValue());
                }
                editText2.setFilters(new com.omarea.krscript.model.ParamInfoFilter[]{new com.omarea.krscript.model.ParamInfoFilter(this.b)});
                editText2.setEnabled(true ^ this.b.getReadonly());
                if (this.b.getPlaceholder().length() > 0) {
                    editText2.setHint(this.b.getPlaceholder());
                } else if ((a.wv.e(this.b.getType(), "int") || a.wv.e(this.b.getType(), "number")) && (this.b.getMin() != Integer.MIN_VALUE || this.b.getMax() != Integer.MAX_VALUE)) {
                    editText2.setHint(this.b.getMin() + " ~ " + this.b.getMax());
                }
                return inflate3;
            case 3:
                android.view.View inflate4 = android.view.LayoutInflater.from(this.c).inflate(2131558599, (android.view.ViewGroup) null);
                final android.widget.SeekBar seekBar = (android.widget.SeekBar) inflate4.findViewById(2131362704);
                seekBar.setMax(this.b.getMax());
                seekBar.setMax(this.b.getMax() - this.b.getMin());
                try {
                    if (this.b.getValueFromShell() != null) {
                        java.lang.String valueFromShell2 = this.b.getValueFromShell();
                        a.wv.s(valueFromShell2);
                        seekBar.setProgress(java.lang.Integer.parseInt(valueFromShell2) - this.b.getMin());
                    } else if (this.b.getValue() != null) {
                        java.lang.String value2 = this.b.getValue();
                        a.wv.s(value2);
                        seekBar.setProgress(java.lang.Integer.parseInt(value2) - this.b.getMin());
                    }
                } catch (java.lang.Exception unused) {
                }
                seekBar.setTag(this.b.getName());
                android.widget.ImageButton imageButton = (android.widget.ImageButton) inflate4.findViewById(2131362705);
                android.widget.ImageButton imageButton2 = (android.widget.ImageButton) inflate4.findViewById(2131362706);
                android.widget.TextView textView = (android.widget.TextView) inflate4.findViewById(2131362707);
                textView.setText(java.lang.String.valueOf(this.b.getMin() + seekBar.getProgress()));
                seekBar.setOnSeekBarChangeListener(new a.n41(textView, this, 0));
                imageButton.setOnClickListener(new a.m41());
                imageButton2.setOnClickListener(new a.m41());
                return inflate4;
            default:
                android.view.View inflate5 = android.view.LayoutInflater.from(this.c).inflate(2131558602, (android.view.ViewGroup) null);
                android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) inflate5.findViewById(2131362710);
                compoundButton.setTag(this.b.getName());
                compoundButton.setChecked(a(this.b));
                java.lang.String label2 = this.b.getLabel();
                if (label2 != null && label2.length() != 0) {
                    compoundButton.setText(this.b.getLabel());
                }
                compoundButton.setOnClickListener(new a.b41(i));
                return inflate5;
        }
    }
}
