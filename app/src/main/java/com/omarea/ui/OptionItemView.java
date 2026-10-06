package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class OptionItemView extends android.widget.LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a.wv.w(context, "context");
        setOrientation(0);
        setGravity(16);
        if (getMinimumHeight() == 0) {
            setMinimumHeight((int) (getResources().getDisplayMetrics().density * 65.0f));
        }
        if (getBackground() == null) {
            java.lang.Object obj = a.zx.f748a;
            setBackground(a.xx.b(context, 2131231112));
        }
        android.view.LayoutInflater.from(context).inflate(2131558718, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(2131362937);
        a.wv.v(findViewById, "findViewById(R.id.option_item_icon)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(2131362938);
        a.wv.v(findViewById2, "findViewById(R.id.option_item_title)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(2131362936);
        a.wv.v(findViewById3, "findViewById(R.id.option_item_desc)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.c, 0, 0);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…temView, defStyleAttr, 0)");
        try {
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(3);
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            int color = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getColor(1, 0) : context.getColor(2131099706);
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(color));
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setCornerRadius(getResources().getDimension(2131165272));
            gradientDrawable.setColor(a.sv.d(color, 37));
            imageView.setBackground(gradientDrawable);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            if (dimensionPixelSize >= 0) {
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            java.lang.String string = obtainStyledAttributes.getString(4);
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
            obtainStyledAttributes.recycle();
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled});
            a.wv.v(obtainStyledAttributes2, "context.obtainStyledAttr…(android.R.attr.enabled))");
            try {
                setEnabled(obtainStyledAttributes2.getBoolean(0, true));
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
