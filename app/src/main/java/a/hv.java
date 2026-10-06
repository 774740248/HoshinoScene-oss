package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class hv implements android.view.View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ hv(int i, java.lang.Object obj) {
        this.f218a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        int i = this.f218a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.jv jvVar = (a.jv) obj;
                jvVar.t(jvVar.u());
                return;
            case 1:
                a.ca0 ca0Var = (a.ca0) obj;
                ca0Var.l = z;
                ca0Var.q();
                if (z) {
                    return;
                }
                ca0Var.t(false);
                ca0Var.m = false;
                return;
            default:
                com.omarea.ui.SearchInput searchInput = (com.omarea.ui.SearchInput) obj;
                int i2 = com.omarea.ui.SearchInput.m;
                a.wv.w(searchInput, "this$0");
                if (z || !searchInput.i || searchInput.j) {
                    return;
                }
                searchInput.b();
                return;
        }
    }
}
