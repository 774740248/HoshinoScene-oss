package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class eo1 extends a.vu0 {
    public static java.lang.Class e;
    public static java.lang.reflect.Constructor f;
    public static java.lang.reflect.Method g;
    public static java.lang.reflect.Method h;
    public static boolean i;

    public static boolean E(java.lang.Object obj, java.lang.String str, int i2, boolean z) {
        F();
        try {
            return ((java.lang.Boolean) g.invoke(obj, str, java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z))).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static void F() {
        java.lang.Class<?> cls;
        java.lang.reflect.Method method;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method method2;
        if (i) {
            return;
        }
        i = true;
        try {
            cls = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new java.lang.Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", java.lang.String.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
            method = android.graphics.Typeface.class.getMethod("createFromFamiliesWithDefault", java.lang.reflect.Array.newInstance(cls, 1).getClass());
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e2) {
            android.util.Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f = constructor;
        e = cls;
        g = method2;
        h = method;
    }

    @Override // a.vu0
    public android.graphics.Typeface v(android.content.Context context, a.zi0 zi0Var, android.content.res.Resources resources, int i2) {
        F();
        try {
            java.lang.Object newInstance = f.newInstance(new java.lang.Object[0]);
            for (a.aj0 aj0Var : zi0Var.f737a) {
                java.io.File t0 = a.wv.t0(context);
                if (t0 == null) {
                    return null;
                }
                try {
                    if (!a.wv.G(t0, resources, aj0Var.f)) {
                        return null;
                    }
                    if (!E(newInstance, t0.getPath(), aj0Var.b, aj0Var.c)) {
                        return null;
                    }
                    t0.delete();
                } catch (java.lang.RuntimeException unused) {
                    return null;
                } finally {
                    t0.delete();
                }
            }
            F();
            try {
                java.lang.Object newInstance2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) e, 1);
                java.lang.reflect.Array.set(newInstance2, 0, newInstance);
                return (android.graphics.Typeface) h.invoke(null, newInstance2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                throw new java.lang.RuntimeException(e2);
            }
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
