package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o90 extends a.u {
    public final android.graphics.Rect d = new android.graphics.Rect();
    public final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout e;

    public o90(androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
        this.e = drawerLayout;
    }

    @Override // a.u
    public final boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.f573a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.e;
        android.view.View f = drawerLayout.findVisibleDrawer();
        if (f == null) {
            return true;
        }
        int h = drawerLayout.getDrawerViewAbsoluteGravity(f);
        drawerLayout.getClass();
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        android.view.Gravity.getAbsoluteGravity(h, a.sp1.d(drawerLayout));
        return true;
    }

    @Override // a.u
    public final void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // a.u
    public final void d(android.view.View view, a.g0 g0Var) {
        boolean z = androidx.drawerlayout.widget.DrawerLayout.G;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = g0Var.f165a;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f573a;
        if (z) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
            g0Var.c = -1;
            accessibilityNodeInfo.setSource(view);
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            java.lang.Object f = a.rp1.f(view);
            if (f instanceof android.view.View) {
                g0Var.b = -1;
                accessibilityNodeInfo.setParent((android.view.View) f);
            }
            android.graphics.Rect rect = this.d;
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(obtain.getPackageName());
            g0Var.g(obtain.getClassName());
            accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(obtain.isEnabled());
            accessibilityNodeInfo.setFocused(obtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(obtain.isSelected());
            g0Var.a(obtain.getActions());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (androidx.drawerlayout.widget.DrawerLayout.isContentView(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        g0Var.g("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) a.e0.e.f113a);
        accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) a.e0.f.f113a);
    }

    @Override // a.u
    public final boolean f(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (androidx.drawerlayout.widget.DrawerLayout.G || androidx.drawerlayout.widget.DrawerLayout.isContentView(view)) {
            return this.f573a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
