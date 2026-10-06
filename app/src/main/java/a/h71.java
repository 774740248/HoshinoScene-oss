package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h71 extends a.nb0 {
    final /* synthetic */ a.k71 this$0;

    public h71(a.k71 k71Var) {
        this.this$0 = k71Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        a.k71 k71Var = this.this$0;
        int i = k71Var.c + 1;
        k71Var.c = i;
        if (i == 1 && k71Var.f) {
            k71Var.h.e(a.ev0.ON_START);
            k71Var.f = false;
        }
    }
}
