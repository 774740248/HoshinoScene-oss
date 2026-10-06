package a;

import android.graphics.drawable.GradientDrawable;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class uq extends android.widget.FrameLayout {
    public static final a.tq n = new a.tq();
    public a.vq c;
    public final a.wg1 d;
    public int e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public android.content.res.ColorStateList j;
    public android.graphics.PorterDuff.Mode k;
    public android.graphics.Rect l;
    public boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public uq(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(a.wv.U1(context, attributeSet, 0, 0), attributeSet);
        android.graphics.drawable.GradientDrawable gradientDrawable;
        android.content.Context context2 = getContext();
        android.content.res.TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.t81.A);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.xp1.s(this, dimensionPixelSize);
        }
        this.e = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.d = a.wg1.b(context2, attributeSet, 0, 0).a();
        }
        this.f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(a.wv.c0(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(a.wv.X0(obtainStyledAttributes.getInt(5, -1), android.graphics.PorterDuff.Mode.SRC_IN));
        this.g = obtainStyledAttributes.getFloat(1, 1.0f);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(n);
        setFocusable(true);
        if (getBackground() == null) {
            int N0 = a.wv.N0(getBackgroundOverlayColorAlpha(), a.wv.a0(this, 2130968838), a.wv.a0(this, 2130968816));
            a.wg1 wg1Var = this.d;
            if (wg1Var != null) {
                a.hd0 hd0Var = a.vq.u;
                a.gz0 gz0Var = new a.gz0(wg1Var);
                gz0Var.l(android.content.res.ColorStateList.valueOf(N0));
                gradientDrawable = (GradientDrawable) gz0Var;
            } else {
                android.content.res.Resources resources = getResources();
                a.hd0 hd0Var2 = a.vq.u;
                float dimension = resources.getDimension(2131165918);
                android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(N0);
                gradientDrawable = gradientDrawable2;
            }
            android.content.res.ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                a.i90.h(gradientDrawable, colorStateList);
            }
            java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
            a.rp1.q(this, gradientDrawable);
        }
    }

    public static /* synthetic */ void a(a.uq uqVar, a.vq vqVar) {
        uqVar.setBaseTransientBottomBar(vqVar);
    }

    public void setBaseTransientBottomBar(a.vq vqVar) {
        this.c = vqVar;
    }

    public float getActionTextColorAlpha() {
        return this.g;
    }

    public int getAnimationMode() {
        return this.e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f;
    }

    public int getMaxInlineActionWidth() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        android.graphics.Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        a.vq vqVar = this.c;
        if (vqVar != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                android.view.WindowInsets rootWindowInsets = vqVar.i.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                    i = mandatorySystemGestureInsets.bottom;
                    vqVar.p = i;
                    vqVar.e();
                }
            } else {
                vqVar.getClass();
            }
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.vp1.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        a.xh1 xh1Var;
        super.onDetachedFromWindow();
        a.vq vqVar = this.c;
        if (vqVar != null) {
            a.yh1 b = a.yh1.b();
            a.sq sqVar = vqVar.t;
            synchronized (b.f710a) {
                if (!b.c(sqVar) && ((xh1Var = b.d) == null || sqVar == null || xh1Var.f689a.get() != sqVar)) {
                    z = false;
                }
                z = true;
            }
            if (z) {
                a.vq.x.post(new a.qq(vqVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a.vq vqVar = this.c;
        if (vqVar == null || !vqVar.r) {
            return;
        }
        vqVar.d();
        vqVar.r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.h;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.j != null) {
            drawable = drawable.mutate();
            a.i90.h(drawable, this.j);
            a.i90.i(drawable, this.k);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        this.j = colorStateList;
        if (getBackground() != null) {
            android.graphics.drawable.Drawable mutate = getBackground().mutate();
            a.i90.h(mutate, colorStateList);
            a.i90.i(mutate, this.k);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        this.k = mode;
        if (getBackground() != null) {
            android.graphics.drawable.Drawable mutate = getBackground().mutate();
            a.i90.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.m || !(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        this.l = new android.graphics.Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        a.vq vqVar = this.c;
        if (vqVar != null) {
            a.hd0 hd0Var = a.vq.u;
            vqVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : n);
        super.setOnClickListener(onClickListener);
    }
}
