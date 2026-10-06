package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class id0 extends a.yc1 {
    public final java.util.HashMap g = new java.util.HashMap();

    @Override // a.yc1
    public final a.uc1 a(java.lang.Object obj) {
        return (a.uc1) this.g.get(obj);
    }

    @Override // a.yc1
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object b = super.b(obj);
        this.g.remove(obj);
        return b;
    }

    public final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        a.uc1 a2 = a(obj);
        if (a2 != null) {
            return a2.d;
        }
        java.util.HashMap hashMap = this.g;
        a.uc1 uc1Var = new a.uc1(obj, obj2);
        this.f++;
        a.uc1 uc1Var2 = this.d;
        if (uc1Var2 == null) {
            this.c = uc1Var;
            this.d = uc1Var;
        } else {
            uc1Var2.e = uc1Var;
            uc1Var.f = uc1Var2;
            this.d = uc1Var;
        }
        hashMap.put(obj, uc1Var);
        return null;
    }
}
