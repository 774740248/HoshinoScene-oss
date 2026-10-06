package com.omarea.ui;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class BatteryRealtimeStatus extends android.widget.LinearLayout {
    public static final /* synthetic */ a.gu0[] p;
    public final a.yq1 c;
    public final a.yq1 d;
    public final a.yq1 e;
    public final a.yq1 f;
    public final a.yq1 g;
    public final a.yq1 h;
    public final a.yq1 i;
    public final a.yq1 j;
    public final a.yq1 k;
    public final a.yq1 l;
    public final a.yq1 m;
    public final a.yq1 n;
    public final a.mr o;

    static {
        a.d81 d81Var = new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "view_realtime_values", "getView_realtime_values()Lcom/omarea/ui/BatteryRealtimeStatus;");
        a.na1.f375a.getClass();
        p = new a.gu0[]{d81Var, new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_capacity_wrap", "getBattery_capacity_wrap()Landroid/widget/FrameLayout;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_capacity_chart", "getBattery_capacity_chart()Lcom/omarea/ui/BatteryView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battrystatus_level", "getBattrystatus_level()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "charge_state", "getCharge_state()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "charge_display_light", "getCharge_display_light()Landroid/widget/ImageView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_power", "getBattery_power()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_charge_power", "getBattery_charge_power()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_temperature", "getBattery_temperature()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_status", "getBattery_status()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_cycle", "getBattery_cycle()Landroid/widget/TextView;"), new a.d81(com.omarea.ui.BatteryRealtimeStatus.class, "battery_size", "getBattery_size()Landroid/widget/TextView;")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.ha1, java.lang.Object] */
    public BatteryRealtimeStatus(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a.wv.w(context, "context");
        this.c = a.b20.j(this, 2131363351);
        this.d = a.b20.j(this, 2131362056);
        this.e = a.b20.j(this, 2131362055);
        this.f = a.b20.j(this, 2131362078);
        this.g = a.b20.j(this, 2131362135);
        this.h = a.b20.j(this, 2131362134);
        this.i = a.b20.j(this, 2131362068);
        this.j = a.b20.j(this, 2131362057);
        this.k = a.b20.j(this, 2131362073);
        this.l = a.b20.j(this, 2131362072);
        this.m = a.b20.j(this, 2131362059);
        this.n = a.b20.j(this, 2131362069);
        this.o = new a.mr();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k81.b);
        a.wv.v(obtainStyledAttributes, "context.obtainStyledAttr…trs, R.styleable.NavItem)");
        android.view.LayoutInflater.from(context).inflate(2131558614, (android.view.ViewGroup) this, true);
        obtainStyledAttributes.recycle();
        a.ty tyVar = a.z80.b;
        a.dr drVar = new a.dr(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        tyVar = i != 0 ? tyVar2 : tyVar;
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, drVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, drVar);
        a.q10 q10Var = a.q10.f457a;
        boolean K1 = a.op.K1(new java.lang.String[]{"root", "adb"}, a.q10.t());
        a.ha1 obj = new a.ha1();
        a.er erVar = new a.er(obj, this, K1);
        if (K1) {
            java.lang.String k = a.q10.k(2000L, "settings get global stay_on_while_plugged_in");
            erVar.i(java.lang.Boolean.valueOf((k.length() == 0 || a.wv.e(k, "0")) ? false : true));
        }
        getCharge_display_light().setOnClickListener(new a.wi(erVar, 7, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.omarea.ui.BatteryView getBattery_capacity_chart() {
        return (com.omarea.ui.BatteryView) this.e.a(p[2]);
    }

    private final android.widget.FrameLayout getBattery_capacity_wrap() {
        return (android.widget.FrameLayout) this.d.a(p[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattery_charge_power() {
        return (android.widget.TextView) this.j.a(p[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattery_cycle() {
        return (android.widget.TextView) this.m.a(p[10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattery_power() {
        return (android.widget.TextView) this.i.a(p[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattery_size() {
        return (android.widget.TextView) this.n.a(p[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattery_status() {
        return (android.widget.TextView) this.l.a(p[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattery_temperature() {
        return (android.widget.TextView) this.k.a(p[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getBattrystatus_level() {
        return (android.widget.TextView) this.f.a(p[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.ImageView getCharge_display_light() {
        return (android.widget.ImageView) this.h.a(p[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getCharge_state() {
        return (android.widget.TextView) this.g.a(p[4]);
    }

    private final com.omarea.ui.BatteryRealtimeStatus getView_realtime_values() {
        return (com.omarea.ui.BatteryRealtimeStatus) this.c.a(p[0]);
    }

    public final int getColorAccent() {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(2130968793, typedValue, true);
        return typedValue.data;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [a.ha1, java.lang.Object] */
    public final java.lang.Object k(a.ey eyVar) {
        a.vj1 vj1Var = a.oq0.c;
        int i = a.oq0.f;
        double d = a.oq0.f417a;
        float d2 = this.o.d(i);
        double f = a.oq0.f();
        a.ha1 obj = new a.ha1();
        a.u20 u20Var = a.z80.f728a;
        java.lang.Object S1 = a.wv.S1(a.by0.f57a, new a.fr(this, obj, d2, i, d, f, null), eyVar);
        return S1 == a.dz.c ? (a.ha1) S1 : a.no1.f387a;
    }
}
