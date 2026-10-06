package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public interface kj1 extends android.view.MenuItem {
    a.yz0 a();

    a.kj1 b(a.yz0 yz0Var);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    a.kj1 setContentDescription(java.lang.CharSequence charSequence);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    a.kj1 setTooltipText(java.lang.CharSequence charSequence);
}
