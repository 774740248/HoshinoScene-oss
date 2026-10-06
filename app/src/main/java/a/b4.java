package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b4 extends a.uu0 implements a.qo0 {
    public static final a.b4 e = new a.b4(0);
    public static final a.b4 f = new a.b4(1);
    public static final a.b4 g = new a.b4(2);
    public static final a.b4 h = new a.b4(3);
    public static final a.b4 i = new a.b4(4);
    public static final a.b4 j = new a.b4(5);
    public static final a.b4 k = new a.b4(6);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(int i2) {
        super(0);
        this.d = i2;
    }

    public final java.lang.Boolean a() {
        boolean z;
        switch (this.d) {
            case 1:
                return java.lang.Boolean.TRUE;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.q10 q10Var = a.q10.f457a;
                return java.lang.Boolean.valueOf(a.wv.e(a.q10.t(), "root"));
            default:
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.Object systemService = a.fs1.t().getSystemService("accessibility");
                a.wv.t(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).iterator();
                while (true) {
                    z = false;
                    if (it.hasNext()) {
                        java.lang.String id = it.next().getId();
                        a.wv.v(id, "serviceInfo.id");
                        if (a.yi1.h2(id, "AccessibilitySceneMode", false)) {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        java.util.ArrayList arrayList;
        java.util.List list;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.cp cpVar = com.omarea.Scene.c;
                return a.fs1.t().getSharedPreferences("powercfg", 0);
            case 1:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return a();
            case 3:
                a.g00 g00Var = new a.g00();
                a.nu0 nu0Var = a.nu0.f395a;
                java.lang.String str = g00Var.g;
                a.y31 a2 = a.nu0.a(new java.lang.String[]{str, "/sys/devices/system/cpu/bus_dcvs/DDR/available_frequencies"});
                java.lang.String str2 = a2 != null ? (java.lang.String) a2.d : null;
                if (str2 == null || str2.length() == 0) {
                    arrayList = new java.util.ArrayList();
                } else {
                    a.wv.s(a2);
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) a2.d;
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s");
                    a.wv.v(compile, "compile(pattern)");
                    a.wv.w(charSequence, "input");
                    a.yi1.w2(0);
                    java.util.regex.Matcher matcher = compile.matcher(charSequence);
                    if (matcher.find()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(10);
                        int i2 = 0;
                        do {
                            arrayList2.add(charSequence.subSequence(i2, matcher.start()).toString());
                            i2 = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(charSequence.subSequence(i2, charSequence.length()).toString());
                        list = arrayList2;
                    } else {
                        list = a.b20.y0(charSequence.toString());
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it.next())));
                    }
                    if (a.wv.e(a2.c, str)) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(a.op.J1(arrayList3, 10));
                        java.util.Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(java.lang.Integer.valueOf((int) (((java.lang.Number) it2.next()).longValue() / 1000)));
                        }
                        arrayList = a.qv.x2(arrayList4);
                    } else {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(a.op.J1(arrayList3, 10));
                        java.util.Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(java.lang.Integer.valueOf((int) ((java.lang.Number) it3.next()).longValue()));
                        }
                        arrayList = a.qv.x2(arrayList5);
                    }
                }
                return arrayList.isEmpty() ? a.b20.F0(0, 1) : arrayList;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return c();
            case 5:
                return a();
            default:
                return c();
        }
    }

    public final java.lang.String c() {
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                java.lang.String upperCase = a.gy.z().toUpperCase(java.util.Locale.ROOT);
                a.wv.v(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            default:
                java.lang.String str = a.pe0.f434a;
                a.cp cpVar = com.omarea.Scene.c;
                return a.pe0.d(a.fs1.t(), "windowBg.jpg");
        }
    }
}
