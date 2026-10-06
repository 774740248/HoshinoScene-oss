package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityAppConfig2 extends a.p5 {
    public static final /* synthetic */ a.gu0[] s;
    public a.b81 i;
    public a.po k;
    public java.util.ArrayList l;
    public java.util.ArrayList m;
    public final a.au n;
    public final java.util.List o;
    public final java.util.List p;
    public android.view.View q;
    public boolean r;
    public final a.yq1 d = a.b20.i(this, 2131362112);
    public final a.yq1 e = a.b20.i(this, 2131362249);
    public final a.yq1 f = a.b20.i(this, 2131362250);
    public final a.yq1 g = a.b20.i(this, 2131362251);
    public final a.yq1 h = a.b20.i(this, 2131363030);
    public final a.vj1 j = new a.vj1(a.b4.e);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityAppConfig2.class, "btn_reset", "getBtn_reset()Landroid/widget/ImageView;");
        a.na1.f375a.getClass();
        s = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityAppConfig2.class, "config_search_box", "getConfig_search_box()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityAppConfig2.class, "configlist_modes", "getConfiglist_modes()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityAppConfig2.class, "configlist_type", "getConfiglist_type()Lcom/omarea/ui/SelectView;"), new a.d81(com.omarea.vtools.activities.ActivityAppConfig2.class, "scene_app_list", "getScene_app_list()Landroid/widget/ListView;")};
    }

    public ActivityAppConfig2() {
        a.cp cpVar = com.omarea.Scene.c;
        this.n = new a.au(a.fs1.t(), 2);
        this.o = a.b20.z0("/data", "/system", "*");
        this.p = a.b20.z0("*", a.b11.i, a.b11.l, a.b11.j, a.b11.k, "", a.b11.o);
    }

    public static void t(com.omarea.vtools.activities.ActivityAppConfig2 activityAppConfig2) {
        if (activityAppConfig2.r) {
            return;
        }
        a.b81 b81Var = activityAppConfig2.i;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        a.b81.c(b81Var);
        a.wv.M0(a.wv.b(a.z80.b), null, new a.x3(activityAppConfig2, false, null), 3);
    }

    public final android.widget.EditText o() {
        return (android.widget.EditText) this.e.a(s[1]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0 || intent == null || this.m == null) {
            return;
        }
        int i3 = -1;
        if (i2 == -1) {
            try {
                android.widget.ListAdapter adapter = r().getAdapter();
                a.wv.t(adapter, "null cannot be cast to non-null type com.omarea.ui.apps.AdapterSceneMode");
                a.zj zjVar = (a.zj) adapter;
                android.os.Bundle extras = intent.getExtras();
                a.wv.s(extras);
                java.lang.String string = extras.getString("app");
                java.util.ArrayList arrayList = this.m;
                a.wv.s(arrayList);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    java.util.ArrayList arrayList2 = this.m;
                    a.wv.s(arrayList2);
                    if (a.wv.e(((com.omarea.model.AppInfo) arrayList2.get(i4)).getPackageName(), string)) {
                        i3 = i4;
                    }
                }
                if (i3 < 0) {
                    return;
                }
                java.util.ArrayList arrayList3 = zjVar.f;
                a.wv.s(arrayList3);
                java.lang.Object obj = arrayList3.get(i3);
                a.wv.v(obj, "list!![position]");
                u((com.omarea.model.AppInfo) obj);
                a.zj zjVar2 = (a.zj) r().getAdapter();
                if (zjVar2 != null) {
                    android.view.View view = this.q;
                    a.wv.s(view);
                    zjVar2.a(view, i3);
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("update-list", e.getMessage());
            }
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        java.util.List list;
        super.onCreate(bundle);
        setContentView(2131558434);
        setBackArrow();
        this.i = new a.b81(this, null);
        final int i = 0;
        this.k = new a.po(this, false);
        if (s().getAll().isEmpty()) {
            new a.pm(21).y();
        }
        r().setOnItemClickListener(new a.og1(2, this));
        a.cp cpVar = com.omarea.Scene.c;
        final int i2 = 1;
        if (a.fs1.D().getBoolean("dynamic_control", false)) {
            r().setOnItemLongClickListener(new a.u3(this));
        } else {
            r().setOnItemLongClickListener(new a.u3(this));
        }
        o().setOnEditorActionListener(new a.uf1(this, 3));
        com.omarea.ui.SelectView q = q();
        java.lang.String[] stringArray = getResources().getStringArray(2130903066);
        a.wv.v(stringArray, "resources.getStringArray….powercfg_apptype_filter)");
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        int length = stringArray.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            list = this.o;
            if (i3 >= length) {
                break;
            }
            java.lang.String str = stringArray[i3];
            a.wv.v(str, "label");
            arrayList.add(new a.mg1(str, (java.lang.String) list.get(i4)));
            i3++;
            i4++;
        }
        q.setItems(arrayList);
        q().setValue((java.lang.String) a.qv.e2(list));
        q().setOnItemSelected(new a.z3(this, 0));
        com.omarea.ui.SelectView p = p();
        java.lang.String[] stringArray2 = getResources().getStringArray(2130903067);
        a.wv.v(stringArray2, "resources.getStringArray…ay.powercfg_modes_filter)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(stringArray2.length);
        int length2 = stringArray2.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            java.util.List list2 = this.p;
            if (i5 >= length2) {
                p.setItems(arrayList2);
                p().setValue((java.lang.String) a.qv.e2(list2));
                p().setOnItemSelected(new a.z3(this, 1));
                ((android.widget.ImageView) this.d.a(s[0])).setOnClickListener(new a.gv(16, this));
                t(this);
                return;
            }
            java.lang.String str2 = stringArray2[i5];
            a.wv.v(str2, "label");
            arrayList2.add(new a.mg1(str2, (java.lang.String) list2.get(i6)));
            i5++;
            i6++;
        }
    }

    @Override // a.p5, a.ml, a.kk0, android.app.Activity
    public final void onDestroy() {
        a.b81 b81Var = this.i;
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        super.onDestroy();
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952889));
    }

    public final com.omarea.ui.SelectView p() {
        return (com.omarea.ui.SelectView) this.f.a(s[2]);
    }

    public final com.omarea.ui.SelectView q() {
        return (com.omarea.ui.SelectView) this.g.a(s[3]);
    }

    public final android.widget.ListView r() {
        return (android.widget.ListView) this.h.a(s[4]);
    }

    public final android.content.SharedPreferences s() {
        java.lang.Object a2 = this.j.a();
        a.wv.v(a2, "<get-spfPowerCfg>(...)");
        return (android.content.SharedPreferences) a2;
    }

    public final void u(com.omarea.model.AppInfo appInfo) {
        appInfo.setSelected(false);
        java.lang.String packageName = appInfo.getPackageName();
        java.lang.String string = s().getString(packageName, "");
        a.wv.s(string);
        appInfo.stateTags = string;
        com.omarea.model.SceneConfigInfo c = this.n.c(packageName);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (c.aloneLight) {
            sb.append(getString(2131952153));
        }
        if (c.disNotice) {
            sb.append(getString(2131952147));
        }
        if (c.disButton) {
            sb.append(getString(2131952146));
        }
        if (c.gpsOn) {
            sb.append(getString(2131952154));
        }
        if (c.screenOrientation != -1) {
            java.lang.String u = new a.nk(this, 19).u(java.lang.Integer.valueOf(c.screenOrientation));
            if (u.length() > 0) {
                sb.append(u);
                sb.append("  ");
            }
        }
        appInfo.desc = sb.toString();
    }
}
