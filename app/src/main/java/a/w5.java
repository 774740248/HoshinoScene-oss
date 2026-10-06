package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w5 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeControl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.omarea.vtools.activities.ActivityChargeControl activityChargeControl, a.ey eyVar) {
        super(2, eyVar);
        this.h = activityChargeControl;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.w5(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityChargeControl.L;
            com.omarea.vtools.activities.ActivityChargeControl activityChargeControl = this.h;
            activityChargeControl.getClass();
            com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus = (com.omarea.ui.BatteryRealtimeStatus) activityChargeControl.E.a(com.omarea.vtools.activities.ActivityChargeControl.L[27]);
            this.g = 1;
            if (batteryRealtimeStatus.k(this) == dzVar) {
                return dzVar;
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
        return ((a.w5) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
