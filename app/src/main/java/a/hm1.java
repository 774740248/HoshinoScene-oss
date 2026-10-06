package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hm1 implements android.view.View.OnTouchListener {
    public final /* synthetic */ android.view.GestureDetector c;

    public hm1(android.view.GestureDetector gestureDetector) {
        this.c = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (((android.widget.Checkable) view).isChecked()) {
            return this.c.onTouchEvent(motionEvent);
        }
        return false;
    }
}
