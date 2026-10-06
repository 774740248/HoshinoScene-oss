package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class nl extends android.widget.AutoCompleteTextView {
    public static final int[] f = {android.R.attr.popupBackground};
    public final a.ol c;
    public final a.sn d;
    public final a.pm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130968634);
        a.mm1.a(context);
        a.rl1.a(getContext(), this);
        a.nk G = a.nk.G(getContext(), attributeSet, f, 2130968634);
        if (G.C(0)) {
            setDropDownBackgroundDrawable(G.l(0));
        }
        G.K();
        a.ol olVar = new a.ol(this);
        this.c = olVar;
        olVar.e(attributeSet, 2130968634);
        a.sn snVar = new a.sn(this);
        this.d = snVar;
        snVar.f(attributeSet, 2130968634);
        snVar.b();
        a.pm pmVar = new a.pm((android.widget.EditText) this);
        this.e = pmVar;
        pmVar.A(attributeSet, 2130968634);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener s = pmVar.s(keyListener);
            if (s == keyListener) {
                return;
            }
            super.setKeyListener(s);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
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

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b20.I0(this, editorInfo, onCreateInputConnection);
        return this.e.B(onCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b20.C1(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b20.Y(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((a.ya0) this.e.e).f705a.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.e.s(keyListener));
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
}
