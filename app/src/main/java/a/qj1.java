package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qj1 extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public int f468a;
    public int b = -1;
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior c;

    public qj1(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // a.oq1
    public final int d(android.view.View view, int i) {
        int width;
        int width2;
        int width3;
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        boolean z = a.sp1.d(view) == 1;
        int i2 = this.c.e;
        if (i2 == 0) {
            if (z) {
                width = this.f468a - view.getWidth();
                width2 = this.f468a;
            } else {
                width = this.f468a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f468a - view.getWidth();
            width2 = view.getWidth() + this.f468a;
        } else if (z) {
            width = this.f468a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f468a - view.getWidth();
            width2 = this.f468a;
        }
        return java.lang.Math.min(java.lang.Math.max(width, i), width2);
    }

    @Override // a.oq1
    public final int e(android.view.View view, int i) {
        return view.getTop();
    }

    @Override // a.oq1
    public final int f(android.view.View view) {
        return view.getWidth();
    }

    @Override // a.oq1
    public final void j(android.view.View view, int i) {
        this.b = i;
        this.f468a = view.getLeft();
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.sensitivitySet = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.sensitivitySet = false;
        }
    }

    @Override // a.oq1
    public final void k(int i) {
        a.rq rqVar = this.c.b;
        if (rqVar != null) {
            a.vq vqVar = rqVar.c;
            if (i == 0) {
                a.yh1.b().e(vqVar.t);
            } else if (i == 1 || i == 2) {
                a.yh1.b().d(vqVar.t);
            }
        }
    }

    @Override // a.oq1
    public final void l(android.view.View view, int i, int i2) {
        float width = view.getWidth();
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.alphaStartSwipeDistance;
        float width2 = view.getWidth() * swipeDismissBehavior.alphaEndSwipeDistance;
        float abs = java.lang.Math.abs(i - this.f468a);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(java.lang.Math.min(java.lang.Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f468a) >= java.lang.Math.round(r9.getWidth() * r3.dragDismissThreshold)) goto L27;
     */
    @Override // a.oq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.c
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = a.jq1.f264a
            int r5 = a.sp1.d(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.swipeDirection
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r2) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f468a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.dragDismissThreshold
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f468a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f468a
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f468a
            r2 = r4
        L69:
            a.pq1 r10 = r3.f758a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L80
            a.rj1 r10 = new a.rj1
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = a.jq1.f264a
            a.rp1.m(r9, r10)
            goto L89
        L80:
            if (r2 == 0) goto L89
            a.rq r10 = r3.listener
            if (r10 == 0) goto L89
            r10.a(r9)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qj1.m(android.view.View, float, float):void");
    }

    @Override // a.oq1
    public final boolean n(android.view.View view, int i) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.canSwipeDismissView(view);
    }
    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: qj1.a");
    }
}
