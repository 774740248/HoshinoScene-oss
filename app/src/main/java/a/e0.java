package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e0 {
    public static final a.e0 e = new a.e0(1);
    public static final a.e0 f = new a.e0(2);
    public static final a.e0 g;
    public static final a.e0 h;
    public static final a.e0 i;
    public static final a.e0 j;
    public static final a.e0 k;
    public static final a.e0 l;
    public static final a.e0 m;
    public static final a.e0 n;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f113a;
    public final int b;
    public final java.lang.Class c;
    public final a.z0 d;

    static {
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        new a.e0(4);
        new a.e0(8);
        g = new a.e0(16);
        new a.e0(32);
        new a.e0(64);
        new a.e0(128);
        new a.e0(256, a.s0.class);
        new a.e0(512, a.s0.class);
        new a.e0(1024, a.t0.class);
        new a.e0(2048, a.t0.class);
        h = new a.e0(4096);
        i = new a.e0(8192);
        new a.e0(16384);
        new a.e0(32768);
        new a.e0(65536);
        new a.e0(131072, a.x0.class);
        j = new a.e0(262144);
        k = new a.e0(524288);
        l = new a.e0(1048576);
        new a.e0(2097152, a.y0.class);
        int i2 = android.os.Build.VERSION.SDK_INT;
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, android.R.id.accessibilityActionShowOnScreen, null, null, null);
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, android.R.id.accessibilityActionScrollToPosition, null, null, a.v0.class);
        m = new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, android.R.id.accessibilityActionScrollUp, null, null, null);
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, android.R.id.accessibilityActionScrollLeft, null, null, null);
        n = new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, android.R.id.accessibilityActionScrollDown, null, null, null);
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, android.R.id.accessibilityActionScrollRight, null, null, null);
        new a.e0(i2 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null, null, null);
        if (i2 >= 29) {
            accessibilityAction14 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction = accessibilityAction14;
        } else {
            accessibilityAction = null;
        }
        new a.e0(accessibilityAction, android.R.id.accessibilityActionPageDown, null, null, null);
        new a.e0(i2 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null, null, null);
        if (i2 >= 29) {
            accessibilityAction13 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction2 = accessibilityAction13;
        } else {
            accessibilityAction2 = null;
        }
        new a.e0(accessibilityAction2, android.R.id.accessibilityActionPageRight, null, null, null);
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, android.R.id.accessibilityActionContextClick, null, null, null);
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, android.R.id.accessibilityActionSetProgress, null, null, a.w0.class);
        new a.e0(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, android.R.id.accessibilityActionMoveWindow, null, null, a.u0.class);
        if (i2 >= 28) {
            accessibilityAction12 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction3 = accessibilityAction12;
        } else {
            accessibilityAction3 = null;
        }
        new a.e0(accessibilityAction3, android.R.id.accessibilityActionShowTooltip, null, null, null);
        if (i2 >= 28) {
            accessibilityAction11 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction4 = accessibilityAction11;
        } else {
            accessibilityAction4 = null;
        }
        new a.e0(accessibilityAction4, android.R.id.accessibilityActionHideTooltip, null, null, null);
        new a.e0(i2 >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null, null, null);
        if (i2 >= 30) {
            accessibilityAction10 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction5 = accessibilityAction10;
        } else {
            accessibilityAction5 = null;
        }
        new a.e0(accessibilityAction5, 0x1020054, null, null, null);
        new a.e0(i2 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 0x1020055, null, null, null);
        if (i2 >= 32) {
            accessibilityAction9 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction6 = accessibilityAction9;
        } else {
            accessibilityAction6 = null;
        }
        new a.e0(accessibilityAction6, 0x1020056, null, null, null);
        if (i2 >= 32) {
            accessibilityAction8 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction7 = accessibilityAction8;
        } else {
            accessibilityAction7 = null;
        }
        new a.e0(accessibilityAction7, 0x1020057, null, null, null);
        new a.e0(i2 >= 33 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 0x1020058, null, null, null);
    }

    public e0(int i2) {
        this(null, i2, null, null, null);
    }

    public final int a() {
        return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) this.f113a).getId();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof a.e0)) {
            return false;
        }
        java.lang.Object obj2 = ((a.e0) obj).f113a;
        java.lang.Object obj3 = this.f113a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f113a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityActionCompat: ");
        java.lang.String d = a.g0.d(this.b);
        if (d.equals("ACTION_UNKNOWN")) {
            java.lang.Object obj = this.f113a;
            if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d);
        return sb.toString();
    }

    public e0(int i2, java.lang.Class cls) {
        this(null, i2, null, null, cls);
    }

    public e0(java.lang.Object obj, int i2, java.lang.String str, a.z0 z0Var, java.lang.Class cls) {
        this.b = i2;
        this.d = z0Var;
        if (obj == null) {
            this.f113a = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f113a = obj;
        }
        this.c = cls;
    }
}
