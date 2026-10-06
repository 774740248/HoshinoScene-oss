package com.omarea.ui;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class NavItem extends android.widget.RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.b);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.NavItem)");
        android.view.LayoutInflater.from(context).inflate(attributeSet != null ? obtainStyledAttributes.getResourceId(1, 2131558710) : 2131558710, (android.view.ViewGroup) this, true);
        if (attributeSet != null) {
            java.lang.CharSequence text = obtainStyledAttributes.getText(2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) text);
            java.lang.String sb2 = sb.toString();
            android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
            android.view.View findViewById = findViewById(android.R.id.icon);
            a.wv.t(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ((android.widget.ImageView) findViewById).setImageDrawable(drawable);
            android.view.View findViewById2 = findViewById(android.R.id.title);
            a.wv.t(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) findViewById2).setText(sb2);
        }
        obtainStyledAttributes.recycle();
    }

    public final java.lang.CharSequence getText() {
        android.view.View findViewById = findViewById(android.R.id.title);
        a.wv.t(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        java.lang.CharSequence text = ((android.widget.TextView) findViewById).getText();
        a.wv.v(text, "findViewById<View>(andro….title) as TextView).text");
        return text;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(android.R.id.icon);
        android.widget.TextView textView = (android.widget.TextView) findViewById(android.R.id.title);
        imageView.setAlpha(z ? 1.0f : 0.5f);
        textView.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void setText(java.lang.String str) {
        ((android.widget.TextView) findViewById(android.R.id.title)).setText(str);
    }
}
