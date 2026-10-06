package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class n60 extends a.m60 {

    public n60() {
        this(0, false);
    }
    public final int m0;
    public final int n0;

    public n60(int i, boolean z) {
        this.m0 = i;
        this.n0 = z ? 2132018308 : 2132018309;
    }

    @Override // a.gk0
    public void C(android.view.View view, android.os.Bundle bundle) {
        android.app.Dialog dialog;
        android.view.Window window;
        a.wv.w(view, "view");
        a.kk0 d = d();
        if (d != null && (dialog = this.h0) != null && (window = dialog.getWindow()) != null) {
            int i = a.x60.f681a;
            a.fs1.R(window, d);
        }
        int i2 = a.x60.f681a;
        a.fs1.P(view);
    }

    @Override // a.m60
    public final android.app.Dialog T() {
        a.kk0 K = K();
        int i = this.n0;
        if (i == 0) {
            i = 2132018309;
        }
        return new android.app.Dialog(K, i);
    }

    @Override // a.m60, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        a.wv.w(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (d() != null) {
            int i = a.x60.f681a;
        }
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        android.view.View inflate = layoutInflater.inflate(this.m0, viewGroup);
        a.wv.v(inflate, "inflater.inflate(layout, container)");
        return inflate;
    }
}
