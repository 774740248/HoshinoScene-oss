package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class im extends androidx.appcompat.widget.ContentFrameLayout {
    public final /* synthetic */ a.km k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(a.km kmVar, a.dy dyVar) {
        super(dyVar, null);
        this.k = kmVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.k.x(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                a.km kmVar = this.k;
                kmVar.v(kmVar.C(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(a.b20.Y(getContext(), i));
    }
}
