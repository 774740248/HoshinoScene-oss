package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uh0 {
    public static android.view.WindowManager g;
    public static android.view.View i;
    public static java.util.Timer j;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f595a;
    public android.view.View b;
    public android.widget.TextView c;
    public android.os.BatteryManager d;
    public final java.util.LinkedHashMap e;
    public static final a.fa0 f = new a.fa0(26, 0);
    public static java.lang.Boolean h = java.lang.Boolean.FALSE;

    public uh0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f595a = context;
        a.y31[] y31VarArr = {new a.y31("cpu", "CPU "), new a.y31("gpu", "GPU "), new a.y31("ddr", "DDR "), new a.y31("soc_max", "SOC "), new a.y31("camera", "CAM ")};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(a.b20.B0(5));
        a.op.R1(linkedHashMap, y31VarArr);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) linkedHashMap.entrySet()) {
            if (((java.lang.Boolean) a.wv.v1(new a.sh0(entry, null))).booleanValue()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        this.e = linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:10:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(a.uh0 r12, a.ey r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof a.th0
            if (r0 == 0) goto L16
            r0 = r13
            a.th0 r0 = (a.th0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.l = r1
            goto L1b
        L16:
            a.th0 r0 = new a.th0
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.j
            a.dz r1 = a.dz.c
            int r2 = r0.l
            java.lang.String r3 = "℃\n"
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 != r6) goto L36
            java.util.Map$Entry r12 = r0.i
            java.util.Iterator r2 = r0.h
            java.lang.StringBuilder r7 = r0.g
            a.uh0 r8 = r0.f
            a.b20.q1(r13)
            goto L8e
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3e:
            a.b20.q1(r13)
            double r7 = a.oq0.f417a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L57
            java.lang.String r2 = "BAT "
            r13.append(r2)
            r13.append(r7)
            r13.append(r3)
        L57:
            java.util.LinkedHashMap r2 = r12.e
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r7 = r13
        L62:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto La9
            java.lang.Object r13 = r2.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            a.q10 r8 = a.q10.f457a
            java.lang.Object r8 = r13.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r0.f = r12
            r0.g = r7
            r0.h = r2
            r0.i = r13
            r0.l = r6
            a.q10 r9 = a.q10.f457a
            r10 = 0
            java.lang.Object r8 = r9.s(r8, r10, r0)
            if (r8 != r1) goto L8a
            goto Lb7
        L8a:
            r11 = r8
            r8 = r12
            r12 = r13
            r13 = r11
        L8e:
            java.lang.Number r13 = (java.lang.Number) r13
            double r9 = r13.doubleValue()
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 <= 0) goto La7
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.append(r12)
            r7.append(r9)
            r7.append(r3)
        La7:
            r12 = r8
            goto L62
        La9:
            a.cp r13 = com.omarea.Scene.c
            a.xa r13 = new a.xa
            r0 = 27
            r13.<init>(r12, r0, r7)
            a.fs1.L(r13)
            a.no1 r1 = a.no1.f387a
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uh0.a(a.uh0, a.ey):java.lang.Object");
    }

    public static void b() {
        android.view.View view;
        java.util.Timer timer = j;
        if (timer != null) {
            timer.cancel();
            j = null;
        }
        java.lang.Boolean bool = h;
        a.wv.s(bool);
        if (!bool.booleanValue() || (view = i) == null) {
            return;
        }
        try {
            android.view.WindowManager windowManager = g;
            if (windowManager != null) {
                windowManager.removeViewImmediate(view);
            }
        } catch (java.lang.Exception unused) {
        }
        i = null;
        h = java.lang.Boolean.FALSE;
    }

    public final void c() {
        java.lang.Boolean bool = h;
        a.wv.s(bool);
        if (bool.booleanValue()) {
            return;
        }
        android.os.BatteryManager batteryManager = this.d;
        android.content.Context context = this.f595a;
        if (batteryManager == null) {
            java.lang.Object systemService = context.getSystemService("batterymanager");
            a.wv.t(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            this.d = (android.os.BatteryManager) systemService;
        }
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (!android.provider.Settings.canDrawOverlays(context)) {
            a.ai1.r(context, 2131953205, context, 1);
            return;
        }
        h = java.lang.Boolean.TRUE;
        java.lang.Object systemService2 = context.getSystemService("window");
        a.wv.t(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        g = (android.view.WindowManager) systemService2;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558580, (android.view.ViewGroup) null);
        this.b = inflate;
        a.wv.s(inflate);
        this.c = (android.widget.TextView) inflate.findViewById(2131362563);
        java.lang.Object systemService3 = context.getSystemService("activity");
        a.wv.t(systemService3, "null cannot be cast to non-null type android.app.ActivityManager");
        android.view.View view = this.b;
        a.wv.s(view);
        view.setOnClickListener(new a.fh0(2, this));
        android.view.View view2 = this.b;
        a.wv.s(view2);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("monitor", 0);
        layoutParams.type = 2038;
        layoutParams.format = -3;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 51;
        layoutParams.x = sharedPreferences.getInt("temperature_x", 0);
        layoutParams.y = sharedPreferences.getInt("temperature_y", 0);
        layoutParams.flags = 1064;
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            android.view.WindowManager windowManager = g;
            a.wv.s(windowManager);
            windowManager.addView(view2, layoutParams);
            i = view2;
            view2.setOnTouchListener(new a.qh0(this, layoutParams, sharedPreferences));
            java.util.Timer timer = j;
            if (timer != null) {
                timer.cancel();
                j = null;
            }
            java.util.Timer timer2 = new java.util.Timer("FloatTemperature");
            j = timer2;
            timer2.schedule(new a.hr(10, this), 0L, 1500L);
        } catch (java.lang.Exception e) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("FloatMonitor Error\n" + e.getMessage(), 0);
        }
    }
}
