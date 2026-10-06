package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ct0 extends a.k91 {
    public android.graphics.Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final a.at0 m;
    public int o;
    public androidx.recyclerview.widget.RecyclerView q;
    public android.view.VelocityTracker s;
    public java.util.ArrayList t;
    public java.util.ArrayList u;
    public a.vu0 x;
    public a.bt0 y;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f82a = new java.util.ArrayList();
    public final float[] b = new float[2];
    public a.da1 c = null;
    public int l = -1;
    public int n = 0;
    public final java.util.ArrayList p = new java.util.ArrayList();
    public final a.jd0 r = new a.jd0(1, this);
    public android.view.View v = null;
    public int w = -1;
    public final a.ys0 z = new a.ys0(this);

    public ct0(a.th1 th1Var) {
        this.m = th1Var;
    }

    public static boolean n(android.view.View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // a.k91
    public final void d(android.graphics.Rect rect, android.view.View view) {
        rect.setEmpty();
    }

    @Override // a.k91
    public final void e(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView) {
        float f;
        float f2;
        this.w = -1;
        if (this.c != null) {
            float[] fArr = this.b;
            m(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        a.da1 da1Var = this.c;
        java.util.ArrayList arrayList = this.p;
        this.m.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.zs0 zs0Var = (a.zs0) arrayList.get(i);
            float f3 = zs0Var.f745a;
            float f4 = zs0Var.c;
            a.da1 da1Var2 = zs0Var.e;
            if (f3 == f4) {
                zs0Var.i = da1Var2.f91a.getTranslationX();
            } else {
                zs0Var.i = ((f4 - f3) * zs0Var.m) + f3;
            }
            float f5 = zs0Var.b;
            float f6 = zs0Var.d;
            if (f5 == f6) {
                zs0Var.j = da1Var2.f91a.getTranslationY();
            } else {
                zs0Var.j = ((f6 - f5) * zs0Var.m) + f5;
            }
            int save = canvas.save();
            a.at0.f(recyclerView, da1Var2, zs0Var.i, zs0Var.j, false);
            canvas.restoreToCount(save);
        }
        if (da1Var != null) {
            int save2 = canvas.save();
            a.at0.f(recyclerView, da1Var, f, f2, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // a.k91
    public final void f(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, a.z91 z91Var) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            m(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        a.da1 da1Var = this.c;
        java.util.ArrayList arrayList = this.p;
        this.m.getClass();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a.zs0 zs0Var = (a.zs0) arrayList.get(i);
            int save = canvas.save();
            android.view.View view = zs0Var.e.f91a;
            canvas.restoreToCount(save);
        }
        if (da1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            a.zs0 zs0Var2 = (a.zs0) arrayList.get(i2);
            boolean z2 = zs0Var2.l;
            if (z2 && !zs0Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void g(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a.ys0 ys0Var = this.z;
        if (recyclerView2 != null) {
            recyclerView2.d0(this);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.q;
            recyclerView3.s.remove(ys0Var);
            if (recyclerView3.t == ys0Var) {
                recyclerView3.t = null;
            }
            java.util.ArrayList arrayList = this.q.E;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            java.util.ArrayList arrayList2 = this.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                a.zs0 zs0Var = (a.zs0) arrayList2.get(0);
                zs0Var.g.cancel();
                this.m.a(this.q, zs0Var.e);
            }
            arrayList2.clear();
            this.v = null;
            this.w = -1;
            android.view.VelocityTracker velocityTracker = this.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            a.bt0 bt0Var = this.y;
            if (bt0Var != null) {
                bt0Var.f52a = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.q = recyclerView;
        if (recyclerView != null) {
            android.content.res.Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(2131165348);
            this.g = resources.getDimension(2131165347);
            android.view.ViewConfiguration.get(this.q.getContext()).getScaledTouchSlop();
            this.q.i(this);
            this.q.s.add(ys0Var);
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.q;
            if (recyclerView4.E == null) {
                recyclerView4.E = new java.util.ArrayList();
            }
            recyclerView4.E.add(this);
            this.y = new a.bt0(this);
            this.x = new a.vu0(this.q.getContext(), this.y);
        }
    }

    public final int h(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        android.view.VelocityTracker velocityTracker = this.s;
        a.at0 at0Var = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            at0Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.s.getXVelocity(this.l);
            float yVelocity = this.s.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = java.lang.Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f && abs > java.lang.Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.q.getWidth();
        at0Var.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || java.lang.Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void i(int i, int i2, android.view.MotionEvent motionEvent) {
        a.sh1 sh1Var;
        if (this.c != null || i != 2 || this.n == 2 || (sh1Var = ((a.th1) this.m).e) == null) {
            return;
        }
        sh1Var.b();
    }

    public final int j(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        android.view.VelocityTracker velocityTracker = this.s;
        a.at0 at0Var = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            at0Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.s.getXVelocity(this.l);
            float yVelocity = this.s.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = java.lang.Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f && abs > java.lang.Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.q.getHeight();
        at0Var.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || java.lang.Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void k(a.da1 da1Var, boolean z) {
        java.util.ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.zs0 zs0Var = (a.zs0) arrayList.get(size);
            if (zs0Var.e == da1Var) {
                zs0Var.k |= z;
                if (!zs0Var.l) {
                    zs0Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final android.view.View l(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        a.da1 da1Var = this.c;
        if (da1Var != null) {
            float f = this.j + this.h;
            float f2 = this.k + this.i;
            android.view.View view = da1Var.f91a;
            if (n(view, x, y, f, f2)) {
                return view;
            }
        }
        java.util.ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a.zs0 zs0Var = (a.zs0) arrayList.get(size);
            android.view.View view2 = zs0Var.e.f91a;
            if (n(view2, x, y, zs0Var.i, zs0Var.j)) {
                return view2;
            }
        }
        return this.q.E(x, y);
    }

    public final void m(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.f91a.getLeft();
        } else {
            fArr[0] = this.c.f91a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.f91a.getTop();
        } else {
            fArr[1] = this.c.f91a.getTranslationY();
        }
    }

    public final void o(a.da1 da1Var) {
        int i;
        int i2;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int abs4;
        androidx.recyclerview.widget.a aVar;
        int i3;
        int i4;
        int i5;
        char c;
        if (!this.q.isLayoutRequested() && this.n == 2) {
            a.at0 at0Var = this.m;
            at0Var.getClass();
            int i6 = (int) (this.j + this.h);
            int i7 = (int) (this.k + this.i);
            float abs5 = java.lang.Math.abs(i7 - da1Var.f91a.getTop());
            android.view.View view = da1Var.f91a;
            if (abs5 >= view.getHeight() * 0.5f || java.lang.Math.abs(i6 - view.getLeft()) >= view.getWidth() * 0.5f) {
                java.util.ArrayList arrayList = this.t;
                if (arrayList == null) {
                    this.t = new java.util.ArrayList();
                    this.u = new java.util.ArrayList();
                } else {
                    arrayList.clear();
                    this.u.clear();
                }
                int round = java.lang.Math.round(this.j + this.h);
                int round2 = java.lang.Math.round(this.k + this.i);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i8 = (round + width) / 2;
                int i9 = (round2 + height) / 2;
                androidx.recyclerview.widget.a layoutManager = this.q.getLayoutManager();
                int G = layoutManager.G();
                int i10 = 0;
                while (i10 < G) {
                    android.view.View F = layoutManager.F(i10);
                    if (F == view) {
                        i3 = round;
                        i4 = round2;
                        i5 = width;
                        aVar = layoutManager;
                    } else {
                        aVar = layoutManager;
                        if (F.getBottom() < round2 || F.getTop() > height || F.getRight() < round || F.getLeft() > width) {
                            i3 = round;
                            i4 = round2;
                            i5 = width;
                        } else {
                            a.da1 M = this.q.M(F);
                            c = 2;
                            int abs6 = java.lang.Math.abs(i8 - ((F.getRight() + F.getLeft()) / 2));
                            int abs7 = java.lang.Math.abs(i9 - ((F.getBottom() + F.getTop()) / 2));
                            int i11 = (abs7 * abs7) + (abs6 * abs6);
                            i3 = round;
                            int size = this.t.size();
                            i4 = round2;
                            i5 = width;
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < size) {
                                int i14 = size;
                                if (i11 <= ((java.lang.Integer) this.u.get(i12)).intValue()) {
                                    break;
                                }
                                i13++;
                                i12++;
                                size = i14;
                            }
                            this.t.add(i13, M);
                            this.u.add(i13, java.lang.Integer.valueOf(i11));
                            i10++;
                            layoutManager = aVar;
                            round = i3;
                            round2 = i4;
                            width = i5;
                        }
                    }
                    c = 2;
                    i10++;
                    layoutManager = aVar;
                    round = i3;
                    round2 = i4;
                    width = i5;
                }
                java.util.ArrayList arrayList2 = this.t;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i6;
                int height2 = view.getHeight() + i7;
                int left2 = i6 - view.getLeft();
                int top2 = i7 - view.getTop();
                int size2 = arrayList2.size();
                a.da1 da1Var2 = null;
                int i15 = -1;
                int i16 = 0;
                while (i16 < size2) {
                    a.da1 da1Var3 = (a.da1) arrayList2.get(i16);
                    java.util.ArrayList arrayList3 = arrayList2;
                    if (left2 > 0) {
                        int right = da1Var3.f91a.getRight() - width2;
                        i = width2;
                        if (right < 0) {
                            i2 = size2;
                            if (da1Var3.f91a.getRight() > view.getRight() && (abs4 = java.lang.Math.abs(right)) > i15) {
                                i15 = abs4;
                                da1Var2 = da1Var3;
                            }
                            if (left2 < 0 && (left = da1Var3.f91a.getLeft() - i6) > 0 && da1Var3.f91a.getLeft() < view.getLeft() && (abs3 = java.lang.Math.abs(left)) > i15) {
                                i15 = abs3;
                                da1Var2 = da1Var3;
                            }
                            if (top2 < 0 && (top = da1Var3.f91a.getTop() - i7) > 0 && da1Var3.f91a.getTop() < view.getTop() && (abs2 = java.lang.Math.abs(top)) > i15) {
                                i15 = abs2;
                                da1Var2 = da1Var3;
                            }
                            if (top2 > 0 && (bottom = da1Var3.f91a.getBottom() - height2) < 0 && da1Var3.f91a.getBottom() > view.getBottom() && (abs = java.lang.Math.abs(bottom)) > i15) {
                                i15 = abs;
                                da1Var2 = da1Var3;
                            }
                            i16++;
                            arrayList2 = arrayList3;
                            width2 = i;
                            size2 = i2;
                        }
                    } else {
                        i = width2;
                    }
                    i2 = size2;
                    if (left2 < 0) {
                        i15 = abs3;
                        da1Var2 = da1Var3;
                    }
                    if (top2 < 0) {
                        i15 = abs2;
                        da1Var2 = da1Var3;
                    }
                    if (top2 > 0) {
                        i15 = abs;
                        da1Var2 = da1Var3;
                    }
                    i16++;
                    arrayList2 = arrayList3;
                    width2 = i;
                    size2 = i2;
                }
                if (da1Var2 == null) {
                    this.t.clear();
                    this.u.clear();
                    return;
                }
                int c2 = da1Var2.c();
                da1Var.c();
                a.th1 th1Var = (a.th1) at0Var;
                a.wv.w(this.q, "recyclerView");
                if (da1Var.f != da1Var2.f) {
                    return;
                }
                th1Var.d.b(da1Var.d(), da1Var2.d());
                androidx.recyclerview.widget.RecyclerView recyclerView = this.q;
                androidx.recyclerview.widget.a layoutManager2 = recyclerView.getLayoutManager();
                boolean z = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager;
                android.view.View view2 = da1Var2.f91a;
                if (!z) {
                    if (layoutManager2.o()) {
                        if (androidx.recyclerview.widget.a.L(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.i0(c2);
                        }
                        if (androidx.recyclerview.widget.a.M(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.i0(c2);
                        }
                    }
                    if (layoutManager2.p()) {
                        if (androidx.recyclerview.widget.a.N(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.i0(c2);
                        }
                        if (androidx.recyclerview.widget.a.J(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.i0(c2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2;
                linearLayoutManager.m("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.S0();
                linearLayoutManager.k1();
                int Q = androidx.recyclerview.widget.a.Q(view);
                int Q2 = androidx.recyclerview.widget.a.Q(view2);
                char c3 = Q < Q2 ? (char) 1 : (char) 65535;
                if (linearLayoutManager.w) {
                    if (c3 == 1) {
                        linearLayoutManager.m1(Q2, linearLayoutManager.t.h() - (linearLayoutManager.t.e(view) + linearLayoutManager.t.f(view2)));
                        return;
                    } else {
                        linearLayoutManager.m1(Q2, linearLayoutManager.t.h() - linearLayoutManager.t.d(view2));
                        return;
                    }
                }
                if (c3 == 65535) {
                    linearLayoutManager.m1(Q2, linearLayoutManager.t.f(view2));
                } else {
                    linearLayoutManager.m1(Q2, linearLayoutManager.t.d(view2) - linearLayoutManager.t.e(view));
                }
            }
        }
    }

    public final void p(android.view.View view) {
        if (view == this.v) {
            this.v = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0098, code lost:
    
        if (r1 > 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(a.da1 r23, int r24) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ct0.q(a.da1, int):void");
    }

    public final void r(int i, int i2, android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = java.lang.Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.h = java.lang.Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = java.lang.Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = java.lang.Math.min(0.0f, this.i);
        }
    }
}
