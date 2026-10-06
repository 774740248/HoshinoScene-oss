package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class i71 extends a.nb0 {
    final /* synthetic */ a.k71 this$0;

    public i71(a.k71 k71Var) {
        this.this$0 = k71Var;
    }

    @Override // a.nb0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i = a.fb1.d;
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            a.wv.t(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((a.fb1) findFragmentByTag).c = this.this$0.j;
        }
    }

    @Override // a.nb0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        a.k71 k71Var = this.this$0;
        int i = k71Var.d - 1;
        k71Var.d = i;
        if (i == 0) {
            android.os.Handler handler = k71Var.g;
            a.wv.s(handler);
            handler.postDelayed(k71Var.i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        a.wv.w(activity, "activity");
        a.g71.a(activity, new a.h71(this.this$0));
    }

    @Override // a.nb0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        a.wv.w(activity, "activity");
        a.k71 k71Var = this.this$0;
        int i = k71Var.c - 1;
        k71Var.c = i;
        if (i == 0 && k71Var.e) {
            k71Var.h.e(a.ev0.ON_STOP);
            k71Var.f = true;
        }
    }
}
