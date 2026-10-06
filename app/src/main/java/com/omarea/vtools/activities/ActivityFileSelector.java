package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityFileSelector extends a.p5 {
    public static final a.fa0 m;
    public static final /* synthetic */ a.gu0[] n;
    public static final int o;
    public a.ti g;
    public a.xj h;
    public final a.yq1 d = a.b20.i(this, 2131362109);
    public final a.yq1 e = a.b20.i(this, 2131362489);
    public final a.yq1 f = a.b20.i(this, 2131362104);
    public java.lang.String i = "";
    public int j = 0;
    public java.lang.String k = "";
    public final a.vj1 l = new a.vj1(a.b4.g);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityFileSelector.class, "btn_ok", "getBtn_ok()Landroid/widget/ImageView;");
        a.na1.f375a.getClass();
        n = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityFileSelector.class, "file_selector_list", "getFile_selector_list()Landroidx/recyclerview/widget/RecyclerView;"), new a.d81(com.omarea.vtools.activities.ActivityFileSelector.class, "btn_favorite", "getBtn_favorite()Landroid/widget/ImageView;")};
        m = new a.fa0(9, 0);
        o = 1;
    }

    public final androidx.recyclerview.widget.RecyclerView o() {
        return (androidx.recyclerview.widget.RecyclerView) this.e.a(n[1]);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558449);
        android.view.View findViewById = findViewById(2131363296);
        a.wv.t(findViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) findViewById;
        setSupportActionBar(toolbar);
        a.d1 supportActionBar = getSupportActionBar();
        a.wv.s(supportActionBar);
        supportActionBar.n();
        a.d1 supportActionBar2 = getSupportActionBar();
        a.wv.s(supportActionBar2);
        supportActionBar2.m(true);
        toolbar.setNavigationOnClickListener(new a.a8(this, 3));
        getOnBackPressedDispatcher().addCallback(this, new a.tl0(this, 5));
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("extension")) {
                android.os.Bundle extras2 = getIntent().getExtras();
                a.wv.s(extras2);
                java.lang.String str = extras2.getString("extension");
                this.i = str;
                if (!a.yi1.B2(str, ".")) {
                    this.i = a.ai1.g(".", this.i);
                }
                if (this.i.length() > 0) {
                    java.lang.CharSequence title = getTitle();
                    setTitle(((java.lang.Object) title) + "(" + this.i + ")");
                }
            }
            if (extras.containsKey("mode")) {
                int i = extras.getInt("mode");
                this.j = i;
                if (i != o) {
                    ((android.widget.ImageView) this.d.a(n[0])).setVisibility(8);
                } else if (extras.containsKey("title")) {
                    android.os.Bundle extras3 = getIntent().getExtras();
                    a.wv.s(extras3);
                    setTitle(extras3.getString("title"));
                } else {
                    setTitle(getString(2131953651));
                }
            }
            if (extras.containsKey("start")) {
                java.lang.String string = extras.getString("start");
                a.wv.s(string);
                this.k = string;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0025, code lost:
    
        if (r0.canRead() != false) goto L11;
     */
    @Override // a.p5, a.kk0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityFileSelector.onResume():void");
    }
}
