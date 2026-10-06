package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class pw {
    public static android.content.res.ColorStateList a(android.widget.CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public static android.graphics.PorterDuff.Mode b(android.widget.CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    public static void c(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    public static void d(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
