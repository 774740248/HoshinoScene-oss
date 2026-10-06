package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract /* synthetic */ class t20 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f546a;

    static {
        int[] iArr = new int[a.ev0.values().length];
        try {
            iArr[a.ev0.ON_CREATE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[a.ev0.ON_START.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ev0.ON_RESUME.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[a.ev0.ON_PAUSE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[a.ev0.ON_STOP.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[a.ev0.ON_DESTROY.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[a.ev0.ON_ANY.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        f546a = iArr;
    }
}
