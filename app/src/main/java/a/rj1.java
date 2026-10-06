package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rj1 implements java.lang.Runnable {
    public final android.view.View c;
    public final boolean d;
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior e;

    public rj1(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior, android.view.View view, boolean z) {
        this.e = swipeDismissBehavior;
        this.c = view;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.rq rqVar;
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.e;
        a.pq1 pq1Var = swipeDismissBehavior.f758a;
        android.view.View view = this.c;
        if (pq1Var != null && pq1Var.g()) {
            java.util.WeakHashMap weakHashMap = a.jq1.f264a;
            a.rp1.m(view, this);
        } else {
            if (!this.d || (rqVar = swipeDismissBehavior.listener) == null) {
                return;
            }
            rqVar.a(view);
        }
    }
}
