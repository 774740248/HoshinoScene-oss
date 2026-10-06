package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class er extends a.uu0 implements a.bp0 {
    public final /* synthetic */ a.ha1 d;
    public final /* synthetic */ com.omarea.ui.BatteryRealtimeStatus e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er(a.ha1 ha1Var, com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus, boolean z) {
        super(1);
        this.d = ha1Var;
        this.e = batteryRealtimeStatus;
        this.f = z;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        android.widget.ImageView charge_display_light;
        android.content.res.ColorStateList colorStateList;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        a.ha1 ha1Var = this.d;
        ha1Var.c = booleanValue;
        com.omarea.ui.BatteryRealtimeStatus batteryRealtimeStatus = this.e;
        charge_display_light = batteryRealtimeStatus.getCharge_display_light();
        android.graphics.drawable.Drawable drawable = batteryRealtimeStatus.getContext().getDrawable(2131230976);
        a.wv.s(drawable);
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        a.wv.v(mutate, "context.getDrawable(R.dr…able.ic_light)!!.mutate()");
        if (ha1Var.c) {
            colorStateList = batteryRealtimeStatus.getResources().getColorStateList(2131099704);
            a.wv.v(colorStateList, "resources.getColorStateList(R.color.colorAccent)");
            charge_display_light.setAlpha(1.0f);
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = batteryRealtimeStatus.getContext().getString(2131952123);
            a.wv.v(string, "context.getString(R.string.charge_display_keep)");
            a.fs1.X(string, 0);
        } else {
            colorStateList = batteryRealtimeStatus.getResources().getColorStateList(android.R.color.darker_gray);
            a.wv.v(colorStateList, "resources.getColorStateL…roid.R.color.darker_gray)");
            charge_display_light.setAlpha(0.3f);
        }
        a.i90.h(mutate, colorStateList);
        charge_display_light.setImageDrawable(mutate);
        if (this.f) {
            java.lang.String concat = a.yi1.v2("settings get global stay_on_while_plugged_in", " get ", " put ").concat(ha1Var.c ? " 15" : " 0");
            a.wv.w(concat, "cmd");
            a.q10 q10Var = a.q10.f457a;
            a.q10.k(2000L, concat);
        }
        return a.no1.f387a;
    }
}
