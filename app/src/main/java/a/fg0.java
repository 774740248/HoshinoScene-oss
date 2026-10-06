package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fg0 {
    public static android.view.WindowManager A;
    public static android.view.View C;
    public static java.util.Timer D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f148a;
    public final a.vj1 b;
    public android.view.View c;
    public android.widget.TextView d;
    public com.omarea.ui.CpuChartBarView e;
    public com.omarea.ui.CpuChartBarView f;
    public android.widget.TextView g;
    public android.widget.TextView h;
    public android.widget.TextView i;
    public android.app.ActivityManager j;
    public final android.app.ActivityManager.MemoryInfo k;
    public int l;
    public java.util.ArrayList m;
    public android.os.BatteryManager n;
    public final a.m11 o;
    public final a.vj1 p;
    public final a.vj1 q;
    public final a.ls r;
    public int s;
    public final a.vj1 t;
    public final a.vj1 u;
    public final a.vj1 v;
    public int w;
    public java.lang.Integer[] x;
    public java.lang.Integer[] y;
    public static final a.fa0 z = new a.fa0(20, 0);
    public static java.lang.Boolean B = java.lang.Boolean.FALSE;

    public fg0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f148a = context;
        this.b = new a.vj1(a.ff0.f);
        this.k = new android.app.ActivityManager.MemoryInfo();
        this.l = -1;
        this.m = new java.util.ArrayList();
        this.o = new a.m11();
        this.p = new a.vj1(a.ff0.h);
        this.q = new a.vj1(a.ff0.i);
        this.r = new a.ls();
        this.t = new a.vj1(a.ff0.g);
        this.u = new a.vj1(new a.cg0(this, 0));
        this.v = new a.vj1(new a.cg0(this, 1));
    }

    public static void a(boolean z2) {
        android.view.View view;
        java.util.Timer timer = D;
        if (timer != null) {
            timer.cancel();
            D = null;
        }
        java.lang.Boolean bool = B;
        a.wv.s(bool);
        if (bool.booleanValue() && (view = C) != null) {
            try {
                android.view.WindowManager windowManager = A;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(view);
                }
            } catch (java.lang.Exception unused) {
            }
            C = null;
        }
        B = java.lang.Boolean.FALSE;
        if (z2) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("monitor_mini", false);
        }
    }

    public final boolean b() {
        java.lang.Boolean bool = B;
        a.wv.s(bool);
        if (bool.booleanValue()) {
            return true;
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.N("monitor_mini", true);
        java.lang.System.currentTimeMillis();
        android.os.BatteryManager batteryManager = this.n;
        android.content.Context context = this.f148a;
        if (batteryManager == null) {
            java.lang.Object systemService = context.getSystemService("batterymanager");
            a.wv.t(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            this.n = (android.os.BatteryManager) systemService;
        }
        if (!(context instanceof android.accessibilityservice.AccessibilityService) && !android.provider.Settings.canDrawOverlays(context)) {
            a.ai1.r(context, 2131953205, context, 1);
            return false;
        }
        java.lang.Object systemService2 = context.getSystemService("window");
        a.wv.t(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        A = (android.view.WindowManager) systemService2;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558575, (android.view.ViewGroup) null);
        this.c = inflate;
        a.wv.s(inflate);
        inflate.findViewById(2131362559);
        android.view.View view = this.c;
        a.wv.s(view);
        view.findViewById(2131362539);
        android.view.View view2 = this.c;
        a.wv.s(view2);
        this.d = (android.widget.TextView) view2.findViewById(2131362546);
        android.view.View view3 = this.c;
        a.wv.s(view3);
        this.e = (com.omarea.ui.CpuChartBarView) view3.findViewById(2131362545);
        android.view.View view4 = this.c;
        a.wv.s(view4);
        this.f = (com.omarea.ui.CpuChartBarView) view4.findViewById(2131362560);
        android.view.View view5 = this.c;
        a.wv.s(view5);
        this.g = (android.widget.TextView) view5.findViewById(2131362561);
        android.view.View view6 = this.c;
        a.wv.s(view6);
        this.h = (android.widget.TextView) view6.findViewById(2131362542);
        android.view.View view7 = this.c;
        a.wv.s(view7);
        this.i = (android.widget.TextView) view7.findViewById(2131362568);
        if (((java.lang.Boolean) this.t.a()).booleanValue()) {
            android.widget.TextView textView = this.i;
            if (textView != null) {
                textView.setText("RAM");
            }
        } else {
            android.widget.TextView textView2 = this.i;
            if (textView2 != null) {
                textView2.setText("FPS");
            }
        }
        java.lang.Object systemService3 = context.getSystemService("activity");
        a.wv.t(systemService3, "null cannot be cast to non-null type android.app.ActivityManager");
        this.j = (android.app.ActivityManager) systemService3;
        android.view.View view8 = this.c;
        a.wv.s(view8);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = 2003;
        if (context instanceof android.accessibilityservice.AccessibilityService) {
            layoutParams.type = 2032;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = -3;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 49;
        layoutParams.x = 0;
        layoutParams.y = 0;
        if (a.op.K1(new java.lang.String[]{"dipper", "sirius", "ursa", "equuleus", "platina"}, android.os.Build.DEVICE)) {
            layoutParams.flags = 1080;
        } else {
            layoutParams.flags = 1832;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            android.view.WindowManager windowManager = A;
            a.wv.s(windowManager);
            windowManager.addView(view8, layoutParams);
            C = view8;
            B = java.lang.Boolean.TRUE;
            java.util.Timer timer = D;
            if (timer != null) {
                timer.cancel();
                D = null;
            }
            java.util.Timer timer2 = new java.util.Timer("FloatMonitorMini");
            D = timer2;
            timer2.schedule(new a.hr(8, this), 2000L, 1500L);
            return true;
        } catch (java.lang.Exception e) {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.X("FloatMonitorMini Error\n" + e.getMessage(), 0);
            return false;
        }
    }
}
