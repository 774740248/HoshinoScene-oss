package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ju1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.fa0 f271a;

    public ju1(android.view.WindowInsetsController windowInsetsController) {
        this.f271a = new a.iu1(windowInsetsController);
    }

    public final void a(boolean z) {
        this.f271a.B(z);
    }

    public final void b(boolean z) {
        this.f271a.C(z);
    }

    public ju1(android.view.Window window, android.view.View view) {
        android.view.WindowInsetsController insetsController;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            a.iu1 iu1Var = new a.iu1(insetsController);
            iu1Var.f = window;
            this.f271a = iu1Var;
            return;
        }
        this.f271a = new a.hu1(window, view);
    }
}
