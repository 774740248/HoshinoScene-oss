package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class gm extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gm(int i, java.lang.Object obj) {
        this.f182a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.Runnable runnable;
        int i = this.f182a;
        java.lang.Object obj = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.hm) obj).f();
                return;
            default:
                if (intent == null || !intent.hasExtra("id")) {
                    return;
                }
                a.or orVar = (a.or) obj;
                if (intent.getIntExtra("id", 0) != orVar.c || (runnable = orVar.k) == null) {
                    return;
                }
                runnable.run();
                return;
        }
    }
}
