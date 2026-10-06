package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ev {
    public static final a.ev c = new a.ev();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f138a = new java.util.HashMap();
    public final java.util.HashMap b = new java.util.HashMap();

    public static void b(java.util.HashMap hashMap, a.dv dvVar, a.ev0 ev0Var, java.lang.Class cls) {
        a.ev0 ev0Var2 = (a.ev0) hashMap.get(dvVar);
        if (ev0Var2 == null || ev0Var == ev0Var2) {
            if (ev0Var2 == null) {
                hashMap.put(dvVar, ev0Var);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + dvVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ev0Var2 + ", new value " + ev0Var);
    }

    public final a.cv a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = this.f138a;
        if (superclass != null) {
            a.cv cvVar = (a.cv) hashMap2.get(superclass);
            if (cvVar == null) {
                cvVar = a(superclass, null);
            }
            hashMap.putAll(cvVar.b);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            a.cv cvVar2 = (a.cv) hashMap2.get(cls2);
            if (cvVar2 == null) {
                cvVar2 = a(cls2, null);
            }
            for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) cvVar2.b.entrySet()) {
                b(hashMap, (a.dv) entry.getKey(), (a.ev0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (java.lang.NoClassDefFoundError e) {
                throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (java.lang.reflect.Method method : methodArr) {
            a.h31 h31Var = (a.h31) method.getAnnotation(a.h31.class);
            if (h31Var != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!a.mv0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                a.ev0 value = h31Var.value();
                if (parameterTypes.length > 1) {
                    if (!a.ev0.class.isAssignableFrom(parameterTypes[1])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != a.ev0.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new a.dv(i, method), value, cls);
                z = true;
            }
        }
        a.cv cvVar3 = new a.cv(hashMap);
        hashMap2.put(cls, cvVar3);
        this.b.put(cls, java.lang.Boolean.valueOf(z));
        return cvVar3;
    }
}
