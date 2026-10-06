package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ly0 extends a.nl {
    public final a.vw0 g;
    public final android.view.accessibility.AccessibilityManager h;
    public final android.graphics.Rect i;
    public final int j;
    public final float k;
    public int l;
    public android.content.res.ColorStateList m;

    public ly0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(a.wv.U1(context, attributeSet, 2130968634, 0), attributeSet);
        this.i = new android.graphics.Rect();
        android.content.Context context2 = getContext();
        android.content.res.TypedArray H0 = a.b20.H0(context2, attributeSet, a.t81.l, 2130968634, 2132017934, new int[0]);
        if (H0.hasValue(0) && H0.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.j = H0.getResourceId(2, 2131558684);
        this.k = H0.getDimensionPixelOffset(1, 2131165841);
        this.l = H0.getColor(3, 0);
        this.m = a.wv.c0(context2, H0, 4);
        this.h = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        a.vw0 vw0Var = new a.vw0(context2, null, 2130969257, 0);
        this.g = vw0Var;
        vw0Var.A = true;
        vw0Var.B.setFocusable(true);
        vw0Var.q = this;
        vw0Var.B.setInputMethodMode(2);
        vw0Var.o(getAdapter());
        vw0Var.r = new a.dg1(this, 1);
        if (H0.hasValue(5)) {
            setSimpleItems(H0.getResourceId(5, 0));
        }
        H0.recycle();
    }

    public static void a(a.ly0 ly0Var, java.lang.Object obj) {
        ly0Var.setText(ly0Var.convertSelectionToString(obj), false);
    }

    public final com.google.android.material.textfield.TextInputLayout b() {
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.textfield.TextInputLayout) {
                return (com.google.android.material.textfield.TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.g.dismiss();
        }
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
        com.google.android.material.textfield.TextInputLayout b = b();
        return (b == null || !b.isProvidingHint) ? super.getHint() : b.getHint();
    }

    public float getPopupElevation() {
        return this.k;
    }

    public int getSimpleItemSelectedColor() {
        return this.l;
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
        return this.m;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.textfield.TextInputLayout b = b();
        if (b != null && b.isProvidingHint && super.getHint() == null && android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            android.widget.ListAdapter adapter = getAdapter();
            com.google.android.material.textfield.TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                a.vw0 vw0Var = this.g;
                int min = java.lang.Math.min(adapter.getCount(), java.lang.Math.max(0, !vw0Var.B.isShowing() ? -1 : vw0Var.e.getSelectedItemPosition()) + 15);
                android.view.View view = null;
                int i4 = 0;
                for (int max = java.lang.Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = java.lang.Math.max(i4, view.getMeasuredWidth());
                }
                android.graphics.drawable.Drawable background = vw0Var.B.getBackground();
                if (background != null) {
                    android.graphics.Rect rect = this.i;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(measuredWidth, i3), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.g.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        a.vw0 vw0Var = this.g;
        if (vw0Var != null) {
            vw0Var.m(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.g.s = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        com.google.android.material.textfield.TextInputLayout b = b();
        if (b != null) {
            b.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.l = i;
        if (getAdapter() instanceof a.ky0) {
            ((a.ky0) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList colorStateList) {
        this.m = colorStateList;
        if (getAdapter() instanceof a.ky0) {
            ((a.ky0) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.g.f();
        }
    }

    public void setSimpleItems(java.lang.String[] strArr) {
        setAdapter(new a.ky0(this, getContext(), this.j, strArr));
    }
}
