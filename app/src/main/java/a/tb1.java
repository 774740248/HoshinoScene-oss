package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class tb1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ tb1(int i, int i2, java.lang.Object obj) {
        this.c = i2;
        this.e = obj;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.pm pmVar;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.b20) this.e).K0(this.d);
                return;
            case 1:
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = (com.google.android.material.sidesheet.SideSheetBehavior) this.e;
                android.view.View view = (android.view.View) sideSheetBehavior.viewRef.get();
                if (view != null) {
                    sideSheetBehavior.startSettling(view, this.d, false);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                java.lang.String str = (java.lang.String) this.e;
                a.wv.w(str, "$message");
                a.cp cpVar = com.omarea.Scene.c;
                android.widget.Toast.makeText(a.fs1.t(), str, this.d).show();
                return;
            case 3:
                com.omarea.ui.TabBarView tabBarView = (com.omarea.ui.TabBarView) this.e;
                int i = com.omarea.ui.TabBarView.n;
                a.wv.w(tabBarView, "this$0");
                android.view.View childAt = tabBarView.m.getChildAt(this.d);
                if (childAt == null) {
                    return;
                }
                android.widget.FrameLayout frameLayout = tabBarView.l;
                if (frameLayout == null) {
                    a.wv.M1("scrollView");
                    throw null;
                }
                if (frameLayout instanceof android.widget.HorizontalScrollView) {
                    ((android.widget.HorizontalScrollView) frameLayout).smoothScrollTo(childAt.getLeft() - tabBarView.b(48), 0);
                    return;
                } else {
                    if (frameLayout instanceof android.widget.ScrollView) {
                        ((android.widget.ScrollView) frameLayout).smoothScrollTo(0, childAt.getTop() - tabBarView.b(48));
                        return;
                    }
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                int i2 = this.d;
                a.b91 b91Var = (a.b91) this.e;
                java.util.concurrent.ExecutorService executorService = a.b91.q;
                a.wv.w(b91Var, "this$0");
                if (i2 == b91Var.l && b91Var.f35a.isAttachedToWindow()) {
                    synchronized (b91Var.i) {
                        pmVar = b91Var.j;
                    }
                    if (pmVar == null) {
                        return;
                    }
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = b91Var.h;
                    if (bitmapDrawable != null && bitmapDrawable.getBitmap() == ((android.graphics.Bitmap) pmVar.e)) {
                        b91Var.f35a.invalidate();
                        return;
                    }
                    android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(b91Var.f35a.getResources(), (android.graphics.Bitmap) pmVar.e);
                    b91Var.f35a.setBackground(bitmapDrawable2);
                    b91Var.h = bitmapDrawable2;
                    return;
                }
                return;
            case 5:
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) this.e;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                android.widget.LinearLayout y = activityFpsSession.y();
                int paddingLeft = activityFpsSession.y().getPaddingLeft();
                int paddingRight = activityFpsSession.y().getPaddingRight();
                int i3 = this.d;
                y.setPadding(paddingLeft, i3, paddingRight, i3);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                final com.omarea.vtools.activities.ActivitySwap activitySwap = (com.omarea.vtools.activities.ActivitySwap) this.e;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.L(new a.zf(activitySwap, 4));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("swapoff ");
                java.lang.String str2 = activitySwap.P.b;
                sb2.append(str2);
                sb2.append(" >/dev/null 2>&1\n");
                sb.append(sb2.toString());
                sb.append("rm -f " + str2 + " >/dev/null 2>&1\n");
                a.nu0 nu0Var = a.nu0.f395a;
                boolean h = a.nu0.h();
                final int i4 = this.d;
                if (h) {
                    sb.append("fallocate -l " + i4 + "M " + str2 + " || dd if=/dev/zero of=" + str2 + " bs=1048576 count=" + i4 + "\n");
                } else {
                    sb.append("dd if=/dev/zero of=" + str2 + " bs=1048576 count=" + i4 + "\n");
                }
                java.lang.String sb3 = sb.toString();
                a.wv.v(sb3, "sb.toString()");
                a.q10 q10Var = a.q10.f457a;
                a.q10.l(sb3);
                android.content.SharedPreferences sharedPreferences = activitySwap.N;
                if (sharedPreferences == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                sharedPreferences.edit().putInt("swap_size", i4).apply();
                activitySwap.U.b();
                final long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                a.fs1.L(new a.ag());
                return;
            default:
                a.ej1 ej1Var = (a.ej1) this.e;
                a.wv.w(ej1Var, "this$0");
                android.view.View view2 = (android.view.View) ej1Var.c;
                if (view2 != null) {
                    ((android.view.WindowManager) ej1Var.f).updateViewLayout(view2, (android.view.WindowManager.LayoutParams) ej1Var.e);
                    return;
                } else {
                    if (this.d != -1) {
                        android.view.View view3 = new android.view.View((android.content.Context) ej1Var.d);
                        ej1Var.c = view3;
                        ((android.view.WindowManager) ej1Var.f).addView(view3, (android.view.WindowManager.LayoutParams) ej1Var.e);
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ tb1(int i, a.b91 b91Var) {
        this.c = 4;
        this.d = i;
        this.e = b91Var;
    }
}
