package a;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class vn extends android.widget.TextView {
    public final a.ol c;
    public final a.sn d;
    public final a.pm e;
    public a.qm f;
    public boolean g;
    public a.vu0 h;
    public java.util.concurrent.Future i;

    public vn(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    private a.qm getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new a.qm(this);
        }
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.a();
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a.zr1.b) {
            return super.getAutoSizeMaxTextSize();
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            return java.lang.Math.round(snVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (a.zr1.b) {
            return super.getAutoSizeMinTextSize();
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            return java.lang.Math.round(snVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (a.zr1.b) {
            return super.getAutoSizeStepGranularity();
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            return java.lang.Math.round(snVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (a.zr1.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        a.sn snVar = this.d;
        return snVar != null ? snVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @android.annotation.SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (a.zr1.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            return snVar.i.f75a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof a.ml1 ? ((a.ml1) customSelectionActionModeCallback).f355a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a.tn getSuperCaller() {
        if (this.h == null) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                this.h = new a.un(this);
            } else {
                this.h = new a.vu0(6, this);
            }
        }
        return this.h;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        a.ol olVar = this.c;
        if (olVar != null) {
            return olVar.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        a.ol olVar = this.c;
        if (olVar != null) {
            return olVar.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        a.pm pmVar;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (pmVar = this.e) == null) {
            return super.getTextClassifier();
        }
        android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) pmVar.e;
        return textClassifier == null ? a.ln.a((android.widget.TextView) pmVar.d) : textClassifier;
    }

    public a.s61 getTextMetricsParamsCompat() {
        return a.b20.p0(this);
    }

    public final void l() {
        java.util.concurrent.Future future = this.i;
        if (future == null) {
            return;
        }
        try {
            this.i = null;
            a.ai1.t(future.get());
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            a.b20.p0(this);
            throw null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.d.getClass();
        a.sn.h(this, onCreateInputConnection, editorInfo);
        a.b20.I0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a.sn snVar = this.d;
        if (snVar == null || a.zr1.b) {
            return;
        }
        snVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        l();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        a.sn snVar = this.d;
        if (snVar == null || a.zr1.b) {
            return;
        }
        a.co coVar = snVar.i;
        if (coVar.f()) {
            coVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a.zr1.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a.zr1.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a.zr1.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b20.C1(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(((a.fa0) getEmojiTextViewHelper().b.d).l(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i);
        } else {
            a.b20.h1(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            a.b20.j1(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        java.lang.Object r0 = null;
        a.wv.r(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(a.t61 t61Var) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        a.b20.p0(this);
        throw null;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        a.sn snVar = this.d;
        snVar.l(colorStateList);
        snVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        a.sn snVar = this.d;
        snVar.m(mode);
        snVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        a.pm pmVar;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (pmVar = this.e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            pmVar.e = textClassifier;
        }
    }

    public void setTextFuture(java.util.concurrent.Future<a.t61> future) {
        this.i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.s61 s61Var) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.TextDirectionHeuristic textDirectionHeuristic2 = s61Var.b;
        android.text.TextDirectionHeuristic textDirectionHeuristic3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        a.il1.h(this, i);
        getPaint().set(s61Var.f519a);
        a.jl1.e(this, s61Var.c);
        a.jl1.h(this, s61Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = a.zr1.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        a.sn snVar = this.d;
        if (snVar == null || z) {
            return;
        }
        a.co coVar = snVar.i;
        if (coVar.f()) {
            return;
        }
        coVar.g(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface, int i) {
        android.graphics.Typeface typeface2;
        if (this.g) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            android.content.Context context = getContext();
            a.vu0 vu0Var = a.do1.f102a;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null");
            }
            typeface2 = android.graphics.Typeface.create(typeface, i);
        }
        this.g = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.g = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a.mm1.a(context);
        this.g = false;
        this.h = null;
        a.rl1.a(getContext(), this);
        a.ol olVar = new a.ol(this);
        this.c = olVar;
        olVar.e(attributeSet, i);
        a.sn snVar = new a.sn(this);
        this.d = snVar;
        snVar.f(attributeSet, i);
        snVar.b();
        this.e = new a.pm(this);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? a.b20.Y(context, i) : null, i2 != 0 ? a.b20.Y(context, i2) : null, i3 != 0 ? a.b20.Y(context, i3) : null, i4 != 0 ? a.b20.Y(context, i4) : null);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? a.b20.Y(context, i) : null, i2 != 0 ? a.b20.Y(context, i2) : null, i3 != 0 ? a.b20.Y(context, i3) : null, i4 != 0 ? a.b20.Y(context, i4) : null);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.b();
        }
    }
}
