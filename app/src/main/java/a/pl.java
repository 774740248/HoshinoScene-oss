package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class pl extends android.widget.Button {
    public final a.ol c;
    public final a.sn d;
    public a.qm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a.mm1.a(context);
        a.rl1.a(getContext(), this);
        a.ol olVar = new a.ol(this);
        this.c = olVar;
        olVar.e(attributeSet, i);
        a.sn snVar = new a.sn(this);
        this.d = snVar;
        snVar.f(attributeSet, i);
        snVar.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private a.qm getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new a.qm(this);
        }
        return this.e;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a.sn snVar = this.d;
        if (snVar == null || a.zr1.b) {
            return;
        }
        snVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
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

    public void setSupportAllCaps(boolean z) {
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.f531a.setAllCaps(z);
        }
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
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        a.sn snVar = this.d;
        if (snVar != null) {
            snVar.g(context, i);
        }
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
}
