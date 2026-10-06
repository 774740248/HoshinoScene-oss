package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yr0 {
    public static android.content.res.ColorStateList a(android.widget.ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static android.graphics.PorterDuff.Mode b(android.widget.ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
