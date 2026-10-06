package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CornerScrollView extends android.widget.ScrollView {
    public boolean c;

    public CornerScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (!this.c) {
            setOutlineProvider(new a.pc1(a.wr.l));
            setClipToOutline(true);
            this.c = true;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        if (!this.c) {
            setOutlineProvider(new a.pc1(a.wr.l));
            setClipToOutline(true);
            this.c = true;
        }
        super.onViewAdded(view);
    }
}
