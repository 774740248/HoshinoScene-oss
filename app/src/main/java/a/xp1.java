package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xp1 {
    public static void a(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(2131363253);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static a.du1 b(android.view.View view, a.du1 du1Var, android.graphics.Rect rect) {
        android.view.WindowInsets g = du1Var.g();
        if (g != null) {
            return a.du1.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return du1Var;
    }

    public static boolean c(android.view.View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean d(android.view.View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean e(android.view.View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean f(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static android.content.res.ColorStateList g(android.view.View view) {
        return view.getBackgroundTintList();
    }

    public static android.graphics.PorterDuff.Mode h(android.view.View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(android.view.View view) {
        return view.getElevation();
    }

    public static a.du1 j(android.view.View view) {
        if (!a.pt1.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            java.lang.Object obj = a.pt1.f451a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            android.graphics.Rect rect = (android.graphics.Rect) a.pt1.b.get(obj);
            android.graphics.Rect rect2 = (android.graphics.Rect) a.pt1.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = android.os.Build.VERSION.SDK_INT;
            a.ut1 tt1Var = i >= 30 ? new a.tt1() : i >= 29 ? new a.st1() : new a.qt1();
            tt1Var.e(a.ns0.b(rect.left, rect.top, rect.right, rect.bottom));
            tt1Var.g(a.ns0.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            a.du1 b = tt1Var.b();
            b.f107a.p(b);
            b.f107a.d(view.getRootView());
            return b;
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            return null;
        }
    }

    public static java.lang.String k(android.view.View view) {
        return view.getTransitionName();
    }

    public static float l(android.view.View view) {
        return view.getTranslationZ();
    }

    public static float m(android.view.View view) {
        return view.getZ();
    }

    public static boolean n(android.view.View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(android.view.View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(android.view.View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(android.view.View view, android.content.res.ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(android.view.View view, android.graphics.PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(android.view.View view, float f) {
        view.setElevation(f);
    }

    public static void t(android.view.View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void u(android.view.View view, a.z21 z21Var) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(2131363245, z21Var);
        }
        if (z21Var == null) {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(2131363253));
        } else {
            view.setOnApplyWindowInsetsListener(new a.wp1(view, z21Var));
        }
    }

    public static void v(android.view.View view, java.lang.String str) {
        view.setTransitionName(str);
    }

    public static void w(android.view.View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(android.view.View view, float f) {
        view.setZ(f);
    }

    public static boolean y(android.view.View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(android.view.View view) {
        view.stopNestedScroll();
    }
}
