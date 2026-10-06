package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ri1 extends a.e01 implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {
    public final android.content.Context d;
    public final a.pz0 e;
    public final a.mz0 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final a.m01 k;
    public android.widget.PopupWindow.OnDismissListener n;
    public android.view.View o;
    public android.view.View p;
    public a.n01 q;
    public android.view.ViewTreeObserver r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean w;
    public final a.ft l = new a.ft(1, this);
    public final a.gt m = new a.gt(1, this);
    public int v = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [a.m01, a.vw0] */
    public ri1(int i, int i2, android.content.Context context, android.view.View view, a.pz0 pz0Var, boolean z) {
        this.d = context;
        this.e = pz0Var;
        this.g = z;
        this.f = new a.mz0(pz0Var, android.view.LayoutInflater.from(context), z, 2131558419);
        this.i = i;
        this.j = i2;
        android.content.res.Resources resources = context.getResources();
        this.h = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165209));
        this.o = view;
        this.k = (m01) new a.vw0(context, null, i, i2);
        pz0Var.b(this, context);
    }

    @Override // a.o01
    public final void a(a.pz0 pz0Var, boolean z) {
        if (pz0Var != this.e) {
            return;
        }
        dismiss();
        a.n01 n01Var = this.q;
        if (n01Var != null) {
            n01Var.a(pz0Var, z);
        }
    }

    @Override // a.nh1
    public final boolean b() {
        return !this.s && this.k.B.isShowing();
    }

    @Override // a.o01
    public final boolean c(a.zi1 zi1Var) {
        if (zi1Var.hasVisibleItems()) {
            a.h01 h01Var = new a.h01(this.i, this.j, this.d, this.p, zi1Var, this.g);
            a.n01 n01Var = this.q;
            h01Var.i = n01Var;
            a.e01 e01Var = h01Var.j;
            if (e01Var != null) {
                e01Var.e(n01Var);
            }
            boolean u = a.e01.u(zi1Var);
            h01Var.h = u;
            a.e01 e01Var2 = h01Var.j;
            if (e01Var2 != null) {
                e01Var2.o(u);
            }
            h01Var.k = this.n;
            this.n = null;
            this.e.c(false);
            a.m01 m01Var = this.k;
            int i = m01Var.h;
            int g = m01Var.g();
            int i2 = this.v;
            android.view.View view = this.o;
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            if ((android.view.Gravity.getAbsoluteGravity(i2, a.sp1.d(view)) & 7) == 5) {
                i += this.o.getWidth();
            }
            if (!h01Var.b()) {
                if (h01Var.f != null) {
                    h01Var.d(i, g, true, true);
                }
            }
            a.n01 n01Var2 = this.q;
            if (n01Var2 != null) {
                n01Var2.o(zi1Var);
            }
            return true;
        }
        return false;
    }

    @Override // a.o01
    public final boolean d() {
        return false;
    }

    @Override // a.nh1
    public final void dismiss() {
        if (b()) {
            this.k.dismiss();
        }
    }

    @Override // a.o01
    public final void e(a.n01 n01Var) {
        this.q = n01Var;
    }

    @Override // a.nh1
    public final void f() {
        android.view.View view;
        if (b()) {
            return;
        }
        if (this.s || (view = this.o) == null) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.p = view;
        a.m01 m01Var = this.k;
        m01Var.B.setOnDismissListener(this);
        m01Var.r = this;
        m01Var.A = true;
        m01Var.B.setFocusable(true);
        android.view.View view2 = this.p;
        boolean z = this.r == null;
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.r = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.l);
        }
        view2.addOnAttachStateChangeListener(this.m);
        m01Var.q = view2;
        m01Var.n = this.v;
        boolean z2 = this.t;
        android.content.Context context = this.d;
        a.mz0 mz0Var = this.f;
        if (!z2) {
            this.u = a.e01.m(mz0Var, context, this.h);
            this.t = true;
        }
        m01Var.r(this.u);
        m01Var.B.setInputMethodMode(2);
        android.graphics.Rect rect = this.c;
        m01Var.z = rect != null ? new android.graphics.Rect(rect) : null;
        m01Var.f();
        a.y90 y90Var = m01Var.e;
        y90Var.setOnKeyListener(this);
        if (this.w) {
            a.pz0 pz0Var = this.e;
            if (pz0Var.m != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(context).inflate(2131558418, (android.view.ViewGroup) y90Var, false);
                android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(pz0Var.m);
                }
                frameLayout.setEnabled(false);
                y90Var.addHeaderView(frameLayout, null, false);
            }
        }
        m01Var.o(mz0Var);
        m01Var.f();
    }

    @Override // a.o01
    public final void g() {
        this.t = false;
        a.mz0 mz0Var = this.f;
        if (mz0Var != null) {
            mz0Var.notifyDataSetChanged();
        }
    }

    @Override // a.nh1
    public final a.y90 k() {
        return this.k.e;
    }

    @Override // a.e01
    public final void l(a.pz0 pz0Var) {
    }

    @Override // a.e01
    public final void n(android.view.View view) {
        this.o = view;
    }

    @Override // a.e01
    public final void o(boolean z) {
        this.f.e = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.s = true;
        this.e.c(true);
        android.view.ViewTreeObserver viewTreeObserver = this.r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.r = this.p.getViewTreeObserver();
            }
            this.r.removeGlobalOnLayoutListener(this.l);
            this.r = null;
        }
        this.p.removeOnAttachStateChangeListener(this.m);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.v = i;
    }

    @Override // a.e01
    public final void q(int i) {
        this.k.h = i;
    }

    @Override // a.e01
    public final void r(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    @Override // a.e01
    public final void s(boolean z) {
        this.w = z;
    }

    @Override // a.e01
    public final void t(int i) {
        this.k.n(i);
    }
}
