package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class c31 implements android.window.OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ c31(int i, java.lang.Object obj) {
        this.f62a = i;
        this.b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f62a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((java.lang.Runnable) this.b).run();
                return;
            case 1:
                ((java.lang.Runnable) this.b).run();
                return;
            default:
                ((a.km) this.b).G();
                return;
        }
    }
}
