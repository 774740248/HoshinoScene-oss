package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bt0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52a = true;
    public final /* synthetic */ a.ct0 b;

    public bt0(a.ct0 ct0Var) {
        this.b = ct0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent motionEvent) {
        a.ct0 ct0Var;
        android.view.View l;
        a.da1 M;
        if (!this.f52a || (l = (ct0Var = this.b).l(motionEvent)) == null || (M = ct0Var.q.M(l)) == null) {
            return;
        }
        a.at0 at0Var = ct0Var.m;
        androidx.recyclerview.widget.RecyclerView recyclerView = ct0Var.q;
        at0Var.d(recyclerView, M);
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if ((a.at0.b(995391, a.sp1.d(recyclerView)) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = ct0Var.l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                ct0Var.d = x;
                ct0Var.e = y;
                ct0Var.i = 0.0f;
                ct0Var.h = 0.0f;
                a.th1 th1Var = (a.th1) ct0Var.m;
                a.sh1 sh1Var = th1Var.e;
                if (sh1Var != null ? sh1Var.a() : th1Var.f) {
                    ct0Var.q(M, 2);
                }
            }
        }
    }
}
