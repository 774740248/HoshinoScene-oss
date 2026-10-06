package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SeekBar extends android.widget.LinearLayout {
    public static final /* synthetic */ int i = 0;
    public final android.widget.SeekBar c;
    public final android.widget.TextView d;
    public a.bp0 e;
    public android.widget.SeekBar.OnSeekBarChangeListener f;
    public a.bp0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.e = new a.w00(1, this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558726, (android.view.ViewGroup) this, true);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j81.b);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.ProgressBar)");
        setAlpha(1.0f);
        android.view.View findViewById = inflate.findViewById(2131363069);
        a.wv.v(findViewById, "view.findViewById(R.id.seekbar)");
        this.c = (android.widget.SeekBar) findViewById;
        android.view.View findViewById2 = inflate.findViewById(2131363348);
        a.wv.v(findViewById2, "view.findViewById(R.id.value)");
        this.d = (android.widget.TextView) findViewById2;
        int integer = obtainStyledAttributes.getInteger(1, 0);
        int integer2 = obtainStyledAttributes.getInteger(0, 100);
        int integer3 = obtainStyledAttributes.getInteger(2, 0);
        setMin(integer);
        setMax(integer2);
        setProgress(integer3);
        android.widget.SeekBar seekBar = this.c;
        if (seekBar == null) {
            a.wv.M1("seekBar");
            throw null;
        }
        seekBar.setOnSeekBarChangeListener(new a.lg1(this));
        a();
    }

    public final void a() {
        android.widget.TextView textView = this.d;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) this.e.i(java.lang.Integer.valueOf(getProgress())));
        } else {
            a.wv.M1("textView");
            throw null;
        }
    }

    public final int getMax() {
        android.widget.SeekBar seekBar = this.c;
        if (seekBar != null) {
            return seekBar.getMax() + this.h;
        }
        a.wv.M1("seekBar");
        throw null;
    }

    public final int getMin() {
        return this.h;
    }

    public final int getProgress() {
        android.widget.SeekBar seekBar = this.c;
        if (seekBar != null) {
            return seekBar.getProgress() + this.h;
        }
        a.wv.M1("seekBar");
        throw null;
    }

    public final void setFormatter(a.bp0 bp0Var) {
        a.wv.w(bp0Var, "formatter");
        this.e = bp0Var;
    }

    public final void setMax(int i2) {
        android.widget.SeekBar seekBar = this.c;
        if (seekBar != null) {
            seekBar.setMax(i2 - this.h);
        } else {
            a.wv.M1("seekBar");
            throw null;
        }
    }

    public final void setMin(int i2) {
        this.h = i2;
    }

    public final void setOnChange(a.bp0 bp0Var) {
        a.wv.w(bp0Var, "listener");
        this.g = bp0Var;
    }

    public final void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        a.wv.w(onSeekBarChangeListener, "listener");
        this.f = onSeekBarChangeListener;
    }

    public final void setProgress(int i2) {
        android.widget.SeekBar seekBar = this.c;
        if (seekBar == null) {
            a.wv.M1("seekBar");
            throw null;
        }
        seekBar.setProgress(i2 - this.h);
        post(new a.fw(13, this));
    }
}
