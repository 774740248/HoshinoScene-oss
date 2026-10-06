package a;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class rl1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f498a = new java.lang.ThreadLocal();
    public static final int[] b = {-16842910};
    public static final int[] c = {android.R.attr.state_focused};
    public static final int[] d = {android.R.attr.state_pressed};
    public static final int[] e = {android.R.attr.state_checked};
    public static final int[] f = new int[0];
    public static final int[] g = new int[1];

    public static void a(android.content.Context context, android.view.View view) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.u81.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                android.util.Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(android.content.Context context, int i) {
        float r4 = 0.0f;
        android.content.res.ColorStateList d2 = d(context, i);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        java.lang.ThreadLocal threadLocal = f498a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return a.sv.d(c(context, i), java.lang.Math.round(android.graphics.Color.alpha(r4) * f2));
    }

    public static int c(android.content.Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static android.content.res.ColorStateList d(android.content.Context context, int i) {
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        int[] iArr = g;
        iArr[0] = i;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = a.zx.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
