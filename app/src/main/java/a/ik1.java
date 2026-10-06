package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ik1 extends android.widget.LinearLayout {
    public static final /* synthetic */ int n = 0;
    public a.fk1 c;
    public android.widget.TextView d;
    public android.widget.ImageView e;
    public android.view.View f;
    public a.eq g;
    public android.view.View h;
    public android.widget.TextView i;
    public android.widget.ImageView j;
    public android.graphics.drawable.Drawable k;
    public int l;
    public final /* synthetic */ com.google.android.material.tabs.TabLayout m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        this.m = tabLayout;
        this.l = 2;
        f(context);
        int i = tabLayout.tabPaddingStart;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.sp1.k(this, i, tabLayout.tabPaddingTop, tabLayout.tabPaddingEnd, tabLayout.tabPaddingBottom);
        setGravity(17);
        setOrientation(!tabLayout.inlineLabel ? 1 : 0);
        setClickable(true);
        a.zp1.d(this, a.y51.b(getContext(), 1002));
    }

    private a.eq getBadge() {
        return this.g;
    }

    private a.eq getOrCreateBadge() {
        if (this.g == null) {
            this.g = new a.eq(getContext());
        }
        c();
        a.eq eqVar = this.g;
        if (eqVar != null) {
            return eqVar;
        }
        throw new java.lang.IllegalStateException("Unable to create badge");
    }

    public final void a(android.view.View view) {
        if (this.g == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        a.eq eqVar = this.g;
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        eqVar.setBounds(rect);
        eqVar.e(view, null);
        java.lang.ref.WeakReference weakReference = eqVar.o;
        if ((weakReference != null ? (android.widget.FrameLayout) weakReference.get() : null) != null) {
            java.lang.ref.WeakReference weakReference2 = eqVar.o;
            (weakReference2 != null ? (android.widget.FrameLayout) weakReference2.get() : null).setForeground(eqVar);
        } else {
            view.getOverlay().add(eqVar);
        }
        this.f = view;
    }

    public final void b() {
        if (this.g != null) {
            setClipChildren(true);
            setClipToPadding(true);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            android.view.View view = this.f;
            if (view != null) {
                a.eq eqVar = this.g;
                if (eqVar != null) {
                    java.lang.ref.WeakReference weakReference = eqVar.o;
                    if ((weakReference != null ? (android.widget.FrameLayout) weakReference.get() : null) != null) {
                        java.lang.ref.WeakReference weakReference2 = eqVar.o;
                        (weakReference2 != null ? (android.widget.FrameLayout) weakReference2.get() : null).setForeground(null);
                    } else {
                        view.getOverlay().remove(eqVar);
                    }
                }
                this.f = null;
            }
        }
    }

    public final void c() {
        a.fk1 fk1Var;
        if (this.g != null) {
            if (this.h != null) {
                b();
                return;
            }
            android.widget.ImageView imageView = this.e;
            if (imageView != null && (fk1Var = this.c) != null && fk1Var.f152a != null) {
                if (this.f == imageView) {
                    d(imageView);
                    return;
                } else {
                    b();
                    a(this.e);
                    return;
                }
            }
            android.widget.TextView textView = this.d;
            if (textView == null || this.c == null) {
                b();
            } else if (this.f == textView) {
                d(textView);
            } else {
                b();
                a(this.d);
            }
        }
    }

    public final void d(android.view.View view) {
        a.eq eqVar = this.g;
        if (eqVar == null || view != this.f) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        eqVar.setBounds(rect);
        eqVar.e(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && this.k.setState(drawableState)) {
            invalidate();
            this.m.invalidate();
        }
    }

    public final void e() {
        boolean z;
        g();
        a.fk1 fk1Var = this.c;
        if (fk1Var != null) {
            com.google.android.material.tabs.TabLayout tabLayout = fk1Var.f;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == fk1Var.d) {
                z = true;
                setSelected(z);
            }
        }
        z = false;
        setSelected(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.graphics.drawable.RippleDrawable] */
    public final void f(android.content.Context context) {
        com.google.android.material.tabs.TabLayout tabLayout = this.m;
        int i = tabLayout.tabBackgroundResId;
        if (i != 0) {
            android.graphics.drawable.Drawable Y = a.b20.Y(context, i);
            this.k = Y;
            if (Y != null && Y.isStateful()) {
                this.k.setState(getDrawableState());
            }
        } else {
            this.k = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.tabRippleColorStateList != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList colorStateList = tabLayout.tabRippleColorStateList;
            int a2 = a.dc1.a(colorStateList, a.dc1.c);
            int[] iArr = a.dc1.b;
            android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(new int[][]{a.dc1.d, iArr, android.util.StateSet.NOTHING}, new int[]{a2, a.dc1.a(colorStateList, iArr), a.dc1.a(colorStateList, a.dc1.f94a)});
            boolean z = tabLayout.tabIndicatorFullWidth;
            if (z) {
                gradientDrawable = null;
            }
            gradientDrawable = new android.graphics.drawable.RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable2);
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.q(this, gradientDrawable);
        tabLayout.invalidate();
    }

    public final void g() {
        int i;
        android.view.ViewParent parent;
        a.fk1 fk1Var = this.c;
        android.view.View view = fk1Var != null ? fk1Var.e : null;
        if (view != null) {
            android.view.ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((android.view.ViewGroup) parent2).removeView(view);
                }
                android.view.View view2 = this.h;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((android.view.ViewGroup) parent).removeView(this.h);
                }
                addView(view);
            }
            this.h = view;
            android.widget.TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.e.setImageDrawable(null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.i = textView2;
            if (textView2 != null) {
                this.l = a.hl1.b(textView2);
            }
            this.j = (android.widget.ImageView) view.findViewById(android.R.id.icon);
        } else {
            android.view.View view3 = this.h;
            if (view3 != null) {
                removeView(view3);
                this.h = null;
            }
            this.i = null;
            this.j = null;
        }
        if (this.h == null) {
            if (this.e == null) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(2131558483, (android.view.ViewGroup) this, false);
                this.e = imageView2;
                addView(imageView2, 0);
            }
            if (this.d == null) {
                android.widget.TextView textView3 = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(2131558484, (android.view.ViewGroup) this, false);
                this.d = textView3;
                addView(textView3);
                this.l = a.hl1.b(this.d);
            }
            android.widget.TextView textView4 = this.d;
            com.google.android.material.tabs.TabLayout tabLayout = this.m;
            textView4.setTextAppearance(tabLayout.defaultTabTextAppearance);
            if (!isSelected() || (i = tabLayout.selectedTabTextAppearance) == -1) {
                this.d.setTextAppearance(tabLayout.tabTextAppearance);
            } else {
                this.d.setTextAppearance(i);
            }
            android.content.res.ColorStateList colorStateList = tabLayout.tabTextColors;
            if (colorStateList != null) {
                this.d.setTextColor(colorStateList);
            }
            h(this.d, this.e, true);
            c();
            android.widget.ImageView imageView3 = this.e;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new a.hk1(this, imageView3));
            }
            android.widget.TextView textView5 = this.d;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new a.hk1(this, textView5));
            }
        } else {
            android.widget.TextView textView6 = this.i;
            if (textView6 != null || this.j != null) {
                h(textView6, this.j, false);
            }
        }
        if (fk1Var == null || android.text.TextUtils.isEmpty(fk1Var.c)) {
            return;
        }
        setContentDescription(fk1Var.c);
    }

    public int getContentHeight() {
        android.view.View[] viewArr = {this.d, this.e, this.h};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            android.view.View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? java.lang.Math.min(i2, view.getTop()) : view.getTop();
                i = z ? java.lang.Math.max(i, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        android.view.View[] viewArr = {this.d, this.e, this.h};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            android.view.View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? java.lang.Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? java.lang.Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return i - i2;
    }

    public a.fk1 getTab() {
        return this.c;
    }

    public final void h(android.widget.TextView textView, android.widget.ImageView imageView, boolean z) {
        android.graphics.drawable.Drawable drawable;
        a.fk1 fk1Var = this.c;
        android.graphics.drawable.Drawable mutate = (fk1Var == null || (drawable = fk1Var.f152a) == null) ? null : drawable.mutate();
        com.google.android.material.tabs.TabLayout tabLayout = this.m;
        if (mutate != null) {
            a.i90.h(mutate, tabLayout.tabIconTint);
            android.graphics.PorterDuff.Mode mode = tabLayout.tabIconTintMode;
            if (mode != null) {
                a.i90.i(mutate, mode);
            }
        }
        a.fk1 fk1Var2 = this.c;
        java.lang.CharSequence charSequence = fk1Var2 != null ? fk1Var2.b : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z2 = true;
        boolean z3 = !android.text.TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z3) {
                this.c.getClass();
            } else {
                z2 = false;
            }
            textView.setText(z3 ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (z3) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int T = (z2 && imageView.getVisibility() == 0) ? (int) a.wv.T(getContext(), 8) : 0;
            if (tabLayout.inlineLabel) {
                if (T != a.gy0.b(marginLayoutParams)) {
                    a.gy0.g(marginLayoutParams, T);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (T != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = T;
                a.gy0.g(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        a.fk1 fk1Var3 = this.c;
        java.lang.CharSequence charSequence2 = fk1Var3 != null ? fk1Var3.c : null;
        if (!z3) {
            charSequence = charSequence2;
        }
        a.dn1.a(this, charSequence);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        android.content.Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a.eq eqVar = this.g;
        if (eqVar != null && eqVar.isVisible()) {
            java.lang.CharSequence contentDescription = getContentDescription();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) contentDescription);
            sb.append(", ");
            a.eq eqVar2 = this.g;
            java.lang.Object obj = null;
            if (eqVar2.isVisible()) {
                a.gq gqVar = eqVar2.g;
                boolean a2 = gqVar.a();
                a.fq fqVar = gqVar.b;
                if (!a2) {
                    obj = fqVar.o;
                } else if (fqVar.p != 0 && (context = (android.content.Context) eqVar2.c.get()) != null) {
                    int c = eqVar2.c();
                    int i = eqVar2.j;
                    obj = c <= i ? context.getResources().getQuantityString(fqVar.p, eqVar2.c(), java.lang.Integer.valueOf(eqVar2.c())) : context.getString(fqVar.q, java.lang.Integer.valueOf(i));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.c.d, 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) a.e0.g.f113a);
        }
        a.f0.a(accessibilityNodeInfo).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(2131952545));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        com.google.android.material.tabs.TabLayout tabLayout = this.m;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(tabLayout.tabMaxWidth, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.d != null) {
            float f = tabLayout.tabTextSize;
            int i3 = this.l;
            android.widget.ImageView imageView = this.e;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.d;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.selectedTabTextSize;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.d.getTextSize();
            int lineCount = this.d.getLineCount();
            int b = a.hl1.b(this.d);
            if (f != textSize || (b >= 0 && i3 != b)) {
                if (tabLayout.tabMaxWidth == 1 && f > textSize && lineCount == 1) {
                    android.text.Layout layout = this.d.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.d.setTextSize(0, f);
                this.d.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.c == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        a.fk1 fk1Var = this.c;
        com.google.android.material.tabs.TabLayout tabLayout = fk1Var.f;
        if (tabLayout == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.selectTab(fk1Var, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        android.widget.TextView textView = this.d;
        if (textView != null) {
            textView.setSelected(z);
        }
        android.widget.ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        android.view.View view = this.h;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(a.fk1 fk1Var) {
        if (fk1Var != this.c) {
            this.c = fk1Var;
            e();
        }
    }
}
