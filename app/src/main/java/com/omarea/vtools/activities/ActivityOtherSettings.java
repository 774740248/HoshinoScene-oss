package com.omarea.vtools.activities;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ActivityOtherSettings extends a.p5 {
    public static final /* synthetic */ a.gu0[] t;
    public final a.yq1 d = a.b20.i(this, 2131362988);
    public final a.yq1 e = a.b20.i(this, 2131363092);
    public final a.yq1 f = a.b20.i(this, 2131363093);
    public final a.yq1 g = a.b20.i(this, 2131363094);
    public final a.yq1 h = a.b20.i(this, 2131363095);
    public final a.yq1 i = a.b20.i(this, 2131363096);
    public final a.yq1 j = a.b20.i(this, 2131363097);
    public final a.yq1 k = a.b20.i(this, 2131363098);
    public final a.yq1 l = a.b20.i(this, 2131363099);
    public final a.yq1 m = a.b20.i(this, 2131363100);
    public final a.yq1 n = a.b20.i(this, 2131363102);
    public final a.yq1 o = a.b20.i(this, 2131363227);
    public final a.yq1 p = a.b20.i(this, 2131363228);
    public final a.yq1 q = a.b20.i(this, 2131363144);
    public final a.yq1 r = a.b20.i(this, 2131363229);
    public final a.vj1 s = new a.vj1(new a.oc(1, this));

    static {
        a.d81 d81Var = new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "privacy_policy", "getPrivacy_policy()Landroid/widget/TextView;");
        a.na1.f375a.getClass();
        t = new a.gu0[]{d81Var, new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_daemon_alive", "getSettings_daemon_alive()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_daemon_auto", "getSettings_daemon_auto()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_debug_layer", "getSettings_debug_layer()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_ft_monitor", "getSettings_ft_monitor()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_keep_alive", "getSettings_keep_alive()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_kernel_mem", "getSettings_kernel_mem()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_language_package", "getSettings_language_package()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_language_package_export", "getSettings_language_package_export()Landroid/widget/TextView;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_layer_keep", "getSettings_layer_keep()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "settings_next_release", "getSettings_next_release()Landroid/widget/Switch;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "sync_download", "getSync_download()Landroid/widget/Button;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "sync_menu", "getSync_menu()Lcom/omarea/ui/BlurViewLinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "shortcut_slots", "getShortcut_slots()Landroid/widget/LinearLayout;"), new a.d81(com.omarea.vtools.activities.ActivityOtherSettings.class, "sync_upload", "getSync_upload()Landroid/widget/Button;")};
    }

    public final void o(android.widget.ImageView imageView) {
        java.lang.String obj;
        java.lang.Integer c2;
        java.lang.Object tag = imageView.getTag();
        if (tag == null || (obj = tag.toString()) == null || (c2 = a.wi1.c2(obj)) == null) {
            return;
        }
        int intValue = c2.intValue();
        a.xe1 xe1Var = (a.xe1) this.s.a();
        a.ng1 ng1Var = (a.ng1) a.qv.h2(xe1Var.a(), intValue);
        imageView.setImageResource(xe1Var.b(ng1Var != null ? ng1Var.c : null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.ma1] */
    @Override // a.kk0, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.lang.Throwable th;
        a.vj1 vj1Var;
        java.lang.String str;
        android.content.res.Resources resources;
        java.lang.String str2;
        android.content.res.Resources resources2;
        java.lang.String str3;
        java.lang.String str4;
        a.ab1 ab1Var;
        java.util.Iterator it;
        java.util.List b2;
        java.lang.String string;
        java.util.List b22;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 222) {
                a.ma1 obj = new a.ma1();
                android.content.Context context = getContext();
                android.graphics.Bitmap bitmap = null;
                android.net.Uri data = intent != null ? intent.getData() : null;
                a.wv.w(context, "context");
                android.content.ContentResolver contentResolver = context.getContentResolver();
                a.wv.v(contentResolver, "context.contentResolver");
                try {
                    a.wv.s(data);
                    java.io.InputStream openInputStream = contentResolver.openInputStream(data);
                    if (openInputStream != null) {
                        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(openInputStream);
                        openInputStream.close();
                        bitmap = decodeStream;
                    }
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
                if (bitmap == null) {
                    return;
                }
                obj.c = bitmap;
                int height = getWindow().getDecorView().getHeight();
                if (((android.graphics.Bitmap) obj.c).getHeight() > height) {
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj.c;
                    float height2 = height / bitmap2.getHeight();
                    int width = bitmap2.getWidth();
                    int height3 = bitmap2.getHeight();
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.postScale(height2, height2);
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap2, 0, 0, width, height3, matrix, true);
                    if (createBitmap != null) {
                        bitmap2 = createBitmap;
                    }
                    obj.c = bitmap2;
                }
                new a.v70(this, 1).a(true, new a.e9(this, 1, obj));
                return;
            }
            if (i == 9999) {
                a.wv.s(intent);
                java.lang.String stringExtra = intent.getStringExtra("file");
                a.wv.s(stringExtra);
                a.vj1 vj1Var2 = a.nb1.d;
                a.nb1 x = a.gy.x();
                java.io.File file = new java.io.File(stringExtra);
                x.getClass();
                java.lang.String str5 = "<item> * ";
                java.lang.String str6 = a.pe0.f434a;
                a.vj1 vj1Var3 = x.f376a;
                a.pe0.f(new java.io.File((java.lang.String) vj1Var3.a()), a.wv.b1(file));
                x.d();
                a.cp cpVar = com.omarea.Scene.c;
                android.content.Context applicationContext = a.fs1.t().getApplicationContext();
                a.wv.v(applicationContext, "Scene.context.applicationContext");
                java.util.Locale locale = java.util.Locale.SIMPLIFIED_CHINESE;
                a.wv.v(locale, "SIMPLIFIED_CHINESE");
                android.content.res.Resources c = a.nb1.c(applicationContext, locale);
                java.lang.String packageName = a.fs1.t().getPackageName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                a.ab1 ab1Var2 = new a.ab1("(%d|%s|%.[0-9]f)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it2 = x.b.entrySet().iterator();
                while (true) {
                    vj1Var = vj1Var3;
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                    try {
                        it = it2;
                        try {
                            str3 = str5;
                            try {
                                int identifier = c.getIdentifier((java.lang.String) entry.getKey(), "string", packageName);
                                b2 = a.sg1.b2(a.ab1.b(ab1Var2, (java.lang.CharSequence) entry.getValue()));
                                string = c.getString(identifier);
                                resources2 = c;
                            } catch (java.lang.Throwable th1) {
                                th = th1;
                                resources2 = c;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            resources2 = c;
                            str3 = str5;
                        }
                        try {
                            a.wv.v(string, "res.getString(id)");
                            b22 = a.sg1.b2(a.ab1.b(ab1Var2, string));
                            ab1Var = ab1Var2;
                            try {
                                str4 = packageName;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                str4 = packageName;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            str4 = packageName;
                            ab1Var = ab1Var2;
                            a.b20.I(th);
                            vj1Var3 = vj1Var;
                            str5 = str3;
                            it2 = it;
                            c = resources2;
                            ab1Var2 = ab1Var;
                            packageName = str4;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        resources2 = c;
                        str3 = str5;
                        str4 = packageName;
                        ab1Var = ab1Var2;
                        it = it2;
                    }
                    try {
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        a.b20.I(th);
                        vj1Var3 = vj1Var;
                        str5 = str3;
                        it2 = it;
                        c = resources2;
                        ab1Var2 = ab1Var;
                        packageName = str4;
                    }
                    if (b2.size() == b22.size()) {
                        java.util.Iterator it3 = b2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            int i4 = i3 + 1;
                            it3.next();
                            java.util.Iterator it4 = it3;
                            if (a.wv.e(((a.jy0) b2.get(i3)).a(), ((a.jy0) b22.get(i3)).a())) {
                                i3 = i4;
                                it3 = it4;
                            }
                        }
                        vj1Var3 = vj1Var;
                        str5 = str3;
                        it2 = it;
                        c = resources2;
                        ab1Var2 = ab1Var;
                        packageName = str4;
                    }
                    arrayList.add(entry.getKey());
                    sb.append("🌍 ");
                    sb.append((java.lang.String) entry.getKey());
                    sb.append("");
                    sb.append("\n");
                    sb.append("✅ ");
                    sb.append(a.yi1.v2(string, "\n", " "));
                    sb.append("\n");
                    sb.append("❌ ");
                    sb.append(a.yi1.v2((java.lang.String) entry.getValue(), "\n", " "));
                    sb.append("\n\n\n");
                    vj1Var3 = vj1Var;
                    str5 = str3;
                    it2 = it;
                    c = resources2;
                    ab1Var2 = ab1Var;
                    packageName = str4;
                }
                android.content.res.Resources resources3 = c;
                java.lang.String str7 = str5;
                java.lang.String str8 = packageName;
                for (java.util.Map.Entry entry2 : (Iterable<java.util.Map.Entry>) x.c.entrySet()) {
                    try {
                        resources = resources3;
                        str2 = str8;
                        try {
                            int length = resources.getStringArray(resources.getIdentifier((java.lang.String) entry2.getKey(), "array", str2)).length;
                            int length2 = ((java.lang.Object[]) entry2.getValue()).length;
                            if (length != length2) {
                                arrayList.add(entry2.getKey());
                                sb.append("🌍 ");
                                sb.append((java.lang.String) entry2.getKey());
                                sb.append("");
                                sb.append("\n");
                                sb.append("✅ ");
                                str = str7;
                                try {
                                    sb.append(str);
                                    sb.append(length);
                                    sb.append("\n");
                                    sb.append("❌ ");
                                    sb.append(str);
                                    sb.append(length2);
                                    sb.append("\n\n\n");
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    a.b20.I(th);
                                    resources3 = resources;
                                    str8 = str2;
                                    str7 = str;
                                }
                            } else {
                                str = str7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            str = str7;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        str = str7;
                        resources = resources3;
                        str2 = str8;
                    }
                    resources3 = resources;
                    str8 = str2;
                    str7 = str;
                }
                if (sb.length() <= 0) {
                    android.app.Activity activity = com.omarea.Scene.f;
                    if (activity != null) {
                        activity.finishAffinity();
                    }
                    java.lang.System.exit(0);
                    throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                java.util.HashMap hashMap = x.b;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry3 : (Iterable<java.util.Map.Entry>) hashMap.entrySet()) {
                    if (!arrayList.contains(entry3.getKey())) {
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                x.b = new java.util.LinkedHashMap(linkedHashMap);
                java.util.HashMap hashMap2 = x.c;
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry4 : (Iterable<java.util.Map.Entry>) hashMap2.entrySet()) {
                    if (!arrayList.contains(entry4.getKey())) {
                        linkedHashMap2.put(entry4.getKey(), entry4.getValue());
                    }
                }
                x.c = new java.util.LinkedHashMap(linkedHashMap2);
                android.app.Activity activity2 = com.omarea.Scene.f;
                a.wv.s(activity2);
                android.content.res.Resources resources4 = activity2.getResources();
                a.wv.v(resources4, "Scene.currentActivity!!.resources");
                a.nb1.a(resources4, (java.lang.String) vj1Var.a());
                java.lang.String sb2 = sb.toString();
                if (sb2 != null) {
                    int i5 = a.x60.f681a;
                    a.fs1.F(this, "模板占位符错误", "翻译时，应检查和保留 %s %d %.?f 等字符串占位符，并且不改变出现顺序。\nWhen translating a string, string placeholders such as %s %d %.?f should be checked and preserved without changing the order of occurrence.\n\n".concat(sb2), new a.nc(0, this));
                }
            }
        }
    }

    public final void onAddShortcutClick(android.view.View view) {
        java.lang.String obj;
        java.lang.Integer c2;
        java.lang.String str;
        a.ng1 ng1Var;
        a.wv.w(view, "view");
        a.vj1 vj1Var = this.s;
        java.util.ArrayList<a.ng1> arrayList = ((a.xe1) vj1Var.a()).f;
        java.lang.Object tag = view.getTag();
        if (tag == null || (obj = tag.toString()) == null || (c2 = a.wi1.c2(obj)) == null) {
            return;
        }
        int intValue = c2.intValue();
        java.util.ArrayList a2 = ((a.xe1) vj1Var.a()).a();
        while (true) {
            str = null;
            if (a2.size() >= 4) {
                break;
            } else {
                a2.add(null);
            }
        }
        if (intValue <= a2.size() && (ng1Var = (a.ng1) a2.get(intValue)) != null) {
            str = ng1Var.c;
        }
        for (a.ng1 ng1Var2 : arrayList) {
            ng1Var2.d = a.wv.e(ng1Var2.c, str);
        }
        a.b70 b70Var = new a.b70(getThemeMode().f442a, arrayList, false, new a.p4(this, 3, view), 7);
        b70Var.t0 = "选择功能";
        b70Var.Y();
        b70Var.V(getSupportFragmentManager(), "ShortcutManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0131  */
    @Override // a.p5, a.kk0, androidx.activity.ComponentActivity, a.nw, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityOtherSettings.onCreate(android.os.Bundle):void");
    }

    @Override // a.kk0, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // a.ml, a.kk0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r3 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (a.b20.t(r3, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onThemeClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            a.wv.w(r7, r0)
            java.lang.Object r0 = r7.getTag()
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = a.pe0.f434a
            android.content.Context r2 = r6.getContext()
            java.lang.String r3 = "windowBg.jpg"
            java.lang.String r2 = a.pe0.d(r2, r3)
            r1.<init>(r2)
            r1.delete()
            r1 = 999(0x3e7, float:1.4E-42)
            if (r0 != r1) goto L3c
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.PICK"
            r7.<init>(r0)
            java.lang.String r0 = "image/*"
            r7.setType(r0)
            r0 = 222(0xde, float:3.11E-43)
            r6.startActivityForResult(r7, r0)
            goto Lb4
        L3c:
            r1 = 0
            a.wr.f = r1
            r2 = 10
            if (r0 != r2) goto L8c
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L50
            boolean r3 = a.b0.s()
            if (r3 != 0) goto L8c
            goto L71
        L50:
            android.content.Context r3 = r6.getApplicationContext()
            java.lang.String r4 = "this.applicationContext"
            a.wv.v(r3, r4)
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            int r3 = a.b20.t(r3, r5)
            if (r3 != 0) goto L71
            android.content.Context r3 = r6.getApplicationContext()
            a.wv.v(r3, r4)
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r3 = a.b20.t(r3, r4)
            if (r3 != 0) goto L71
            goto L8c
        L71:
            int r0 = a.x60.f681a
            android.content.Context r7 = r7.getContext()
            java.lang.String r0 = "view.context"
            a.wv.v(r7, r0)
            r0 = 2131953729(0x7f130841, float:1.9543937E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r2 = "getString(R.string.wallpaper_rw_permission)"
            a.wv.v(r0, r2)
            a.fs1.G(r7, r0, r1)
            goto Lb4
        L8c:
            if (r0 != r2) goto L9e
            a.v70 r7 = new a.v70
            r1 = 1
            r7.<init>(r6, r1)
            a.jp1 r1 = new a.jp1
            r1.<init>(r0, r6)
            r0 = 0
            r7.a(r0, r1)
            goto Lb4
        L9e:
            a.cp r7 = com.omarea.Scene.c
            android.content.SharedPreferences r7 = a.fs1.D()
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r1 = "app_theme5"
            android.content.SharedPreferences$Editor r7 = r7.putInt(r1, r0)
            r7.apply()
            r6.p()
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.omarea.vtools.activities.ActivityOtherSettings.onThemeClick(android.view.View):void");
    }

    public final void p() {
        a.vj1 vj1Var = a.ql1.f470a;
        a.ql1.b = null;
        android.graphics.Bitmap bitmap = a.wr.f;
        a.wr.f = null;
        a.wr.h.clear();
        a.wr.f = null;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityOtherSettings.class);
        intent.setFlags(268468224);
        startActivity(intent);
        finish();
    }
}
