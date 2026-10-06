package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityPerfBench extends a.p5 {
    public static final /* synthetic */ a.gu0[] z;
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
    public final a.yq1 o;
    public final a.yq1 p;
    public final a.yq1 q;
    public final a.yq1 r;
    public final a.yq1 s;
    public final a.yq1 t;
    public final a.yq1 u;
    public final a.ls v;
    public final int w;
    public a.qi1 x;
    public final java.lang.String y;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "layout_app_bar", "getLayout_app_bar()Landroid/view/View;");
        a.na1.f375a.getClass();
        z = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_test_options", "getCpu_test_options()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_load_type", "getCpu_load_type()Lcom/omarea/common/ui/Tags;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_bench_threads", "getCpu_bench_threads()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_bench_duration", "getCpu_bench_duration()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_bench_period", "getCpu_bench_period()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_bench_load", "getCpu_bench_load()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "nav_core_control", "getNav_core_control()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_cpuset", "getCpu_cpuset()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_stop", "getCpu_stop()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "cpu_start", "getCpu_start()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "gpu_test_options", "getGpu_test_options()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "gpu_load_type", "getGpu_load_type()Lcom/omarea/common/ui/Tags;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "gpu_start", "getGpu_start()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "bat_test_options", "getBat_test_options()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "bat_state_type", "getBat_state_type()Lcom/omarea/common/ui/Tags;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "bat_capacity", "getBat_capacity()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "bat_stop", "getBat_stop()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "bat_start", "getBat_start()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "lmk_test_options", "getLmk_test_options()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "lmk_app_count", "getLmk_app_count()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "lmk_app_interval", "getLmk_app_interval()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "nav_swap_control", "getNav_swap_control()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityPerfBench.class, "lmk_start", "getLmk_start()Landroid/widget/Button;")};
    }

    public ActivityPerfBench() {
        a.b20.i(this, 2131362729);
        a.b20.i(this, 2131362314);
        this.d = a.b20.i(this, 2131362297);
        this.e = a.b20.i(this, 2131362280);
        this.f = a.b20.i(this, 2131362273);
        this.g = a.b20.i(this, 2131362278);
        this.h = a.b20.i(this, 2131362277);
        this.i = a.b20.i(this, 2131362888);
        this.j = a.b20.i(this, 2131362293);
        this.k = a.b20.i(this, 2131362308);
        this.l = a.b20.i(this, 2131362306);
        a.b20.i(this, 2131362594);
        this.m = a.b20.i(this, 2131362589);
        a.b20.i(this, 2131362593);
        a.b20.i(this, 2131362052);
        this.n = a.b20.i(this, 2131362050);
        this.o = a.b20.i(this, 2131362048);
        this.p = a.b20.i(this, 2131362051);
        this.q = a.b20.i(this, 2131362049);
        a.b20.i(this, 2131362747);
        this.r = a.b20.i(this, 2131362744);
        this.s = a.b20.i(this, 2131362745);
        this.t = a.b20.i(this, 2131362911);
        this.u = a.b20.i(this, 2131362746);
        this.v = new a.ls();
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String n = new a.qc(this, a.fs1.t()).n();
        this.w = (n == null || n.length() == 0) ? 0 : java.lang.Integer.parseInt(n);
        this.y = "addin/alive_benchmark.sh";
    }

    public final void o() {
        a.qi1 qi1Var = this.x;
        if (qi1Var != null) {
            a.wv.p(qi1Var);
        }
        this.x = null;
        a.q10 q10Var = a.q10.f457a;
        a.o4 o4Var = a.o4.l;
        a.lt0 lt0Var = new a.lt0();
        o4Var.i(lt0Var);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "json {\n            \"dura…to 1\n        }.toString()");
        a.q10.L("cpu-bench", lt0Var2, null);
        a.gu0[] gu0VarArr = z;
        ((android.widget.Button) this.l.a(gu0VarArr[10])).setVisibility(0);
        ((android.widget.Button) this.k.a(gu0VarArr[9])).setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r4v14, types: [a.ng1, java.lang.Object] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(2131558463);
        setBackArrow();
        setTitle("模拟测试");
        a.gu0[] gu0VarArr = z;
        final int i2 = 0;
        ((android.widget.TextView) this.i.a(gu0VarArr[7])).setOnClickListener(new a.pc(this));
        final int i3 = 1;
        ((android.widget.TextView) this.t.a(gu0VarArr[22])).setOnClickListener(new a.pc(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = 0;
        while (true) {
            i = this.w;
            if (i4 >= i) {
                break;
            }
            a.ng1 obj = new a.ng1();
            /* TODO: jadx type unresolved, defaulted to Object */
            obj.f381a = a.ii1.d("CPU ", i4);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i4);
            obj.c = sb.toString();
            obj.d = true;
            arrayList.add(obj);
            i4++;
        }
        a.ma1 obj2 = new a.ma1();
        /* TODO: jadx type unresolved, defaulted to Object */
        boolean[] zArr = new boolean[i];
        for (int i5 = 0; i5 < i; i5++) {
            zArr[i5] = true;
        }
        obj2.c = zArr;
        ((android.widget.TextView) this.j.a(gu0VarArr[8])).setOnClickListener(new a.sg(this, arrayList, obj2, 14));
        final int i6 = 2;
        ((com.omarea.common.ui.Tags) this.d.a(gu0VarArr[2])).a(new java.lang.String[]{"整数", "浮点"}, 0).b = a.o4.k;
        ((com.omarea.common.ui.Tags) this.m.a(gu0VarArr[12])).a(new java.lang.String[]{"RenderScript", "Float", "Render"}, 0);
        ((com.omarea.common.ui.Tags) this.n.a(gu0VarArr[15])).a(new java.lang.String[]{"放电", "充电"}, 0);
        ((android.widget.Button) this.l.a(gu0VarArr[10])).setOnClickListener(new a.wi(this, 24, obj2));
        ((android.widget.Button) this.k.a(gu0VarArr[9])).setOnClickListener(new a.pc(this));
        final int i7 = 3;
        ((android.widget.Button) this.q.a(gu0VarArr[18])).setOnClickListener(new a.pc(this));
        ((android.widget.Button) this.p.a(gu0VarArr[17])).setOnClickListener(new a.b41(9));
        final int i8 = 4;
        ((android.widget.Button) this.u.a(gu0VarArr[23])).setOnClickListener(new a.pc(this));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
        o();
    }
}
