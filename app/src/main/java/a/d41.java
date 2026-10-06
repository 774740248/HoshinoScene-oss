package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class d41 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ d41(android.view.View view, a.v60 v60Var, com.omarea.model.ProcessInfo processInfo, com.omarea.vtools.activities.ActivityProcess activityProcess) {
        this.c = 4;
        this.d = processInfo;
        this.g = view;
        this.e = activityProcess;
        this.f = v60Var;
    }

    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, a.a5] */
    /* JADX WARN: Type inference failed for: r4v19, types: [a.ng1, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i;
        java.lang.String string;
        int i2 = this.c;
        java.lang.Object obj = this.g;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.e;
        java.lang.Object obj4 = this.d;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                final a.c41 c41Var = (a.c41) obj4;
                final android.widget.EditText editText = (android.widget.EditText) obj3;
                final android.widget.ImageView imageView = (android.widget.ImageView) obj2;
                final android.view.View view2 = (android.view.View) obj;
                a.wv.w(c41Var, "this$0");
                a.wv.v(editText, "textView");
                a.wv.v(imageView, "invalidView");
                a.wv.v(view2, "preview");
                android.view.View inflate = android.view.LayoutInflater.from(c41Var.c).inflate(2131558586, (android.view.ViewGroup) null);
                java.lang.CharSequence text = editText.getText();
                if (text != null && text.length() > 0) {
                    try {
                        i = android.graphics.Color.parseColor(text.toString());
                    } catch (java.lang.Exception unused) {
                    }
                    final android.widget.SeekBar seekBar = (android.widget.SeekBar) inflate.findViewById(2131362236);
                    final android.widget.SeekBar seekBar2 = (android.widget.SeekBar) inflate.findViewById(2131362241);
                    final android.widget.SeekBar seekBar3 = (android.widget.SeekBar) inflate.findViewById(2131362238);
                    final android.widget.SeekBar seekBar4 = (android.widget.SeekBar) inflate.findViewById(2131362237);
                    final android.widget.Button button = (android.widget.Button) inflate.findViewById(2131362239);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362240);
                    seekBar.setProgress(android.graphics.Color.alpha(i));
                    seekBar2.setProgress(android.graphics.Color.red(i));
                    seekBar3.setProgress(android.graphics.Color.green(i));
                    seekBar4.setProgress(android.graphics.Color.blue(i));
                    button.setBackgroundColor(i);
                    textView.setText(a.c41.b(seekBar.getProgress(), seekBar2.getProgress(), seekBar3.getProgress(), seekBar4.getProgress()));
                    a.g41 g41Var = new a.g41(seekBar, seekBar2, seekBar3, seekBar4, button);
                    seekBar.setOnSeekBarChangeListener(g41Var);
                    seekBar2.setOnSeekBarChangeListener(g41Var);
                    seekBar3.setOnSeekBarChangeListener(g41Var);
                    seekBar4.setOnSeekBarChangeListener(g41Var);
                    int i3 = a.x60.f681a;
                    android.app.AlertDialog.Builder negativeButton = new android.app.AlertDialog.Builder(c41Var.c).setTitle(c41Var.c.getString(2131952633)).setView(inflate).setPositiveButton(c41Var.c.getString(2131952077), new a.e41()).setNegativeButton(c41Var.c.getString(2131952076), new a.f41(0));
                    a.wv.v(negativeButton, "Builder(context)\n       ….btn_cancel)) { _, _ -> }");
                    android.app.AlertDialog create = negativeButton.create();
                    a.fs1.b(create);
                    a.wv.v(create, "dialog");
                    new a.v60(create);
                    return;
                }
                i = -16777216;
                final android.widget.SeekBar seekBar5 = (android.widget.SeekBar) inflate.findViewById(2131362236);
                final android.widget.SeekBar seekBar22 = (android.widget.SeekBar) inflate.findViewById(2131362241);
                final android.widget.SeekBar seekBar32 = (android.widget.SeekBar) inflate.findViewById(2131362238);
                final android.widget.SeekBar seekBar42 = (android.widget.SeekBar) inflate.findViewById(2131362237);
                final android.widget.Button button2 = (android.widget.Button) inflate.findViewById(2131362239);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(2131362240);
                seekBar5.setProgress(android.graphics.Color.alpha(i));
                seekBar22.setProgress(android.graphics.Color.red(i));
                seekBar32.setProgress(android.graphics.Color.green(i));
                seekBar42.setProgress(android.graphics.Color.blue(i));
                button2.setBackgroundColor(i);
                textView2.setText(a.c41.b(seekBar5.getProgress(), seekBar22.getProgress(), seekBar32.getProgress(), seekBar42.getProgress()));
                a.g41 g41Var2 = new a.g41(seekBar5, seekBar22, seekBar32, seekBar42, button2);
                seekBar5.setOnSeekBarChangeListener(g41Var2);
                seekBar22.setOnSeekBarChangeListener(g41Var2);
                seekBar32.setOnSeekBarChangeListener(g41Var2);
                seekBar42.setOnSeekBarChangeListener(g41Var2);
                int i32 = a.x60.f681a;
                android.app.AlertDialog.Builder negativeButton2 = new android.app.AlertDialog.Builder(c41Var.c).setTitle(c41Var.c.getString(2131952633)).setView(inflate).setPositiveButton(c41Var.c.getString(2131952077), new a.e41()).setNegativeButton(c41Var.c.getString(2131952076), new a.f41(0));
                a.wv.v(negativeButton2, "Builder(context)\n       ….btn_cancel)) { _, _ -> }");
                android.app.AlertDialog create2 = negativeButton2.create();
                a.fs1.b(create2);
                a.wv.v(create2, "dialog");
                new a.v60(create2);
                return;
            case 1:
                a.mm mmVar = (a.mm) obj4;
                android.widget.TextView textView3 = (android.widget.TextView) obj3;
                android.widget.TextView textView4 = (android.widget.TextView) obj2;
                android.widget.TextView textView5 = (android.widget.TextView) obj;
                a.wv.w(mmVar, "this$0");
                a.wv.v(textView3, "textView");
                a.wv.v(textView4, "valueView");
                a.wv.v(textView5, "countView");
                if (((java.util.ArrayList) mmVar.c) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int length = ((java.lang.String[]) mmVar.e).length;
                    for (int i4 = 0; i4 < length; i4++) {
                        ng1 obj5 = new ng1();
                        /* TODO: jadx type unresolved, defaulted to Object */
                        obj5.f381a = ((java.lang.String[]) mmVar.e)[i4];
                        obj5.d = ((boolean[]) mmVar.d)[i4];
                        arrayList.add(obj5);
                    }
                    new a.b70(true, new java.util.ArrayList(arrayList), true, new a.l41(mmVar, textView3, textView4, textView5, 0), 7).V(((a.kk0) mmVar.b).getSupportFragmentManager(), "params-multi-select");
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.ij0 ij0Var = (a.ij0) obj4;
                com.omarea.sysmbol.PerfOptionsRender perfOptionsRender = (com.omarea.sysmbol.PerfOptionsRender) obj3;
                a.yu0 yu0Var = (a.yu0) obj2;
                java.lang.Runnable runnable = (java.lang.Runnable) obj;
                int i5 = com.omarea.sysmbol.PerfOptionsRender.d;
                a.wv.w(ij0Var, "$handler");
                a.wv.w(perfOptionsRender, "this$0");
                a.wv.w(yu0Var, "$allApp$delegate");
                a.wv.w(runnable, "$updateNameList");
                java.util.List list = (java.util.List) ij0Var.getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) ((a.vj1) yu0Var).a()).iterator();
                while (it.hasNext()) {
                    com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it.next();
                    a.tg tgVar = new a.tg();
                    tgVar.setAppName(appInfo.getAppName());
                    tgVar.setPackageName(appInfo.getPackageName());
                    tgVar.setSelected(list.contains(appInfo.getPackageName()));
                    arrayList2.add(tgVar);
                }
                a.a40 a40Var = new a.a40(false, arrayList2, true, new a.p4(ij0Var, 0, runnable));
                android.content.Context context = perfOptionsRender.getContext();
                a.wv.t(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                a40Var.V(((a.ml) context).getSupportFragmentManager(), "perf-apps");
                return;
            case 3:
                a.v60 v60Var = (a.v60) obj4;
                java.lang.String str = (java.lang.String) obj3;
                com.omarea.vtools.activities.ActivityProcess activityProcess = (com.omarea.vtools.activities.ActivityProcess) obj2;
                a.ma1 ma1Var = (a.ma1) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(v60Var, "$dialog");
                a.wv.w(str, "$set");
                a.wv.w(activityProcess, "this$0");
                a.wv.w(ma1Var, "$memcgFile");
                v60Var.a();
                java.lang.String concat = str.concat("/memory.swappiness");
                a.nu0 nu0Var = a.nu0.f395a;
                java.lang.String d = a.nu0.d(concat);
                if (a.wv.e(d, "0")) {
                    a.nu0.l(concat, "100");
                }
                int i6 = a.x60.f681a;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.ge(ma1Var, d, concat, a.fs1.J(activityProcess, activityProcess.getString(2131953262)), null), 3);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.model.ProcessInfo processInfo = (com.omarea.model.ProcessInfo) obj4;
                android.view.View view3 = (android.view.View) obj;
                com.omarea.vtools.activities.ActivityProcess activityProcess2 = (com.omarea.vtools.activities.ActivityProcess) obj3;
                a.v60 v60Var2 = (a.v60) obj2;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityProcess.x;
                a.wv.w(processInfo, "$detail");
                a.wv.w(activityProcess2, "this$0");
                a.wv.w(v60Var2, "$dialog");
                java.lang.String str2 = processInfo.name;
                a.wv.v(str2, "detail.name");
                java.lang.String str3 = (java.lang.String) a.qv.e2(a.yi1.y2(str2, new java.lang.String[]{":"}));
                android.content.Context context2 = view3.getContext();
                a.wv.v(context2, "context");
                com.omarea.model.AppInfo c = new a.po(context2, false).c(str3);
                if (c != null) {
                    new a.p80(activityProcess2, c, (a5) new ng1()).w();
                } else {
                    android.widget.Toast.makeText(view3.getContext(), activityProcess2.getString(2131953258), 0).show();
                }
                v60Var2.a();
                return;
            case 5:
                a.v60 v60Var3 = (a.v60) obj4;
                a.x81 x81Var = (a.x81) obj3;
                a.k40 k40Var = (a.k40) obj2;
                com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) obj;
                a.wv.w(v60Var3, "$dialog");
                a.wv.w(x81Var, "$radios");
                a.wv.w(k40Var, "this$0");
                v60Var3.a();
                int c2 = x81Var.c();
                if (c2 == 0) {
                    k40Var.j("speed", switchOptionItemView.i);
                    return;
                }
                if (c2 == 1) {
                    k40Var.j("everything", switchOptionItemView.i);
                    return;
                }
                if (c2 != 2) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.util.Iterator it2 = k40Var.b.iterator();
                while (it2.hasNext()) {
                    com.omarea.model.AppInfo appInfo2 = (com.omarea.model.AppInfo) it2.next();
                    java.lang.String str4 = appInfo2.getPackageName().toString();
                    sb.append("echo '[compact " + appInfo2.getAppName() + "]'\n");
                    sb.append("pm delete-dexopt " + str4 + "\n\n");
                }
                sb.append("echo '[operation completed]'\n\n");
                k40Var.k(sb);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.ha1 ha1Var = (a.ha1) obj4;
                a.la1 la1Var = (a.la1) obj3;
                android.widget.TextView textView6 = (android.widget.TextView) obj;
                a.wv.w(ha1Var, "$double");
                a.wv.w(la1Var, "$currentNow");
                a.wv.w((a.ka1) obj2, "$unit");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                boolean isChecked = ((android.widget.CompoundButton) view).isChecked();
                ha1Var.c = isChecked;
                long j = (la1Var.c / r5.c) * (isChecked ? 2 : 1);
                textView6.setText((j >= 0 ? "+" : "") + j + "mA");
                return;
            case 7:
                android.view.View view4 = (android.view.View) obj;
                a.mc1 mc1Var = (a.mc1) obj4;
                a.v60 v60Var4 = (a.v60) obj3;
                a.f60 f60Var = (a.f60) obj2;
                a.wv.w(mc1Var, "$file");
                a.wv.w(v60Var4, "$dialog");
                a.wv.w(f60Var, "this$0");
                int i7 = a.x60.f681a;
                android.content.Context context3 = view4.getContext();
                a.wv.v(context3, "view.context");
                java.lang.String string2 = view4.getContext().getString(2131952264);
                a.wv.v(string2, "view.context.getString(R…ing.file_delete_selected)");
                a.fs1.i(context3, string2, mc1Var.c, new a.ua0(v60Var4, f60Var, mc1Var, 24), null);
                return;
            case 8:
                a.qo0 qo0Var = (a.qo0) obj2;
                a.v60 v60Var5 = (a.v60) obj;
                a.wv.w(qo0Var, "$next");
                a.wv.w(v60Var5, "$dialog");
                boolean z = ((com.omarea.ui.SwitchOptionItemView) obj4).i;
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.D().edit().putBoolean("theme_fg_blur", z).apply();
                a.fs1.D().edit().putBoolean("theme_bg_blur", ((com.omarea.ui.SwitchOptionItemView) obj3).i).apply();
                qo0Var.b();
                v60Var5.a();
                return;
            case 9:
                a.pl0 pl0Var = (a.pl0) obj4;
                a.tq0 tq0Var = (a.tq0) obj2;
                java.lang.String str5 = (java.lang.String) obj;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("【OpenGL ES】\n");
                a.pq0 pq0Var = (a.pq0) ((a.ma1) obj3).c;
                if (pq0Var != null) {
                    sb2.append("GPU 供应商：" + pq0Var.b);
                    sb2.append('\n');
                    sb2.append("GPU 渲染器：" + pq0Var.c);
                    sb2.append('\n');
                    sb2.append("OpenGL ES 版本：" + pq0Var.f447a);
                    sb2.append('\n');
                    java.lang.String str6 = pq0Var.d;
                    if (str6 != null && (!a.yi1.o2(str6))) {
                        sb2.append("扩展数量：" + a.yi1.z2(str6, new char[]{' '}).size());
                        sb2.append('\n');
                    }
                } else {
                    sb2.append("OpenGL ES 信息获取中…\n");
                }
                sb2.append('\n');
                if (tq0Var.m) {
                    sb2.append("【Vulkan】\n");
                    sb2.append("GPU 名称：" + tq0Var.f562a);
                    sb2.append('\n');
                    sb2.append("供应商：" + tq0Var.b);
                    sb2.append('\n');
                    sb2.append("设备 ID：" + tq0Var.c);
                    sb2.append('\n');
                    sb2.append("设备类型：" + tq0Var.d);
                    sb2.append('\n');
                    sb2.append("实例 API：" + tq0Var.e);
                    sb2.append('\n');
                    sb2.append("设备 API：" + tq0Var.f);
                    sb2.append("\n驱动：\n");
                    sb2.append(tq0Var.g);
                    sb2.append('\n');
                    java.lang.String str7 = tq0Var.h;
                    a.wv.v(str7, "vulkanInfo.driverInfo");
                    if (!a.yi1.o2(str7)) {
                        sb2.append(str7);
                        sb2.append('\n');
                    }
                    sb2.append("驱动版本：" + tq0Var.i);
                    sb2.append('\n');
                    sb2.append("驱动一致性：" + tq0Var.j);
                    sb2.append('\n');
                    sb2.append("设备扩展：" + tq0Var.k);
                    sb2.append('\n');
                    sb2.append("实例扩展：" + tq0Var.l);
                    sb2.append('\n');
                } else {
                    sb2.append("【Vulkan】\n");
                    if (a.yi1.o2(str5)) {
                        str5 = "设备不支持 Vulkan";
                    }
                    sb2.append(str5);
                    sb2.append('\n');
                }
                java.lang.String sb3 = sb2.toString();
                a.wv.v(sb3, "StringBuilder().apply(builderAction).toString()");
                java.lang.String obj6 = a.yi1.G2(sb3).toString();
                int i8 = a.x60.f681a;
                a.fs1.F(pl0Var.K(), "GPU 驱动信息", obj6, null);
                return;
            case 10:
                a.qo0 qo0Var2 = (a.qo0) obj4;
                a.ma1 ma1Var2 = (a.ma1) obj3;
                a.ag0 ag0Var = (a.ag0) obj2;
                android.widget.TextView textView7 = (android.widget.TextView) obj;
                a.fa0 fa0Var = a.ag0.w;
                a.wv.w(qo0Var2, "$haptic");
                a.wv.w(ma1Var2, "$resetDuration");
                a.wv.w(ag0Var, "this$0");
                a.wv.w(textView7, "$view");
                qo0Var2.b();
                ((a.qo0) ma1Var2.c).b();
                ag0Var.f = java.lang.Integer.parseInt(textView7.getText().toString()) * 60;
                textView7.setAlpha(1.0f);
                return;
            case 11:
                a.dh0 dh0Var = (a.dh0) obj4;
                java.lang.String str8 = (java.lang.String) obj3;
                java.lang.Runnable runnable2 = (java.lang.Runnable) obj2;
                java.lang.Runnable runnable3 = (java.lang.Runnable) obj;
                android.view.WindowManager windowManager = a.dh0.n;
                a.wv.w(dh0Var, "this$0");
                a.wv.w(str8, "$app");
                a.wv.w(runnable2, "$switchMode");
                a.wv.w(runnable3, "$hapticFeedback");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                dh0Var.k.h(str8, ((android.widget.CompoundButton) view).isChecked());
                runnable2.run();
                runnable3.run();
                return;
            case 12:
                a.ma1 ma1Var3 = (a.ma1) obj4;
                a.dh0 dh0Var2 = (a.dh0) obj3;
                java.lang.Runnable runnable4 = (java.lang.Runnable) obj2;
                java.lang.Runnable runnable5 = (java.lang.Runnable) obj;
                android.view.WindowManager windowManager2 = a.dh0.n;
                a.wv.w(ma1Var3, "$selectedMode");
                a.wv.w(dh0Var2, "this$0");
                a.wv.w(runnable4, "$switchMode");
                a.wv.w(runnable5, "$hapticFeedback");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                boolean isChecked2 = ((android.widget.CompoundButton) view).isChecked();
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.D().edit().putBoolean("pedestal_mode", isChecked2).apply();
                if (isChecked2) {
                    string = a.b11.m;
                } else {
                    string = dh0Var2.h.getString(dh0Var2.b(), dh0Var2.i);
                    a.wv.s(string);
                }
                ma1Var3.c = string;
                runnable4.run();
                runnable5.run();
                return;
            case 13:
                com.omarea.model.SceneConfigInfo sceneConfigInfo = (com.omarea.model.SceneConfigInfo) obj4;
                a.au auVar = (a.au) obj3;
                a.ma1 ma1Var4 = (a.ma1) obj;
                android.view.WindowManager windowManager3 = a.dh0.n;
                a.wv.w(auVar, "$store");
                a.wv.w((a.dh0) obj2, "this$0");
                a.wv.w(ma1Var4, "$selectedMode");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                sceneConfigInfo.aloneLight = ((android.widget.CompoundButton) view).isChecked();
                auVar.o(sceneConfigInfo);
                a.dh0.e((java.lang.String) ma1Var4.c);
                return;
            case 14:
                android.content.Context context4 = (android.content.Context) obj4;
                com.omarea.model.SceneConfigInfo sceneConfigInfo2 = (com.omarea.model.SceneConfigInfo) obj3;
                a.au auVar2 = (a.au) obj2;
                a.dh0 dh0Var3 = (a.dh0) obj;
                android.view.WindowManager windowManager4 = a.dh0.n;
                a.wv.w(context4, "$context");
                a.wv.w(auVar2, "$store");
                a.wv.w(dh0Var3, "this$0");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) view;
                boolean isChecked3 = compoundButton.isChecked();
                if (!isChecked3 || a.gy.y(context4)) {
                    sceneConfigInfo2.disNotice = isChecked3;
                    auVar2.o(sceneConfigInfo2);
                    a.dh0.e(dh0Var3.b());
                    return;
                } else {
                    try {
                        context4.startActivity(new android.content.Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                    } catch (java.lang.Exception unused2) {
                    }
                    a.ai1.r(context4, 2131953342, context4, 0);
                    compoundButton.setChecked(false);
                    return;
                }
            default:
                a.ka1 ka1Var = (a.ka1) obj4;
                android.widget.ListView listView = (android.widget.ListView) obj3;
                android.widget.TextView textView8 = (android.widget.TextView) obj2;
                a.ph0 ph0Var = (a.ph0) obj;
                a.fa0 fa0Var2 = a.ph0.i;
                a.wv.w(ka1Var, "$filterMode");
                a.wv.w(listView, "$process_list");
                a.wv.w(textView8, "$btnProcessFilter");
                a.wv.w(ph0Var, "this$0");
                ka1Var.c = ka1Var.c == 32 ? 1 : 32;
                listView.setSelection(0);
                android.widget.ListAdapter adapter = listView.getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.procs.AdapterProcessMini");
                a.rj rjVar = (a.rj) adapter;
                rjVar.g = ka1Var.c;
                rjVar.c();
                textView8.setText(ph0Var.f435a.getString(ka1Var.c == 32 ? 2131953256 : 2131953255));
                return;
        }
    }

    public /* synthetic */ d41(android.view.View view, a.mc1 mc1Var, a.v60 v60Var, a.f60 f60Var) {
        this.c = 7;
        this.g = view;
        this.d = mc1Var;
        this.e = v60Var;
        this.f = f60Var;
    }

    public /* synthetic */ d41(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }
}
