package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class va0 extends a.b20 {
    public final /* synthetic */ a.b20 E;
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor F;

    public va0(a.b20 b20Var, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        this.E = b20Var;
        this.F = threadPoolExecutor;
    }

    @Override // a.b20
    public final void J0(java.lang.Throwable th) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.F;
        try {
            this.E.J0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.b20
    public final void N0(a.ej1 ej1Var) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.F;
        try {
            this.E.N0(ej1Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: va0.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: va0.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: va0.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: va0.U0");
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: va0.U");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: va0.T0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: va0.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: va0.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: va0.K0");
    }
}
