package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vs0 extends a.yb1 {
    public int d;
    public final /* synthetic */ a.fp0 e;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(java.lang.Object obj, a.ey eyVar, a.fp0 fp0Var) {
        super(eyVar);
        this.e = fp0Var;
        this.f = obj;
        a.wv.t(eyVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("This coroutine had already completed".toString());
            }
            this.d = 2;
            a.b20.q1(obj);
            return obj;
        }
        this.d = 1;
        a.b20.q1(obj);
        a.fp0 fp0Var = this.e;
        a.wv.t(fp0Var, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        a.wv.k(fp0Var);
        return fp0Var.g(this.f, this);
    }
}
