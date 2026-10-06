package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ls0 implements android.view.View.OnTouchListener {
    public final android.app.Dialog c;
    public final int d;
    public final int e;
    public final int f;

    public ls0(android.app.Dialog dialog, android.graphics.Rect rect) {
        this.c = dialog;
        this.d = rect.left;
        this.e = rect.top;
        this.f = android.view.ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        float r4 = 0.0f;
        android.view.View findViewById = view.findViewById(android.R.id.content);
        int left = findViewById.getLeft() + this.d;
        int width = findViewById.getWidth() + left;
        if (new android.graphics.RectF(left, findViewById.getTop() + this.e, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.c.onTouchEvent(obtain);
    }
}
