package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class wm extends android.widget.RadioButton implements a.pm1 {

    public wm() {
        this(null, null);
    }
    public final a.tl c;
    public final a.ol d;
    public final a.sn e;
    public a.qm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130969450);
        a.mm1.a(context);
        a.rl1.a(getContext(), this);
        a.tl tlVar = new a.tl(this, 1);
        this.c = tlVar;
        tlVar.c(attributeSet, 2130969450);
        a.ol olVar = new a.ol(this);
        this.d = olVar;
        olVar.e(attributeSet, 2130969450);
        a.sn snVar = new a.sn(this);
        this.e = snVar;
        snVar.f(attributeSet, 2130969450);
        getEmojiTextViewHelper().a(attributeSet, 2130969450);
    }

    private a.qm getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new a.qm(this);
        }
        return this.f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a.ol olVar = this.d;
        if (olVar != null) {
            olVar.a();
        }
        a.sn snVar = this.e;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        a.tl tlVar = this.c;
        if (tlVar != null) {
            tlVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        a.ol olVar = this.d;
        if (olVar != null) {
            return olVar.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        a.ol olVar = this.d;
        if (olVar != null) {
            return olVar.d();
        }
        return null;
    }

    @Override // a.pm1
    public android.content.res.ColorStateList getSupportButtonTintList() {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            return tlVar.b;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            return tlVar.c;
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.e.d();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.e.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.ol olVar = this.d;
        if (olVar != null) {
            olVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a.ol olVar = this.d;
        if (olVar != null) {
            olVar.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        super.setButtonDrawable(drawable);
        a.tl tlVar = this.c;
        if (tlVar != null) {
            if (tlVar.f) {
                tlVar.f = false;
            } else {
                tlVar.f = true;
                tlVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a.sn snVar = this.e;
        if (snVar != null) {
            snVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a.sn snVar = this.e;
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
        a.ol olVar = this.d;
        if (olVar != null) {
            olVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        a.ol olVar = this.d;
        if (olVar != null) {
            olVar.j(mode);
        }
    }

    @Override // a.pm1
    public void setSupportButtonTintList(android.content.res.ColorStateList colorStateList) {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            tlVar.b = colorStateList;
            tlVar.d = true;
            tlVar.a();
        }
    }

    @Override // a.pm1
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            tlVar.c = mode;
            tlVar.e = true;
            tlVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        a.sn snVar = this.e;
        snVar.l(colorStateList);
        snVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        a.sn snVar = this.e;
        snVar.m(mode);
        snVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.b20.Y(getContext(), i));
    }
}
