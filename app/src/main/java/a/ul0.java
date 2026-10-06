package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ul0 {
    public static final a.rh1 b = new a.rh1();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.am0 f601a;

    public ul0(a.am0 am0Var) {
        this.f601a = am0Var;
    }

    public static java.lang.Class b(java.lang.ClassLoader classLoader, java.lang.String str) {
        a.rh1 rh1Var = b;
        a.rh1 rh1Var2 = (a.rh1) rh1Var.getOrDefault(classLoader, null);
        if (rh1Var2 == null) {
            rh1Var2 = new a.rh1();
            rh1Var.put(classLoader, rh1Var2);
        }
        java.lang.Class cls = (java.lang.Class) rh1Var2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        rh1Var2.put(str, cls2);
        return cls2;
    }

    public static java.lang.Class c(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return b(classLoader, str);
        } catch (java.lang.ClassCastException e) {
            throw new java.lang.RuntimeException(a.ai1.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (java.lang.ClassNotFoundException e2) {
            throw new java.lang.RuntimeException(a.ai1.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final a.gk0 a(java.lang.String str) {
        android.content.Context context = this.f601a.q.X;
        java.lang.Object obj = a.gk0.V;
        try {
            return (a.gk0) c(context.getClassLoader(), str).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(a.ai1.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(a.ai1.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException(a.ai1.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException(a.ai1.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
