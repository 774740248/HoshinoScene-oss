package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class yw0 implements android.view.View.OnTouchListener {
    public final /* synthetic */ a.qo0 c;
    public final /* synthetic */ android.widget.ListView d;
    public final /* synthetic */ int e;
    public final /* synthetic */ a.ha1 f;
    public final /* synthetic */ int g = 2131363080;
    public final /* synthetic */ a.ha1 h;
    public final /* synthetic */ a.ka1 i;
    public final /* synthetic */ a.fp0 j;

    public /* synthetic */ yw0(a.qo0 qo0Var, android.widget.ListView listView, int i, a.ha1 ha1Var, a.ha1 ha1Var2, a.ka1 ka1Var, a.fp0 fp0Var) {
        this.c = qo0Var;
        this.d = listView;
        this.e = i;
        this.f = ha1Var;
        this.h = ha1Var2;
        this.i = ka1Var;
        this.j = fp0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i = this.e;
        int i2 = this.g;
        a.qo0 qo0Var = this.c;
        a.wv.w(qo0Var, "$enabled");
        android.widget.ListView listView = this.d;
        a.wv.w(listView, "$listView");
        a.ha1 ha1Var = this.f;
        a.wv.w(ha1Var, "$dragging");
        a.ha1 ha1Var2 = this.h;
        a.wv.w(ha1Var2, "$dragTargetState");
        a.ka1 ka1Var = this.i;
        a.wv.w(ka1Var, "$lastAdapterPosition");
        a.fp0 fp0Var = this.j;
        a.wv.w(fp0Var, "$onChecked");
        if (!((java.lang.Boolean) qo0Var.b()).booleanValue()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    if (!ha1Var.c) {
                        return false;
                    }
                    int pointToPosition = listView.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        a.wv.h(i, ka1Var, listView, i2, ha1Var2, fp0Var, pointToPosition);
                    }
                }
            }
            if (!ha1Var.c) {
                return false;
            }
            ha1Var.c = false;
            ka1Var.c = -1;
        } else {
            int pointToPosition2 = listView.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition2 == -1 || pointToPosition2 < i) {
                ha1Var.c = false;
                return false;
            }
            int firstVisiblePosition = pointToPosition2 - listView.getFirstVisiblePosition();
            if (firstVisiblePosition < 0 || firstVisiblePosition >= listView.getChildCount()) {
                ha1Var.c = false;
                return false;
            }
            android.view.View childAt = listView.getChildAt(firstVisiblePosition);
            android.widget.CheckBox checkBox = childAt != null ? (android.widget.CheckBox) childAt.findViewById(i2) : null;
            if (checkBox == null || checkBox.getVisibility() != 0) {
                ha1Var.c = false;
                return false;
            }
            float left = checkBox.getLeft() + childAt.getLeft();
            float right = checkBox.getRight() + childAt.getLeft();
            float x = motionEvent.getX();
            if (left > x || x > right) {
                ha1Var.c = false;
                return false;
            }
            ha1Var.c = true;
            ha1Var2.c = !checkBox.isChecked();
            ka1Var.c = -1;
            a.wv.h(i, ka1Var, listView, i2, ha1Var2, fp0Var, pointToPosition2);
            android.view.ViewParent parent = listView.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }
}
