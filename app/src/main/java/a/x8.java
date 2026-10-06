package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class x8 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;

    public /* synthetic */ x8(a.v60 v60Var, com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, com.omarea.model.FpsWatchSession fpsWatchSession, a.lc1 lc1Var, a.ab1 ab1Var) {
        this.c = 1;
        this.d = v60Var;
        this.e = activityFpsSession;
        this.g = fpsWatchSession;
        this.h = lc1Var;
        this.f = ab1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.Long l;
        android.net.NetworkCapabilities networkCapabilities;
        int i = 3;
        int i2 = 1;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.widget.EditText editText = (android.widget.EditText) this.g;
                a.ab1 ab1Var = (a.ab1) this.f;
                a.v60 v60Var = (a.v60) this.d;
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) this.e;
                java.lang.String str2 = (java.lang.String) this.h;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(ab1Var, "$reg");
                a.wv.w(v60Var, "$dialog");
                a.wv.w(activityFpsSession, "this$0");
                android.text.Editable text = editText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                a.jy0 a2 = ab1Var.a(0, str);
                java.lang.String a3 = a2 != null ? a2.a() : null;
                if (a3 != null) {
                    a.wv.M0(a.wv.b(a.z80.b), null, new a.l9(str2, a3, activityFpsSession, null), 3);
                    v60Var.a();
                    return;
                } else {
                    a.cp cpVar = com.omarea.Scene.c;
                    java.lang.String string = activityFpsSession.getString(2131952313);
                    a.wv.v(string, "getString(R.string.fps_pk_invalid_uri)");
                    a.fs1.X(string, 0);
                    return;
                }
            case 1:
                a.v60 v60Var2 = (a.v60) this.d;
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession2 = (com.omarea.vtools.activities.ActivityFpsSession) this.e;
                com.omarea.model.FpsWatchSession fpsWatchSession = (com.omarea.model.FpsWatchSession) this.g;
                a.bp0 bp0Var = (a.bp0) this.h;
                a.ab1 ab1Var2 = (a.ab1) this.f;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(v60Var2, "$dialog");
                a.wv.w(activityFpsSession2, "this$0");
                a.wv.w(fpsWatchSession, "$item");
                a.wv.w(bp0Var, "$toPK");
                a.wv.w(ab1Var2, "$reg");
                v60Var2.a();
                a.hc1 hc1Var = new a.hc1(activityFpsSession2, bp0Var, ab1Var2, i);
                java.lang.String str3 = fpsWatchSession.packageName;
                a.wv.v(str3, "item.packageName");
                java.lang.Long l2 = fpsWatchSession.sessionId;
                a.wv.v(l2, "item.sessionId");
                long longValue = l2.longValue();
                android.view.View inflate = android.view.LayoutInflater.from(activityFpsSession2).inflate(2131558527, (android.view.ViewGroup) null);
                java.util.ArrayList J = new a.r51(activityFpsSession2).J();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = J.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    com.omarea.model.FpsWatchSession fpsWatchSession2 = (com.omarea.model.FpsWatchSession) next;
                    if (a.wv.e(fpsWatchSession2.packageName, str3) && ((l = fpsWatchSession2.sessionId) == null || l.longValue() != longValue)) {
                        arrayList.add(next);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
                a.mo moVar = new a.mo(activityFpsSession2, a.la0.c, 6, a.la0.c);
                a.rx0 rx0Var = new a.rx0(activityFpsSession2, false, 6);
                java.lang.Object obj = a.zx.f748a;
                android.graphics.drawable.Drawable b = a.xx.b(activityFpsSession2, 2131231235);
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(1);
                int i3 = a.x60.f681a;
                a.wv.v(inflate, "view");
                a.wv.M0(a.wv.b(a.z80.b), null, new a.i60(arrayList2, moVar, rx0Var, b, inflate, linearLayoutManager, a.fs1.m(activityFpsSession2, inflate, true), hc1Var, null), 3);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) this.g;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) this.f;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView3 = (com.omarea.ui.SwitchOptionItemView) this.e;
                com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions = (com.omarea.vtools.activities.ActivityFpsSessions) this.h;
                a.v60 v60Var3 = (a.v60) this.d;
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityFpsSessions.t;
                a.wv.w(activityFpsSessions, "this$0");
                a.wv.w(v60Var3, "$dialog");
                boolean z = switchOptionItemView.i;
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.D().edit().putBoolean("auto_upload", z).apply();
                a.fs1.D().edit().putBoolean("sync_delete_cloud", switchOptionItemView2.i).apply();
                if (switchOptionItemView3.i) {
                    java.lang.Object systemService = activityFpsSessions.getSystemService("connectivity");
                    a.wv.t(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
                    android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) {
                        int i4 = a.x60.f681a;
                        java.lang.String string2 = activityFpsSessions.getString(2131952330);
                        a.wv.v(string2, "getString(R.string.fps_upload_5g)");
                        java.lang.String string3 = activityFpsSessions.getString(2131952331);
                        a.wv.v(string3, "getString(R.string.fps_upload_5g_desc)");
                        a.fs1.i(activityFpsSessions, string2, string3, new a.u9(activityFpsSessions, i2), null);
                    } else {
                        activityFpsSessions.q = a.wv.M0(a.wv.b(a.z80.b), null, new a.ca(activityFpsSessions, null), 3);
                    }
                } else {
                    a.qi1 qi1Var = activityFpsSessions.q;
                    if (qi1Var != null) {
                        a.wv.p(qi1Var);
                    }
                    activityFpsSessions.q = null;
                }
                v60Var3.a();
                return;
            case 3:
                a.v60 v60Var4 = (a.v60) this.d;
                android.widget.SeekBar seekBar = (android.widget.SeekBar) this.g;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView4 = (com.omarea.ui.SwitchOptionItemView) this.f;
                android.widget.TextView textView = (android.widget.TextView) this.e;
                com.omarea.vtools.activities.ActivitySwap activitySwap = (com.omarea.vtools.activities.ActivitySwap) this.h;
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(v60Var4, "$dialog");
                a.wv.w(activitySwap, "this$0");
                v60Var4.a();
                int progress = seekBar.getProgress() * 128;
                boolean z2 = switchOptionItemView4.i;
                java.lang.CharSequence text2 = textView.getText();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.Object) text2);
                java.lang.String sb2 = sb.toString();
                a.b81 b81Var = activitySwap.M;
                if (b81Var == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                java.lang.String string4 = activitySwap.getString(2131953753);
                a.wv.v(string4, "getString(R.string.zram_resizing)");
                b81Var.b(string4);
                android.content.SharedPreferences sharedPreferences = activitySwap.N;
                if (sharedPreferences == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                sharedPreferences.edit().putInt("zram_size", progress).putBoolean("zram", z2).putString("comp_algorithm", sb2).apply();
                new java.lang.Thread(new java.lang.Thread(new a.m30(activitySwap, sb2, progress, i))).start();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.v60 v60Var5 = (a.v60) this.d;
                android.widget.SeekBar seekBar2 = (android.widget.SeekBar) this.g;
                android.widget.SeekBar seekBar3 = (android.widget.SeekBar) this.f;
                android.widget.SeekBar seekBar4 = (android.widget.SeekBar) this.e;
                com.omarea.vtools.activities.ActivitySwap activitySwap2 = (com.omarea.vtools.activities.ActivitySwap) this.h;
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(v60Var5, "$dialog");
                a.wv.w(activitySwap2, "this$0");
                v60Var5.a();
                int progress2 = seekBar2.getProgress();
                int progress3 = seekBar3.getProgress();
                int progress4 = seekBar4.getProgress();
                android.content.SharedPreferences sharedPreferences2 = activitySwap2.N;
                if (sharedPreferences2 == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                android.content.SharedPreferences.Editor putInt = sharedPreferences2.edit().putInt("swappiness", progress2).putInt("extra_free_kbytes", progress3);
                a.nu0 nu0Var = a.nu0.f395a;
                a.nu0.l("/proc/sys/vm/swappiness", java.lang.String.valueOf(progress2));
                a.nu0.l("/proc/sys/vm/extra_free_kbytes", java.lang.String.valueOf(progress3));
                if (seekBar4.isEnabled()) {
                    a.nu0.l("/proc/sys/vm/watermark_scale_factor", java.lang.String.valueOf(progress4));
                    putInt.putInt("watermark_scale", progress4);
                }
                putInt.apply();
                a.cp cpVar3 = com.omarea.Scene.c;
                a.fs1.L(new a.zf(activitySwap2, i2));
                return;
            case 5:
                a.v60 v60Var6 = (a.v60) this.d;
                a.v30 v30Var = (a.v30) this.g;
                android.view.Display display = (android.view.Display) this.f;
                android.graphics.Point point = (android.graphics.Point) this.e;
                android.util.DisplayMetrics displayMetrics = (android.util.DisplayMetrics) this.h;
                a.wv.w(v60Var6, "$dialogInstance");
                a.wv.w(v30Var, "this$0");
                a.wv.w(display, "$display");
                a.wv.w(point, "$point");
                a.wv.w(displayMetrics, "$dm");
                if (v60Var6.f625a.isShowing()) {
                    try {
                        v60Var6.a();
                    } catch (java.lang.Exception unused) {
                    }
                }
                a.q10.k(2000L, "wm size reset\nwm density reset\nwm overscan reset\n");
                display.getRealSize(point);
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new a.ua0(v30Var, point, displayMetrics, 20), 1000L);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.v60 v60Var7 = (a.v60) this.d;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView5 = (com.omarea.ui.SwitchOptionItemView) this.g;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView6 = (com.omarea.ui.SwitchOptionItemView) this.f;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView7 = (com.omarea.ui.SwitchOptionItemView) this.e;
                a.k40 k40Var = (a.k40) this.h;
                a.wv.w(v60Var7, "$dialog");
                a.wv.w(k40Var, "this$0");
                v60Var7.a();
                boolean z3 = switchOptionItemView5.i;
                boolean z4 = switchOptionItemView6.i;
                boolean z5 = switchOptionItemView7.i;
                r3 = android.os.Build.VERSION.SDK_INT >= 28 ? 1 : 0;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                a.q10 q10Var = a.q10.f457a;
                boolean e = a.wv.e(a.q10.t(), "adb");
                java.util.Iterator it2 = k40Var.b.iterator();
                while (it2.hasNext()) {
                    com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it2.next();
                    java.lang.String packageName = appInfo.getPackageName();
                    if (z3) {
                        if (!appInfo.suspended.booleanValue()) {
                            sb3.append("echo '[suspend " + appInfo.getAppName() + "]'\n");
                            sb3.append("pm suspend " + packageName + "\n");
                        }
                    } else if (r3 != 0) {
                        java.lang.Boolean bool = appInfo.suspended;
                        a.wv.v(bool, "item.suspended");
                        if (bool.booleanValue()) {
                            sb3.append("echo '[unsuspend " + appInfo.getAppName() + "]'\n");
                            sb3.append("am kill " + packageName + " 2>/dev/null\n");
                            sb3.append("pm unsuspend " + packageName + "\n");
                            sb3.append("su 1000 -c 'pm unsuspend " + packageName + "' 2>/dev/null\n");
                        }
                    }
                    if (z4) {
                        java.lang.Boolean bool2 = appInfo.enabled;
                        a.wv.v(bool2, "item.enabled");
                        if (bool2.booleanValue()) {
                            a.ai1.u("echo '[disable ", appInfo.getAppName(), "]'\n", sb3);
                            if (e) {
                                a.ai1.u("pm disable-user ", packageName, "\n", sb3);
                            } else {
                                a.ai1.u("pm disable ", packageName, "\n", sb3);
                            }
                        }
                    } else if (!appInfo.enabled.booleanValue()) {
                        sb3.append("echo '[enable " + appInfo.getAppName() + "]'\n");
                        sb3.append("pm enable " + packageName + "\n");
                    }
                    if (z5) {
                        sb3.append("echo '[hide " + appInfo.getAppName() + "]'\n");
                        sb3.append("pm hide " + packageName + "\n");
                    }
                }
                sb3.append("echo '[operation completed]'\n");
                k40Var.k(sb3);
                return;
            case 7:
                a.ha1 ha1Var = (a.ha1) this.g;
                android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) this.f;
                a.nk nkVar = (a.nk) this.d;
                a.ka1 ka1Var = (a.ka1) this.e;
                a.ma1 ma1Var = (a.ma1) this.h;
                a.wv.w(ha1Var, "$double");
                a.wv.w(nkVar, "this$0");
                a.wv.w(ka1Var, "$unit");
                a.wv.w(ma1Var, "$alertDialog");
                ha1Var.c = compoundButton.isChecked();
                ((android.content.SharedPreferences) nkVar.e).edit().putInt((java.lang.String) a.la0.c.a(), ka1Var.c).putBoolean((java.lang.String) a.la0.e.a(), ha1Var.c).putBoolean((java.lang.String) a.la0.d.a(), true).apply();
                a.v60 v60Var8 = (a.v60) ma1Var.c;
                if (v60Var8 != null) {
                    v60Var8.a();
                    return;
                }
                return;
            default:
                android.widget.ListView listView = (android.widget.ListView) this.g;
                android.widget.TextView textView2 = (android.widget.TextView) this.f;
                android.widget.ImageView imageView = (android.widget.ImageView) this.d;
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.e;
                a.ph0 ph0Var = (a.ph0) this.h;
                a.fa0 fa0Var = a.ph0.i;
                a.wv.w(listView, "$process_list");
                a.wv.w(textView2, "$btnProcessFilter");
                a.wv.w(imageView, "$btnClose");
                a.wv.w(imageView2, "$btnMinimize");
                a.wv.w(ph0Var, "this$0");
                if (listView.getVisibility() != 0) {
                    listView.setVisibility(0);
                    textView2.setVisibility(0);
                    imageView.setVisibility(0);
                    android.content.Context context = ph0Var.f435a;
                    java.lang.Object obj2 = a.zx.f748a;
                    imageView2.setImageDrawable(a.xx.b(context, 2131230921));
                    ph0Var.c();
                    return;
                }
                listView.setVisibility(8);
                textView2.setVisibility(8);
                imageView.setVisibility(8);
                android.content.Context context2 = ph0Var.f435a;
                java.lang.Object obj3 = a.zx.f748a;
                imageView2.setImageDrawable(a.xx.b(context2, 2131230920));
                java.util.Timer timer = a.ph0.n;
                if (timer != null) {
                    timer.cancel();
                    a.ph0.n = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ x8(a.v60 v60Var, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.c = i;
        this.d = v60Var;
        this.g = obj;
        this.f = obj2;
        this.e = obj3;
        this.h = obj4;
    }

    public /* synthetic */ x8(com.omarea.ui.SwitchOptionItemView switchOptionItemView, com.omarea.ui.SwitchOptionItemView switchOptionItemView2, com.omarea.ui.SwitchOptionItemView switchOptionItemView3, com.omarea.vtools.activities.ActivityFpsSessions activityFpsSessions, a.v60 v60Var) {
        this.c = 2;
        this.g = switchOptionItemView;
        this.f = switchOptionItemView2;
        this.e = switchOptionItemView3;
        this.h = activityFpsSessions;
        this.d = v60Var;
    }

    public /* synthetic */ x8(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i) {
        this.c = i;
        this.g = obj;
        this.f = obj2;
        this.d = obj3;
        this.e = obj4;
        this.h = obj5;
    }
}
