package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class pe implements a.ww0, a.g91, a.z0, a.my0 {
    public java.lang.Object c;

    public /* synthetic */ pe(java.lang.Object obj) {
        this.c = obj;
    }

    @Override // a.ww0
    public void a(int i, int i2) {
        ((a.e91) this.c).c.f(i, i2);
    }

    @Override // a.ww0
    public void b(int i, int i2) {
        ((a.e91) this.c).c.e(i, i2);
    }

    @Override // a.ww0
    public void c(int i, int i2) {
        ((a.e91) this.c).c.c(i, i2);
    }

    @Override // a.z0
    public boolean d(android.view.View view) {
        if (!((com.google.android.material.behavior.SwipeDismissBehavior) this.c).canSwipeDismissView(view)) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        boolean z = a.sp1.d(view) == 1;
        int i = ((com.google.android.material.behavior.SwipeDismissBehavior) this.c).swipeDirection;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        a.rq rqVar = ((com.google.android.material.behavior.SwipeDismissBehavior) this.c).listener;
        if (rqVar != null) {
            rqVar.a(view);
        }
        return true;
    }

    @Override // a.ww0
    public void e(int i, int i2, java.lang.Object obj) {
        ((a.e91) this.c).c.d(i, i2, obj);
    }

    public a.g0 f(int i) {
        return null;
    }

    public a.g0 g(int i) {
        return null;
    }

    public int h() {
        int i = i();
        java.lang.Object obj = this.c;
        return java.lang.Math.max(0, (i - ((com.google.android.material.sidesheet.SideSheetBehavior) obj).parentWidth) - ((com.google.android.material.sidesheet.SideSheetBehavior) obj).innerMargin);
    }

    public int i() {
        return ((com.google.android.material.sidesheet.SideSheetBehavior) this.c).parentInnerEdge;
    }

    public boolean j(int i, int i2, android.os.Bundle bundle) {
        return false;
    }

    public pe() {
        this.c = new a.j0(this);
    }
}
