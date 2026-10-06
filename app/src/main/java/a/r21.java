package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class r21 {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.app.Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static android.app.Notification.Action.Builder c(android.app.Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, java.lang.Object obj) {
        return builder.setLocusId((android.content.LocusId) obj);
    }
}
