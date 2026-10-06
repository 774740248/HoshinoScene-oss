package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wj0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.xj0 d;

    public /* synthetic */ wj0(a.xj0 xj0Var, int i) {
        this.c = i;
        this.d = xj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.xj0 xj0Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.view.ViewParent parent = xj0Var.f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                xj0Var.a();
                android.view.View view = xj0Var.f;
                if (view.isEnabled() && !view.isLongClickable() && xj0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    xj0Var.i = true;
                    return;
                }
                return;
        }
    }
}
