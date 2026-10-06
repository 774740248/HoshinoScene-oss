package com.omarea.vtools;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class AccessibilitySceneMode extends android.accessibilityservice.AccessibilityService implements a.wr0 {
    public static long C = android.os.SystemClock.uptimeMillis();
    public static long D;
    public static final /* synthetic */ int E = 0;
    public final long A;
    public boolean B;
    public boolean c;
    public final boolean d = true;
    public java.util.ArrayList e = new java.util.ArrayList();
    public int f = 1080;
    public int g = 2340;
    public boolean h;
    public a.gb0 i;
    public a.x01 j;
    public final java.util.ArrayList k;
    public int l;
    public final int m;
    public final int n;
    public long o;
    public long p;
    public java.lang.String q;
    public a.wp r;
    public final java.util.ArrayList s;
    public final java.util.Map t;
    public final java.util.Set u;
    public final android.util.LruCache v;
    public final a.vj1 w;
    public java.util.Timer x;
    public long y;
    public final long z;

    public AccessibilitySceneMode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("com.android.systemui");
        this.k = arrayList;
        this.m = 4194336;
        this.n = 4196384;
        this.s = a.b20.f(4, 2, 5, 3, -1);
        a.b20.f(4, 2, 5, -1);
        a.y31[] y31VarArr = {new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandUI", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandUI00", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandUI01", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandUI02", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandUI03", "com.tencent.mm:appbrand"), new a.y31("com.tencent.mm.plugin.appbrand.ui.AppBrandUI04", "com.tencent.mm:appbrand")};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(a.b20.B0(9));
        a.op.R1(linkedHashMap, y31VarArr);
        this.t = linkedHashMap;
        this.u = a.b20.k1("com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI", "com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI", "com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI", "com.tencent.mm.plugin.appbrand.ui.AppBrandUI", "com.tencent.mm.plugin.appbrand.ui.AppBrandUI00", "com.tencent.mm.plugin.appbrand.ui.AppBrandUI01", "com.tencent.mm.plugin.appbrand.ui.AppBrandUI02", "com.tencent.mm.plugin.appbrand.ui.AppBrandUI03", "com.tencent.mm.plugin.appbrand.ui.AppBrandUI04", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", "com.tencent.mm.plugin.recordvideo.activity.MMRecordUI", "com.tencent.wework.login.controller.LoginScannerActivity", "com.tencent.mobileqq.olympic.activity.ScanTorchActivity", "com.tencent.aelight.camera.aebase.QIMCameraCaptureActivity", "dov.com.qq.im.QIMCameraCaptureActivity", "com.alipay.mobile.scan.as.main.MainCaptureActivity", "com.jd.lib.scan.lib.zxing.client.android.CaptureActivity", "com.jd.lib.scan.lib.zxing.client.android.NewCaptureActivity", "com.etao.feimagesearch.capture.CaptureActivity", "com.bilibili.app.qrcode.QRcodeCaptureActivity", "com.oplus.scanner.ui.main.CameraActivity", "com.xiaomi.scanner.app.ScanActivity", "com.flyme.scanner.CaptureActivity", "kt.com.fcbox.hiveconsumer.app.business.scan.ScanActivity");
        this.v = new android.util.LruCache(10);
        this.w = new a.vj1(a.m0.d);
        this.z = 7000L;
        this.A = 3000L;
    }

    public static void e(com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode) {
        accessibilitySceneMode.f();
        synchronized (accessibilitySceneMode) {
            accessibilitySceneMode.y = java.lang.System.currentTimeMillis();
            if (accessibilitySceneMode.x == null) {
                java.util.Timer timer = new java.util.Timer("ActivityContentAnalyser");
                a.hr hrVar = new a.hr(1, accessibilitySceneMode);
                long j = accessibilitySceneMode.A;
                timer.schedule(hrVar, j, j);
                accessibilitySceneMode.x = timer;
            }
        }
    }

    public final void a() {
        java.lang.Object systemService = getSystemService("window");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.graphics.Point point = new android.graphics.Point();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        int i = point.x;
        if (i != this.f || point.y != this.g) {
            this.f = i;
            this.g = point.y;
        }
        this.h = (getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:211|(5:231|(1:233)|(2:219|(1:221))|222|(2:224|225)(1:226))|214|215|216|217|(0)|222|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04b6, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04bc A[Catch: Exception -> 0x053d, TRY_ENTER, TryCatch #1 {Exception -> 0x053d, blocks: (B:197:0x0481, B:199:0x048c, B:208:0x047c, B:219:0x04bc, B:221:0x04ea, B:222:0x04ed, B:224:0x0509, B:229:0x0496, B:231:0x049c, B:233:0x04a2, B:237:0x051a, B:238:0x0532, B:240:0x0536), top: B:187:0x043e }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0509 A[Catch: Exception -> 0x053d, TryCatch #1 {Exception -> 0x053d, blocks: (B:197:0x0481, B:199:0x048c, B:208:0x047c, B:219:0x04bc, B:221:0x04ea, B:222:0x04ed, B:224:0x0509, B:229:0x0496, B:231:0x049c, B:233:0x04a2, B:237:0x051a, B:238:0x0532, B:240:0x0536), top: B:187:0x043e }] */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x051a A[Catch: Exception -> 0x053d, TryCatch #1 {Exception -> 0x053d, blocks: (B:197:0x0481, B:199:0x048c, B:208:0x047c, B:219:0x04bc, B:221:0x04ea, B:222:0x04ed, B:224:0x0509, B:229:0x0496, B:231:0x049c, B:233:0x04a2, B:237:0x051a, B:238:0x0532, B:240:0x0536), top: B:187:0x043e }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0536 A[Catch: Exception -> 0x053d, TRY_LEAVE, TryCatch #1 {Exception -> 0x053d, blocks: (B:197:0x0481, B:199:0x048c, B:208:0x047c, B:219:0x04bc, B:221:0x04ea, B:222:0x04ed, B:224:0x0509, B:229:0x0496, B:231:0x049c, B:233:0x04a2, B:237:0x051a, B:238:0x0532, B:240:0x0536), top: B:187:0x043e }] */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x006c A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #5 {Exception -> 0x0053, blocks: (B:259:0x004c, B:23:0x005a, B:25:0x005e, B:26:0x0066, B:31:0x0075, B:33:0x009d, B:35:0x00a5, B:37:0x00a9, B:38:0x00b4, B:40:0x00b8, B:41:0x00bd, B:43:0x00c2, B:49:0x00d2, B:50:0x00df, B:52:0x00e5, B:53:0x00eb, B:58:0x0118, B:59:0x00af, B:60:0x013c, B:61:0x0140, B:63:0x0146, B:65:0x0153, B:72:0x015e, B:73:0x0167, B:79:0x0177, B:126:0x0199, B:131:0x01ba, B:256:0x006c), top: B:258:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: Exception -> 0x0053, TRY_ENTER, TryCatch #5 {Exception -> 0x0053, blocks: (B:259:0x004c, B:23:0x005a, B:25:0x005e, B:26:0x0066, B:31:0x0075, B:33:0x009d, B:35:0x00a5, B:37:0x00a9, B:38:0x00b4, B:40:0x00b8, B:41:0x00bd, B:43:0x00c2, B:49:0x00d2, B:50:0x00df, B:52:0x00e5, B:53:0x00eb, B:58:0x0118, B:59:0x00af, B:60:0x013c, B:61:0x0140, B:63:0x0146, B:65:0x0153, B:72:0x015e, B:73:0x0167, B:79:0x0177, B:126:0x0199, B:131:0x01ba, B:256:0x006c), top: B:258:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146 A[Catch: Exception -> 0x0053, TryCatch #5 {Exception -> 0x0053, blocks: (B:259:0x004c, B:23:0x005a, B:25:0x005e, B:26:0x0066, B:31:0x0075, B:33:0x009d, B:35:0x00a5, B:37:0x00a9, B:38:0x00b4, B:40:0x00b8, B:41:0x00bd, B:43:0x00c2, B:49:0x00d2, B:50:0x00df, B:52:0x00e5, B:53:0x00eb, B:58:0x0118, B:59:0x00af, B:60:0x013c, B:61:0x0140, B:63:0x0146, B:65:0x0153, B:72:0x015e, B:73:0x0167, B:79:0x0177, B:126:0x0199, B:131:0x01ba, B:256:0x006c), top: B:258:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e A[Catch: Exception -> 0x0053, TryCatch #5 {Exception -> 0x0053, blocks: (B:259:0x004c, B:23:0x005a, B:25:0x005e, B:26:0x0066, B:31:0x0075, B:33:0x009d, B:35:0x00a5, B:37:0x00a9, B:38:0x00b4, B:40:0x00b8, B:41:0x00bd, B:43:0x00c2, B:49:0x00d2, B:50:0x00df, B:52:0x00e5, B:53:0x00eb, B:58:0x0118, B:59:0x00af, B:60:0x013c, B:61:0x0140, B:63:0x0146, B:65:0x0153, B:72:0x015e, B:73:0x0167, B:79:0x0177, B:126:0x0199, B:131:0x01ba, B:256:0x006c), top: B:258:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.accessibility.AccessibilityEvent r32) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.AccessibilitySceneMode.b(android.view.accessibility.AccessibilityEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (a.yi1.B2(r5, "com.tencent.mobileqq:mini") != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.AccessibilitySceneMode.c(java.lang.String):void");
    }

    public final boolean d() {
        a.gb0 gb0Var;
        a.cp cpVar = com.omarea.Scene.c;
        if (!a.fs1.s("frame_time_monitor", false)) {
            a.x01 x01Var = this.j;
            if (x01Var != null && x01Var.b) {
                ((android.view.WindowManager) x01Var.f).removeView((android.view.View) x01Var.c);
                x01Var.b = false;
                java.util.ArrayList arrayList = a.dc0.f93a;
                a.dc0.d((a.cf0) x01Var.g);
            }
            this.j = null;
        } else if (this.j == null) {
            a.x01 x01Var2 = new a.x01(this);
            x01Var2.d();
            this.j = x01Var2;
        }
        boolean s = a.fs1.s("scene_logview", false);
        if (s && this.i == null) {
            this.i = new a.gb0(this);
            return true;
        }
        if (!s && (gb0Var = this.i) != null) {
            if (gb0Var.f175a) {
                ((android.view.WindowManager) gb0Var.e).removeView((android.view.View) gb0Var.b);
                gb0Var.f175a = false;
            }
            this.i = null;
        }
        return false;
    }

    @Override // a.wr0
    public final boolean eventFilter(a.kc0 kc0Var) {
        return kc0Var == a.kc0.p || kc0Var == a.kc0.q || kc0Var == a.kc0.j || kc0Var == a.kc0.r;
    }

    public final void f() {
        synchronized (this) {
            try {
                java.util.Timer timer = this.x;
                if (timer != null) {
                    if (timer != null) {
                        timer.cancel();
                    }
                    java.util.Timer timer2 = this.x;
                    if (timer2 != null) {
                        timer2.purge();
                    }
                    this.x = null;
                    g(false);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L20
            a.cp r4 = com.omarea.Scene.c
            java.lang.String r4 = "is_auto_install"
            r0 = 0
            boolean r4 = a.fs1.s(r4, r0)
            if (r4 != 0) goto L1d
            java.lang.String r4 = "is_skip_ad"
            boolean r4 = a.fs1.s(r4, r0)
            if (r4 != 0) goto L1d
            java.lang.String r4 = "is_auto_allow"
            boolean r4 = a.fs1.s(r4, r0)
            if (r4 == 0) goto L20
        L1d:
            int r4 = r3.n
            goto L22
        L20:
            int r4 = r3.m
        L22:
            int r0 = r3.l
            if (r0 != r4) goto L27
            return
        L27:
            r3.l = r4
            android.accessibilityservice.AccessibilityServiceInfo r0 = r3.getServiceInfo()
            if (r0 != 0) goto L30
            return
        L30:
            r0.eventTypes = r4
            r4 = 16
            r0.feedbackType = r4
            r1 = 0
            r0.notificationTimeout = r1
            r4 = 0
            r0.packageNames = r4
            r4 = 82
            r0.flags = r4
            r3.setServiceInfo(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.AccessibilitySceneMode.g(boolean):void");
    }

    public final void h(android.view.accessibility.AccessibilityWindowInfo accessibilityWindowInfo, long j) {
        int id = accessibilityWindowInfo.getId();
        java.lang.String str = (java.lang.String) this.v.get(java.lang.Integer.valueOf(id));
        if (str != null) {
            if (!a.wv.e((java.lang.String) this.w.a(), str) || (accessibilityWindowInfo.isFocused() && accessibilityWindowInfo.isActive())) {
                c(str);
                return;
            }
            return;
        }
        a.ty tyVar = a.z80.b;
        a.r0 r0Var = new a.r0(accessibilityWindowInfo, j, this, id, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, r0Var) : new a.f(W, true);
        av0Var.S(i2, av0Var, r0Var);
    }

    @Override // a.wr0
    public final boolean isAsync() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x019c, code lost:
    
        r7 = (a.s51) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019e, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a0, code lost:
    
        r0 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a2, code lost:
    
        if (r0 == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a4, code lost:
    
        if (r0 == 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a6, code lost:
    
        new a.kh0(r1).b(r5, "android.permission.SYSTEM_ALERT_WINDOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        a.wv.M1("mode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04d8 A[Catch: Exception -> 0x03f2, TryCatch #8 {Exception -> 0x03f2, blocks: (B:196:0x0379, B:198:0x037f, B:200:0x0386, B:203:0x03b7, B:206:0x03f7, B:208:0x0418, B:209:0x041a, B:211:0x043d, B:213:0x0445, B:215:0x044d, B:218:0x0456, B:220:0x0490, B:221:0x0473, B:223:0x047b, B:225:0x0483, B:229:0x049e, B:231:0x04ad, B:235:0x04c9, B:237:0x04cf, B:239:0x04d8, B:240:0x04f6, B:242:0x0505, B:244:0x050a, B:247:0x0516, B:249:0x051c, B:251:0x0543, B:253:0x0549, B:258:0x03d0), top: B:195:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f6 A[Catch: Exception -> 0x03f2, TryCatch #8 {Exception -> 0x03f2, blocks: (B:196:0x0379, B:198:0x037f, B:200:0x0386, B:203:0x03b7, B:206:0x03f7, B:208:0x0418, B:209:0x041a, B:211:0x043d, B:213:0x0445, B:215:0x044d, B:218:0x0456, B:220:0x0490, B:221:0x0473, B:223:0x047b, B:225:0x0483, B:229:0x049e, B:231:0x04ad, B:235:0x04c9, B:237:0x04cf, B:239:0x04d8, B:240:0x04f6, B:242:0x0505, B:244:0x050a, B:247:0x0516, B:249:0x051c, B:251:0x0543, B:253:0x0549, B:258:0x03d0), top: B:195:0x0379 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.accessibilityservice.AccessibilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent r27) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.AccessibilitySceneMode.onAccessibilityEvent(android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 1) {
            this.c = false;
        } else if (i == 2) {
            this.c = true;
        }
        a();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.c(this);
        a.dc0.a(a.kc0.o, null);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    @Override // a.wr0
    public final void onReceive(a.kc0 kc0Var, java.util.HashMap hashMap) {
        if (kc0Var == a.kc0.p) {
            if (d()) {
                b(null);
                return;
            }
            return;
        }
        if (kc0Var == a.kc0.j) {
            a.cp cpVar = com.omarea.Scene.c;
            com.omarea.Scene.d.postDelayed(new a.fw(23, this), 2000L);
        } else {
            if (kc0Var == a.kc0.r) {
                b(null);
                return;
            }
            if (kc0Var == a.kc0.q) {
                g(false);
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string = getString(2131951829);
                a.wv.v(string, "getString(R.string.accessibility_updated)");
                a.fs1.X(string, 0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [a.fp0, a.lj1] */
    @Override // android.accessibilityservice.AccessibilityService
    public final void onServiceConnected() {
        super.onServiceConnected();
        C = android.os.SystemClock.uptimeMillis();
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.D().getBoolean("daemon_auto", true) && !a.fs1.s("is_auto_install", false) && !a.fs1.s("is_auto_allow", false) && !a.fs1.s("is_skip_ad", false) && !a.fs1.s("keep_alive", false)) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
        }
        android.content.res.Configuration configuration = getResources().getConfiguration();
        a.wv.v(configuration, "this.resources.configuration");
        int i = configuration.orientation;
        if (i == 1) {
            this.c = false;
        } else if (i == 2) {
            this.c = true;
        }
        a();
        this.B = true;
        g(false);
        a();
        d();
        boolean s = a.fs1.s("is_skip_ad", false);
        a.kq0 kq0Var = a.kq0.c;
        if (s && a.fs1.s("is_skip_ad_precise2", false)) {
            a.wv.M0(kq0Var, a.z80.b, new a.xp(false, this, null), 2);
        }
        a.wv.M0(kq0Var, a.z80.b, new a.p0(this, null), 2);
    }

    @Override // a.wr0
    public final void onSubscribe() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [a.fp0, a.lj1] */
    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        this.B = false;
        java.util.ArrayList arrayList = a.dc0.f93a;
        a.dc0.d(this);
        f();
        stopSelf();
        stopSelf();
        a.vj1 vj1Var = a.oq0.c;
        a.oq0.j = "";
        a.oq0.k = null;
        a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
        return super.onUnbind(intent);
    }

    @Override // a.wr0
    public final void onUnsubscribe() {
    }
}
