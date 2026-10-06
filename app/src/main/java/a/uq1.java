package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class uq1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f604a = true;
    public static final /* synthetic */ int b = 0;

    public static void a(android.view.ViewGroup viewGroup, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f604a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (java.lang.NoSuchMethodError unused) {
                f604a = false;
            }
        }
    }
}
