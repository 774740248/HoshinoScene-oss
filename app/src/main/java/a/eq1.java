package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class eq1 {
    public static java.lang.CharSequence a(android.view.View view) {
        return view.getStateDescription();
    }

    public static a.ju1 b(android.view.View view) {
        android.view.WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new a.ju1(windowInsetsController);
        }
        return null;
    }

    public static void c(android.view.View view, java.lang.CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
