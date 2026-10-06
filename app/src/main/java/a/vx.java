package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class vx {
    public static void a(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    public static void b(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
