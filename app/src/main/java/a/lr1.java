package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class lr1 extends a.u {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ lr1(int i, java.lang.Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3.c() > 1) goto L14;
     */
    @Override // a.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.d
            java.lang.Object r1 = r2.e
            switch(r0) {
                case 0: goto L18;
                case 1: goto L7;
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            super.c(r3, r4)
            return
        Lb:
            super.c(r3, r4)
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r3 = r1.isChecked()
            r4.setChecked(r3)
            return
        L18:
            super.c(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            r3 = r1
            androidx.viewpager.widget.ViewPager r3 = (androidx.viewpager.widget.ViewPager) r3
            a.t31 r3 = r3.g
            if (r3 == 0) goto L33
            int r3 = r3.c()
            r0 = 1
            if (r3 <= r0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            r4.setScrollable(r0)
            int r3 = r4.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r3 != r0) goto L56
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            a.t31 r3 = r1.g
            if (r3 == 0) goto L56
            int r3 = r3.c()
            r4.setItemCount(r3)
            int r3 = r1.mScrollState
            r4.setFromIndex(r3)
            int r3 = r1.mScrollState
            r4.setToIndex(r3)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lr1.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        int i;
        boolean z = false;
        z = false;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        int i2 = this.d;
        java.lang.Object obj = this.e;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                g0Var.g(androidx.viewpager.widget.ViewPager.class.getName());
                a.t31 t31Var = ((androidx.viewpager.widget.ViewPager) obj).g;
                if (t31Var != null && t31Var.c() > 1) {
                    z = true;
                }
                g0Var.h(z);
                androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) obj;
                if (viewPager.canScrollHorizontally(1)) {
                    g0Var.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    g0Var.a(8192);
                    return;
                }
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) obj;
                int i3 = com.google.android.material.button.MaterialButtonToggleGroup.m;
                materialButtonToggleGroup.getClass();
                if (view instanceof com.google.android.material.button.MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                            accessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((com.google.android.material.button.MaterialButton) view).isChecked()));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof com.google.android.material.button.MaterialButton) && materialButtonToggleGroup.isChildVisible(i5)) {
                                i4++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((com.google.android.material.button.MaterialButton) view).isChecked()));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.checkable);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((com.google.android.material.internal.NavigationMenuItemView) obj).z);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                g0Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
        }
    }

    @Override // a.u
    public final boolean g(android.view.View view, int i, android.os.Bundle bundle) {
        int i2 = this.d;
        java.lang.Object obj = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                if (i == 4096) {
                    androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) obj;
                    if (viewPager.canScrollHorizontally(1)) {
                        viewPager.setCurrentItem(viewPager.mScrollState + 1);
                        return true;
                    }
                } else if (i == 8192) {
                    androidx.viewpager.widget.ViewPager viewPager2 = (androidx.viewpager.widget.ViewPager) obj;
                    if (viewPager2.canScrollHorizontally(-1)) {
                        viewPager2.setCurrentItem(viewPager2.mScrollState - 1);
                        return true;
                    }
                }
                return false;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((a.vh1) ((a.vq) obj)).a(3);
                return true;
            default:
                return super.g(view, i, bundle);
        }
    }
}
