package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class rm1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar d;

    public /* synthetic */ rm1(androidx.appcompat.widget.Toolbar toolbar, int i) {
        this.c = i;
        this.d = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        androidx.appcompat.widget.Toolbar toolbar = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                toolbar.invalidateMenu();
                return;
            default:
                a.um1 um1Var = toolbar.O;
                a.xz0 xz0Var = um1Var == null ? null : um1Var.d;
                if (xz0Var != null) {
                    xz0Var.collapseActionView();
                    return;
                }
                return;
        }
    }
}
