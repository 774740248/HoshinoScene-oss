package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class dc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f94a = {android.R.attr.state_pressed};
    public static final int[] b = {android.R.attr.state_focused};
    public static final int[] c = {android.R.attr.state_selected, android.R.attr.state_pressed};
    public static final int[] d = {android.R.attr.state_selected};
    public static final int[] e = {android.R.attr.state_enabled, android.R.attr.state_pressed};
    public static final java.lang.String f = a.dc1.class.getSimpleName();

    public static int a(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a.sv.d(colorForState, java.lang.Math.min(android.graphics.Color.alpha(colorForState) * 2, 255));
    }

    public static android.content.res.ColorStateList b(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            return android.content.res.ColorStateList.valueOf(0);
        }
        if (android.os.Build.VERSION.SDK_INT <= 27 && android.graphics.Color.alpha(colorStateList.getDefaultColor()) == 0 && android.graphics.Color.alpha(colorStateList.getColorForState(e, 0)) != 0) {
            android.util.Log.w(f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
