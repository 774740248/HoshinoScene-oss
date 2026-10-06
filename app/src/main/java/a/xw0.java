package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xw0 implements android.view.View.OnTouchListener {
    public static final int t = android.view.ViewConfiguration.getTapTimeout();
    public final a.vp c;
    public final android.view.animation.AccelerateInterpolator d;
    public final android.view.View e;
    public a.hw f;
    public final float[] g;
    public final float[] h;
    public final int i;
    public final int j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final android.widget.ListView s;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.vp] */
    public xw0(android.widget.ListView listView) {
        a.vp obj = new a.vp();
        obj.e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f = 0L;
        this.c = obj;
        this.d = new android.view.animation.AccelerateInterpolator();
        this.g = new float[]{0.0f, 0.0f};
        this.h = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = new float[]{0.0f, 0.0f};
        this.l = new float[]{0.0f, 0.0f};
        this.m = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.e = listView;
        float f = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.m;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.l;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.i = 1;
        float[] fArr3 = this.h;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.g;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.k;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.j = t;
        obj.f638a = 500;
        obj.b = 500;
        this.s = listView;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.g
            r0 = r0[r7]
            float[] r1 = r3.h
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.d
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.k
            r0 = r0[r7]
            float[] r1 = r3.l
            r1 = r1[r7]
            float[] r2 = r3.m
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xw0.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.i;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (this.q && i == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.r
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.e()
            goto L7c
        L1a:
            r7.p = r2
            r7.n = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.e
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            a.vp r9 = r7.c
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.q
            if (r8 != 0) goto L7c
            boolean r8 = r7.f()
            if (r8 == 0) goto L7c
            a.hw r8 = r7.f
            if (r8 != 0) goto L60
            a.hw r8 = new a.hw
            r9 = 5
            r8.<init>(r9, r7)
            r7.f = r8
        L60:
            r7.q = r2
            r7.o = r2
            boolean r8 = r7.n
            if (r8 != 0) goto L75
            int r8 = r7.j
            if (r8 <= 0) goto L75
            a.hw r9 = r7.f
            long r5 = (long) r8
            java.util.WeakHashMap r8 = a.jq1.f264a
            a.rp1.n(r4, r9, r5)
            goto L7a
        L75:
            a.hw r8 = r7.f
            r8.run()
        L7a:
            r7.n = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xw0.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i = 0;
        if (this.o) {
            this.q = false;
            return;
        }
        a.vp vpVar = this.c;
        vpVar.getClass();
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - vpVar.e);
        int i3 = vpVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        vpVar.i = i;
        vpVar.h = vpVar.a(currentAnimationTimeMillis);
        vpVar.g = currentAnimationTimeMillis;
    }

    public final boolean f() {
        android.widget.ListView listView;
        int count;
        a.vp vpVar = this.c;
        float f = vpVar.d;
        int abs = (int) (f / java.lang.Math.abs(f));
        java.lang.Math.abs(vpVar.c);
        if (abs == 0 || (count = (listView = this.s).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
