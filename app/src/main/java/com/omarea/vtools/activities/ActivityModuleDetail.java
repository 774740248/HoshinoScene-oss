package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityModuleDetail extends a.p5 {
    public static final /* synthetic */ a.gu0[] t;
    public final a.yq1 d = a.b20.i(this, 2131362810);
    public final a.yq1 e = a.b20.i(this, 2131362813);
    public final a.yq1 f = a.b20.i(this, 2131362815);
    public final a.yq1 g = a.b20.i(this, 2131362816);
    public final a.yq1 h = a.b20.i(this, 2131362817);
    public final a.yq1 i = a.b20.i(this, 2131362818);
    public final a.yq1 j = a.b20.i(this, 2131362819);
    public final a.yq1 k = a.b20.i(this, 2131362822);
    public final a.yq1 l = a.b20.i(this, 2131362823);
    public final a.yq1 m = a.b20.i(this, 2131362824);
    public final a.yq1 n = a.b20.i(this, 2131362826);
    public final a.yq1 o = a.b20.i(this, 2131362831);
    public final a.yq1 p = a.b20.i(this, 2131362833);
    public final a.yq1 q = a.b20.i(this, 2131362834);
    public final a.yq1 r = a.b20.i(this, 2131362836);
    public final java.lang.String s;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_author", "getModule_author()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        t = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_description", "getModule_description()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_dislike", "getModule_dislike()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_dislike_count", "getModule_dislike_count()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_download", "getModule_download()Landroid/widget/ImageButton;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_download_url", "getModule_download_url()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_edit", "getModule_edit()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_id", "getModule_id()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_like", "getModule_like()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_like_count", "getModule_like_count()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_name", "getModule_name()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_uid", "getModule_uid()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_version_code", "getModule_version_code()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_version_name", "getModule_version_name()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleDetail.class, "module_warn", "getModule_warn()Lcom/omarea/ui/BlurViewLinearLayout;")};
    }

    public ActivityModuleDetail() {
        a.cp cpVar = com.omarea.Scene.c;
        this.s = a.fs1.D().getString("user_name", "");
        new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final com.omarea.vtools.activities.ActivityModuleDetail r10, com.omarea.vtools.activities.ActivityModuleDetail r11, final com.omarea.model.MagiskModuleUnofficial r12) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityModuleDetail.o(com.omarea.vtools.activities.ActivityModuleDetail, com.omarea.vtools.activities.ActivityModuleDetail, com.omarea.model.MagiskModuleUnofficial):void");
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, a.ma1] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558472);
        setBackArrow();
        java.lang.String str = this.s;
        if (str == null || str.length() == 0) {
            android.widget.Toast.makeText(this, getString(2131952985), 0).show();
            finishAfterTransition();
        }
        a.ma1 obj = new a.ma1();
        obj.c = "";
        android.content.Intent intent = getIntent();
        if (intent != null && intent.hasExtra("id")) {
            java.lang.String stringExtra = getIntent().getStringExtra("id");
            a.wv.s(stringExtra);
            obj.c = stringExtra;
        }
        if (((java.lang.CharSequence) obj.c).length() > 0) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.qb(obj, this, null), 3);
        } else {
            finishAfterTransition();
        }
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952914));
    }

    public final void p(java.lang.String str, int i) {
        java.lang.String str2 = this.s;
        if (str2 != null && str2.length() != 0) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.rb(str, this, i, null), 3);
        } else {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.X("暂不支持非会员提交用户评分", 0);
        }
    }
}
