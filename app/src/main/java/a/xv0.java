package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class xv0 {

    /* renamed from: a, reason: collision with root package name */
    public int f695a = -1;
    public androidx.recyclerview.widget.RecyclerView b;
    public androidx.recyclerview.widget.a c;
    public boolean d;
    public boolean e;
    public android.view.View f;
    public final a.x91 g;
    public boolean h;
    public final android.view.animation.LinearInterpolator i;
    public final android.view.animation.DecelerateInterpolator j;
    public android.graphics.PointF k;
    public final android.util.DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, a.x91] */
    public xv0(android.content.Context context) {
        a.x91 obj = new a.x91();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.f684a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
        this.i = new android.view.animation.LinearInterpolator();
        this.j = new android.view.animation.DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new java.lang.IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(android.view.View view, int i) {
        androidx.recyclerview.widget.a aVar = this.c;
        if (aVar == null || !aVar.o()) {
            return 0;
        }
        a.n91 n91Var = (a.n91) view.getLayoutParams();
        return a(androidx.recyclerview.widget.a.L(view) - ((android.view.ViewGroup.MarginLayoutParams) n91Var).leftMargin, androidx.recyclerview.widget.a.M(view) + ((android.view.ViewGroup.MarginLayoutParams) n91Var).rightMargin, aVar.getPaddingLeft(), aVar.p - aVar.getPaddingRight(), i);
    }

    public float c(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int d(int i) {
        float abs = java.lang.Math.abs(i);
        if (!this.m) {
            this.n = c(this.l);
            this.m = true;
        }
        return (int) java.lang.Math.ceil(abs * this.n);
    }

    public android.graphics.PointF e(int i) {
        java.lang.Object obj = this.c;
        if (obj instanceof a.y91) {
            return ((a.y91) obj).f(i);
        }
        android.util.Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + a.y91.class.getCanonicalName());
        return null;
    }

    public final void f(int i, int i2) {
        float r10 = 0.0f;
        android.graphics.PointF e;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.b;
        if (this.f695a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (e = e(this.f695a)) != null) {
            float f = e.x;
            if (f != 0.0f || e.y != 0.0f) {
                recyclerView.h0((int) java.lang.Math.signum(f), (int) java.lang.Math.signum(e.y), null);
            }
        }
        this.d = false;
        android.view.View view = this.f;
        a.x91 x91Var = this.g;
        if (view != null) {
            this.b.getClass();
            a.da1 N = androidx.recyclerview.widget.RecyclerView.N(view);
            if ((N != null ? N.e() : -1) == this.f695a) {
                g(this.f, recyclerView.j0, x91Var);
                x91Var.a(recyclerView);
                h();
            } else {
                android.util.Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            a.z91 z91Var = recyclerView.j0;
            if (this.b.p.G() == 0) {
                h();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    android.graphics.PointF e2 = e(this.f695a);
                    if (e2 != null) {
                        if (e2.x != 0.0f || e2.y != 0.0f) {
                            float f2 = e2.y;
                            float sqrt = (float) java.lang.Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = e2.x / sqrt;
                            e2.x = f3;
                            float f4 = e2.y / sqrt;
                            e2.y = f4;
                            this.k = e2;
                            this.o = (int) (f3 * 10000.0f);
                            this.p = (int) (f4 * 10000.0f);
                            int d = d(10000);
                            android.view.animation.LinearInterpolator linearInterpolator = this.i;
                            x91Var.f684a = (int) (this.o * 1.2f);
                            x91Var.b = (int) (this.p * 1.2f);
                            x91Var.c = (int) (d * 1.2f);
                            x91Var.e = linearInterpolator;
                            x91Var.f = true;
                        }
                    }
                    x91Var.d = this.f695a;
                    h();
                }
            }
            boolean z = x91Var.d >= 0;
            x91Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.g0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.view.View r7, a.z91 r8, a.x91 r9) {
        /*
            r6 = this;
            android.graphics.PointF r8 = r6.k
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L15
            float r8 = r8.x
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto Lf
            goto L15
        Lf:
            if (r8 <= 0) goto L13
            r8 = r0
            goto L16
        L13:
            r8 = r1
            goto L16
        L15:
            r8 = r3
        L16:
            int r8 = r6.b(r7, r8)
            android.graphics.PointF r4 = r6.k
            if (r4 == 0) goto L29
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L29
        L25:
            if (r2 <= 0) goto L2a
            r1 = r0
            goto L2a
        L29:
            r1 = r3
        L2a:
            androidx.recyclerview.widget.a r2 = r6.c
            if (r2 == 0) goto L58
            boolean r4 = r2.p()
            if (r4 != 0) goto L35
            goto L58
        L35:
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            a.n91 r3 = (a.n91) r3
            int r4 = androidx.recyclerview.widget.a.N(r7)
            int r5 = r3.topMargin
            int r4 = r4 - r5
            int r7 = androidx.recyclerview.widget.a.J(r7)
            int r3 = r3.bottomMargin
            int r7 = r7 + r3
            int r3 = r2.getPaddingTop()
            int r5 = r2.q
            int r2 = r2.getPaddingBottom()
            int r5 = r5 - r2
            int r3 = a(r4, r7, r3, r5, r1)
        L58:
            int r7 = r8 * r8
            int r1 = r3 * r3
            int r1 = r1 + r7
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            int r7 = (int) r1
            int r7 = r6.d(r7)
            double r1 = (double) r7
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r7 = (int) r1
            if (r7 <= 0) goto L83
            int r8 = -r8
            int r1 = -r3
            android.view.animation.DecelerateInterpolator r2 = r6.j
            r9.f684a = r8
            r9.b = r1
            r9.c = r7
            r9.e = r2
            r9.f = r0
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xv0.g(android.view.View, a.z91, a.x91):void");
    }

    public final void h() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.j0.f730a = -1;
            this.f = null;
            this.f695a = -1;
            this.d = false;
            androidx.recyclerview.widget.a aVar = this.c;
            if (aVar.g == this) {
                aVar.g = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
