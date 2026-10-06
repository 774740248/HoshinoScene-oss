package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cd1 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd1(int i, java.lang.Object obj) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    public final a.du a() {
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case 12:
                android.content.Context context = ((com.omarea.ui.charge.ChargeCurveView) obj).getContext();
                a.wv.v(context, "this.context");
                return new a.du(context);
            case 13:
                android.content.Context context2 = ((com.omarea.ui.charge.ChargeTempView) obj).getContext();
                a.wv.v(context2, "this.context");
                return new a.du(context2);
            case 14:
                android.content.Context context3 = ((com.omarea.ui.charge.ChargeTimeView) obj).getContext();
                a.wv.v(context3, "this.context");
                return new a.du(context3);
            default:
                android.content.Context context4 = ((com.omarea.ui.power.PowerStatView) obj).getContext();
                a.wv.v(context4, "this.context");
                return new a.du(context4);
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a.wv.r0((a.fr1) obj);
            case 1:
                a.vj1 vj1Var = a.nb1.d;
                if (!a.gy.x().b()) {
                    return a.zd1.a((a.zd1) obj);
                }
                android.content.res.Resources a2 = a.zd1.a((a.zd1) obj);
                a.wv.v(a2, "super.getResources()");
                return new a.yd1(a2, a.gy.x());
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                return e();
            case 3:
                return e();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        return ((a.r51) obj).getWritableDatabase();
                    default:
                        return ((a.i61) obj).getWritableDatabase();
                }
            case 5:
                switch (i) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                        return ((a.r51) obj).getWritableDatabase();
                    default:
                        return ((a.i61) obj).getWritableDatabase();
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return e();
            case 7:
                return f();
            case 8:
                return c();
            case 9:
                return c();
            case 10:
                return c();
            case 11:
                return c();
            case 12:
                return a();
            case 13:
                return a();
            case 14:
                return a();
            case 15:
                switch (i) {
                    case 15:
                        return ((a.vd0) obj).E.getPackageManager();
                    default:
                        return ((com.omarea.vtools.activities.ActivityProcess) obj).getContext().getPackageManager();
                }
            case 16:
                return (android.widget.LinearLayout) ((com.omarea.ui.fps.PerfStallDimensionList) obj).findViewById(2131362736);
            case 17:
                return c();
            case 18:
                return c();
            case 19:
                return a();
            case 20:
                return e();
            case 21:
                return f();
            case 22:
                h();
                return no1Var;
            case 23:
                h();
                return no1Var;
            case 24:
                return e();
            case 25:
                switch (i) {
                    case 15:
                        return ((a.vd0) obj).E.getPackageManager();
                    default:
                        return ((com.omarea.vtools.activities.ActivityProcess) obj).getContext().getPackageManager();
                }
            case 26:
                h();
                return no1Var;
            case 27:
                h();
                return no1Var;
            case 28:
                h();
                return no1Var;
            default:
                h();
                return no1Var;
        }
    }

    public final android.graphics.Paint c() {
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case 8:
                android.graphics.Paint paint = new android.graphics.Paint(1);
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint.setStrokeWidth(((com.omarea.ui.BatteryView) obj).o);
                return paint;
            case 9:
                android.graphics.Paint paint2 = new android.graphics.Paint(1);
                paint2.setStyle(android.graphics.Paint.Style.STROKE);
                paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint2.setStrokeWidth(((com.omarea.ui.FloatMonitorBatteryView) obj).o);
                return paint2;
            case 10:
                android.graphics.Paint paint3 = new android.graphics.Paint(1);
                paint3.setStyle(android.graphics.Paint.Style.STROKE);
                paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint3.setStrokeWidth(((com.omarea.ui.FloatMonitorChartView) obj).o);
                return paint3;
            case 11:
                android.graphics.Paint paint4 = new android.graphics.Paint(1);
                paint4.setStyle(android.graphics.Paint.Style.STROKE);
                paint4.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint4.setStrokeWidth(((com.omarea.ui.ZRamStateView) obj).o);
                return paint4;
            case 17:
                android.graphics.Paint paint5 = new android.graphics.Paint(1);
                paint5.setStyle(android.graphics.Paint.Style.STROKE);
                paint5.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint5.setStrokeWidth(((com.omarea.ui.fw.FloatMonitorBatteryView) obj).o);
                return paint5;
            default:
                android.graphics.Paint paint6 = new android.graphics.Paint(1);
                paint6.setStyle(android.graphics.Paint.Style.STROKE);
                paint6.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                paint6.setStrokeWidth(((com.omarea.ui.fw.FloatMonitorChartView) obj).o);
                return paint6;
        }
    }

    public final java.lang.Boolean e() {
        java.lang.Object r1 = null;
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.nu0 nu0Var = a.nu0.f395a;
                return java.lang.Boolean.valueOf(a.nu0.a((java.lang.String[]) ((a.en1) obj).e) != null);
            case 3:
                return java.lang.Boolean.valueOf((a.op.K1(new java.lang.String[]{"cliffs", "kalama", "cape", "waipio"}, a.gy.u()) || ((a.wc0) obj).d()) ? false : true);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return java.lang.Boolean.valueOf(a.op.K1(new java.lang.String[]{"m2391", "m2392", "m2481", "m2468"}, (java.lang.String) ((a.xa1) obj).e.a()));
            case 20:
                com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = (com.omarea.vtools.activities.ActivityAppDetails) obj;
                a.wv.w(activityAppDetails, "context");
                java.lang.Object systemService = activityAppDetails.getSystemService("accessibility");
                a.wv.t(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.String id = it.next().getId();
                        a.wv.v(id, "serviceInfo.id");
                        if (a.yi1.h2(id, "AccessibilitySceneMode", false)) {
                        }
                    } else {
                        r1 = false;
                    }
                }
                return java.lang.Boolean.valueOf(r1);
            default:
                a.cp cpVar = com.omarea.Scene.c;
                if (!a.fs1.D().getBoolean("dynamic_control", false) || (!a.fs1.D().getBoolean("daemon_auto", true) && !((java.lang.Boolean) ((com.omarea.vtools.activities.ActivityPowerModeTile) obj).c.a()).booleanValue())) {
                    r1 = false;
                }
                return java.lang.Boolean.valueOf(r1);
        }
    }

    public final java.util.ArrayList f() {
        int i = this.d;
        java.lang.Object obj = this.e;
        switch (i) {
            case 7:
                android.content.Context context = ((com.omarea.sysmbol.PerfOptionsRender) obj).getContext();
                a.wv.v(context, "context");
                return new a.po(context, false).f();
            default:
                return new a.po(((com.omarea.vtools.activities.ActivityFastShare) obj).getContext(), false).f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cd1.h():void");
    }
}
