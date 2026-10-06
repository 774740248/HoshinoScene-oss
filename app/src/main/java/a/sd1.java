package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sd1 extends a.lj1 implements a.fp0 {
    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.lj1(2, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        a.b20.q1(obj);
        try {
            a.cp cpVar = com.omarea.Scene.c;
            com.omarea.model.ActivationCodeResponse o = new a.kf1(a.fs1.t()).o();
            java.lang.String str = null;
            if (o == null) {
                return null;
            }
            if (!o.getPass()) {
                return no1Var;
            }
            a.b20.e1(o.getCodeStr());
            a.b20.f1(o.getType());
            java.lang.String account = o.getAccount();
            if (account.length() != 0) {
                str = account;
            }
            a.b20.m1("user_name", str);
            a.q10 q10Var = a.q10.f457a;
            java.lang.String codeStr = o.getCodeStr();
            a.wv.w(codeStr, "key");
            a.q10.e = codeStr;
            if (a.q10.x != 3) {
                return no1Var;
            }
            a.q10.g(codeStr);
            return no1Var;
        } catch (java.lang.Exception unused) {
            return no1Var;
        }
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.sd1) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
