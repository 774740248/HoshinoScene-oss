package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class k60 implements android.content.DialogInterface.OnDismissListener {
    public final /* synthetic */ a.m60 c;

    public k60(a.m60 m60Var) {
        this.c = m60Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        a.m60 m60Var = this.c;
        android.app.Dialog dialog = m60Var.h0;
        if (dialog != null) {
            m60Var.onDismiss(dialog);
        }
    }
}
