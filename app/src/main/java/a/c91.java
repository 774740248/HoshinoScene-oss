package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c91 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView d;

    public /* synthetic */ c91(androidx.recyclerview.widget.RecyclerView recyclerView, int i) {
        this.c = i;
        this.d = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        int i = this.c;
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (!recyclerView3.w || recyclerView3.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView3.u) {
                    recyclerView3.requestLayout();
                    return;
                } else if (recyclerView3.z) {
                    recyclerView3.y = true;
                    return;
                } else {
                    recyclerView3.p();
                    return;
                }
            default:
                a.j91 j91Var = recyclerView3.O;
                if (j91Var != null) {
                    a.r20 r20Var = (a.r20) j91Var;
                    java.util.ArrayList arrayList = r20Var.h;
                    boolean z = !arrayList.isEmpty();
                    java.util.ArrayList arrayList2 = r20Var.j;
                    boolean z2 = !arrayList2.isEmpty();
                    java.util.ArrayList arrayList3 = r20Var.k;
                    boolean z3 = !arrayList3.isEmpty();
                    java.util.ArrayList arrayList4 = r20Var.i;
                    boolean z4 = !arrayList4.isEmpty();
                    if (z || z2 || z4 || z3) {
                        java.util.Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j = r20Var.d;
                            if (hasNext) {
                                a.da1 da1Var = (a.da1) it.next();
                                android.view.View view = da1Var.f91a;
                                android.view.ViewPropertyAnimator animate = view.animate();
                                r20Var.q.add(da1Var);
                                animate.setDuration(j).alpha(0.0f).setListener(new a.m20(r20Var, da1Var, animate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (z2) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    r20Var.m.add(arrayList5);
                                    arrayList2.clear();
                                    a.l20 l20Var = new a.l20(r20Var, arrayList5, 0);
                                    if (z) {
                                        android.view.View view2 = ((a.q20) arrayList5.get(0)).f459a.f91a;
                                        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                                        a.rp1.n(view2, l20Var, j);
                                    } else {
                                        l20Var.run();
                                    }
                                }
                                if (z3) {
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    r20Var.n.add(arrayList6);
                                    arrayList3.clear();
                                    a.l20 l20Var2 = new a.l20(r20Var, arrayList6, 1);
                                    if (z) {
                                        android.view.View view3 = ((a.p20) arrayList6.get(0)).f429a.f91a;
                                        java.util.WeakHashMap weakHashMap2 = a.jq1.f264a;
                                        a.rp1.n(view3, l20Var2, j);
                                    } else {
                                        l20Var2.run();
                                    }
                                }
                                if (z4) {
                                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    r20Var.l.add(arrayList7);
                                    arrayList4.clear();
                                    a.l20 l20Var3 = new a.l20(r20Var, arrayList7, 2);
                                    if (z || z2 || z3) {
                                        if (!z) {
                                            j = 0;
                                        }
                                        long max = java.lang.Math.max(z2 ? r20Var.e : 0L, z3 ? r20Var.f : 0L) + j;
                                        android.view.View view4 = ((a.da1) arrayList7.get(0)).f91a;
                                        java.util.WeakHashMap weakHashMap3 = a.jq1.f264a;
                                        a.rp1.n(view4, l20Var3, max);
                                    } else {
                                        l20Var3.run();
                                    }
                                }
                            }
                        }
                    } else {
                        recyclerView2 = recyclerView3;
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.p0 = false;
                return;
        }
    }
}
