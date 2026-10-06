package com.omarea.common.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class OverScrollGridView extends android.widget.GridView {
    public int c;

    public OverScrollGridView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 400;
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, this.c, z);
    }

    public void setMaxOverScrollY(int i) {
        this.c = i;
    }
}
