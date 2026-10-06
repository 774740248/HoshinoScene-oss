package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final a.u f510a;

    public s(a.u uVar) {
        this.f510a = uVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f510a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        a.pe b = this.f510a.b(view);
        if (b != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) b.c;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f510a.c(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object tag2;
        a.g0 g0Var = new a.g0(accessibilityNodeInfo);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        java.lang.Object obj = null;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            tag = java.lang.Boolean.valueOf(a.cq1.d(view));
        } else {
            tag = view.getTag(2131363248);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        boolean z = (bool == null || !bool.booleanValue()) ? false : true;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            android.os.Bundle a2 = a.f0.a(accessibilityNodeInfo);
            if (a2 != null) {
                a2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z | (a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            tag2 = java.lang.Boolean.valueOf(a.cq1.c(view));
        } else {
            tag2 = view.getTag(2131363239);
            if (!java.lang.Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) tag2;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            android.os.Bundle a3 = a.f0.a(accessibilityNodeInfo);
            if (a3 != null) {
                a3.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (a3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | (z2 ? 2 : 0));
            }
        }
        java.lang.CharSequence e = a.jq1.e(view);
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(e);
        } else {
            a.f0.a(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            obj = a.eq1.a(view);
        } else {
            java.lang.Object tag3 = view.getTag(2131363249);
            if (java.lang.CharSequence.class.isInstance(tag3)) {
                obj = tag3;
            }
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
        int i2 = a.es.f133a;
        if (i >= 30) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            a.f0.a(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f510a.d(view, g0Var);
        accessibilityNodeInfo.getText();
        java.util.List list = (java.util.List) view.getTag(2131363237);
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            g0Var.b((a.e0) list.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f510a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f510a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        return this.f510a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(android.view.View view, int i) {
        this.f510a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f510a.i(view, accessibilityEvent);
    }
}
