package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wl0 extends a.qe {

    public wl0() {
    }

    @Override // a.qe
    public final android.content.Intent a(androidx.activity.ComponentActivity componentActivity, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        a.us0 us0Var = (a.us0) obj;
        android.content.Intent intent = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        android.content.Intent intent2 = us0Var.d;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                us0Var = new a.us0(us0Var.c, null, us0Var.e, us0Var.f);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", us0Var);
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
        }
        return intent;
    }

    @Override // a.qe
    public final java.lang.Object c(android.content.Intent intent, int i) {
        return new a.ne(intent, i);
    }
}
