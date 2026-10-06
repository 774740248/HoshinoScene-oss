package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ko1 extends a.xy {
    public static final /* synthetic */ int e = 0;

    static {
        new a.ko1();
    }

    @Override // a.xy
    public final void h(a.ty tyVar, java.lang.Runnable runnable) {
        a.ii1.g(tyVar.g(a.wu1.d));
        throw new java.lang.UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // a.xy
    public final java.lang.String toString() {
        return "Dispatchers.Unconfined";
    }
}
