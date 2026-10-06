package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kn extends android.widget.Spinner {
    public static final int[] k = {android.R.attr.spinnerMode};
    public final a.ol c;
    public final android.content.Context d;
    public final a.h2 e;
    public android.widget.SpinnerAdapter f;
    public final boolean g;
    public final a.jn h;
    public int i;
    public final android.graphics.Rect j;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kn(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130969525(0x7f0403b5, float:1.7547734E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.j = r1
            android.content.Context r1 = r11.getContext()
            a.rl1.a(r1, r11)
            int[] r1 = a.u81.v
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r1, r0, r2)
            a.ol r4 = new a.ol
            r4.<init>(r11)
            r11.c = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L31
            a.dy r5 = new a.dy
            r5.<init>(r12, r4)
            r11.d = r5
            goto L33
        L31:
            r11.d = r12
        L33:
            r4 = -1
            r5 = 0
            int[] r6 = a.kn.k     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r7 == 0) goto L4c
            int r4 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L4c
        L46:
            r12 = move-exception
            r5 = r6
            goto Ld1
        L4a:
            r7 = move-exception
            goto L55
        L4c:
            r6.recycle()
            goto L5f
        L50:
            r12 = move-exception
            goto Ld1
        L53:
            r7 = move-exception
            r6 = r5
        L55:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5f
            goto L4c
        L5f:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L99
            if (r4 == r7) goto L66
            goto La6
        L66:
            a.hn r4 = new a.hn
            android.content.Context r8 = r11.d
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.d
            a.nk r1 = a.nk.G(r8, r13, r1, r0)
            java.lang.Object r8 = r1.e
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.i = r8
            android.graphics.drawable.Drawable r8 = r1.l(r7)
            r4.m(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.E = r6
            r1.K()
            r11.h = r4
            a.h2 r1 = new a.h2
            r1.<init>(r11, r11, r4, r7)
            r11.e = r1
            goto La6
        L99:
            a.en r1 = new a.en
            r1.<init>(r11)
            r11.h = r1
            java.lang.String r4 = r3.getString(r6)
            r1.f = r4
        La6:
            java.lang.CharSequence[] r1 = r3.getTextArray(r2)
            if (r1 == 0) goto Lbd
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131558723(0x7f0d0143, float:1.874277E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lbd:
            r3.recycle()
            r11.g = r7
            android.widget.SpinnerAdapter r12 = r11.f
            if (r12 == 0) goto Lcb
            r11.setAdapter(r12)
            r11.f = r5
        Lcb:
            a.ol r12 = r11.c
            r12.e(r13, r0)
            return
        Ld1:
            if (r5 == 0) goto Ld6
            r5.recycle()
        Ld6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kn.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = java.lang.Math.max(0, getSelectedItemPosition());
        int min = java.lang.Math.min(spinnerAdapter.getCount(), max + 15);
        android.view.View view = null;
        int i2 = 0;
        for (int max2 = java.lang.Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = java.lang.Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        android.graphics.Rect rect = this.j;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a.ol olVar = this.c;
        if (olVar != null) {
            olVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        a.jn jnVar = this.h;
        return jnVar != null ? jnVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        a.jn jnVar = this.h;
        return jnVar != null ? jnVar.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.h != null ? this.i : super.getDropDownWidth();
    }

    public final a.jn getInternalPopup() {
        return this.h;
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
        a.jn jnVar = this.h;
        return jnVar != null ? jnVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
        return this.d;
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
        a.jn jnVar = this.h;
        return jnVar != null ? jnVar.j() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a.jn jnVar = this.h;
        if (jnVar == null || !jnVar.b()) {
            return;
        }
        jnVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.h == null || android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        a.in inVar = (a.in) parcelable;
        super.onRestoreInstanceState(inVar.getSuperState());
        if (!inVar.c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a.ft(2, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View.BaseSavedState, android.os.Parcelable, a.in] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        in baseSavedState = new in(super.onSaveInstanceState());
        a.jn jnVar = this.h;
        baseSavedState.c = jnVar != null && jnVar.b();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        a.h2 h2Var = this.e;
        if (h2Var == null || !h2Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        a.jn jnVar = this.h;
        if (jnVar == null) {
            return super.performClick();
        }
        if (jnVar.b()) {
            return true;
        }
        this.h.e(a.cn.b(this), a.cn.a(this));
        return true;
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        a.jn jnVar = this.h;
        if (jnVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            jnVar.p(i);
            jnVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        a.jn jnVar = this.h;
        if (jnVar != null) {
            jnVar.n(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.h != null) {
            this.i = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        a.jn jnVar = this.h;
        if (jnVar != null) {
            jnVar.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.b20.Y(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence charSequence) {
        a.jn jnVar = this.h;
        if (jnVar != null) {
            jnVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, a.fn, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.g) {
            this.f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        a.jn jnVar = this.h;
        if (jnVar != null) {
            android.content.Context context = this.d;
            if (context == null) {
                context = getContext();
            }
            android.content.res.Resources.Theme theme = context.getTheme();
            fn obj = new fn();
            obj.c = spinnerAdapter;
            if (spinnerAdapter instanceof android.widget.ListAdapter) {
                obj.d = (android.widget.ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
                a.dn.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            jnVar.o(obj);
        }
    }
}
