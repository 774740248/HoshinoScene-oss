package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mk implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ mk(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.sk skVar = (a.sk) obj;
                android.widget.Button button = skVar.f;
                skVar.w.obtainMessage(1, skVar.b).sendToTarget();
                return;
            case 1:
                a.um1 um1Var = ((androidx.appcompat.widget.Toolbar) obj).O;
                a.xz0 xz0Var = um1Var == null ? null : um1Var.d;
                if (xz0Var != null) {
                    xz0Var.collapseActionView();
                    return;
                }
                return;
            default:
                a.wy0 wy0Var = (a.wy0) obj;
                int i2 = wy0Var.a0;
                if (i2 == 2) {
                    wy0Var.T(1);
                    return;
                } else {
                    if (i2 == 1) {
                        wy0Var.T(2);
                        return;
                    }
                    return;
                }
        }
    }
}
