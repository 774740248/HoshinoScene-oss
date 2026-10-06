package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class md1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f345a = a.b20.z0(android.app.Application.class, a.ad1.class);
    public static final java.util.List b = a.b20.y0(a.ad1.class);

    public static final java.lang.reflect.Constructor a(java.lang.Class cls, java.util.List list) {
        a.wv.w(list, "signature");
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        a.wv.v(constructors, "modelClass.constructors");
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            a.wv.v(parameterTypes, "constructor.parameterTypes");
            java.util.List W1 = a.op.W1(parameterTypes);
            if (a.wv.e(list, W1)) {
                return constructor;
            }
            if (list.size() == W1.size() && W1.containsAll(list)) {
                throw new java.lang.UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final a.zq1 b(java.lang.Class cls, java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        try {
            return (a.zq1) constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Failed to access " + cls, e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
