package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class CornerView extends android.widget.FrameLayout {
    public float c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        a.wv.w(attributeSet, "attrs");
        android.graphics.Bitmap bitmap = a.wr.f;
        float f = a.wr.l;
        this.c = f;
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.k81.f285a);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.CornerView)");
        setCornerRadius(obtainStyledAttributes.getDimension(0, f));
        obtainStyledAttributes.recycle();
    }

    public final float getCornerRadius() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (!this.d) {
            setOutlineProvider(new a.pc1(this.c));
            setClipToOutline(true);
            this.d = true;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(android.view.View view) {
        if (!this.d) {
            setOutlineProvider(new a.pc1(this.c));
            setClipToOutline(true);
            this.d = true;
        }
        super.onViewAdded(view);
    }

    public final void setCornerRadius(float f) {
        this.c = f;
        if (this.d) {
            setOutlineProvider(new a.pc1(f));
            invalidateOutline();
        }
    }
}
