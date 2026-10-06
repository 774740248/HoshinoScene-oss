package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityModuleUpload extends a.p5 {
    public static final /* synthetic */ a.gu0[] q;
    public final a.yq1 d = a.b20.i(this, 2131362097);
    public final a.yq1 e = a.b20.i(this, 2131362098);
    public final a.yq1 f = a.b20.i(this, 2131362810);
    public final a.yq1 g = a.b20.i(this, 2131362812);
    public final a.yq1 h = a.b20.i(this, 2131362813);
    public final a.yq1 i = a.b20.i(this, 2131362814);
    public final a.yq1 j = a.b20.i(this, 2131362818);
    public final a.yq1 k = a.b20.i(this, 2131362822);
    public final a.yq1 l = a.b20.i(this, 2131362826);
    public final a.yq1 m = a.b20.i(this, 2131362833);
    public final a.yq1 n = a.b20.i(this, 2131362834);
    public final java.lang.String o;
    public a.b81 p;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "btn_cancel", "getBtn_cancel()Landroid/widget/Button;");
        a.na1.f375a.getClass();
        q = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "btn_confirm", "getBtn_confirm()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_author", "getModule_author()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_delete", "getModule_delete()Landroid/widget/ImageView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_description", "getModule_description()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_detail_content", "getModule_detail_content()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_download_url", "getModule_download_url()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_id", "getModule_id()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_name", "getModule_name()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_version_code", "getModule_version_code()Lcom/omarea/common/ui/InputView;"), new a.d81(com.omarea.vtools.activities.ActivityModuleUpload.class, "module_version_name", "getModule_version_name()Lcom/omarea/common/ui/InputView;")};
    }

    public ActivityModuleUpload() {
        a.cp cpVar = com.omarea.Scene.c;
        this.o = a.fs1.D().getString("user_name", "");
        new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void o(android.content.Context context, com.omarea.model.MagiskModuleUnofficial magiskModuleUnofficial) {
        a.vj0 vj0Var = new a.vj0("change");
        a.gu0[] gu0VarArr = q;
        vj0Var.a(((com.omarea.common.ui.InputView) this.k.a(gu0VarArr[7])).getEditText(), new a.zb(magiskModuleUnofficial, 0));
        vj0Var.a(((com.omarea.common.ui.InputView) this.l.a(gu0VarArr[8])).getEditText(), new a.zb(magiskModuleUnofficial, 1));
        vj0Var.a(((com.omarea.common.ui.InputView) this.f.a(gu0VarArr[2])).getEditText(), new a.zb(magiskModuleUnofficial, 2));
        vj0Var.a(((com.omarea.common.ui.InputView) this.n.a(gu0VarArr[10])).getEditText(), new a.zb(magiskModuleUnofficial, 3));
        vj0Var.a(((com.omarea.common.ui.InputView) this.m.a(gu0VarArr[9])).getEditText(), new a.zb(magiskModuleUnofficial, 4));
        vj0Var.a(((com.omarea.common.ui.InputView) this.j.a(gu0VarArr[6])).getEditText(), new a.zb(magiskModuleUnofficial, 5));
        vj0Var.a(((com.omarea.common.ui.InputView) this.h.a(gu0VarArr[4])).getEditText(), new a.zb(magiskModuleUnofficial, 6));
        vj0Var.a(((com.omarea.common.ui.InputView) this.i.a(gu0VarArr[5])).getEditText(), new a.zb(magiskModuleUnofficial, 7));
        int i = 21;
        ((android.widget.Button) this.d.a(gu0VarArr[0])).setOnClickListener(new a.gv(21, this));
        ((android.widget.Button) this.e.a(gu0VarArr[1])).setOnClickListener(new a.sg(magiskModuleUnofficial, context, this, 13));
        android.widget.ImageView imageView = (android.widget.ImageView) this.g.a(gu0VarArr[3]);
        java.lang.String dbId = magiskModuleUnofficial.getDbId();
        imageView.setVisibility((dbId == null || dbId.length() == 0) ? 8 : 0);
        imageView.setOnClickListener(new a.wi(this, i, magiskModuleUnofficial));
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, a.ma1] */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558473);
        setBackArrow();
        java.lang.String str = this.o;
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
            a.wv.M0(a.wv.b(a.z80.b), null, new a.ub(obj, this, null), 3);
        } else {
            o(this, new com.omarea.model.MagiskModuleUnofficial());
        }
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952914));
    }
}
