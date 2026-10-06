package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class m90 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f340a = {android.R.attr.state_checked};
    public static final int[] b = new int[0];

    static {
        new android.graphics.Rect();
    }

    public static void a(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f340a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode b(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
