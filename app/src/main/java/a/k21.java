package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class k21 {
    public static android.app.Notification a(android.app.Notification.Builder builder) {
        return builder.build();
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i) {
        return builder.setPriority(i);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, boolean z) {
        return builder.setUsesChronometer(z);
    }
}
