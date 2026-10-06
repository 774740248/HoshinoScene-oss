package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kt extends a.e01 implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    public android.view.ViewTreeObserver A;
    public android.widget.PopupWindow.OnDismissListener B;
    public boolean C;
    public final android.content.Context d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final android.os.Handler i;
    public android.view.View q;
    public android.view.View r;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean y;
    public a.n01 z;
    public final java.util.ArrayList j = new java.util.ArrayList();
    public final java.util.ArrayList k = new java.util.ArrayList();
    public final a.ft l = new a.ft(0, this);
    public final a.gt m = new a.gt(0, this);
    public final a.vu0 n = new a.vu0(2, this);
    public int o = 0;
    public int p = 0;
    public boolean x = false;

    public kt(android.content.Context context, android.view.View view, int i, int i2, boolean z) {
        this.d = context;
        this.q = view;
        this.f = i;
        this.g = i2;
        this.h = z;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        this.s = a.sp1.d(view) != 1 ? 1 : 0;
        android.content.res.Resources resources = context.getResources();
        this.e = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165209));
        this.i = new android.os.Handler();
    }

    @Override // a.o01
    public final void a(a.pz0 pz0Var, boolean z) {
        java.util.ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (pz0Var == ((a.jt) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((a.jt) arrayList.get(i2)).b.c(false);
        }
        a.jt jtVar = (a.jt) arrayList.remove(i);
        jtVar.b.r(this);
        boolean z2 = this.C;
        a.m01 m01Var = jtVar.f268a;
        if (z2) {
            a.i01.b(m01Var.B, null);
            m01Var.B.setAnimationStyle(0);
        }
        m01Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.s = ((a.jt) arrayList.get(size2 - 1)).c;
        } else {
            android.view.View view = this.q;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            this.s = a.sp1.d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((a.jt) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        a.n01 n01Var = this.z;
        if (n01Var != null) {
            n01Var.a(pz0Var, true);
        }
        android.view.ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.l);
            }
            this.A = null;
        }
        this.r.removeOnAttachStateChangeListener(this.m);
        this.B.onDismiss();
    }

    @Override // a.nh1
    public final boolean b() {
        java.util.ArrayList arrayList = this.k;
        return arrayList.size() > 0 && ((a.jt) arrayList.get(0)).f268a.B.isShowing();
    }

    @Override // a.o01
    public final boolean c(a.zi1 zi1Var) {
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            a.jt jtVar = (a.jt) it.next();
            if (zi1Var == jtVar.b) {
                jtVar.f268a.e.requestFocus();
                return true;
            }
        }
        if (!zi1Var.hasVisibleItems()) {
            return false;
        }
        l(zi1Var);
        a.n01 n01Var = this.z;
        if (n01Var != null) {
            n01Var.o(zi1Var);
        }
        return true;
    }

    @Override // a.o01
    public final boolean d() {
        return false;
    }

    @Override // a.nh1
    public final void dismiss() {
        java.util.ArrayList arrayList = this.k;
        int size = arrayList.size();
        if (size > 0) {
            a.jt[] jtVarArr = (a.jt[]) arrayList.toArray(new a.jt[size]);
            for (int i = size - 1; i >= 0; i--) {
                a.jt jtVar = jtVarArr[i];
                if (jtVar.f268a.B.isShowing()) {
                    jtVar.f268a.dismiss();
                }
            }
        }
    }

    @Override // a.o01
    public final void e(a.n01 n01Var) {
        this.z = n01Var;
    }

    @Override // a.nh1
    public final void f() {
        if (b()) {
            return;
        }
        java.util.ArrayList arrayList = this.j;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((a.pz0) it.next());
        }
        arrayList.clear();
        android.view.View view = this.q;
        this.r = view;
        if (view != null) {
            boolean z = this.A == null;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.l);
            }
            this.r.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // a.o01
    public final void g() {
        java.util.Iterator it = this.k.iterator();
        while (it.hasNext()) {
            android.widget.ListAdapter adapter = ((a.jt) it.next()).f268a.e.getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                adapter = ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((a.mz0) adapter).notifyDataSetChanged();
        }
    }

    @Override // a.nh1
    public final a.y90 k() {
        java.util.ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((a.jt) arrayList.get(arrayList.size() - 1)).f268a.e;
    }

    @Override // a.e01
    public final void l(a.pz0 pz0Var) {
        pz0Var.b(this, this.d);
        if (b()) {
            v(pz0Var);
        } else {
            this.j.add(pz0Var);
        }
    }

    @Override // a.e01
    public final void n(android.view.View view) {
        if (this.q != view) {
            this.q = view;
            int i = this.o;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            this.p = android.view.Gravity.getAbsoluteGravity(i, a.sp1.d(view));
        }
    }

    @Override // a.e01
    public final void o(boolean z) {
        this.x = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        a.jt jtVar;
        java.util.ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                jtVar = null;
                break;
            }
            jtVar = (a.jt) arrayList.get(i);
            if (!jtVar.f268a.B.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (jtVar != null) {
            jtVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.e01
    public final void p(int i) {
        if (this.o != i) {
            this.o = i;
            android.view.View view = this.q;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            this.p = android.view.Gravity.getAbsoluteGravity(i, a.sp1.d(view));
        }
    }

    @Override // a.e01
    public final void q(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // a.e01
    public final void r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // a.e01
    public final void s(boolean z) {
        this.y = z;
    }

    @Override // a.e01
    public final void t(int i) {
        this.u = true;
        this.w = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.m01, a.vw0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(a.pz0 r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kt.v(a.pz0):void");
    }
}
