package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class by0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.zx0 f57a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.tw] */
    static {
        java.lang.String str;
        java.lang.Object next;
        int i = a.wj1.f665a;
        a.zx0 zx0Var = null;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null) {
            java.lang.Boolean.parseBoolean(str);
        }
        java.util.Iterator x = a.ai1.x();
        a.wv.w(x, "<this>");
        a.rq1 rq1Var = new a.rq1(4, x);
        if (!((tw) rq1Var instanceof a.tw)) {
            rq1Var = (rq1) new a.tw(rq1Var);
        }
        java.util.List b2 = a.sg1.b2(rq1Var);
        java.util.Iterator it = b2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int a2 = ((a.ay0) next).a();
                do {
                    a.tw next2 = (tw) it.next();
                    int a3 = ((a.ay0) next2).a();
                    if (a2 < a3) {
                        next = next2;
                        a2 = a3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        a.ay0 ay0Var = (a.ay0) next;
        if (ay0Var != null) {
            try {
                zx0Var = ay0Var.c(b2);
            } catch (java.lang.Throwable unused2) {
                ay0Var.b();
            }
            if (zx0Var != null) {
                f57a = zx0Var;
            }
        }
        throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
