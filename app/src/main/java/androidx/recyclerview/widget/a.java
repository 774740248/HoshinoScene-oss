package androidx.recyclerview.widget;
import a.ca1;
import a.cq0;
import a.d91;
import a.da1;
import a.e91;
import a.g0;
import a.j91;
import a.jq1;
import a.l91;
import a.m91;
import a.n91;
import a.p4;
import a.r81;
import a.rp1;
import a.ru;
import a.sp1;
import a.t91;
import a.xv0;
import a.z91;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class a {
    public ru c;
    public androidx.recyclerview.widget.RecyclerView d;
    public final p4 e;
    public final p4 f;
    public xv0 g;
    public boolean h;
    public boolean i;
    public final boolean j;
    public final boolean k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;

    public a() {
        l91 l91Var = new l91(this, 0);
        l91 l91Var2 = new l91(this, 1);
        this.e = new p4(l91Var);
        this.f = new p4(l91Var2);
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int H(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.H(boolean, int, int, int, int):int");
    }

    public static int J(android.view.View view) {
        return view.getBottom() + ((n91) view.getLayoutParams()).d.bottom;
    }

    public static int L(android.view.View view) {
        return view.getLeft() - ((n91) view.getLayoutParams()).d.left;
    }

    public static int M(android.view.View view) {
        return view.getRight() + ((n91) view.getLayoutParams()).d.right;
    }

    public static int N(android.view.View view) {
        return view.getTop() - ((n91) view.getLayoutParams()).d.top;
    }

    public static int Q(android.view.View view) {
        return ((n91) view.getLayoutParams()).c.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m91, java.lang.Object] */
    public static m91 R(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        m91 obj = new m91();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r81.f487a, i, i2);
        obj.f341a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean V(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void W(android.view.View view, int i, int i2, int i3, int i4) {
        n91 n91Var = (n91) view.getLayoutParams();
        android.graphics.Rect rect = n91Var.d;
        view.layout(i + rect.left + ((android.view.ViewGroup.MarginLayoutParams) n91Var).leftMargin, i2 + rect.top + ((android.view.ViewGroup.MarginLayoutParams) n91Var).topMargin, (i3 - rect.right) - ((android.view.ViewGroup.MarginLayoutParams) n91Var).rightMargin, (i4 - rect.bottom) - ((android.view.ViewGroup.MarginLayoutParams) n91Var).bottomMargin);
    }

    public static int r(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? java.lang.Math.max(i2, i3) : size : java.lang.Math.min(size, java.lang.Math.max(i2, i3));
    }

    public final void A(t91 t91Var) {
        for (int G = G() - 1; G >= 0; G--) {
            android.view.View F = F(G);
            da1 N = androidx.recyclerview.widget.RecyclerView.N(F);
            if (N.s()) {
                if (androidx.recyclerview.widget.RecyclerView.E0) {
                    android.util.Log.d("RecyclerView", "ignoring view " + N);
                }
            } else if (!N.j() || N.l() || this.d.o.d) {
                F(G);
                this.c.c(G);
                t91Var.j(F);
                this.d.i.r(N);
            } else {
                if (F(G) != null) {
                    this.c.k(G);
                }
                t91Var.i(N);
            }
        }
    }

    public int A0(int i, t91 t91Var, z91 z91Var) {
        return 0;
    }

    public android.view.View B(int i) {
        int G = G();
        for (int i2 = 0; i2 < G; i2++) {
            android.view.View F = F(i2);
            da1 N = androidx.recyclerview.widget.RecyclerView.N(F);
            if (N != null && N.e() == i && !N.s() && (this.d.j0.g || !N.l())) {
                return F;
            }
        }
        return null;
    }

    public final void B0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        C0(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract n91 C();

    public final void C0(int i, int i2) {
        this.p = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        this.n = mode;
        if (mode == 0 && !androidx.recyclerview.widget.RecyclerView.H0) {
            this.p = 0;
        }
        this.q = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        this.o = mode2;
        if (mode2 != 0 || androidx.recyclerview.widget.RecyclerView.H0) {
            return;
        }
        this.q = 0;
    }

    public n91 D(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new n91(context, attributeSet);
    }

    public void D0(android.graphics.Rect rect, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        java.util.WeakHashMap weakHashMap = jq1.f264a;
        androidx.recyclerview.widget.RecyclerView.g(this.d, r(i, paddingRight, rp1.e(recyclerView)), r(i2, paddingBottom, rp1.d(this.d)));
    }

    public n91 E(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof n91 ? new n91((n91) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new n91((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new n91(layoutParams);
    }

    public final void E0(int i, int i2) {
        int G = G();
        if (G == 0) {
            this.d.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < G; i7++) {
            android.view.View F = F(i7);
            android.graphics.Rect rect = this.d.l;
            K(F, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.d.l.set(i6, i4, i3, i5);
        D0(this.d.l, i, i2);
    }

    public final android.view.View F(int i) {
        ru ruVar = this.c;
        if (ruVar != null) {
            return ruVar.d(i);
        }
        return null;
    }

    public final void F0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.d = null;
            this.c = null;
            this.p = 0;
            this.q = 0;
        } else {
            this.d = recyclerView;
            this.c = recyclerView.h;
            this.p = recyclerView.getWidth();
            this.q = recyclerView.getHeight();
        }
        this.n = 1073741824;
        this.o = 1073741824;
    }

    public final int G() {
        ru ruVar = this.c;
        if (ruVar != null) {
            return ruVar.e();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G0(android.view.View view, int i, int i2, n91 n91Var) {
        return (!view.isLayoutRequested() && this.j && V(view.getWidth(), i, ((android.view.ViewGroup.MarginLayoutParams) n91Var).width) && V(view.getHeight(), i2, ((android.view.ViewGroup.MarginLayoutParams) n91Var).height)) ? false : true;
    }

    public boolean H0() {
        return false;
    }

    public int I(t91 t91Var, z91 z91Var) {
        return -1;
    }

    public final boolean I0(android.view.View view, int i, int i2, n91 n91Var) {
        return (this.j && V(view.getMeasuredWidth(), i, ((android.view.ViewGroup.MarginLayoutParams) n91Var).width) && V(view.getMeasuredHeight(), i2, ((android.view.ViewGroup.MarginLayoutParams) n91Var).height)) ? false : true;
    }

    public abstract void J0(androidx.recyclerview.widget.RecyclerView recyclerView, int i);

    public void K(android.view.View view, android.graphics.Rect rect) {
        boolean z = androidx.recyclerview.widget.RecyclerView.D0;
        n91 n91Var = (n91) view.getLayoutParams();
        android.graphics.Rect rect2 = n91Var.d;
        rect.set((view.getLeft() - rect2.left) - ((android.view.ViewGroup.MarginLayoutParams) n91Var).leftMargin, (view.getTop() - rect2.top) - ((android.view.ViewGroup.MarginLayoutParams) n91Var).topMargin, view.getRight() + rect2.right + ((android.view.ViewGroup.MarginLayoutParams) n91Var).rightMargin, view.getBottom() + rect2.bottom + ((android.view.ViewGroup.MarginLayoutParams) n91Var).bottomMargin);
    }

    public final void K0(xv0 xv0Var) {
        xv0 xv0Var2 = this.g;
        if (xv0Var2 != null && xv0Var != xv0Var2 && xv0Var2.e) {
            xv0Var2.h();
        }
        this.g = xv0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        ca1 ca1Var = recyclerView.g0;
        ca1Var.i.removeCallbacks(ca1Var);
        ca1Var.e.abortAnimation();
        if (xv0Var.h) {
            android.util.Log.w("RecyclerView", "An instance of " + xv0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + xv0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        xv0Var.b = recyclerView;
        xv0Var.c = this;
        int i = xv0Var.f695a;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("Invalid target position");
        }
        recyclerView.j0.f730a = i;
        xv0Var.e = true;
        xv0Var.d = true;
        xv0Var.f = recyclerView.p.B(i);
        xv0Var.b.g0.b();
        xv0Var.h = true;
    }

    public boolean L0() {
        return false;
    }

    public final int O() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        e91 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.c();
        }
        return 0;
    }

    public final int P() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        java.util.WeakHashMap weakHashMap = jq1.f264a;
        return sp1.d(recyclerView);
    }

    public int S(t91 t91Var, z91 z91Var) {
        return -1;
    }

    public final void T(android.view.View view, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        android.graphics.Rect rect2 = ((n91) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.d != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.d.n;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean U() {
        return false;
    }

    public void X(int i) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            int e = recyclerView.h.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void Y(int i) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            int e = recyclerView.h.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Z() {
    }

    public void a0(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public void b0(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public android.view.View c0(android.view.View view, int i, t91 t91Var, z91 z91Var) {
        return null;
    }

    public void d0(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        t91 t91Var = recyclerView.e;
        z91 z91Var = recyclerView.j0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.d.canScrollVertically(-1) && !this.d.canScrollHorizontally(-1) && !this.d.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        e91 e91Var = this.d.o;
        if (e91Var != null) {
            accessibilityEvent.setItemCount(e91Var.c());
        }
    }

    public void e0(t91 t91Var, z91 z91Var, g0 g0Var) {
        if (this.d.canScrollVertically(-1) || this.d.canScrollHorizontally(-1)) {
            g0Var.a(8192);
            g0Var.h(true);
        }
        if (this.d.canScrollVertically(1) || this.d.canScrollHorizontally(1)) {
            g0Var.a(4096);
            g0Var.h(true);
        }
        g0Var.f165a.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(S(t91Var, z91Var), I(t91Var, z91Var), false, 0));
    }

    public void f0(t91 t91Var, z91 z91Var, android.view.View view, g0 g0Var) {
    }

    public final void g0(android.view.View view, g0 g0Var) {
        da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
        if (N == null || N.l() || this.c.c.contains(N.f91a)) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        f0(recyclerView.e, recyclerView.j0, view, g0Var);
    }

    public final int getPaddingBottom() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            return 0;
        }
        java.util.WeakHashMap weakHashMap = jq1.f264a;
        return sp1.e(recyclerView);
    }

    public final int getPaddingLeft() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            return 0;
        }
        java.util.WeakHashMap weakHashMap = jq1.f264a;
        return sp1.f(recyclerView);
    }

    public final int getPaddingTop() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public void h0(int i, int i2) {
    }

    public void i0() {
    }

    public void j0(int i, int i2) {
    }

    public void k0(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.View r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.l(android.view.View, int, boolean):void");
    }

    public void l0(int i) {
    }

    public void m(java.lang.String str) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void m0(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        l0(i);
    }

    public final void n(android.view.View view, android.graphics.Rect rect) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
    }

    public abstract void n0(t91 t91Var, z91 z91Var);

    public abstract boolean o();

    public abstract void o0(z91 z91Var);

    public boolean p() {
        return false;
    }

    public void p0(android.os.Parcelable parcelable) {
    }

    public boolean q(n91 n91Var) {
        return n91Var != null;
    }

    public android.os.Parcelable q0() {
        return null;
    }

    public void r0(int i) {
    }

    public void s(int i, int i2, z91 z91Var, cq0 cq0Var) {
    }

    public final void s0() {
        for (int G = G() - 1; G >= 0; G--) {
            this.c.k(G);
        }
    }

    public void t(int i, cq0 cq0Var) {
    }

    public final void t0(t91 t91Var) {
        for (int G = G() - 1; G >= 0; G--) {
            if (!androidx.recyclerview.widget.RecyclerView.N(F(G)).s()) {
                android.view.View F = F(G);
                if (F(G) != null) {
                    this.c.k(G);
                }
                t91Var.h(F);
            }
        }
    }

    public abstract int u(z91 z91Var);

    public final void u0(t91 t91Var) {
        java.util.ArrayList arrayList;
        int size = t91Var.f553a.size();
        int i = size - 1;
        while (true) {
            arrayList = t91Var.f553a;
            if (i < 0) {
                break;
            }
            android.view.View view = ((da1) arrayList.get(i)).f91a;
            da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
            if (!N.s()) {
                N.r(false);
                if (N.n()) {
                    this.d.removeDetachedView(view, false);
                }
                j91 j91Var = this.d.O;
                if (j91Var != null) {
                    j91Var.d(N);
                }
                N.r(true);
                da1 N2 = androidx.recyclerview.widget.RecyclerView.N(view);
                N2.n = null;
                N2.o = false;
                N2.j &= -33;
                t91Var.i(N2);
            }
            i--;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = t91Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.d.invalidate();
        }
    }

    public abstract int v(z91 z91Var);

    public final void v0(android.view.View view, t91 t91Var) {
        ru ruVar = this.c;
        d91 d91Var = ruVar.f506a;
        int i = ruVar.d;
        if (i == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            ruVar.d = 1;
            ruVar.e = view;
            int indexOfChild = d91Var.f90a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (ruVar.b.f(indexOfChild)) {
                    ruVar.l(view);
                }
                d91Var.h(indexOfChild);
            }
            ruVar.d = 0;
            ruVar.e = null;
            t91Var.h(view);
        } catch (java.lang.Throwable th) {
            ruVar.d = 0;
            ruVar.e = null;
            throw th;
        }
    }

    public abstract int w(z91 z91Var);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if ((r5.bottom - r1) > r13) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean w0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.p
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.q
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.P()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto La6
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto Lab
        L74:
            int r11 = r8.getPaddingLeft()
            int r13 = r8.getPaddingTop()
            int r3 = r8.p
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.q
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.d
            android.graphics.Rect r5 = r5.l
            r8.K(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto Lab
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto Lab
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto Lab
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto Lab
        La6:
            if (r2 != 0) goto Lac
            if (r1 == 0) goto Lab
            goto Lac
        Lab:
            return r0
        Lac:
            if (r12 == 0) goto Lb2
            r9.scrollBy(r2, r1)
            goto Lb5
        Lb2:
            r9.k0(r2, r1, r0)
        Lb5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.w0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public int x(z91 z91Var) {
        return 0;
    }

    public final void x0() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public int y(z91 z91Var) {
        return 0;
    }

    public abstract int y0(int i, t91 t91Var, z91 z91Var);

    public int z(z91 z91Var) {
        return 0;
    }

    public abstract void z0(int i);
}
