package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gn implements android.widget.PopupWindow.OnDismissListener {
    public final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener c;
    public final /* synthetic */ a.hn d;

    public gn(a.hn hnVar, a.ft ftVar) {
        this.d = hnVar;
        this.c = ftVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.d.I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.c);
        }
    }
}
