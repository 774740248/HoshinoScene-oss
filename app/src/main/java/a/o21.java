package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class o21 {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.addPerson(str);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setCategory(str);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, android.app.Notification notification) {
        return builder.setPublicVersion(notification);
    }

    public static android.app.Notification.Builder e(android.app.Notification.Builder builder, android.net.Uri uri, java.lang.Object obj) {
        return builder.setSound(uri, (android.media.AudioAttributes) obj);
    }

    public static android.app.Notification.Builder f(android.app.Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }
}
