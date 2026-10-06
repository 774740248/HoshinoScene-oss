package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class e40 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.f40 d;

    public /* synthetic */ e40(a.f40 f40Var, int i) {
        this.c = i;
        this.d = f40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.f40 f40Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(f40Var, "this$0");
                android.content.Context context = f40Var.f144a;
                f40Var.d.setText(context.getString(2131951906));
                try {
                    f40Var.b.a();
                } catch (java.lang.Exception unused) {
                }
                java.lang.StringBuilder sb = f40Var.e;
                if (!a.yi1.o2(sb)) {
                    int i2 = a.x60.f681a;
                    java.lang.String string = context.getString(2131951927);
                    a.wv.v(string, "context.getString(R.string.apps_op_error)");
                    java.lang.String sb2 = sb.toString();
                    a.wv.v(sb2, "error.toString()");
                    a.fs1.a(context, string, sb2, null);
                    return;
                }
                return;
            default:
                a.wv.w(f40Var, "this$0");
                f40Var.b.a();
                return;
        }
    }
}
