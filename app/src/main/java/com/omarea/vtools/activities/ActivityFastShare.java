package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFastShare extends a.p5 implements android.view.View.OnClickListener, a.ni0 {
    public static final /* synthetic */ a.gu0[] P;
    public java.lang.String D;
    public boolean H;
    public a.bp0 J;
    public a.qi1 L;
    public a.qi1 M;
    public a.w60 N;
    public boolean O;
    public final a.yq1 d = a.b20.i(this, 2131363002);
    public final a.yq1 e = a.b20.i(this, 2131363003);
    public final a.yq1 f = a.b20.i(this, 2131363004);
    public final a.yq1 g = a.b20.i(this, 2131363005);
    public final a.yq1 h = a.b20.i(this, 2131363118);
    public final a.yq1 i = a.b20.i(this, 2131363123);
    public final a.yq1 j = a.b20.i(this, 2131363122);
    public final a.yq1 k = a.b20.i(this, 2131363126);
    public final a.yq1 l = a.b20.i(this, 2131363129);
    public final a.yq1 m = a.b20.i(this, 2131363136);
    public final a.yq1 n = a.b20.i(this, 2131363135);
    public final a.yq1 o = a.b20.i(this, 2131363130);
    public final a.yq1 p = a.b20.i(this, 2131363131);
    public final a.yq1 q = a.b20.i(this, 2131363132);
    public final a.yq1 r = a.b20.i(this, 2131363133);
    public final a.yq1 s = a.b20.i(this, 2131363134);
    public final a.yq1 t = a.b20.i(this, 2131363127);
    public final a.yq1 u = a.b20.i(this, 2131363128);
    public final a.yq1 v = a.b20.i(this, 2131363299);
    public final a.yq1 w = a.b20.i(this, 2131363119);
    public final a.yq1 x = a.b20.i(this, 2131363120);
    public final a.yq1 y = a.b20.i(this, 2131363121);
    public final a.yq1 z = a.b20.i(this, 2131363124);
    public final a.yq1 A = a.b20.i(this, 2131363125);
    public final a.yq1 B = a.b20.i(this, 2131363138);
    public final a.yq1 C = a.b20.i(this, 2131363139);
    public final java.util.List E = a.b20.z0(new a.mg1("2.4GHz", "2"), new a.mg1("5GHz", "5"));
    public final java.util.List F = a.b20.z0(new a.mg1("Auto", "0"), new a.mg1("20MHz", "20"), new a.mg1("40MHz", "40"), new a.mg1("80MHz", "80"), new a.mg1("160MHz", "160"));
    public final java.util.List G = a.b20.z0(new a.mg1("Direct", "direct"), new a.mg1("LAN", "lan"));
    public final int I = 65401;
    public final a.vj1 K = new a.vj1(new a.cd1(21, this));

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "pull_key", "getPull_key()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        P = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "pull_settings", "getPull_settings()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "pull_settings_expand", "getPull_settings_expand()Lcom/omarea/ui/UMExpandLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "pull_transport", "getPull_transport()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_app", "getShare_app()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_game", "getShare_game()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_folder", "getShare_folder()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_pull", "getShare_pull()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_card", "getShare_status_card()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_type", "getShare_status_type()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_summary", "getShare_status_summary()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_detail", "getShare_status_detail()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_error", "getShare_status_error()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_phase", "getShare_status_phase()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_progress", "getShare_status_progress()Landroid/widget/ProgressBar;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_status_stop", "getShare_status_stop()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_settings", "getShare_settings()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_settings_expand", "getShare_settings_expand()Lcom/omarea/ui/UMExpandLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "top_bar", "getTop_bar()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_band", "getShare_band()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_bandwidth", "getShare_bandwidth()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_desktop", "getShare_desktop()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_key", "getShare_key()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_key_config", "getShare_key_config()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_transport", "getShare_transport()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityFastShare.class, "share_wpa3", "getShare_wpa3()Landroid/widget/Switch;")};
    }

    public static final void o(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.tg tgVar) {
        java.lang.Integer c2;
        java.lang.Integer c22;
        activityFastShare.D();
        activityFastShare.A(true);
        a.gu0[] gu0VarArr = P;
        java.lang.String value = ((com.omarea.ui.SelectView) activityFastShare.w.a(gu0VarArr[19])).getValue();
        int intValue = (value == null || (c22 = a.wi1.c2(value)) == null) ? 5 : c22.intValue();
        java.lang.String value2 = ((com.omarea.ui.SelectView) activityFastShare.x.a(gu0VarArr[20])).getValue();
        activityFastShare.L = a.wv.M0(a.wv.b(a.z80.b), null, new a.j7(tgVar, activityFastShare, intValue, (value2 == null || (c2 = a.wi1.c2(value2)) == null) ? 80 : c2.intValue(), null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a.fp0, a.lj1] */
    public static final void p(com.omarea.vtools.activities.ActivityFastShare activityFastShare, a.w00 w00Var, boolean z) {
        activityFastShare.getClass();
        a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
        a.yi yiVar = new a.yi(activityFastShare);
        java.util.ArrayList arrayList = (java.util.ArrayList) activityFastShare.K.a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (a.wv.e(yiVar.c(((com.omarea.model.AppInfo) obj).getPackageName()), java.lang.Boolean.valueOf(z))) {
                arrayList2.add(obj);
            }
        }
        new a.a40(activityFastShare.getThemeMode().f442a, new java.util.ArrayList(a.qv.s2(arrayList2, new a.py(21))), false, new a.p4(w00Var, 2, activityFastShare)).V(activityFastShare.getSupportFragmentManager(), "EasyShareApp");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(com.omarea.vtools.activities.ActivityFastShare r10, a.ey r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof a.z7
            if (r0 == 0) goto L16
            r0 = r11
            a.z7 r0 = (a.z7) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            a.z7 r0 = new a.z7
            r0.<init>(r10, r11)
        L1b:
            java.lang.Object r11 = r0.f
            a.dz r7 = a.dz.c
            int r1 = r0.h
            a.no1 r8 = a.no1.f387a
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L37
            if (r1 != r9) goto L2f
            a.b20.q1(r11)
            goto L6b
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            a.b20.q1(r11)
            goto L54
        L3b:
            a.b20.q1(r11)
            r10.D()
            r0.h = r2
            a.q10 r1 = a.q10.f457a
            java.lang.String r2 = "share-stop"
            java.lang.String r3 = ""
            r4 = 0
            r6 = 12
            r5 = r0
            java.lang.Object r10 = a.q10.K(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L54
            goto L6c
        L54:
            r0.h = r9
            a.q10 r1 = a.q10.f457a
            java.lang.String r2 = "pull-stop"
            java.lang.String r3 = ""
            r4 = 0
            r6 = 12
            r5 = r0
            java.lang.Object r10 = a.q10.K(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L67
            goto L68
        L67:
            r10 = r8
        L68:
            if (r10 != r7) goto L6b
            goto L6c
        L6b:
            r7 = r8
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFastShare.q(com.omarea.vtools.activities.ActivityFastShare, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(com.omarea.vtools.activities.ActivityFastShare r17, a.rd0 r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFastShare.r(com.omarea.vtools.activities.ActivityFastShare, a.rd0):void");
    }

    public static java.lang.String s(long j) {
        if (j < 1024) {
            return j + " B";
        }
        java.lang.String[] strArr = {"KB", "MB", "GB", "TB"};
        double d = j;
        int i = -1;
        do {
            d /= 1024;
            i++;
            if (d < 1024.0d) {
                break;
            }
        } while (i < 3);
        return a.ai1.l(new java.lang.Object[]{java.lang.Double.valueOf(d), strArr[i]}, 2, "%.1f %s", "format(format, *args)");
    }

    public final void A(boolean z) {
        if (z) {
            int i = a.x60.f681a;
            this.N = a.fs1.J(this, null);
        }
        this.M = a.wv.M0(a.wv.b(a.z80.b), null, new a.y7(this, null), 3);
    }

    public final java.lang.String B(a.rd0 rd0Var) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j = rd0Var.g;
        long j2 = rd0Var.h;
        if (j > 0) {
            arrayList.add(s(j2) + " / " + s(j));
        } else if (j2 > 0) {
            arrayList.add(s(j2));
        }
        if (j > 0) {
            arrayList.add(((int) (rd0Var.a() * 100)) + "%");
        }
        long j3 = rd0Var.i;
        if (j3 > 0) {
            arrayList.add(s(j3) + "/s");
            if (rd0Var.d == a.qd0.f && j > j2) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                long j4 = (j - j2) / j3;
                if (j4 < 60) {
                    string = getString(2131952412, java.lang.Long.valueOf(j4));
                    a.wv.v(string, "getString(R.string.fs_duration_s, seconds)");
                } else {
                    long j5 = 60;
                    long j6 = j4 / j5;
                    if (j6 < 60) {
                        string = getString(2131952411, java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j4 % j5));
                        a.wv.v(string, "getString(R.string.fs_du…s, minutes, seconds % 60)");
                    } else {
                        string = getString(2131952410, java.lang.Long.valueOf(j6 / j5), java.lang.Long.valueOf(j6 % j5));
                        a.wv.v(string, "getString(R.string.fs_du…nutes / 60, minutes % 60)");
                    }
                }
                objArr[0] = string;
                arrayList.add(getString(2131952464, objArr));
            }
        }
        return arrayList.isEmpty() ? "—" : a.qv.j2(arrayList, " · ", null, null, null, 62);
    }

    public final java.lang.String C(a.rd0 rd0Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rd0Var.c.length() > 0) {
            arrayList.add(rd0Var.c);
        }
        arrayList.add(getString(rd0Var.b == a.sd0.e ? 2131952409 : 2131952424));
        return arrayList.isEmpty() ? "—" : a.qv.j2(arrayList, " · ", null, null, null, 62);
    }

    public final void D() {
        a.qi1 qi1Var = this.L;
        if (qi1Var != null) {
            java.lang.Object C = qi1Var.C();
            if (!(C instanceof a.dw) && (!(C instanceof a.ut0) || !((a.ut0) C).d())) {
                a.qi1 qi1Var2 = this.L;
                if (qi1Var2 != null) {
                    a.wv.p(qi1Var2);
                }
                this.L = null;
            }
        }
        a.qi1 qi1Var3 = this.M;
        if (qi1Var3 != null) {
            java.lang.Object C2 = qi1Var3.C();
            if (C2 instanceof a.dw) {
                return;
            }
            if ((C2 instanceof a.ut0) && ((a.ut0) C2).d()) {
                return;
            }
            a.qi1 qi1Var4 = this.M;
            if (qi1Var4 != null) {
                a.wv.p(qi1Var4);
            }
            this.M = null;
        }
    }

    @Override // a.ni0
    public final void c(java.lang.String str, a.bp0 bp0Var) {
        this.J = bp0Var;
        com.omarea.vtools.activities.ActivityFileSelector.m.getClass();
        startActivityForResult(a.fa0.j(this, str), this.I);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == this.I) {
            java.lang.String stringExtra = (i2 != -1 || intent == null) ? null : intent.getStringExtra("file");
            a.bp0 bp0Var = this.J;
            if (bp0Var != null) {
                this.J = null;
                if (stringExtra != null) {
                    bp0Var.i(stringExtra);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558448);
        setBackArrow();
        setTitle(getString(2131952487));
        a.gu0[] gu0VarArr = P;
        a.gu0 gu0Var = gu0VarArr[19];
        a.yq1 yq1Var = this.w;
        ((com.omarea.ui.SelectView) yq1Var.a(gu0Var)).setItems(this.E);
        ((com.omarea.ui.SelectView) yq1Var.a(gu0VarArr[19])).setValue("5");
        a.gu0 gu0Var2 = gu0VarArr[20];
        a.yq1 yq1Var2 = this.x;
        ((com.omarea.ui.SelectView) yq1Var2.a(gu0Var2)).setItems(this.F);
        ((com.omarea.ui.SelectView) yq1Var2.a(gu0VarArr[20])).setValue("0");
        a.gu0 gu0Var3 = gu0VarArr[24];
        a.yq1 yq1Var3 = this.B;
        com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) yq1Var3.a(gu0Var3);
        java.util.List<a.mg1> list = this.G;
        selectView.setItems(list);
        ((com.omarea.ui.SelectView) yq1Var3.a(gu0VarArr[24])).setValue("direct");
        final int i = 3;
        a.gu0 gu0Var4 = gu0VarArr[3];
        a.yq1 yq1Var4 = this.g;
        ((com.omarea.ui.SelectView) yq1Var4.a(gu0Var4)).setItems(list);
        ((com.omarea.ui.SelectView) yq1Var4.a(gu0VarArr[3])).setValue("direct");
        com.omarea.ui.UMExpandLayout uMExpandLayout = (com.omarea.ui.UMExpandLayout) this.u.a(gu0VarArr[17]);
        final int i2 = 0;
        uMExpandLayout.e = false;
        uMExpandLayout.a();
        ((android.widget.ImageView) this.t.a(gu0VarArr[16])).setOnClickListener(new a.i7(this));
        final int i3 = 2;
        com.omarea.ui.UMExpandLayout uMExpandLayout2 = (com.omarea.ui.UMExpandLayout) this.f.a(gu0VarArr[2]);
        uMExpandLayout2.e = false;
        uMExpandLayout2.a();
        final int i4 = 1;
        ((android.widget.ImageView) this.e.a(gu0VarArr[1])).setOnClickListener(new a.i7(this));
        final int i5 = 4;
        ((android.widget.ImageView) this.h.a(gu0VarArr[4])).setOnClickListener(new a.i7(this));
        final int i6 = 5;
        ((android.widget.ImageView) this.i.a(gu0VarArr[5])).setOnClickListener(new a.i7(this));
        final int i7 = 6;
        ((android.widget.ImageView) this.j.a(gu0VarArr[6])).setOnClickListener(new a.i7(this));
        final int i8 = 7;
        ((android.widget.ImageView) this.k.a(gu0VarArr[7])).setOnClickListener(new a.i7(this));
        w().setOnClickListener(new a.i7(this));
        final int i9 = 8;
        ((android.widget.ImageView) this.y.a(gu0VarArr[21])).setOnClickListener(new a.i7(this));
        final int i10 = 9;
        ((android.widget.ImageView) this.A.a(gu0VarArr[23])).setOnClickListener(new a.i7(this));
        a.gu0 gu0Var5 = gu0VarArr[22];
        a.yq1 yq1Var5 = this.z;
        android.widget.TextView textView = (android.widget.TextView) yq1Var5.a(gu0Var5);
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.D().getString("share_key", "");
        a.wv.s(string);
        textView.setText(string);
        android.widget.TextView textView2 = (android.widget.TextView) yq1Var5.a(gu0VarArr[22]);
        final int i11 = 10;
        textView2.setOnClickListener(new a.i7(this));
        a.gu0 gu0Var6 = gu0VarArr[0];
        a.yq1 yq1Var6 = this.d;
        android.widget.TextView textView3 = (android.widget.TextView) yq1Var6.a(gu0Var6);
        java.lang.String string2 = a.fs1.D().getString("pull_key", "");
        a.wv.s(string2);
        textView3.setText(string2);
        ((android.widget.TextView) yq1Var6.a(gu0VarArr[0])).setOnClickListener(new a.i7(this));
        android.content.Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("packageName")) {
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        a.wv.s(extras);
        this.D = extras.getString("packageName");
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.M != null || this.H) {
            return;
        }
        this.H = true;
        a.wv.M0(a.wv.b(a.z80.b), null, new a.q7(this, null), 3);
    }

    public final android.widget.TextView t() {
        return (android.widget.TextView) this.p.a(P[12]);
    }

    public final android.widget.TextView u() {
        return (android.widget.TextView) this.q.a(P[13]);
    }

    public final android.widget.ProgressBar v() {
        return (android.widget.ProgressBar) this.r.a(P[14]);
    }

    public final android.widget.TextView w() {
        return (android.widget.TextView) this.s.a(P[15]);
    }

    public final android.widget.LinearLayout x() {
        return (android.widget.LinearLayout) this.v.a(P[18]);
    }

    public final void y(a.bp0 bp0Var) {
        int i = a.x60.f681a;
        java.lang.String string = getString(2131952462);
        a.wv.v(string, "getString(R.string.fs_pull_key_title)");
        java.lang.String string2 = getString(2131952461);
        a.wv.v(string2, "getString(R.string.fs_pull_key_msg)");
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string3 = a.fs1.D().getString("pull_key", "");
        a.wv.s(string3);
        a.fs1.H(this, string, string2, string3, new a.r7(this, bp0Var, 0));
    }

    public final void z(a.bp0 bp0Var, boolean z) {
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String string = a.fs1.D().getString("share_key", "");
        a.wv.s(string);
        if (!z && string.length() != 0) {
            if (bp0Var != null) {
                bp0Var.i(string);
            }
        } else {
            int i = a.x60.f681a;
            java.lang.String string2 = getString(2131952472);
            a.wv.v(string2, "getString(R.string.fs_set_key_title)");
            java.lang.String string3 = getString(2131952471);
            a.wv.v(string3, "getString(R.string.fs_set_key_msg)");
            a.fs1.H(this, string2, string3, string, new a.r7(this, bp0Var, 1));
        }
    }
}
