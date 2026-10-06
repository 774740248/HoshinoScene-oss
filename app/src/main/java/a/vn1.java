package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vn1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f637a;
    public long b;
    public java.util.ArrayList c;
    public final boolean d;
    public final java.lang.Object e;

    public vn1(java.lang.String str, long j, boolean z, a.mc1 mc1Var, int i) {
        j = (i & 2) != 0 ? 0L : j;
        z = (i & 8) != 0 ? false : z;
        mc1Var = (i & 16) != 0 ? null : mc1Var;
        a.wv.w(str, "name");
        this.f637a = str;
        this.b = j;
        this.c = null;
        this.d = z;
        this.e = mc1Var;
    }

    public final long a() {
        long j = this.b;
        java.util.ArrayList arrayList = this.c;
        long j2 = 0;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j2 += ((a.vn1) it.next()).a();
            }
        }
        return j + j2;
    }
}
