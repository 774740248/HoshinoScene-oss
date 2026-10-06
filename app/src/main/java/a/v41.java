package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.tj1 f623a;

    public v41(a.tj1 tj1Var) {
        this.f623a = tj1Var;
    }

    public final java.lang.String a(java.lang.String str) {
        a.tj1 tj1Var = this.f623a;
        return tj1Var.m.containsKey(str) ? (java.lang.String) tj1Var.m.get(str) : str;
    }

    public final java.lang.String b(java.lang.String str) {
        a.tj1 tj1Var = this.f623a;
        if (!tj1Var.m.containsValue(str)) {
            return str;
        }
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) tj1Var.m.entrySet()) {
            if (a.wv.e(entry.getValue(), str)) {
                return (java.lang.String) entry.getKey();
            }
        }
        return str;
    }
}
