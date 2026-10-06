package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class TabBarView extends android.widget.LinearLayout {
    public static final /* synthetic */ int n = 0;
    public a.bp0 c;
    public a.bp0 d;
    public a.qo0 e;
    public int f;
    public int g;
    public int h;
    public final android.widget.LinearLayout i;
    public final android.widget.ImageView j;
    public final android.widget.TextView k;
    public android.widget.FrameLayout l;
    public final android.widget.LinearLayout m;

    public TabBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 10;
        this.h = -1;
        this.m = new android.widget.LinearLayout(getContext());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        linearLayout.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        linearLayout.setBackgroundResource(typedValue.resourceId);
        linearLayout.setOnClickListener(new a.gv(14, this));
        this.i = linearLayout;
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setImageResource(2131231027);
        imageView.setColorFilter(c(android.R.attr.textColorSecondary));
        int b = b(10);
        imageView.setPadding(b, b, b, b);
        this.j = imageView;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setText("新标签页");
        textView.setTextSize(14.0f);
        textView.setTextColor(c(android.R.attr.textColorSecondary));
        this.k = textView;
        android.widget.LinearLayout linearLayout2 = this.i;
        if (linearLayout2 == null) {
            a.wv.M1("addButton");
            throw null;
        }
        android.widget.ImageView imageView2 = this.j;
        if (imageView2 == null) {
            a.wv.M1("addButtonIcon");
            throw null;
        }
        linearLayout2.addView(imageView2, new android.widget.LinearLayout.LayoutParams(b(40), b(40)));
        android.widget.LinearLayout linearLayout3 = this.i;
        if (linearLayout3 == null) {
            a.wv.M1("addButton");
            throw null;
        }
        android.widget.TextView textView2 = this.k;
        if (textView2 == null) {
            a.wv.M1("addButtonLabel");
            throw null;
        }
        linearLayout3.addView(textView2);
        android.widget.LinearLayout linearLayout4 = this.i;
        if (linearLayout4 == null) {
            a.wv.M1("addButton");
            throw null;
        }
        linearLayout4.setOutlineProvider(new a.pc1(b(20)));
        android.widget.LinearLayout linearLayout5 = this.i;
        if (linearLayout5 == null) {
            a.wv.M1("addButton");
            throw null;
        }
        linearLayout5.setClipToOutline(true);
        a();
    }

    public static android.widget.TextView e(android.view.View view) {
        android.widget.LinearLayout linearLayout = view instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view : null;
        android.view.View childAt = linearLayout != null ? linearLayout.getChildAt(0) : null;
        if (childAt instanceof android.widget.TextView) {
            return (android.widget.TextView) childAt;
        }
        return null;
    }

    public final void a() {
        int i = this.g;
        boolean z = i == 0;
        setOrientation(i);
        setGravity(z ? 16 : 1);
        int i2 = this.g;
        android.widget.LinearLayout linearLayout = this.m;
        linearLayout.setOrientation(i2);
        linearLayout.setGravity(z ? 16 : 1);
        android.widget.FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            frameLayout.removeView(linearLayout);
            android.widget.FrameLayout frameLayout2 = this.l;
            if (frameLayout2 == null) {
                a.wv.M1("scrollView");
                throw null;
            }
            removeView(frameLayout2);
            android.widget.LinearLayout linearLayout2 = this.i;
            if (linearLayout2 == null) {
                a.wv.M1("addButton");
                throw null;
            }
            removeView(linearLayout2);
        }
        android.widget.FrameLayout horizontalScrollView = z ? new android.widget.HorizontalScrollView(getContext()) : new android.widget.ScrollView(getContext());
        this.l = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        android.widget.FrameLayout frameLayout3 = this.l;
        if (frameLayout3 == null) {
            a.wv.M1("scrollView");
            throw null;
        }
        frameLayout3.setVerticalScrollBarEnabled(false);
        android.widget.FrameLayout frameLayout4 = this.l;
        if (frameLayout4 == null) {
            a.wv.M1("scrollView");
            throw null;
        }
        frameLayout4.addView(linearLayout, new android.widget.FrameLayout.LayoutParams(z ? -2 : -1, z ? -1 : -2));
        android.widget.FrameLayout frameLayout5 = this.l;
        if (frameLayout5 == null) {
            a.wv.M1("scrollView");
            throw null;
        }
        addView(frameLayout5, new android.widget.LinearLayout.LayoutParams(z ? 0 : -1, z ? -1 : 0, 1.0f));
        android.widget.LinearLayout linearLayout3 = this.i;
        if (linearLayout3 == null) {
            a.wv.M1("addButton");
            throw null;
        }
        addView(linearLayout3, new android.widget.LinearLayout.LayoutParams(z ? b(40) : -1, b(40)));
        android.widget.TextView textView = this.k;
        if (textView == null) {
            a.wv.M1("addButtonLabel");
            throw null;
        }
        textView.setVisibility(z ? 8 : 0);
        int childCount = linearLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = linearLayout.getChildAt(i3);
            android.widget.LinearLayout linearLayout4 = childAt instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt : null;
            if (linearLayout4 != null) {
                linearLayout4.setLayoutParams(d());
                android.widget.TextView e = e(linearLayout4);
                if (e != null) {
                    e.setLayoutParams(this.g == 0 ? new android.widget.LinearLayout.LayoutParams(-2, -2) : new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
                }
            }
        }
    }

    public final int b(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int c(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 >= 28 && i2 <= 31) {
            return typedValue.data;
        }
        android.content.Context context = getContext();
        int i3 = typedValue.resourceId;
        java.lang.Object obj = a.zx.f748a;
        return a.yx.a(context, i3);
    }

    public final android.widget.LinearLayout.LayoutParams d() {
        if (!(this.g == 0)) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = b(4);
            return layoutParams;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams2.setMarginEnd(b(4));
        layoutParams2.topMargin = b(5);
        layoutParams2.bottomMargin = b(5);
        return layoutParams2;
    }

    public final void f() {
        boolean z = getTabCount() >= this.f;
        android.widget.LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            a.wv.M1("addButton");
            throw null;
        }
        linearLayout.setEnabled(!z);
        android.widget.LinearLayout linearLayout2 = this.i;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(z ? 0.35f : 1.0f);
        } else {
            a.wv.M1("addButton");
            throw null;
        }
    }

    public final int getMaxTabs() {
        return this.f;
    }

    public final a.qo0 getOnTabAdded() {
        return this.e;
    }

    public final a.bp0 getOnTabClosed() {
        return this.d;
    }

    public final a.bp0 getOnTabSelected() {
        return this.c;
    }

    public final int getSelectedIndex() {
        return this.h;
    }

    public final int getTabCount() {
        return this.m.getChildCount();
    }

    public final int getTabOrientation() {
        return this.g;
    }

    public final void setMaxTabs(int i) {
        this.f = i;
        f();
    }

    public final void setOnTabAdded(a.qo0 qo0Var) {
        this.e = qo0Var;
    }

    public final void setOnTabClosed(a.bp0 bp0Var) {
        this.d = bp0Var;
    }

    public final void setOnTabSelected(a.bp0 bp0Var) {
        this.c = bp0Var;
    }

    public final void setTabOrientation(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        a();
    }
}
