package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uw0 implements android.view.View.OnTouchListener {
    public final /* synthetic */ a.vw0 c;

    public uw0(a.vw0 vw0Var) {
        this.c = vw0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        a.um umVar;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        a.vw0 vw0Var = this.c;
        if (action == 0 && (umVar = vw0Var.B) != null && umVar.isShowing() && x >= 0 && x < vw0Var.B.getWidth() && y >= 0 && y < vw0Var.B.getHeight()) {
            vw0Var.x.postDelayed(vw0Var.t, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        vw0Var.x.removeCallbacks(vw0Var.t);
        return false;
    }
}
