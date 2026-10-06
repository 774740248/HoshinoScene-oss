package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class f01 implements android.widget.PopupWindow.OnDismissListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ f01(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.h01) obj).c();
                return;
            default:
                ((a.d61) obj).getClass();
                return;
        }
    }
}
