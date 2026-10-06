package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jf0 {
    public static android.view.WindowManager c;
    public static com.omarea.ui.fw.FloatMonitorRender e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f253a;
    public static final a.fa0 b = new a.fa0(18, 0);
    public static java.lang.Boolean d = java.lang.Boolean.FALSE;

    public jf0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f253a = context;
    }

    public static void a(boolean z) {
        com.omarea.ui.fw.FloatMonitorRender floatMonitorRender;
        if (a.wv.e(d, java.lang.Boolean.TRUE) && (floatMonitorRender = e) != null) {
            try {
                android.view.WindowManager windowManager = c;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(floatMonitorRender);
                }
            } catch (java.lang.Exception unused) {
            }
            e = null;
            d = java.lang.Boolean.FALSE;
        }
        if (z) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("monitor_general2", false);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [a.la1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.ha1, java.lang.Object] */
    public final void b() {
        android.content.Context createConfigurationContext;
        java.lang.Boolean bool = d;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (a.wv.e(bool, bool2)) {
            com.omarea.ui.fw.FloatMonitorRender floatMonitorRender = e;
            com.omarea.ui.fw.FloatMonitorRender floatMonitorRender2 = floatMonitorRender instanceof com.omarea.ui.fw.FloatMonitorRender ? floatMonitorRender : null;
            if (floatMonitorRender2 != null) {
                a.cp cpVar = com.omarea.Scene.c;
                floatMonitorRender2.setFlags(a.fs1.D().getInt("monitor_general2_flags", 6391));
                floatMonitorRender2.setRefreshInterval(a.fs1.D().getInt("monitor_general2_refresh", 1000));
                return;
            }
            return;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.f253a;
        if (!android.provider.Settings.canDrawOverlays(context)) {
            a.ai1.r(context, 2131953205, context, 1);
            return;
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        a.fs1.N("monitor_general2", true);
        a.ha1 systemService = (ha1) context.getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        c = (android.view.WindowManager) systemService;
        float f = a.fs1.D().getFloat("monitor_general2_scale", 1.0f);
        if (f == 1.0f) {
            createConfigurationContext = context;
        } else {
            android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
            configuration.densityDpi = (int) (configuration.densityDpi * f);
            createConfigurationContext = context.createConfigurationContext(configuration);
            a.wv.v(createConfigurationContext, "base.createConfigurationContext(config)");
        }
        final int i2 = a.fs1.D().getInt("monitor_general2_flags", 6391);
        final int i3 = i2 & 15;
        final a.ha1 obj = new a.ha1();
        obj.c = true;
        final com.omarea.ui.fw.FloatMonitorRender floatMonitorRender3 = new com.omarea.ui.fw.FloatMonitorRender(createConfigurationContext, i2);
        floatMonitorRender3.setClickable(true);
        final a.ha1 obj2 = new a.ha1();
        floatMonitorRender3.setOnClickListener(new a.if0());
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("monitor", 0);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = 2038;
        layoutParams.format = -3;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        layoutParams.x = sharedPreferences.getInt("monitor2_x", 0);
        layoutParams.y = sharedPreferences.getInt("monitor2_y", 0);
        layoutParams.flags = 1064;
        if (i >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            android.view.WindowManager windowManager = c;
            a.wv.s(windowManager);
            windowManager.addView(floatMonitorRender3, layoutParams);
            e = floatMonitorRender3;
            d = bool2;
            floatMonitorRender3.setOnTouchListener(new a.gf0(layoutParams, sharedPreferences, 1));
        } catch (java.lang.Exception e2) {
            d = java.lang.Boolean.FALSE;
            e = null;
            a.cp cpVar3 = com.omarea.Scene.c;
            a.fs1.X("FloatMonitor2 Error\n" + e2.getMessage(), 0);
        }
    }
}
