package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class wi implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ wi(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Runnable runnable;
        a.bp0 bp0Var;
        android.view.ViewGroup viewGroup;
        a.bp0 bp0Var2;
        android.view.View findViewById;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.aj ajVar = (a.aj) this.d;
                a.ng1 ng1Var = (a.ng1) this.e;
                a.wv.w(ajVar, "this$0");
                a.wv.w(ng1Var, "$item");
                a.bp0 bp0Var3 = ajVar.k;
                a.wv.s(bp0Var3);
                if (((java.lang.Boolean) bp0Var3.i(ng1Var)).booleanValue()) {
                    ajVar.d.remove(ng1Var);
                    ajVar.h.remove(ng1Var);
                    ajVar.notifyDataSetChanged();
                    return;
                }
                return;
            case 1:
                a.a40 a40Var = (a.a40) this.d;
                android.widget.AbsListView absListView = (android.widget.AbsListView) this.e;
                int i4 = a.a40.t0;
                a.wv.w(a40Var, "this$0");
                a.wv.v(absListView, "absListView");
                android.widget.Adapter adapter = absListView.getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.common.ui.AdapterAppChooser");
                java.util.ArrayList a2 = ((a.xg) adapter).a();
                a.x30 x30Var = a40Var.q0;
                if (x30Var != null) {
                    x30Var.b(a2);
                }
                a40Var.S(false, false);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.b70 b70Var = (a.b70) this.d;
                android.view.View view2 = (android.view.View) this.e;
                int i5 = a.b70.y0;
                a.wv.w(b70Var, "this$0");
                a.wv.v(view2, "absListView");
                b70Var.W(view2);
                return;
            case 3:
                a.e70 e70Var = (a.e70) this.d;
                android.view.View view3 = (android.view.View) this.e;
                a.wv.w(e70Var, "this$0");
                a.wv.v(view3, "absListView");
                android.widget.ListAdapter T = a.b20.T(view3);
                a.wv.t(T, "null cannot be cast to non-null type com.omarea.common.ui.AdapterItemChooser2");
                a.zi ziVar = (a.zi) T;
                java.util.ArrayList arrayList = ziVar.i;
                boolean[] a3 = ziVar.a();
                a.c70 c70Var = e70Var.l;
                if (c70Var != null) {
                    c70Var.a(arrayList, a3);
                }
                a.v60 v60Var = e70Var.i;
                if (v60Var != null) {
                    v60Var.a();
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.f70 f70Var = (a.f70) this.d;
                android.view.View view4 = (android.view.View) this.e;
                int i6 = a.f70.u0;
                a.wv.w(f70Var, "this$0");
                a.wv.v(view4, "absListView");
                android.widget.ListAdapter T2 = a.b20.T(view4);
                a.wv.t(T2, "null cannot be cast to non-null type com.omarea.common.ui.AdapterItemChooser2");
                a.zi ziVar2 = (a.zi) T2;
                java.util.ArrayList arrayList2 = ziVar2.i;
                ziVar2.a();
                a.k4 k4Var = f70Var.r0;
                if (k4Var != null) {
                    a.wv.w(arrayList2, "selected");
                    android.util.ArraySet arraySet = new android.util.ArraySet();
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arraySet.add(((a.ng1) it.next()).c);
                    }
                    com.omarea.vtools.activities.ActivityAppDetails activityAppDetails = k4Var.f280a;
                    android.content.Context context = activityAppDetails.getContext();
                    a.wv.w(context, "context");
                    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("scene_actions", 0);
                    java.util.ArrayList f = new a.l1(context, 11).f();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(f, 10));
                    java.util.Iterator it2 = f.iterator();
                    while (it2.hasNext()) {
                        a.s10 s10Var = (a.s10) it2.next();
                        a.s10 s10Var2 = new a.s10();
                        s10Var2.b(s10Var.c);
                        s10Var2.a(s10Var.d);
                        arrayList3.add(s10Var2);
                    }
                    java.lang.String str = activityAppDetails.u().packageName;
                    a.wv.v(str, "sceneConfigInfo.packageName");
                    if (arraySet.size() == 0) {
                        sharedPreferences.edit().remove(str).apply();
                    } else {
                        sharedPreferences.edit().putStringSet(str, arraySet).apply();
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(a.op.J1(arrayList2, 10));
                    java.util.Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((a.ng1) it3.next()).f381a);
                    }
                    ((android.widget.TextView) activityAppDetails.K.a(com.omarea.vtools.activities.ActivityAppDetails.X[35])).setText(a.yi1.F2(a.qv.j2(arrayList4, "\n\n", null, null, null, 62)).toString());
                }
                f70Var.S(false, false);
                return;
            case 5:
                a.l70 l70Var = (a.l70) this.d;
                a.ma1 ma1Var = (a.ma1) this.e;
                a.fs1 fs1Var = a.l70.A0;
                a.wv.w(l70Var, "this$0");
                a.wv.w(ma1Var, "$forceStopRunnable");
                if (l70Var.t0 && (runnable = (java.lang.Runnable) ma1Var.c) != null) {
                    runnable.run();
                }
                try {
                    l70Var.S(false, false);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gk gkVar = (a.gk) this.d;
                a.hk hkVar = (a.hk) this.e;
                a.wv.w(gkVar, "$holder");
                a.wv.w(hkVar, "this$0");
                int d = gkVar.d();
                if (d == -1 || (bp0Var = hkVar.h) == null) {
                    return;
                }
                java.lang.Object obj = hkVar.g.get(d);
                a.wv.v(obj, "list[pos]");
                bp0Var.i(obj);
                return;
            case 7:
                a.bp0 bp0Var4 = (a.bp0) this.d;
                a.ha1 ha1Var = (a.ha1) this.e;
                a.gu0[] gu0VarArr = com.omarea.ui.BatteryRealtimeStatus.p;
                a.wv.w(bp0Var4, "$setKeepOn");
                a.wv.w(ha1Var, "$keepOn");
                bp0Var4.i(java.lang.Boolean.valueOf(!ha1Var.c));
                view.setKeepScreenOn(ha1Var.c);
                return;
            case 8:
                a.ti tiVar = (a.ti) this.d;
                a.oi oiVar = (a.oi) this.e;
                int i7 = a.oi.x;
                a.wv.w(tiVar, "this$0");
                a.wv.w(oiVar, "this$1");
                int d2 = oiVar.d();
                if (d2 == -1) {
                    return;
                }
                boolean z = tiVar.l;
                if (z && d2 == 0) {
                    if (z) {
                        java.io.File file = tiVar.h;
                        a.wv.s(file);
                        java.io.File parentFile = file.getParentFile();
                        a.wv.s(parentFile);
                        tiVar.q(parentFile);
                        return;
                    }
                    return;
                }
                java.io.File p = tiVar.p(d2);
                a.wv.t(p, "null cannot be cast to non-null type java.io.File");
                if (!p.isDirectory()) {
                    int i8 = a.x60.f681a;
                    android.content.Context context2 = oiVar.f91a.getContext();
                    a.wv.v(context2, "holder.itemView.context");
                    java.lang.String string = oiVar.f91a.getContext().getString(tiVar.o ? 2131952282 : 2131952280);
                    a.wv.v(string, "holder.itemView.context.…lse R.string.file_select)");
                    java.lang.String absolutePath = p.getAbsolutePath();
                    a.wv.v(absolutePath, "file.absolutePath");
                    a.fs1.i(context2, string, absolutePath, new a.mi(p, oiVar, tiVar, i3), new a.hs(2));
                    return;
                }
                if (!p.exists()) {
                    android.widget.Toast.makeText(oiVar.f91a.getContext(), oiVar.f91a.getContext().getString(2131952266), 0).show();
                    return;
                }
                java.io.File[] listFiles = p.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    tiVar.q(p);
                    return;
                }
                android.view.View view5 = oiVar.f91a;
                java.lang.String string2 = view5.getContext().getString(2131952265);
                int[] iArr = a.vh1.B;
                android.view.ViewGroup viewGroup2 = null;
                while (true) {
                    if (view5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                        viewGroup = (android.view.ViewGroup) view5;
                    } else {
                        if (view5 instanceof android.widget.FrameLayout) {
                            if (view5.getId() == 16908290) {
                                viewGroup = (android.view.ViewGroup) view5;
                            } else {
                                viewGroup2 = (android.view.ViewGroup) view5;
                            }
                        }
                        java.lang.Object parent = view5.getParent();
                        view5 = parent instanceof android.view.View ? (android.view.View) parent : null;
                        if (view5 == null) {
                            viewGroup = viewGroup2;
                        }
                    }
                }
                if (viewGroup == null) {
                    throw new java.lang.IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
                }
                android.content.Context context3 = viewGroup.getContext();
                android.view.LayoutInflater from = android.view.LayoutInflater.from(context3);
                android.content.res.TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(a.vh1.B);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                obtainStyledAttributes.recycle();
                com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = (com.google.android.material.snackbar.SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? 2131558482 : 2131558696, viewGroup, false);
                a.vh1 vh1Var = new a.vh1(context3, viewGroup, snackbarContentLayout, snackbarContentLayout);
                ((com.google.android.material.snackbar.SnackbarContentLayout) vh1Var.i.getChildAt(0)).getMessageView().setText(string2);
                vh1Var.k = -1;
                a.yh1 b = a.yh1.b();
                int i9 = vh1Var.k;
                if (i9 == -2) {
                    i9 = -2;
                } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                    i9 = vh1Var.A.getRecommendedTimeoutMillis(i9, 3);
                }
                a.sq sqVar = vh1Var.t;
                synchronized (b.f710a) {
                    try {
                        if (b.c(sqVar)) {
                            a.xh1 xh1Var = b.c;
                            xh1Var.b = i9;
                            b.b.removeCallbacksAndMessages(xh1Var);
                            b.f(b.c);
                            return;
                        }
                        a.xh1 xh1Var2 = b.d;
                        if (xh1Var2 == null || sqVar == null || xh1Var2.f689a.get() != sqVar) {
                            b.d = new a.xh1(i9, sqVar);
                        } else {
                            b.d.b = i9;
                        }
                        a.xh1 xh1Var3 = b.c;
                        if (xh1Var3 == null || !b.a(xh1Var3, 4)) {
                            b.c = null;
                            b.g();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 9:
                a.xj xjVar = (a.xj) this.d;
                a.tj tjVar = (a.tj) this.e;
                int i10 = a.tj.y;
                a.wv.w(xjVar, "this$0");
                a.wv.w(tjVar, "this$1");
                int d3 = tjVar.d();
                if (d3 == -1) {
                    return;
                }
                if (xjVar.r && d3 == 0) {
                    xjVar.t();
                    return;
                }
                a.mc1 s = xjVar.s(d3);
                java.lang.String str2 = s.f;
                if (str2 != null && str2.length() != 0) {
                    s = a.fs1.r(str2);
                }
                if (xjVar.z) {
                    boolean z2 = !xjVar.A.contains(s.c);
                    xjVar.x(d3, z2);
                    tjVar.x.setChecked(z2);
                    return;
                } else if (!s.e) {
                    android.view.View view6 = tjVar.f91a;
                    android.widget.Toast.makeText(view6.getContext(), view6.getContext().getString(2131952266), 0).show();
                    return;
                } else if (s.f343a) {
                    xjVar.u(s);
                    return;
                } else {
                    if (xjVar.p) {
                        a.bp0 bp0Var5 = xjVar.j;
                        a.wv.s(bp0Var5);
                        bp0Var5.i(s);
                        return;
                    }
                    return;
                }
            case 10:
                com.omarea.ui.files.BreadcrumbView breadcrumbView = (com.omarea.ui.files.BreadcrumbView) this.d;
                java.lang.String str3 = (java.lang.String) this.e;
                int i11 = com.omarea.ui.files.BreadcrumbView.e;
                a.wv.w(breadcrumbView, "this$0");
                a.wv.w(str3, "$path");
                a.bp0 bp0Var6 = breadcrumbView.c;
                if (bp0Var6 != null) {
                    bp0Var6.i(str3);
                    return;
                }
                return;
            case 11:
                android.content.Context context4 = (android.content.Context) this.d;
                a.d51 d51Var = (a.d51) this.e;
                int i12 = a.d51.k;
                a.wv.w(context4, "$context");
                a.wv.w(d51Var, "this$0");
                int i13 = a.x60.f681a;
                a.z41 z41Var = d51Var.c;
                java.lang.String str4 = z41Var.d;
                java.lang.String string3 = context4.getString(z41Var.e);
                a.wv.v(string3, "context.getString(dimension.helpRes)");
                a.fs1.F(context4, str4, string3, null);
                return;
            case 12:
                android.content.Context context5 = (android.content.Context) this.d;
                a.k51 k51Var = (a.k51) this.e;
                int i14 = a.k51.k;
                a.wv.w(context5, "$context");
                a.wv.w(k51Var, "this$0");
                int i15 = a.x60.f681a;
                java.lang.String str5 = k51Var.c.d;
                java.lang.String string4 = context5.getString(2131952308);
                a.wv.v(string4, "context.getString(R.stri…erf_mem_help_stall_ratio)");
                a.fs1.F(context5, str5, string4, null);
                return;
            case 13:
                a.ph phVar = (a.ph) this.d;
                a.wh whVar = (a.wh) this.e;
                int i16 = a.ph.y;
                a.wv.w(phVar, "this$0");
                a.wv.w(whVar, "this$1");
                int d4 = phVar.d();
                if (d4 == -1) {
                    return;
                }
                java.lang.Object obj2 = whVar.m.get(d4);
                a.th thVar = obj2 instanceof a.th ? (a.th) obj2 : null;
                if (thVar == null) {
                    return;
                }
                if (thVar.f557a) {
                    boolean z3 = !whVar.k;
                    whVar.k = z3;
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.N("pu_group_games_collapsed", z3);
                } else {
                    boolean z4 = !whVar.l;
                    whVar.l = z4;
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.N("pu_group_apps_collapsed", z4);
                }
                whVar.s();
                whVar.f();
                return;
            case 14:
                a.lj ljVar = (a.lj) this.d;
                a.nj njVar = (a.nj) this.e;
                int i17 = a.lj.B;
                a.wv.w(ljVar, "this$0");
                a.wv.w(njVar, "this$1");
                int d5 = ljVar.d();
                if (d5 == -1 || (bp0Var2 = njVar.k) == null) {
                    return;
                }
                java.util.ArrayList arrayList5 = njVar.p;
                if (arrayList5 == null) {
                    a.wv.M1("list");
                    throw null;
                }
                java.lang.Object obj3 = arrayList5.get(d5);
                a.wv.v(obj3, "list[position]");
                bp0Var2.i(obj3);
                return;
            case 15:
                com.omarea.vtools.activities.ActivityActionPage activityActionPage = (com.omarea.vtools.activities.ActivityActionPage) this.d;
                com.omarea.krscript.model.PageMenuOption pageMenuOption = (com.omarea.krscript.model.PageMenuOption) this.e;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityActionPage.o;
                a.wv.w(activityActionPage, "this$0");
                a.wv.w(pageMenuOption, "$menuOption");
                activityActionPage.r(pageMenuOption);
                return;
            case 16:
                com.omarea.vtools.activities.ActivityAppDetails activityAppDetails2 = (com.omarea.vtools.activities.ActivityAppDetails) this.d;
                android.widget.TextView textView = (android.widget.TextView) this.e;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppDetails.X;
                a.wv.w(activityAppDetails2, "this$0");
                a.wv.w(textView, "$this_run");
                a.wc0 wc0Var = activityAppDetails2.T;
                wc0Var.getClass();
                java.lang.Integer[] c = a.wc0.c();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                for (int i18 = 0; i18 < 14; i18++) {
                    java.lang.Integer num = c[i18];
                    if (num.intValue() <= activityAppDetails2.R.e()) {
                        arrayList6.add(num);
                    }
                }
                java.util.ArrayList b2 = wc0Var.b(activityAppDetails2.L);
                boolean z5 = activityAppDetails2.getThemeMode().f442a;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(a.op.J1(arrayList6, 10));
                java.util.Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    int intValue = ((java.lang.Number) it4.next()).intValue();
                    a.ng1 ng1Var2 = new a.ng1(java.lang.String.valueOf(intValue), java.lang.String.valueOf(intValue));
                    ng1Var2.d = b2.contains(java.lang.Integer.valueOf(intValue));
                    arrayList7.add(ng1Var2);
                }
                a.b70 b70Var2 = new a.b70(z5, arrayList7, true, new a.p4(activityAppDetails2, i3, textView), 7);
                b70Var2.w0 = 8;
                android.view.View view7 = b70Var2.H;
                if (view7 != null && (findViewById = view7.findViewById(2131363042)) != null) {
                    java.lang.Integer num2 = b70Var2.w0;
                    findViewById.setVisibility(num2 != null ? num2.intValue() : findViewById.getVisibility());
                }
                b70Var2.t0 = "匹配帧率档位";
                b70Var2.Y();
                b70Var2.u0 = "指定FAS允许使用目标帧率档位。如果你不知道这代表什么，请保持默认不要修改！";
                b70Var2.X();
                b70Var2.V(activityAppDetails2.getSupportFragmentManager(), "FAS-TARGET-FPS-LEVELS");
                return;
            case 17:
                android.content.SharedPreferences sharedPreferences2 = (android.content.SharedPreferences) this.d;
                java.lang.String str6 = (java.lang.String) this.e;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityAutoClick.m;
                a.wv.w(sharedPreferences2, "$spf");
                a.wv.w(str6, "$prop");
                android.content.SharedPreferences.Editor edit = sharedPreferences2.edit();
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                edit.putBoolean(str6, ((android.widget.CompoundButton) view).isChecked()).apply();
                java.util.ArrayList arrayList8 = a.dc0.f93a;
                a.dc0.a(a.kc0.q, null);
                return;
            case 18:
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) this.d;
                java.lang.String str7 = (java.lang.String) this.e;
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                java.lang.Object systemService = activityFpsSession.getContext().getSystemService("clipboard");
                a.wv.t(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((android.content.ClipboardManager) systemService).setText(str7);
                a.cp cpVar3 = com.omarea.Scene.c;
                a.fs1.X("OK", 0);
                return;
            case 19:
                com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) this.d;
                a.v60 v60Var2 = (a.v60) this.e;
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityFpsSessions.t;
                a.wv.w(v60Var2, "$dialog");
                boolean z6 = switchOptionItemView.i;
                a.cp cpVar4 = com.omarea.Scene.c;
                a.fs1.N("monitor_fps_perf_event", z6);
                v60Var2.a();
                return;
            case 20:
                com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial = (com.omarea.model.MagiskModuleUnofficial) this.d;
                android.content.Context context6 = (android.content.Context) this.e;
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityModuleDetail.t;
                a.wv.w(magiskModuleUnofficial, "$module");
                a.wv.w(context6, "$context");
                if (!a.yi1.B2(magiskModuleUnofficial.getDownloadUrl(), "http")) {
                    android.widget.Toast.makeText(context6, "Scene无法识别下载地址", 0).show();
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse(magiskModuleUnofficial.getDownloadUrl()));
                context6.startActivity(intent);
                return;
            case 21:
                com.omarea.vtools.activities.ActivityModuleUpload activityModuleUpload = (com.omarea.vtools.activities.ActivityModuleUpload) this.d;
                com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial2 = (com.omarea.model.MagiskModuleUnofficial) this.e;
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityModuleUpload.q;
                a.wv.w(activityModuleUpload, "this$0");
                a.wv.w(magiskModuleUnofficial2, "$module");
                int i19 = a.x60.f681a;
                java.lang.String string5 = activityModuleUpload.getString(2131952978);
                a.wv.v(string5, "getString(R.string.module_delete)");
                java.lang.String string6 = activityModuleUpload.getString(2131952979);
                a.wv.v(string6, "getString(R.string.module_delete_desc)");
                a.fs1.Z(activityModuleUpload, string5, string6, new a.xa(magiskModuleUnofficial2, i, activityModuleUpload), null, 16);
                return;
            case 22:
                android.content.Context context7 = (android.content.Context) this.d;
                com.omarea.vtools.activities.ActivityModules activityModules = (com.omarea.vtools.activities.ActivityModules) this.e;
                a.gu0[] gu0VarArr9 = com.omarea.vtools.activities.ActivityModules.o;
                a.wv.w(context7, "$context");
                a.wv.w(activityModules, "this$0");
                activityModules.startActivityForResult(new android.content.Intent(context7, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityModuleUpload.class), 0);
                return;
            case 23:
                android.widget.Switch r0 = (android.widget.Switch) this.d;
                com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings = (com.omarea.vtools.activities.ActivityOtherSettings) this.e;
                a.gu0[] gu0VarArr10 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.w(r0, "$this_run");
                a.wv.w(activityOtherSettings, "this$0");
                if (r0.isChecked()) {
                    com.omarea.vtools.activities.ActivityFileSelector.m.getClass();
                    android.content.Intent intent2 = new android.content.Intent(activityOtherSettings, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
                    intent2.putExtra("extension", a.yi1.v2("xml", ".", ""));
                    intent2.putExtra("mode", 0);
                    activityOtherSettings.startActivityForResult(intent2, 9999);
                    r0.setChecked(false);
                    return;
                }
                a.vj1 vj1Var = a.nb1.d;
                a.nb1 x = a.gy.x();
                x.getClass();
                java.io.File file2 = new java.io.File((java.lang.String) x.f376a.a());
                if (file2.exists()) {
                    file2.delete();
                }
                android.app.Activity activity = com.omarea.Scene.f;
                if (activity != null) {
                    activity.finishAffinity();
                }
                java.lang.System.exit(0);
                throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 24:
                com.omarea.vtools.activities.ActivityPerfBench activityPerfBench = (com.omarea.vtools.activities.ActivityPerfBench) this.d;
                a.ma1 ma1Var2 = (a.ma1) this.e;
                a.gu0[] gu0VarArr11 = com.omarea.vtools.activities.ActivityPerfBench.z;
                a.wv.w(activityPerfBench, "this$0");
                a.wv.w(ma1Var2, "$cpus");
                a.gu0[] gu0VarArr12 = com.omarea.vtools.activities.ActivityPerfBench.z;
                long progress = ((com.omarea.common.ui.SeekBar) activityPerfBench.f.a(gu0VarArr12[4])).getProgress() * 1000;
                a.m51 m51Var = new a.m51(activityPerfBench, progress, ma1Var2, 1);
                a.lt0 lt0Var = new a.lt0();
                m51Var.i(lt0Var);
                java.lang.String lt0Var2 = lt0Var.toString();
                a.wv.v(lt0Var2, "fun onViewCreated() {\n  …progress)\n        }\n    }");
                a.qi1 qi1Var = activityPerfBench.x;
                if (qi1Var != null) {
                    a.wv.p(qi1Var);
                }
                if (view != null) {
                    view.setVisibility(8);
                }
                ((android.widget.Button) activityPerfBench.k.a(gu0VarArr12[9])).setVisibility(0);
                activityPerfBench.x = a.wv.M0(a.wv.b(a.z80.b), null, new a.sc(lt0Var2, progress, activityPerfBench, null), 3);
                return;
            case 25:
                com.omarea.vtools.activities.ActivityPowerBench activityPowerBench = (com.omarea.vtools.activities.ActivityPowerBench) this.d;
                java.util.ArrayList arrayList9 = (java.util.ArrayList) this.e;
                a.gu0[] gu0VarArr13 = com.omarea.vtools.activities.ActivityPowerBench.U;
                a.wv.w(activityPowerBench, "this$0");
                a.wv.w(arrayList9, "$options");
                new a.b70(activityPowerBench.getThemeMode().f442a, arrayList9, true, new a.bd(activityPowerBench, i2), 4).V(activityPowerBench.getSupportFragmentManager(), "cpu-bench-cores");
                return;
            case 26:
                com.omarea.vtools.activities.ActivityProcess activityProcess = (com.omarea.vtools.activities.ActivityProcess) this.d;
                android.content.Context context8 = (android.content.Context) this.e;
                a.gu0[] gu0VarArr14 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(activityProcess, "this$0");
                a.wv.w(context8, "$context");
                if (!activityProcess.t().isChecked()) {
                    new a.ph0(context8).a(true);
                    return;
                } else {
                    new a.ph0(context8).c.getClass();
                    new a.ph0(context8).b();
                    return;
                }
            case 27:
                com.omarea.vtools.activities.ActivitySwap activitySwap = (com.omarea.vtools.activities.ActivitySwap) this.d;
                com.omarea.vtools.activities.ActivitySwap activitySwap2 = (com.omarea.vtools.activities.ActivitySwap) this.e;
                a.gu0[] gu0VarArr15 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                a.wv.w(activitySwap2, "$context");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                boolean isChecked = ((android.widget.CompoundButton) view).isChecked();
                android.content.SharedPreferences sharedPreferences3 = activitySwap.N;
                if (sharedPreferences3 == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                sharedPreferences3.edit().putBoolean("auto_lmk", isChecked).apply();
                if (!isChecked) {
                    android.widget.Toast.makeText(activitySwap2, activitySwap.getString(2131953542), 0).show();
                    return;
                }
                java.lang.Object systemService2 = activitySwap2.getSystemService("activity");
                a.wv.t(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                ((android.app.ActivityManager) systemService2).getMemoryInfo(memoryInfo);
                a.qm1 qm1Var = new a.qm1(1);
                qm1Var.a(memoryInfo.totalMem);
                android.widget.TextView textView2 = (android.widget.TextView) activitySwap.E.a(com.omarea.vtools.activities.ActivitySwap.W[29]);
                a.nu0 nu0Var = a.nu0.f395a;
                textView2.setText(a.nu0.d(qm1Var.b));
                return;
            case 28:
                a.v60 v60Var3 = (a.v60) this.d;
                com.omarea.vtools.activities.ActivitySwap activitySwap3 = (com.omarea.vtools.activities.ActivitySwap) this.e;
                a.gu0[] gu0VarArr16 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(v60Var3, "$dialog");
                a.wv.w(activitySwap3, "this$0");
                v60Var3.a();
                try {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.setAction("android.intent.action.VIEW");
                    intent3.setData(android.net.Uri.parse(activitySwap3.getString(2131952135)));
                    activitySwap3.getContext().startActivity(intent3);
                    activitySwap3.finish();
                } catch (java.lang.Exception unused2) {
                    android.widget.Toast.makeText(activitySwap3.getContext(), activitySwap3.getString(2131952206), 0).show();
                }
                activitySwap3.finish();
                return;
            default:
                a.f60 f60Var = (a.f60) this.d;
                a.mc1 mc1Var = (a.mc1) this.e;
                a.wv.w(f60Var, "this$0");
                a.wv.w(mc1Var, "$file");
                a.ml mlVar = f60Var.f145a;
                android.content.Intent intent4 = new android.content.Intent(mlVar, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFilesTreemap.class);
                intent4.putExtra("dir", mc1Var.c);
                mlVar.startActivity(intent4);
                return;
        }
    }
}
