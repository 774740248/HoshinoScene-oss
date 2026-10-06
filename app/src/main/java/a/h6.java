package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class h6 {
    public static void a(android.app.Activity activity) {
        activity.finishAffinity();
    }

    public static void b(android.app.Activity activity, android.content.Intent intent, int i, android.os.Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void c(android.app.Activity activity, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
