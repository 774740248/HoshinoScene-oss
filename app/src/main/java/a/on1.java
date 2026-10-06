package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class on1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.yp f414a;
    public static final java.lang.ThreadLocal b;
    public static final java.util.ArrayList c;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.yp, a.qn1] */
    static {
        a.yp qn1Var = (yp) new a.qn1();
        qn1Var.A = false;
        qn1Var.H(new a.dd0(2));
        qn1Var.H(new a.ln1());
        qn1Var.H(new a.dd0(1));
        f414a = qn1Var;
        b = new java.lang.ThreadLocal();
        c = new java.util.ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewTreeObserver.OnPreDrawListener, a.nn1, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(android.view.ViewGroup viewGroup, a.ln1 ln1Var) {
        java.util.ArrayList arrayList = c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        java.util.WeakHashMap weakHashMap = a.jq1.f264a;
        if (a.up1.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (ln1Var == null) {
                ln1Var = f414a;
            }
            a.ln1 clone = ln1Var.clone();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) b().getOrDefault(viewGroup, null);
            if (arrayList2 != null && arrayList2.size() > 0) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((a.ln1) it.next()).u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            a.ai1.t(viewGroup.getTag(2131363308));
            viewGroup.setTag(2131363308, null);
            if (clone != null) {
                nn1 obj = new nn1();
                obj.c = clone;
                obj.d = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a.rh1, java.lang.Object, a.kp] */
    public static a.kp b() {
        a.kp kpVar;
        java.lang.ThreadLocal threadLocal = b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) threadLocal.get();
        if (weakReference != null && (kpVar = (a.kp) weakReference.get()) != null) {
            return kpVar;
        }
        a.rh1 rh1Var = new a.rh1();
        threadLocal.set(new java.lang.ref.WeakReference(rh1Var));
        return rh1Var;
    }
}
