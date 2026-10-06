package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class cr extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.BatteryRealtimeStatus g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = batteryRealtimeStatus;
        this.h = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.cr(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        android.widget.TextView battery_cycle;
        android.widget.TextView battery_cycle2;
        a.b20.q1(obj);
        com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus = this.g;
        battery_cycle = batteryRealtimeStatus.getBattery_cycle();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        final int i = this.h;
        sb.append(i);
        sb.append("  ");
        android.text.SpannableString spannableString = new android.text.SpannableString(sb.toString());
        spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, java.lang.String.valueOf(i).length(), 0);
        battery_cycle.setText(spannableString);
        battery_cycle2 = batteryRealtimeStatus.getBattery_cycle();
        battery_cycle2.setOnClickListener(new a.br());
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.cr crVar = (a.cr) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        crVar.e(no1Var);
        return no1Var;
    }
}
