package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class fw implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ fw(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [a.ng1, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        a.bp0 bp0Var;
        int i = this.c;
        int i2 = 1;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((androidx.activity.ComponentActivity) obj).invalidateMenu();
                return;
            case 1:
                a.ow.a((a.ow) obj);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((androidx.activity.a) obj).b();
                return;
            case 3:
                a.k71 k71Var = (a.k71) obj;
                a.k71 k71Var2 = a.k71.k;
                a.wv.w(k71Var, "this$0");
                int i3 = k71Var.d;
                androidx.lifecycle.a aVar = k71Var.h;
                if (i3 == 0) {
                    k71Var.e = true;
                    aVar.e(a.ev0.ON_PAUSE);
                }
                if (k71Var.c == 0 && k71Var.e) {
                    aVar.e(a.ev0.ON_STOP);
                    k71Var.f = true;
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
            default:
                java.lang.Runnable runnable = (java.lang.Runnable) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityImg.l;
                a.wv.w(runnable, "$next");
                runnable.run();
                return;
            case 5:
                a.cs csVar = (a.cs) obj;
                csVar.c = false;
                com.google.android.material.sidesheet.SideSheetBehavior sideSheetBehavior = (com.google.android.material.sidesheet.SideSheetBehavior) csVar.e;
                a.pq1 pq1Var = sideSheetBehavior.viewDragHelper;
                if (pq1Var != null && pq1Var.g()) {
                    csVar.a(csVar.b);
                    return;
                } else {
                    if (sideSheetBehavior.state == 2) {
                        sideSheetBehavior.setState(csVar.b);
                        return;
                    }
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                ((a.jv) obj).t(true);
                return;
            case 7:
                a.ca0 ca0Var = (a.ca0) obj;
                boolean isPopupShowing = ca0Var.h.isPopupShowing();
                ca0Var.t(isPopupShowing);
                ca0Var.m = isPopupShowing;
                return;
            case 8:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                a.q10 q10Var = a.q10.f457a;
                a.wv.w(arrayList, "$callbacks");
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((a.at) ((a.zs) it.next())).j("error");
                    } catch (java.lang.Exception unused) {
                    }
                }
                return;
            case 9:
                android.widget.EditText editText = (android.widget.EditText) obj;
                a.wv.w(editText, "$editText");
                if (editText.isAttachedToWindow()) {
                    editText.requestFocus();
                    java.lang.Object systemService = editText.getContext().getSystemService("input_method");
                    android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(editText, 1);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                a.w60 w60Var = (a.w60) obj;
                a.wv.w(w60Var, "this$0");
                w60Var.f654a.a();
                return;
            case 11:
                a.b70 b70Var = (a.b70) obj;
                int i4 = a.b70.y0;
                a.wv.w(b70Var, "this$0");
                android.view.View view = b70Var.H;
                a.wv.s(view);
                android.view.View findViewById = view.findViewById(2131362097);
                android.view.View view2 = b70Var.H;
                a.wv.s(view2);
                android.view.View findViewById2 = view2.findViewById(2131362098);
                if (b70Var.v0) {
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                    if (findViewById2 == null) {
                        return;
                    }
                    findViewById2.setVisibility(0);
                    return;
                }
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                if (findViewById2 == null) {
                    return;
                }
                findViewById2.setVisibility(8);
                return;
            case 12:
                a.e70 e70Var = (a.e70) obj;
                a.wv.w(e70Var, "this$0");
                if (e70Var.m) {
                    android.view.View view3 = e70Var.g;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    android.view.View view4 = e70Var.h;
                    if (view4 == null) {
                        return;
                    }
                    view4.setVisibility(0);
                    return;
                }
                android.view.View view5 = e70Var.g;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                android.view.View view6 = e70Var.h;
                if (view6 == null) {
                    return;
                }
                view6.setVisibility(8);
                return;
            case 13:
                com.omarea.common.ui.SeekBar seekBar = (com.omarea.common.ui.SeekBar) obj;
                int i5 = com.omarea.common.ui.SeekBar.i;
                a.wv.w(seekBar, "this$0");
                seekBar.a();
                return;
            case 14:
                com.omarea.data.customer.BatteryReceiver.onReceive$lambda$0((com.omarea.data.customer.BatteryReceiver) obj);
                return;
            case 15:
                a.ej1 ej1Var = (a.ej1) obj;
                a.wv.w(ej1Var, "this$0");
                android.app.Activity activity = (android.app.Activity) ej1Var.c;
                android.widget.Toast.makeText(activity, activity.getString(2131952711), 1).show();
                return;
            case 16:
                a.a2 a2Var = (a.a2) obj;
                int i6 = a.a2.d0;
                a.wv.w(a2Var, "this$0");
                a.b81 b81Var = a2Var.X;
                if (b81Var == null) {
                    a.wv.M1("progressBarDialog");
                    throw null;
                }
                java.lang.String string = a2Var.L().getString(2131952715);
                a.wv.v(string, "requireContext().getStri….string.kr_params_render)");
                b81Var.b(string);
                return;
            case 17:
                a.lu luVar = (a.lu) obj;
                java.lang.Runnable runnable2 = luVar.c;
                java.lang.String s0 = a.wv.s0(false);
                android.content.Context context = luVar.f331a;
                java.lang.String[] stringArray = context.getResources().getStringArray(2130903072);
                a.wv.v(stringArray, "context.resources.getStr…ay(R.array.su_alias_name)");
                java.lang.String[] stringArray2 = context.getResources().getStringArray(2130903061);
                a.wv.v(stringArray2, "context.resources.getStr…(R.array.config_su_alias)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(stringArray2.length);
                int length = stringArray2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    java.lang.String str = stringArray2[i7];
                    ng1 obj2 = new ng1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    obj2.f381a = stringArray[i8];
                    obj2.c = str;
                    arrayList2.add(obj2);
                    i7++;
                    i8++;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    java.lang.Object next = it2.next();
                    if (a.wv.e(((a.ng1) next).c, s0)) {
                        arrayList4.add(next);
                    }
                }
                a.e70 e70Var2 = new a.e70(context, arrayList3, new java.util.ArrayList(arrayList4), false);
                java.lang.String string2 = context.getString(2131953612);
                a.wv.v(string2, "context.getString(R.string.switch_root_cmd)");
                e70Var2.j = string2;
                e70Var2.e();
                e70Var2.l = new a.be0(runnable2, i2, luVar);
                e70Var2.c();
                return;
            case 18:
                com.omarea.ui.TabBarView tabBarView = (com.omarea.ui.TabBarView) obj;
                int i9 = com.omarea.ui.TabBarView.n;
                a.wv.w(tabBarView, "this$0");
                android.widget.FrameLayout frameLayout = tabBarView.l;
                if (frameLayout == null) {
                    a.wv.M1("scrollView");
                    throw null;
                }
                if (frameLayout instanceof android.widget.HorizontalScrollView) {
                    ((android.widget.HorizontalScrollView) frameLayout).fullScroll(66);
                    return;
                } else {
                    if (frameLayout instanceof android.widget.ScrollView) {
                        ((android.widget.ScrollView) frameLayout).fullScroll(130);
                        return;
                    }
                    return;
                }
            case 19:
                com.omarea.ui.TreemapView treemapView = (com.omarea.ui.TreemapView) obj;
                int i10 = com.omarea.ui.TreemapView.N;
                a.wv.w(treemapView, "this$0");
                treemapView.K = true;
                a.vn1 vn1Var = treemapView.J;
                if (vn1Var == null || (bp0Var = treemapView.z) == null) {
                    return;
                }
                bp0Var.i(vn1Var);
                return;
            case 20:
                com.omarea.ui.bench.CyclesPowerView.setSamples$lambda$0((com.omarea.ui.bench.CyclesPowerView) obj);
                return;
            case 21:
                com.omarea.ui.files.BreadcrumbView.setPath$lambda$2((com.omarea.ui.files.BreadcrumbView) obj);
                return;
            case 22:
                com.omarea.ui.power.PowerStatView powerStatView = (com.omarea.ui.power.PowerStatView) obj;
                int i11 = com.omarea.ui.power.PowerStatView.w;
                a.wv.w(powerStatView, "this$0");
                powerStatView.invalidate();
                return;
            case 23:
                com.omarea.vtools.AccessibilitySceneMode accessibilitySceneMode = (com.omarea.vtools.AccessibilitySceneMode) obj;
                int i12 = com.omarea.vtools.AccessibilitySceneMode.E;
                a.wv.w(accessibilitySceneMode, "this$0");
                if (accessibilitySceneMode.B) {
                    return;
                }
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string3 = accessibilitySceneMode.getString(2131951823);
                a.wv.v(string3, "getString(R.string.accessibility_disconnected)");
                a.fs1.X(string3, 0);
                return;
            case 24:
                com.omarea.vtools.activities.ActivityActionPage activityActionPage = (com.omarea.vtools.activities.ActivityActionPage) obj;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityActionPage.o;
                a.wv.w(activityActionPage, "this$0");
                activityActionPage.e.a();
                return;
            case 25:
                com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve = (com.omarea.vtools.activities.ActivityAppRetrieve) obj;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppRetrieve.k;
                a.wv.w(activityAppRetrieve, "this$0");
                a.gy.h("/data/system/users/0/package-restrictions.xml.fallback");
                a.gy.h("/data/system/users/0/package-restrictions.xml.reservecopy");
                a.gy.h("/data/system/users/0/package-restrictions.xml");
                java.lang.String str2 = "sync;" + activityAppRetrieve.getString(2131952130);
                a.wv.w(str2, "shell");
                a.q10 q10Var2 = a.q10.f457a;
                a.q10.l(str2);
                return;
            case 26:
                com.omarea.vtools.activities.ActivityAppXposedDetails activityAppXposedDetails = (com.omarea.vtools.activities.ActivityAppXposedDetails) obj;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                try {
                    activityAppXposedDetails.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("http://vtools.omarea.com/")));
                    return;
                } catch (java.lang.Exception unused2) {
                    android.widget.Toast.makeText(activityAppXposedDetails.getContext(), "启动在线页面失败！", 0).show();
                    return;
                }
            case 27:
                com.omarea.vtools.activities.ActivityFileSelector activityFileSelector = (com.omarea.vtools.activities.ActivityFileSelector) obj;
                a.fa0 fa0Var = com.omarea.vtools.activities.ActivityFileSelector.m;
                a.wv.w(activityFileSelector, "this$0");
                a.ti tiVar = activityFileSelector.g;
                a.wv.s(tiVar);
                java.io.File file = tiVar.i;
                if (file != null) {
                    activityFileSelector.setResult(-1, new android.content.Intent().putExtra("file", file.getAbsolutePath()));
                    activityFileSelector.finish();
                    return;
                }
                return;
            case 28:
                java.util.List list = (java.util.List) obj;
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityFpsSessions.t;
                a.wv.w(list, "$idList");
                a.oe1 oe1Var = new a.oe1();
                java.util.Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    oe1Var.m((java.lang.String) it3.next());
                }
                return;
        }
    }
}
