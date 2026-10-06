package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ac0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a.cc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac0(a.cc0 cc0Var, int i) {
        super(1);
        this.d = i;
        this.e = cc0Var;
    }

    public final void a(a.zt0 zt0Var) {
        java.lang.String str;
        int i = this.d;
        int i2 = 7;
        a.cc0 cc0Var = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953389), "label");
                zt0Var.m("", "value");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953390), "label");
                zt0Var.m("ocr+camera", "value");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953393), "label");
                zt0Var.m("scene+game", "value");
                return;
            case 3:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953391), "label");
                zt0Var.m("power+camera", "value");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953394), "label");
                zt0Var.m("wxpay+alipay", "value");
                return;
            case 5:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953395), "label");
                zt0Var.m("wxscan+ali_scan", "value");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m(a.cc0.a(cc0Var, 2131953392), "label");
                zt0Var.m("search+ai", "value");
                return;
            case 7:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("", "default");
                zt0Var.m("side_key_ext", "path");
                zt0Var.m("select", "type");
                zt0Var.m(new a.yt0(new a.ac0(cc0Var, 0), new a.ac0(cc0Var, 1), new a.ac0(cc0Var, 2), new a.ac0(cc0Var, 3), new a.ac0(cc0Var, 4), new a.ac0(cc0Var, 5), new a.ac0(cc0Var, 6)), "options");
                return;
            default:
                a.wv.w(zt0Var, "$this$arrayOf");
                zt0Var.m(a.cc0.a(cc0Var, 2131953387), "title");
                zt0Var.m(a.cc0.a(cc0Var, 2131953388), "desc");
                if (a.wv.e(android.os.Build.MANUFACTURER, "OnePlus")) {
                    a.q10 q10Var = a.q10.f457a;
                    if (a.wv.e(a.q10.l("settings get global side_button"), "1")) {
                        str = "always";
                        zt0Var.m(str, "visible");
                        zt0Var.s("field", new a.ac0(cc0Var, i2));
                        return;
                    }
                }
                str = "never";
                zt0Var.m(str, "visible");
                zt0Var.s("field", new a.ac0(cc0Var, i2));
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
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a((a.zt0) obj);
                return no1Var;
            case 3:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a((a.zt0) obj);
                return no1Var;
            case 5:
                a((a.zt0) obj);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a((a.zt0) obj);
                return no1Var;
            case 7:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
