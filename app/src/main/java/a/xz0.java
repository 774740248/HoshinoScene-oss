package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xz0 implements a.kj1 {
    public a.yz0 A;
    public android.view.MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f698a;
    public final int b;
    public final int c;
    public final int d;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.content.Intent g;
    public char h;
    public char j;
    public android.graphics.drawable.Drawable l;
    public final a.pz0 n;
    public a.zi1 o;
    public android.view.MenuItem.OnMenuItemClickListener p;
    public java.lang.CharSequence q;
    public java.lang.CharSequence r;
    public int y;
    public android.view.View z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public android.content.res.ColorStateList s = null;
    public android.graphics.PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    public xz0(a.pz0 pz0Var, int i, int i2, int i3, int i4, java.lang.CharSequence charSequence, int i5) {
        this.n = pz0Var;
        this.f698a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.y = i5;
    }

    public static void c(java.lang.StringBuilder sb, int i, int i2, java.lang.String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // a.kj1
    public final a.yz0 a() {
        return this.A;
    }

    @Override // a.kj1
    public final a.kj1 b(a.yz0 yz0Var) {
        a.yz0 yz0Var2 = this.A;
        if (yz0Var2 != null) {
            yz0Var2.getClass();
        }
        this.z = null;
        this.A = yz0Var;
        this.n.p(true);
        a.yz0 yz0Var3 = this.A;
        if (yz0Var3 != null) {
            yz0Var3.d(new a.vu0(3, this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = drawable.mutate();
            if (this.u) {
                a.i90.h(drawable, this.s);
            }
            if (this.v) {
                a.i90.i(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        a.yz0 yz0Var;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (yz0Var = this.A) != null) {
            this.z = yz0Var.b(this);
        }
        return this.z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.x & 32) == 32;
    }

    public final void g(boolean z) {
        if (z) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View view = this.z;
        if (view != null) {
            return view;
        }
        a.yz0 yz0Var = this.A;
        if (yz0Var == null) {
            return null;
        }
        android.view.View b = yz0Var.b(this);
        this.z = b;
        return b;
    }

    @Override // a.kj1, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // a.kj1, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.m;
        if (i == 0) {
            return null;
        }
        android.graphics.drawable.Drawable Y = a.b20.Y(this.n.f455a, i);
        this.m = 0;
        this.l = Y;
        return d(Y);
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f698a;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a.kj1, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // a.kj1, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        a.yz0 yz0Var = this.A;
        return (yz0Var == null || !yz0Var.c()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.a();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f698a) > 0) {
            view.setId(i);
        }
        a.pz0 pz0Var = this.n;
        pz0Var.k = true;
        pz0Var.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = java.lang.Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.x = i2;
        if (i != i2) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z) {
        int i = this.x;
        if ((i & 4) != 0) {
            a.pz0 pz0Var = this.n;
            pz0Var.getClass();
            java.util.ArrayList arrayList = pz0Var.f;
            int size = arrayList.size();
            pz0Var.x();
            for (int i2 = 0; i2 < size; i2++) {
                a.xz0 xz0Var = (a.xz0) arrayList.get(i2);
                if (xz0Var.b == this.b && (xz0Var.x & 4) != 0 && xz0Var.isCheckable()) {
                    boolean z2 = xz0Var == this;
                    int i3 = xz0Var.x;
                    int i4 = (z2 ? 2 : 0) | (i3 & (-3));
                    xz0Var.x = i4;
                    if (i3 != i4) {
                        xz0Var.n.p(false);
                    }
                }
            }
            pz0Var.w();
        } else {
            int i5 = (i & (-3)) | (z ? 2 : 0);
            this.x = i5;
            if (i != i5) {
                this.n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z) {
        if (z) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = java.lang.Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i;
        a.pz0 pz0Var = this.n;
        pz0Var.k = true;
        pz0Var.p(true);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        a.zi1 zi1Var = this.o;
        if (zi1Var != null) {
            zi1Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z) {
        int i = this.x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.x = i2;
        if (i != i2) {
            a.pz0 pz0Var = this.n;
            pz0Var.h = true;
            pz0Var.p(true);
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // a.kj1, android.view.MenuItem
    public final a.kj1 setContentDescription(java.lang.CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = android.view.KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final a.kj1 setTooltipText(java.lang.CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = java.lang.Character.toLowerCase(c);
        this.k = android.view.KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // a.kj1, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = android.view.KeyEvent.normalizeMetaState(i);
        this.j = java.lang.Character.toLowerCase(c2);
        this.k = android.view.KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i) {
        setTitle(this.n.f455a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i) {
        int i2;
        android.content.Context context = this.n.f455a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) new android.widget.LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f698a) > 0) {
            inflate.setId(i2);
        }
        a.pz0 pz0Var = this.n;
        pz0Var.k = true;
        pz0Var.p(true);
        return this;
    }
}
