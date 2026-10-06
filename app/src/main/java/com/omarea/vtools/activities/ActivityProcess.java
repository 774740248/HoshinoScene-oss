package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityProcess extends a.p5 {
    public static final /* synthetic */ a.gu0[] x;
    public a.nj m;
    public boolean n;
    public volatile java.util.ArrayList r;
    public final a.pm s;
    public boolean t;
    public final a.vj1 u;
    public final a.ab1 v;
    public java.util.Timer w;
    public final a.yq1 d = a.b20.i(this, 2131362989);
    public final a.yq1 e = a.b20.i(this, 2131362993);
    public final a.yq1 f = a.b20.i(this, 2131362991);
    public final a.yq1 g = a.b20.i(this, 2131362994);
    public final a.yq1 h = a.b20.i(this, 2131362996);
    public final a.yq1 i = a.b20.i(this, 2131362997);
    public final a.yq1 j = a.b20.i(this, 2131362998);
    public final a.yq1 k = a.b20.i(this, 2131362992);
    public final a.yq1 l = a.b20.i(this, 2131362990);
    public java.lang.String o = "";
    public int p = 4;
    public int q = 32;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_filter", "getProcess_filter()Lcom/omarea/ui/SelectView;");
        a.na1.f375a.getClass();
        x = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_list", "getProcess_list()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_group", "getProcess_group()Lcom/omarea/ui/procs/ProcessGroupView;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_search", "getProcess_search()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_sort_mode", "getProcess_sort_mode()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_unsupported", "getProcess_unsupported()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_view", "getProcess_view()Landroid/widget/RelativeLayout;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_group_toggle", "getProcess_group_toggle()Landroid/widget/CheckBox;"), new a.d81(com.omarea.vtools.activities.ActivityProcess.class, "process_float_window", "getProcess_float_window()Landroid/widget/CheckBox;")};
    }

    public ActivityProcess() {
        a.cp cpVar = com.omarea.Scene.c;
        this.s = new a.pm(a.fs1.t(), 20);
        this.u = new a.vj1(new a.cd1(25, this));
        a.wv.v(java.util.regex.Pattern.compile("u[0-9]+_.*"), "compile(pattern)");
        this.v = new a.ab1(".*\\..*");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(com.omarea.model.ProcessInfo r4, com.omarea.vtools.activities.ActivityProcess r5, a.ey r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof a.xd
            if (r0 == 0) goto L16
            r0 = r6
            a.xd r0 = (a.xd) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.i = r1
            goto L1b
        L16:
            a.xd r0 = new a.xd
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.g
            a.dz r1 = a.dz.c
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.omarea.vtools.activities.ActivityProcess r5 = r0.f
            a.b20.q1(r6)
            goto L46
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            a.b20.q1(r6)
            int r4 = r4.pid
            r0.f = r5
            r0.i = r3
            a.pm r6 = r5.s
            java.lang.Object r6 = r6.v(r4, r0)
            if (r6 != r1) goto L46
            goto L89
        L46:
            r1 = r6
            com.omarea.model.ProcessInfo r1 = (com.omarea.model.ProcessInfo) r1
            if (r1 == 0) goto L89
            r5.getClass()
            java.lang.String r4 = r1.name
            java.lang.String r6 = "processInfo.name"
            a.wv.v(r4, r6)
            java.lang.String r6 = ":"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.util.List r4 = a.yi1.y2(r4, r6)
            java.lang.Object r4 = a.qv.e2(r4)
            java.lang.String r4 = (java.lang.String) r4
            android.content.pm.PackageManager r6 = r5.r()     // Catch: java.lang.Exception -> L87
            r0 = 0
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r4, r0)     // Catch: java.lang.Exception -> L87
            java.lang.String r0 = "pm.getApplicationInfo(name, 0)"
            a.wv.v(r6, r0)     // Catch: java.lang.Exception -> L87
            android.content.pm.PackageManager r5 = r5.r()     // Catch: java.lang.Exception -> L87
            java.lang.CharSequence r5 = r6.loadLabel(r5)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r6.<init>()     // Catch: java.lang.Exception -> L87
            r6.append(r5)     // Catch: java.lang.Exception -> L87
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L87
        L87:
            r1.friendlyName = r4
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityProcess.o(com.omarea.model.ProcessInfo, com.omarea.vtools.activities.ActivityProcess, a.ey):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x029f, code lost:
    
        if (r17.v.c(r0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02bd, code lost:
    
        r0 = r9.findViewById(2131361842);
        a.wv.v(r0, "findViewById(R.id.ProcessIcon)");
        a.wv.M0(a.wv.b(a.z80.b), null, new a.ae(r18, r17, (android.widget.ImageView) r0, null), 3);
        r0 = (android.widget.Button) r9.findViewById(2131361855);
        r1 = (android.widget.Button) r9.findViewById(2131361832);
        r0.setOnClickListener(new a.wd(r17, r18, r10, 2));
        r1.setOnClickListener(new a.d41(r9, r10, r18, r17));
        r0.setVisibility(0);
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02bb, code lost:
    
        if (r17.getPackageManager().getPackageInfo((java.lang.String) a.qv.e2(a.yi1.y2(r0, new java.lang.String[]{":"})), 0) != null) goto L51;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, a.ma1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(com.omarea.vtools.activities.ActivityProcess r17, com.omarea.model.ProcessInfo r18) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityProcess.p(com.omarea.vtools.activities.ActivityProcess, com.omarea.model.ProcessInfo):void");
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        android.os.Bundle extras;
        java.lang.String string;
        super.onCreate(bundle);
        setContentView(2131558475);
        setBackArrow();
        int i = 0;
        switch (this.s.c) {
            default:
                if (!a.vs.d.contains(android.os.Build.MODEL) || android.hardware.Camera.getNumberOfCameras() <= 2) {
                    z = false;
                    break;
                }
                break;
            case 20:
                z = true;
                break;
        }
        this.t = z;
        a.yq1 yq1Var = this.j;
        a.yq1 yq1Var2 = this.i;
        a.gu0[] gu0VarArr = x;
        if (z) {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[5])).setVisibility(8);
            ((android.widget.RelativeLayout) yq1Var.a(gu0VarArr[6])).setVisibility(0);
        } else {
            ((android.widget.TextView) yq1Var2.a(gu0VarArr[5])).setVisibility(0);
            ((android.widget.RelativeLayout) yq1Var.a(gu0VarArr[6])).setVisibility(8);
            v().setVisibility(8);
            t().setVisibility(8);
            a.q10 q10Var = a.q10.f457a;
            if (a.wv.e(a.q10.t(), "basic")) {
                ((android.widget.TextView) yq1Var2.a(gu0VarArr[5])).setText(getString(2131953083));
            }
        }
        java.util.List z0 = a.b20.z0("cpu", "res", "pid", "uid", "default");
        a.gu0 gu0Var = gu0VarArr[4];
        a.yq1 yq1Var3 = this.h;
        com.omarea.ui.SelectView selectView = (com.omarea.ui.SelectView) yq1Var3.a(gu0Var);
        java.lang.String[] stringArray = getResources().getStringArray(2130903070);
        a.wv.v(stringArray, "resources.getStringArray…array.process_sort_modes)");
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        int length = stringArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            java.lang.String str = stringArray[i2];
            a.wv.v(str, "label");
            arrayList.add(new a.mg1(str, (java.lang.String) z0.get(i3)));
            i2++;
            i3++;
        }
        selectView.setItems(arrayList);
        ((com.omarea.ui.SelectView) yq1Var3.a(gu0VarArr[4])).setValue("cpu");
        ((com.omarea.ui.SelectView) yq1Var3.a(gu0VarArr[4])).setOnItemSelected(new a.be(this, i));
        java.util.List z02 = a.b20.z0("android", "other", "all");
        com.omarea.ui.SelectView s = s();
        java.lang.String[] stringArray2 = getResources().getStringArray(2130903069);
        a.wv.v(stringArray2, "resources.getStringArray(R.array.process_filter)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(stringArray2.length);
        int length2 = stringArray2.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length2) {
            java.lang.String str2 = stringArray2[i4];
            a.wv.v(str2, "label");
            arrayList2.add(new a.mg1(str2, (java.lang.String) z02.get(i5)));
            i4++;
            i5++;
        }
        s.setItems(arrayList2);
        s().setValue("android");
        s().setOnItemSelected(new a.be(this, 1));
        boolean z2 = this.t;
        a.yq1 yq1Var4 = this.g;
        if (z2) {
            this.n = getSharedPreferences("process_manager", 0).getBoolean("group_mode", false);
            v().setVisibility(0);
            java.lang.String str3 = null;
            v().setOnCheckedChangeListener(null);
            v().setChecked(this.n);
            v().setOnCheckedChangeListener(new a.uu(6, this));
            q();
            t().setChecked(a.ph0.i.r());
            t().setOnClickListener(new a.wi(this, 26, this));
            w().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(1));
            w().setItemAnimator(null);
            w().setOverScrollMode(2);
            a.nj njVar = new a.nj(this);
            njVar.k = new a.ce(this, i);
            android.content.Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("name")) != null) {
                str3 = (java.lang.String) a.qv.e2(a.yi1.y2(string, new java.lang.String[]{":"}));
            }
            if (str3 != null) {
                this.o = str3;
                this.q = 1;
                njVar.h = str3;
                njVar.s();
                njVar.j = 1;
                njVar.s();
                u().i(str3);
                com.omarea.ui.procs.ProcessGroupView u = u();
                if (u.l != 1) {
                    u.l = 1;
                    u.g();
                }
                s().setValue("all");
                ((android.widget.EditText) yq1Var4.a(gu0VarArr[3])).setText(str3);
            }
            this.m = njVar;
            w().setAdapter(this.m);
            new a.y61(w());
            u().setOnProcessClick(new a.ce(this, 1));
        }
        ((android.widget.EditText) yq1Var4.a(gu0VarArr[3])).setOnEditorActionListener(new a.uf1(this, 6));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        java.util.Timer timer = this.w;
        if (timer != null) {
            timer.cancel();
            this.w = null;
        }
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952919));
        if (this.t) {
            t().setChecked(a.ph0.i.r());
        }
        if (this.t && this.w == null) {
            java.util.Timer timer = new java.util.Timer("ProcessManager");
            timer.schedule(new a.hr(4, this), 0L, 3000L);
            this.w = timer;
        }
    }

    public final void q() {
        w().setVisibility(this.n ? 8 : 0);
        u().setVisibility(this.n ? 0 : 8);
    }

    public final android.content.pm.PackageManager r() {
        java.lang.Object a2 = this.u.a();
        a.wv.v(a2, "<get-pm>(...)");
        return (android.content.pm.PackageManager) a2;
    }

    public final com.omarea.ui.SelectView s() {
        return (com.omarea.ui.SelectView) this.d.a(x[0]);
    }

    public final android.widget.CheckBox t() {
        return (android.widget.CheckBox) this.l.a(x[8]);
    }

    public final com.omarea.ui.procs.ProcessGroupView u() {
        return (com.omarea.ui.procs.ProcessGroupView) this.f.a(x[2]);
    }

    public final android.widget.CheckBox v() {
        return (android.widget.CheckBox) this.k.a(x[7]);
    }

    public final androidx.recyclerview.widget.RecyclerView w() {
        return (androidx.recyclerview.widget.RecyclerView) this.e.a(x[1]);
    }
}
