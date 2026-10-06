package com.omarea.vtools.activities;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFreezeApps extends a.p5 {
    static final /* synthetic */ a.gu0[] $$delegatedProperties;
    public a.b81 processBarDialog;
    public android.content.SharedPreferences shortConfig;
    private final a.yq1 freeze_apps$delegate = a.b20.i(this, 2131362519);
    private final a.yq1 freeze_apps_search$delegate = a.b20.i(this, 2131362520);
    private final a.yq1 freeze_menu$delegate = a.b20.i(this, 2131362521);
    private final a.yq1 freeze_sort$delegate = a.b20.i(this, 2131362525);
    private final a.yq1 freeze_sort_confirm$delegate = a.b20.i(this, 2131362526);
    private final a.yq1 freeze_settings$delegate = a.b20.i(this, 2131362523);
    public java.util.ArrayList<java.lang.String> freezeApps = new java.util.ArrayList<>();
    public final java.lang.String sortDataKey = "sorted_packages";
    public final a.na editingState = new a.na();

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFreezeApps.class, "freeze_apps", "getFreeze_apps()Lcom/omarea/ui/BlurViewRecyclerView;");
        a.na1.f375a.getClass();
        $$delegatedProperties = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFreezeApps.class, "freeze_apps_search", "getFreeze_apps_search()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityFreezeApps.class, "freeze_menu", "getFreeze_menu()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFreezeApps.class, "freeze_sort", "getFreeze_sort()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFreezeApps.class, "freeze_sort_confirm", "getFreeze_sort_confirm()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityFreezeApps.class, "freeze_settings", "getFreeze_settings()Landroid/widget/ImageView;")};
    }

    public final void addFreezeAppDialog() {
        a.b81 b81Var = this.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.la(this, null), 3);
    }

    public final void addFreezeApps(java.util.List<java.lang.String> list) {
        a.b81 b81Var = this.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        java.lang.String string = getString(2131953213);
        a.wv.v(string, "getString(R.string.please_wait)");
        b81Var.b(string);
        new a.ia(getContext(), list, new a.da(this, 0), getUseSuspendMode()).start();
    }

    public static final void addFreezeApps$lambda$20(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.da(activityFreezeApps, 8));
    }

    public static final void addFreezeApps$lambda$20$lambda$19(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        try {
            activityFreezeApps.loadData();
            a.b81 b81Var = activityFreezeApps.processBarDialog;
            if (b81Var != null) {
                b81Var.a();
            } else {
                a.wv.M1("processBarDialog");
                throw null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private final void autoAddList() {
        a.b81 b81Var = this.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        java.lang.String string = getString(2131953213);
        a.wv.v(string, "getString(R.string.please_wait)");
        b81Var.b(string);
        a.ty tyVar = a.z80.b;
        a.ma maVar = new a.ma(this, null);
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
        a.f av0Var = i2 == 2 ? new a.av0(W, maVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, maVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.booleanValue() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void createShortcut(com.omarea.model.AppInfo r3) {
        /*
            r2 = this;
            java.lang.Boolean r0 = r3.enabled
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            java.lang.Boolean r0 = r3.suspended
            java.lang.String r1 = "appInfo.suspended"
            a.wv.v(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
        L15:
            r2.enableApp(r3)
        L18:
            android.content.Context r0 = r2.getContext()
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = a.b20.J(r0, r3)
            r0 = 0
            if (r3 == 0) goto L3a
            android.content.Context r3 = r2.getContext()
            r1 = 2131952345(0x7f1302d9, float:1.954113E38)
            java.lang.String r1 = r2.getString(r1)
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r1, r0)
            r3.show()
            goto L4c
        L3a:
            android.content.Context r3 = r2.getContext()
            r1 = 2131952344(0x7f1302d8, float:1.9541128E38)
            java.lang.String r1 = r2.getString(r1)
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r1, r0)
            r3.show()
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFreezeApps.createShortcut(com.omarea.model.AppInfo):void");
    }

    private final void createShortcutAll() {
        int i = a.x60.f681a;
        java.lang.String string = getString(2131952339);
        a.wv.v(string, "getString(R.string.freeze_batch_add)");
        java.lang.String string2 = getString(2131952340);
        a.wv.v(string2, "getString(R.string.freeze_batch_add_wran)");
        a.fs1.i(this, string, string2, new a.da(this, 1), null);
    }

    public static final void createShortcutAll$lambda$33(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        java.lang.String string = activityFreezeApps.getString(2131953213);
        a.wv.v(string, "getString(R.string.please_wait)");
        b81Var.b(string);
        new a.ja(activityFreezeApps.getContext(), activityFreezeApps.freezeApps, new a.da(activityFreezeApps, 4), 0).start();
    }

    public static final void createShortcutAll$lambda$33$lambda$32(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.da(activityFreezeApps, 3));
    }

    public static final void createShortcutAll$lambda$33$lambda$32$lambda$31(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        activityFreezeApps.loadData();
    }

    public final void disableApp(com.omarea.model.AppInfo appInfo) {
        disableApp(appInfo.getPackageName());
    }

    public final void enableApp(com.omarea.model.AppInfo appInfo) {
        enableApp(appInfo.getPackageName());
    }

    private final void freezeOptionsDialog() {
        android.view.View inflate = getLayoutInflater().inflate(2131558529, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        a.wv.v(inflate, "view");
        final int i2 = 1;
        final a.v60 m = a.fs1.m(this, inflate, true);
        final int i3 = 0;
        inflate.findViewById(2131362780).setOnClickListener(new a.ga());
        inflate.findViewById(2131362783).setOnClickListener(new a.ga());
        final int i4 = 2;
        inflate.findViewById(2131362781).setOnClickListener(new a.ga());
        final int i5 = 3;
        inflate.findViewById(2131362782).setOnClickListener(new a.ga());
        final int i6 = 4;
        inflate.findViewById(2131362779).setOnClickListener(new a.ga());
    }

    public static final void freezeOptionsDialog$lambda$21(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        v60Var.a();
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.ty tyVar = a.z80.b;
        a.oa oaVar = new a.oa(activityFreezeApps, null);
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
        a.f av0Var = i2 == 2 ? new a.av0(W, oaVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, oaVar);
    }

    public static final void freezeOptionsDialog$lambda$22(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        v60Var.a();
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.qa(activityFreezeApps, null), 3);
    }

    public static final void freezeOptionsDialog$lambda$25(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        v60Var.a();
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        new a.ja(activityFreezeApps.getContext(), activityFreezeApps.freezeApps, new a.da(activityFreezeApps, 7), 2).start();
    }

    public static final void freezeOptionsDialog$lambda$25$lambda$24(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.da(activityFreezeApps, 6));
    }

    public static final void freezeOptionsDialog$lambda$25$lambda$24$lambda$23(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        activityFreezeApps.loadData();
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        android.widget.Toast.makeText(activityFreezeApps.getContext(), activityFreezeApps.getString(2131952346), 1).show();
    }

    public static final void freezeOptionsDialog$lambda$26(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        v60Var.a();
        activityFreezeApps.createShortcutAll();
    }

    public static final void freezeOptionsDialog$lambda$27(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        v60Var.a();
        activityFreezeApps.autoAddList();
    }

    private final void freezeSettingsDialog() {
        android.view.View inflate = getLayoutInflater().inflate(2131558530, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        a.wv.v(inflate, "view");
        final a.v60 m = a.fs1.m(this, inflate, true);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            inflate.findViewById(2131362527).setVisibility(8);
        }
        final android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) inflate.findViewById(2131362528);
        compoundButton.setChecked(getUseSuspendMode());
        final android.widget.CompoundButton compoundButton2 = (android.widget.CompoundButton) inflate.findViewById(2131362524);
        a.cp cpVar = com.omarea.Scene.c;
        compoundButton2.setChecked(a.fs1.s("freeze_icon_notify", false));
        final com.omarea.common.ui.SeekBar seekBar = (com.omarea.common.ui.SeekBar) inflate.findViewById(2131362529);
        seekBar.setProgress(a.fs1.D().getInt("freeze_suspend_time_limit", 2));
        seekBar.setFormatter(new a.b10(6, this));
        final android.widget.CompoundButton compoundButton3 = (android.widget.CompoundButton) inflate.findViewById(2131362522);
        final android.content.pm.PackageManager packageManager = getPackageManager();
        final android.content.ComponentName componentName = new android.content.ComponentName(getApplicationContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFreezeApps.class);
        final boolean z = packageManager.getComponentEnabledSetting(componentName) == 1;
        compoundButton3.setChecked(z);
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 4));
        inflate.findViewById(2131362098).setOnClickListener(new a.fa());
    }

    public static final void freezeSettingsDialog$lambda$29(a.v60 v60Var, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        v60Var.a();
    }

    public static final void freezeSettingsDialog$lambda$30(a.v60 v60Var, android.widget.CompoundButton compoundButton, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.widget.CompoundButton compoundButton2, com.omarea.common.ui.SeekBar seekBar, android.widget.CompoundButton compoundButton3, android.content.pm.PackageManager packageManager, android.content.ComponentName componentName, boolean z, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(componentName, "$startActivity");
        v60Var.a();
        boolean isChecked = compoundButton.isChecked();
        if (isChecked != activityFreezeApps.getUseSuspendMode()) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.N("freeze_suspend", isChecked);
            activityFreezeApps.switchSuspendMode();
        }
        a.cp cpVar2 = com.omarea.Scene.c;
        a.fs1.N("freeze_icon_notify", compoundButton2.isChecked());
        a.fs1.D().edit().putInt("freeze_suspend_time_limit", seekBar.getProgress()).apply();
        try {
            boolean isChecked2 = compoundButton3.isChecked();
            packageManager.setComponentEnabledSetting(componentName, isChecked2 ? 1 : 2, 1);
            if (isChecked2 != z) {
                android.widget.Toast.makeText(activityFreezeApps.getContext(), activityFreezeApps.getString(2131952343), 0).show();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final com.omarea.ui.BlurViewRecyclerView getFreeze_apps() {
        return (com.omarea.ui.BlurViewRecyclerView) this.freeze_apps$delegate.a($$delegatedProperties[0]);
    }

    private final android.widget.EditText getFreeze_apps_search() {
        return (android.widget.EditText) this.freeze_apps_search$delegate.a($$delegatedProperties[1]);
    }

    private final android.widget.ImageView getFreeze_menu() {
        return (android.widget.ImageView) this.freeze_menu$delegate.a($$delegatedProperties[2]);
    }

    private final android.widget.ImageView getFreeze_settings() {
        return (android.widget.ImageView) this.freeze_settings$delegate.a($$delegatedProperties[5]);
    }

    private final android.widget.ImageView getFreeze_sort() {
        return (android.widget.ImageView) this.freeze_sort$delegate.a($$delegatedProperties[3]);
    }

    private final android.widget.ImageView getFreeze_sort_confirm() {
        return (android.widget.ImageView) this.freeze_sort_confirm$delegate.a($$delegatedProperties[4]);
    }

    private final boolean getUseSuspendMode() {
        a.cp cpVar = com.omarea.Scene.c;
        return a.fs1.s("freeze_suspend", android.os.Build.VERSION.SDK_INT >= 28);
    }

    public final void loadData() {
        a.wv.M0(a.wv.b(a.z80.b), null, new a.ta(this, null), 3);
        getFreeze_sort().setOnClickListener(new a.ea(this, 0));
        getFreeze_sort_confirm().setOnClickListener(new a.ea(this, 1));
    }

    public static final void loadData$lambda$3(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(activityFreezeApps, "this$0");
        activityFreezeApps.getFreeze_sort_confirm().setVisibility(0);
        view.setVisibility(8);
        activityFreezeApps.getFreeze_menu().setVisibility(8);
        activityFreezeApps.getFreeze_apps_search().setEnabled(false);
        activityFreezeApps.editingState.f374a = true;
        a.fh fhVar = (a.fh) activityFreezeApps.getFreeze_apps().getAdapter();
        if (fhVar != null) {
            fhVar.q(activityFreezeApps.editingState.f374a);
        }
        android.widget.Toast.makeText(activityFreezeApps.getContext(), activityFreezeApps.getString(2131952356), 0).show();
    }

    public static final void loadData$lambda$6(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(activityFreezeApps, "this$0");
        activityFreezeApps.editingState.f374a = false;
        a.fh fhVar = (a.fh) activityFreezeApps.getFreeze_apps().getAdapter();
        if (fhVar != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (com.omarea.model.AppInfo appInfo : (Iterable<com.omarea.model.AppInfo>) (fhVar.l ? fhVar.g : fhVar.j)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(appInfo.getPackageName());
            }
            android.content.SharedPreferences sharedPreferences = activityFreezeApps.shortConfig;
            if (sharedPreferences == null) {
                a.wv.M1("shortConfig");
                throw null;
            }
            sharedPreferences.edit().clear().putString(activityFreezeApps.sortDataKey, sb.toString()).apply();
            fhVar.q(activityFreezeApps.editingState.f374a);
            android.text.Editable text = activityFreezeApps.getFreeze_apps_search().getText();
            fhVar.getFilter().filter(text == null ? "" : text.toString());
        }
        activityFreezeApps.getFreeze_sort().setVisibility(0);
        activityFreezeApps.getFreeze_menu().setVisibility(0);
        view.setVisibility(8);
        activityFreezeApps.getFreeze_apps_search().setEnabled(true);
        android.widget.Toast.makeText(activityFreezeApps.getContext(), activityFreezeApps.getString(2131952355), 0).show();
    }

    private final void onViewCreated() {
        android.content.SharedPreferences sharedPreferences = getSharedPreferences("freeze_apps_sort", 0);
        a.wv.v(sharedPreferences, "this.getSharedPreference…t\", Context.MODE_PRIVATE)");
        this.shortConfig = sharedPreferences;
        a.b81 b81Var = new a.b81(this, null);
        this.processBarDialog = b81Var;
        a.b81.c(b81Var);
        getFreeze_menu().setOnClickListener(new a.ea(this, 2));
        getFreeze_settings().setOnClickListener(new a.ea(this, 3));
        loadData();
        getFreeze_apps_search().addTextChangedListener(new a.yf1(5, this));
    }

    public static final void onViewCreated$lambda$0(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(activityFreezeApps, "this$0");
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "basic")) {
            android.widget.Toast.makeText(activityFreezeApps.getContext(), 2131953083, 0).show();
        } else {
            activityFreezeApps.freezeOptionsDialog();
        }
    }

    public static final void onViewCreated$lambda$1(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, android.view.View view) {
        a.wv.w(activityFreezeApps, "this$0");
        activityFreezeApps.freezeSettingsDialog();
    }

    private final void removeAndUninstall(com.omarea.model.AppInfo appInfo) {
        int i;
        removeConfig(appInfo);
        try {
            i = (int) ((android.os.UserManager) getContext().getSystemService("user")).getSerialNumberForUser(android.os.Process.myUserHandle());
        } catch (java.lang.Exception unused) {
            i = 0;
        }
        java.lang.String str = "pm uninstall --user " + i + " " + appInfo.getPackageName();
        a.wv.w(str, "shell");
        a.q10 q10Var = a.q10.f457a;
        a.q10.l(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.booleanValue() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeConfig(com.omarea.model.AppInfo r4) {
        /*
            r3 = this;
            java.lang.Boolean r0 = r4.enabled
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            java.lang.Boolean r0 = r4.suspended
            java.lang.String r1 = "appInfo.suspended"
            a.wv.v(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
        L15:
            r3.enableApp(r4)
        L18:
            java.lang.String r4 = r4.getPackageName()
            a.au r0 = new a.au
            android.content.Context r1 = r3.getContext()
            r2 = 2
            r0.<init>(r1, r2)
            com.omarea.model.SceneConfigInfo r1 = r0.c(r4)
            r2 = 0
            r1.freeze = r2
            r0.o(r1)
            r0.close()
            a.me1 r0 = a.me1.p
            if (r0 == 0) goto L3a
            r0.i(r4)
        L3a:
            android.content.Context r0 = r3.getContext()
            a.b20.c1(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFreezeApps.removeConfig(com.omarea.model.AppInfo):void");
    }

    public final void shortcutsLostDialog(java.lang.String str, java.util.ArrayList<com.omarea.model.AppInfo> arrayList) {
        a.cp cpVar = com.omarea.Scene.c;
        if (a.fs1.s("freeze_icon_notify", false)) {
            int i = a.x60.f681a;
            java.lang.String string = getString(2131952347);
            a.wv.v(string, "getString(R.string.freeze_shortcut_lost)");
            a.fs1.i(this, string, a.ii1.f(getString(2131952348), "\n\n", str), new a.so(this, 27, arrayList), null);
        }
    }

    public static final void shortcutsLostDialog$lambda$9(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, java.util.ArrayList arrayList) {
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(arrayList, "$lostedShortcuts");
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        java.lang.String string = activityFreezeApps.getString(2131953213);
        a.wv.v(string, "getString(R.string.please_wait)");
        b81Var.b(string);
        new a.ja(activityFreezeApps.getContext(), new a.da(activityFreezeApps, 2), arrayList).start();
    }

    public static final void shortcutsLostDialog$lambda$9$lambda$8(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        a.cp cpVar = com.omarea.Scene.c;
        a.fs1.L(new a.da(activityFreezeApps, 5));
    }

    public static final void shortcutsLostDialog$lambda$9$lambda$8$lambda$7(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps) {
        a.wv.w(activityFreezeApps, "this$0");
        activityFreezeApps.loadData();
        a.b81 b81Var = activityFreezeApps.processBarDialog;
        if (b81Var != null) {
            b81Var.a();
        } else {
            a.wv.M1("processBarDialog");
            throw null;
        }
    }

    public final void showOptions(final com.omarea.model.AppInfo appInfo) {
        android.view.View inflate = getLayoutInflater().inflate(2131558528, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        a.wv.v(inflate, "view");
        final int i2 = 1;
        final a.v60 m = a.fs1.m(this, inflate, true);
        final int i3 = 0;
        inflate.findViewById(2131362012).setOnClickListener(new a.ha());
        inflate.findViewById(2131362016).setOnClickListener(new a.ha());
        final int i4 = 2;
        inflate.findViewById(2131362014).setOnClickListener(new a.ha());
        final int i5 = 3;
        inflate.findViewById(2131362019).setOnClickListener(new a.ha());
        final int i6 = 4;
        inflate.findViewById(2131362011).setOnClickListener(new a.ha());
    }

    public static final void showOptions$lambda$10(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, com.omarea.model.AppInfo appInfo, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(appInfo, "$appInfo");
        v60Var.a();
        activityFreezeApps.startApp(appInfo);
    }

    public static final void showOptions$lambda$11(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, com.omarea.model.AppInfo appInfo, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(appInfo, "$appInfo");
        v60Var.a();
        activityFreezeApps.createShortcut(appInfo);
    }

    public static final void showOptions$lambda$12(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, com.omarea.model.AppInfo appInfo, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(appInfo, "$appInfo");
        v60Var.a();
        activityFreezeApps.removeConfig(appInfo);
        activityFreezeApps.loadData();
    }

    public static final void showOptions$lambda$14(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, com.omarea.model.AppInfo appInfo, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(appInfo, "$appInfo");
        v60Var.a();
        int i = a.x60.f681a;
        java.lang.String string = activityFreezeApps.getString(2131952386);
        a.wv.v(string, "getString(R.string.freezer_uninstall_dialog)");
        a.fs1.i(activityFreezeApps, string, appInfo.getAppName(), new a.so(activityFreezeApps, 28, appInfo), null);
    }

    public static final void showOptions$lambda$14$lambda$13(com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, com.omarea.model.AppInfo appInfo) {
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(appInfo, "$appInfo");
        activityFreezeApps.removeAndUninstall(appInfo);
        activityFreezeApps.loadData();
    }

    public static final void showOptions$lambda$15(a.v60 v60Var, com.omarea.vtools.activities.ActivityFreezeApps activityFreezeApps, com.omarea.model.AppInfo appInfo, android.view.View view) {
        a.wv.w(v60Var, "$dialog");
        a.wv.w(activityFreezeApps, "this$0");
        a.wv.w(appInfo, "$appInfo");
        v60Var.a();
        activityFreezeApps.toggleEnable(appInfo);
        activityFreezeApps.loadData();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.booleanValue() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startApp(com.omarea.model.AppInfo r3) {
        /*
            r2 = this;
            r2.enableApp(r3)
            java.lang.Boolean r0 = r3.enabled
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            java.lang.Boolean r0 = r3.suspended
            java.lang.String r1 = "appInfo.suspended"
            a.wv.v(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3c
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.enabled = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.suspended = r0
            com.omarea.ui.BlurViewRecyclerView r0 = r2.getFreeze_apps()
            a.e91 r0 = r0.getAdapter()
            a.fh r0 = (a.fh) r0
            if (r0 == 0) goto L3c
            boolean r1 = r0.l
            if (r1 == 0) goto L33
            java.util.ArrayList r1 = r0.g
            goto L35
        L33:
            java.util.ArrayList r1 = r0.j
        L35:
            int r1 = r1.indexOf(r3)
            r0.g(r1)
        L3c:
            a.me1 r0 = a.me1.p
            if (r0 == 0) goto L47
            java.lang.String r1 = r3.getPackageName()
            r0.m(r1)
        L47:
            a.l1 r0 = new a.l1
            r1 = 2
            r0.<init>(r2, r1)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r1 = "packageName"
            a.wv.w(r3, r1)
            android.content.Context r1 = r0.b     // Catch: java.lang.Exception -> L63
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L63
            android.content.Intent r3 = r1.getLaunchIntentForPackage(r3)     // Catch: java.lang.Exception -> L63
            r0.n(r3)     // Catch: java.lang.Exception -> L63
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFreezeApps.startApp(com.omarea.model.AppInfo):void");
    }

    private final void switchSuspendMode() {
        a.b81 b81Var = this.processBarDialog;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.ty tyVar = a.z80.b;
        a.ua uaVar = new a.ua(this, null);
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
        a.f av0Var = i2 == 2 ? new a.av0(W, uaVar) : new a.f(W, true);
        av0Var.S(i2, av0Var, uaVar);
    }

    private final void toggleEnable(com.omarea.model.AppInfo appInfo) {
        if (appInfo.enabled.booleanValue()) {
            java.lang.Boolean bool = appInfo.suspended;
            a.wv.v(bool, "appInfo.suspended");
            if (!bool.booleanValue()) {
                disableApp(appInfo);
                android.widget.Toast.makeText(getContext(), getString(2131952341), 0).show();
                appInfo.enabled = java.lang.Boolean.FALSE;
                appInfo.suspended = java.lang.Boolean.TRUE;
                return;
            }
        }
        enableApp(appInfo);
        android.widget.Toast.makeText(getContext(), getString(2131952342), 0).show();
        appInfo.enabled = java.lang.Boolean.TRUE;
        appInfo.suspended = java.lang.Boolean.FALSE;
    }

    @Override // a.p5
    public void autoLayout(android.content.res.Configuration configuration) {
        if (configuration == null) {
            configuration = getResources().getConfiguration();
        }
        super.autoLayout(configuration);
        int i = configuration.orientation == 2 ? 6 : 4;
        androidx.recyclerview.widget.a layoutManager = getFreeze_apps().getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).z1(i);
            return;
        }
        com.omarea.ui.BlurViewRecyclerView freeze_apps = getFreeze_apps();
        getContext();
        freeze_apps.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(i));
    }

    @Override // android.app.Activity
    public void finish() {
        a.b81 b81Var;
        try {
            b81Var = this.processBarDialog;
        } catch (java.lang.Exception unused) {
        }
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        super.finish();
    }

    @Override // a.p5, a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        autoLayout(configuration);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558454);
        setBackArrow();
        onViewCreated();
        a.p5.autoLayout$default(this, null, 1, null);
    }

    public final void disableApp(java.lang.String str) {
        if (getUseSuspendMode()) {
            a.tg1 tg1Var = a.me1.m;
            a.tg1.q(str);
        } else {
            a.tg1 tg1Var2 = a.me1.m;
            a.tg1.e(str);
        }
    }

    public final void enableApp(java.lang.String str) {
        a.tg1 tg1Var = a.me1.m;
        a.tg1.t(str);
    }
}
