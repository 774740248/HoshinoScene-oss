package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ij1 {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public final /* synthetic */ a.jj1 E;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Menu f231a;
    public boolean h;
    public int i;
    public int j;
    public java.lang.CharSequence k;
    public java.lang.CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public java.lang.String x;
    public java.lang.String y;
    public a.yz0 z;
    public android.content.res.ColorStateList C = null;
    public android.graphics.PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public ij1(a.jj1 jj1Var, android.view.Menu menu) {
        this.E = jj1Var;
        this.f231a = menu;
    }

    public final java.lang.Object a(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (java.lang.Exception e) {
            android.util.Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem.OnMenuItemClickListener, java.lang.Object, a.hj1] */
    public final void b(android.view.MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        java.lang.String str = this.y;
        a.jj1 jj1Var = this.E;
        if (str != null) {
            if (jj1Var.c.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jj1Var.d == null) {
                jj1Var.d = a.jj1.a(jj1Var.c);
            }
            java.lang.Object obj = jj1Var.d;
            java.lang.String str2 = this.y;
            hj1 obj2 = new hj1();
            obj2.f207a = obj;
            java.lang.Class<?> cls = obj.getClass();
            try {
                obj2.b = cls.getMethod(str2, a.hj1.c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (java.lang.Exception e) {
                android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof a.xz0) {
                a.xz0 xz0Var = (a.xz0) menuItem;
                xz0Var.x = (xz0Var.x & (-5)) | 4;
            } else if (menuItem instanceof a.d01) {
                a.d01 d01Var = (a.d01) menuItem;
                try {
                    java.lang.reflect.Method method = d01Var.f;
                    a.kj1 kj1Var = d01Var.e;
                    if (method == null) {
                        d01Var.f = kj1Var.getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
                    }
                    d01Var.f.invoke(kj1Var, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception e2) {
                    android.util.Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        java.lang.String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((android.view.View) a(str3, a.jj1.e, jj1Var.f256a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        a.yz0 yz0Var = this.z;
        if (yz0Var != null) {
            if (menuItem instanceof a.kj1) {
                ((a.kj1) menuItem).b(yz0Var);
            } else {
                android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        java.lang.CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof a.kj1;
        if (z2) {
            ((a.kj1) menuItem).setContentDescription(charSequence);
        } else {
            a.vz0.h(menuItem, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.B;
        if (z2) {
            ((a.kj1) menuItem).setTooltipText(charSequence2);
        } else {
            a.vz0.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((a.kj1) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            a.vz0.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((a.kj1) menuItem).setNumericShortcut(c2, i4);
        } else {
            a.vz0.k(menuItem, c2, i4);
        }
        android.graphics.PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((a.kj1) menuItem).setIconTintMode(mode);
            } else {
                a.vz0.j(menuItem, mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((a.kj1) menuItem).setIconTintList(colorStateList);
            } else {
                a.vz0.i(menuItem, colorStateList);
            }
        }
    }
}
