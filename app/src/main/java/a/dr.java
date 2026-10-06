package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class dr extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.BatteryRealtimeStatus h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus, a.ey eyVar) {
        super(2, eyVar);
        this.h = batteryRealtimeStatus;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.dr(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus = this.h;
            batteryRealtimeStatus.o.getClass();
            a.nu0 nu0Var = a.nu0.f395a;
            a.y31 a2 = a.nu0.a(new java.lang.String[]{"/sys/class/oplus_chg/battery/battery_cc", "/sys/class/power_supply/battery/cycle_count", "/sys/class/qcom-battery/fg1_cycle", "/sys/class/qcom-battery/fake_cycle", "/sys/class/power_supply/mtk-battery/cycle_count"});
            java.lang.String str = a2 != null ? (java.lang.String) a2.d : null;
            int parseInt = str != null ? java.lang.Integer.parseInt(str) : -1;
            if (parseInt > -1) {
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.cr crVar = new a.cr(batteryRealtimeStatus, parseInt, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, crVar, this) == dzVar) {
                    return dzVar;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.dr) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
