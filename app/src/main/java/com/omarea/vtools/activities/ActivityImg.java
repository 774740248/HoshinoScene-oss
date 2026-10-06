package com.omarea.vtools.activities;

import java.io.File;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityImg extends a.p5 {
    public static final /* synthetic */ a.gu0[] l;
    public final a.yq1 d = a.b20.i(this, 2131362218);
    public final a.yq1 e = a.b20.i(this, 2131362219);
    public final a.yq1 f = a.b20.i(this, 2131362676);
    public final a.yq1 g = a.b20.i(this, 2131362945);
    public final a.yq1 h = a.b20.i(this, 2131363151);
    public final a.yq1 i = a.b20.i(this, 2131363152);
    public final a.yq1 j = a.b20.i(this, 2131363167);
    public final a.yq1 k = a.b20.i(this, 2131363315);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityImg.class, "choose_img_flash", "getChoose_img_flash()Landroid/widget/Button;");
        a.na1.f375a.getClass();
        l = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityImg.class, "choose_partition_export", "getChoose_partition_export()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityImg.class, "kernel_version", "getKernel_version()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityImg.class, "os_incremental", "getOs_incremental()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityImg.class, "slot", "getSlot()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityImg.class, "slot_view", "getSlot_view()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityImg.class, "space", "getSpace()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityImg.class, "twrp_injector", "getTwrp_injector()Landroid/widget/Button;")};
    }

    public final void o(java.lang.Runnable runnable) {
        boolean z = false;
        java.lang.String s0 = a.wv.s0(false);
        if (s0 != null && (a.wv.e(s0, "mqsas") || a.wv.e(s0, "xsu"))) {
            z = true;
        }
        a.q10 q10Var = a.q10.f457a;
        boolean g2 = a.yi1.g2(a.q10.l("id"), "gid=1000(system)");
        if (!z && !g2) {
            runnable.run();
        } else {
            int i = a.x60.f681a;
            a.fs1.Z(this, "危险操作", "你的设备可能未解锁BL，修改系统分区会导致无法开机，确定要继续吗？", new a.fw(29, runnable), null, 16);
        }
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.String B = a.fs1.B(this, intent.getData());
            if (B == null) {
                android.widget.Toast.makeText(this, getString(2131952532), 0).show();
                return;
            } else if (a.yi1.h2(B, ".img", false)) {
                p(B);
                return;
            } else {
                android.widget.Toast.makeText(this, getString(2131952531), 0).show();
                return;
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("file")) {
            android.widget.Toast.makeText(this, getString(2131952532), 0).show();
            return;
        }
        android.os.Bundle extras2 = intent.getExtras();
        a.wv.s(extras2);
        java.lang.String string = extras2.getString("file");
        a.wv.s(string);
        p(string);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        setContentView(2131558455);
        setBackArrow();
        java.lang.String n0 = a.wv.n0("ro.boot.slot_suffix");
        int length = n0.length();
        a.gu0[] gu0VarArr = l;
        if (length == 0) {
            ((android.widget.LinearLayout) this.i.a(gu0VarArr[5])).setVisibility(8);
        } else {
            ((android.widget.TextView) this.h.a(gu0VarArr[4])).setText(n0);
        }
        long j = 1024;
        long availableBytes = (new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getAvailableBytes() / j) / j;
        android.widget.TextView textView = (android.widget.TextView) this.j.a(gu0VarArr[6]);
        if (availableBytes > 8192) {
            str = (availableBytes / j) + "GB";
        } else {
            str = availableBytes + "MB";
        }
        textView.setText(str);
        java.lang.String n02 = a.wv.n0("ro.build.version.incremental");
        ((android.widget.TextView) this.g.a(gu0VarArr[3])).setText(a.wv.x1(android.os.Build.VERSION.SDK_INT) + "   " + n02);
        a.nu0 nu0Var = a.nu0.f395a;
        final int i = 2;
        ((android.widget.TextView) this.f.a(gu0VarArr[2])).setText(a.nu0.d("/proc/version"));
        boolean z = false;
        z = false;
        z = false;
        android.widget.Button button = (android.widget.Button) this.d.a(gu0VarArr[0]);
        final int i2 = z ? 1 : 0;
        button.setOnClickListener(new a.wa(this));
        final int i3 = 1;
        ((android.widget.Button) this.e.a(gu0VarArr[1])).setOnClickListener(new a.wa(this));
        a.gu0 gu0Var = gu0VarArr[7];
        a.yq1 yq1Var = this.k;
        android.widget.Button button2 = (android.widget.Button) yq1Var.a(gu0Var);
        if (a.b20.E0() && !a.b20.C && !a.b20.D) {
            z = true;
        }
        button2.setEnabled(z);
        ((android.widget.Button) yq1Var.a(gu0VarArr[7])).setOnClickListener(new a.wa(this));
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952912));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [a.ng1, java.lang.Object] */
    public final void p(java.lang.String str) {
        java.util.ArrayList<a.mc1> arrayList;
        new a.b81(this, null);
        new android.os.Handler(android.os.Looper.getMainLooper());
        java.util.ArrayList k0 = a.wv.k0();
        if (k0 != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : k0) {
                a.mc1 mc1Var = (a.mc1) obj;
                if (!a.wv.e(mc1Var.b, "data") && !a.wv.e(mc1Var.b, "userdata")) {
                    arrayList.add((a.mc1) (obj));
                }
            }
        } else {
            arrayList = null;
        }
        java.lang.String substring = str.substring(a.yi1.q2(str, "/", 6) + 1, a.yi1.q2(str, ".", 6));
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        java.lang.String lowerCase = substring.toLowerCase(java.util.Locale.ROOT);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (arrayList == null) {
            int i = a.x60.f681a;
            java.lang.String string = getString(2131952166);
            a.wv.v(string, "getString(R.string.device_unsupport)");
            a.fs1.G(this, string, null);
            return;
        }
        android.content.Context context = getContext();
        boolean z = getThemeMode().f442a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
        for (a.mc1 mc1Var2 : arrayList) {
            a.ng1 obj2 = new a.ng1();
            obj2.c = mc1Var2.c;
            java.lang.String str2 = mc1Var2.b;
            obj2.f381a = str2;
            obj2.d = a.wv.e(str2, lowerCase);
            arrayList2.add(obj2);
        }
        a.b70 b70Var = new a.b70(z, new java.util.ArrayList(arrayList2), false, new a.p4(this, 2, str), 7);
        java.lang.String string2 = context.getString(2131952526);
        a.wv.v(string2, "context.getString(R.string.img_choose_partition)");
        b70Var.t0 = string2;
        b70Var.Y();
        java.lang.String concat = "IMG File: ".concat(str);
        a.wv.w(concat, "message");
        b70Var.u0 = concat;
        b70Var.X();
        b70Var.V(getSupportFragmentManager(), "partitions-chooser");
    }
}
