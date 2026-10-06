package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class mi implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.io.File d;
    public final /* synthetic */ a.oi e;
    public final /* synthetic */ a.ti f;

    public /* synthetic */ mi(java.io.File file, a.oi oiVar, a.ti tiVar, int i) {
        this.c = i;
        this.d = file;
        this.e = oiVar;
        this.f = tiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.ti tiVar = this.f;
        a.oi oiVar = this.e;
        java.io.File file = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(file, "$file");
                a.wv.w(oiVar, "$holder");
                a.wv.w(tiVar, "this$0");
                if (!file.exists()) {
                    android.view.View view = oiVar.f91a;
                    android.widget.Toast.makeText(view.getContext(), view.getContext().getString(2131952266), 0).show();
                    return;
                } else {
                    tiVar.i = file;
                    java.lang.Runnable runnable = tiVar.g;
                    a.wv.s(runnable);
                    runnable.run();
                    return;
                }
            default:
                a.wv.w(file, "$file");
                a.wv.w(oiVar, "$holder");
                a.wv.w(tiVar, "this$0");
                if (!file.exists()) {
                    android.view.View view2 = oiVar.f91a;
                    android.widget.Toast.makeText(view2.getContext(), view2.getContext().getString(2131952266), 0).show();
                    return;
                } else {
                    tiVar.i = file;
                    java.lang.Runnable runnable2 = tiVar.g;
                    a.wv.s(runnable2);
                    runnable2.run();
                    return;
                }
        }
    }
}
