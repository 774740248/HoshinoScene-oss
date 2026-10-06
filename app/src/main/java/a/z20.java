package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class z20 extends a.hm {
    public final java.lang.Object c;
    public final boolean d;
    public final java.lang.Object e;

    public z20(a.hi1 hi1Var, a.ct ctVar, boolean z, boolean z2) {
        super(hi1Var, ctVar);
        java.lang.Object obj;
        java.lang.Object obj2;
        int i = hi1Var.f206a;
        a.gk0 gk0Var = hi1Var.c;
        if (i == 2) {
            if (z) {
                obj2 = gk0Var.i();
            } else {
                gk0Var.getClass();
                obj2 = null;
            }
            this.c = obj2;
            if (z) {
                gk0Var.getClass();
            } else {
                gk0Var.getClass();
            }
            this.d = true;
        } else {
            if (z) {
                obj = gk0Var.k();
            } else {
                gk0Var.getClass();
                obj = null;
            }
            this.c = obj;
            this.d = true;
        }
        if (!z2) {
            this.e = null;
        } else if (z) {
            this.e = gk0Var.l();
        } else {
            gk0Var.getClass();
            this.e = null;
        }
    }

    public final a.nn0 h(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        a.ln0 ln0Var = a.gn0.f184a;
        if (obj instanceof android.transition.Transition) {
            return ln0Var;
        }
        a.nn0 nn0Var = a.gn0.b;
        if (nn0Var != null && nn0Var.e(obj)) {
            return nn0Var;
        }
        throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + ((a.hi1) this.f211a).c + " is not a valid framework Transition or AndroidX Transition");
    }
    public void f() {
        throw new UnsupportedOperationException("Method not decompiled: z20.f");
    }
    public int d() {
        throw new UnsupportedOperationException("Method not decompiled: z20.d");
    }
    public android.content.IntentFilter c() {
        throw new UnsupportedOperationException("Method not decompiled: z20.c");
    }
}
