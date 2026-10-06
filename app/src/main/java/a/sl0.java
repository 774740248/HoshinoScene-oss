package a;

import android.app.Activity;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sl0 implements a.oe {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f529a;
    public final /* synthetic */ a.am0 b;

    public /* synthetic */ sl0(a.am0 am0Var, int i) {
        this.f529a = i;
        this.b = am0Var;
    }

    public final void a(a.ne neVar) {
        int i = this.f529a;
        a.am0 am0Var = this.b;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.xl0 xl0Var = (a.xl0) am0Var.z.pollFirst();
                if (xl0Var == null) {
                    android.util.Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                java.lang.String str = xl0Var.c;
                a.gk0 c = am0Var.c.c(str);
                if (c != null) {
                    c.p(xl0Var.d, neVar.c, neVar.d);
                    return;
                } else {
                    android.util.Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
            default:
                a.xl0 xl0Var2 = (a.xl0) am0Var.z.pollFirst();
                if (xl0Var2 == null) {
                    android.util.Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                java.lang.String str2 = xl0Var2.c;
                a.gk0 c2 = am0Var.c.c(str2);
                if (c2 != null) {
                    c2.p(xl0Var2.d, neVar.c, neVar.d);
                    return;
                } else {
                    android.util.Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
        }
    }

    public final void b(java.lang.Object obj) {
        switch (this.f529a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.ne) obj);
                return;
            case 1:
                java.util.Map map = (java.util.Map) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((java.lang.Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                a.am0 am0Var = this.b;
                a.xl0 xl0Var = (a.xl0) am0Var.z.pollFirst();
                if (xl0Var == null) {
                    android.util.Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                java.lang.String str = xl0Var.c;
                if (am0Var.c.c(str) == null) {
                    android.util.Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                a((a.ne) obj);
                return;
        }
    }

    public final void c(a.gk0 gk0Var, a.ct ctVar) {
        boolean z;
        synchronized (ctVar) {
            z = ctVar.f81a;
        }
        if (z) {
            return;
        }
        a.am0 am0Var = this.b;
        java.util.Map map = am0Var.l;
        java.util.HashSet hashSet = (java.util.HashSet) map.get(gk0Var);
        if (hashSet != null && hashSet.remove(ctVar) && hashSet.isEmpty()) {
            map.remove(gk0Var);
            if (gk0Var.c < 5) {
                gk0Var.F();
                am0Var.n.o(false);
                gk0Var.G = null;
                gk0Var.H = null;
                gk0Var.R = null;
                gk0Var.S.e(null);
                gk0Var.q = false;
                am0Var.F(am0Var.p, gk0Var);
            }
        }
    }

    public final void d(a.gk0 gk0Var, a.ct ctVar) {
        java.util.Map map = this.b.l;
        if (map.get(gk0Var) == null) {
            map.put(gk0Var, new java.util.HashSet());
        }
        ((java.util.HashSet) map.get(gk0Var)).add(ctVar);
    }
}
