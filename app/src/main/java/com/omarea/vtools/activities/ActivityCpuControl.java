package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityCpuControl extends a.p5 {
    public static final /* synthetic */ a.gu0[] J;
    public boolean B;
    public com.omarea.model.CpuStatus C;
    public java.util.Timer I;
    public java.lang.String u;
    public int v;
    public int w;
    public boolean y;
    public final a.yq1 d = a.b20.i(this, 2131362268);
    public final a.yq1 e = a.b20.i(this, 2131362269);
    public final a.yq1 f = a.b20.i(this, 2131362282);
    public final a.yq1 g = a.b20.i(this, 2131362291);
    public final a.yq1 h = a.b20.i(this, 2131362292);
    public final a.yq1 i = a.b20.i(this, 2131362304);
    public final a.yq1 j = a.b20.i(this, 2131362309);
    public final a.yq1 k = a.b20.i(this, 2131362320);
    public final a.yq1 l = a.b20.i(this, 2131362321);
    public final a.yq1 m = a.b20.i(this, 2131362322);
    public final a.yq1 n = a.b20.i(this, 2131362323);
    public final a.yq1 o = a.b20.i(this, 2131362588);
    public final a.yq1 p = a.b20.i(this, 2131362590);
    public final a.yq1 q = a.b20.i(this, 2131362591);
    public final a.yq1 r = a.b20.i(this, 2131362592);
    public final a.yq1 s = a.b20.i(this, 2131362899);
    public final a.yq1 t = a.b20.i(this, 2131363019);
    public final java.util.ArrayList x = new java.util.ArrayList();
    public java.lang.String[] z = {""};
    public java.lang.String[] A = {""};
    public com.omarea.model.CpuStatus D = new com.omarea.model.CpuStatus();
    public final java.util.HashMap E = new java.util.HashMap();
    public java.lang.String[] F = new java.lang.String[0];
    public final a.ls G = new a.ls();
    public final a.qp0 H = new a.qp0();

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_apply_boot", "getCpu_apply_boot()Lcom/omarea/ui/BlurViewLinearLayout;");
        a.na1.f375a.getClass();
        J = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_apply_onboot", "getCpu_apply_onboot()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_cluster_list", "getCpu_cluster_list()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_cores", "getCpu_cores()Landroid/widget/GridLayout;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_cpuctl", "getCpu_cpuctl()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_sched", "getCpu_sched()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpu_stune", "getCpu_stune()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpuset_bg", "getCpuset_bg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpuset_foreground", "getCpuset_foreground()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpuset_system_bg", "getCpuset_system_bg()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "cpuset_top_app", "getCpuset_top_app()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "gpu_governor", "getGpu_governor()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "gpu_max_freq", "getGpu_max_freq()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "gpu_min_freq", "getGpu_min_freq()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "gpu_params", "getGpu_params()Lcom/omarea/ui/BlurView;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "nav_more", "getNav_more()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityCpuControl.class, "root", "getRoot()Lcom/omarea/common/ui/OverScrollView;")};
    }

    public static void A(android.widget.TextView textView, java.lang.String str) {
        if (textView == null || a.wv.e(textView.getText(), str)) {
            return;
        }
        textView.setText(str);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [a.ng1, java.lang.Object] */
    public static java.util.ArrayList C(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            a.ng1 obj = new a.ng1();
            obj.f381a = str;
            obj.c = str;
            arrayList.add(obj);
        }
        return new java.util.ArrayList(arrayList);
    }

    public static java.lang.String D(java.lang.String str) {
        if (str.length() <= 3) {
            return str;
        }
        java.lang.String substring = str.substring(0, str.length() - 3);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring.concat(" MHz");
    }

    public static java.lang.String E(java.lang.String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() <= 3) {
            return str;
        }
        java.lang.String substring = str.substring(0, str.length() - 3);
        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring.concat(" MHz");
    }

    public static final java.lang.String o(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, boolean[] zArr) {
        activityCpuControl.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (zArr[i]) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(i);
            }
        }
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(6:11|12|13|(1:15)|17|18)(2:20|21))(2:22|23))(10:28|29|30|(2:31|(3:33|(2:35|36)(1:38)|37)(1:39))|40|(1:42)|43|(1:(3:46|(1:48)|49)(1:54))(1:55)|50|(2:52|53))|24|(2:26|27)|13|(0)|17|18))|57|6|7|(0)(0)|24|(0)|13|(0)|17|18) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0143 A[Catch: Exception -> 0x0146, TRY_LEAVE, TryCatch #0 {Exception -> 0x0146, blocks: (B:12:0x002d, B:13:0x013f, B:15:0x0143, B:23:0x003c, B:24:0x0112, B:29:0x0044, B:33:0x004b, B:35:0x0057, B:37:0x0063, B:40:0x0084, B:42:0x0088, B:43:0x00b6, B:46:0x00c6, B:48:0x00d0, B:50:0x00e9, B:54:0x00dc, B:55:0x00e7), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r9v2, types: [a.qb0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(com.omarea.vtools.activities.ActivityCpuControl r13, a.ey r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityCpuControl.p(com.omarea.vtools.activities.ActivityCpuControl, a.ey):java.lang.Object");
    }

    public static java.lang.String u(java.lang.String str, java.lang.String[] strArr) {
        try {
            if (a.op.K1(strArr, str)) {
                return str;
            }
            int i = 0;
            java.lang.String str2 = (strArr.length == 0) ^ true ? strArr[0] : "";
            int length = strArr.length;
            while (i < length) {
                java.lang.String str3 = strArr[i];
                if (java.lang.Integer.parseInt(str3) > java.lang.Integer.parseInt(str)) {
                    break;
                }
                i++;
                str2 = str3;
            }
            return str2;
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [a.ng1, java.lang.Object] */
    public static java.util.ArrayList x(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            a.ng1 obj = new a.ng1();
            obj.f381a = D(str);
            obj.c = str;
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [a.ng1, java.lang.Object] */
    public static java.util.ArrayList y(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            a.ng1 obj = new a.ng1();
            obj.f381a = E(str);
            obj.c = str;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void B() {
        try {
            java.util.Timer timer = this.I;
            if (timer != null) {
                a.wv.s(timer);
                timer.cancel();
                this.I = null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void F() {
        a.gu0[] gu0VarArr;
        try {
            int i = this.v;
            int i2 = 0;
            while (true) {
                gu0VarArr = J;
                if (i2 >= i) {
                    break;
                }
                if (this.D.clusters.size() > i2) {
                    android.view.View findViewWithTag = ((android.widget.LinearLayout) this.f.a(gu0VarArr[2])).findViewWithTag("cluster_" + i2);
                    android.widget.TextView textView = (android.widget.TextView) findViewWithTag.findViewById(2131362232);
                    android.widget.TextView textView2 = (android.widget.TextView) findViewWithTag.findViewById(2131362231);
                    android.widget.TextView textView3 = (android.widget.TextView) findViewWithTag.findViewById(2131362229);
                    com.omarea.model.CpuClusterStatus cpuClusterStatus = this.D.clusters.get(i2);
                    a.wv.s(cpuClusterStatus);
                    com.omarea.model.CpuClusterStatus cpuClusterStatus2 = cpuClusterStatus;
                    java.lang.String str = cpuClusterStatus2.min_freq;
                    a.wv.v(str, "status.min_freq");
                    A(textView, D(str));
                    java.lang.String str2 = cpuClusterStatus2.max_freq;
                    a.wv.v(str2, "status.max_freq");
                    A(textView2, D(str2));
                    java.lang.String str3 = cpuClusterStatus2.governor;
                    a.wv.v(str3, "status.governor");
                    A(textView3, str3);
                }
                i2++;
            }
            if (this.y) {
                android.widget.TextView textView4 = (android.widget.TextView) this.q.a(gu0VarArr[13]);
                java.lang.String str4 = this.D.gpuMinFreq;
                a.wv.v(str4, "status.gpuMinFreq");
                textView4.setText(E(str4));
                android.widget.TextView textView5 = (android.widget.TextView) this.p.a(gu0VarArr[12]);
                java.lang.String str5 = this.D.gpuMaxFreq;
                a.wv.v(str5, "status.gpuMaxFreq");
                textView5.setText(E(str5));
                ((android.widget.TextView) this.o.a(gu0VarArr[11])).setText(this.D.adrenoGovernor);
            }
            int i3 = this.w;
            for (int i4 = 0; i4 < i3; i4++) {
                android.widget.CheckBox checkBox = (android.widget.CheckBox) this.x.get(i4);
                java.lang.Boolean bool = this.D.coreOnline.get(i4);
                a.wv.v(bool, "status.coreOnline[i]");
                checkBox.setChecked(bool.booleanValue());
            }
            ((android.widget.TextView) this.k.a(gu0VarArr[7])).setText(this.D.cpusetBg);
            ((android.widget.TextView) this.m.a(gu0VarArr[9])).setText(this.D.cpusetSysBg);
            ((android.widget.TextView) this.l.a(gu0VarArr[8])).setText(this.D.cpusetFg);
            ((android.widget.TextView) this.n.a(gu0VarArr[10])).setText(this.D.cpusetTop);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558445);
        setBackArrow();
        if (getIntent().hasExtra("cpuModeName")) {
            this.u = getIntent().getStringExtra("cpuModeName");
        }
        ((com.omarea.common.ui.OverScrollView) this.t.a(J[16])).setVisibility(8);
        a.ty tyVar = a.z80.b;
        a.c7 c7Var = new a.c7(this, null);
        int i = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i != 0) {
            tyVar = tyVar2;
        }
        int i2 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i2 == 2 ? new a.av0(W, c7Var) : new a.f(W, true);
        av0Var.S(i2, av0Var, c7Var);
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.D().getBoolean("dynamic_control", false) && this.u == null) {
            a.wv.M0(a.wv.b(a.by0.f57a), null, new a.d7(this, null), 3);
            return;
        }
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root")) {
            this.G.getClass();
            java.lang.String[] p = a.ls.p();
            if (p.length > 0) {
                a.wv.M0(a.wv.b(a.by0.f57a), null, new a.e7(this, p, null), 3);
            }
        }
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        B();
        z();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onStart() {
        java.lang.String str;
        super.onStart();
        if (this.u == null) {
            str = getString(2131952895);
        } else {
            java.lang.String string = getString(2131953186);
            a.nk nkVar = a.b11.c;
            str = string + "[" + a.tg1.n(this.u) + "]";
        }
        setTitle(str);
        if ((this.C == null || this.u == null) && this.I == null) {
            java.util.Timer timer = new java.util.Timer("ActivityCPUController");
            timer.schedule(new a.hr(3, this), 300L, 1000L);
            this.I = timer;
        }
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onStop() {
        super.onStop();
        B();
    }

    public final void q(int i) {
        android.view.View inflate = android.view.View.inflate(getContext(), 2131558615, null);
        ((android.widget.LinearLayout) this.f.a(J[2])).addView(inflate);
        ((android.widget.TextView) inflate.findViewById(2131362234)).setText("CPU - Cluster " + i);
        inflate.setTag("cluster_" + i);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362232);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(2131362231);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(2131362229);
        android.view.View findViewById = inflate.findViewById(2131362230);
        android.view.View findViewById2 = inflate.findViewById(2131362233);
        textView.setOnClickListener(new a.p6(this, i, 1));
        textView2.setOnClickListener(new a.p6(this, i, 2));
        textView3.setOnClickListener(new a.p6(this, i, 3));
        findViewById.setOnClickListener(new a.p6(this, i, 4));
        findViewById2.setOnClickListener(new a.p6(this, i, 5));
    }

    public final void r() {
        a.gu0[] gu0VarArr = J;
        ((android.widget.TextView) this.k.a(gu0VarArr[7])).setOnClickListener(new a.q6(this, 2));
        ((android.widget.TextView) this.m.a(gu0VarArr[9])).setOnClickListener(new a.q6(this, 3));
        ((android.widget.TextView) this.l.a(gu0VarArr[8])).setOnClickListener(new a.q6(this, 4));
        ((android.widget.TextView) this.n.a(gu0VarArr[10])).setOnClickListener(new a.q6(this, 5));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [a.ng1, java.lang.Object] */
    public final void s(java.lang.String str, a.w6 w6Var) {
        if (str.length() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = this.w;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(java.lang.Boolean.FALSE);
            }
            if (str.length() != 0 && !a.wv.e(str, "error")) {
                for (java.lang.String str2 : (Iterable<java.lang.String>) a.yi1.y2(str, new java.lang.String[]{","})) {
                    if (a.yi1.g2(str2, "-")) {
                        try {
                            java.util.List y2 = a.yi1.y2(str2, new java.lang.String[]{"-"});
                            int parseInt = java.lang.Integer.parseInt((java.lang.String) y2.get(0));
                            int parseInt2 = java.lang.Integer.parseInt((java.lang.String) y2.get(1));
                            if (parseInt <= parseInt2) {
                                while (true) {
                                    if (parseInt < arrayList.size()) {
                                        arrayList.set(parseInt, java.lang.Boolean.TRUE);
                                    }
                                    if (parseInt != parseInt2) {
                                        parseInt++;
                                    }
                                }
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    } else {
                        int parseInt3 = java.lang.Integer.parseInt(str2);
                        if (parseInt3 < arrayList.size()) {
                            arrayList.set(parseInt3, java.lang.Boolean.TRUE);
                        }
                    }
                }
            }
            boolean[] u2 = a.qv.u2(arrayList);
            java.lang.String string = getString(2131953174);
            a.wv.v(string, "getString(R.string.perf_choose_cores)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i3 = this.w;
            for (int i4 = 0; i4 < i3; i4++) {
                a.ng1 obj = new a.ng1();
                obj.f381a = a.ii1.d("Cpu", i4);
                if (i4 < u2.length) {
                    obj.d = u2[i4];
                }
                arrayList2.add(obj);
            }
            a.b70 b70Var = new a.b70(getThemeMode().f442a, arrayList2, true, new a.w1(2, new a.v6(w6Var, this)), 7);
            b70Var.t0 = string;
            b70Var.Y();
            b70Var.V(getSupportFragmentManager(), "cpu-control");
        }
    }

    public final void t() {
        a.gu0[] gu0VarArr = J;
        int i = 1;
        int i2 = 8;
        int i3 = 6;
        try {
            int i4 = this.v;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                q(i6);
            }
            if (this.y) {
                ((android.widget.TextView) this.q.a(gu0VarArr[13])).setOnClickListener(new a.q6(this, i3));
                ((android.widget.TextView) this.p.a(gu0VarArr[12])).setOnClickListener(new a.q6(this, 7));
                ((android.widget.TextView) this.o.a(gu0VarArr[11])).setOnClickListener(new a.q6(this, i2));
            }
            java.util.ArrayList arrayList = this.x;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((android.widget.CheckBox) arrayList.get(i7)).setOnClickListener(new a.p6(this, i7, i5));
            }
            r();
            ((android.widget.Switch) this.e.a(gu0VarArr[1])).setOnClickListener(new a.q6(this, i5));
        } catch (java.lang.Exception unused) {
        }
        if (this.u != null) {
            ((com.omarea.ui.BlurViewLinearLayout) this.s.a(gu0VarArr[15])).setVisibility(8);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.h.a(gu0VarArr[4]);
        a.u20 u20Var = a.z80.f728a;
        a.zx0 zx0Var = a.by0.f57a;
        a.wv.M0(a.wv.b(zx0Var), null, new a.y6(textView, this, null), 3);
        a.wv.M0(a.wv.b(zx0Var), null, new a.z6((android.widget.TextView) this.j.a(gu0VarArr[6]), this, null), 3);
        ((android.widget.TextView) this.i.a(gu0VarArr[5])).setOnClickListener(new a.q6(this, i));
    }

    public final java.lang.String[] v(int i) {
        java.util.HashMap hashMap = this.E;
        java.lang.String[] strArr = (java.lang.String[]) hashMap.get(java.lang.Integer.valueOf(i));
        if (strArr == null || strArr.length < 2) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            this.G.getClass();
            java.lang.String[] c = a.ls.c(i);
            a.wv.v(c, "cpuUtil.getAvailableFrequencies(cluster)");
            hashMap.put(valueOf, c);
        }
        java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i));
        a.wv.s(obj);
        return (java.lang.String[]) obj;
    }

    public final void w(java.lang.String str, java.util.ArrayList arrayList, int i, a.s6 s6Var) {
        java.util.Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            boolean z = true;
            char c = 1;
            if (!it.hasNext()) {
                a.b70 b70Var = new a.b70(getThemeMode().f442a, arrayList, false, new a.w1(c != 0 ? 1 : 0, s6Var), 7);
                b70Var.t0 = str;
                b70Var.Y();
                b70Var.V(getSupportFragmentManager(), "cpu-control");
                return;
            }
            java.lang.Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                a.b20.p1();
                throw null;
            }
            a.ng1 ng1Var = (a.ng1) next;
            if (i2 != i) {
                z = false;
            }
            ng1Var.d = z;
            i2 = i3;
        }
    }

    public final void z() {
        a.gz gzVar = new a.gz(getContext());
        java.lang.String str = this.u;
        java.lang.String str2 = gzVar.c;
        if (str == null) {
            if (!((android.widget.Switch) this.e.a(J[1])).isChecked()) {
                gzVar.h(null, str2);
                return;
            }
        }
        java.util.ArrayList<com.omarea.model.CpuClusterStatus> arrayList = this.D.clusters;
        if (arrayList != null) {
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    a.b20.p1();
                    throw null;
                }
                this.G.getClass();
                ((com.omarea.model.CpuClusterStatus) obj).governor_params = a.gy.N(a.ls.n(i));
                i = i2;
            }
        }
        com.omarea.model.CpuStatus cpuStatus = this.D;
        java.lang.String str3 = this.u;
        if (str3 != null) {
            str2 = str3;
        }
        if (!gzVar.h(cpuStatus, str2)) {
            android.widget.Toast.makeText(getContext(), getString(2131953198), 0).show();
        } else if (this.u != null) {
            gzVar.k();
        }
    }
}
