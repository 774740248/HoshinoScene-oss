package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zf1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ androidx.appcompat.widget.SearchView d;

    public /* synthetic */ zf1(androidx.appcompat.widget.SearchView searchView, int i) {
        this.c = i;
        this.d = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        androidx.appcompat.widget.SearchView searchView = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                searchView.updateFocusedState();
                return;
            default:
                a.vz vzVar = searchView.Q;
                if (vzVar instanceof a.bj1) {
                    vzVar.b(null);
                    return;
                }
                return;
        }
    }
}
