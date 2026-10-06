package com.omarea.vtools.activities;

import android.view.View;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivitySwap extends a.p5 {
    public static final /* synthetic */ a.gu0[] W;
    public final a.yq1 A;
    public final a.yq1 B;
    public final a.yq1 C;
    public final a.yq1 D;
    public final a.yq1 E;
    public final a.yq1 F;
    public final a.yq1 G;
    public final a.yq1 H;
    public final a.yq1 I;
    public final a.yq1 J;
    public final a.yq1 K;
    public final a.yq1 L;
    public a.b81 M;
    public android.content.SharedPreferences N;
    public int O;
    public final a.pj1 P;
    public final a.gy Q;
    public final java.lang.String R;
    public java.util.Timer S;
    public java.util.LinkedHashMap T;
    public final a.dg U;
    public final a.dg V;
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
    public final a.yq1 v;
    public final a.yq1 w;
    public final a.yq1 x;
    public final a.yq1 y;
    public final a.yq1 z;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "layout_app_bar", "getLayout_app_bar()Landroid/view/View;");
        a.na1.f375a.getClass();
        W = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_module_installed", "getSwap_module_installed()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_module_uninstalled", "getSwap_module_uninstalled()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_module_downloadable", "getSwap_module_downloadable()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_module_bench", "getSwap_module_bench()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_lmk_enhanced", "getSwap_lmk_enhanced()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_lmk_enhanced_desc", "getSwap_lmk_enhanced_desc()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_usage", "getSwap_usage()Lcom/omarea/ui/ZRamStateView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_usage_ratio", "getSwap_usage_ratio()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_state", "getSwap_state()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "txt_swap_size_display", "getTxt_swap_size_display()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "txt_swap_auto_start", "getTxt_swap_auto_start()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "btn_swap_create", "getBtn_swap_create()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "btn_swap_close", "getBtn_swap_close()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_config_zram", "getSwap_config_zram()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_usage", "getZram_usage()Lcom/omarea/ui/ZRamStateView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_usage_ratio", "getZram_usage_ratio()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_state", "getZram_state()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "txt_zram_size_display", "getTxt_zram_size_display()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_compact_algorithm", "getZram_compact_algorithm()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "txt_zram_auto_start", "getTxt_zram_auto_start()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "btn_zram_resize", "getBtn_zram_resize()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_swappiness_display", "getSwap_swappiness_display()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "extra_free_view", "getExtra_free_view()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "extra_free_kbytes_display", "getExtra_free_kbytes_display()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "watermark_scale_factor_display", "getWatermark_scale_factor_display()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swappiness_adj", "getSwappiness_adj()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_auto_lmk_wrap", "getSwap_auto_lmk_wrap()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_auto_lmk", "getSwap_auto_lmk()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "swap_lmk_current", "getSwap_lmk_current()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "list_swaps", "getList_swaps()Landroid/widget/ListView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_stat", "getZram_stat()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_stat_title", "getZram_stat_title()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram0_stat", "getZram0_stat()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "zram_stat_desc", "getZram_stat_desc()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "txt_swap_io", "getTxt_swap_io()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivitySwap.class, "txt_mem", "getTxt_mem()Landroid/widget/TextView;")};
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [a.gy, java.lang.Object] */
    public ActivitySwap() {
        a.b20.i(this, 2131362729);
        this.d = a.b20.i(this, 2131363208);
        this.e = a.b20.i(this, 2131363209);
        this.f = a.b20.i(this, 2131363207);
        this.g = a.b20.i(this, 2131363206);
        this.h = a.b20.i(this, 2131363204);
        a.b20.i(this, 2131363205);
        this.i = a.b20.i(this, 2131363218);
        this.j = a.b20.i(this, 2131363219);
        this.k = a.b20.i(this, 2131363216);
        this.l = a.b20.i(this, 2131363319);
        this.m = a.b20.i(this, 2131363317);
        this.n = a.b20.i(this, 2131362121);
        this.o = a.b20.i(this, 2131362120);
        this.p = a.b20.i(this, 2131363201);
        this.q = a.b20.i(this, 2131363386);
        this.r = a.b20.i(this, 2131363387);
        this.s = a.b20.i(this, 2131363385);
        this.t = a.b20.i(this, 2131363321);
        this.u = a.b20.i(this, 2131363379);
        this.v = a.b20.i(this, 2131363320);
        this.w = a.b20.i(this, 2131362122);
        this.x = a.b20.i(this, 2131363217);
        this.y = a.b20.i(this, 2131362470);
        this.z = a.b20.i(this, 2131362469);
        this.A = a.b20.i(this, 2131363364);
        this.B = a.b20.i(this, 2131363220);
        this.C = a.b20.i(this, 2131363199);
        this.D = a.b20.i(this, 2131363198);
        this.E = a.b20.i(this, 2131363203);
        this.F = a.b20.i(this, 2131362743);
        this.G = a.b20.i(this, 2131363382);
        this.H = a.b20.i(this, 2131363384);
        this.I = a.b20.i(this, 2131363377);
        this.J = a.b20.i(this, 2131363383);
        this.K = a.b20.i(this, 2131363318);
        this.L = a.b20.i(this, 2131363316);
        this.O = 2048;
        a.cp cpVar = com.omarea.Scene.c;
        this.P = new a.pj1(a.fs1.t());
        this.Q = new a.gy();
        this.R = "addin/alive_benchmark.sh";
        this.U = new a.dg(this, 0);
        this.V = new a.dg(this, 1);
    }

    public static final android.widget.TextView o(com.omarea.vtools.activities.ActivitySwap activitySwap) {
        return (android.widget.TextView) activitySwap.k.a(W[9]);
    }

    public static final java.lang.String p(com.omarea.vtools.activities.ActivitySwap activitySwap) {
        java.lang.String string;
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d = a.nu0.d("/proc/vmstat");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            for (java.lang.String str : (Iterable<java.lang.String>) a.yi1.y2(d, new java.lang.String[]{"\n"})) {
                if (a.yi1.B2(str, "pswpin")) {
                    string = activitySwap.getString(2131953560);
                    a.wv.v(string, "getString(R.string.swap_read)");
                } else if (a.yi1.B2(str, "pswpout")) {
                    string = activitySwap.getString(2131953589);
                    a.wv.v(string, "getString(R.string.swap_write)");
                }
                java.lang.String str2 = (java.lang.String) a.yi1.y2(str, new java.lang.String[]{" "}).get(1);
                sb.append(string);
                long parseLong = (java.lang.Long.parseLong(str2) * 4) / 1024;
                if (parseLong > 10240) {
                    java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) parseLong) / 1024.0f)}, 1));
                    a.wv.v(format, "format(format, *args)");
                    sb.append(format);
                    sb.append("GB\n");
                } else {
                    sb.append(parseLong);
                    sb.append("MB\n");
                }
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "text.toString()");
        return a.yi1.F2(sb2).toString();
    }

    public static java.lang.String u(java.lang.String str) {
        try {
            long j = 1024;
            return ((java.lang.Long.parseLong(str) / j) / j) + "MB";
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivitySwap.onCreate(android.os.Bundle):void");
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        a.b81 b81Var = this.M;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        super.onDestroy();
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        java.util.Timer timer = this.S;
        if (timer != null) {
            timer.cancel();
        }
        this.S = null;
        android.content.SharedPreferences sharedPreferences = this.N;
        if (sharedPreferences == null) {
            a.wv.M1("swapConfig");
            throw null;
        }
        this.Q.getClass();
        a.gy.P(sharedPreferences);
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952925));
        android.content.SharedPreferences sharedPreferences = this.N;
        if (sharedPreferences == null) {
            a.wv.M1("swapConfig");
            throw null;
        }
        this.Q.getClass();
        if (a.gy.v()) {
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            a.nu0 nu0Var = a.nu0.f395a;
            java.util.List y2 = a.yi1.y2(a.nu0.d("/data/swap_config.conf"), new java.lang.String[]{"\n"});
            try {
                edit.putBoolean("swap", a.wv.e(a.gy.A("swap", y2), "true"));
                edit.putInt("swap_size", java.lang.Integer.parseInt(a.gy.A("swap_size", y2)));
                edit.putInt("swap_priority", java.lang.Integer.parseInt(a.gy.A("swap_priority", y2)));
                edit.putBoolean("swap_use_loop", a.wv.e(a.gy.A("swap_use_loop", y2), "true"));
            } catch (java.lang.Exception unused) {
            }
            try {
                edit.putBoolean("zram", a.wv.e(a.gy.A("zram", y2), "true"));
                edit.putInt("zram_size", java.lang.Integer.parseInt(a.gy.A("zram_size", y2)));
                edit.putString("comp_algorithm", a.gy.A("comp_algorithm", y2));
            } catch (java.lang.Exception unused2) {
            }
            try {
                edit.putInt("swappiness", java.lang.Integer.parseInt(a.gy.A("swappiness", y2)));
                edit.putInt("extra_free_kbytes", java.lang.Integer.parseInt(a.gy.A("extra_free_kbytes", y2)));
            } catch (java.lang.Exception unused3) {
            }
            try {
                edit.putInt("watermark_scale", java.lang.Integer.parseInt(a.gy.A("watermark_scale_factor", y2)));
            } catch (java.lang.Exception unused4) {
            }
            edit.apply();
        }
        java.util.Timer timer = this.S;
        if (timer != null) {
            timer.cancel();
        }
        this.S = null;
        java.util.Timer timer2 = new java.util.Timer("ActivitySwaps");
        timer2.schedule(new a.hr(5, this), 0L, 5000L);
        this.S = timer2;
    }

    public final android.widget.Button q() {
        return (android.widget.Button) this.o.a(W[13]);
    }

    public final android.widget.Button r() {
        return (android.widget.Button) this.n.a(W[12]);
    }

    public final android.widget.TextView s() {
        return (android.widget.TextView) this.f.a(W[3]);
    }

    public final void t() {
        android.view.View inflate = getLayoutInflater().inflate(2131558552, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        a.wv.v(inflate, "view");
        a.v60 m = a.fs1.m(this, inflate, true);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363211);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363213);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView3 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363212);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView4 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363200);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView5 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363210);
        a.x81 x81Var = new a.x81(switchOptionItemView, switchOptionItemView2, switchOptionItemView3);
        android.content.SharedPreferences sharedPreferences = this.N;
        if (sharedPreferences == null) {
            a.wv.M1("swapConfig");
            throw null;
        }
        int i2 = sharedPreferences.getInt("swap_priority", -2);
        if (i2 == 0) {
            x81Var.d(1);
        } else if (i2 != 5) {
            x81Var.d(2);
        } else {
            x81Var.d(0);
        }
        android.content.SharedPreferences sharedPreferences2 = this.N;
        if (sharedPreferences2 == null) {
            a.wv.M1("swapConfig");
            throw null;
        }
        switchOptionItemView5.setChecked(sharedPreferences2.getBoolean("swap_use_loop", false));
        android.content.SharedPreferences sharedPreferences3 = this.N;
        if (sharedPreferences3 == null) {
            a.wv.M1("swapConfig");
            throw null;
        }
        switchOptionItemView4.setChecked(sharedPreferences3.getBoolean("swap", false));
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 11));
        inflate.findViewById(2131362098).setOnClickListener(new a.bg(m, x81Var, switchOptionItemView, switchOptionItemView2, switchOptionItemView3, this, switchOptionItemView5, switchOptionItemView4));
    }

    public final java.util.Timer v() {
        java.util.Timer timer = new java.util.Timer("ZramOFF");
        this.P.getClass();
        timer.schedule(new a.fg(this, a.pj1.i(), java.lang.System.currentTimeMillis(), 1), 0L, 1000L);
        return timer;
    }
}
