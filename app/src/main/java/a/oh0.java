package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oh0 implements android.view.View.OnTouchListener {
    public boolean c;
    public float d;
    public float e;
    public final android.graphics.Rect f = new android.graphics.Rect();
    public final /* synthetic */ android.view.WindowManager.LayoutParams g;
    public final /* synthetic */ android.view.WindowManager h;
    public final /* synthetic */ a.ph0 i;
    public final /* synthetic */ android.content.SharedPreferences j;

    public oh0(android.view.WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, a.ph0 ph0Var, android.content.SharedPreferences sharedPreferences) {
        this.g = layoutParams;
        this.h = windowManager;
        this.i = ph0Var;
        this.j = sharedPreferences;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!a.ph0.k && motionEvent != null) {
            int action = motionEvent.getAction();
            android.graphics.Rect rect = this.f;
            if (action != 0) {
                android.view.WindowManager.LayoutParams layoutParams = this.g;
                if (action == 1) {
                    int i = layoutParams.x;
                    a.ph0 ph0Var = this.i;
                    if (i != ph0Var.e || layoutParams.y != ph0Var.f) {
                        this.j.edit().putInt("process_x", layoutParams.x).putInt("process_y", layoutParams.y).apply();
                        ph0Var.e = layoutParams.x;
                        ph0Var.f = layoutParams.y;
                    }
                } else if (action != 2) {
                    if (action == 3 || action == 4) {
                        this.c = false;
                    }
                } else if (this.c) {
                    a.ph0.m = java.lang.System.currentTimeMillis();
                    layoutParams.x = (int) ((motionEvent.getRawX() - this.d) - rect.left);
                    layoutParams.y = (int) ((motionEvent.getRawY() - this.e) - rect.top);
                    this.h.updateViewLayout(view, layoutParams);
                }
            } else {
                if (view != null) {
                    view.getWindowVisibleDisplayFrame(rect);
                }
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                motionEvent.getRawX();
                motionEvent.getRawY();
                this.c = true;
            }
        }
        return false;
    }
}
