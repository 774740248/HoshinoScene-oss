package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class lh0 implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
            return false;
        }
        a.ph0.m = java.lang.System.currentTimeMillis();
        return false;
    }
}
