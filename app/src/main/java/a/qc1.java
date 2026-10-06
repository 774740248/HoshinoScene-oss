package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qc1 extends a.b20 {

    public qc1() {
    }

    @Override // a.b20
    public final void U(float f, float f2, a.gh1 gh1Var) {
        gh1Var.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        a.ch1 ch1Var = new a.ch1(0.0f, 0.0f, f3, f3);
        ch1Var.f = 180.0f;
        ch1Var.g = 90.0f;
        gh1Var.g.add(ch1Var);
        a.ah1 ah1Var = new a.ah1(ch1Var);
        gh1Var.a(180.0f);
        gh1Var.h.add(ah1Var);
        gh1Var.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        gh1Var.c = (((float) java.lang.Math.cos(java.lang.Math.toRadians(d))) * f5) + f4;
        gh1Var.d = (f5 * ((float) java.lang.Math.sin(java.lang.Math.toRadians(d)))) + f4;
    }
    public boolean q(a.q p0, a.p p1, a.p p2) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.q");
    }
    public boolean p(a.q p0, java.lang.Object p1, java.lang.Object p2) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.p");
    }
    public boolean o(a.q p0, a.m p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.o");
    }
    public void U0(a.p p0, java.lang.Thread p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.U0");
    }
    public void T0(a.p p0, a.p p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.T0");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.K0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: qc1.J0");
    }
}
