package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class eu1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.view.View d;

    public /* synthetic */ eu1(android.view.View view, int i) {
        this.c = i;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.kq0 kq0Var = a.kq0.c;
        int i = this.c;
        android.view.View view = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 1:
                android.view.WindowManager windowManager = a.dh0.n;
                if (android.os.Build.VERSION.SDK_INT >= 27) {
                    a.wv.M0(kq0Var, a.z80.b, new a.ah0(view, null), 2);
                    return;
                }
                return;
            default:
                android.view.WindowManager windowManager2 = a.hh0.d;
                a.wv.w(view, "$view");
                if (android.os.Build.VERSION.SDK_INT >= 27) {
                    a.wv.M0(kq0Var, a.z80.b, new a.gh0(view, null), 2);
                    return;
                }
                return;
        }
    }
}
