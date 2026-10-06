package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class sc0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.widget.TextView d;
    public final /* synthetic */ java.lang.String e;

    public /* synthetic */ sc0(android.widget.TextView textView, java.lang.String str, int i) {
        this.c = i;
        this.d = textView;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        android.widget.TextView textView = this.d;
        java.lang.String str = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(textView, "$this_appendText");
                a.wv.w(str, "$text");
                textView.append(str);
                return;
            default:
                int i2 = com.omarea.sysmbol.PerfOptionsRender.d;
                a.wv.w(str, "$nameList");
                textView.setText(str);
                return;
        }
    }
}
