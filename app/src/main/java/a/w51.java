package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class w51 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.v51 f652a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.v51 v51Var;
        try {
            java.lang.Object newInstance = a.it0.class.newInstance();
            a.wv.v(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    v51Var = (a.v51) newInstance;
                } catch (java.lang.ClassCastException e) {
                    java.lang.ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    java.lang.ClassLoader classLoader2 = a.v51.class.getClassLoader();
                    if (a.wv.e(classLoader, classLoader2)) {
                        throw e;
                    }
                    throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                java.lang.Object newInstance2 = a.gt0.class.newInstance();
                a.wv.v(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        v51Var = (a.v51) newInstance2;
                    } catch (java.lang.ClassNotFoundException unused2) {
                        v51Var = (v51) (new java.lang.Object());
                    }
                } catch (java.lang.ClassCastException e2) {
                    java.lang.ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    java.lang.ClassLoader classLoader4 = a.v51.class.getClassLoader();
                    if (a.wv.e(classLoader3, classLoader4)) {
                        throw e2;
                    }
                    throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
            }
        } catch (java.lang.ClassNotFoundException unused3) {
            java.lang.Object newInstance3 = java.lang.Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            a.wv.v(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    v51Var = (a.v51) newInstance3;
                } catch (java.lang.ClassNotFoundException unused4) {
                    java.lang.Object newInstance4 = java.lang.Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    a.wv.v(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        v51Var = (a.v51) newInstance4;
                    } catch (java.lang.ClassCastException e3) {
                        java.lang.ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        java.lang.ClassLoader classLoader6 = a.v51.class.getClassLoader();
                        if (a.wv.e(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                }
            } catch (java.lang.ClassCastException e4) {
                java.lang.ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                java.lang.ClassLoader classLoader8 = a.v51.class.getClassLoader();
                if (a.wv.e(classLoader7, classLoader8)) {
                    throw e4;
                }
                throw new java.lang.ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
            }
        }
        f652a = v51Var;
    }
}
