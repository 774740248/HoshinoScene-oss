package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wa0 implements java.lang.Runnable {

    public wa0(int p0) {
        this.c = p0;
    }
    public final /* synthetic */ int c;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                try {
                    int i = a.gn1.f185a;
                    a.fn1.a("EmojiCompat.EmojiCompatInitializer.run");
                    if (a.ta0.j != null) {
                        a.ta0.a().c();
                    }
                    a.fn1.b();
                    return;
                } catch (java.lang.Throwable th) {
                    int i2 = a.gn1.f185a;
                    a.fn1.b();
                    throw th;
                }
            default:
                return;
        }
    }
}
