package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zc extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityPowerBench e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(com.omarea.vtools.activities.ActivityPowerBench activityPowerBench, int i) {
        super(0);
        this.d = i;
        this.e = activityPowerBench;
    }

    public final java.lang.Integer a() {
        int i;
        int i2 = this.d;
        java.lang.Integer num = null;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.e;
        switch (i2) {
            case 3:
                activityPowerBench.F.getClass();
                java.util.ArrayList d = a.ls.d();
                a.wv.v(d, "cpuUtil.clusterInfo");
                java.lang.Object l2 = a.qv.l2(d);
                a.wv.v(l2, "cpuUtil.clusterInfo.last()");
                java.lang.Object Q1 = a.op.Q1((java.lang.Object[]) l2);
                a.wv.v(Q1, "cpuUtil.clusterInfo.last().last()");
                return java.lang.Integer.valueOf(a.ls.h(java.lang.Integer.parseInt((java.lang.String) Q1)));
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                activityPowerBench.F.getClass();
                java.util.Iterator it = a.ls.d().iterator();
                int i3 = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    java.lang.String[] strArr = (java.lang.String[]) it.next();
                    a.wv.v(strArr, "cpu");
                    java.lang.Object N1 = a.op.N1(strArr);
                    a.wv.v(N1, "cpu.first()");
                    int parseInt = java.lang.Integer.parseInt((java.lang.String) N1);
                    activityPowerBench.F.getClass();
                    a.nu0 nu0Var = a.nu0.f395a;
                    try {
                        i = java.lang.Integer.parseInt(a.nu0.d("/sys/devices/system/cpu/cpu" + parseInt + "/cpufreq/cpuinfo_min_freq"));
                    } catch (java.lang.Exception unused) {
                        i = -1;
                    }
                    if (i < i3) {
                        i3 = i;
                    }
                }
                return java.lang.Integer.valueOf(i3);
            case 5:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                java.util.Iterator it2 = activityPowerBench.A().iterator();
                if (it2.hasNext()) {
                    num = java.lang.Integer.valueOf(((java.lang.Number) it2.next()).intValue());
                    while (it2.hasNext()) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) it2.next()).intValue());
                        if (num.compareTo(valueOf) < 0) {
                            num = valueOf;
                        }
                    }
                }
                return java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
            default:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityPowerBench.U;
                java.util.Iterator it3 = activityPowerBench.A().iterator();
                if (it3.hasNext()) {
                    num = java.lang.Integer.valueOf(((java.lang.Number) it3.next()).intValue());
                    while (it3.hasNext()) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.lang.Number) it3.next()).intValue());
                        if (num.compareTo(valueOf2) > 0) {
                            num = valueOf2;
                        }
                    }
                }
                return java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
        }
    }

    @Override // a.qo0
    public final java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                java.util.Set keySet = ((java.util.LinkedHashMap) activityPowerBench.O.a()).keySet();
                a.wv.v(keySet, "calcOptions.keys");
                return (java.lang.String[]) keySet.toArray(new java.lang.String[0]);
            case 1:
                a.y31[] y31VarArr = {new a.y31("int", activityPowerBench.getString(2131953140)), new a.y31("float", activityPowerBench.getString(2131953135)), new a.y31("pi", activityPowerBench.getString(2131953148)), new a.y31("json", activityPowerBench.getString(2131953141)), new a.y31("chess", activityPowerBench.getString(2131953125))};
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(a.b20.B0(5));
                a.op.R1(linkedHashMap, y31VarArr);
                return linkedHashMap;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.y31[] y31VarArr2 = {new a.y31("int", activityPowerBench.getString(2131953139)), new a.y31("float", activityPowerBench.getString(2131953134)), new a.y31("pi", " π "), new a.y31("chess", activityPowerBench.getString(2131953124))};
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(a.b20.B0(4));
                a.op.R1(linkedHashMap2, y31VarArr2);
                return linkedHashMap2;
            case 3:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return a();
            case 5:
                return a();
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                return a();
            case 7:
                c();
                return no1Var;
            case 8:
                c();
                return no1Var;
            case 9:
                c();
                return no1Var;
            default:
                return new a.i61(activityPowerBench.getBaseContext());
        }
    }

    public final void c() {
        int i = this.d;
        com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = this.e;
        switch (i) {
            case 7:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityPowerBench.U;
                activityPowerBench.y().setVisibility(8);
                activityPowerBench.x().setVisibility(8);
                ((com.omarea.ui.BlurViewRelativeLayout) activityPowerBench.v.a(com.omarea.vtools.activities.ActivityPowerBench.U[21])).setVisibility(0);
                activityPowerBench.t().setText((java.lang.CharSequence) null);
                activityPowerBench.t().setVisibility(0);
                activityPowerBench.D().setKeepScreenOn(true);
                activityPowerBench.K = a.wv.M0(a.wv.b(a.z80.b), null, new a.ad(activityPowerBench, null), 3);
                return;
            case 8:
                int i2 = a.x60.f681a;
                a.fs1.o(activityPowerBench, 2131558544);
                return;
            default:
                activityPowerBench.F.getClass();
                if (a.gy.G()) {
                    a.q10 q10Var = a.q10.f457a;
                    a.q10.z(new java.lang.String[]{"@ioctl", "/proc/perfmgr_powerhal/ioctl_powerhal", "0x40046703", "1"});
                    return;
                }
                return;
        }
    }
}
