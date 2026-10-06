package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kg1 extends android.view.TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f289a;
    public final android.graphics.Rect b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final int e;
    public boolean f;

    public kg1(android.graphics.Rect rect, android.graphics.Rect rect2, androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = android.view.ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.b = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.d = rect4;
        android.graphics.Rect rect5 = new android.graphics.Rect();
        this.c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f289a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f;
                if (z2 && !this.d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f;
                    this.f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else {
            if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            }
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        android.graphics.Rect rect = this.c;
        android.view.View view = this.f289a;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
