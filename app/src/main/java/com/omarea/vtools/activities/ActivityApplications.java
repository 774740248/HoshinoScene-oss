package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityApplications extends a.p5 {
    public static final /* synthetic */ a.gu0[] n;
    public final a.yq1 d = a.b20.i(this, 2131362031);
    public final a.yq1 e = a.b20.i(this, 2131362035);
    public final a.yq1 f = a.b20.i(this, 2131363233);
    public final a.yq1 g = a.b20.i(this, 2131363235);
    public final a.yq1 h = a.b20.i(this, 2131362032);
    public final a.pm i = new a.pm(16);
    public final a.vk0 j;
    public final a.vk0 k;
    public final a.vk0 l;
    public final java.lang.String m;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityApplications.class, "apps_btn_more", "getApps_btn_more()Landroid/widget/ImageView;");
        a.na1.f375a.getClass();
        n = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityApplications.class, "apps_search_box", "getApps_search_box()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityApplications.class, "tab_content", "getTab_content()Landroidx/viewpager/widget/ViewPager;"), new a.d81(com.omarea.vtools.activities.ActivityApplications.class, "tab_list", "getTab_list()Lcom/google/android/material/tabs/TabLayout;"), new a.d81(com.omarea.vtools.activities.ActivityApplications.class, "apps_filter", "getApps_filter()Lcom/omarea/ui/SelectView;")};
    }

    public ActivityApplications() {
        a.d4 d4Var = new a.d4(this, 1);
        a.vk0.g0.getClass();
        this.j = a.fa0.f(d4Var, 1);
        this.k = a.fa0.f(d4Var, 2);
        this.l = a.fa0.f(d4Var, 3);
        this.m = "/sdcard/Android/media/backups";
    }

    public final android.widget.EditText o() {
        return (android.widget.EditText) this.e.a(n[1]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 8000) {
            if (i2 == -1) {
                p();
                return;
            }
            return;
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        android.net.Uri data = intent.getData();
        a.pm pmVar = this.i;
        pmVar.getClass();
        boolean n2 = a.b20.n(this, android.provider.DocumentsContract.buildDocumentUriUsingTree(data, android.provider.DocumentsContract.getTreeDocumentId(data)));
        java.lang.String str = this.m;
        if (n2) {
            android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putString(str, data.toString()).apply();
            return;
        }
        android.util.Log.e((java.lang.String) pmVar.d, "no write permission: " + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0098, code lost:
    
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, a.ma1] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityApplications.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        a.wv.w(menuItem, "item");
        if (menuItem.getItemId() == 2131361937) {
            startActivityForResult(new android.content.Intent(getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityAppRetrieve.class), 101);
            return true;
        }
        if (menuItem.getItemId() == 2131361910) {
            int i = a.x60.f681a;
            a.wv.M0(a.wv.b(a.z80.b), null, new a.i5(a.fs1.J(this, null), this, this, null), 3);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952890));
    }

    public final void p() {
        try {
            this.j.W();
        } catch (java.lang.Exception e) {
            e.getStackTrace();
        }
        try {
            this.k.W();
        } catch (java.lang.Exception e2) {
            e2.getStackTrace();
        }
        try {
            this.l.W();
        } catch (java.lang.Exception e3) {
            e3.getStackTrace();
        }
    }

    public final void q(android.text.Editable editable, a.rk0 rk0Var) {
        java.util.ArrayList S;
        java.util.ArrayList S2;
        java.util.ArrayList S3;
        java.lang.String obj = editable.toString();
        a.vk0 vk0Var = this.j;
        vk0Var.X(obj);
        a.wv.w(rk0Var, "value");
        int i = 27;
        if (vk0Var.e0 != rk0Var) {
            vk0Var.e0 = rk0Var;
            android.view.View view = vk0Var.H;
            android.widget.ListView listView = view != null ? (android.widget.ListView) view.findViewById(2131361998) : null;
            if (listView != null && (S3 = vk0Var.S()) != null) {
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.ua0(vk0Var, S3, listView, i));
            }
        }
        a.vk0 vk0Var2 = this.k;
        vk0Var2.X(obj);
        if (vk0Var2.e0 != rk0Var) {
            vk0Var2.e0 = rk0Var;
            android.view.View view2 = vk0Var2.H;
            android.widget.ListView listView2 = view2 != null ? (android.widget.ListView) view2.findViewById(2131361998) : null;
            if (listView2 != null && (S2 = vk0Var2.S()) != null) {
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.L(new a.ua0(vk0Var2, S2, listView2, i));
            }
        }
        a.vk0 vk0Var3 = this.l;
        vk0Var3.X(obj);
        if (vk0Var3.e0 != rk0Var) {
            vk0Var3.e0 = rk0Var;
            android.view.View view3 = vk0Var3.H;
            android.widget.ListView listView3 = view3 != null ? (android.widget.ListView) view3.findViewById(2131361998) : null;
            if (listView3 == null || (S = vk0Var3.S()) == null) {
                return;
            }
            a.cp cpVar3 = com.omarea.Scene.c;
            a.fs1.L(new a.ua0(vk0Var3, S, listView3, i));
        }
    }
}
