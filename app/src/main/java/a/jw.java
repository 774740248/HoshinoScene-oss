package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jw extends androidx.activity.result.a {
    public final /* synthetic */ androidx.activity.ComponentActivity i;

    public jw(androidx.activity.ComponentActivity componentActivity) {
        this.i = componentActivity;
    }

    @Override // androidx.activity.result.a
    public final void b(int i, a.qe qeVar, java.lang.Object obj) {
        android.os.Bundle bundle;
        androidx.activity.ComponentActivity componentActivity = this.i;
        a.pe b = qeVar.b(componentActivity, obj);
        int i2 = 0;
        if (b != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.iw(this, i, b, i2));
            return;
        }
        android.content.Intent a2 = qeVar.a(componentActivity, obj);
        if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
            a2.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            android.os.Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
            java.lang.String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new java.lang.String[0];
            }
            a.n6.c(componentActivity, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
            int i3 = a.n6.b;
            a.h6.b(componentActivity, a2, i, bundle);
            return;
        }
        a.us0 us0Var = (a.us0) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            android.content.IntentSender intentSender = us0Var.c;
            android.content.Intent intent = us0Var.d;
            int i4 = us0Var.e;
            int i5 = us0Var.f;
            int i6 = a.n6.b;
            a.h6.c(componentActivity, intentSender, i, intent, i4, i5, 0, bundle);
        } catch (android.content.IntentSender.SendIntentException e) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new a.iw(this, i, e, 1));
        }
    }
}
