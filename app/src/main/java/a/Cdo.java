package a;

/* renamed from: a.do, reason: invalid class name */
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class Cdo extends android.widget.ToggleButton {
    public final a.ol c;
    public final a.sn d;
    public a.qm e;

    public Cdo(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, android.R.attr.buttonStyleToggle);
        a.rl1.a(getContext(), this);
        a.ol olVar = new a.ol(this);
        this.c = olVar;
        olVar.e(attributeSet, android.R.attr.buttonStyleToggle);
        a.sn snVar = new a.sn(this);
        this.d = snVar;
        snVar.f(attributeSet, android.R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, android.R.attr.buttonStyleToggle);
    }

    private a.qm getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new a.qm(this);
        }
        return this.e;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(((a.fa0) getEmojiTextViewHelper().b.d).l(inputFilterArr));
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
}
