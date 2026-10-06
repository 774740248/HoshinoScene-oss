package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ua0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ ua0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [a.ha1, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        android.content.pm.ShortcutManager shortcutManager;
        java.lang.Object obj;
        java.lang.String appName;
        int i;
        java.lang.String str;
        java.lang.String obj2;
        java.lang.String obj3;
        java.lang.String obj4;
        java.lang.String obj5;
        java.lang.String obj6;
        int i2 = 1;
        int i3 = 0;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.l1 l1Var = (a.l1) this.d;
                a.b20 b20Var = (a.b20) this.e;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = (java.util.concurrent.ThreadPoolExecutor) this.f;
                l1Var.getClass();
                try {
                    a.si0 I = a.wv.I(l1Var.b);
                    if (I == null) {
                        throw new java.lang.RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    a.ri0 ri0Var = (a.ri0) I.f432a;
                    synchronized (ri0Var.d) {
                        ri0Var.f = threadPoolExecutor;
                    }
                    I.f432a.a(new a.va0(b20Var, threadPoolExecutor));
                    return;
                } catch (java.lang.Throwable th) {
                    b20Var.J0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                a.a2 a2Var = (a.a2) this.d;
                android.content.Intent intent = (android.content.Intent) this.e;
                com.omarea.krscript.model.ClickableNode clickableNode = (com.omarea.krscript.model.ClickableNode) this.f;
                a.wv.w(a2Var, "this$0");
                a.wv.w(clickableNode, "$clickableNode");
                android.content.Context L = a2Var.L();
                android.graphics.drawable.Drawable I2 = a.fs1.I(a2Var.L(), clickableNode, true);
                a.wv.s(I2);
                a.wv.w(intent, "intent");
                if (intent.hasExtra("page")) {
                    java.io.Serializable serializableExtra = intent.getSerializableExtra("page");
                    a.wv.t(serializableExtra, "null cannot be cast to non-null type com.omarea.krscript.model.PageNode");
                    java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    new a.w21(L, 0).h((com.omarea.krscript.model.PageNode) serializableExtra, valueOf);
                    intent.putExtra("shortcutId", valueOf);
                    intent.removeExtra("page");
                }
                try {
                    java.lang.Object systemService = L.getSystemService("shortcut");
                    a.wv.t(systemService, "null cannot be cast to non-null type android.content.pm.ShortcutManager");
                    shortcutManager = (android.content.pm.ShortcutManager) systemService;
                } catch (java.lang.Exception e) {
                    android.util.Log.e("ActionShortcutManager", e.getMessage());
                }
                if (shortcutManager.isRequestPinShortcutSupported()) {
                    java.lang.String str2 = "addin_" + clickableNode.getIndex();
                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
                    android.content.Context applicationContext = L.getApplicationContext();
                    android.content.ComponentName component = intent.getComponent();
                    a.wv.s(component);
                    intent2.setClassName(applicationContext, component.getClassName());
                    intent2.putExtras(intent);
                    intent2.setFlags(1082130432);
                    android.content.pm.ShortcutInfo.Builder intent3 = new android.content.pm.ShortcutInfo.Builder(L, str2).setIcon(android.graphics.drawable.Icon.createWithBitmap(((android.graphics.drawable.BitmapDrawable) I2).getBitmap())).setShortLabel(clickableNode.getTitle()).setIntent(intent2);
                    android.content.ComponentName component2 = intent.getComponent();
                    a.wv.s(component2);
                    android.content.pm.ShortcutInfo build = intent3.setActivity(component2).build();
                    a.wv.v(build, "Builder(context, id)\n   …                 .build()");
                    android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(L, 0, new android.content.Intent(), 201326592);
                    if (shortcutManager.isRequestPinShortcutSupported()) {
                        java.util.List<android.content.pm.ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
                        a.wv.v(pinnedShortcuts, "shortcutManager.pinnedShortcuts");
                        java.util.Iterator<android.content.pm.ShortcutInfo> it = pinnedShortcuts.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                shortcutManager.requestPinShortcut(build, broadcast.getIntentSender());
                            } else if (a.wv.e(it.next().getId(), str2)) {
                                shortcutManager.updateShortcuts(new a.x2(build, 0));
                            }
                        }
                    }
                    android.widget.Toast.makeText(a2Var.f(), 2131952736, 0).show();
                    return;
                }
                android.widget.Toast.makeText(a2Var.f(), a2Var.m(2131952737), 0).show();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.dw0 dw0Var = (a.dw0) this.d;
                com.omarea.krscript.model.NodeInfoBase nodeInfoBase = (com.omarea.krscript.model.NodeInfoBase) this.e;
                a.mm mmVar = (a.mm) this.f;
                a.wv.w(dw0Var, "$node");
                a.wv.w(nodeInfoBase, "$item");
                a.wv.w(mmVar, "this$0");
                dw0Var.d();
                if (nodeInfoBase instanceof com.omarea.krscript.model.RunnableNode) {
                    com.omarea.krscript.model.RunnableNode runnableNode = (com.omarea.krscript.model.RunnableNode) nodeInfoBase;
                    if (runnableNode.getUpdateBlocks() != null) {
                        a.ew0 ew0Var = (a.ew0) mmVar.d;
                        java.lang.String[] updateBlocks = runnableNode.getUpdateBlocks();
                        a.wv.s(updateBlocks);
                        ew0Var.g(updateBlocks);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                a.tg1 tg1Var = (a.tg1) this.d;
                android.content.Context context = (android.content.Context) this.e;
                a.lt0 lt0Var = (a.lt0) this.f;
                a.wv.w(tg1Var, "this$0");
                a.wv.w(context, "$context");
                try {
                    a.tg1.u(context, lt0Var);
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.ij0 ij0Var = (a.ij0) this.d;
                android.widget.TextView textView = (android.widget.TextView) this.e;
                a.yu0 yu0Var = (a.yu0) this.f;
                int i4 = com.omarea.sysmbol.PerfOptionsRender.d;
                a.wv.w(ij0Var, "$handler");
                a.wv.w(yu0Var, "$allApp$delegate");
                java.lang.Iterable<java.lang.String> iterable = (java.lang.Iterable) ij0Var.getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(iterable, 10));
                for (java.lang.String str3 : iterable) {
                    java.util.Iterator it2 = ((java.util.ArrayList) ((a.vj1) yu0Var).a()).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (a.wv.e(((com.omarea.model.AppInfo) obj).getPackageName(), str3)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) obj;
                    if (appInfo != null && (appName = appInfo.getAppName()) != null) {
                        str3 = appName;
                    }
                    arrayList.add(str3);
                }
                textView.post(new a.sc0(textView, a.qv.j2(arrayList, "，", null, null, null, 62), i2));
                return;
            case 5:
                a.xj xjVar = (a.xj) this.d;
                a.mc1 mc1Var = (a.mc1) this.e;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) this.f;
                a.wv.w(xjVar, "this$0");
                a.wv.w(mc1Var, "$dir");
                a.wv.w(linearLayoutManager, "$lm");
                a.y31 y31Var = (a.y31) xjVar.w.get(mc1Var.c);
                if (y31Var != null) {
                    linearLayoutManager.m1(((java.lang.Number) y31Var.c).intValue(), ((java.lang.Number) y31Var.d).intValue());
                    return;
                } else {
                    linearLayoutManager.m1(0, 0);
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
            default:
                android.view.View view = (android.view.View) this.d;
                a.v60 v60Var = (a.v60) this.e;
                a.bn0 bn0Var = (a.bn0) this.f;
                a.gu0[] gu0VarArr = a.bn0.x0;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(bn0Var, "this$0");
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.O("scene_profile_source", "SOURCE_SCENE_CUSTOM");
                android.content.Context context2 = view.getContext();
                a.wv.v(context2, "this.context");
                new a.gz(context2).k();
                try {
                    bn0Var.d0();
                } catch (java.lang.Throwable th2) {
                    a.b20.I(th2);
                }
                v60Var.a();
                return;
            case 7:
                android.view.View view2 = (android.view.View) this.d;
                a.cn1 cn1Var = (a.cn1) this.e;
                a.eu euVar = (a.eu) this.f;
                java.util.WeakHashMap weakHashMap = a.fu.f160a;
                a.wv.w(view2, "$view");
                a.wv.w(cn1Var, "$this_handleTooltipTouchEvent");
                java.util.WeakHashMap weakHashMap2 = a.fu.f160a;
                if (weakHashMap2.containsKey(view2)) {
                    java.util.WeakHashMap weakHashMap3 = a.fu.c;
                    if (weakHashMap3.get(view2) == null) {
                        weakHashMap3.put(view2, "longpress");
                        android.view.ViewParent parent = view2.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        a.y31 y31Var2 = (a.y31) weakHashMap2.get(view2);
                        if (y31Var2 != null) {
                            float B = a.wv.B(((java.lang.Number) y31Var2.c).floatValue(), 0.0f, view2.getWidth());
                            cn1Var.setTooltipPosition(java.lang.Float.valueOf(B));
                            a.fu.c(cn1Var, (java.lang.Float) y31Var2.d);
                            if (euVar != null) {
                                euVar.d(cn1Var, java.lang.Float.valueOf(B));
                            }
                        }
                        view2.performHapticFeedback(0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                com.omarea.vtools.activities.ActivityActionPage activityActionPage = (com.omarea.vtools.activities.ActivityActionPage) this.d;
                com.omarea.krscript.model.PageMenuOption pageMenuOption = (com.omarea.krscript.model.PageMenuOption) this.e;
                java.lang.String str4 = (java.lang.String) this.f;
                a.wv.w(activityActionPage, "this$0");
                a.wv.w(pageMenuOption, "$menuOption");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("state", pageMenuOption.getKey());
                hashMap.put("menu_id", pageMenuOption.getKey());
                hashMap.put("file", str4);
                hashMap.put("folder", str4);
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityActionPage.o;
                activityActionPage.q(pageMenuOption, hashMap);
                return;
            case 9:
                android.widget.ListView listView = (android.widget.ListView) this.d;
                com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2 = (com.omarea.vtools.activities.ActivityAppConfig2) this.e;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppConfig2.s;
                a.wv.w(listView, "$lv");
                a.wv.w(activityAppConfig2, "this$0");
                a.wv.s(arrayList2);
                java.lang.String string = activityAppConfig2.s().getString("*", a.b11.l);
                a.wv.s(string);
                listView.setAdapter((android.widget.ListAdapter) new a.zj(activityAppConfig2, arrayList2, string));
                a.b81 b81Var = activityAppConfig2.i;
                if (b81Var != null) {
                    b81Var.a();
                    return;
                } else {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
            case 10:
                java.lang.StringBuilder sb = (java.lang.StringBuilder) this.d;
                com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve = (com.omarea.vtools.activities.ActivityAppRetrieve) this.e;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityAppRetrieve.k;
                a.wv.w(sb, "$cmds");
                a.wv.w(activityAppRetrieve, "this$0");
                a.wv.w(arrayList3, "$items");
                java.lang.String sb2 = sb.toString();
                a.wv.v(sb2, "cmds.toString()");
                a.q10 q10Var = a.q10.f457a;
                a.q10.l(sb2);
                try {
                    i = (int) ((android.os.UserManager) activityAppRetrieve.getSystemService("user")).getSerialNumberForUser(android.os.Process.myUserHandle());
                } catch (java.lang.Exception unused2) {
                    i = 0;
                }
                java.util.Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    java.lang.String str5 = "pm install-existing --user " + i + " " + ((com.omarea.model.AppInfo) it3.next()).getPackageName();
                    android.util.Log.d("Scene", str5);
                    a.wv.w(str5, "shell");
                    a.q10 q10Var2 = a.q10.f457a;
                    a.q10.l(str5);
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                android.content.pm.PackageManager packageManager = activityAppRetrieve.getPackageManager();
                for (android.content.pm.PackageInfo packageInfo : packageManager.getInstalledPackages(8192)) {
                    try {
                        try {
                            packageManager.getApplicationInfo(packageInfo.packageName, 0);
                        } catch (java.lang.Exception unused3) {
                            arrayList4.add(packageManager.getApplicationInfo(packageInfo.packageName, 8192));
                        }
                    } catch (java.lang.Exception unused4) {
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    android.content.pm.ApplicationInfo applicationInfo = (android.content.pm.ApplicationInfo) it4.next();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (java.lang.Object obj7 : arrayList3) {
                        if (a.wv.e(((com.omarea.model.AppInfo) obj7).getPackageName(), applicationInfo.packageName)) {
                            arrayList6.add(obj7);
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        a.wv.v(applicationInfo, "app");
                        arrayList5.add(activityAppRetrieve.p(applicationInfo));
                    }
                }
                activityAppRetrieve.i.post(new a.u1(activityAppRetrieve, arrayList5, arrayList4, arrayList3, 3));
                return;
            case 11:
                com.omarea.common.ui.OverScrollListView overScrollListView = (com.omarea.common.ui.OverScrollListView) this.d;
                com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig = (com.omarea.vtools.activities.ActivityAppXposedConfig) this.e;
                java.util.ArrayList arrayList7 = (java.util.ArrayList) this.f;
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityAppXposedConfig.o;
                a.wv.w(overScrollListView, "$lv");
                a.wv.w(activityAppXposedConfig, "this$0");
                a.wv.s(arrayList7);
                overScrollListView.setAdapter((android.widget.ListAdapter) new a.ou1(activityAppXposedConfig, arrayList7));
                a.b81 b81Var2 = activityAppXposedConfig.g;
                if (b81Var2 != null) {
                    b81Var2.a();
                    return;
                } else {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
            case 12:
                android.widget.EditText editText = (android.widget.EditText) this.d;
                com.omarea.vtools.activities.ActivityAppXposedDetails activityAppXposedDetails = (com.omarea.vtools.activities.ActivityAppXposedDetails) this.e;
                a.ma1 ma1Var = (a.ma1) this.f;
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                a.wv.w(ma1Var, "$dialog");
                java.lang.String obj8 = editText.getText().toString();
                if (obj8.length() == 0) {
                    activityAppXposedDetails.q().b = 0;
                    return;
                }
                try {
                    int parseInt = java.lang.Integer.parseInt(obj8);
                    if (parseInt < 96 && parseInt != 0) {
                        android.widget.Toast.makeText(activityAppXposedDetails.getApplicationContext(), activityAppXposedDetails.getString(2131953740), 0).show();
                        return;
                    }
                    activityAppXposedDetails.q().b = parseInt;
                    if (parseInt == 0) {
                        activityAppXposedDetails.o().setText(activityAppXposedDetails.getString(2131951791));
                    } else {
                        activityAppXposedDetails.o().setText(java.lang.String.valueOf(parseInt));
                    }
                    a.v60 v60Var2 = (a.v60) ma1Var.c;
                    if (v60Var2 != null) {
                        v60Var2.a();
                        return;
                    }
                    return;
                } catch (java.lang.Exception unused5) {
                    return;
                }
            case 13:
                final a.la1 la1Var = (a.la1) this.d;
                final com.omarea.vtools.activities.ActivityApplications activityApplications = (com.omarea.vtools.activities.ActivityApplications) this.e;
                final a.ma1 ma1Var2 = (a.ma1) this.f;
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityApplications.n;
                a.wv.w(la1Var, "$lastInput");
                a.wv.w(activityApplications, "this$0");
                a.wv.w(ma1Var2, "$appState");
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                la1Var.c = currentTimeMillis;
                a.cp cpVar2 = com.omarea.Scene.c;
                com.omarea.Scene.d.postDelayed(new a.z4(), 500L);
                return;
            case 14:
                a.wv.M0(a.wv.b(a.z80.b), null, new a.f5((com.omarea.vtools.activities.ActivityApplications) this.d, (java.util.List) this.e, (a.w60) this.f, null), 3);
                return;
            case 15:
                com.omarea.vtools.activities.ActivityAutoClick activityAutoClick = (com.omarea.vtools.activities.ActivityAutoClick) this.d;
                java.util.List list = (java.util.List) this.e;
                android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.f;
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityAutoClick.m;
                a.wv.w(activityAutoClick, "this$0");
                a.wv.w(list, "$options");
                a.b81 b81Var3 = activityAutoClick.l;
                if (b81Var3 == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                b81Var3.a();
                new a.a40(activityAutoClick.getThemeMode().f442a, new java.util.ArrayList(list), true, new a.p4(list, i2, sharedPreferences)).V(activityAutoClick.getSupportFragmentManager(), "standby_apps");
                return;
            case 16:
                com.omarea.vtools.activities.ActivityCustomCommand activityCustomCommand = (com.omarea.vtools.activities.ActivityCustomCommand) this.d;
                java.lang.String str6 = (java.lang.String) this.e;
                java.lang.String str7 = (java.lang.String) this.f;
                a.gu0[] gu0VarArr9 = com.omarea.vtools.activities.ActivityCustomCommand.h;
                a.wv.w(activityCustomCommand, "this$0");
                a.wv.w(str6, "$title");
                a.wv.w(str7, "$script");
                activityCustomCommand.o(str6, str7, true);
                return;
            case 17:
                android.widget.TextView textView2 = (android.widget.TextView) this.d;
                java.lang.CharSequence charSequence = (java.lang.CharSequence) this.e;
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) this.f;
                a.gu0[] gu0VarArr10 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(textView2, "$this_run");
                a.wv.w(charSequence, "$text");
                a.wv.w(activityFpsSession, "this$0");
                java.lang.CharSequence text = textView2.getText();
                if (text != null && text.length() != 0) {
                    textView2.append("\n");
                }
                textView2.append(charSequence);
                ((com.omarea.ui.BlurView) activityFpsSession.i.a(com.omarea.vtools.activities.ActivityFpsSession.I0[6])).setVisibility(0);
                return;
            case 18:
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession2 = (com.omarea.vtools.activities.ActivityFpsSession) this.d;
                com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) this.e;
                java.lang.String str8 = (java.lang.String) this.f;
                a.gu0[] gu0VarArr11 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession2, "this$0");
                a.wv.w(fpsWatchSession, "$item");
                a.wv.w(str8, "$fileName");
                activityFpsSession2.q(new a.oj0(activityFpsSession2, fpsWatchSession, str8, 2));
                return;
            case 19:
                com.omarea.vtools.activities.ActivityImg activityImg = (com.omarea.vtools.activities.ActivityImg) this.d;
                java.lang.String str9 = (java.lang.String) this.e;
                a.ng1 ng1Var = (a.ng1) this.f;
                a.gu0[] gu0VarArr12 = com.omarea.vtools.activities.ActivityImg.l;
                a.wv.w(activityImg, "this$0");
                a.wv.w(str9, "$path");
                a.wv.w(ng1Var, "$target");
                a.b81 b81Var4 = new a.b81(activityImg, null);
                b81Var4.b("Flashing, Please wait……");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.cb(activityImg, str9, ng1Var, b81Var4, null), 3);
                return;
            case 20:
                a.v30 v30Var = (a.v30) this.d;
                android.graphics.Point point = (android.graphics.Point) this.e;
                android.util.DisplayMetrics displayMetrics = (android.util.DisplayMetrics) this.f;
                a.wv.w(v30Var, "this$0");
                a.wv.w(point, "$point");
                a.wv.w(displayMetrics, "$dm");
                v30Var.a(point, displayMetrics, true);
                return;
            case 21:
                android.widget.EditText editText2 = (android.widget.EditText) this.d;
                a.i50 i50Var = (a.i50) this.e;
                a.ma1 ma1Var3 = (a.ma1) this.f;
                a.wv.w(i50Var, "this$0");
                a.wv.w(ma1Var3, "$d");
                android.text.Editable text2 = editText2.getText();
                if (text2 == null || (obj2 = text2.toString()) == null || (str = a.yi1.F2(obj2).toString()) == null) {
                    str = "";
                }
                java.lang.String str10 = str;
                i50Var.e(true);
                if (!a.yi1.B2(str10, "SK") && !a.yi1.B2(str10, "PK")) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("20[0-9]{26}");
                    a.wv.v(compile, "compile(pattern)");
                    if (!compile.matcher(str10).matches()) {
                        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("10[0-9]{30}");
                        a.wv.v(compile2, "compile(pattern)");
                        if (!compile2.matcher(str10).matches()) {
                            java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("[0-9A-Z]{17}");
                            a.wv.v(compile3, "compile(pattern)");
                            if (!compile3.matcher(str10).matches()) {
                                java.util.regex.Pattern compile4 = java.util.regex.Pattern.compile("H[0-9]{10}[A-Z0-9]{5}");
                                a.wv.v(compile4, "compile(pattern)");
                                boolean matches = compile4.matcher(str10).matches();
                                android.app.Activity activity = i50Var.f225a;
                                if (matches) {
                                    editText2.setText((java.lang.CharSequence) null);
                                    i50Var.e(false);
                                    int i5 = a.x60.f681a;
                                    a.fs1.F(activity, "请使用卡密激活", "应从购卡平台的结果页(或订单查询页)获取卡密，通过卡密完成兑换", new a.b50(i50Var, i3));
                                    return;
                                }
                                java.util.regex.Pattern compile5 = java.util.regex.Pattern.compile("HS[0-9A-Z]{8}");
                                a.wv.v(compile5, "compile(pattern)");
                                if (compile5.matcher(str10).matches()) {
                                    editText2.setText((java.lang.CharSequence) null);
                                    i50Var.e(false);
                                    int i6 = a.x60.f681a;
                                    a.fs1.F(activity, "请使用卡密激活", "应从购卡平台的结果页(或订单查询页)获取卡密，通过卡密完成兑换。但你输入的是卡号而不是卡密，请输入卡密。", new a.b50(i50Var, i2));
                                    return;
                                }
                                if (a.yi1.B2(str10, "4") && str10.length() == 23) {
                                    editText2.setText((java.lang.CharSequence) null);
                                    i50Var.e(false);
                                    a.cp cpVar3 = com.omarea.Scene.c;
                                    a.fs1.X("请输入订单号，而不是商家单号！", 0);
                                    return;
                                }
                                a.cp cpVar4 = com.omarea.Scene.c;
                                a.fs1.O("order_id", str10);
                                java.lang.Object obj9 = ma1Var3.c;
                                a.wv.s(obj9);
                                a.wv.M0(a.wv.b(a.z80.b), null, new a.d50(i50Var, str10, false, (a.v60) obj9, null), 3);
                                return;
                            }
                        }
                    }
                }
                a.cp cpVar5 = com.omarea.Scene.c;
                a.fs1.O("order_id", str10);
                java.lang.Object obj10 = ma1Var3.c;
                a.wv.s(obj10);
                a.wv.M0(a.wv.b(a.z80.b), null, new a.d50(i50Var, str10, false, (a.v60) obj10, null), 3);
                return;
            case 22:
                a.i50 i50Var2 = (a.i50) this.d;
                a.v60 v60Var3 = (a.v60) this.e;
                java.lang.String str11 = (java.lang.String) this.f;
                a.wv.w(i50Var2, "this$0");
                a.wv.w(v60Var3, "$dialog");
                a.wv.w(str11, "$eCode");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.d50(i50Var2, str11, true, v60Var3, null), 3);
                return;
            case 23:
                a.i50 i50Var3 = (a.i50) this.d;
                java.lang.String str12 = (java.lang.String) this.e;
                com.omarea.model.ActivationCodeResponse activationCodeResponse = (com.omarea.model.ActivationCodeResponse) this.f;
                a.c50 c50Var = i50Var3.b;
                java.lang.String type = activationCodeResponse.getType();
                a.w1 w1Var = (a.w1) c50Var;
                int i7 = w1Var.c;
                java.lang.Object obj11 = w1Var.d;
                switch (i7) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        a.wv.w(str12, "code");
                        a.wv.w(type, "type");
                        a.u20 u20Var = a.z80.f728a;
                        a.wv.M0(a.wv.b(a.by0.f57a), null, new a.nf((com.omarea.vtools.activities.ActivityStartSplash) obj11, null), 3);
                        return;
                    default:
                        a.wv.w(str12, "code");
                        a.wv.w(type, "type");
                        a.jo0 jo0Var = (a.jo0) obj11;
                        jo0Var.u0.p();
                        com.omarea.model.ActivatedStateModel activatedStateModel = jo0Var.t0;
                        if (activatedStateModel != null && activatedStateModel.getActivated()) {
                            jo0Var.Z();
                            return;
                        }
                        a.cp cpVar6 = com.omarea.Scene.c;
                        java.lang.String m = jo0Var.m(2131953663);
                        a.wv.v(m, "getString(R.string.user_activation_complete)");
                        a.fs1.X(m, 0);
                        a.kk0 d = jo0Var.d();
                        if (d != null) {
                            d.finish();
                            return;
                        }
                        return;
                }
            case 24:
                a.v60 v60Var4 = (a.v60) this.d;
                a.f60 f60Var = (a.f60) this.e;
                a.mc1 mc1Var2 = (a.mc1) this.f;
                a.wv.w(v60Var4, "$dialog");
                a.wv.w(f60Var, "this$0");
                a.wv.w(mc1Var2, "$file");
                v60Var4.a();
                int i8 = a.x60.f681a;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.a60(mc1Var2, f60Var, a.fs1.J(f60Var.f145a, null), null), 3);
                return;
            case 25:
                android.widget.TextView textView3 = (android.widget.TextView) this.d;
                android.widget.TextView textView4 = (android.widget.TextView) this.e;
                a.ej1 ej1Var = (a.ej1) this.f;
                a.wv.w(ej1Var, "this$0");
                java.lang.CharSequence text3 = textView3.getText();
                java.lang.String obj12 = (text3 == null || (obj4 = text3.toString()) == null) ? null : a.yi1.F2(obj4).toString();
                java.lang.CharSequence text4 = textView4.getText();
                java.lang.String obj13 = (text4 == null || (obj3 = text4.toString()) == null) ? null : a.yi1.F2(obj3).toString();
                if (obj12 != null && obj12.length() != 0 && obj13 != null && obj13.length() != 0) {
                    a.b81.c((a.b81) ej1Var.c);
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.s70(ej1Var, obj12, obj13, null), 3);
                    return;
                } else {
                    a.cp cpVar7 = com.omarea.Scene.c;
                    java.lang.String string2 = ((android.content.Context) ej1Var.d).getString(2131953697);
                    a.wv.v(string2, "context.getString(R.string.user_please_uid)");
                    a.fs1.X(string2, 0);
                    return;
                }
            case 26:
                android.widget.TextView textView5 = (android.widget.TextView) this.d;
                android.widget.TextView textView6 = (android.widget.TextView) this.e;
                a.nk nkVar = (a.nk) this.f;
                a.wv.w(nkVar, "this$0");
                java.lang.CharSequence text5 = textView5.getText();
                java.lang.String obj14 = (text5 == null || (obj6 = text5.toString()) == null) ? null : a.yi1.F2(obj6).toString();
                java.lang.CharSequence text6 = textView6.getText();
                java.lang.String obj15 = (text6 == null || (obj5 = text6.toString()) == null) ? null : a.yi1.F2(obj5).toString();
                if (obj14 == null || obj14.length() == 0 || obj15 == null || obj15.length() == 0) {
                    a.cp cpVar8 = com.omarea.Scene.c;
                    java.lang.String string3 = ((android.content.Context) nkVar.d).getString(2131953697);
                    a.wv.v(string3, "context.getString(R.string.user_please_uid)");
                    a.fs1.X(string3, 0);
                    return;
                }
                ((a.y70) nkVar.e).a(obj15);
                a.v60 v60Var5 = (a.v60) nkVar.f;
                if (v60Var5 != null) {
                    v60Var5.a();
                }
                nkVar.f = null;
                return;
            case 27:
                a.vk0 vk0Var = (a.vk0) this.d;
                java.util.List list2 = (java.util.List) this.e;
                android.widget.ListView listView2 = (android.widget.ListView) this.f;
                a.fa0 fa0Var = a.vk0.g0;
                a.wv.w(vk0Var, "this$0");
                a.wv.w(listView2, "$lv");
                try {
                    android.content.Context L2 = vk0Var.L();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(list2);
                    java.lang.String str13 = vk0Var.f0;
                    a.q10 q10Var3 = a.q10.f457a;
                    a.nh nhVar = new a.nh(L2, arrayList8, str13, a.wv.e(a.q10.t(), "basic"));
                    java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(nhVar);
                    listView2.setAdapter((android.widget.ListAdapter) nhVar);
                    listView2.setOnItemClickListener(new a.qk0(vk0Var, i3, weakReference));
                    a.uk0 uk0Var = a.uk0.e;
                    a.c5 c5Var = new a.c5(vk0Var, i2, weakReference);
                    ha1 obj16 = new ha1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    ha1 obj17 = new ha1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    ha1 obj18 = new ha1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    obj18.c = (-1) != 0;
                    listView2.setOnTouchListener(new a.yw0(uk0Var, listView2, 0, (ha1) (obj16), (ha1) (obj17), (ka1) obj18, c5Var));
                    vk0Var.V().setChecked(false);
                    vk0Var.U().setVisibility(8);
                    return;
                } catch (java.lang.Exception unused6) {
                    return;
                }
        }
    }
}
