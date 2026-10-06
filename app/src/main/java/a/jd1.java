package a;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistryOwner;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jd1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.kd1 f252a;
    public final a.id1 b = new a.id1();
    public boolean c;

    public jd1(a.kd1 kd1Var) {
        this.f252a = kd1Var;
    }

    public final void a() {
        a.kd1 kd1Var = this.f252a;
        a.gv0 lifecycle = kd1Var.getLifecycle();
        if (((androidx.lifecycle.a) lifecycle).d != a.fv0.d) {
            throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a((lv0) new androidx.savedstate.Recreator((SavedStateRegistryOwner) kd1Var));
        final a.id1 id1Var = this.b;
        id1Var.getClass();
        if (!(!id1Var.b)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new a.fd1());
        id1Var.b = true;
        this.c = true;
    }

    public final void b(android.os.Bundle bundle) {
        if (!this.c) {
            a();
        }
        androidx.lifecycle.a aVar = (androidx.lifecycle.a) this.f252a.getLifecycle();
        if (!(!(aVar.d.compareTo(a.fv0.f) >= 0))) {
            throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + aVar.d).toString());
        }
        a.id1 id1Var = this.b;
        if (!id1Var.b) {
            throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!id1Var.d)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        id1Var.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        id1Var.d = true;
    }

    public final void c(android.os.Bundle bundle) {
        a.wv.w(bundle, "outBundle");
        a.id1 id1Var = this.b;
        id1Var.getClass();
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.os.Bundle bundle3 = id1Var.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.yc1 yc1Var = id1Var.f228a;
        yc1Var.getClass();
        a.vc1 vc1Var = new a.vc1(yc1Var);
        yc1Var.e.put(vc1Var, java.lang.Boolean.FALSE);
        while (vc1Var.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) vc1Var.next();
            bundle2.putBundle((java.lang.String) entry.getKey(), ((a.hd1) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
