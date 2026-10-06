package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l20 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.util.ArrayList d;
    public final /* synthetic */ a.r20 e;

    public /* synthetic */ l20(a.r20 r20Var, java.util.ArrayList arrayList, int i) {
        this.c = i;
        this.e = r20Var;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        char c;
        int i = this.c;
        a.r20 r20Var = this.e;
        java.util.ArrayList arrayList = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.q20 q20Var = (a.q20) it.next();
                    a.da1 da1Var = q20Var.f459a;
                    r20Var.getClass();
                    android.view.View view = da1Var.f91a;
                    int i2 = q20Var.d - q20Var.b;
                    int i3 = q20Var.e - q20Var.c;
                    if (i2 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i3 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    android.view.ViewPropertyAnimator animate = view.animate();
                    r20Var.p.add(da1Var);
                    animate.setDuration(r20Var.e).setListener(new a.n20(r20Var, da1Var, i2, view, i3, animate)).start();
                }
                arrayList.clear();
                r20Var.m.remove(arrayList);
                return;
            case 1:
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a.p20 p20Var = (a.p20) it2.next();
                    r20Var.getClass();
                    a.da1 da1Var2 = p20Var.f429a;
                    android.view.View view2 = da1Var2 == null ? null : da1Var2.f91a;
                    a.da1 da1Var3 = p20Var.b;
                    android.view.View view3 = da1Var3 != null ? da1Var3.f91a : null;
                    java.util.ArrayList arrayList2 = r20Var.r;
                    long j2 = r20Var.f;
                    if (view2 != null) {
                        android.view.ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                        arrayList2.add(p20Var.f429a);
                        duration.translationX(p20Var.e - p20Var.c);
                        duration.translationY(p20Var.f - p20Var.d);
                        j = j2;
                        duration.alpha(0.0f).setListener(new a.o20(r20Var, p20Var, duration, view2, 0)).start();
                    } else {
                        j = j2;
                    }
                    if (view3 != null) {
                        android.view.ViewPropertyAnimator animate2 = view3.animate();
                        arrayList2.add(p20Var.b);
                        c = 0;
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new a.o20(r20Var, p20Var, animate2, view3, 1)).start();
                    } else {
                        c = 0;
                    }
                }
                arrayList.clear();
                r20Var.n.remove(arrayList);
                return;
            default:
                java.util.Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    a.da1 da1Var4 = (a.da1) it3.next();
                    r20Var.getClass();
                    android.view.View view4 = da1Var4.f91a;
                    android.view.ViewPropertyAnimator animate3 = view4.animate();
                    r20Var.o.add(da1Var4);
                    animate3.alpha(1.0f).setDuration(r20Var.c).setListener(new a.m20(r20Var, da1Var4, view4, animate3, 1)).start();
                }
                arrayList.clear();
                r20Var.l.remove(arrayList);
                return;
        }
    }
}
