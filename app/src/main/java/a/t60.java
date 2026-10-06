package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class t60 implements android.view.View.OnTouchListener {
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ a.v60 d;

    public t60(a.v60 v60Var, android.view.View view) {
        this.c = view;
        this.d = v60Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        android.graphics.Rect rect = new android.graphics.Rect();
        this.c.getGlobalVisibleRect(rect);
        if (!rect.contains(x, y)) {
            a.v60 v60Var = this.d;
            if (v60Var.d) {
                v60Var.a();
            }
        }
        return true;
    }
}
