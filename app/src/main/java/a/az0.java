package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class az0 extends a.rl {
    public static final int[] A = {2130969542};
    public static final int[] B = {2130969541};
    public static final int[][] C = {new int[]{android.R.attr.state_enabled, 2130969541}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int D = android.content.res.Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final java.util.LinkedHashSet g;
    public final java.util.LinkedHashSet h;
    public android.content.res.ColorStateList i;
    public boolean j;
    public boolean k;
    public boolean l;
    public java.lang.CharSequence m;
    public android.graphics.drawable.Drawable n;
    public android.graphics.drawable.Drawable o;
    public boolean p;
    public android.content.res.ColorStateList q;
    public android.content.res.ColorStateList r;
    public android.graphics.PorterDuff.Mode s;
    public int t;
    public int[] u;
    public boolean v;
    public java.lang.CharSequence w;
    public android.widget.CompoundButton.OnCheckedChangeListener x;
    public final a.dl y;
    public final a.yy0 z;

    public az0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(a.wv.U1(context, attributeSet, 2130968734, 2132018216), attributeSet, 2130968734);
        this.g = new java.util.LinkedHashSet();
        this.h = new java.util.LinkedHashSet();
        android.content.Context context2 = getContext();
        a.dl dlVar = new a.dl(context2);
        android.content.res.Resources resources = context2.getResources();
        android.content.res.Resources.Theme theme = context2.getTheme();
        java.lang.ThreadLocal threadLocal = a.wb1.f656a;
        android.graphics.drawable.Drawable a2 = a.pb1.a(resources, 2131231162, theme);
        dlVar.c = a2;
        a2.setCallback(dlVar.h);
        new a.cl(dlVar.c.getConstantState());
        this.y = dlVar;
        this.z = new a.yy0(this);
        android.content.Context context3 = getContext();
        this.n = a.qw.a(this);
        this.q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = a.t81.q;
        a.b20.r(context3, attributeSet, 2130968734, 2132018216);
        a.b20.u(context3, attributeSet, iArr, 2130968734, 2132018216, new int[0]);
        a.nk nkVar = new a.nk(context3, context3.obtainStyledAttributes(attributeSet, iArr, 2130968734, 2132018216));
        this.o = nkVar.l(2);
        if (this.n != null && a.wv.n1(2130969125, context3, false)) {
            int x = nkVar.x(0, 0);
            int x2 = nkVar.x(1, 0);
            if (x == D && x2 == 0) {
                super.setButtonDrawable((android.graphics.drawable.Drawable) null);
                this.n = a.b20.Y(context3, 2131231161);
                this.p = true;
                if (this.o == null) {
                    this.o = a.b20.Y(context3, 2131231163);
                }
            }
        }
        this.r = a.wv.b0(context3, nkVar, 3);
        this.s = a.wv.X0(nkVar.o(4, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.j = nkVar.h(10, false);
        this.k = nkVar.h(6, true);
        this.l = nkVar.h(9, false);
        this.m = nkVar.A(8);
        if (nkVar.C(7)) {
            setCheckedState(nkVar.o(7, 0));
        }
        nkVar.K();
        a();
    }

    private java.lang.String getButtonStateDescription() {
        int i = this.t;
        return i == 1 ? getResources().getString(2131953018) : i == 0 ? getResources().getString(2131953020) : getResources().getString(2131953019);
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
        if (this.i == null) {
            int a0 = a.wv.a0(this, 2130968797);
            int a02 = a.wv.a0(this, 2130968800);
            int a03 = a.wv.a0(this, 2130968838);
            int a04 = a.wv.a0(this, 2130968816);
            this.i = new android.content.res.ColorStateList(C, new int[]{a.wv.N0(1.0f, a03, a02), a.wv.N0(1.0f, a03, a0), a.wv.N0(0.54f, a03, a04), a.wv.N0(0.38f, a03, a04), a.wv.N0(0.38f, a03, a04)});
        }
        return this.i;
    }

    private android.content.res.ColorStateList getSuperButtonTintList() {
        android.content.res.ColorStateList colorStateList = this.q;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i;
        int i2;
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        a.h1 h1Var;
        android.graphics.drawable.Drawable drawable = this.n;
        android.content.res.ColorStateList colorStateList3 = this.q;
        android.graphics.PorterDuff.Mode b = a.pw.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b != null) {
                a.i90.i(drawable, b);
            }
        }
        this.n = drawable;
        android.graphics.drawable.Drawable drawable2 = this.o;
        android.content.res.ColorStateList colorStateList4 = this.r;
        android.graphics.PorterDuff.Mode mode = this.s;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                a.i90.i(drawable2, mode);
            }
        }
        this.o = drawable2;
        if (this.p) {
            a.dl dlVar = this.y;
            if (dlVar != null) {
                android.graphics.drawable.Drawable drawable3 = dlVar.c;
                a.yy0 yy0Var = this.z;
                if (drawable3 != null) {
                    android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) drawable3;
                    if (yy0Var.f721a == null) {
                        yy0Var.f721a = new a.al(yy0Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(yy0Var.f721a);
                }
                java.util.ArrayList arrayList = dlVar.g;
                a.bl blVar = dlVar.d;
                if (arrayList != null && yy0Var != null) {
                    arrayList.remove(yy0Var);
                    if (dlVar.g.size() == 0 && (h1Var = dlVar.f) != null) {
                        blVar.b.removeListener(h1Var);
                        dlVar.f = null;
                    }
                }
                android.graphics.drawable.Drawable drawable4 = dlVar.c;
                if (drawable4 != null) {
                    android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable2 = (android.graphics.drawable.AnimatedVectorDrawable) drawable4;
                    if (yy0Var.f721a == null) {
                        yy0Var.f721a = new a.al(yy0Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(yy0Var.f721a);
                } else if (yy0Var != null) {
                    if (dlVar.g == null) {
                        dlVar.g = new java.util.ArrayList();
                    }
                    if (!dlVar.g.contains(yy0Var)) {
                        dlVar.g.add(yy0Var);
                        if (dlVar.f == null) {
                            dlVar.f = new a.h1(2, dlVar);
                        }
                        blVar.b.addListener(dlVar.f);
                    }
                }
            }
            android.graphics.drawable.Drawable drawable5 = this.n;
            if ((drawable5 instanceof android.graphics.drawable.AnimatedStateListDrawable) && dlVar != null) {
                ((android.graphics.drawable.AnimatedStateListDrawable) drawable5).addTransition(2131362217, 2131363323, dlVar, false);
                ((android.graphics.drawable.AnimatedStateListDrawable) this.n).addTransition(2131362647, 2131363323, dlVar, false);
            }
        }
        android.graphics.drawable.Drawable drawable6 = this.n;
        if (drawable6 != null && (colorStateList2 = this.q) != null) {
            a.i90.h(drawable6, colorStateList2);
        }
        android.graphics.drawable.Drawable drawable7 = this.o;
        if (drawable7 != null && (colorStateList = this.r) != null) {
            a.i90.h(drawable7, colorStateList);
        }
        android.graphics.drawable.Drawable drawable8 = this.n;
        android.graphics.drawable.Drawable drawable9 = this.o;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() == -1 || drawable9.getIntrinsicHeight() == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
                intrinsicHeight = drawable8.getIntrinsicHeight();
            } else {
                if (drawable9.getIntrinsicWidth() > drawable8.getIntrinsicWidth() || drawable9.getIntrinsicHeight() > drawable8.getIntrinsicHeight()) {
                    float intrinsicWidth2 = drawable9.getIntrinsicWidth() / drawable9.getIntrinsicHeight();
                    if (intrinsicWidth2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                        i2 = drawable8.getIntrinsicWidth();
                        i = (int) (i2 / intrinsicWidth2);
                    } else {
                        intrinsicHeight = drawable8.getIntrinsicHeight();
                        intrinsicWidth = (int) (intrinsicWidth2 * intrinsicHeight);
                    }
                } else {
                    i2 = drawable9.getIntrinsicWidth();
                    i = drawable9.getIntrinsicHeight();
                }
                layerDrawable.setLayerSize(1, i2, i);
                layerDrawable.setLayerGravity(1, 17);
                drawable8 = layerDrawable;
            }
            int i3 = intrinsicWidth;
            i = intrinsicHeight;
            i2 = i3;
            layerDrawable.setLayerSize(1, i2, i);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public android.graphics.drawable.Drawable getButtonDrawable() {
        return this.n;
    }

    public android.graphics.drawable.Drawable getButtonIconDrawable() {
        return this.o;
    }

    public android.content.res.ColorStateList getButtonIconTintList() {
        return this.r;
    }

    public android.graphics.PorterDuff.Mode getButtonIconTintMode() {
        return this.s;
    }

    @Override // android.widget.CompoundButton
    public android.content.res.ColorStateList getButtonTintList() {
        return this.q;
    }

    public int getCheckedState() {
        return this.t;
    }

    public java.lang.CharSequence getErrorAccessibilityLabel() {
        return this.m;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j && this.q == null && this.r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (this.l) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, B);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = java.util.Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.u = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable a2;
        if (!this.k || !android.text.TextUtils.isEmpty(getText()) || (a2 = a.qw.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (a.wv.I0(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            android.graphics.Rect bounds = a2.getBounds();
            a.i90.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.l) {
            accessibilityNodeInfo.setText(((java.lang.Object) accessibilityNodeInfo.getText()) + ", " + ((java.lang.Object) this.m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof a.zy0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a.zy0 zy0Var = (a.zy0) parcelable;
        super.onRestoreInstanceState(zy0Var.getSuperState());
        setCheckedState(zy0Var.c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View.BaseSavedState, android.os.Parcelable, a.zy0] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        zy0 baseSavedState = new zy0(super.onSaveInstanceState());
        baseSavedState.c = getCheckedState();
        return baseSavedState;
    }

    @Override // a.rl, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.b20.Y(getContext(), i));
    }

    public void setButtonIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.o = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(a.b20.Y(getContext(), i));
    }

    public void setButtonIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        a();
    }

    public void setButtonIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.s == mode) {
            return;
        }
        this.s = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(android.content.res.ColorStateList colorStateList) {
        if (this.q == colorStateList) {
            return;
        }
        this.q = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.k = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i) {
            this.t = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (android.os.Build.VERSION.SDK_INT >= 30 && this.w == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.v) {
                return;
            }
            this.v = true;
            java.util.LinkedHashSet linkedHashSet = this.h;
            if (linkedHashSet != null) {
                java.util.Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    a.ai1.t(it.next());
                    throw null;
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.x) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            android.view.autofill.AutofillManager autofillManager = (android.view.autofill.AutofillManager) getContext().getSystemService(android.view.autofill.AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.v = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(java.lang.CharSequence charSequence) {
        this.m = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        refreshDrawableState();
        java.util.Iterator it = this.g.iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.x = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(java.lang.CharSequence charSequence) {
        this.w = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (android.os.Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.j = z;
        if (z) {
            a.pw.c(this, getMaterialThemeColorsTintList());
        } else {
            a.pw.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // a.rl, android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.n = drawable;
        this.p = false;
        a();
    }
}
