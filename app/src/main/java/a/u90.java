package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class u90 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f584a;
    public static final java.lang.reflect.Method b;
    public static final java.lang.reflect.Method c;
    public static final boolean d;

    static {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.Class cls2 = java.lang.Float.TYPE;
            java.lang.reflect.Method declaredMethod = android.widget.AbsListView.class.getDeclaredMethod("positionSelector", cls, android.view.View.class, java.lang.Boolean.TYPE, cls2, cls2);
            f584a = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = android.widget.AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            java.lang.reflect.Method declaredMethod3 = android.widget.AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (java.lang.NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
