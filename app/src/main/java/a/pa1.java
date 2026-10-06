package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pa1 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.util.List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa1(java.util.List list, int i) {
        super(1);
        this.d = i;
        this.e = list;
    }

    public final void a(a.zt0 zt0Var) {
        int i = this.d;
        java.util.List list = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("high", "default");
                zt0Var.m("apps_default", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
                return;
            case 1:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("low", "default");
                zt0Var.m("apps_inactive", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("high", "default");
                zt0Var.m("games_default", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
                return;
            case 3:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("low", "default");
                zt0Var.m("low_battery_mode", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("high", "default");
                zt0Var.m("screen_off", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
                return;
            case 5:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("high", "default");
                zt0Var.m("gesture", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
                return;
            default:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("high", "default");
                zt0Var.m("low_brightness", "path");
                zt0Var.m("select", "type");
                zt0Var.t("options", list);
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
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
