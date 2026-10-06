package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q40 implements a.gj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f462a;
    public final /* synthetic */ a.r40 b;
    public final /* synthetic */ a.jj c;

    public /* synthetic */ q40(a.r40 r40Var, a.jj jjVar, int i) {
        this.f462a = i;
        this.b = r40Var;
        this.c = jjVar;
    }

    public final void a(int i) {
        int i2 = this.f462a;
        a.jj jjVar = this.c;
        a.r40 r40Var = this.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.au auVar = r40Var.s0;
                java.lang.Object obj = jjVar.j.get(i);
                a.wv.v(obj, "filterResult[position]");
                auVar.n(((com.omarea.model.PowerStatSession) obj).session);
                java.lang.Object obj2 = jjVar.j.get(i);
                a.wv.v(obj2, "this.filterResult[position]");
                com.omarea.model.PowerStatSession powerStatSession = (com.omarea.model.PowerStatSession) obj2;
                jjVar.j.remove(i);
                java.util.ArrayList arrayList = jjVar.g;
                if (arrayList.contains(powerStatSession)) {
                    arrayList.remove(powerStatSession);
                }
                jjVar.f();
                return;
            default:
                a.bp0 bp0Var = r40Var.r0;
                java.lang.Object obj3 = jjVar.j.get(i);
                a.wv.v(obj3, "filterResult[position]");
                bp0Var.i((com.omarea.model.PowerStatSession) obj3);
                r40Var.S(false, false);
                return;
        }
    }
}
