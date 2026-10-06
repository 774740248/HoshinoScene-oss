package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d01 extends a.jq implements android.view.MenuItem {
    public final a.kj1 e;
    public java.lang.reflect.Method f;

    public d01(android.content.Context context, a.kj1 kj1Var) {
        super(context);
        if (kj1Var == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.e = kj1Var;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.e.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.e.expandActionView();
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        a.yz0 a2 = this.e.a();
        if (a2 instanceof a.yz0) {
            return a2.f722a;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View actionView = this.e.getActionView();
        return actionView instanceof a.a01 ? (android.view.View) ((a.a01) actionView).c : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.e.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.e.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.e.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.e.getGroupId();
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        return this.e.getIcon();
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.e.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.e.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.e.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.e.getItemId();
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.e.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.e.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.e.getOrder();
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.e.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.e.getTitle();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        return this.e.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.e.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.e.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.e.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.e.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.e.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.e.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.e.isVisible();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        a.yz0 yz0Var = new a.zz0(this, actionProvider);
        if (actionProvider == null) {
            yz0Var = null;
        }
        this.e.b(yz0Var);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new a.a01(view);
        }
        this.e.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c) {
        this.e.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z) {
        this.e.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z) {
        this.e.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.e.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z) {
        this.e.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.e.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.e.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.e.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c) {
        this.e.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.e.setOnActionExpandListener(onActionExpandListener != null ? new a.b01(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.e.setOnMenuItemClickListener(onMenuItemClickListener != null ? new a.c01(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2) {
        this.e.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.e.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i) {
        this.e.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.e.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.e.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.e.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z) {
        return this.e.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.e.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c, int i) {
        this.e.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.e.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i) {
        this.e.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i) {
        a.kj1 kj1Var = this.e;
        kj1Var.setActionView(i);
        android.view.View actionView = kj1Var.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            kj1Var.setActionView(new a.a01(actionView));
        }
        return this;
    }
    public java.lang.String o() {
        throw new UnsupportedOperationException("Method not decompiled: d01.o");
    }
    public java.lang.Object k(int p0, java.lang.Object p1) {
        throw new UnsupportedOperationException("Method not decompiled: d01.k");
    }
    public void j(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: d01.j");
    }
    public void i(java.lang.Object p0, java.lang.Object p1) {
        throw new UnsupportedOperationException("Method not decompiled: d01.i");
    }
    public int h(java.lang.Object p0) {
        throw new UnsupportedOperationException("Method not decompiled: d01.h");
    }
    public int g(java.lang.Object p0) {
        throw new UnsupportedOperationException("Method not decompiled: d01.g");
    }
    public int f() {
        throw new UnsupportedOperationException("Method not decompiled: d01.f");
    }
    public a.kp e() {
        throw new UnsupportedOperationException("Method not decompiled: d01.e");
    }
    public java.lang.Object d(int p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: d01.d");
    }
    public void c() {
        throw new UnsupportedOperationException("Method not decompiled: d01.c");
    }
}
