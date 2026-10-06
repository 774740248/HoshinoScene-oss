package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ep1 {
    public static final a.vj1 b = new a.vj1(a.od1.g);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f131a;

    public ep1(android.content.Context context) {
        a.wv.w(context, "context");
        this.f131a = context;
    }

    public final boolean a() {
        android.content.Context context = this.f131a;
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            a.wv.v(applicationInfo, "context.packageManager.g…T_META_DATA\n            )");
            a.wv.s(applicationInfo.metaData);
            return !this.a.getBoolean("free_version");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
