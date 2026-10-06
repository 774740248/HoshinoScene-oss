package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zb0 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public static final a.zb0 e = new a.zb0(0);
    public static final a.zb0 f = new a.zb0(1);
    public static final a.zb0 g = new a.zb0(2);
    public static final a.zb0 h = new a.zb0(3);
    public static final a.zb0 i = new a.zb0(4);
    public static final a.zb0 j = new a.zb0(5);
    public static final a.zb0 k = new a.zb0(6);
    public static final a.zb0 l = new a.zb0(7);
    public static final a.zb0 m = new a.zb0(8);
    public static final a.zb0 n = new a.zb0(9);
    public static final a.zb0 o = new a.zb0(10);
    public static final a.zb0 p = new a.zb0(11);
    public static final a.zb0 q = new a.zb0(12);
    public static final a.zb0 r = new a.zb0(13);
    public static final a.zb0 s = new a.zb0(14);
    public static final a.zb0 t = new a.zb0(15);
    public static final a.zb0 u = new a.zb0(16);
    public static final a.zb0 v = new a.zb0(17);
    public static final a.zb0 w = new a.zb0(18);
    public static final a.zb0 x = new a.zb0(19);
    public static final a.zb0 y = new a.zb0(20);
    public static final a.zb0 z = new a.zb0(21);
    public static final a.zb0 A = new a.zb0(22);
    public static final a.zb0 B = new a.zb0(23);
    public static final a.zb0 C = new a.zb0(24);
    public static final a.zb0 D = new a.zb0(25);
    public static final a.zb0 E = new a.zb0(26);
    public static final a.zb0 F = new a.zb0(27);
    public static final a.zb0 G = new a.zb0(28);
    public static final a.zb0 H = new a.zb0(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb0(int i2) {
        super(1);
        this.d = i2;
    }

    public final void a(a.zt0 zt0Var) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("disable_gameopt", "path");
                zt0Var.m("boolean", "type");
                return;
            case 1:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("launcher_boost", "path");
                zt0Var.m("boolean", "type");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("Default", "label");
                zt0Var.m("feas|fas|fas_lite", "value");
                return;
            case 3:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("Scene FAS", "label");
                zt0Var.m("fas", "value");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("Scene FAS Lite", "label");
                zt0Var.m("fas_lite", "value");
                return;
            case 5:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("feas|fas|fas_lite", "default");
                zt0Var.m("fas_engine", "path");
                zt0Var.m("select", "type");
                zt0Var.m(new a.yt0(g, h, i), "options");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("target_fps_offset", "path");
                zt0Var.m("number", "type");
                zt0Var.m(-50, "min");
                zt0Var.m(10, "max");
                zt0Var.m("0", "default");
                return;
            case 7:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("fast_down_always", "path");
                zt0Var.m("boolean", "type");
                zt0Var.m("0", "default");
                return;
            case 8:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("download_detect", "path");
                zt0Var.m("boolean", "type");
                zt0Var.m("0", "default");
                return;
            case 9:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("load_detect", "path");
                zt0Var.m("number", "type");
                zt0Var.m(62, "min");
                zt0Var.m(85, "max");
                zt0Var.m("75", "default");
                return;
            case 10:
                a.wv.w(zt0Var, "$this$$receiver");
                zt0Var.m("目标负载", "title");
                zt0Var.m("对于目标帧率偏移配置为Auto的游戏，如果CPU(单核)平均负载低于此值，自动微调降低目标帧率", "desc");
                zt0Var.m("always", "visible");
                zt0Var.s("field", n);
                return;
            case 11:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("margin_offset", "path");
                zt0Var.m("number", "type");
                zt0Var.m(-50, "min");
                zt0Var.m(100, "max");
                return;
            case 12:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("status_notify", "path");
                zt0Var.m("boolean", "type");
                zt0Var.m("0", "default");
                return;
            case 13:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("proactive_reclaim", "path");
                zt0Var.m("boolean", "type");
                return;
            case 14:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("reclaim_ram_free", "path");
                zt0Var.m("number", "type");
                zt0Var.m("18", "default");
                zt0Var.m(12, "min");
                zt0Var.m(30, "max");
                return;
            case 15:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("reclaim_skip_cpu", "path");
                zt0Var.m("number", "type");
                zt0Var.m("70", "default");
                zt0Var.m(20, "min");
                zt0Var.m(100, "max");
                return;
            case 16:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("reclaim_skip_game", "path");
                zt0Var.m("boolean", "type");
                zt0Var.m("1", "default");
                return;
            case 17:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("proactive_kill", "path");
                zt0Var.m("boolean", "type");
                return;
            case 18:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("kill_ram_free", "path");
                zt0Var.m("number", "type");
                zt0Var.m("12", "default");
                zt0Var.m(7, "min");
                zt0Var.m(20, "max");
                return;
            case 19:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("kill_swap_free", "path");
                zt0Var.m("number", "type");
                zt0Var.m("3", "default");
                zt0Var.m(0, "min");
                zt0Var.m(10, "max");
                return;
            case 20:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("kill_mem_used", "path");
                zt0Var.m("number", "type");
                zt0Var.m("170", "default");
                zt0Var.m(120, "min");
                zt0Var.m(225, "max");
                return;
            case 21:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("", "default");
                zt0Var.m("blacklist", "path");
                zt0Var.m("apps", "type");
                return;
            case 22:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("", "default");
                zt0Var.m("whitelist", "path");
                zt0Var.m("apps", "type");
                return;
            case 23:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("kswapd_boost", "path");
                zt0Var.m("boolean", "type");
                return;
            case 24:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("debug", "path");
                zt0Var.m("boolean", "type");
                return;
            case 25:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("5", "default");
                zt0Var.m("low_battery_threshold", "path");
                zt0Var.m("number", "type");
                zt0Var.m(30, "max");
                zt0Var.m(0, "min");
                return;
            case 26:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("brightness_threshold", "path");
                zt0Var.m("number", "type");
                zt0Var.m(100, "max");
                zt0Var.m(0, "min");
                return;
            case 27:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("900", "default");
                zt0Var.m("tap_delay", "path");
                zt0Var.m("number", "type");
                zt0Var.m(100, "step");
                zt0Var.m(5000, "max");
                zt0Var.m(300, "min");
                return;
            case 28:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("2000", "default");
                zt0Var.m("scroll_delay", "path");
                zt0Var.m("number", "type");
                zt0Var.m(100, "step");
                zt0Var.m(5000, "max");
                zt0Var.m(500, "min");
                return;
            default:
                a.wv.w(zt0Var, "$this$null");
                zt0Var.m("0", "default");
                zt0Var.m("disable_ltpo", "path");
                zt0Var.m("boolean", "type");
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
            case 8:
                a((a.zt0) obj);
                return no1Var;
            case 9:
                a((a.zt0) obj);
                return no1Var;
            case 10:
                a((a.zt0) obj);
                return no1Var;
            case 11:
                a((a.zt0) obj);
                return no1Var;
            case 12:
                a((a.zt0) obj);
                return no1Var;
            case 13:
                a((a.zt0) obj);
                return no1Var;
            case 14:
                a((a.zt0) obj);
                return no1Var;
            case 15:
                a((a.zt0) obj);
                return no1Var;
            case 16:
                a((a.zt0) obj);
                return no1Var;
            case 17:
                a((a.zt0) obj);
                return no1Var;
            case 18:
                a((a.zt0) obj);
                return no1Var;
            case 19:
                a((a.zt0) obj);
                return no1Var;
            case 20:
                a((a.zt0) obj);
                return no1Var;
            case 21:
                a((a.zt0) obj);
                return no1Var;
            case 22:
                a((a.zt0) obj);
                return no1Var;
            case 23:
                a((a.zt0) obj);
                return no1Var;
            case 24:
                a((a.zt0) obj);
                return no1Var;
            case 25:
                a((a.zt0) obj);
                return no1Var;
            case 26:
                a((a.zt0) obj);
                return no1Var;
            case 27:
                a((a.zt0) obj);
                return no1Var;
            case 28:
                a((a.zt0) obj);
                return no1Var;
            default:
                a((a.zt0) obj);
                return no1Var;
        }
    }
}
