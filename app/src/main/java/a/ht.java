package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ht implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ ht(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.c = i;
        this.g = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        java.lang.Object obj3 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.jt jtVar = (a.jt) obj3;
                if (jtVar != null) {
                    a.vu0 vu0Var = (a.vu0) this.g;
                    ((a.kt) vu0Var.d).C = true;
                    jtVar.b.c(false);
                    ((a.kt) vu0Var.d).C = false;
                }
                android.view.MenuItem menuItem = (android.view.MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((a.pz0) obj).q(menuItem, null, 4);
                    return;
                }
                return;
            default:
                ((a.nn0) obj3).getClass();
                a.nn0.g((android.view.View) obj2, (android.graphics.Rect) obj);
                return;
        }
    }
}
