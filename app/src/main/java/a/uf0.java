package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uf0 implements android.view.View.OnTouchListener {
    public boolean d;
    public float e;
    public float f;
    public float g;
    public float h;
    public final /* synthetic */ java.lang.Object j;
    public final /* synthetic */ int c = 1;
    public final android.graphics.Rect i = new android.graphics.Rect();

    public uf0(android.view.WindowManager.LayoutParams layoutParams) {
        this.j = layoutParams;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i = this.c;
        java.lang.Object obj = this.j;
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
                    } else if (action != 1) {
                        if (action != 2) {
                            if (action == 3 || action == 4) {
                                this.d = false;
                            }
                        } else if (this.d) {
                            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) obj;
                            layoutParams.gravity = 8388659;
                            layoutParams.x = (int) ((motionEvent.getRawX() - this.e) - this.i.left);
                            layoutParams.y = (int) ((motionEvent.getRawY() - this.f) - this.i.top);
                            android.view.WindowManager windowManager = a.ag0.x;
                            if (windowManager != null) {
                                windowManager.updateViewLayout(view, layoutParams);
                            }
                        }
                    } else if (java.lang.Math.abs(motionEvent.getRawX() - this.g) > 15.0f || java.lang.Math.abs(motionEvent.getRawY() - this.h) > 15.0f) {
                        return true;
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
                        a.rg0 rg0Var = (a.rg0) obj;
                        rg0Var.b.edit().putInt("thread_x", rg0Var.q.x).putInt("thread_y", rg0Var.q.y).apply();
                    } else if (action2 != 2) {
                        if (action2 == 3 || action2 == 4) {
                            this.d = false;
                        }
                    } else if (this.d) {
                        a.rg0 rg0Var2 = (a.rg0) obj;
                        rg0Var2.q.x = (int) ((motionEvent.getRawX() - this.e) - this.i.left);
                        rg0Var2.q.y = (int) ((motionEvent.getRawY() - this.f) - this.i.top);
                        rg0Var2.r.updateViewLayout(view, rg0Var2.q);
                    }
                }
                return false;
        }
    }

    public uf0(a.rg0 rg0Var) {
        this.j = rg0Var;
    }
}
