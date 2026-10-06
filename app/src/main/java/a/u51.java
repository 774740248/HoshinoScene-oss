package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class u51 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f577a;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
        a.wv.v(methods, "throwableMethods");
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            java.lang.reflect.Method method2 = methods[i];
            if (a.wv.e(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                a.wv.v(parameterTypes, "it.parameterTypes");
                if (a.wv.e(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f577a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !a.wv.e(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
