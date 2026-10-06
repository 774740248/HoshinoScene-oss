package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s40 implements a.zh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f514a;
    public final /* synthetic */ a.r40 b;
    public final /* synthetic */ a.ci c;

    public /* synthetic */ s40(a.r40 r40Var, a.ci ciVar, int i) {
        this.f514a = i;
        this.b = r40Var;
        this.c = ciVar;
    }

    public final void a(int i) {
        int i2 = this.f514a;
        a.ci ciVar = this.c;
        a.r40 r40Var = this.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.au auVar = r40Var.s0;
                java.lang.Object obj = ciVar.j.get(i);
                a.wv.v(obj, "filterResult[position]");
                auVar.n(((com.omarea.model.ChargeStatSession) obj).session);
                java.lang.Object obj2 = ciVar.j.get(i);
                a.wv.v(obj2, "this.filterResult[position]");
                com.omarea.model.ChargeStatSession chargeStatSession = (com.omarea.model.ChargeStatSession) obj2;
                ciVar.j.remove(i);
                java.util.ArrayList arrayList = ciVar.g;
                if (arrayList.contains(chargeStatSession)) {
                    arrayList.remove(chargeStatSession);
                }
                ciVar.f();
                return;
            default:
                a.bp0 bp0Var = r40Var.r0;
                java.lang.Object obj3 = ciVar.j.get(i);
                a.wv.v(obj3, "filterResult[position]");
                bp0Var.i((com.omarea.model.ChargeStatSession) obj3);
                r40Var.S(false, false);
                return;
        }
    }
}
