package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class aa0 implements android.view.View.OnTouchListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ aa0(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.PopupWindow popupWindow;
        int i = this.c;
        boolean z = true;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.ca0 ca0Var = (a.ca0) obj;
                ca0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - ca0Var.o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        ca0Var.m = false;
                    }
                    ca0Var.u();
                    ca0Var.m = true;
                    ca0Var.o = java.lang.System.currentTimeMillis();
                }
                return false;
            case 1:
                com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) obj;
                int i2 = com.omarea.ui.SelectView.k;
                a.wv.w(selectView, "this$0");
                if (!selectView.isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() != 0 || (((popupWindow = selectView.g) == null || !popupWindow.isShowing()) && motionEvent.getEventTime() - selectView.j >= 200)) {
                    z = false;
                } else {
                    selectView.b();
                }
                return z;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.pl0 pl0Var = (a.pl0) obj;
                a.gu0[] gu0VarArr = a.pl0.W0;
                a.wv.w(pl0Var, "this$0");
                int action = motionEvent.getAction();
                a.yq1 yq1Var = pl0Var.D0;
                if (action == 1) {
                    ((com.omarea.common.ui.OverScrollView) yq1Var.a(a.pl0.W0[33])).requestDisallowInterceptTouchEvent(false);
                } else {
                    ((com.omarea.common.ui.OverScrollView) yq1Var.a(a.pl0.W0[33])).requestDisallowInterceptTouchEvent(true);
                }
                return false;
            default:
                a.kh0 kh0Var = (a.kh0) obj;
                a.wv.w(kh0Var, "this$0");
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                android.graphics.Rect rect = new android.graphics.Rect();
                kh0Var.b.findViewById(2131363349).getGlobalVisibleRect(rect);
                if (!rect.contains(x, y)) {
                    kh0Var.a();
                }
                return false;
        }
    }
}
