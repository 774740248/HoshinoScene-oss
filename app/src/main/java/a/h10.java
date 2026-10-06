package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class h10 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.oo1 g;
    public final /* synthetic */ byte[] h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(a.oo1 oo1Var, byte[] bArr, a.ey eyVar) {
        super(2, eyVar);
        this.g = oo1Var;
        this.h = bArr;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.h10(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.lang.Object obj2 = a.q10.i;
        a.oo1 oo1Var = this.g;
        byte[] bArr = this.h;
        synchronized (obj2) {
            oo1Var.getClass();
            a.wv.w(bArr, "content");
            java.io.DataOutputStream dataOutputStream = oo1Var.b;
            if (dataOutputStream == null) {
                a.wv.M1("out");
                throw null;
            }
            try {
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
            } catch (java.lang.Exception unused) {
                dataOutputStream.close();
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.h10 h10Var = (a.h10) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        h10Var.e(no1Var);
        return no1Var;
    }
}
