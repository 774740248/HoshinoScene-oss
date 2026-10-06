package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pq1 {
    public static final a.nq1 x = new a.nq1(0);

    /* renamed from: a, reason: collision with root package name */
    public int f448a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public android.view.VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final android.widget.OverScroller r;
    public final a.oq1 s;
    public android.view.View t;
    public boolean u;
    public final android.view.ViewGroup v;
    public int c = -1;
    public final a.hw w = new a.hw(6, this);

    public pq1(android.content.Context context, android.view.ViewGroup viewGroup, a.oq1 oq1Var) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (oq1Var == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.v = viewGroup;
        this.s = oq1Var;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new android.widget.OverScroller(context, x);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.e, 0.0f);
            java.util.Arrays.fill(this.f, 0.0f);
            java.util.Arrays.fill(this.g, 0.0f);
            java.util.Arrays.fill(this.h, 0);
            java.util.Arrays.fill(this.i, 0);
            java.util.Arrays.fill(this.j, 0);
            this.k = 0;
        }
        android.view.VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(android.view.View view, int i) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.t = view;
        this.c = i;
        this.s.j(view, i);
        p(1);
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = java.lang.Math.abs(f);
        float abs2 = java.lang.Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.s.getClass();
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.b);
    }

    public final boolean d(android.view.View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        a.oq1 oq1Var = this.s;
        boolean z = oq1Var.f(view) > 0;
        boolean z2 = oq1Var.g() > 0;
        if (!z || !z2) {
            return z ? java.lang.Math.abs(f) > ((float) this.b) : z2 && java.lang.Math.abs(f2) > ((float) this.b);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.b;
        return f3 > ((float) (i * i));
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.v.getWidth() / 2;
        float sin = (((float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i) / this.v) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = java.lang.Math.abs(i2);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r9 = this;
            int r0 = r9.f448a
            r1 = 2
            if (r0 != r1) goto L5b
            android.widget.OverScroller r0 = r9.r
            boolean r2 = r0.computeScrollOffset()
            int r3 = r0.getCurrX()
            int r4 = r0.getCurrY()
            android.view.View r5 = r9.t
            int r5 = r5.getLeft()
            int r5 = r3 - r5
            android.view.View r6 = r9.t
            int r6 = r6.getTop()
            int r6 = r4 - r6
            if (r5 == 0) goto L2c
            android.view.View r7 = r9.t
            java.util.WeakHashMap r8 = a.jq1.f264a
            r7.offsetLeftAndRight(r5)
        L2c:
            if (r6 == 0) goto L35
            android.view.View r7 = r9.t
            java.util.WeakHashMap r8 = a.jq1.f264a
            r7.offsetTopAndBottom(r6)
        L35:
            if (r5 != 0) goto L39
            if (r6 == 0) goto L40
        L39:
            a.oq1 r5 = r9.s
            android.view.View r6 = r9.t
            r5.l(r6, r3, r4)
        L40:
            if (r2 == 0) goto L52
            int r5 = r0.getFinalX()
            if (r3 != r5) goto L52
            int r3 = r0.getFinalY()
            if (r4 != r3) goto L52
            r0.abortAnimation()
            goto L54
        L52:
            if (r2 != 0) goto L5b
        L54:
            a.hw r0 = r9.w
            android.view.ViewGroup r2 = r9.v
            r2.post(r0)
        L5b:
            int r0 = r9.f448a
            if (r0 != r1) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pq1.g():boolean");
    }

    public final android.view.View h(int i, int i2) {
        android.view.ViewGroup viewGroup = this.v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.s.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.t
            int r2 = r0.getLeft()
            android.view.View r0 = r10.t
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.r
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.p(r11)
            return r11
        L1e:
            android.view.View r12 = r10.t
            float r0 = r10.n
            int r0 = (int) r0
            float r6 = r10.m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            float r0 = r10.n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L40
        L3e:
            r14 = r11
            goto L48
        L40:
            if (r7 <= r6) goto L48
            if (r14 <= 0) goto L46
            r14 = r6
            goto L48
        L46:
            int r11 = -r6
            goto L3e
        L48:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L62
            float r11 = (float) r6
            float r6 = (float) r8
        L60:
            float r11 = r11 / r6
            goto L65
        L62:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L60
        L65:
            if (r14 == 0) goto L6b
            float r0 = (float) r7
            float r6 = (float) r8
        L69:
            float r0 = r0 / r6
            goto L6e
        L6b:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L69
        L6e:
            a.oq1 r6 = r10.s
            int r12 = r6.f(r12)
            int r12 = r10.f(r4, r13, r12)
            int r13 = r6.g()
            int r13 = r10.f(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.p(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pq1.i(int, int, int, int):boolean");
    }

    public final boolean j(int i) {
        if ((this.k & (1 << i)) != 0) {
            return true;
        }
        android.util.Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r9.c == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pq1.k(android.view.MotionEvent):void");
    }

    public final void l() {
        android.view.VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float abs = java.lang.Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f4 = this.n;
        float abs2 = java.lang.Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.u = true;
        this.s.m(this.t, xVelocity, f3);
        this.u = false;
        if (this.f448a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.oq1] */
    public final void m(float f, float f2, int i) {
        int flags = c(f, f2, i, 1) ? 1 : 0;
        if (c(f2, f, i, 4)) {
            flags |= 4;
        }
        if (c(f, f2, i, 2)) {
            flags |= 2;
        }
        if (c(f2, f, i, 8)) {
            flags |= 8;
        }
        if (flags != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | flags;
            this.s.h(flags, i);
        }
    }

    public final void n(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        android.view.ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    public final void o(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    public final void p(int i) {
        this.v.removeCallbacks(this.w);
        if (this.f448a != i) {
            this.f448a = i;
            this.s.k(i);
            if (this.f448a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean q(int i, int i2) {
        if (this.u) {
            return i(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new java.lang.IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pq1.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(android.view.View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean i3 = i(i, i2, 0, 0);
        if (!i3 && this.f448a == 0 && this.t != null) {
            this.t = null;
        }
        return i3;
    }

    public final boolean t(android.view.View view, int i) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null || !this.s.n(view, i)) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }
}
