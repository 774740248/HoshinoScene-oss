package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kf0 {
    public static android.view.WindowManager C;
    public static android.view.View E;
    public static a.qi1 F;
    public java.lang.Integer[] A;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f288a;
    public final a.ls b;
    public final boolean c;
    public android.view.View d;
    public com.omarea.ui.FloatMonitorChartView e;
    public android.widget.TextView f;
    public com.omarea.ui.FloatMonitorChartView g;
    public android.widget.TextView h;
    public com.omarea.ui.FloatMonitorBatteryView i;
    public android.widget.TextView j;
    public android.widget.TextView k;
    public android.widget.TextView l;
    public android.app.ActivityManager m;
    public final android.app.ActivityManager.MemoryInfo n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public java.util.ArrayList s;
    public android.os.BatteryManager t;
    public final a.lz0 u;
    public final a.pj1 v;
    public final a.m11 w;
    public final a.vj1 x;
    public android.text.SpannableString y;
    public java.lang.Double[] z;
    public static final a.fa0 B = new a.fa0(17, 0);
    public static java.lang.Boolean D = java.lang.Boolean.FALSE;

    /* JADX WARN: Type inference failed for: r0v9, types: [a.lz0, java.lang.Object] */
    public kf0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f288a = context;
        this.b = new a.ls();
        a.q10 q10Var = a.q10.f457a;
        this.c = a.wv.e(a.q10.t(), "root");
        this.n = new android.app.ActivityManager.MemoryInfo();
        this.q = -1;
        this.s = new java.util.ArrayList();
        this.u = new a.lz0();
        this.v = new a.pj1(context);
        this.w = new a.m11();
        this.x = new a.vj1(a.ff0.e);
    }

    public static void a(boolean z) {
        android.view.View view;
        a.qi1 qi1Var = F;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
            F = null;
        }
        if (a.wv.e(D, java.lang.Boolean.TRUE) && (view = E) != null) {
            try {
                android.view.WindowManager windowManager = C;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(view);
                }
            } catch (java.lang.Exception unused) {
            }
            E = null;
            D = java.lang.Boolean.FALSE;
        }
        if (z) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("monitor_general", false);
        }
    }

    public static android.text.SpannableString c(java.lang.String str) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(-1), 0, str.length(), 33);
        spannableString.setSpan(new android.text.style.StyleSpan(1), 0, str.length(), 33);
        return spannableString;
    }

    public final void b() {
        java.lang.Boolean bool = D;
        a.wv.s(bool);
        if (bool.booleanValue()) {
            return;
        }
        android.os.BatteryManager batteryManager = this.t;
        android.content.Context context = this.f288a;
        if (batteryManager == null) {
            java.lang.Object systemService = context.getSystemService("batterymanager");
            a.wv.t(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            this.t = (android.os.BatteryManager) systemService;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        if (!android.provider.Settings.canDrawOverlays(context)) {
            a.ai1.r(context, 2131953205, context, 1);
            return;
        }
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.N("monitor_general", true);
        D = java.lang.Boolean.TRUE;
        java.lang.Object systemService2 = context.getSystemService("window");
        a.wv.t(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        C = (android.view.WindowManager) systemService2;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558573, (android.view.ViewGroup) null);
        inflate.findViewById(2131362559);
        inflate.findViewById(2131362539);
        this.e = (com.omarea.ui.FloatMonitorChartView) inflate.findViewById(2131362547);
        this.g = (com.omarea.ui.FloatMonitorChartView) inflate.findViewById(2131362562);
        this.i = (com.omarea.ui.FloatMonitorBatteryView) inflate.findViewById(2131362540);
        this.f = (android.widget.TextView) inflate.findViewById(2131362546);
        this.h = (android.widget.TextView) inflate.findViewById(2131362561);
        this.j = (android.widget.TextView) inflate.findViewById(2131362542);
        this.k = (android.widget.TextView) inflate.findViewById(2131362541);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362569);
        java.io.File file = new java.io.File("/system/fonts/DroidSansMono.ttf");
        if (file.exists()) {
            textView.setTypeface(android.graphics.Typeface.createFromFile(file));
        }
        this.l = textView;
        inflate.setOnClickListener(new a.n80(this, 2, new java.lang.Object()));
        this.d = inflate;
        java.lang.Object systemService3 = context.getSystemService("activity");
        a.wv.t(systemService3, "null cannot be cast to non-null type android.app.ActivityManager");
        this.m = (android.app.ActivityManager) systemService3;
        android.view.View view = this.d;
        a.wv.s(view);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("monitor", 0);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = 2038;
        layoutParams.format = -3;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        layoutParams.x = sharedPreferences.getInt("basic_x", 0);
        layoutParams.y = sharedPreferences.getInt("basic_y", 0);
        layoutParams.flags = 1064;
        if (i >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            android.view.WindowManager windowManager = C;
            a.wv.s(windowManager);
            windowManager.addView(view, layoutParams);
            E = view;
            view.setOnTouchListener(new a.gf0(layoutParams, sharedPreferences, 0));
            a.qi1 qi1Var = F;
            if (qi1Var != null) {
                a.wv.p(qi1Var);
                F = null;
            }
            F = a.wv.M0(a.wv.b(a.z80.b), null, new a.hf0(this, null), 3);
        } catch (java.lang.Exception e) {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.X("FloatMonitor Error\n" + e.getMessage(), 0);
        }
    }
}
