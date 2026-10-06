package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zc0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.l1 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc0(a.l1 l1Var, boolean z, int i) {
        super(1);
        this.d = i;
        this.e = l1Var;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.zt0, a.lt0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.zt0, a.lt0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.zt0, a.lt0, java.lang.Object] */
    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        boolean z = this.f;
        a.l1 l1Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("1", "default");
                zt0Var.m("variance_adjust", "path");
                zt0Var.m("select", "type");
                a.xc0 xc0Var = new a.xc0(l1Var, 12);
                a.zt0 lt0Var = (zt0) new a.lt0();
                xc0Var.i(lt0Var);
                a.xc0 xc0Var2 = new a.xc0(l1Var, 13);
                a.zt0 lt0Var2 = (zt0) new a.lt0();
                xc0Var2.i(lt0Var2);
                a.xc0 xc0Var3 = new a.xc0(l1Var, 14);
                a.zt0 lt0Var3 = (zt0) new a.lt0();
                xc0Var3.i(lt0Var3);
                java.util.ArrayList f = a.b20.f(lt0Var, lt0Var2, lt0Var3);
                if (z) {
                    a.xc0 xc0Var4 = new a.xc0(l1Var, 15);
                    a.lt0 lt0Var4 = new a.lt0();
                    xc0Var4.i(lt0Var4);
                    f.add(lt0Var4);
                }
                zt0Var.t("options", f);
                return;
            case 1:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953467, "title");
                zt0Var.m(l1Var.o(2131953469), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.zc0(l1Var, z, 0));
                return;
            default:
                a.ai1.q(zt0Var, "$this$$receiver", l1Var, 2131953451, "title");
                zt0Var.m(l1Var.o(2131953452), "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", new a.xb0(1, z));
                return;
        }
    }

    @Override // a.bp0
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a((a.zt0) obj);
                return no1Var;
            case 1:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
