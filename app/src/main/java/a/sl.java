package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sl extends android.widget.CheckedTextView {
    public final a.tl c;
    public final a.ol d;
    public final a.sn e;
    public a.qm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130968745);
        a.mm1.a(context);
        a.rl1.a(getContext(), this);
        a.sn snVar = new a.sn(this);
        this.e = snVar;
        snVar.f(attributeSet, 2130968745);
        snVar.b();
        a.ol olVar = new a.ol(this);
        this.d = olVar;
        olVar.e(attributeSet, 2130968745);
        a.tl tlVar = new a.tl(this, 0);
        this.c = tlVar;
        tlVar.c(attributeSet, 2130968745);
        getEmojiTextViewHelper().a(attributeSet, 2130968745);
    }

    private a.qm getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new a.qm(this);
        }
        return this.f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a.sn snVar = this.e;
        if (snVar != null) {
            snVar.b();
        }
        a.ol olVar = this.d;
        if (olVar != null) {
            olVar.a();
        }
        a.tl tlVar = this.c;
        if (tlVar != null) {
            tlVar.b();
        }
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof a.ml1 ? ((a.ml1) customSelectionActionModeCallback).f355a : customSelectionActionModeCallback;
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

    public android.content.res.ColorStateList getSupportCheckMarkTintList() {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            return tlVar.b;
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b20.I0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(android.graphics.drawable.Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        a.tl tlVar = this.c;
        if (tlVar != null) {
            if (tlVar.f) {
                tlVar.f = false;
            } else {
                tlVar.f = true;
                tlVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b20.C1(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList colorStateList) {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            tlVar.b = colorStateList;
            tlVar.d = true;
            tlVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff.Mode mode) {
        a.tl tlVar = this.c;
        if (tlVar != null) {
            tlVar.c = mode;
            tlVar.e = true;
            tlVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        a.sn snVar = this.e;
        if (snVar != null) {
            snVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b20.Y(getContext(), i));
    }
}
