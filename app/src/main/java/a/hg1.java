package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hg1 {

    public hg1() {
    }


    /* renamed from: a, reason: collision with root package name */
    public java.lang.reflect.Method f203a;
    public java.lang.reflect.Method b;
    public java.lang.reflect.Method c;

    public hg1(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
        this.f203a = method;
        this.b = method2;
        this.c = method3;
    }

    public static void a() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
