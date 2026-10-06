package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class j10 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.io.Serializable g;
    public final /* synthetic */ java.lang.Object h;
    public final /* synthetic */ java.lang.Object i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j10(a.x81 x81Var, androidx.recyclerview.widget.RecyclerView recyclerView, a.ha1 ha1Var, a.n60 n60Var, java.lang.String[] strArr, a.n40 n40Var, int i) {
        super(1);
        this.d = i;
        this.e = x81Var;
        this.f = recyclerView;
        this.g = ha1Var;
        this.h = n60Var;
        this.i = strArr;
        this.j = n40Var;
    }

    public final void a(a.x81 x81Var) {
        int i = this.d;
        java.lang.Object obj = this.j;
        java.lang.Object obj2 = this.i;
        java.lang.Object obj3 = this.h;
        java.io.Serializable serializable = this.g;
        java.lang.Object obj4 = this.f;
        java.lang.Object obj5 = this.e;
        switch (i) {
            case 1:
                a.wv.w(x81Var, "it");
                int c = ((a.x81) obj5).c();
                int i2 = c != 1 ? c != 2 ? c != 3 ? c != 4 ? 0 : 36000000 : 18000000 : 10800000 : 3600000;
                a.e91 adapter = ((androidx.recyclerview.widget.RecyclerView) obj4).getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.AdapterPowerStat");
                a.jj jjVar = (a.jj) adapter;
                a.r40 r40Var = (a.r40) obj3;
                java.lang.String[] strArr = (java.lang.String[]) obj2;
                java.lang.Runnable runnable = (java.lang.Runnable) obj;
                if (!((a.ha1) serializable).c) {
                    jjVar.p(i2);
                    return;
                }
                java.util.ArrayList p = jjVar.p(i2);
                if (p.size() > 0) {
                    int i3 = a.x60.f681a;
                    android.app.Activity activity = r40Var.p0;
                    java.lang.String m = r40Var.m(2131953224);
                    a.wv.v(m, "getString(R.string.power_delete_confirm)");
                    a.fs1.i(activity, a.ai1.l(new java.lang.Object[]{strArr[c], java.lang.Integer.valueOf(p.size())}, 2, m, "format(format, *args)"), "", new a.bf1(p, jjVar, i2, runnable, r40Var, 2), runnable);
                    return;
                }
                return;
            default:
                a.wv.w(x81Var, "it");
                int c2 = ((a.x81) obj5).c();
                int i4 = c2 != 1 ? c2 != 2 ? c2 != 3 ? 0 : 80 : 50 : 20;
                a.e91 adapter2 = ((androidx.recyclerview.widget.RecyclerView) obj4).getAdapter();
                a.wv.t(adapter2, "null cannot be cast to non-null type com.omarea.ui.AdapterChargeStat");
                a.ci ciVar = (a.ci) adapter2;
                a.r40 r40Var2 = (a.r40) obj3;
                java.lang.String[] strArr2 = (java.lang.String[]) obj2;
                java.lang.Runnable runnable2 = (java.lang.Runnable) obj;
                if (!((a.ha1) serializable).c) {
                    ciVar.p(i4);
                    return;
                }
                java.util.ArrayList p2 = ciVar.p(i4);
                if (!p2.isEmpty()) {
                    int i5 = a.x60.f681a;
                    android.app.Activity activity2 = r40Var2.p0;
                    java.lang.String m2 = r40Var2.m(2131953224);
                    a.wv.v(m2, "getString(R.string.power_delete_confirm)");
                    a.fs1.i(activity2, a.ai1.l(new java.lang.Object[]{strArr2[c2], java.lang.Integer.valueOf(p2.size())}, 2, m2, "format(format, *args)"), "", new a.bf1(p2, ciVar, i4, runnable2, r40Var2, 3), runnable2);
                    return;
                }
                return;
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.zs zsVar = (a.zs) obj;
                a.wv.w(zsVar, "c");
                ((a.ma1) this.e).c = zsVar;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = a.q10.r;
                java.lang.String str = (java.lang.String) this.f;
                concurrentHashMap.put(str, zsVar);
                a.bp0 bp0Var = (a.bp0) this.i;
                if (bp0Var != null) {
                    a.q10.s.put(str, bp0Var);
                }
                a.q10 q10Var = a.q10.f457a;
                byte[] j = a.q10.j("@Api:" + a.ii1.f(a.yi1.r2(str, 20), a.yi1.r2((java.lang.String) this.g, 30), (java.lang.String) this.h));
                java.lang.Object obj2 = this.j;
                if (obj2 instanceof a.oo1) {
                    a.q10.M((a.oo1) obj2, j);
                } else {
                    a.wv.t(obj2, "null cannot be cast to non-null type java.nio.channels.SocketChannel");
                    java.nio.ByteBuffer put = java.nio.ByteBuffer.allocate(j.length + 4).put(a.b20.v0(j.length)).put(j);
                    put.flip();
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.g10((java.nio.channels.SocketChannel) obj2, put, null), 3);
                }
                return no1Var;
            case 1:
                a((a.x81) obj);
                return no1Var;
            default:
                a((a.x81) obj);
                return no1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(a.ma1 ma1Var, java.lang.String str, a.bp0 bp0Var, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        super(1);
        this.d = 0;
        this.e = ma1Var;
        this.f = str;
        this.i = bp0Var;
        this.g = str2;
        this.h = str3;
        this.j = obj;
    }
}
