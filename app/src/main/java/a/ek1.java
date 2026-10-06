package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ek1 extends android.widget.LinearLayout {
    public static final /* synthetic */ int e = 0;
    public android.animation.ValueAnimator c;
    public final /* synthetic */ com.google.android.material.tabs.TabLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek1(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        this.d = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        if (tabLayout.tabIndicatorAnimationDuration == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            android.view.View childAt = getChildAt(i);
            a.fs1 fs1Var = tabLayout.slidingTabIndicator;
            android.graphics.drawable.Drawable drawable = tabLayout.tabSelectedIndicator;
            fs1Var.getClass();
            android.graphics.RectF e2 = a.fs1.e(tabLayout, childAt);
            drawable.setBounds((int) e2.left, drawable.getBounds().top, (int) e2.right, drawable.getBounds().bottom);
            tabLayout.tabIndicatorAnimationMode = i;
        }
    }

    public final void b(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        android.graphics.Rect bounds = tabLayout.tabSelectedIndicator.getBounds();
        tabLayout.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(float f, android.view.View view, android.view.View view2) {
        if (view == null || view.getWidth() <= 0) {
            com.google.android.material.tabs.TabLayout tabLayout = this.d;
            android.graphics.drawable.Drawable drawable = tabLayout.tabSelectedIndicator;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.tabSelectedIndicator.getBounds().bottom);
        } else {
            com.google.android.material.tabs.TabLayout tabLayout2 = this.d;
            tabLayout2.slidingTabIndicator.Y(tabLayout2, view, view2, f, tabLayout2.tabSelectedIndicator);
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.k(this);
    }

    public final void d(int i, int i2, boolean z) {
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        if (tabLayout.tabIndicatorAnimationMode == i) {
            return;
        }
        android.view.View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        android.view.View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.tabIndicatorAnimationMode = i;
        a.dk1 dk1Var = new a.dk1(this, childAt, childAt2);
        if (!z) {
            this.c.removeAllUpdateListeners();
            this.c.addUpdateListener(dk1Var);
            return;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        this.c = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.tabIndicatorTimeInterpolator);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(dk1Var);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int height;
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        int height2 = tabLayout.tabSelectedIndicator.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.tabSelectedIndicator.getIntrinsicHeight();
        }
        int i = tabLayout.tabIndicatorHeight;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.tabSelectedIndicator.getBounds().width() > 0) {
            android.graphics.Rect bounds = tabLayout.tabSelectedIndicator.getBounds();
            tabLayout.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.tabSelectedIndicator.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.animation.ValueAnimator valueAnimator = this.c;
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.tabIndicatorAnimationMode == -1) {
            tabLayout.tabIndicatorAnimationMode = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.tabIndicatorAnimationMode);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        if (tabLayout.tabIndicatorHeight_WITH_TEXT_ICON == 1 || tabLayout.tabMaxWidth == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                android.view.View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = java.lang.Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) a.wv.T(getContext(), 16)) * 2)) {
                boolean z = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                tabLayout.tabIndicatorHeight_WITH_TEXT_ICON = 0;
                tabLayout.updateTabViews(false);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }
}
