package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jo0 extends a.gk0 implements android.view.View.OnClickListener {
    public static final /* synthetic */ a.gu0[] v0;
    public final a.w1 p0;
    public final a.vj1 q0;
    public com.omarea.model.ActivatedStateModel t0;
    public final a.xn0 u0;
    public final a.yq1 W = a.b20.h(2131362891, this);
    public final a.yq1 X = a.b20.h(2131362894, this);
    public final a.yq1 Y = a.b20.h(2131362896, this);
    public final a.yq1 Z = a.b20.h(2131362905, this);
    public final a.yq1 a0 = a.b20.h(2131362908, this);
    public final a.yq1 b0 = a.b20.h(2131363332, this);
    public final a.yq1 c0 = a.b20.h(2131363333, this);
    public final a.yq1 d0 = a.b20.h(2131363334, this);
    public final a.yq1 e0 = a.b20.h(2131363335, this);
    public final a.yq1 f0 = a.b20.h(2131363336, this);
    public final a.yq1 g0 = a.b20.h(2131363337, this);
    public final a.yq1 h0 = a.b20.h(2131363338, this);
    public final a.yq1 i0 = a.b20.h(2131363339, this);
    public final a.yq1 j0 = a.b20.h(2131363340, this);
    public final a.yq1 k0 = a.b20.h(2131363341, this);
    public final a.yq1 l0 = a.b20.h(2131363343, this);
    public final a.yq1 m0 = a.b20.h(2131363344, this);
    public final a.yq1 n0 = a.b20.h(2131363346, this);
    public final a.yq1 o0 = a.b20.h(2131363347, this);
    public final a.vj1 r0 = new a.vj1(new a.wn0(this, 2));
    public final a.vj1 s0 = new a.vj1(new a.wn0(this, 6));

    static {
        a.d81 d81Var = new a.d81(a.jo0.class, "nav_filter", "getNav_filter()Landroid/widget/LinearLayout;");
        a.na1.f375a.getClass();
        v0 = new a.gu0[]{d81Var, new a.d81(a.jo0.class, "nav_gesture", "getNav_gesture()Landroid/widget/LinearLayout;"), new a.d81(a.jo0.class, "nav_insider_preview", "getNav_insider_preview()Landroid/widget/LinearLayout;"), new a.d81(a.jo0.class, "nav_qq", "getNav_qq()Landroid/widget/LinearLayout;"), new a.d81(a.jo0.class, "nav_share", "getNav_share()Landroid/widget/LinearLayout;"), new a.d81(a.jo0.class, "user_avatar", "getUser_avatar()Landroid/widget/ImageView;"), new a.d81(a.jo0.class, "user_change_sn", "getUser_change_sn()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_contact", "getUser_contact()Landroid/widget/LinearLayout;"), new a.d81(a.jo0.class, "user_devices", "getUser_devices()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_expire_date", "getUser_expire_date()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_go_pay", "getUser_go_pay()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_key_code", "getUser_key_code()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_logo", "getUser_logo()Landroid/widget/ImageView;"), new a.d81(a.jo0.class, "user_message", "getUser_message()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_name", "getUser_name()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_points", "getUser_points()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_sn", "getUser_sn()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_upgrade", "getUser_upgrade()Landroid/widget/TextView;"), new a.d81(a.jo0.class, "user_version", "getUser_version()Landroid/widget/TextView;")};
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [a.xn0, a.jq] */
    public jo0() {
        int i = 1;
        this.p0 = new a.w1(i, this);
        this.q0 = new a.vj1(new a.wn0(this, i));
        a.cp cpVar = com.omarea.Scene.c;
        this.u0 = new a.jq(a.fs1.t(), "pro_key_expire_date");
    }

    public static final void S(a.jo0 jo0Var) {
        jo0Var.getClass();
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.D().getString("user_name", "");
        if (string == null || string.length() == 0) {
            return;
        }
        a.b81.c(jo0Var.U());
        a.wv.M0(a.wv.b(a.z80.b), null, new a.tn0(jo0Var, string, null), 3);
    }

    @Override // a.gk0
    public final void C(android.view.View view, android.os.Bundle bundle) {
        a.wv.w(view, "view");
        a.gu0[] gu0VarArr = v0;
        final int i = 6;
        final int i2 = 0;
        ((android.widget.TextView) this.c0.a(gu0VarArr[6])).setOnClickListener(new a.rn0(this));
        final int i3 = 1;
        ((android.widget.LinearLayout) this.d0.a(gu0VarArr[7])).setOnClickListener(new a.rn0(this));
        final int i4 = 2;
        ((android.widget.TextView) this.g0.a(gu0VarArr[10])).setOnClickListener(new a.rn0(this));
        final int i5 = 3;
        ((android.widget.TextView) this.k0.a(gu0VarArr[14])).setOnClickListener(new a.rn0(this));
        final int i6 = 5;
        final int i7 = 4;
        ((android.widget.ImageView) this.b0.a(gu0VarArr[5])).setOnClickListener(new a.rn0(this));
        ((android.widget.TextView) this.m0.a(gu0VarArr[16])).setOnClickListener(new a.b41(11));
        ((android.widget.TextView) this.e0.a(gu0VarArr[8])).setOnClickListener(new a.rn0(this));
        ((android.widget.TextView) this.n0.a(gu0VarArr[17])).setOnClickListener(new a.rn0(this));
        T((android.widget.LinearLayout) this.X.a(gu0VarArr[1]));
        T((android.widget.LinearLayout) this.W.a(gu0VarArr[0]));
        T((android.widget.LinearLayout) this.a0.a(gu0VarArr[4]));
        T((android.widget.LinearLayout) this.Z.a(gu0VarArr[3]));
        T((android.widget.LinearLayout) this.Y.a(gu0VarArr[2]));
        Z();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.ao0(this, null), 3);
    }

    public final void T(android.widget.LinearLayout linearLayout) {
        linearLayout.setOnClickListener(this);
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root") || !"root".equals(linearLayout.getTag())) {
            return;
        }
        linearLayout.setEnabled(false);
    }

    public final a.b81 U() {
        return (a.b81) this.s0.a();
    }

    public final android.widget.TextView V() {
        return (android.widget.TextView) this.l0.a(v0[15]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a.be1, a.qr0] */
    public final void W(a.wn0 wn0Var) {
        new a.qr0().s(new a.xa(this, 21, wn0Var));
    }

    public final void X(java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            R(intent);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void Y() {
        if (this.C) {
            return;
        }
        java.lang.String m = m(2131953719);
        a.wv.v(m, "getString(R.string.user_unregistered)");
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.D().getString("user_name", "");
        android.widget.TextView textView = (android.widget.TextView) this.k0.a(v0[14]);
        if (string != null && string.length() != 0) {
            m = string;
        }
        textView.setText(m);
        java.lang.String e = a.ii1.e(m(2131953698), "--");
        if (string == null || string.length() == 0) {
            V().setText(e);
        } else {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.do0(string, this, e, null), 3);
        }
    }

    public final void Z() {
        android.content.Context applicationContext = L().getApplicationContext();
        a.wv.v(applicationContext, "requireContext().applicationContext");
        com.omarea.model.ActivatedStateModel c = new a.a3(applicationContext).c();
        this.t0 = c;
        a.gu0[] gu0VarArr = v0;
        ((android.widget.TextView) this.f0.a(gu0VarArr[9])).setText(c.getText());
        if (c.getActivated()) {
            android.widget.ImageView imageView = (android.widget.ImageView) this.i0.a(gu0VarArr[12]);
            android.content.Context L = L();
            c.getType();
            int i = a.wv.e("perpetual", "perpetual") ? 2131231074 : 2131231079;
            java.lang.Object obj = a.zx.f748a;
            imageView.setImageDrawable(a.xx.b(L, i));
            ((android.widget.TextView) this.o0.a(gu0VarArr[18])).setText(c.getTypeName());
            ((android.widget.TextView) this.n0.a(gu0VarArr[17])).setVisibility(a.wv.e(c.getType(), "account") ? 0 : 8);
        } else {
            android.widget.ImageView imageView2 = (android.widget.ImageView) this.i0.a(gu0VarArr[12]);
            android.content.Context L2 = L();
            java.lang.Object obj2 = a.zx.f748a;
            imageView2.setImageDrawable(a.xx.b(L2, 2131231080));
            ((android.widget.TextView) this.o0.a(gu0VarArr[18])).setText(m(2131953686));
            a.q10 q10Var = a.q10.f457a;
            if (a.wv.e(a.q10.t(), "root")) {
                com.omarea.vtools.activities.ActivityStartSplash.q.getClass();
                com.omarea.vtools.activities.ActivityStartSplash.s = false;
                a.kk0 d = d();
                if (d != null) {
                    d.finish();
                }
            }
        }
        ((android.widget.TextView) this.m0.a(gu0VarArr[16])).setText("SN: ".concat(a.tg1.f()));
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.D().getString("random_id2", "");
        if (string != null && string.length() != 0 && string.length() >= 10) {
            android.widget.TextView textView = (android.widget.TextView) this.h0.a(gu0VarArr[11]);
            java.lang.String substring = string.substring(0, 4);
            a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            java.lang.String substring2 = string.substring(string.length() - 3);
            a.wv.v(substring2, "this as java.lang.String).substring(startIndex)");
            java.lang.String f = a.ii1.f(substring, "***", substring2);
            java.util.Locale locale = java.util.Locale.ENGLISH;
            a.wv.v(locale, "ENGLISH");
            java.lang.String upperCase = f.toUpperCase(locale);
            a.wv.v(upperCase, "this as java.lang.String).toUpperCase(locale)");
            textView.setText("KEY: ".concat(upperCase));
        }
        Y();
    }

    public final void a0(java.lang.String str) {
        android.content.pm.PackageManager packageManager = L().getPackageManager();
        if (str.equals("com.omarea.gesture")) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setComponent(new android.content.ComponentName("com.omarea.gesture", "com.omarea.gesture.SettingsActivity"));
            R(intent);
            return;
        }
        if (str.equals("com.omarea.filter")) {
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setComponent(new android.content.ComponentName("com.omarea.filter", "com.omarea.filter.SettingsActivity"));
            R(intent2);
            return;
        }
        try {
            android.content.Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                R(launchIntentForPackage);
                return;
            }
        } catch (java.lang.Exception unused) {
        }
        X("https://play.google.com/store/apps/details?id=".concat(str));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (view != null) {
            a.q10 q10Var = a.q10.f457a;
            if (!a.wv.e(a.q10.t(), "root") && "root".equals(view.getTag())) {
                android.widget.Toast.makeText(view.getContext(), "没有获得ROOT权限，不能使用本功能", 0).show();
                return;
            }
            int id = view.getId();
            if (id == 2131362894) {
                a0("com.omarea.gesture");
                return;
            }
            if (id == 2131362891) {
                a0("com.omarea.filter");
                return;
            }
            if (id == 2131362905) {
                android.content.Intent intent = new android.content.Intent();
                intent.setData(android.net.Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26k%3DFNt6SyjNPzndLXNgAzGpmXEPI4T4haU1"));
                try {
                    R(intent);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            if (id == 2131362896) {
                X("mqqapi://forward/url?src_type=web&style=default&plg_auth=1&version=1&url_prefix=aHR0cHM6Ly9wZC5xcS5jb20vcy8ybW80bnJicHo=");
                return;
            }
            if (id == 2131362959) {
                X("https://play.google.com/store/apps/details?id=" + view.getContext().getPackageName());
                return;
            }
            if (id == 2131362908) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.TEXT", m(2131953503));
                intent2.setType("text/plain");
                R(intent2);
            }
        }
    }

    @Override // a.gk0
    public final android.view.View s(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        a.wv.w(layoutInflater, "inflater");
        return layoutInflater.inflate(2131558569, viewGroup, false);
    }

    @Override // a.gk0
    public final void t() {
        U().a();
        this.F = true;
    }

    @Override // a.gk0
    public final void y() {
        this.F = true;
        K().setTitle(m(2131951876));
    }
}
