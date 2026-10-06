package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class br1 extends a.gy {
    public static a.br1 t;
    public final android.app.Application s;

    public br1(android.app.Application application) {
        this.s = application;
    }

    public final a.zq1 Z(java.lang.Class cls, android.app.Application application) {
        if (!a.zk.class.isAssignableFrom(cls)) {
            return super.b(cls);
        }
        try {
            a.zq1 zq1Var = (a.zq1) cls.getConstructor(android.app.Application.class).newInstance(application);
            a.wv.v(zq1Var, "{\n                try {\n…          }\n            }");
            return zq1Var;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // a.gy, a.cr1
    public final a.zq1 b(java.lang.Class cls) {
        android.app.Application application = this.s;
        if (application != null) {
            return Z(cls, application);
        }
        throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // a.cr1
    public final a.zq1 d(java.lang.Class cls, a.r11 r11Var) {
        if (this.s != null) {
            return b(cls);
        }
        android.app.Application application = (android.app.Application) r11Var.f571a.get(a.gy.j);
        if (application != null) {
            return Z(cls, application);
        }
        if (a.zk.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.b(cls);
    }
}
