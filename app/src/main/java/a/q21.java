package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class q21 {
    public static android.app.Notification.Builder a(android.content.Context context, java.lang.String str) {
        return new android.app.Notification.Builder(context, str);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    public static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static android.app.Notification.Builder f(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setShortcutId(str);
    }

    public static android.app.Notification.Builder g(android.app.Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }
}
