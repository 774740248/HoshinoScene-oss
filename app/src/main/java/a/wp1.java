package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wp1 implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public a.du1 f671a = null;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ a.z21 c;

    public wp1(android.view.View view, a.z21 z21Var) {
        this.b = view;
        this.c = z21Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        a.du1 h = a.du1.h(view, windowInsets);
        int i = android.os.Build.VERSION.SDK_INT;
        a.z21 z21Var = this.c;
        if (i < 30) {
            a.xp1.a(windowInsets, this.b);
            if (h.equals(this.f671a)) {
                return z21Var.u(view, h).g();
            }
        }
        this.f671a = h;
        a.du1 u = z21Var.u(view, h);
        if (i >= 30) {
            return u.g();
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        a.vp1.c(view);
        return u.g();
    }
}
