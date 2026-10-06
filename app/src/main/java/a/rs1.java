package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class rs1 implements android.webkit.ValueCallback {

    public rs1(int p0) {
        this.f504a = p0;
    }

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f504a;

    @Override // android.webkit.ValueCallback
    public final /* bridge */ /* synthetic */ void onReceiveValue(java.lang.Object obj) {
        switch (this.f504a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return;
            case 1:
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return;
            default:
                return;
        }
    }
}
