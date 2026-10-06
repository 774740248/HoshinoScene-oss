package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pc0 extends a.u {
    public static final android.graphics.Rect n = new android.graphics.Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a.fa0 o;
    public static final a.fa0 p;
    public final android.view.accessibility.AccessibilityManager h;
    public final android.view.View i;
    public a.oc0 j;
    public final android.graphics.Rect d = new android.graphics.Rect();
    public final android.graphics.Rect e = new android.graphics.Rect();
    public final android.graphics.Rect f = new android.graphics.Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    static {
        java.lang.Object obj = null;
        o = new a.fa0(6, obj);
        p = new a.fa0(7, obj);
    }

    public pc0(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (a.rp1.c(view) == 0) {
            a.rp1.s(view, 1);
        }
    }

    @Override // a.u
    public final a.pe b(android.view.View view) {
        if (this.j == null) {
            this.j = new a.oc0(this);
        }
        return this.j;
    }

    @Override // a.u
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        com.google.android.material.chip.Chip chip = ((a.xu) this).q;
        accessibilityNodeInfo.setCheckable(chip.isChipIconVisible());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        g0Var.g(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        a.xu xuVar = (a.xu) this;
        if (i == 1) {
            com.google.android.material.chip.Chip chip = xuVar.q;
            chip.closeIconFocused = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final a.g0 k(int i) {
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain();
        a.g0 g0Var = new a.g0(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        g0Var.g("android.view.View");
        android.graphics.Rect rect = n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        g0Var.b = -1;
        android.view.View view = this.i;
        obtain.setParent(view);
        o(i, g0Var);
        if (g0Var.f() == null && obtain.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        android.graphics.Rect rect2 = this.e;
        g0Var.e(rect2);
        if (rect2.equals(rect)) {
            throw new java.lang.RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(view.getContext().getPackageName());
        g0Var.c = i;
        obtain.setSource(view, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            g0Var.a(128);
        } else {
            obtain.setAccessibilityFocused(false);
            g0Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            g0Var.a(2);
        } else if (obtain.isFocusable()) {
            g0Var.a(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            g0Var.e(rect3);
            if (g0Var.b != -1) {
                a.g0 g0Var2 = new a.g0(android.view.accessibility.AccessibilityNodeInfo.obtain());
                for (int i2 = g0Var.b; i2 != -1; i2 = g0Var2.b) {
                    g0Var2.b = -1;
                    android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var2.f165a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i2, g0Var2);
                    g0Var2.e(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        android.graphics.Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = g0Var.f165a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    java.lang.Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof android.view.View) {
                            android.view.View view2 = (android.view.View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfo2.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return g0Var;
    }

    public abstract void l(java.util.ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pc0.m(int, android.graphics.Rect):boolean");
    }

    public final a.g0 n(int i) {
        if (i != -1) {
            return k(i);
        }
        android.view.View view = this.i;
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(view);
        a.g0 g0Var = new a.g0(obtain);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            g0Var.f165a.addChild(view, ((java.lang.Integer) arrayList.get(i2)).intValue());
        }
        return g0Var;
    }

    public abstract void o(int i, a.g0 g0Var);

    public final boolean p(int i) {
        int i2;
        android.view.View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        a.xu xuVar = (a.xu) this;
        if (i == 1) {
            com.google.android.material.chip.Chip chip = xuVar.q;
            chip.closeIconFocused = true;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        android.view.View view;
        android.view.ViewParent parent;
        android.view.accessibility.AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
            a.g0 n2 = n(i);
            obtain.getText().add(n2.f());
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = n2.f165a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            a.l0.a(obtain, view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
