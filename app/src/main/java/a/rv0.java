package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class rv0 extends android.view.ViewGroup {
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public boolean j;
    public int[] k;
    public int[] l;
    public android.graphics.drawable.Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;

    public rv0(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.d = -1;
        this.e = 0;
        this.g = 8388659;
        int[] iArr = a.u81.n;
        a.nk nkVar = new a.nk(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        a.jq1.n(this, context, iArr, attributeSet, (android.content.res.TypedArray) nkVar.e, i);
        int o = nkVar.o(1, -1);
        if (o >= 0) {
            setOrientation(o);
        }
        int o2 = nkVar.o(0, -1);
        if (o2 >= 0) {
            setGravity(o2);
        }
        boolean h = nkVar.h(2, true);
        if (!h) {
            setBaselineAligned(h);
        }
        this.i = ((android.content.res.TypedArray) nkVar.e).getFloat(4, -1.0f);
        this.d = nkVar.o(3, -1);
        this.j = nkVar.h(7, false);
        setDividerDrawable(nkVar.l(5));
        this.p = nkVar.o(8, 0);
        this.q = nkVar.k(6, 0);
        nkVar.K();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a.qv0;
    }

    public final void f(android.graphics.Canvas canvas, int i) {
        this.m.setBounds(getPaddingLeft() + this.q, i, (getWidth() - getPaddingRight()) - this.q, this.o + i);
        this.m.draw(canvas);
    }

    public final void g(android.graphics.Canvas canvas, int i) {
        this.m.setBounds(i, getPaddingTop() + this.q, this.n + i, (getHeight() - getPaddingBottom()) - this.q);
        this.m.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.d;
        if (childCount <= i2) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.d == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.e;
        if (this.f == 1 && (i = this.g & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.h) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.h;
            }
        }
        return i3 + ((android.widget.LinearLayout.LayoutParams) ((a.qv0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.d;
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
        return this.m;
    }

    public int getDividerPadding() {
        return this.q;
    }

    public int getDividerWidth() {
        return this.n;
    }

    public int getGravity() {
        return this.g;
    }

    public int getOrientation() {
        return this.f;
    }

    public int getShowDividers() {
        return this.p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.qv0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.qv0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a.qv0 generateDefaultLayoutParams() {
        int i = this.f;
        if (i == 0) {
            return new android.widget.LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a.qv0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a.qv0 generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.widget.LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a.qv0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a.qv0 generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.widget.LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return (this.p & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.p & 4) != 0;
        }
        if ((this.p & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.m == null) {
            return;
        }
        int i2 = 0;
        if (this.f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                android.view.View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && k(i2)) {
                    f(canvas, (childAt.getTop() - ((android.widget.LinearLayout.LayoutParams) ((a.qv0) childAt.getLayoutParams())).topMargin) - this.o);
                }
                i2++;
            }
            if (k(virtualChildCount)) {
                android.view.View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.o : childAt2.getBottom() + ((android.widget.LinearLayout.LayoutParams) ((a.qv0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = a.zr1.a(this);
        while (i2 < virtualChildCount2) {
            android.view.View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i2)) {
                a.qv0 qv0Var = (a.qv0) childAt3.getLayoutParams();
                g(canvas, a2 ? childAt3.getRight() + ((android.widget.LinearLayout.LayoutParams) qv0Var).rightMargin : (childAt3.getLeft() - ((android.widget.LinearLayout.LayoutParams) qv0Var).leftMargin) - this.n);
            }
            i2++;
        }
        if (k(virtualChildCount2)) {
            android.view.View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a.qv0 qv0Var2 = (a.qv0) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((android.widget.LinearLayout.LayoutParams) qv0Var2).leftMargin;
                    i = this.n;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((android.widget.LinearLayout.LayoutParams) qv0Var2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.n;
                right = left - i;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rv0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rv0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.c = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.d = i;
            return;
        }
        throw new java.lang.IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.m) {
            return;
        }
        this.m = drawable;
        if (drawable != null) {
            this.n = drawable.getIntrinsicWidth();
            this.o = drawable.getIntrinsicHeight();
        } else {
            this.n = 0;
            this.o = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.q = i;
    }

    public void setGravity(int i) {
        if (this.g != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.g = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.g;
        if ((8388615 & i3) != i2) {
            this.g = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.j = z;
    }

    public void setOrientation(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.p) {
            requestLayout();
        }
        this.p = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.g;
        if ((i3 & 112) != i2) {
            this.g = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.i = java.lang.Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
