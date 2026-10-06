package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j2 implements a.o01 {
    public final android.content.Context c;
    public android.content.Context d;
    public a.pz0 e;
    public final android.view.LayoutInflater f;
    public a.n01 g;
    public a.r01 j;
    public a.i2 k;
    public android.graphics.drawable.Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public a.e2 u;
    public a.e2 v;
    public a.g2 w;
    public a.f2 x;
    public final int h = 2131558403;
    public final int i = 2131558402;
    public final android.util.SparseBooleanArray t = new android.util.SparseBooleanArray();
    public final a.vu0 y = new a.vu0(4, this);

    public j2(android.content.Context context) {
        this.c = context;
        this.f = android.view.LayoutInflater.from(context);
    }

    @Override // a.o01
    public final void a(a.pz0 pz0Var, boolean z) {
        f();
        a.e2 e2Var = this.v;
        if (e2Var != null && e2Var.b()) {
            e2Var.j.dismiss();
        }
        a.n01 n01Var = this.g;
        if (n01Var != null) {
            n01Var.a(pz0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.q01] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final android.view.View b(a.xz0 xz0Var, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = xz0Var.getActionView();
        if (actionView == null || xz0Var.e()) {
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = view instanceof a.q01 ? (a.q01) view : (a.q01) this.f.inflate(this.i, viewGroup, false);
            actionMenuItemView.a(xz0Var);
            androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((androidx.appcompat.widget.ActionMenuView) this.j);
            if (this.x == null) {
                this.x = new a.f2(this);
            }
            actionMenuItemView2.setPopupCallback(this.x);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(xz0Var.C ? 8 : 0);
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((androidx.appcompat.widget.ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(androidx.appcompat.widget.ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.o01
    public final boolean c(a.zi1 zi1Var) {
        boolean z;
        if (!zi1Var.hasVisibleItems()) {
            return false;
        }
        a.zi1 zi1Var2 = zi1Var;
        while (true) {
            a.pz0 pz0Var = zi1Var2.z;
            if (pz0Var == this.e) {
                break;
            }
            zi1Var2 = (a.zi1) pz0Var;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.j;
        android.view.View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                android.view.View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof a.q01) && ((a.q01) childAt).getItemData() == zi1Var2.A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        zi1Var.A.getClass();
        int size = zi1Var.f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            android.view.MenuItem item = zi1Var.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        a.e2 e2Var = new a.e2(this, this.d, zi1Var, view);
        this.v = e2Var;
        e2Var.h = z;
        a.e01 e01Var = e2Var.j;
        if (e01Var != null) {
            e01Var.o(z);
        }
        a.e2 e2Var2 = this.v;
        if (!e2Var2.b()) {
            if (e2Var2.f == null) {
                throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            e2Var2.d(0, 0, false, false);
        }
        a.n01 n01Var = this.g;
        if (n01Var != null) {
            n01Var.o(zi1Var);
        }
        return true;
    }

    @Override // a.o01
    public final boolean d() {
        int i;
        java.util.ArrayList arrayList;
        int i2;
        boolean z;
        a.pz0 pz0Var = this.e;
        if (pz0Var != null) {
            arrayList = pz0Var.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.r;
        int i4 = this.q;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.j;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            a.xz0 xz0Var = (a.xz0) arrayList.get(i5);
            int i8 = xz0Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.s && xz0Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.n && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        android.util.SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            a.xz0 xz0Var2 = (a.xz0) arrayList.get(i10);
            int i12 = xz0Var2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = xz0Var2.b;
            if (z3) {
                android.view.View b = b(xz0Var2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                xz0Var2.g(z);
            } else if (((i12 & 1) != 0) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    android.view.View b2 = b(xz0Var2, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        a.xz0 xz0Var3 = (a.xz0) arrayList.get(i14);
                        if (xz0Var3.b == i13) {
                            if (xz0Var3.f()) {
                                i9++;
                            }
                            xz0Var3.g(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                xz0Var2.g(z5);
            } else {
                xz0Var2.g(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    @Override // a.o01
    public final void e(a.n01 n01Var) {
        this.g = n01Var;
    }

    public final boolean f() {
        java.lang.Object obj;
        a.g2 g2Var = this.w;
        if (g2Var != null && (obj = this.j) != null) {
            ((android.view.View) obj).removeCallbacks(g2Var);
            this.w = null;
            return true;
        }
        a.e2 e2Var = this.u;
        if (e2Var == null) {
            return false;
        }
        if (e2Var.b()) {
            e2Var.j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.o01
    public final void g() {
        int size;
        int i;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.j;
        java.util.ArrayList arrayList = null;
        if (viewGroup != null) {
            a.pz0 pz0Var = this.e;
            if (pz0Var != null) {
                pz0Var.i();
                java.util.ArrayList l = this.e.l();
                int size2 = l.size();
                i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    a.xz0 xz0Var = (a.xz0) l.get(i2);
                    if (xz0Var.f()) {
                        android.view.View childAt = viewGroup.getChildAt(i);
                        a.xz0 itemData = childAt instanceof a.q01 ? ((a.q01) childAt).getItemData() : null;
                        android.view.View b = b(xz0Var, childAt, viewGroup);
                        if (xz0Var != itemData) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((android.view.ViewGroup) this.j).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((android.view.View) this.j).requestLayout();
        a.pz0 pz0Var2 = this.e;
        if (pz0Var2 != null) {
            pz0Var2.i();
            java.util.ArrayList arrayList2 = pz0Var2.i;
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                a.yz0 yz0Var = ((a.xz0) arrayList2.get(i3)).A;
            }
        }
        a.pz0 pz0Var3 = this.e;
        if (pz0Var3 != null) {
            pz0Var3.i();
            arrayList = pz0Var3.j;
        }
        if (!this.n || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((a.xz0) arrayList.get(0)).C))) {
            a.i2 i2Var = this.k;
            if (i2Var != null) {
                java.lang.Object parent = i2Var.getParent();
                java.lang.Object obj = this.j;
                if (parent == obj) {
                    ((android.view.ViewGroup) obj).removeView(this.k);
                }
            }
        } else {
            if (this.k == null) {
                this.k = new a.i2(this, this.c);
            }
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) this.k.getParent();
            if (viewGroup3 != this.j) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k);
                }
                androidx.appcompat.widget.ActionMenuView actionMenuView = (androidx.appcompat.widget.ActionMenuView) this.j;
                a.i2 i2Var2 = this.k;
                actionMenuView.getClass();
                a.l2 l2 = androidx.appcompat.widget.ActionMenuView.l();
                l2.f307a = true;
                actionMenuView.addView(i2Var2, l2);
            }
        }
        ((androidx.appcompat.widget.ActionMenuView) this.j).setOverflowReserved(this.n);
    }

    @Override // a.o01
    public final void h(android.content.Context context, a.pz0 pz0Var) {
        this.d = context;
        android.view.LayoutInflater.from(context);
        this.e = pz0Var;
        android.content.res.Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        int i = 2;
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.r = i;
        int i4 = this.p;
        if (this.n) {
            if (this.k == null) {
                a.i2 i2Var = new a.i2(this, this.c);
                this.k = i2Var;
                if (this.m) {
                    i2Var.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // a.o01
    public final /* bridge */ /* synthetic */ boolean i(a.xz0 xz0Var) {
        return false;
    }

    @Override // a.o01
    public final /* bridge */ /* synthetic */ boolean j(a.xz0 xz0Var) {
        return false;
    }

    public final boolean k() {
        a.e2 e2Var = this.u;
        return e2Var != null && e2Var.b();
    }

    public final boolean l() {
        a.pz0 pz0Var;
        int i = 0;
        if (this.n && !k() && (pz0Var = this.e) != null && this.j != null && this.w == null) {
            pz0Var.i();
            if (!pz0Var.j.isEmpty()) {
                a.g2 g2Var = new a.g2(this, i, new a.e2(this, this.d, this.e, this.k));
                this.w = g2Var;
                ((android.view.View) this.j).post(g2Var);
                return true;
            }
        }
        return false;
    }
}
