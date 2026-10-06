package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract /* synthetic */ class o80 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f404a;

    static {
        int[] iArr = new int[com.omarea.model.AppInfo.AppType.values().length];
        try {
            iArr[com.omarea.model.AppInfo.AppType.USER.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.omarea.model.AppInfo.AppType.SYSTEM.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.omarea.model.AppInfo.AppType.BACKUPFILE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        f404a = iArr;
    }
}
