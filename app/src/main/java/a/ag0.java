package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ag0 {
    public static java.util.Timer A;
    public static android.view.WindowManager x;
    public static android.view.View z;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f9a;
    public final a.r51 b;
    public long c;
    public long d;
    public int e;
    public int f;
    public java.lang.String g;
    public java.lang.Integer h;
    public java.lang.String i;
    public double j;
    public final a.cf0 k;
    public android.view.View l;
    public android.widget.TextView m;
    public android.widget.FrameLayout n;
    public android.view.View o;
    public final a.gy p;
    public final a.vj1 q;
    public final a.vj1 r;
    public final a.ls s;
    public final a.m11 t;
    public java.lang.String u;
    public final boolean v;
    public static final a.fa0 w = new a.fa0(19, 0);
    public static java.lang.Boolean y = java.lang.Boolean.FALSE;

    /* JADX WARN: Type inference failed for: r3v2, types: [a.gy, java.lang.Object] */
    public ag0(android.content.Context context) {
        a.wv.w(context, "mContext");
        this.f9a = context;
        this.b = new a.r51(context);
        this.k = new a.cf0(1, this);
        a.gy obj = new a.gy();
        a.gy.l = a.gy.t();
        this.p = obj;
        this.q = new a.vj1(new a.nf0(this, 1));
        this.r = new a.vj1(new a.nf0(this, 0));
        this.s = new a.ls();
        this.t = new a.m11();
        a.q10 q10Var = a.q10.f457a;
        this.v = a.wv.e(a.q10.t(), "root");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:11|12|(5:13|14|15|16|17)|18|19|(2:21|(29:23|24|25|26|27|28|29|(3:31|(2:34|32)|35)|36|37|38|39|(2:42|40)|43|44|45|(3:48|(1:50)(3:51|52|53)|46)|55|(3:57|(2:59|60)|61)|62|63|(1:66)|67|68|(1:70)|71|(1:75)|73|74))|81|24|25|26|27|28|29|(0)|36|37|38|39|(1:40)|43|44|45|(1:46)|55|(0)|62|63|(1:66)|67|68|(0)|71|(0)|73|74) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:11|12|13|14|15|16|17|18|19|(2:21|(29:23|24|25|26|27|28|29|(3:31|(2:34|32)|35)|36|37|38|39|(2:42|40)|43|44|45|(3:48|(1:50)(3:51|52|53)|46)|55|(3:57|(2:59|60)|61)|62|63|(1:66)|67|68|(1:70)|71|(1:75)|73|74))|81|24|25|26|27|28|29|(0)|36|37|38|39|(1:40)|43|44|45|(1:46)|55|(0)|62|63|(1:66)|67|68|(0)|71|(0)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x05a7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x069e, code lost:
    
        r5 = r25;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029d A[LOOP:7: B:145:0x029b->B:146:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0541 A[Catch: Exception -> 0x069b, TryCatch #3 {Exception -> 0x069b, blocks: (B:29:0x04b3, B:31:0x0541, B:32:0x0545, B:34:0x054b, B:36:0x0562, B:39:0x057c, B:40:0x058d, B:42:0x0593, B:44:0x059b, B:45:0x05a8, B:46:0x05b8, B:48:0x05c2, B:50:0x05fe, B:52:0x0614, B:53:0x061a, B:57:0x061d, B:59:0x0623), top: B:28:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0593 A[Catch: kt0 -> 0x05a7, Exception -> 0x069b, LOOP:1: B:40:0x058d->B:42:0x0593, LOOP_END, TryCatch #3 {Exception -> 0x069b, blocks: (B:29:0x04b3, B:31:0x0541, B:32:0x0545, B:34:0x054b, B:36:0x0562, B:39:0x057c, B:40:0x058d, B:42:0x0593, B:44:0x059b, B:45:0x05a8, B:46:0x05b8, B:48:0x05c2, B:50:0x05fe, B:52:0x0614, B:53:0x061a, B:57:0x061d, B:59:0x0623), top: B:28:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05c2 A[Catch: Exception -> 0x069b, TryCatch #3 {Exception -> 0x069b, blocks: (B:29:0x04b3, B:31:0x0541, B:32:0x0545, B:34:0x054b, B:36:0x0562, B:39:0x057c, B:40:0x058d, B:42:0x0593, B:44:0x059b, B:45:0x05a8, B:46:0x05b8, B:48:0x05c2, B:50:0x05fe, B:52:0x0614, B:53:0x061a, B:57:0x061d, B:59:0x0623), top: B:28:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x061d A[Catch: Exception -> 0x069b, TryCatch #3 {Exception -> 0x069b, blocks: (B:29:0x04b3, B:31:0x0541, B:32:0x0545, B:34:0x054b, B:36:0x0562, B:39:0x057c, B:40:0x058d, B:42:0x0593, B:44:0x059b, B:45:0x05a8, B:46:0x05b8, B:48:0x05c2, B:50:0x05fe, B:52:0x0614, B:53:0x061a, B:57:0x061d, B:59:0x0623), top: B:28:0x04b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /* JADX WARN: Type inference failed for: r0v10, types: [a.g11, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [a.k11, a.f11, a.h11] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(a.ag0 r46, a.ey r47) {
        /*
            Method dump skipped, instructions count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ag0.a(a.ag0, a.ey):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [a.bp0, a.lj1] */
    public final void b(boolean z2) {
        java.util.Timer timer = A;
        if (timer != null) {
            timer.cancel();
            A = null;
        }
        android.view.View view = z;
        if (view != null) {
            android.view.WindowManager windowManager = x;
            if (windowManager != null) {
                windowManager.removeView(view);
            } else {
                a.b20.q1(view);
            }
            z = null;
        }
        y = java.lang.Boolean.FALSE;
        x = null;
        this.c = -1L;
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.d(this.k);
        if (z2) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("monitor_fps", false);
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        a.fs1.c((bp0) new a.lj1(1, null));
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [a.bp0, a.lj1] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, a.ma1] */
    public final void c() {
        java.lang.Boolean bool = y;
        a.wv.s(bool);
        if (!bool.booleanValue() || z == null) {
            java.lang.Boolean bool2 = y;
            a.wv.s(bool2);
            if (bool2.booleanValue()) {
                a.wv.s(this);
                b(true);
            }
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("monitor_fps", true);
            java.lang.System.currentTimeMillis();
            android.content.Context context = this.f9a;
            if (!(context instanceof android.accessibilityservice.AccessibilityService) && !android.provider.Settings.canDrawOverlays(context)) {
                a.ai1.r(context, 2131953205, context, 1);
                return;
            }
            y = java.lang.Boolean.TRUE;
            a.ma1 systemService = (ma1) context.getSystemService("window");
            a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            x = (android.view.WindowManager) systemService;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558570, (android.view.ViewGroup) null);
            this.l = inflate;
            a.wv.s(inflate);
            this.m = (android.widget.TextView) inflate.findViewById(2131362557);
            android.view.View view = this.l;
            a.wv.s(view);
            this.n = (android.widget.FrameLayout) view.findViewById(2131362534);
            a.ma1 obj = new a.ma1();
            android.view.View view2 = this.l;
            a.wv.s(view2);
            android.view.View findViewById = view2.findViewById(2131362558);
            a.wv.s(findViewById);
            a.qf0 qf0Var = new a.qf0(0, findViewById);
            findViewById.setOnClickListener(new a.b41(12));
            android.view.View findViewById2 = findViewById.findViewById(2131362440);
            a.wv.v(findViewById2, "findViewById(R.id.duration_5m)");
            android.view.View findViewById3 = findViewById.findViewById(2131362437);
            a.wv.v(findViewById3, "findViewById(R.id.duration_10m)");
            android.view.View findViewById4 = findViewById.findViewById(2131362438);
            a.wv.v(findViewById4, "findViewById(R.id.duration_15m)");
            android.view.View findViewById5 = findViewById.findViewById(2131362439);
            a.wv.v(findViewById5, "findViewById(R.id.duration_30m)");
            android.view.View[] viewArr = {findViewById2, findViewById3, findViewById4, findViewById5};
            obj.c = new a.e9(this, 3, viewArr);
            int i = 0;
            for (int i2 = 4; i < i2; i2 = 4) {
                android.view.View view3 = viewArr[i];
                view3.setOnClickListener(new a.d41(qf0Var, obj, this, view3, 10));
                i++;
            }
            this.o = findViewById;
            android.view.View view4 = this.l;
            if (view4 != null) {
                view4.setOnClickListener(new a.sg(this, context, obj, 24));
            }
            android.view.View view5 = this.l;
            a.wv.s(view5);
            z = view5;
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
            layoutParams.gravity = 8388661;
            layoutParams.y = a.b20.M(context, 65.0f);
            layoutParams.x = a.b20.M(context, 10.0f);
            layoutParams.flags = 1064;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            android.view.WindowManager windowManager = x;
            a.wv.s(windowManager);
            try {
                windowManager.addView(z, layoutParams);
            } catch (java.lang.Throwable th) {
                layoutParams = null;
                z = null;
            }
            android.view.View view6 = this.l;
            if (view6 != null) {
                view6.setOnTouchListener(new a.uf0(layoutParams));
            }
            java.util.Timer timer = A;
            if (timer != null) {
                timer.cancel();
                A = null;
            }
            java.util.Timer timer2 = new java.util.Timer("FloatMonitorFPS");
            A = timer2;
            timer2.schedule(new a.hr(7, this), 0L, 1000L);
            a.cp cpVar2 = com.omarea.Scene.c;
            a.fs1.c((bp0) new a.lj1(1, null));
            java.util.ArrayList arrayList = a.dc0.f93a;
            a.dc0.c(this.k);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a.fp0, a.lj1] */
    public final void d() {
        long j = this.c;
        if (j > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.d;
            if (currentTimeMillis < 5000) {
                this.b.a(j);
            } else {
                a.cp cpVar = com.omarea.Scene.c;
                if (a.fs1.D().getBoolean("auto_upload", true) && currentTimeMillis >= 60000 && currentTimeMillis <= 2400000) {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.xf0(this, j, null), 3);
                }
            }
        }
        this.c = -1L;
        this.g = null;
        this.u = null;
        android.widget.FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            android.content.Context context = frameLayout.getContext();
            java.lang.Object obj = a.zx.f748a;
            frameLayout.setBackground(a.xx.b(context, 2131230944));
            frameLayout.setAlpha(1.0f);
        }
        android.view.View view = this.o;
        if (view != null) {
            view.setVisibility(8);
        }
        a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
    }
}
