package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o extends a.b20 {

    public o() {
    }

    @Override // a.b20
    public void T0(a.p pVar, a.p pVar2) {
        pVar.b = pVar2;
    }

    @Override // a.b20
    public void U0(a.p pVar, java.lang.Thread thread) {
        pVar.f427a = thread;
    }

    @Override // a.b20
    public boolean o(a.q qVar, a.m mVar) {
        a.m mVar2 = a.m.b;
        synchronized (qVar) {
            try {
                if (qVar.b != mVar) {
                    return false;
                }
                qVar.b = mVar2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.b20
    public boolean p(a.q qVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (qVar) {
            try {
                if (qVar.f456a != obj) {
                    return false;
                }
                qVar.f456a = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.b20
    public boolean q(a.q qVar, a.p pVar, a.p pVar2) {
        synchronized (qVar) {
            try {
                if (qVar.c != pVar) {
                    return false;
                }
                qVar.c = pVar2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
    public void U(float p0, float p1, a.gh1 p2) {
        throw new UnsupportedOperationException("Method not decompiled: o.U");
    }
    public void N0(a.ej1 p0) {
        throw new UnsupportedOperationException("Method not decompiled: o.N0");
    }
    public void M0(android.graphics.Typeface p0, boolean p1) {
        throw new UnsupportedOperationException("Method not decompiled: o.M0");
    }
    public void L0(android.graphics.Typeface p0) {
        throw new UnsupportedOperationException("Method not decompiled: o.L0");
    }
    public void K0(int p0) {
        throw new UnsupportedOperationException("Method not decompiled: o.K0");
    }
    public void J0(java.lang.Throwable p0) {
        throw new UnsupportedOperationException("Method not decompiled: o.J0");
    }
}
