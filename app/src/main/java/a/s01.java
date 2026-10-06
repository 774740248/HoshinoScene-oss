package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class s01 extends a.jq implements android.view.Menu {
    public final a.gj1 e;

    public s01(android.content.Context context, a.gj1 gj1Var) {
        super(context);
        if (gj1Var == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.e = gj1Var;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i) {
        return m(((a.pz0) this.e).add(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.view.MenuItem[] menuItemArr2 = menuItemArr != null ? new android.view.MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((a.pz0) this.e).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i) {
        return ((a.pz0) this.e).addSubMenu(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        a.rh1 rh1Var = (a.rh1) this.c;
        if (rh1Var != null) {
            rh1Var.clear();
        }
        a.rh1 rh1Var2 = (a.rh1) this.d;
        if (rh1Var2 != null) {
            rh1Var2.clear();
        }
        ((a.pz0) this.e).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((a.pz0) this.e).c(true);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i) {
        return m(((a.pz0) this.e).findItem(i));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i) {
        return m(((a.pz0) this.e).getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((a.pz0) this.e).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return ((a.pz0) this.e).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return ((a.pz0) this.e).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        return ((a.pz0) this.e).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((a.rh1) this.c) != null) {
            int i2 = 0;
            while (true) {
                a.rh1 rh1Var = (a.rh1) this.c;
                if (i2 >= rh1Var.e) {
                    break;
                }
                if (((a.kj1) rh1Var.h(i2)).getGroupId() == i) {
                    ((a.rh1) this.c).i(i2);
                    i2--;
                }
                i2++;
            }
        }
        ((a.pz0) this.e).removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((a.rh1) this.c) != null) {
            int i2 = 0;
            while (true) {
                a.rh1 rh1Var = (a.rh1) this.c;
                if (i2 >= rh1Var.e) {
                    break;
                }
                if (((a.kj1) rh1Var.h(i2)).getItemId() == i) {
                    ((a.rh1) this.c).i(i2);
                    break;
                }
                i2++;
            }
        }
        ((a.pz0) this.e).removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ((a.pz0) this.e).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ((a.pz0) this.e).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ((a.pz0) this.e).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.e.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((a.pz0) this.e).f.size();
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return m(((a.pz0) this.e).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return ((a.pz0) this.e).addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return m(((a.pz0) this.e).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return ((a.pz0) this.e).addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return ((a.pz0) this.e).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return m(((a.pz0) this.e).a(i, i2, i3, charSequence));
    }
    public java.lang.String o() {
        throw new UnsupportedOperationException("Method not decompiled: s01.o");
    }
    public java.lang.Object k(int p0, java.lang.Object p1) {
        throw new UnsupportedOperationException("Method not decompiled: s01.k");
    }
    public void j(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: s01.j");
    }
    public void i(java.lang.Object p0, java.lang.Object p1) {
        throw new UnsupportedOperationException("Method not decompiled: s01.i");
    }
    public int h(java.lang.Object p0) {
        throw new UnsupportedOperationException("Method not decompiled: s01.h");
    }
    public int g(java.lang.Object p0) {
        throw new UnsupportedOperationException("Method not decompiled: s01.g");
    }
    public int f() {
        throw new UnsupportedOperationException("Method not decompiled: s01.f");
    }
    public a.kp e() {
        throw new UnsupportedOperationException("Method not decompiled: s01.e");
    }
    public java.lang.Object d(int p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: s01.d");
    }
    public void c() {
        throw new UnsupportedOperationException("Method not decompiled: s01.c");
    }
}
