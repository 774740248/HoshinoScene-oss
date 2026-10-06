package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class xl1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f690a = new java.lang.ThreadLocal();

    public static a.jc0 a() {
        java.lang.ThreadLocal threadLocal = f690a;
        a.jc0 jc0Var = (a.jc0) threadLocal.get();
        if (jc0Var != null) {
            return jc0Var;
        }
        a.ur urVar = new a.ur(java.lang.Thread.currentThread());
        threadLocal.set(urVar);
        return urVar;
    }
}
