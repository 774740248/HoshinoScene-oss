package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j60 implements android.content.DialogInterface.OnCancelListener {
    public final /* synthetic */ a.m60 c;

    public j60(a.m60 m60Var) {
        this.c = m60Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        a.m60 m60Var = this.c;
        android.app.Dialog dialog = m60Var.h0;
        if (dialog != null) {
            m60Var.onCancel(dialog);
        }
    }
}
