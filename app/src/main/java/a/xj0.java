package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xj0 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    public final float c;
    public final int d;
    public final int e;
    public final android.view.View f;
    public a.wj0 g;
    public a.wj0 h;
    public boolean i;
    public int j;
    public final int[] k = new int[2];

    public xj0(android.view.View view) {
        this.f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.c = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.d = tapTimeout;
        this.e = (android.view.ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        a.wj0 wj0Var = this.h;
        android.view.View view = this.f;
        if (wj0Var != null) {
            view.removeCallbacks(wj0Var);
        }
        a.wj0 wj0Var2 = this.g;
        if (wj0Var2 != null) {
            view.removeCallbacks(wj0Var2);
        }
    }

    public abstract a.nh1 b();

    public abstract boolean c();

    public boolean d() {
        a.nh1 b = b();
        if (b == null || !b.b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.i = false;
        this.j = -1;
        a.wj0 wj0Var = this.g;
        if (wj0Var != null) {
            this.f.removeCallbacks(wj0Var);
        }
    }
}
