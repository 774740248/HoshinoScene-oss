package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class fr extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.BatteryRealtimeStatus g;
    public final /* synthetic */ a.ha1 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int j;
    public final /* synthetic */ double k;
    public final /* synthetic */ double l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus, a.ha1 ha1Var, float f, int i, double d, double d2, a.ey eyVar) {
        super(2, eyVar);
        this.g = batteryRealtimeStatus;
        this.h = ha1Var;
        this.i = f;
        this.j = i;
        this.k = d;
        this.l = d2;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.fr(this.g, this.h, this.i, this.j, this.k, this.l, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        double r5 = 0.0d;
        android.widget.TextView charge_state;
        android.widget.TextView battrystatus_level;
        android.widget.TextView battery_size;
        android.widget.TextView battery_temperature;
        android.widget.TextView battery_status;
        android.widget.TextView battery_power;
        android.widget.TextView battery_charge_power;
        java.lang.String str;
        com.omarea.ui.BatteryView battery_capacity_chart;
        android.widget.TextView battrystatus_level2;
        android.widget.TextView battrystatus_level3;
        android.widget.TextView battrystatus_level4;
        a.b20.q1(obj);
        com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus = this.g;
        charge_state = batteryRealtimeStatus.getCharge_state();
        android.content.Context context = batteryRealtimeStatus.getContext();
        a.vj1 vj1Var = a.oq0.c;
        int i = a.oq0.i;
        a.ha1 ha1Var = this.h;
        int i2 = 2131952048;
        if (i != 1) {
            if (i == 2) {
                ha1Var.c = true;
                i2 = 2131952043;
            } else if (i == 3) {
                i2 = 2131952044;
            } else if (i == 4) {
                i2 = 2131952046;
            } else if (i == 5) {
                i2 = 2131952045;
            }
        }
        charge_state.setText(context.getString(i2));
        float f = this.i;
        int i3 = this.j;
        if (f > -1.0f) {
            java.lang.String str2 = f + "%";
            android.text.SpannableString spannableString = new android.text.SpannableString(str2);
            if (a.yi1.g2(str2, ".")) {
                battrystatus_level3 = batteryRealtimeStatus.getBattrystatus_level();
                spannableString.setSpan(new android.text.style.AbsoluteSizeSpan((int) (battrystatus_level3.getTextSize() * 0.3d), false), a.yi1.m2(str2, ".", 0, false, 6), a.yi1.q2(str2, "%", 6), 33);
                battrystatus_level4 = batteryRealtimeStatus.getBattrystatus_level();
                spannableString.setSpan(new android.text.style.AbsoluteSizeSpan((int) (battrystatus_level4.getTextSize() * 0.5d), false), a.yi1.m2(str2, "%", 0, false, 6), str2.length(), 33);
            }
            battrystatus_level2 = batteryRealtimeStatus.getBattrystatus_level();
            battrystatus_level2.setText(spannableString);
        } else {
            battrystatus_level = batteryRealtimeStatus.getBattrystatus_level();
            battrystatus_level.setText(i3 + "%");
        }
        battery_size = batteryRealtimeStatus.getBattery_size();
        double d = 1000;
        battery_size.setText(a.oq0.c() + "mAh (≈" + a.ai1.l(new java.lang.Object[]{new java.lang.Double(a.oq0.d() / d)}, 1, "%.1f", "format(format, *args)") + "Wh)");
        battery_temperature = batteryRealtimeStatus.getBattery_temperature();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        double d2 = this.k;
        sb.append(d2);
        sb.append("℃");
        battery_temperature.setText(sb.toString());
        battery_status = batteryRealtimeStatus.getBattery_status();
        battery_status.setText(this.l + "v");
        battery_power = batteryRealtimeStatus.getBattery_power();
        battery_power.setText(a.oq0.e());
        battery_charge_power = batteryRealtimeStatus.getBattery_charge_power();
        if (ha1Var.c) {
            str = a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf((((a.oq0.h * a.oq0.f()) + (a.oq0.l ? 1.2d : 0.0d)) / 0.92d < 0.0d ? 0 : (int) r5) / d)}, 1, "%.1fW?", "format(format, *args)");
        } else {
            str = "--";
        }
        battery_charge_power.setText(str);
        battery_capacity_chart = batteryRealtimeStatus.getBattery_capacity_chart();
        battery_capacity_chart.getClass();
        int i4 = 100 - ((int) (((100.0f - i3) * 100.0d) / 100.0f));
        battery_capacity_chart.l = i4;
        battery_capacity_chart.t = (float) d2;
        battery_capacity_chart.m = i4;
        battery_capacity_chart.invalidate();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.fr frVar = (a.fr) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        frVar.e(no1Var);
        return no1Var;
    }
}
