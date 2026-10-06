package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class gn0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.ln0 f184a = new a.ln0();
    public static final a.nn0 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.ln0] */
    static {
        a.nn0 nn0Var;
        try {
            nn0Var = (a.nn0) a.qn0.class.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            nn0Var = null;
        }
        b = nn0Var;
    }

    public static void a(a.gk0 gk0Var, a.gk0 gk0Var2, boolean z) {
        if (z) {
            gk0Var2.getClass();
        } else {
            gk0Var.getClass();
        }
    }

    public static void b(java.util.ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((android.view.View) arrayList.get(size)).setVisibility(i);
        }
    }
}
