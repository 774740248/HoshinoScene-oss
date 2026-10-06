package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class p60 implements android.content.DialogInterface.OnDismissListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ p60(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((java.lang.Runnable) obj).run();
                return;
            case 1:
                a.v60 v60Var = (a.v60) obj;
                a.wv.w(v60Var, "this$0");
                java.util.Iterator it = v60Var.b.iterator();
                while (it.hasNext()) {
                    ((android.content.DialogInterface.OnDismissListener) it.next()).onDismiss(v60Var.f625a);
                }
                int i2 = a.x60.f681a;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.a2 a2Var = (a.a2) obj;
                int i3 = a.a2.d0;
                a.wv.w(a2Var, "this$0");
                if (a2Var.d() != null) {
                    int i4 = a.x60.f681a;
                    return;
                }
                return;
            default:
                java.util.Timer timer = (java.util.Timer) obj;
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityStartSplash.q;
                a.wv.w(timer, "$timer");
                timer.cancel();
                return;
        }
    }
}
