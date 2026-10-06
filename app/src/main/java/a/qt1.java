package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qt1 extends a.ut1 {
    public static java.lang.reflect.Field e;
    public static boolean f;
    public static java.lang.reflect.Constructor g;
    public static boolean h;
    public android.view.WindowInsets c;
    public a.ns0 d;

    public qt1() {
        this.c = i();
    }

    private static android.view.WindowInsets i() {
        if (!f) {
            try {
                e = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (java.lang.ReflectiveOperationException e2) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f = true;
        }
        java.lang.reflect.Field field = e;
        if (field != null) {
            try {
                android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new android.view.WindowInsets(windowInsets);
                }
            } catch (java.lang.ReflectiveOperationException e3) {
                android.util.Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!h) {
            try {
                g = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
            } catch (java.lang.ReflectiveOperationException e4) {
                android.util.Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        java.lang.reflect.Constructor constructor = g;
        if (constructor != null) {
            try {
                return (android.view.WindowInsets) constructor.newInstance(new android.graphics.Rect());
            } catch (java.lang.ReflectiveOperationException e5) {
                android.util.Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // a.ut1
    public a.du1 b() {
        a();
        a.du1 h2 = a.du1.h(null, this.c);
        a.ns0[] ns0VarArr = this.b;
        a.au1 au1Var = h2.f107a;
        au1Var.o(ns0VarArr);
        au1Var.q(this.d);
        return h2;
    }

    @Override // a.ut1
    public void e(a.ns0 ns0Var) {
        this.d = ns0Var;
    }

    @Override // a.ut1
    public void g(a.ns0 ns0Var) {
        android.view.WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(ns0Var.f391a, ns0Var.b, ns0Var.c, ns0Var.d);
        }
    }

    public qt1(a.du1 du1Var) {
        super(du1Var);
        this.c = du1Var.g();
    }
}
