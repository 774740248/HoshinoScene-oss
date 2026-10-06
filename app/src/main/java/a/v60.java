package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v60 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.AlertDialog f625a;
    public final java.util.ArrayList b;
    public final android.content.Context c;
    public boolean d;

    public v60(android.app.AlertDialog alertDialog) {
        a.wv.w(alertDialog, "d");
        this.f625a = alertDialog;
        this.b = new java.util.ArrayList();
        int i = a.x60.f681a;
        alertDialog.setOnDismissListener(new a.p60(1, this));
        android.content.Context context = alertDialog.getContext();
        a.wv.v(context, "dialog.context");
        this.c = context;
        this.d = true;
    }

    public final void a() {
        try {
            this.f625a.dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b(boolean z) {
        this.d = z;
        this.f625a.setCancelable(z);
    }
}
