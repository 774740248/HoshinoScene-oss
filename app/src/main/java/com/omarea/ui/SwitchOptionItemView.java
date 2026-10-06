package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SwitchOptionItemView extends android.widget.LinearLayout implements android.widget.Checkable {
    public final android.widget.ImageView c;
    public final android.widget.TextView d;
    public final android.widget.TextView e;
    public final android.widget.Switch f;
    public final android.widget.ImageView g;
    public final boolean h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchOptionItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a.wv.w(context, "context");
        setOrientation(0);
        setGravity(16);
        setClickable(true);
        if (getMinimumHeight() == 0) {
            setMinimumHeight((int) (getResources().getDisplayMetrics().density * 60.0f));
        }
        android.view.LayoutInflater.from(context).inflate(2131558719, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(2131363223);
        a.wv.v(findViewById, "findViewById(R.id.switch_option_item_icon)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.c = imageView;
        android.view.View findViewById2 = findViewById(2131363225);
        a.wv.v(findViewById2, "findViewById(R.id.switch_option_item_title)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.d = textView;
        android.view.View findViewById3 = findViewById(2131363222);
        a.wv.v(findViewById3, "findViewById(R.id.switch_option_item_desc)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.e = textView2;
        android.view.View findViewById4 = findViewById(2131363224);
        a.wv.v(findViewById4, "findViewById(R.id.switch_option_item_switch)");
        android.widget.Switch r5 = (android.widget.Switch) findViewById4;
        this.f = r5;
        android.view.View findViewById5 = findViewById(2131363221);
        a.wv.v(findViewById5, "findViewById(R.id.switch_option_item_arrow)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById5;
        this.g = imageView2;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.f, 0, 0);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…temView, defStyleAttr, 0)");
        try {
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(4);
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            int color = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getColor(2, 0) : context.getColor(2131099706);
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(color));
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setCornerRadius(getResources().getDimension(2131165272));
            gradientDrawable.setColor(a.sv.d(color, 37));
            imageView.setBackground(gradientDrawable);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            if (dimensionPixelSize >= 0) {
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            java.lang.String string = obtainStyledAttributes.getString(5);
            if (string != null) {
                textView.setText(string);
            }
            java.lang.String string2 = obtainStyledAttributes.getString(0);
            if (string2 != null) {
                if (string2.length() == 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(string2);
                }
            }
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            this.h = z;
            obtainStyledAttributes.recycle();
            if (z) {
                r5.setVisibility(8);
                imageView2.setVisibility(0);
            }
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled, android.R.attr.checked});
            a.wv.v(obtainStyledAttributes2, "context.obtainStyledAttr…R.attr.checked)\n        )");
            try {
                setEnabled(obtainStyledAttributes2.getBoolean(0, true));
                setChecked(obtainStyledAttributes2.getBoolean(1, false));
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final android.widget.TextView getDescView() {
        return this.e;
    }

    public final android.widget.TextView getTitleView() {
        return this.d;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        a.wv.w(motionEvent, "ev");
        if (motionEvent.getActionMasked() == 0) {
            android.widget.Switch r0 = this.f;
            if (r0.getVisibility() == 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                r0.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!isEnabled()) {
            return false;
        }
        toggle();
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.f.setChecked(z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f.setEnabled(z);
        this.d.setEnabled(z);
        this.e.setEnabled(z);
        this.c.setEnabled(z);
        this.g.setEnabled(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (this.h) {
            return;
        }
        setChecked(!this.i);
    }
}
