package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gf0 implements android.view.View.OnTouchListener {
    public final /* synthetic */ int c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final android.graphics.Rect i;
    public final /* synthetic */ android.view.WindowManager.LayoutParams j;
    public final /* synthetic */ android.content.SharedPreferences k;

    public gf0(android.view.WindowManager.LayoutParams layoutParams, android.content.SharedPreferences sharedPreferences, int i) {
        this.c = i;
        if (i != 1) {
            this.j = layoutParams;
            this.k = sharedPreferences;
            this.i = new android.graphics.Rect();
        } else {
            this.j = layoutParams;
            this.k = sharedPreferences;
            this.i = new android.graphics.Rect();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i = this.c;
        android.content.SharedPreferences sharedPreferences = this.k;
        android.view.WindowManager.LayoutParams layoutParams = this.j;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (motionEvent != null) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        if (view != null) {
                            view.getWindowVisibleDisplayFrame(this.i);
                        }
                        this.e = motionEvent.getX();
                        this.f = motionEvent.getY();
                        this.g = motionEvent.getRawX();
                        this.h = motionEvent.getRawY();
                        this.d = true;
                    } else if (action == 1) {
                        this.d = false;
                        if (java.lang.Math.abs(motionEvent.getRawX() - this.g) > 15.0f || java.lang.Math.abs(motionEvent.getRawY() - this.h) > 15.0f) {
                            sharedPreferences.edit().putInt("basic_x", layoutParams.x).putInt("basic_y", layoutParams.y).apply();
                            return true;
                        }
                    } else if (action != 2) {
                        if (action == 3 || action == 4) {
                            this.d = false;
                        }
                    } else if (this.d) {
                        layoutParams.x = (int) ((motionEvent.getRawX() - this.e) - this.i.left);
                        layoutParams.y = (int) ((motionEvent.getRawY() - this.f) - this.i.top);
                        android.view.WindowManager windowManager = a.kf0.C;
                        a.wv.s(windowManager);
                        windowManager.updateViewLayout(view, layoutParams);
                    }
                }
                return false;
            default:
                if (motionEvent != null) {
                    int action2 = motionEvent.getAction();
                    if (action2 == 0) {
                        if (view != null) {
                            view.getWindowVisibleDisplayFrame(this.i);
                        }
                        this.e = motionEvent.getX();
                        this.f = motionEvent.getY();
                        this.g = motionEvent.getRawX();
                        this.h = motionEvent.getRawY();
                        this.d = true;
                    } else if (action2 == 1) {
                        this.d = false;
                        if (java.lang.Math.abs(motionEvent.getRawX() - this.g) > 15.0f || java.lang.Math.abs(motionEvent.getRawY() - this.h) > 15.0f) {
                            sharedPreferences.edit().putInt("monitor2_x", layoutParams.x).putInt("monitor2_y", layoutParams.y).apply();
                            return true;
                        }
                    } else if (action2 != 2) {
                        if (action2 == 3 || action2 == 4) {
                            this.d = false;
                        }
                    } else if (this.d) {
                        layoutParams.x = (int) ((motionEvent.getRawX() - this.e) - this.i.left);
                        layoutParams.y = (int) ((motionEvent.getRawY() - this.f) - this.i.top);
                        android.view.WindowManager windowManager2 = a.jf0.c;
                        a.wv.s(windowManager2);
                        windowManager2.updateViewLayout(view, layoutParams);
                    }
                }
                return false;
        }
    }
}
