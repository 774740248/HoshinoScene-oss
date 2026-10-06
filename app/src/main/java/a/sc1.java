package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sc1 {

    /* renamed from: a, reason: collision with root package name */
    public a.ws1 f525a;
    public java.util.ArrayList b;

    public static long a(a.k30 k30Var, long j) {
        a.ws1 ws1Var = k30Var.d;
        if (ws1Var instanceof a.jr0) {
            return j;
        }
        java.util.ArrayList arrayList = k30Var.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            a.i30 i30Var = (a.i30) arrayList.get(i);
            if (i30Var instanceof a.k30) {
                a.k30 k30Var2 = (a.k30) i30Var;
                if (k30Var2.d != ws1Var) {
                    j2 = java.lang.Math.min(j2, a(k30Var2, k30Var2.f + j));
                }
            }
        }
        if (k30Var != ws1Var.i) {
            return j2;
        }
        long j3 = ws1Var.j();
        long j4 = j - j3;
        return java.lang.Math.min(java.lang.Math.min(j2, a(ws1Var.h, j4)), j4 - r9.f);
    }

    public static long b(a.k30 k30Var, long j) {
        a.ws1 ws1Var = k30Var.d;
        if (ws1Var instanceof a.jr0) {
            return j;
        }
        java.util.ArrayList arrayList = k30Var.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            a.i30 i30Var = (a.i30) arrayList.get(i);
            if (i30Var instanceof a.k30) {
                a.k30 k30Var2 = (a.k30) i30Var;
                if (k30Var2.d != ws1Var) {
                    j2 = java.lang.Math.max(j2, b(k30Var2, k30Var2.f + j));
                }
            }
        }
        if (k30Var != ws1Var.h) {
            return j2;
        }
        long j3 = ws1Var.j();
        long j4 = j + j3;
        return java.lang.Math.max(java.lang.Math.max(j2, b(ws1Var.i, j4)), j4 - r9.f);
    }
}
