package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ws0 extends a.fy {
    public int f;
    public final /* synthetic */ a.fp0 g;
    public final /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(a.ey eyVar, a.ty tyVar, a.fp0 fp0Var, java.lang.Object obj) {
        super(eyVar, tyVar);
        this.g = fp0Var;
        this.h = obj;
        a.wv.t(eyVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.f = 2;
            a.b20.q1(obj);
            return obj;
        }
        this.f = 1;
        a.b20.q1(obj);
        a.fp0 fp0Var = this.g;
        a.wv.t(fp0Var, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        a.wv.k(fp0Var);
        return fp0Var.g(this.h, this);
    }
}
