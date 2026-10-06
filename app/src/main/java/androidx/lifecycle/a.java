package androidx.lifecycle;
import a.ai1;
import a.cv0;
import a.ep;
import a.ev0;
import a.fq0;
import a.fv0;
import a.gv0;
import a.id0;
import a.kv0;
import a.lv0;
import a.mv0;
import a.nv0;
import a.ov0;
import a.s20;
import a.uc1;
import a.wv;
import java.util.List;


/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class a extends gv0 {
    public final boolean b;
    public id0 c;
    public fv0 d;
    public final java.lang.ref.WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final java.util.ArrayList i;

    public a(mv0 mv0Var) {
        wv.w(mv0Var, "provider");
        this.f193a = new java.util.concurrent.atomic.AtomicReference();
        this.b = true;
        this.c = new id0();
        this.d = fv0.d;
        this.i = new java.util.ArrayList();
        this.e = new java.lang.ref.WeakReference(mv0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [nv0, java.lang.Object] */
    @Override // gv0
    public final void a(lv0 lv0Var) {
        kv0 reflectiveGenericLifecycleObserver;
        mv0 mv0Var;
        wv.w(lv0Var, "observer");
        d("addObserver");
        fv0 fv0Var = this.d;
        fv0 fv0Var2 = fv0.c;
        if (fv0Var != fv0Var2) {
            fv0Var2 = fv0.d;
        }
        nv0 obj = new nv0();
        java.util.HashMap hashMap = ov0.f424a;
        boolean z = lv0Var instanceof kv0;
        boolean z2 = lv0Var instanceof s20;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new androidx.lifecycle.DefaultLifecycleObserverAdapter((s20) lv0Var, (kv0) lv0Var);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new androidx.lifecycle.DefaultLifecycleObserverAdapter((s20) lv0Var, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (kv0) lv0Var;
        } else {
            java.lang.Class<?> cls = lv0Var.getClass();
            if (ov0.b(cls) == 2) {
                nv0 obj2 = (nv0) ov0.b.get(cls);
                wv.s(obj2);
                java.util.List list = (java.util.List) (List) obj2;
                if (list.size() == 1) {
                    ov0.a((java.lang.reflect.Constructor) list.get(0), lv0Var);
                    throw null;
                }
                int size = list.size();
                fq0[] fq0VarArr = new fq0[size];
                if (size > 0) {
                    ov0.a((java.lang.reflect.Constructor) list.get(0), lv0Var);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new androidx.lifecycle.CompositeGeneratedAdaptersObserver(fq0VarArr);
            } else {
                reflectiveGenericLifecycleObserver = new androidx.lifecycle.ReflectiveGenericLifecycleObserver(lv0Var);
            }
        }
        obj.b = reflectiveGenericLifecycleObserver;
        obj.f398a = fv0Var2;
        if (((nv0) this.c.c(lv0Var, obj)) == null && (mv0Var = (mv0) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            fv0 c = c(lv0Var);
            this.f++;
            while (obj.f398a.compareTo(c) < 0 && this.c.g.containsKey(lv0Var)) {
                this.i.add(obj.f398a);
                cv0 cv0Var = ev0.Companion;
                fv0 fv0Var3 = obj.f398a;
                cv0Var.getClass();
                ev0 b = cv0.b(fv0Var3);
                if (b == null) {
                    throw new java.lang.IllegalStateException("no event up from " + obj.f398a);
                }
                obj.a(mv0Var, b);
                java.util.ArrayList arrayList = this.i;
                arrayList.remove(arrayList.size() - 1);
                c = c(lv0Var);
            }
            if (!z3) {
                h();
            }
            this.f--;
        }
    }

    @Override // gv0
    public final void b(lv0 lv0Var) {
        wv.w(lv0Var, "observer");
        d("removeObserver");
        this.c.b(lv0Var);
    }

    public final fv0 c(lv0 lv0Var) {
        nv0 nv0Var;
        java.util.HashMap hashMap = this.c.g;
        uc1 uc1Var = hashMap.containsKey(lv0Var) ? ((uc1) hashMap.get(lv0Var)).f : null;
        fv0 fv0Var = (uc1Var == null || (nv0Var = (nv0) uc1Var.d) == null) ? null : nv0Var.f398a;
        java.util.ArrayList arrayList = this.i;
        fv0 fv0Var2 = arrayList.isEmpty() ^ true ? (fv0) arrayList.get(arrayList.size() - 1) : null;
        fv0 fv0Var3 = this.d;
        wv.w(fv0Var3, "state1");
        if (fv0Var == null || fv0Var.compareTo(fv0Var3) >= 0) {
            fv0Var = fv0Var3;
        }
        return (fv0Var2 == null || fv0Var2.compareTo(fv0Var) >= 0) ? fv0Var : fv0Var2;
    }

    public final void d(java.lang.String str) {
        if (this.b && !ep.I1().E.I1()) {
            throw new java.lang.IllegalStateException(ai1.h("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(ev0 ev0Var) {
        wv.w(ev0Var, "event");
        d("handleLifecycleEvent");
        f(ev0Var.a());
    }

    public final void f(fv0 fv0Var) {
        fv0 fv0Var2 = this.d;
        if (fv0Var2 == fv0Var) {
            return;
        }
        fv0 fv0Var3 = fv0.d;
        fv0 fv0Var4 = fv0.c;
        if (fv0Var2 == fv0Var3 && fv0Var == fv0Var4) {
            throw new java.lang.IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = fv0Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.d == fv0Var4) {
            this.c = new id0();
        }
    }

    public final void g() {
        fv0 fv0Var = fv0.e;
        d("setCurrentState");
        f(fv0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r8.h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.a.h():void");
    }
}
