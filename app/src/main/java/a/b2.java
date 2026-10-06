package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b2 implements a.kj1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f29a;
    public java.lang.CharSequence b;
    public android.content.Intent c;
    public char d;
    public char f;
    public android.graphics.drawable.Drawable h;
    public final android.content.Context i;
    public java.lang.CharSequence j;
    public java.lang.CharSequence k;
    public int e = 4096;
    public int g = 4096;
    public android.content.res.ColorStateList l = null;
    public android.graphics.PorterDuff.Mode m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public b2(android.content.Context context, java.lang.CharSequence charSequence) {
        this.i = context;
        this.f29a = charSequence;
    }

    @Override // a.kj1
    public final a.yz0 a() {
        return null;
    }

    @Override // a.kj1
    public final a.kj1 b(a.yz0 yz0Var) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.h;
        if (drawable != null) {
            if (this.n || this.o) {
                this.h = drawable;
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.h = mutate;
                if (this.n) {
                    a.i90.h(mutate, this.l);
                }
                if (this.o) {
                    a.i90.i(this.h, this.m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        return null;
    }

    @Override // a.kj1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // a.kj1, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        return this.h;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a.kj1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.f29a;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.f29a;
    }

    @Override // a.kj1, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c) {
        this.f = java.lang.Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final a.kj1 setContentDescription(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.f = java.lang.Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f29a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final a.kj1 setTooltipText(java.lang.CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z) {
        this.p = (this.p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        this.f = java.lang.Character.toLowerCase(c);
        this.g = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i) {
        android.content.Context context = this.i;
        java.lang.Object obj = a.zx.f748a;
        this.h = a.xx.b(context, i);
        c();
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c, int i) {
        this.d = c;
        this.e = android.view.KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d = c;
        this.e = android.view.KeyEvent.normalizeMetaState(i);
        this.f = java.lang.Character.toLowerCase(c2);
        this.g = android.view.KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i) {
        this.f29a = this.i.getResources().getString(i);
        return this;
    }
}
