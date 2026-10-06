package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o4 extends a.uu0 implements a.bp0 {
    public static final a.o4 e = new a.o4(0);
    public static final a.o4 f = new a.o4(1);
    public static final a.o4 g = new a.o4(2);
    public static final a.o4 h = new a.o4(3);
    public static final a.o4 i = new a.o4(4);
    public static final a.o4 j = new a.o4(5);
    public static final a.o4 k = new a.o4(6);
    public static final a.o4 l = new a.o4(7);
    public static final a.o4 m = new a.o4(8);
    public static final a.o4 n = new a.o4(9);
    public static final a.o4 o = new a.o4(10);
    public static final a.o4 p = new a.o4(11);
    public static final a.o4 q = new a.o4(12);
    public static final a.o4 r = new a.o4(13);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4(int i2) {
        super(1);
        this.d = i2;
    }

    public final java.lang.String a(int i2) {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                if (i2 <= -50) {
                    return "Auto";
                }
                return (i2 < 0 ? "" : "+") + i2 + "%";
            case 1:
                if (i2 <= -50) {
                    return "Auto";
                }
                return (i2 < 0 ? "" : "+") + i2 + "%";
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
            case 3:
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
            case 7:
            case 8:
            case 9:
            default:
                return a.ai1.c(i2 * 128, "MB");
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return a.ai1.e("缩放 ", i2 + 100, "%");
            case 5:
                return a.ai1.e("刷新间隔 ", i2 * 100, "ms");
            case 10:
                return java.lang.String.valueOf(i2);
            case 11:
                return i2 + "(" + (i2 / 1024) + "MB)";
            case 12:
                return i2 + "(" + (i2 / 100.0f) + "%)";
        }
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        a.no1 no1Var = a.no1.f387a;
        int i2 = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a(((java.lang.Number) obj).intValue());
            case 1:
                return a(((java.lang.Number) obj).intValue());
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
                a.wv.w(appInfo, "it");
                return appInfo.getAppName();
            case 3:
                a.vn1 vn1Var = (a.vn1) obj;
                a.wv.w(vn1Var, "node");
                java.lang.Object obj2 = vn1Var.e;
                a.wv.t(obj2, "null cannot be cast to non-null type com.omarea.common.net.RootFileInfo");
                java.util.ArrayList<a.mc1> b = ((a.mc1) obj2).b("", true);
                java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(b, 10));
                for (a.mc1 mc1Var : b) {
                    arrayList.add(new a.vn1(mc1Var.b, mc1Var.d, mc1Var.f343a, mc1Var, 4));
                }
                return new java.util.ArrayList(arrayList);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return a(((java.lang.Number) obj).intValue());
            case 5:
                return a(((java.lang.Number) obj).intValue());
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w((a.x81) obj, "it");
                return no1Var;
            case 7:
                a.zt0 zt0Var = (a.zt0) obj;
                switch (i2) {
                    case 7:
                        a.wv.w(zt0Var, "$this$$receiver");
                        zt0Var.m(1, "durationMS");
                        return no1Var;
                    default:
                        a.wv.w(zt0Var, "$this$$receiver");
                        zt0Var.m(1, "durationMS");
                        return no1Var;
                }
            case 8:
                a.y31 y31Var = (a.y31) obj;
                a.wv.w(y31Var, "<name for destructuring parameter 0>");
                int intValue = ((java.lang.Number) y31Var.c).intValue();
                int intValue2 = ((java.lang.Number) y31Var.d).intValue();
                if (intValue == intValue2) {
                    return java.lang.String.valueOf(intValue);
                }
                return intValue + "-" + intValue2;
            case 9:
                a.zt0 zt0Var2 = (a.zt0) obj;
                switch (i2) {
                    case 7:
                        a.wv.w(zt0Var2, "$this$$receiver");
                        zt0Var2.m(1, "durationMS");
                        return no1Var;
                    default:
                        a.wv.w(zt0Var2, "$this$$receiver");
                        zt0Var2.m(1, "durationMS");
                        return no1Var;
                }
            case 10:
                return a(((java.lang.Number) obj).intValue());
            case 11:
                return a(((java.lang.Number) obj).intValue());
            case 12:
                return a(((java.lang.Number) obj).intValue());
            default:
                return a(((java.lang.Number) obj).intValue());
        }
    }
}
