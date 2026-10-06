package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class tr1 extends a.oq1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f563a;
    public boolean b;
    public int c;
    public final /* synthetic */ java.lang.Object d;

    public tr1(a.ur1 ur1Var) {
        this.f563a = 0;
        this.d = ur1Var;
        this.b = false;
        this.c = 0;
    }

    @Override // a.vr1
    public final void a() {
        int i = this.f563a;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                int i2 = this.c + 1;
                this.c = i2;
                a.ur1 ur1Var = (a.ur1) obj;
                if (i2 == ur1Var.f605a.size()) {
                    a.vr1 vr1Var = ur1Var.d;
                    if (vr1Var != null) {
                        vr1Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    ur1Var.e = false;
                    return;
                }
                return;
            default:
                if (this.b) {
                    return;
                }
                ((a.bn1) obj).f47a.setVisibility(this.c);
                return;
        }
    }

    @Override // a.oq1, a.vr1
    public final void b(android.view.View view) {
        switch (this.f563a) {
            case 1:
                this.b = true;
                return;
            default:
                return;
        }
    }

    @Override // a.oq1, a.vr1
    public final void c() {
        int i = this.f563a;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (this.b) {
                    return;
                }
                this.b = true;
                a.vr1 vr1Var = ((a.ur1) obj).d;
                if (vr1Var != null) {
                    vr1Var.c();
                    return;
                }
                return;
            default:
                ((a.bn1) obj).f47a.setVisibility(0);
                return;
        }
    }

    public tr1(a.bn1 bn1Var, int i) {
        this.f563a = 1;
        this.d = bn1Var;
        this.c = i;
        this.b = false;
    }
    public boolean n(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: tr1.n");
    }
    public void m(android.view.View p0, float p1, float p2) {
        throw new UnsupportedOperationException("Method not decompiled: tr1.m");
    }
    public void l(android.view.View p0, int p1, int p2) {
        throw new UnsupportedOperationException("Method not decompiled: tr1.l");
    }
    public void k(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: tr1.k");
    }
    public int e(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: tr1.e");
    }
    public int d(android.view.View p0, int p1) {
        throw new UnsupportedOperationException("Method not decompiled: tr1.d");
    }
}
