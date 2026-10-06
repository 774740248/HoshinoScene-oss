package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityOplusORMS extends a.p5 {
    public static final /* synthetic */ a.gu0[] i;
    public final a.yq1 d = a.b20.i(this, 2131363278);
    public final a.yq1 e = a.b20.i(this, 2131362944);
    public java.lang.String f = "";
    public a.b81 g;
    public final java.lang.String h;

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityOplusORMS.class, "thermal_config", "getThermal_config()Landroid/widget/EditText;");
        a.na1.f375a.getClass();
        i = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityOplusORMS.class, "orms_btn_more", "getOrms_btn_more()Landroid/widget/ImageView;")};
    }

    public ActivityOplusORMS() {
        java.lang.String str = a.pe0.f434a;
        this.h = a.ii1.e(a.pe0.f434a, "/Android/scene-orms.xml");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(com.omarea.vtools.activities.ActivityOplusORMS r6, a.ey r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof a.kc
            if (r0 == 0) goto L16
            r0 = r7
            a.kc r0 = (a.kc) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            a.kc r0 = new a.kc
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f
            a.dz r1 = a.dz.c
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            a.b20.q1(r7)     // Catch: java.lang.Exception -> L5e
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            a.b20.q1(r7)
            java.lang.String r7 = r6.f     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = "path"
            a.wv.w(r7, r2)     // Catch: java.lang.Exception -> L5e
            a.nu0 r2 = a.nu0.f395a     // Catch: java.lang.Exception -> L5e
            java.lang.String r7 = a.nu0.d(r7)     // Catch: java.lang.Exception -> L5e
            a.v21 r2 = new a.v21     // Catch: java.lang.Exception -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.String r7 = r2.d(r7)     // Catch: java.lang.Exception -> L5e
            a.u20 r2 = a.z80.f728a     // Catch: java.lang.Exception -> L5e
            a.zx0 r2 = a.by0.f57a     // Catch: java.lang.Exception -> L5e
            a.lc r4 = new a.lc     // Catch: java.lang.Exception -> L5e
            r5 = 0
            r4.<init>(r6, r7, r5)     // Catch: java.lang.Exception -> L5e
            r0.h = r3     // Catch: java.lang.Exception -> L5e
            java.lang.Object r6 = a.wv.S1(r2, r4, r0)     // Catch: java.lang.Exception -> L5e
            if (r6 != r1) goto L5e
            goto L60
        L5e:
            a.no1 r1 = a.no1.f387a
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityOplusORMS.o(com.omarea.vtools.activities.ActivityOplusORMS, a.ey):java.lang.Object");
    }

    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, android.content.Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 99) {
            java.lang.String str = this.h;
            a.wv.w(str, "path");
            a.nu0 nu0Var = a.nu0.f395a;
            java.lang.String obj = a.yi1.F2(a.nu0.d(str)).toString();
            if (!a.wv.e(obj, a.yi1.F2(p().getText().toString()).toString())) {
                p().setText(obj);
                q();
                return;
            } else {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = getString(2131952218);
                a.wv.v(string, "getString(R.string.editor_unchanged)");
                a.fs1.X(string, 0);
                return;
            }
        }
        if (i3 != -1 || intent == null) {
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("file")) {
            android.widget.Toast.makeText(this, getString(2131952532), 0).show();
            return;
        }
        android.os.Bundle extras2 = intent.getExtras();
        a.wv.s(extras2);
        java.lang.String string2 = extras2.getString("file");
        a.wv.s(string2);
        android.widget.EditText p = p();
        a.nu0 nu0Var2 = a.nu0.f395a;
        p.setText(a.nu0.d(string2));
        a.cp cpVar2 = com.omarea.Scene.c;
        a.fs1.X("OK, ^_^", 0);
    }

    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558461);
        setBackArrow();
        ((android.widget.ImageView) this.e.a(i[1])).setOnClickListener(new a.gv(24, this));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.jc(this, null), 3);
        this.g = new a.b81(this, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        a.wv.w(menuItem, "item");
        super.onOptionsItemSelected(menuItem);
        int itemId = menuItem.getItemId();
        int i2 = 1;
        if (itemId == 2131361938) {
            q();
        } else if (itemId == 2131361936) {
            int i3 = a.x60.f681a;
            java.lang.String string = getString(2131953112);
            a.wv.v(string, "getString(R.string.orms_restore)");
            a.fs1.i(this, string, "", new a.ya(i2, this), null);
        } else if (itemId == 2131361902) {
            a.b81 b81Var = this.g;
            if (b81Var == null) {
                a.wv.M1("progressBarDialog");
                throw null;
            }
            a.b81.c(b81Var);
            a.wv.M0(a.wv.b(a.z80.b), null, new a.hc(this, null), 3);
        } else if (itemId == 2131361923) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
            intent.putExtra("extension", ".xml");
            startActivityForResult(intent, 1);
        } else if (itemId == 2131361916) {
            java.lang.String f = a.ii1.f(a.pe0.f434a, "/", new java.io.File(this.f).getName());
            java.lang.String obj = p().getText().toString();
            int i4 = a.x60.f681a;
            android.content.Context context = getContext();
            java.lang.String string2 = getString(2131952209);
            a.wv.v(string2, "getString(R.string.editor_export)");
            java.lang.String string3 = getString(2131953110);
            a.wv.v(string3, "getString(R.string.orms_export_warn)");
            a.fs1.i(context, string2, a.ai1.l(new java.lang.Object[]{f}, 1, string3, "format(format, *args)"), new a.xa(f, 5, obj), null);
        } else if (itemId == 2131361930) {
            java.lang.String obj2 = p().getText().toString();
            java.lang.String str = this.h;
            a.gy.W(str, obj2);
            try {
                a.q10 q10Var = a.q10.f457a;
                a.q10.l("am stack list | grep bin.mt.plus | cut -f1 -d ':' | cut -f2 -d '=' | xargs am stack remove");
                android.content.ComponentName componentName = new android.content.ComponentName("bin.mt.plus", "bin.mt.plus.OpenFileActivity");
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                intent2.setComponent(componentName);
                intent2.addFlags(16384);
                intent2.addFlags(8388608);
                intent2.setDataAndType(android.net.Uri.fromFile(new java.io.File(str)), "application/xml");
                startActivityForResult(intent2, 99);
            } catch (java.lang.Exception unused) {
            }
        }
        return true;
    }

    @Override // a.p5, a.kk0, android.app.Activity
    public final void onResume() {
        super.onResume();
        setTitle(getString(2131952916));
    }

    public final android.widget.EditText p() {
        return (android.widget.EditText) this.d.a(i[0]);
    }

    public final void q() {
        a.v21 v21Var = new a.v21();
        java.lang.Object text = p().getText();
        if (text == null) {
            text = "";
        }
        java.lang.String e = v21Var.e(text.toString());
        java.lang.String str = a.gy.i("/data/system/orms") ? a.v21.b : "/sdcard/orms_core_config.xml";
        a.wv.v(str, "out");
        a.wv.v(e, "content");
        if (a.gy.W(str, e)) {
            android.widget.Toast.makeText(this, "^_^ -> ".concat(str), 0).show();
        } else {
            android.widget.Toast.makeText(this, ">_<!", 0).show();
        }
    }
}
