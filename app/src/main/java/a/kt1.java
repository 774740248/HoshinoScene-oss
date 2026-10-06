package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kt1 extends a.nt1 {
    public static final android.view.animation.PathInterpolator e = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final a.gd0 f = new a.gd0();
    public static final android.view.animation.DecelerateInterpolator g = new android.view.animation.DecelerateInterpolator();

    public static void e(android.view.View view) {
        a.os0 j = j(view);
        if (j != null) {
            j.b.setTranslationY(0.0f);
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(android.view.View view, android.view.WindowInsets windowInsets, boolean z) {
        a.os0 j = j(view);
        if (j != null) {
            j.f420a = windowInsets;
            if (!z) {
                android.view.View view2 = j.b;
                int[] iArr = j.e;
                view2.getLocationOnScreen(iArr);
                z = true;
                j.c = iArr[1];
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z);
            }
        }
    }

    public static void g(android.view.View view, a.du1 du1Var, java.util.List list) {
        a.os0 j = j(view);
        if (j != null) {
            j.a(du1Var, list);
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), du1Var, list);
            }
        }
    }

    public static void h(android.view.View view, a.pm pmVar) {
        a.os0 j = j(view);
        if (j != null) {
            android.view.View view2 = j.b;
            int[] iArr = j.e;
            view2.getLocationOnScreen(iArr);
            int i = j.c - iArr[1];
            j.d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), pmVar);
            }
        }
    }

    public static android.view.WindowInsets i(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.getTag(2131363245) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static a.os0 j(android.view.View view) {
        java.lang.Object tag = view.getTag(2131363253);
        if (tag instanceof a.jt1) {
            return ((a.jt1) tag).f270a;
        }
        return null;
    }
}
