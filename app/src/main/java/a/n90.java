package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class n90 implements android.view.View.OnApplyWindowInsetsListener {

    public n90() {
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) view;
        boolean z = false;
        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.mShadowLeftResolved = windowInsets;
        drawerLayout.mDrawStatusBarBackground = z2;
        if (!z2 && drawerLayout.getBackground() == null) {
            z = true;
        }
        drawerLayout.setWillNotDraw(z);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
