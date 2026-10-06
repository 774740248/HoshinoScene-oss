package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class yr1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.ds1 f718a;
    public static final a.ot b;

    /* JADX WARN: Type inference failed for: r0v1, types: [a.ds1, a.fs1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.ds1, a.fs1] */
    static {
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            f718a = (ds1) new a.fs1(i);
        } else {
            f718a = (ds1) new a.fs1(i);
        }
        b = new a.ot(java.lang.Float.class, "translationAlpha", 5);
        new a.ot(android.graphics.Rect.class, "clipBounds", 6);
    }

    public static void a(android.view.View view, int i, int i2, int i3, int i4) {
        f718a.e0(view, i, i2, i3, i4);
    }
}
