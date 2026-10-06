package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class hv0 extends a.lj1 implements a.fp0 {
    public /* synthetic */ java.lang.Object g;
    public final /* synthetic */ androidx.lifecycle.LifecycleCoroutineScopeImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, a.ey eyVar) {
        super(2, eyVar);
        this.h = lifecycleCoroutineScopeImpl;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.hv0 hv0Var = new a.hv0(this.h, eyVar);
        hv0Var.g = obj;
        return hv0Var;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.cz czVar = (a.cz) this.g;
        androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.h;
        if (((androidx.lifecycle.a) lifecycleCoroutineScopeImpl.c).d.compareTo(a.fv0.d) >= 0) {
            lifecycleCoroutineScopeImpl.c.a(lifecycleCoroutineScopeImpl);
        } else {
            a.wv.o(czVar.b(), null);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.hv0 hv0Var = (a.hv0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        hv0Var.e(no1Var);
        return no1Var;
    }
}
