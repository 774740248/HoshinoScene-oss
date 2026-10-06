package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityMiuiThermal extends a.p5 {
    public static final /* synthetic */ a.gu0[] j;
    public final a.yq1 d = a.b20.i(this, 2131363278);
    public final a.yq1 e = a.b20.i(this, 2131363277);
    public final int f = 1;
    public java.lang.String g = "";
    public boolean h = true;
    public final a.x01 i = new a.x01();

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityMiuiThermal.class, "thermal_config", "getThermal_config()Landroid/widget/EditText;");
        a.na1.f375a.getClass();
        j = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityMiuiThermal.class, "thermal_btn_more", "getThermal_btn_more()Landroid/widget/ImageView;")};
    }

    public final java.lang.String o() {
        java.lang.String obj = a.yi1.F2(((android.widget.EditText) this.d.a(j[0])).getText().toString()).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(obj, "input");
        java.lang.String replaceAll = compile.matcher(obj).replaceAll("\n");
        a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
        a.wv.v(compile2, "compile(pattern)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
        a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll2;
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.lang.String obj;
        super.onActivityResult(i, i2, intent);
        if (i != this.f || intent == null || intent.getExtras() == null) {
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        a.wv.s(extras);
        java.lang.String string = extras.getString("file");
        a.wv.s(string);
        if (a.yi1.B2(string, "thermal")) {
            android.widget.Toast.makeText(this, getString(2131952963), 1).show();
            return;
        }
        this.g = string;
        setTitle(string);
        try {
            q();
            this.h = true;
        } catch (java.lang.Exception unused) {
            if (a.yi1.B2(this.g, "/data")) {
                java.lang.String str = this.g;
                a.wv.w(str, "path");
                a.nu0 nu0Var = a.nu0.f395a;
                obj = a.nu0.d(str);
            } else {
                obj = a.yi1.F2(new java.lang.String(a.wv.b1(new java.io.File(this.g)), a.bu.f53a)).toString();
            }
            ((android.widget.EditText) this.d.a(j[0])).setText(obj);
            this.h = false;
        }
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558459);
        setBackArrow();
        ((android.widget.ImageView) this.e.a(j[1])).setOnClickListener(new a.gv(20, this));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [a.ng1, java.lang.Object] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        a.v60 m;
        a.wv.w(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131361931) {
            java.lang.CharSequence[] textArray = getApplicationContext().getResources().getTextArray(2130903059);
            a.wv.v(textArray, "applicationContext.resou…config_start_dir_options)");
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.W1(textArray));
            a.q10 q10Var = a.q10.f457a;
            if (!a.wv.e(a.q10.t(), "root")) {
                arrayList.removeLast();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                a.ng1 ng1Var = (a.ng1) next;
                int i2 = i + 1;
                if (i < 0) {
                    a.b20.p1();
                    throw null;
                }
                java.lang.String charSequence = next.toString();
                a.ng1 obj = new a.ng1();
                obj.a(charSequence != null ? charSequence.toString() : null);
                obj.b(java.lang.String.valueOf(i));
                arrayList2.add(obj);
                i = i2;
            }
            a.e70 e70Var = new a.e70(this, arrayList2, a.qb0.c, false);
            java.lang.String string = getString(2131952934);
            a.wv.v(string, "getString(R.string.miu_thermal_dirs)");
            e70Var.b(string);
            e70Var.a(new a.be0(arrayList, 2, this));
            e70Var.c();
            return true;
        }
        if (itemId == 2131361938) {
            a.q10 q10Var2 = a.q10.f457a;
            if (a.wv.e(a.q10.t(), "basic")) {
                android.widget.Toast.makeText(this, getString(2131952962), 0).show();
                return true;
            }
            if (this.g.length() > 0) {
                r();
                return true;
            }
            android.widget.Toast.makeText(this, getString(2131952962), 0).show();
            return true;
        }
        if (itemId != 2131361901) {
            if (itemId != 2131361920) {
                return super.onOptionsItemSelected(menuItem);
            }
            try {
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://github.com/helloklf/vtools/blob/scene3/docs/MIUI%E6%B8%A9%E6%8E%A7%E8%AF%B4%E6%98%8E.md"));
                intent.addFlags(268435456);
                startActivity(intent);
                return true;
            } catch (java.lang.Exception unused) {
                return true;
            }
        }
        a.q10 q10Var3 = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "basic")) {
            android.widget.Toast.makeText(getContext(), getString(2131952964), 0).show();
            return true;
        }
        if (this.g.length() <= 0) {
            android.widget.Toast.makeText(this, getString(2131952962), 0).show();
            return true;
        }
        android.view.View inflate = getLayoutInflater().inflate(2131558513, (android.view.ViewGroup) null);
        int i3 = a.x60.f681a;
        a.wv.v(inflate, "view");
        m = a.fs1.m(this, inflate, true);
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 5));
        inflate.findViewById(2131362096).setOnClickListener(new a.sg(inflate, m, this, 12));
        return true;
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952913));
    }

    public final byte[] p() {
        byte[] bytes = o().getBytes(a.bu.f53a);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        if (this.h) {
            byte[] b = this.i.b ? a.x01.b() : "thermalopenssl.h".getBytes("UTF-8");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new javax.crypto.spec.SecretKeySpec(b, "AES"), new javax.crypto.spec.IvParameterSpec(b));
            bytes = cipher.doFinal(bytes);
        }
        a.wv.v(bytes, "data");
        return bytes;
    }

    public final void q() {
        byte[] b1;
        byte[] doFinal;
        java.io.File file = new java.io.File(this.g);
        if (a.yi1.B2(this.g, "/data")) {
            java.lang.String absolutePath = file.getAbsolutePath();
            a.wv.v(absolutePath, "file.absolutePath");
            try {
                b1 = a.wv.b1(new java.io.File(absolutePath));
            } catch (java.lang.Exception unused) {
                a.q10 q10Var = a.q10.f457a;
                b1 = android.util.Base64.decode(a.q10.L("read-bytes", absolutePath, 20000L), 11);
                a.wv.v(b1, "{\n            val result…ase64.URL_SAFE)\n        }");
            }
        } else {
            b1 = a.wv.b1(file);
        }
        this.i.getClass();
        try {
            byte[] b = a.x01.b();
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(b, "AES"), new javax.crypto.spec.IvParameterSpec(b));
            doFinal = cipher.doFinal(b1);
        } catch (java.lang.Exception unused2) {
            byte[] bytes = "thermalopenssl.h".getBytes("UTF-8");
            javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher2.init(2, new javax.crypto.spec.SecretKeySpec(bytes, "AES"), new javax.crypto.spec.IvParameterSpec(bytes));
            doFinal = cipher2.doFinal(b1);
        }
        android.widget.EditText editText = (android.widget.EditText) this.d.a(j[0]);
        a.wv.v(doFinal, "output");
        editText.setText(new java.lang.String(doFinal, a.bu.f53a));
        setTitle(file.getName());
    }

    public final void r() {
        byte[] decode;
        byte[] doFinal;
        byte[] p = p();
        java.lang.String f = a.ii1.f(getFilesDir().getPath(), java.io.File.separator, "miui-thermal.tmp");
        a.wv.V1(new java.io.File(f), p);
        java.lang.String str = this.g;
        java.lang.String str2 = "cp '" + f + "' '" + str + "'\nchmod 664 '" + str + "'";
        a.wv.w(str2, "shell");
        a.q10 q10Var = a.q10.f457a;
        java.lang.String l = a.q10.l(str2);
        new java.io.File(f).delete();
        if (a.wv.e(l, "error")) {
            android.widget.Toast.makeText(this, getString(2131952967), 1).show();
            return;
        }
        java.lang.String str3 = this.g;
        a.wv.w(str3, "path");
        try {
            decode = a.wv.b1(new java.io.File(str3));
        } catch (java.lang.Exception unused) {
            a.q10 q10Var2 = a.q10.f457a;
            decode = android.util.Base64.decode(a.q10.L("read-bytes", str3, 20000L), 11);
            a.wv.v(decode, "{\n            val result…ase64.URL_SAFE)\n        }");
        }
        this.i.getClass();
        try {
            byte[] b = a.x01.b();
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new javax.crypto.spec.SecretKeySpec(b, "AES"), new javax.crypto.spec.IvParameterSpec(b));
            doFinal = cipher.doFinal(decode);
        } catch (java.lang.Exception unused2) {
            byte[] bytes = "thermalopenssl.h".getBytes("UTF-8");
            javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher2.init(2, new javax.crypto.spec.SecretKeySpec(bytes, "AES"), new javax.crypto.spec.IvParameterSpec(bytes));
            doFinal = cipher2.doFinal(decode);
        }
        a.wv.v(doFinal, "output");
        if (a.wv.e(new java.lang.String(doFinal, a.bu.f53a), o())) {
            android.widget.Toast.makeText(this, "OK", 1).show();
        } else {
            android.widget.Toast.makeText(this, getString(2131952967), 1).show();
        }
    }
}
