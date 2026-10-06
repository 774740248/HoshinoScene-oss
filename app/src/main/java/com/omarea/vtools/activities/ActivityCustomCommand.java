package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityCustomCommand extends a.p5 {
    public static final /* synthetic */ a.gu0[] h;
    public final a.yq1 d = a.b20.i(this, 2131362098);
    public final a.yq1 e = a.b20.i(this, 2131362118);
    public final a.yq1 f = a.b20.i(this, 2131362244);
    public final a.yq1 g = a.b20.i(this, 2131362245);

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityCustomCommand.class, "btn_confirm", "getBtn_confirm()Landroid/widget/Button;");
        a.na1.f375a.getClass();
        h = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityCustomCommand.class, "btn_run", "getBtn_run()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityCustomCommand.class, "command_script", "getCommand_script()Landroid/widget/EditText;"), new a.d81(com.omarea.vtools.activities.ActivityCustomCommand.class, "command_title", "getCommand_title()Landroid/widget/EditText;")};
    }

    public final void o(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(str2, "input");
        java.lang.String replaceAll = compile.matcher(str2).replaceAll("\n");
        a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
        a.wv.v(compile2, "compile(pattern)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
        a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
        a.wv.v(defaultCharset, "defaultCharset()");
        byte[] bytes = replaceAll2.getBytes(defaultCharset);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        java.lang.String h2 = a.ai1.h("custom-command/", java.net.URLEncoder.encode(str), ".sh");
        java.lang.String str3 = a.pe0.f434a;
        java.lang.String d = a.pe0.d(getContext(), h2);
        if (!a.ai1.w(d) || z) {
            if (!a.pe0.i(this, h2, bytes)) {
                android.widget.Toast.makeText(this, getString(2131953633), 0).show();
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("path", d);
            setResult(-1, intent);
            finish();
            android.widget.Toast.makeText(this, getString(2131953634), 0).show();
            return;
        }
        java.io.File file = new java.io.File(d);
        java.nio.charset.Charset defaultCharset2 = java.nio.charset.Charset.defaultCharset();
        a.wv.v(defaultCharset2, "defaultCharset()");
        java.lang.String i1 = a.wv.i1(file, defaultCharset2);
        int i = a.x60.f681a;
        java.lang.String string = getString(2131953632);
        a.wv.v(string, "getString(R.string.task_command_name_replace)");
        a.fs1.k(this, string, a.ii1.f(getString(2131953631), "\n", i1), new a.ua0(this, str, str2, 16));
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558446);
        setBackArrow();
        a.gu0[] gu0VarArr = h;
        final int i = 1;
        final int i2 = 0;
        ((android.widget.Button) this.e.a(gu0VarArr[1])).setOnClickListener(new a.h7(this));
        ((android.widget.Button) this.d.a(gu0VarArr[0])).setOnClickListener(new a.h7(this));
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952896));
    }
}
