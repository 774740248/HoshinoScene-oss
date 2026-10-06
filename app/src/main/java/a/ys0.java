package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ys0 implements a.p91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.ct0 f719a;

    public ys0(a.ct0 ct0Var) {
        this.f719a = ct0Var;
    }

    @Override // a.p91
    public final boolean a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        a.ct0 ct0Var = this.f719a;
        ct0Var.x.B(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        a.zs0 zs0Var = null;
        if (actionMasked == 0) {
            ct0Var.l = motionEvent.getPointerId(0);
            ct0Var.d = motionEvent.getX();
            ct0Var.e = motionEvent.getY();
            android.view.VelocityTracker velocityTracker = ct0Var.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            ct0Var.s = android.view.VelocityTracker.obtain();
            if (ct0Var.c == null) {
                java.util.ArrayList arrayList = ct0Var.p;
                if (!arrayList.isEmpty()) {
                    android.view.View l = ct0Var.l(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        a.zs0 zs0Var2 = (a.zs0) arrayList.get(size);
                        if (zs0Var2.e.f91a == l) {
                            zs0Var = zs0Var2;
                            break;
                        }
                        size--;
                    }
                }
                if (zs0Var != null) {
                    ct0Var.d -= zs0Var.i;
                    ct0Var.e -= zs0Var.j;
                    a.da1 da1Var = zs0Var.e;
                    ct0Var.k(da1Var, true);
                    if (ct0Var.f82a.remove(da1Var.f91a)) {
                        ct0Var.m.a(ct0Var.q, da1Var);
                    }
                    ct0Var.q(da1Var, zs0Var.f);
                    ct0Var.r(ct0Var.o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            ct0Var.l = -1;
            ct0Var.q(null, 0);
        } else {
            int i = ct0Var.l;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                ct0Var.i(actionMasked, findPointerIndex, motionEvent);
            }
        }
        android.view.VelocityTracker velocityTracker2 = ct0Var.s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return ct0Var.c != null;
    }

    @Override // a.p91
    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        a.ct0 ct0Var = this.f719a;
        ct0Var.x.B(motionEvent);
        android.view.VelocityTracker velocityTracker = ct0Var.s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (ct0Var.l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(ct0Var.l);
        if (findPointerIndex >= 0) {
            ct0Var.i(actionMasked, findPointerIndex, motionEvent);
        }
        a.da1 da1Var = ct0Var.c;
        if (da1Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    ct0Var.r(ct0Var.o, findPointerIndex, motionEvent);
                    ct0Var.o(da1Var);
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = ct0Var.q;
                    a.jd0 jd0Var = ct0Var.r;
                    recyclerView2.removeCallbacks(jd0Var);
                    jd0Var.run();
                    ct0Var.q.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == ct0Var.l) {
                    ct0Var.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    ct0Var.r(ct0Var.o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            android.view.VelocityTracker velocityTracker2 = ct0Var.s;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        ct0Var.q(null, 0);
        ct0Var.l = -1;
    }

    @Override // a.p91
    public final void c(boolean z) {
        if (z) {
            this.f719a.q(null, 0);
        }
    }
}
