package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ow0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.vw0 d;

    public /* synthetic */ ow0(a.vw0 vw0Var, int i) {
        this.c = i;
        this.d = vw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.vw0 vw0Var = this.d;
        switch (i) {
            case 1:
                a.y90 y90Var = vw0Var.e;
                if (y90Var != null) {
                    y90Var.setListSelectionHidden(true);
                    y90Var.requestLayout();
                    return;
                }
                return;
            default:
                a.y90 y90Var2 = vw0Var.e;
                if (y90Var2 != null) {
                    java.util.WeakHashMap weakHashMap = a.jq1.f264a;
                    if (!a.up1.b(y90Var2) || vw0Var.e.getCount() <= vw0Var.e.getChildCount() || vw0Var.e.getChildCount() > vw0Var.o) {
                        return;
                    }
                    vw0Var.B.setInputMethodMode(2);
                    vw0Var.f();
                    return;
                }
                return;
        }
    }
}
