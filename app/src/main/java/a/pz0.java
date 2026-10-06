package a;

import android.util.SparseArray;
import android.os.Parcelable;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class pz0 implements a.gj1 {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f455a;
    public final android.content.res.Resources b;
    public boolean c;
    public final boolean d;
    public a.nz0 e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;
    public boolean h;
    public final java.util.ArrayList i;
    public final java.util.ArrayList j;
    public boolean k;
    public java.lang.CharSequence m;
    public android.graphics.drawable.Drawable n;
    public android.view.View o;
    public a.xz0 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final java.util.ArrayList t = new java.util.ArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList u = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean w = false;

    public pz0(android.content.Context context) {
        android.content.res.Resources resources;
        int identifier;
        boolean z = false;
        this.f455a = context;
        android.content.res.Resources resources2 = context.getResources();
        this.b = resources2;
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = true;
        this.i = new java.util.ArrayList();
        this.j = new java.util.ArrayList();
        this.k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            if (android.os.Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) == 0 || !resources.getBoolean(identifier)) : a.mq1.b(viewConfiguration)) {
                z = true;
            }
        }
        this.d = z;
    }

    public final a.xz0 a(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        a.xz0 xz0Var = new a.xz0(this, i, i2, i3, i6, charSequence, this.l);
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((a.xz0) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, xz0Var);
        p(true);
        return xz0Var;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        int i5;
        android.content.pm.PackageManager packageManager = this.f455a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            android.content.pm.ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            android.content.Intent intent2 = new android.content.Intent(i7 < 0 ? intent : intentArr[i7]);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new android.content.ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            a.xz0 a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(a.o01 o01Var, android.content.Context context) {
        this.u.add(new java.lang.ref.WeakReference(o01Var));
        o01Var.h(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            a.o01 o01Var = (a.o01) weakReference.get();
            if (o01Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                o01Var.a(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        a.xz0 xz0Var = this.v;
        if (xz0Var != null) {
            d(xz0Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(a.xz0 xz0Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == xz0Var) {
            x();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                a.o01 o01Var = (a.o01) weakReference.get();
                if (o01Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = o01Var.i(xz0Var);
                    if (z) {
                        break;
                    }
                }
            }
            w();
            if (z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(a.pz0 pz0Var, android.view.MenuItem menuItem) {
        a.nz0 nz0Var = this.e;
        return nz0Var != null && nz0Var.g(pz0Var, menuItem);
    }

    public boolean f(a.xz0 xz0Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        x();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            a.o01 o01Var = (a.o01) weakReference.get();
            if (o01Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = o01Var.j(xz0Var);
                if (z) {
                    break;
                }
            }
        }
        w();
        if (z) {
            this.v = xz0Var;
        }
        return z;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i) {
        android.view.MenuItem findItem;
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.xz0 xz0Var = (a.xz0) arrayList.get(i2);
            if (xz0Var.f698a == i) {
                return xz0Var;
            }
            if (xz0Var.hasSubMenu() && (findItem = xz0Var.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final a.xz0 g(int i, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (a.xz0) arrayList.get(0);
        }
        boolean n = n();
        for (int i2 = 0; i2 < size; i2++) {
            a.xz0 xz0Var = (a.xz0) arrayList.get(i2);
            char c = n ? xz0Var.j : xz0Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n && c == '\b' && i == 67))) {
                return xz0Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i) {
        return (android.view.MenuItem) this.f.get(i);
    }

    public final void h(java.util.ArrayList arrayList, int i, android.view.KeyEvent keyEvent) {
        int i2;
        boolean n = n();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            java.util.ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (i2 = 0; i2 < size; i2++) {
                a.xz0 xz0Var = (a.xz0) arrayList2.get(i2);
                if (xz0Var.hasSubMenu()) {
                    xz0Var.o.h(arrayList, i, keyEvent);
                }
                char c = n ? xz0Var.j : xz0Var.h;
                if ((modifiers & 69647) == ((n ? xz0Var.k : xz0Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (n && c == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (xz0Var.isEnabled()) {
                        arrayList.add(xz0Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((a.xz0) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        java.util.ArrayList l = l();
        if (this.k) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                a.o01 o01Var = (a.o01) weakReference.get();
                if (o01Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= o01Var.d();
                }
            }
            java.util.ArrayList arrayList = this.i;
            java.util.ArrayList arrayList2 = this.j;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    a.xz0 xz0Var = (a.xz0) l.get(i);
                    if (xz0Var.f()) {
                        arrayList.add(xz0Var);
                    } else {
                        arrayList2.add(xz0Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public java.lang.String j() {
        return "android:menu:actionviewstates";
    }

    public a.pz0 k() {
        return this;
    }

    public final java.util.ArrayList l() {
        boolean z = this.h;
        java.util.ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            a.xz0 xz0Var = (a.xz0) arrayList2.get(i);
            if (xz0Var.isVisible()) {
                arrayList.add(xz0Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        x();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            a.o01 o01Var = (a.o01) weakReference.get();
            if (o01Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                o01Var.g();
            }
        }
        w();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        a.xz0 g = g(i, keyEvent);
        boolean q = g != null ? q(g, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, a.o01 r8, int r9) {
        /*
            r6 = this;
            a.xz0 r7 = (a.xz0) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem.OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            a.pz0 r1 = r7.n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f455a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            a.yz0 r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f722a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            a.yz0 r3 = r7.A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f722a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            a.zi1 r9 = new a.zi1
            android.content.Context r5 = r6.f455a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L90:
            a.zi1 r7 = r7.o
            if (r4 == 0) goto L9e
            a.d01 r9 = r3.b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f722a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.c(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            a.o01 r4 = (a.o01) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.c(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pz0.q(android.view.MenuItem, a.o01, int):boolean");
    }

    public final void r(a.o01 o01Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            a.o01 o01Var2 = (a.o01) weakReference.get();
            if (o01Var2 == null || o01Var2 == o01Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((a.xz0) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((a.xz0) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    java.util.ArrayList arrayList2 = this.f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((a.xz0) arrayList.get(i2)).f698a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            java.util.ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(android.os.Bundle bundle) {
        android.view.MenuItem findItem;
        if (bundle == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((a.zi1) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.xz0 xz0Var = (a.xz0) arrayList.get(i2);
            if (xz0Var.b == i) {
                xz0Var.x = (xz0Var.x & (-5)) | (z2 ? 4 : 0);
                xz0Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.xz0 xz0Var = (a.xz0) arrayList.get(i2);
            if (xz0Var.b == i) {
                xz0Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        java.util.ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            a.xz0 xz0Var = (a.xz0) arrayList.get(i2);
            if (xz0Var.b == i) {
                int i3 = xz0Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                xz0Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(android.os.Bundle bundle) {
        int size = this.f.size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState((SparseArray<Parcelable>) sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((a.zi1) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public void u(a.nz0 nz0Var) {
        this.e = nz0Var;
    }

    public final void v(int i, java.lang.CharSequence charSequence, int i2, android.graphics.drawable.Drawable drawable, android.view.View view) {
        android.content.res.Resources resources = this.b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = resources.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                android.content.Context context = this.f455a;
                java.lang.Object obj = a.zx.f748a;
                this.n = a.xx.b(context, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void w() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void x() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        a.xz0 a2 = a(i, i2, i3, charSequence);
        a.zi1 zi1Var = new a.zi1(this.f455a, this, a2);
        a2.o = zi1Var;
        zi1Var.setHeaderTitle(a2.e);
        return zi1Var;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
