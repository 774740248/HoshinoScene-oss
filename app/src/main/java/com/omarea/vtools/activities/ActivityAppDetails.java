package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppDetails extends a.p5 {
    public static final /* synthetic */ a.gu0[] X;
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
    public java.lang.String L;
    public a.en1 M;
    public com.omarea.model.SceneConfigInfo N;
    public boolean O;
    public int P;
    public android.content.SharedPreferences Q;
    public final a.xa1 R;
    public final a.yi S;
    public final a.wc0 T;
    public java.util.ArrayList U;
    public boolean V;
    public final a.vj1 W;
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
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "drawer_layout", "getDrawer_layout()Landroidx/drawerlayout/widget/DrawerLayout;");
        a.na1.f375a.getClass();
        X = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_icon", "getApp_details_icon()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_name", "getApp_details_name()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_packagename", "getApp_details_packagename()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "scene_mode_allow", "getScene_mode_allow()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "scene_mode_config", "getScene_mode_config()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_perf", "getApp_details_perf()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_dynamic", "getApp_details_dynamic()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_game", "getApp_game()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_category", "getApp_category()Lcom/omarea/common/ui/Tags;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas", "getApp_fas()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_enable", "getApp_fas_enable()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_external", "getApp_fas_external()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_adjust", "getApp_fas_adjust()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_adjust_fps", "getApp_fas_adjust_fps()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_offset", "getApp_fas_offset()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_adjust_offset", "getApp_fas_adjust_offset()Lcom/omarea/common/ui/SeekBar;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_levels", "getApp_fas_levels()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_fas_fps_levels_btn", "getApp_fas_fps_levels_btn()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_refresh_rate_max", "getApp_refresh_rate_max()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_refresh_rate_max_btn", "getApp_refresh_rate_max_btn()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_refresh_rate_min", "getApp_refresh_rate_min()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_refresh_rate_min_btn", "getApp_refresh_rate_min_btn()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_auto", "getApp_details_auto()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_aloowlight", "getApp_details_aloowlight()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_gps", "getApp_details_gps()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "scene_orientation", "getScene_orientation()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_assist", "getApp_details_assist()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_immerse", "getApp_details_immerse()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_hidenav", "getApp_details_hidenav()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_hidestatus", "getApp_details_hidestatus()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_details_hidenotice", "getApp_details_hidenotice()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "app_monitor", "getApp_monitor()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "custom_actions_list", "getCustom_actions_list()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "custom_actions_add", "getCustom_actions_add()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "task_custom_actions", "getTask_custom_actions()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityAppDetails.class, "text", "getText()Landroid/widget/TextView;")};
    }

    public ActivityAppDetails() {
        a.b20.i(this, 2131362435);
        this.d = a.b20.i(this, 2131361976);
        this.e = a.b20.i(this, 2131361978);
        this.f = a.b20.i(this, 2131361979);
        this.g = a.b20.i(this, 2131363031);
        this.h = a.b20.i(this, 2131363032);
        this.i = a.b20.i(this, 2131361980);
        this.j = a.b20.i(this, 2131361970);
        a.b20.i(this, 2131361994);
        this.k = a.b20.i(this, 2131361963);
        this.l = a.b20.i(this, 2131361985);
        this.m = a.b20.i(this, 2131361989);
        this.n = a.b20.i(this, 2131361990);
        this.o = a.b20.i(this, 2131361986);
        this.p = a.b20.i(this, 2131361987);
        this.q = a.b20.i(this, 2131361993);
        this.r = a.b20.i(this, 2131361988);
        this.s = a.b20.i(this, 2131361992);
        this.t = a.b20.i(this, 2131361991);
        this.u = a.b20.i(this, 2131362022);
        this.v = a.b20.i(this, 2131362023);
        this.w = a.b20.i(this, 2131362024);
        this.x = a.b20.i(this, 2131362025);
        this.y = a.b20.i(this, 2131361968);
        this.z = a.b20.i(this, 2131361966);
        this.A = a.b20.i(this, 2131361972);
        this.B = a.b20.i(this, 2131363033);
        this.C = a.b20.i(this, 2131361967);
        this.D = a.b20.i(this, 2131361977);
        this.E = a.b20.i(this, 2131361973);
        this.F = a.b20.i(this, 2131361975);
        this.G = a.b20.i(this, 2131361974);
        this.H = a.b20.i(this, 2131362001);
        this.I = a.b20.i(this, 2131362329);
        this.J = a.b20.i(this, 2131362328);
        this.K = a.b20.i(this, 2131363255);
        a.b20.i(this, 2131363256);
        this.L = "";
        this.R = new a.xa1();
        a.cp cpVar = com.omarea.Scene.c;
        this.S = new a.yi(a.fs1.t());
        this.T = new a.wc0();
        this.W = new a.vj1(new a.cd1(20, this));
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
    }

    public final android.widget.Switch o() {
        return (android.widget.Switch) this.E.a(X[29]);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025d  */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityAppDetails.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        a.wv.w(menu, "menu");
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        a.wv.w(menuItem, "item");
        if (menuItem.getItemId() == 2131361938) {
            z();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        android.content.pm.PackageInfo packageInfo;
        super.onResume();
        android.content.SharedPreferences sharedPreferences = getSharedPreferences("powercfg", 0);
        try {
            packageInfo = getPackageManager().getPackageInfo(this.L, 0);
        } catch (java.lang.Exception unused) {
            android.widget.Toast.makeText(getApplicationContext(), getString(2131952141), 0).show();
            packageInfo = null;
        }
        if (packageInfo == null) {
            super.finish();
            return;
        }
        android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            super.finish();
            return;
        }
        a.gu0[] gu0VarArr = X;
        ((android.widget.TextView) this.e.a(gu0VarArr[2])).setText(applicationInfo.loadLabel(getPackageManager()));
        ((android.widget.TextView) this.f.a(gu0VarArr[3])).setText(packageInfo.packageName);
        ((android.widget.ImageView) this.d.a(gu0VarArr[1])).setImageDrawable(applicationInfo.loadIcon(getPackageManager()));
        android.widget.TextView textView = (android.widget.TextView) this.j.a(gu0VarArr[7]);
        a.nk nkVar = a.b11.c;
        java.lang.String string = sharedPreferences.getString(this.L, null);
        if (string == null) {
            string = "";
        }
        textView.setText(a.tg1.n(string));
        java.lang.String str = packageInfo.packageName;
        a.wv.v(str, "packageInfo.packageName");
        boolean e = a.wv.e(this.S.c(str), java.lang.Boolean.TRUE);
        android.widget.Switch q = q();
        java.lang.String str2 = u().packageName;
        a.wv.v(str2, "sceneConfigInfo.packageName");
        a.wc0 wc0Var = this.T;
        q.setTag(java.lang.Boolean.valueOf(wc0Var.f(str2)));
        wc0Var.getClass();
        int i = 8;
        if (!a.wc0.g()) {
            ((android.widget.LinearLayout) this.l.a(gu0VarArr[10])).setVisibility(8);
        } else if (e) {
            android.widget.Switch q2 = q();
            java.lang.String str3 = u().packageName;
            a.wv.v(str3, "sceneConfigInfo.packageName");
            q2.setChecked(wc0Var.f(str3));
        }
        this.R.getClass();
        if (a.xa1.a()) {
            s().setVisibility(0);
            x();
        } else {
            s().setVisibility(8);
        }
        if (e) {
            t().setVisibility(8);
        } else {
            t().setVisibility(s().getVisibility());
        }
        r().setVisibility((e && q().isChecked()) ? 0 : 8);
        a.en1 en1Var = this.M;
        if (en1Var == null) {
            a.wv.M1("immersivePolicyControl");
            throw null;
        }
        if (en1Var.e(this.L)) {
            o().setChecked(true);
            p().setChecked(true);
        } else {
            android.widget.Switch o = o();
            a.en1 en1Var2 = this.M;
            if (en1Var2 == null) {
                a.wv.M1("immersivePolicyControl");
                throw null;
            }
            java.lang.String str4 = this.L;
            a.wv.w(str4, "packageName");
            o.setChecked(en1Var2.f((java.lang.String) en1Var2.e, str4));
            android.widget.Switch p = p();
            a.en1 en1Var3 = this.M;
            if (en1Var3 == null) {
                a.wv.M1("immersivePolicyControl");
                throw null;
            }
            java.lang.String str5 = this.L;
            a.wv.w(str5, "packageName");
            p.setChecked(en1Var3.f((java.lang.String) en1Var3.f, str5));
        }
        ((android.widget.Switch) this.G.a(gu0VarArr[31])).setChecked(u().disNotice);
        ((android.widget.Switch) this.z.a(gu0VarArr[24])).setChecked(u().aloneLight);
        ((android.widget.Switch) this.A.a(gu0VarArr[25])).setChecked(u().gpsOn);
        ((android.widget.Switch) this.H.a(gu0VarArr[32])).setChecked(u().showMonitor);
        android.widget.Switch v = v();
        if (this.Q == null) {
            a.wv.M1("sceneBlackList");
            throw null;
        }
        v.setChecked(!this.Q.contains(this.L));
        android.widget.LinearLayout w = w();
        if (w().getVisibility() == 0 && v().isChecked()) {
            i = 0;
        }
        w.setVisibility(i);
        ((android.widget.TextView) this.B.a(gu0VarArr[26])).setText(new a.nk(this, 19).u(java.lang.Integer.valueOf(u().screenOrientation)));
        getSharedPreferences("scene_actions", 0);
        java.util.ArrayList f = new a.l1(this, 11).f();
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(f, 10));
        java.util.Iterator it = f.iterator();
        while (it.hasNext()) {
            a.s10 s10Var = (a.s10) it.next();
            a.s10 s10Var2 = new a.s10();
            s10Var2.b(s10Var.c);
            s10Var2.a(s10Var.d);
            arrayList.add(s10Var2);
        }
        java.lang.String str6 = u().packageName;
        a.wv.v(str6, "sceneConfigInfo.packageName");
        android.content.SharedPreferences sharedPreferences2 = getSharedPreferences("scene_actions", 0);
        java.util.ArrayList f2 = new a.l1(this, 11).f();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(f2, 10));
        java.util.Iterator it2 = f2.iterator();
        while (it2.hasNext()) {
            a.s10 s10Var3 = (a.s10) it2.next();
            a.s10 s10Var4 = new a.s10();
            s10Var4.b(s10Var3.c);
            s10Var4.a(s10Var3.d);
            arrayList2.add(s10Var4);
        }
        java.util.Set<java.lang.String> stringSet = sharedPreferences2.getStringSet(str6, null);
        if (stringSet == null) {
            stringSet = new android.util.ArraySet<>();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (stringSet.contains(((a.s10) obj).d)) {
                arrayList3.add(obj);
            }
        }
        this.U = arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(a.op.J1(arrayList3, 10));
        java.util.Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.s10) it3.next()).c);
        }
        ((android.widget.TextView) this.K.a(gu0VarArr[35])).setText(a.yi1.F2(a.qv.j2(arrayList4, "\n\n", null, null, null, 62)).toString());
    }

    public final android.widget.Switch p() {
        return (android.widget.Switch) this.F.a(X[30]);
    }

    public final android.widget.Switch q() {
        return (android.widget.Switch) this.m.a(X[11]);
    }

    public final android.widget.LinearLayout r() {
        return (android.widget.LinearLayout) this.n.a(X[12]);
    }

    public final android.widget.LinearLayout s() {
        return (android.widget.LinearLayout) this.u.a(X[19]);
    }

    public final android.widget.LinearLayout t() {
        return (android.widget.LinearLayout) this.w.a(X[21]);
    }

    public final com.omarea.model.SceneConfigInfo u() {
        com.omarea.model.SceneConfigInfo sceneConfigInfo = this.N;
        if (sceneConfigInfo != null) {
            return sceneConfigInfo;
        }
        a.wv.M1("sceneConfigInfo");
        throw null;
    }

    public final android.widget.Switch v() {
        return (android.widget.Switch) this.g.a(X[4]);
    }

    public final android.widget.LinearLayout w() {
        return (android.widget.LinearLayout) this.h.a(X[5]);
    }

    public final void x() {
        a.va1 c = this.R.c(this.L);
        a.yq1 yq1Var = this.v;
        a.yq1 yq1Var2 = this.x;
        a.gu0[] gu0VarArr = X;
        if (c == null) {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[22])).setText(getString(2131951791));
            ((android.widget.TextView) yq1Var.a(gu0VarArr[20])).setText(getString(2131951791));
            return;
        }
        ((android.widget.TextView) yq1Var2.a(gu0VarArr[22])).setText(c.b + "Hz");
        ((android.widget.TextView) yq1Var.a(gu0VarArr[20])).setText(c.f629a + "Hz");
    }

    public final void y() {
        a.me1 me1Var;
        com.omarea.model.SceneConfigInfo c = new a.au(this, 2).c(u().packageName);
        if (u().screenOrientation == c.screenOrientation && u().aloneLight == c.aloneLight && u().disNotice == c.disNotice && u().disButton == c.disButton && u().gpsOn == c.gpsOn && u().freeze == c.freeze && u().showMonitor == c.showMonitor) {
            setResult(this.P, getIntent());
        } else {
            setResult(-1, getIntent());
        }
        if (!new a.au(this, 2).o(u())) {
            android.widget.Toast.makeText(getApplicationContext(), getString(2131952134), 1).show();
        } else if (u().freeze != c.freeze && u().freeze && (me1Var = a.me1.p) != null) {
            java.lang.String str = u().packageName;
            a.wv.v(str, "sceneConfigInfo.packageName");
            me1Var.m(str);
        }
        java.lang.Object tag = q().getTag();
        a.wc0 wc0Var = this.T;
        if (tag != null) {
            wc0Var.getClass();
            if (a.wc0.g()) {
                java.lang.Object tag2 = q().getTag();
                a.wv.t(tag2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((java.lang.Boolean) tag2).booleanValue() != q().isChecked()) {
                    java.lang.String str2 = u().packageName;
                    a.wv.v(str2, "sceneConfigInfo.packageName");
                    wc0Var.h(str2, q().isChecked());
                }
            }
        }
        a.gu0[] gu0VarArr = X;
        com.omarea.common.ui.SeekBar seekBar = (com.omarea.common.ui.SeekBar) this.p.a(gu0VarArr[14]);
        if (seekBar.getTag() != null && !a.wv.e(seekBar.getTag(), java.lang.Integer.valueOf(seekBar.getProgress()))) {
            java.lang.String str3 = this.L;
            java.lang.Integer valueOf = seekBar.getProgress() <= -50 ? null : java.lang.Integer.valueOf(seekBar.getProgress());
            wc0Var.getClass();
            a.wv.w(str3, "app");
            a.nk nkVar = wc0Var.d;
            if (valueOf == null) {
                nkVar.M(str3, "auto");
            } else {
                nkVar.M(str3, valueOf.toString());
            }
        }
        com.omarea.common.ui.SeekBar seekBar2 = (com.omarea.common.ui.SeekBar) this.r.a(gu0VarArr[16]);
        if (seekBar2.getTag() != null && !a.wv.e(seekBar2.getTag(), java.lang.Integer.valueOf(seekBar2.getProgress()))) {
            java.lang.String str4 = this.L;
            java.lang.Integer valueOf2 = seekBar2.getProgress() > -50 ? java.lang.Integer.valueOf(seekBar2.getProgress()) : null;
            wc0Var.getClass();
            a.wv.w(str4, "app");
            a.nk nkVar2 = wc0Var.e;
            if (valueOf2 == null) {
                nkVar2.M(str4, "auto");
                a.nk nkVar3 = wc0Var.f;
                ((java.util.HashMap) nkVar3.e).remove(str4);
                nkVar3.L();
            } else {
                nkVar2.M(str4, java.lang.String.valueOf((valueOf2.intValue() / 100.0d) + 1));
            }
        }
        this.R.i();
    }

    public final void z() {
        y();
        super.finish();
    }
}
