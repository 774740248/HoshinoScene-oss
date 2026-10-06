package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qh0 implements android.view.View.OnTouchListener {
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public final android.graphics.Rect j = new android.graphics.Rect();
    public final /* synthetic */ a.uh0 k;
    public final /* synthetic */ android.view.WindowManager.LayoutParams l;
    public final /* synthetic */ android.content.SharedPreferences m;

    public qh0(a.uh0 uh0Var, android.view.WindowManager.LayoutParams layoutParams, android.content.SharedPreferences sharedPreferences) {
        this.k = uh0Var;
        this.l = layoutParams;
        this.m = sharedPreferences;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            android.graphics.Rect rect = this.j;
            if (action != 0) {
                android.view.WindowManager.LayoutParams layoutParams = this.l;
                if (action == 1) {
                    if (java.lang.System.currentTimeMillis() - this.h < 180) {
                        if (java.lang.Math.abs(motionEvent.getRawX() - this.f) >= 15.0f || java.lang.Math.abs(motionEvent.getRawY() - this.g) >= 15.0f) {
                            this.m.edit().putInt("temperature_x", layoutParams.x).putInt("temperature_y", layoutParams.y).apply();
                        } else {
                            try {
                                if (java.lang.System.currentTimeMillis() - this.i < 300) {
                                    this.k.getClass();
                                    a.uh0.b();
                                } else {
                                    this.i = java.lang.System.currentTimeMillis();
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        }
                    }
                    this.c = false;
                    if (java.lang.Math.abs(motionEvent.getRawX() - this.f) > 15.0f || java.lang.Math.abs(motionEvent.getRawY() - this.g) > 15.0f) {
                        return true;
                    }
                } else if (action != 2) {
                    if (action == 3 || action == 4) {
                        this.c = false;
                    }
                } else if (this.c) {
                    layoutParams.x = (int) ((motionEvent.getRawX() - this.d) - rect.left);
                    layoutParams.y = (int) ((motionEvent.getRawY() - this.e) - rect.top);
                    android.view.WindowManager windowManager = a.uh0.g;
                    a.wv.s(windowManager);
                    windowManager.updateViewLayout(view, layoutParams);
                }
            } else {
                if (view != null) {
                    view.getWindowVisibleDisplayFrame(rect);
                }
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f = motionEvent.getRawX();
                this.g = motionEvent.getRawY();
                this.c = true;
                this.h = java.lang.System.currentTimeMillis();
            }
        }
        return false;
    }
}
