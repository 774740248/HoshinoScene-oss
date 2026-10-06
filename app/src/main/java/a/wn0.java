package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class wn0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.jo0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wn0(a.jo0 jo0Var, int i) {
        super(0);
        this.d = i;
        this.e = jo0Var;
    }

    public final void a() {
        int i = this.d;
        a.jo0 jo0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.M0(a.wv.b(a.z80.b), null, new a.vn0(jo0Var, null), 3);
                return;
            case 1:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            default:
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = a.fs1.D().getString("user_name", "");
                java.lang.String str = string != null ? string : "";
                android.view.LayoutInflater layoutInflater = jo0Var.N;
                if (layoutInflater == null) {
                    layoutInflater = jo0Var.w(null);
                    jo0Var.N = layoutInflater;
                }
                android.view.View inflate = layoutInflater.inflate(2131558551, (android.view.ViewGroup) null);
                int i2 = a.x60.f681a;
                a.kk0 K = jo0Var.K();
                java.lang.String m = jo0Var.m(2131952077);
                a.wv.v(m, "getString(R.string.btn_confirm)");
                a.fs1.j(K, inflate, new a.u60(m, new a.ng0(jo0Var, inflate, str, 1), 4));
                return;
            case 3:
                a.gu0[] gu0VarArr = a.jo0.v0;
                new a.x01(jo0Var.K(), jo0Var.p0, jo0Var.U()).d();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.jo0.S(jo0Var);
                return;
            case 5:
                a.jo0.S(jo0Var);
                return;
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        a.jo0 jo0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a();
                return no1Var;
            case 1:
                return new a.i50(jo0Var.K(), jo0Var.p0, jo0Var.U());
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return new a.tf(2, jo0Var);
            case 3:
                a();
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a();
                return no1Var;
            case 5:
                a();
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return new a.b81(jo0Var.K(), null);
            default:
                a();
                return no1Var;
        }
    }
}
