package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFilesTreemap extends a.p5 implements a.ni0 {
    public static final /* synthetic */ a.gu0[] h;
    public final a.yq1 d = a.b20.i(this, 2131362095);
    public final a.yq1 e = a.b20.i(this, 2131363313);
    public final int f = 65401;
    public a.bp0 g;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFilesTreemap.class, "breadcrumb_bar", "getBreadcrumb_bar()Lcom/omarea/ui/files/BreadcrumbView;");
        a.na1.f375a.getClass();
        h = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFilesTreemap.class, "treemap_view", "getTreemap_view()Lcom/omarea/ui/TreemapView;")};
    }

    @Override // a.ni0
    public final void c(java.lang.String str, a.bp0 bp0Var) {
        this.g = bp0Var;
        com.omarea.vtools.activities.ActivityFileSelector.m.getClass();
        startActivityForResult(a.fa0.j(this, str), this.f);
    }

    public final com.omarea.ui.TreemapView o() {
        return (com.omarea.ui.TreemapView) this.e.a(h[1]);
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == this.f) {
            java.lang.String stringExtra = (i2 != -1 || intent == null) ? null : intent.getStringExtra("file");
            a.bp0 bp0Var = this.g;
            if (bp0Var != null) {
                this.g = null;
                if (stringExtra != null) {
                    bp0Var.i(stringExtra);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // a.p5, a.ml, a.kk0, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        a.wv.w(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        autoLayout(configuration);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558451);
        setBackArrow();
        java.lang.String stringExtra = getIntent().getStringExtra("dir");
        if (stringExtra == null) {
            stringExtra = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        o().setOnPathChange(new a.q8(this, 0));
        int i = 1;
        ((com.omarea.ui.files.BreadcrumbView) this.d.a(h[0])).setOnNavigate(new a.q8(this, i));
        o().setOnNodeClick(new a.j8(new a.w21(this, 2), i));
        o().setOnNodeLongClick(new a.q8(this, 2));
        o().setIconLoader(new a.b10(5, new a.vd0(this)));
        o().setDataLoader(a.o4.h);
        a.wv.v(stringExtra, "targetDir");
        a.mc1 r = a.fs1.r(stringExtra);
        com.omarea.ui.TreemapView o = o();
        java.lang.String str = r.b;
        o.setData(new a.vn1(str.length() == 0 ? stringExtra : str, 0L, true, r, 6));
        a.p5.autoLayout$default(this, null, 1, null);
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, 7));
    }
}
