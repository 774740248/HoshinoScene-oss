package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityMonitorDesigner extends a.p5 {
    public static final /* synthetic */ a.gu0[] m;
    public boolean k;
    public final a.yq1 d = a.b20.i(this, 2131362112);
    public final a.yq1 e = a.b20.i(this, 2131362364);
    public final a.yq1 f = a.b20.i(this, 2131362365);
    public final a.yq1 g = a.b20.i(this, 2131362369);
    public final a.yq1 h = a.b20.i(this, 2131362368);
    public final a.yq1 i = a.b20.i(this, 2131362367);
    public final a.yq1 j = a.b20.i(this, 2131362381);
    public final java.util.List l = a.b20.z0(new a.y31(2131362361, 1), new a.y31(2131362362, 2), new a.y31(2131362360, 4), new a.y31(2131362363, 8), new a.y31(2131362371, 16), new a.y31(2131362379, 32), new a.y31(2131362373, 64), new a.y31(2131362372, 128), new a.y31(2131362378, 256), new a.y31(2131362374, 512), new a.y31(2131362370, 1024), new a.y31(2131362376, 2048), new a.y31(2131362382, 4096), new a.y31(2131362377, 8192), new a.y31(2131362375, 16384), new a.y31(2131362380, 32768), new a.y31(2131362381, 65536));

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "btn_reset", "getBtn_reset()Landroid/widget/ImageView;");
        a.na1.f375a.getClass();
        m = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "designer_filter", "getDesigner_filter()Lcom/omarea/common/ui/Tags;"), new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "designer_ioptions", "getDesigner_ioptions()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "designer_scale", "getDesigner_scale()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "designer_refresh_interval", "getDesigner_refresh_interval()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "designer_preview_monitor", "getDesigner_preview_monitor()Lcom/omarea/ui/fw/FloatMonitorRender;"), new a.d81(com.omarea.vtools.activities.ActivityMonitorDesigner.class, "designer_text_perf_mem", "getDesigner_text_perf_mem()Landroid/view/View;")};
    }

    public final void o() {
        for (a.y31 y31Var : (Iterable<a.y31>) this.l) {
            int intValue = ((java.lang.Number) y31Var.c).intValue();
            int intValue2 = ((java.lang.Number) y31Var.d).intValue();
            android.widget.Switch r2 = (android.widget.Switch) findViewById(intValue);
            r2.setOnCheckedChangeListener(null);
            r2.setChecked(p().m(intValue2));
            r2.setOnCheckedChangeListener(new a.kh(intValue2, 1, this));
        }
        android.view.View a2 = this.j.a(m[6]);
        new java.util.HashMap();
        a2.setEnabled(((java.lang.Boolean) new a.vj1(a.kr.h).a()).booleanValue());
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [a.ja1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [a.ka1, java.lang.Object] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558460);
        setBackArrow();
        com.omarea.ui.fw.FloatMonitorRender p = p();
        a.cp cpVar = com.omarea.Scene.c;
        p.setFlags(a.fs1.D().getInt("monitor_general2_flags", 6391));
        a.gu0[] gu0VarArr = m;
        ((com.omarea.common.ui.Tags) this.e.a(gu0VarArr[1])).a(new java.lang.String[]{"全部", "图形", "文本"}, 0).b = new a.b10(7, new a.rq1(0, (android.widget.LinearLayout) this.f.a(gu0VarArr[2])));
        com.omarea.common.ui.SeekBar seekBar = (com.omarea.common.ui.SeekBar) this.g.a(gu0VarArr[3]);
        a.ka1 obj = new a.ka1();
        float f = a.fs1.D().getFloat("monitor_general2_scale", 1.0f);
        obj.c = (int) (f);
        seekBar.setProgress((int) ((f - 1) * 100));
        seekBar.setFormatter(a.o4.i);
        seekBar.setOnChange(new a.lc1((java.lang.Object) obj, 8, this));
        p().setScaleX(obj.c);
        p().setScaleY(obj.c);
        com.omarea.common.ui.SeekBar seekBar2 = (com.omarea.common.ui.SeekBar) this.h.a(gu0VarArr[4]);
        a.ka1 obj2 = new a.ka1();
        int i = a.fs1.D().getInt("monitor_general2_refresh", 1000);
        obj2.c = i;
        seekBar2.setProgress(i / 100);
        seekBar2.setFormatter(a.o4.j);
        seekBar2.setOnChange(new a.lc1((java.lang.Object) obj2, 9, this));
        p().setRefreshInterval(obj2.c);
        o();
        q();
        ((android.widget.ImageView) this.d.a(gu0VarArr[0])).setOnClickListener(new a.gv(23, this));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        q();
        super.onPause();
        if (this.k) {
            new a.jf0(this).b();
        }
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.k = a.wv.e(a.jf0.b.q(), java.lang.Boolean.TRUE);
        new a.jf0(this);
        a.jf0.a(true);
        setTitle("自定义监视器");
        com.omarea.ui.fw.FloatMonitorRender p = p();
        a.cp cpVar = com.omarea.Scene.c;
        p.setFlags(a.fs1.D().getInt("monitor_general2_flags", 6391));
        o();
    }

    public final com.omarea.ui.fw.FloatMonitorRender p() {
        return (com.omarea.ui.fw.FloatMonitorRender) this.i.a(m[5]);
    }

    public final void q() {
        int flags = p().getFlags();
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.D().edit().putInt("monitor_general2_flags", flags).commit();
    }
}
