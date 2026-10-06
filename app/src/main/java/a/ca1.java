package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ca1 implements java.lang.Runnable {
    public int c;
    public int d;
    public android.widget.OverScroller e;
    public android.view.animation.Interpolator f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView i;

    public ca1(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.i = recyclerView;
        a.nq1 nq1Var = androidx.recyclerview.widget.RecyclerView.L0;
        this.f = nq1Var;
        this.g = false;
        this.h = false;
        this.e = new android.widget.OverScroller(recyclerView.getContext(), nq1Var);
    }

    public final void a(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.i;
        recyclerView.setScrollState(2);
        this.d = 0;
        this.c = 0;
        android.view.animation.Interpolator interpolator = this.f;
        a.nq1 nq1Var = androidx.recyclerview.widget.RecyclerView.L0;
        if (interpolator != nq1Var) {
            this.f = nq1Var;
            this.e = new android.widget.OverScroller(recyclerView.getContext(), nq1Var);
        }
        this.e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.g) {
            this.h = true;
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.i;
        recyclerView.removeCallbacks(this);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.rp1.m(recyclerView, this);
    }

    public final void c(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.i;
        if (i3 == Integer.MIN_VALUE) {
            int abs = java.lang.Math.abs(i);
            int abs2 = java.lang.Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = java.lang.Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = androidx.recyclerview.widget.RecyclerView.L0;
        }
        if (this.f != interpolator) {
            this.f = interpolator;
            this.e = new android.widget.OverScroller(recyclerView.getContext(), interpolator);
        }
        this.d = 0;
        this.c = 0;
        recyclerView.setScrollState(2);
        this.e.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.i;
        if (recyclerView.p == null) {
            recyclerView.removeCallbacks(this);
            this.e.abortAnimation();
            return;
        }
        this.h = false;
        this.g = true;
        recyclerView.p();
        android.widget.OverScroller overScroller = this.e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.c;
            int i6 = currY - this.d;
            this.c = currX;
            this.d = currY;
            int o = androidx.recyclerview.widget.RecyclerView.o(i5, recyclerView.K, recyclerView.M, recyclerView.getWidth());
            int o2 = androidx.recyclerview.widget.RecyclerView.o(i6, recyclerView.L, recyclerView.N, recyclerView.getHeight());
            int[] iArr = recyclerView.w0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v = recyclerView.v(o, o2, iArr, null, 1);
            int[] iArr2 = recyclerView.w0;
            if (v) {
                o -= iArr2[0];
                o2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o, o2);
            }
            if (recyclerView.o != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.h0(o, o2, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o - i7;
                int i10 = o2 - i8;
                a.xv0 xv0Var = recyclerView.p.g;
                if (xv0Var != null && !xv0Var.d && xv0Var.e) {
                    int b = recyclerView.j0.b();
                    if (b == 0) {
                        xv0Var.h();
                    } else if (xv0Var.f695a >= b) {
                        xv0Var.f695a = b - 1;
                        xv0Var.f(i7, i8);
                    } else {
                        xv0Var.f(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = o;
                i2 = o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.r.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.w(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.x(i4, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            a.xv0 xv0Var2 = recyclerView.p.g;
            if ((xv0Var2 == null || !xv0Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                        a.rp1.k(recyclerView);
                    }
                }
                if (androidx.recyclerview.widget.RecyclerView.J0) {
                    a.cq0 cq0Var = recyclerView.i0;
                    int[] iArr4 = cq0Var.c;
                    if (iArr4 != null) {
                        java.util.Arrays.fill(iArr4, -1);
                    }
                    cq0Var.d = 0;
                }
            } else {
                b();
                a.eq0 eq0Var = recyclerView.h0;
                if (eq0Var != null) {
                    eq0Var.a(recyclerView, i4, i11);
                }
            }
        }
        a.xv0 xv0Var3 = recyclerView.p.g;
        if (xv0Var3 != null && xv0Var3.d) {
            xv0Var3.f(0, 0);
        }
        this.g = false;
        if (!this.h) {
            recyclerView.setScrollState(0);
            recyclerView.o0(1);
        } else {
            recyclerView.removeCallbacks(this);
            java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
            a.rp1.m(recyclerView, this);
        }
    }
}
