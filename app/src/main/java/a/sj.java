package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class sj implements android.view.View.OnTouchListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ sj(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        a.xv0 xv0Var;
        a.da1 N;
        int i = this.c;
        java.lang.Object obj = this.e;
        java.lang.Object obj2 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.xj xjVar = (a.xj) obj2;
                a.tj tjVar = (a.tj) obj;
                a.wv.w(xjVar, "this$0");
                a.wv.w(tjVar, "this$1");
                a.ga1 ga1Var = xjVar.B;
                if (ga1Var == null) {
                    return false;
                }
                android.view.View view2 = tjVar.f91a;
                a.wv.v(view2, "itemView");
                a.wv.v(motionEvent, "event");
                if (!((java.lang.Boolean) ga1Var.c.b()).booleanValue()) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                int i2 = -1;
                a.hw hwVar = ga1Var.m;
                int[] iArr = ga1Var.k;
                androidx.recyclerview.widget.RecyclerView recyclerView = ga1Var.f173a;
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                return false;
                            }
                        } else {
                            if (!ga1Var.h) {
                                return false;
                            }
                            ga1Var.l = motionEvent.getRawY();
                            if (recyclerView.getHeight() > 0) {
                                android.view.View E = recyclerView.E(recyclerView.getWidth() / 2.0f, a.wv.B(motionEvent.getRawY() - iArr[1], 0.0f, i - 1));
                                if (E != null && (N = androidx.recyclerview.widget.RecyclerView.N(E)) != null) {
                                    i2 = N.c();
                                }
                                ga1Var.a(i2);
                            }
                        }
                    }
                    if (!ga1Var.h) {
                        return false;
                    }
                    ga1Var.h = false;
                    ga1Var.j = -1;
                    recyclerView.removeCallbacks(hwVar);
                    recyclerView.requestDisallowInterceptTouchEvent(false);
                } else {
                    android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) view2.findViewById(ga1Var.b);
                    if (compoundButton == null || compoundButton.getVisibility() != 0 || motionEvent.getX() < compoundButton.getLeft() - ga1Var.e) {
                        return false;
                    }
                    recyclerView.getClass();
                    a.da1 N2 = androidx.recyclerview.widget.RecyclerView.N(view2);
                    int c = N2 != null ? N2.c() : -1;
                    if (c == -1) {
                        return false;
                    }
                    ga1Var.h = true;
                    ga1Var.i = !compoundButton.isChecked();
                    ga1Var.j = -1;
                    recyclerView.getLocationOnScreen(iArr);
                    ga1Var.l = motionEvent.getRawY();
                    recyclerView.setScrollState(0);
                    a.ca1 ca1Var = recyclerView.g0;
                    ca1Var.i.removeCallbacks(ca1Var);
                    ca1Var.e.abortAnimation();
                    androidx.recyclerview.widget.a aVar = recyclerView.p;
                    if (aVar != null && (xv0Var = aVar.g) != null) {
                        xv0Var.h();
                    }
                    recyclerView.requestDisallowInterceptTouchEvent(true);
                    ga1Var.a(c);
                    recyclerView.postOnAnimation(hwVar);
                }
                return true;
            case 1:
                a.dh0 dh0Var = (a.dh0) obj;
                android.view.WindowManager windowManager = a.dh0.n;
                a.wv.w(dh0Var, "this$0");
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                android.graphics.Rect rect = new android.graphics.Rect();
                ((android.view.View) obj2).getGlobalVisibleRect(rect);
                if (!rect.contains(x, y)) {
                    dh0Var.a();
                }
                return false;
            default:
                a.hh0 hh0Var = (a.hh0) obj;
                android.view.WindowManager windowManager2 = a.hh0.d;
                a.wv.w(hh0Var, "this$0");
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                ((android.view.View) obj2).getGlobalVisibleRect(rect2);
                if (!rect2.contains(x2, y2)) {
                    hh0Var.a();
                }
                return false;
        }
    }
}
