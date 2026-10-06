package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hi1 {

    /* renamed from: a, reason: collision with root package name */
    public int f206a;
    public int b;
    public final a.gk0 c;
    public final java.util.ArrayList d;
    public final java.util.HashSet e;
    public boolean f;
    public boolean g;
    public final androidx.fragment.app.a h;

    public hi1(int i, int i2, androidx.fragment.app.a aVar, a.ct ctVar) {
        a.gk0 gk0Var = aVar.c;
        this.d = new java.util.ArrayList();
        this.e = new java.util.HashSet();
        this.f = false;
        this.g = false;
        this.f206a = i;
        this.b = i2;
        this.c = gk0Var;
        ctVar.b(new a.w1(2, this));
        this.h = aVar;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        java.util.HashSet hashSet = this.e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((a.ct) it.next()).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (android.util.Log.isLoggable("FragmentManager", 2)) {
                android.util.Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            java.util.Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        a.gk0 gk0Var = this.c;
        if (i3 == 0) {
            if (this.f206a != 1) {
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + gk0Var + " mFinalState = " + a.ii1.h(this.f206a) + " -> " + a.ii1.h(i) + ". ");
                }
                this.f206a = i;
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (this.f206a == 1) {
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + gk0Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a.ai1.D(this.b) + " to ADDING.");
                }
                this.f206a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (i3 != 2) {
            return;
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + gk0Var + " mFinalState = " + a.ii1.h(this.f206a) + " -> REMOVED. mLifecycleImpact  = " + a.ai1.D(this.b) + " to REMOVING.");
        }
        this.f206a = 1;
        this.b = 3;
    }

    public final void d() {
        if (this.b == 2) {
            androidx.fragment.app.a aVar = this.h;
            a.gk0 gk0Var = aVar.c;
            android.view.View findFocus = gk0Var.H.findFocus();
            if (findFocus != null) {
                gk0Var.c().o = findFocus;
                if (android.util.Log.isLoggable("FragmentManager", 2)) {
                    android.util.Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + gk0Var);
                }
            }
            android.view.View M = this.c.M();
            if (M.getParent() == null) {
                aVar.b();
                M.setAlpha(0.0f);
            }
            if (M.getAlpha() == 0.0f && M.getVisibility() == 0) {
                M.setVisibility(4);
            }
            a.ek0 ek0Var = gk0Var.K;
            M.setAlpha(ek0Var == null ? 1.0f : ek0Var.n);
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final java.lang.String toString() {
        return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {mFinalState = " + a.ii1.h(this.f206a) + "} {mLifecycleImpact = " + a.ai1.D(this.b) + "} {mFragment = " + this.c + "}";
    }
}
