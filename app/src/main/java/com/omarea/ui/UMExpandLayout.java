package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class UMExpandLayout extends android.widget.RelativeLayout {
    public final com.omarea.ui.UMExpandLayout c;
    public int d;
    public boolean e;

    public UMExpandLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = this;
        this.e = true;
        post(new a.hw(14, this));
    }

    public final void a() {
        android.view.ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (this.e) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = 0;
        }
        this.c.requestLayout();
    }
}
