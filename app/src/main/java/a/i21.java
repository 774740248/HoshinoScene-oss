package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class i21 {
    public static android.media.AudioAttributes a(android.media.AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static android.media.AudioAttributes.Builder b() {
        return new android.media.AudioAttributes.Builder();
    }

    public static android.media.AudioAttributes.Builder c(android.media.AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    public static android.media.AudioAttributes.Builder d(android.media.AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    public static android.media.AudioAttributes.Builder e(android.media.AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}
