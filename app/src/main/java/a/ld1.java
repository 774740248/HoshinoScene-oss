package a;

import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.SavedStateHandle;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ld1 extends a.dr1 implements a.cr1 {
    public final android.app.Application c;
    public final a.br1 d;
    public final android.os.Bundle e;
    public final a.gv0 f;
    public final a.id1 g;

    public ld1(android.app.Application application, a.kd1 kd1Var, android.os.Bundle bundle) {
        a.br1 br1Var;
        a.wv.w(kd1Var, "owner");
        this.g = kd1Var.getSavedStateRegistry();
        this.f = kd1Var.getLifecycle();
        this.e = bundle;
        this.c = application;
        if (application != null) {
            if (a.br1.t == null) {
                a.br1.t = new a.br1(application);
            }
            br1Var = a.br1.t;
            a.wv.s(br1Var);
        } else {
            br1Var = new a.br1(null);
        }
        this.d = br1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15, types: [a.gy, java.lang.Object] */
    public final a.zq1 a(java.lang.Class cls, java.lang.String str) {
        java.lang.Object obj;
        android.app.Application application;
        a.gv0 gv0Var = this.f;
        if (gv0Var == null) {
            throw new java.lang.UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.zk.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor a2 = (!isAssignableFrom || this.c == null) ? a.md1.a(cls, a.md1.b) : a.md1.a(cls, a.md1.f345a);
        if (a2 == null) {
            if (this.c != null) {
                return this.d.b(cls);
            }
            if (a.gy.r == null) {
                a.gy.r = (gy) (new java.lang.Object());
            }
            a.gy gyVar = a.gy.r;
            a.wv.s(gyVar);
            return gyVar.b(cls);
        }
        a.id1 id1Var = this.g;
        a.wv.s(id1Var);
        android.os.Bundle bundle = this.e;
        android.os.Bundle a3 = id1Var.a(str);
        java.lang.Class[] clsArr = a.ad1.f;
        a.ad1 g = a.fa0.g(a3, bundle);
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = new androidx.lifecycle.SavedStateHandleController(str, (SavedStateHandle) g);
        savedStateHandleController.attachToLifecycle(gv0Var, id1Var);
        a.fv0 fv0Var = ((androidx.lifecycle.a) gv0Var).d;
        if (fv0Var == a.fv0.d || fv0Var.compareTo(a.fv0.f) >= 0) {
            id1Var.d();
        } else {
            gv0Var.a(new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1(gv0Var, id1Var));
        }
        a.zq1 b = (!isAssignableFrom || (application = this.c) == null) ? a.md1.b(cls, a2, g) : a.md1.b(cls, a2, application, g);
        synchronized (b.f742a) {
            try {
                obj = b.f742a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    b.f742a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            savedStateHandleController = (SavedStateHandleController) (obj);
        }
        if (b.c) {
            a.zq1.a(savedStateHandleController);
        }
        return b;
    }

    @Override // a.cr1
    public final a.zq1 b(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // a.cr1
    public final a.zq1 d(java.lang.Class cls, a.r11 r11Var) {
        a.gy gyVar = a.gy.k;
        java.util.LinkedHashMap linkedHashMap = r11Var.f571a;
        java.lang.String str = (java.lang.String) linkedHashMap.get(gyVar);
        if (str == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(a.wv.C) == null || linkedHashMap.get(a.wv.D) == null) {
            if (this.f != null) {
                return a(cls, str);
            }
            throw new java.lang.IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        android.app.Application application = (android.app.Application) linkedHashMap.get(a.gy.j);
        boolean isAssignableFrom = a.zk.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor a2 = (!isAssignableFrom || application == null) ? a.md1.a(cls, a.md1.b) : a.md1.a(cls, a.md1.f345a);
        return a2 == null ? this.d.d(cls, r11Var) : (!isAssignableFrom || application == null) ? a.md1.b(cls, a2, a.wv.N(r11Var)) : a.md1.b(cls, a2, application, a.wv.N(r11Var));
    }
}
