package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qk extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469a = 2;
    public final java.lang.Object b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qk(a.v60 r2) {
        /*
            r1 = this;
            r0 = 2
            r1.f469a = r0
            android.os.Looper r0 = android.os.Looper.myLooper()
            a.wv.s(r0)
            r1.<init>(r0)
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qk.<init>(a.v60):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        switch (this.f469a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((android.content.DialogInterface.OnClickListener) message.obj).onClick((android.content.DialogInterface) ((java.lang.ref.WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((android.content.DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                int i2 = message.what;
                if (i2 == 1) {
                    a.ai1.t(this.b);
                    throw null;
                }
                if (i2 == 2) {
                    a.ai1.t(this.b);
                    throw null;
                }
                if (i2 == 3) {
                    a.ai1.t(this.b);
                    throw null;
                }
                throw new java.lang.RuntimeException("Unknown message " + message);
            default:
                a.wv.w(message, "msg");
                super.handleMessage(message);
                try {
                    java.lang.Object obj = this.b;
                    if (((a.v60) obj) != null) {
                        int i3 = message.what;
                        if (i3 == 10) {
                            a.v60 v60Var = (a.v60) obj;
                            a.wv.s(v60Var);
                            v60Var.a();
                            if (a.wv.e(message.obj, java.lang.Boolean.TRUE)) {
                                a.v60 v60Var2 = (a.v60) this.b;
                                a.wv.s(v60Var2);
                                android.widget.Toast.makeText(v60Var2.c, 2131952230, 0).show();
                            } else {
                                a.v60 v60Var3 = (a.v60) this.b;
                                a.wv.s(v60Var3);
                                android.widget.Toast.makeText(v60Var3.c, 2131952229, 1).show();
                            }
                        } else if (i3 == -1) {
                            a.v60 v60Var4 = (a.v60) obj;
                            a.wv.s(v60Var4);
                            android.widget.Toast.makeText(v60Var4.c, 2131952229, 1).show();
                        } else if (i3 == 0 && a.wv.e(message.obj, java.lang.Boolean.FALSE)) {
                            a.v60 v60Var5 = (a.v60) this.b;
                            a.wv.s(v60Var5);
                            v60Var5.a();
                            a.v60 v60Var6 = (a.v60) this.b;
                            a.wv.s(v60Var6);
                            android.widget.Toast.makeText(v60Var6.c, 2131952229, 1).show();
                        }
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
        }
    }

    public qk(android.content.DialogInterface dialogInterface) {
        this.b = new java.lang.ref.WeakReference(dialogInterface);
    }
}
