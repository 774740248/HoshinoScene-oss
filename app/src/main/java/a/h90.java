package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class h90 {
    public static int a(android.graphics.drawable.Drawable drawable) {
        return drawable.getAlpha();
    }

    public static android.graphics.drawable.Drawable b(android.graphics.drawable.DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    public static android.graphics.drawable.Drawable c(android.graphics.drawable.InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static boolean d(android.graphics.drawable.Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void e(android.graphics.drawable.Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }
}
