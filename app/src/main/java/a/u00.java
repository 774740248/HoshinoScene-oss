package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class u00 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.ArrayList g;
    public final /* synthetic */ a.u10 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u00(java.util.ArrayList arrayList, a.u10 u10Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = arrayList;
        this.h = u10Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.u00(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        for (java.lang.String str : (Iterable<java.lang.String>) this.g) {
            try {
                a.lt0 lt0Var = new a.lt0(str);
                java.lang.String h = lt0Var.h("type");
                java.lang.String h2 = lt0Var.h("body");
                java.lang.String h3 = lt0Var.h("tag");
                int hashCode = h3.hashCode();
                a.u10 u10Var = this.h;
                if (hashCode != 69) {
                    if (hashCode != 77) {
                        if (hashCode == 81 && h3.equals("Q")) {
                            java.lang.Integer c2 = a.wi1.c2(h2);
                            u10Var.f(c2 != null ? c2.intValue() : -1);
                        }
                    } else if (h3.equals("M")) {
                        try {
                            u10Var.b(lt0Var.h("type"), h2);
                        } catch (java.lang.Exception e) {
                            android.util.Log.e("Scene", "Daemon-Shell onMessageOutput " + e.getMessage());
                        }
                    }
                } else if (h3.equals("E")) {
                    try {
                        u10Var.e(h, h2);
                    } catch (java.lang.Exception e2) {
                        android.util.Log.e("Scene", "Daemon-Shell onErrorOutput " + e2.getMessage());
                    }
                }
            } catch (java.lang.Exception unused) {
                android.util.Log.e("@Scene", "[SocketReplyDecode] " + str);
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.u00 u00Var = (a.u00) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        u00Var.e(no1Var);
        return no1Var;
    }
}
