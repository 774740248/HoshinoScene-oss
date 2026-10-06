package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class u {
    public static final android.view.View.AccessibilityDelegate c = new android.view.View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View.AccessibilityDelegate f573a;
    public final a.s b;

    public u() {
        this(c);
    }

    public boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f573a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a.pe b(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider a2 = a.t.a(this.f573a, view);
        if (a2 != null) {
            return new a.pe(a2);
        }
        return null;
    }

    public void c(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f573a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(android.view.View view, a.g0 g0Var) {
        this.f573a.onInitializeAccessibilityNodeInfo(view, g0Var.f165a);
    }

    public void e(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f573a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f573a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(android.view.View view, int i, android.os.Bundle bundle) {
        boolean z;
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        java.util.List list = (java.util.List) view.getTag(2131363237);
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            a.e0 e0Var = (a.e0) list.get(i2);
            if (e0Var.a() == i) {
                a.z0 z0Var = e0Var.d;
                if (z0Var != null) {
                    java.lang.Class cls = e0Var.c;
                    if (cls != null) {
                        try {
                            a.ai1.t(cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                            throw null;
                        } catch (java.lang.Exception e) {
                            android.util.Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = z0Var.d(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = a.t.b(this.f573a, view, i, bundle);
        }
        if (z || i != 2131361867 || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(2131363238);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) != null) {
            java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    public void h(android.view.View view, int i) {
        this.f573a.sendAccessibilityEvent(view, i);
    }

    public void i(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f573a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public u(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f573a = accessibilityDelegate;
        this.b = new a.s(this);
    }
}
