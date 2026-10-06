package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class i20 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.f30 f224a;

    static {
        java.lang.String str;
        a.f30 f30Var;
        int i = a.wj1.f665a;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.main.delay");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str == null || !java.lang.Boolean.parseBoolean(str)) {
            f30Var = a.h20.l;
        } else {
            a.u20 u20Var = a.z80.f728a;
            a.hy hyVar = a.by0.f57a;
            a.cr0 cr0Var = ((a.cr0) hyVar).h;
            f30Var = !(hyVar instanceof a.f30) ? a.h20.l : (a.f30) hyVar;
        }
        f224a = f30Var;
    }
}
