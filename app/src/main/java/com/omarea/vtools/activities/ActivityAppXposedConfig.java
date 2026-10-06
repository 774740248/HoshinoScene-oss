package com.omarea.vtools.activities;

import android.content.Context;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppXposedConfig extends a.p5 {
    public static final /* synthetic */ a.gu0[] o;
    public a.b81 g;
    public a.po h;
    public java.util.ArrayList i;
    public java.util.ArrayList j;
    public a.nk k;
    public android.view.View m;
    public boolean n;
    public final a.yq1 d = a.b20.i(this, 2131362249);
    public final a.yq1 e = a.b20.i(this, 2131362251);
    public final a.yq1 f = a.b20.i(this, 2131363030);
    public final java.util.List l = a.b20.z0("/data", "/system", "*");

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppXposedConfig.class, "config_search_box", "getConfig_search_box()Landroid/widget/EditText;");
        a.na1.f375a.getClass();
        o = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppXposedConfig.class, "configlist_type", "getConfiglist_type()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityAppXposedConfig.class, "scene_app_list", "getScene_app_list()Lcom/omarea/common/ui/OverScrollListView;")};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(com.omarea.vtools.activities.ActivityAppXposedConfig activityAppXposedConfig) {
        if (activityAppXposedConfig.n) {
            return;
        }
        a.b81 b81Var = activityAppXposedConfig.g;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        new java.lang.Thread(new a.u4(activityAppXposedConfig, false, 0)).start();
    }

    public final com.omarea.ui.SelectView o() {
        return (com.omarea.ui.SelectView) this.e.a(o[1]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0 || intent == null || this.j == null) {
            return;
        }
        int i3 = -1;
        if (i2 == -1) {
            try {
                android.widget.ListAdapter adapter = p().getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.XposedAppsAdapter");
                a.ou1 ou1Var = (a.ou1) adapter;
                android.os.Bundle extras = intent.getExtras();
                a.wv.s(extras);
                java.lang.String string = extras.getString("app");
                java.util.ArrayList arrayList = this.j;
                a.wv.s(arrayList);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    java.util.ArrayList arrayList2 = this.j;
                    a.wv.s(arrayList2);
                    if (a.wv.e(((com.omarea.model.AppInfo) arrayList2.get(i4)).getPackageName(), string)) {
                        i3 = i4;
                    }
                }
                if (i3 < 0) {
                    return;
                }
                java.util.ArrayList arrayList3 = ou1Var.f;
                a.wv.s(arrayList3);
                java.lang.Object obj = arrayList3.get(i3);
                a.wv.v(obj, "list!![position]");
                r((com.omarea.model.AppInfo) obj);
                a.ou1 ou1Var2 = (a.ou1) p().getAdapter();
                if (ou1Var2 != null) {
                    android.view.View view = this.m;
                    a.wv.s(view);
                    ou1Var2.a(view, i3);
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("update-list", e.getMessage());
            }
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558438);
        setBackArrow();
        int i = 0;
        a.wv.v(getContext().getSharedPreferences("global", 0), "context.getSharedPrefere…PF, Context.MODE_PRIVATE)");
        this.k = new a.nk(this, 18);
        this.g = new a.b81(this, null);
        this.h = new a.po(this, true);
        a.wv.v(getSharedPreferences("global", 0), "getSharedPreferences(Spf…PF, Context.MODE_PRIVATE)");
        p().setOnItemClickListener(new a.og1(4, this));
        ((android.widget.EditText) this.d.a(o[0])).setOnEditorActionListener(new a.uf1(this, 5));
        com.omarea.ui.SelectView o2 = o();
        java.lang.String[] stringArray = getResources().getStringArray(2130903066);
        a.wv.v(stringArray, "resources.getStringArray….powercfg_apptype_filter)");
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        int length = stringArray.length;
        int i2 = 0;
        while (true) {
            java.util.List list = this.l;
            if (i >= length) {
                o2.setItems(arrayList);
                o().setValue((java.lang.String) a.qv.e2(list));
                o().setOnItemSelected(new a.g4(2, this));
                return;
            } else {
                java.lang.String str = stringArray[i];
                a.wv.v(str, "label");
                arrayList.add(new a.mg1(str, (java.lang.String) list.get(i2)));
                i++;
                i2++;
            }
        }
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        a.nk nkVar = this.k;
        if (nkVar == null) {
            a.wv.M1("xposedExtension");
            throw null;
        }
        nkVar.V();
        a.b81 b81Var = this.g;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        super.onDestroy();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        a.nk nkVar = this.k;
        if (nkVar == null) {
            a.wv.M1("xposedExtension");
            throw null;
        }
        nkVar.c(new a.t4(this, 0));
        setTitle(getString(2131952928));
    }

    public final com.omarea.common.ui.OverScrollListView p() {
        return (com.omarea.common.ui.OverScrollListView) this.f.a(o[2]);
    }

    public final void r(com.omarea.model.AppInfo appInfo) {
        appInfo.setSelected(false);
        java.lang.String packageName = appInfo.getPackageName();
        new com.omarea.model.SceneConfigInfo().packageName = packageName;
        a.nk nkVar = this.k;
        a.pu1 pu1Var = null;
        if (nkVar == null) {
            a.wv.M1("xposedExtension");
            throw null;
        }
        if (((a.tr0) nkVar.e) != null) {
            a.wv.w(packageName, "packageName");
            a.pu1 pu1Var2 = new a.pu1(packageName);
            try {
                a.tr0 tr0Var = (a.tr0) nkVar.e;
                a.wv.s(tr0Var);
                a.lt0 lt0Var = new a.lt0(((a.rr0) tr0Var).b(pu1Var2.f452a));
                java.util.Iterator i = lt0Var.i();
                a.wv.v(i, "config.keys()");
                while (i.hasNext()) {
                    java.lang.String str = (java.lang.String) i.next();
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -743846049:
                                if (!str.equals("webDebug")) {
                                    break;
                                } else {
                                    pu1Var2.e = lt0Var.b(str);
                                    break;
                                }
                            case 99677:
                                if (!str.equals("dpi")) {
                                    break;
                                } else {
                                    pu1Var2.b = lt0Var.d(str);
                                    break;
                                }
                            case 539018453:
                                if (!str.equals("excludeRecent")) {
                                    break;
                                } else {
                                    pu1Var2.c = lt0Var.b(str);
                                    break;
                                }
                            case 848088603:
                                if (!str.equals("smoothScroll")) {
                                    break;
                                } else {
                                    pu1Var2.d = lt0Var.b(str);
                                    break;
                                }
                        }
                    }
                }
                pu1Var = pu1Var2;
            } catch (java.lang.Exception unused) {
            }
            if (pu1Var != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i2 = pu1Var.b;
                if (i2 > 0) {
                    sb.append("DPI:" + i2 + "  ");
                }
                if (pu1Var.c) {
                    sb.append(getString(2131953744) + "  ");
                }
                if (pu1Var.d) {
                    sb.append(getString(2131953748) + "  ");
                }
                if (pu1Var.e) {
                    sb.append(getString(2131953751) + "  ");
                }
                appInfo.desc = sb.toString();
            }
        }
    }
}
