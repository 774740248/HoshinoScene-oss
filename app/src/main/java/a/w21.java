package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class w21 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f649a;
    public final java.lang.String b;

    public w21(android.content.Context context, int i) {
        if (i == 2) {
            a.wv.w(context, "context");
            this.f649a = context;
            this.b = context.getPackageName();
        } else if (i != 3) {
            a.wv.w(context, "context");
            this.f649a = context;
            this.b = "objects/";
        } else {
            a.wv.w(context, "context");
            this.f649a = context;
            this.b = context.getPackageName();
        }
    }

    public final android.content.Intent a() {
        android.content.Intent intent;
        java.lang.String str = this.b;
        try {
            if (a.yi1.g2(str, "/")) {
                intent = new android.content.Intent("android.intent.action.VIEW");
                java.util.List y2 = a.yi1.y2(str, new java.lang.String[]{"/"});
                java.lang.String str2 = (java.lang.String) a.qv.e2(y2);
                java.lang.String str3 = (java.lang.String) a.qv.l2(y2);
                if (a.yi1.B2(str3, ".")) {
                    str3 = str2 + str3;
                }
                intent.setClassName(str2, str3);
            } else {
                intent = new android.content.Intent(str);
            }
            intent.addFlags(268435456);
            return intent;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        a.wv.w(str, "configFile");
        java.lang.String str2 = a.pe0.f434a;
        return a.pe0.d(this.f649a, a.ai1.j(new java.lang.StringBuilder(), this.b, str));
    }

    public final java.io.Serializable c(java.lang.String str) {
        java.io.ObjectInputStream objectInputStream;
        java.lang.Throwable th;
        java.io.FileInputStream fileInputStream;
        a.wv.w(str, "configFile");
        java.io.File file = new java.io.File(b(str));
        if (file.exists()) {
            try {
                fileInputStream = new java.io.FileInputStream(file);
                try {
                    objectInputStream = new java.io.ObjectInputStream(fileInputStream);
                    try {
                        java.io.Serializable serializable = (java.io.Serializable) objectInputStream.readObject();
                        try {
                            objectInputStream.close();
                            fileInputStream.close();
                        } catch (java.lang.Exception unused) {
                        }
                        return serializable;
                    } catch (java.lang.Exception unused2) {
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.lang.Exception unused3) {
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (java.lang.Exception unused4) {
                                throw th;
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Exception unused5) {
                    objectInputStream = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                }
            } catch (java.lang.Exception unused6) {
                fileInputStream = null;
                objectInputStream = null;
            } catch (java.lang.Throwable th4) {
                objectInputStream = null;
                th = th4;
                fileInputStream = null;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [a.ng1, java.lang.Object] */
    public final void d(a.mc1 mc1Var) {
        java.lang.String str;
        a.wv.w(mc1Var, "file");
        java.lang.String str2 = mc1Var.c;
        java.lang.String str3 = (java.lang.String) a.qv.m2(a.yi1.y2(mc1Var.b, new java.lang.String[]{"."}));
        if (str3 != null) {
            java.util.Locale locale = java.util.Locale.getDefault();
            a.wv.v(locale, "getDefault()");
            str = str3.toLowerCase(locale);
            a.wv.v(str, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str = null;
        }
        int i = 0;
        if (a.wv.e(str, "1") && a.yi1.h2(str2, ".apk.1", false)) {
            str = "apk";
        }
        boolean d2 = a.qv.d2(a.oe0.f408a, str);
        android.content.Context context = this.f649a;
        if (d2) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityEditor.class);
            intent.putExtra("file", str2);
            intent.putExtra("rootMode", true);
            context.startActivity(intent);
            return;
        }
        if (a.wv.e(str, "apk")) {
            if (a.yi1.B2(str2, "/data/app")) {
                a.cp cpVar = com.omarea.Scene.c;
                java.lang.String string = context.getString(2131952276);
                a.wv.v(string, "context.getString(R.string.file_open_no_action)");
                a.fs1.X(string, 0);
                return;
            }
            int i2 = a.x60.f681a;
            java.lang.String string2 = context.getString(2131952270);
            a.wv.v(string2, "context.getString(R.string.file_open_install_apk)");
            java.lang.String string3 = context.getString(2131952271, mc1Var.b);
            a.wv.v(string3, "context.getString(R.stri…stall_apk_msg, file.name)");
            a.fs1.i(context, string2, string3, new a.so(this, 6, str2), null);
            return;
        }
        if (!a.wv.e(str, "apks")) {
            if (a.qv.d2(a.oe0.b, str)) {
                android.net.Uri uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                a.wv.v(uri, "EXTERNAL_CONTENT_URI");
                g(str2, uri, "image/*");
                return;
            }
            if (a.qv.d2(a.oe0.c, str)) {
                android.net.Uri uri2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                a.wv.v(uri2, "EXTERNAL_CONTENT_URI");
                g(str2, uri2, "video/*");
                return;
            } else {
                if (a.qv.d2(a.oe0.d, str)) {
                    e(str2, "audio/*");
                    return;
                }
                if (a.qv.d2(a.oe0.e, str)) {
                    e(str2, "application/*");
                    return;
                } else if (a.qv.d2(a.oe0.f, str)) {
                    e(str2, "application/zip");
                    return;
                } else {
                    e(str2, "*/*");
                    return;
                }
            }
        }
        try {
            a.tk e = new a.l1(context, 5).e(str2);
            if (((java.util.ArrayList) e.e).isEmpty()) {
                a.cp cpVar2 = com.omarea.Scene.c;
                java.lang.String string4 = context.getString(2131952268);
                a.wv.v(string4, "context.getString(R.string.file_open_apks_empty)");
                a.fs1.X(string4, 0);
                return;
            }
            java.util.ArrayList<a.fl> arrayList = (java.util.ArrayList) e.e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
            for (a.fl flVar : arrayList) {
                ng1 obj = new ng1();
                /* TODO: jadx type unresolved, defaulted to Object */
                java.lang.String str4 = flVar.b;
                if (str4 == null) {
                    str4 = flVar.f153a;
                }
                obj.f381a = str4;
                obj.b = flVar.c;
                obj.c = flVar.f153a;
                arrayList2.add(obj);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
            a.e70 e70Var = new a.e70(context, arrayList3, arrayList3, true);
            java.lang.String string5 = context.getString(2131952272);
            a.wv.v(string5, "context.getString(R.string.file_open_install_apks)");
            e70Var.j = string5;
            e70Var.e();
            java.lang.String string6 = context.getString(2131952273);
            a.wv.v(string6, "context.getString(R.stri…le_open_install_apks_msg)");
            e70Var.k = string6;
            e70Var.d();
            e70Var.l = new a.be0(this, i, str2);
            e70Var.c();
        } catch (java.lang.Exception unused) {
            a.cp cpVar3 = com.omarea.Scene.c;
            java.lang.String string7 = context.getString(2131952269);
            a.wv.v(string7, "context.getString(R.stri…le_open_apks_read_failed)");
            a.fs1.X(string7, 0);
        }
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "absolutePath");
        boolean g2 = a.yi1.g2(str, "/Android/data/");
        android.content.Context context = this.f649a;
        if (g2 || a.yi1.g2(str, "/Android/data/")) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = context.getString(2131952267);
            a.wv.v(string, "context.getString(R.stri…pen_android_data_blocked)");
            a.fs1.X(string, 0);
            return;
        }
        try {
            android.net.Uri b = androidx.core.content.FileProvider.getUriForFile(context, this.b + ".fileprovider", new java.io.File(str));
            a.wv.v(b, "uri");
            f(b, str2);
        } catch (java.lang.Exception unused) {
            a.ai1.r(context, 2131952277, context, 0);
        }
    }

    public final void f(android.net.Uri uri, java.lang.String str) {
        android.content.Context context = this.f649a;
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str);
            intent.addFlags(268435456);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (java.lang.Exception unused) {
            a.ai1.r(context, 2131952277, context, 0);
        }
    }

    public final void g(java.lang.String str, android.net.Uri uri, java.lang.String str2) {
        android.net.Uri uri2 = null;
        try {
            android.database.Cursor query = this.f649a.getContentResolver().query(uri, new java.lang.String[]{"_id"}, "_data = ?", new java.lang.String[]{str}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        android.net.Uri withAppendedId = android.content.ContentUris.withAppendedId(uri, query.getLong(0));
                        a.wv.z(query, null);
                        uri2 = withAppendedId;
                    } else {
                        a.wv.z(query, null);
                    }
                } finally {
                }
            }
        } catch (java.lang.Exception unused) {
        }
        if (uri2 != null) {
            f(uri2, str2);
        } else {
            e(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0061 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #7 {Exception -> 0x0064, blocks: (B:44:0x005c, B:39:0x0061), top: B:43:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.io.Serializable r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "configFile"
            a.wv.w(r5, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r5 = r3.b(r5)
            r0.<init>(r5)
            java.io.File r5 = r0.getParentFile()
            boolean r1 = r5.exists()
            if (r1 != 0) goto L1b
            r5.mkdirs()
        L1b:
            r5 = 1
            if (r4 == 0) goto L65
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3f
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a
            r0.writeObject(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r0.close()     // Catch: java.lang.Exception -> L32
            r2.close()     // Catch: java.lang.Exception -> L32
        L32:
            return r5
        L33:
            r4 = move-exception
        L34:
            r1 = r0
            goto L5a
        L36:
            r1 = r2
            goto L40
        L38:
            r4 = move-exception
            goto L5a
        L3a:
            r0 = r1
            goto L36
        L3c:
            r4 = move-exception
            r2 = r1
            goto L5a
        L3f:
            r0 = r1
        L40:
            android.content.Context r4 = r3.f649a     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "存储配置失败！"
            r2 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r2)     // Catch: java.lang.Throwable -> L57
            r4.show()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.lang.Exception -> L56
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Exception -> L56
        L56:
            return r2
        L57:
            r4 = move-exception
            r2 = r1
            goto L34
        L5a:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.lang.Exception -> L64
        L5f:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.lang.Exception -> L64
        L64:
            throw r4
        L65:
            boolean r4 = r0.exists()
            if (r4 == 0) goto L6e
            r0.delete()
        L6e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.w21.h(java.io.Serializable, java.lang.String):boolean");
    }

    public final void i(java.lang.String str) {
        java.lang.String parent;
        a.wv.w(str, "absPath");
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            java.lang.String str2 = this.b;
            a.wv.v(str2, "packageName");
            if (a.yi1.g2(str, str2)) {
                file.setReadable(true, false);
                file.setExecutable(true, false);
                file.setWritable(true, false);
                if (a.yi1.h2(str, str2, false) || (parent = file.getParent()) == null) {
                    return;
                }
                i(parent);
            }
        }
    }

    public final boolean j() {
        boolean g2;
        android.content.Context context = this.f649a;
        java.lang.String str = this.b;
        if (a.yi1.B2(str, "am ")) {
            a.q10 q10Var = a.q10.f457a;
            return a.yi1.g2(a.q10.l(str), "Start");
        }
        try {
            context.startActivity(a());
            return true;
        } catch (java.lang.SecurityException unused) {
            if (a.yi1.g2(str, "/")) {
                java.lang.String str2 = "am start-activity -W -n '" + str + "'";
                a.wv.w(str2, "cmd");
                a.q10 q10Var2 = a.q10.f457a;
                g2 = a.yi1.g2(a.q10.k(2000L, str2), "ok");
            } else {
                java.lang.String str3 = "am start-activity -W -a '" + str + "'";
                a.wv.w(str3, "cmd");
                a.q10 q10Var3 = a.q10.f457a;
                g2 = a.yi1.g2(a.q10.k(2000L, str3), "ok");
            }
            if (g2) {
                return true;
            }
            a.ai1.r(context, 2131952738, context, 0);
            return false;
        } catch (java.lang.Exception unused2) {
            a.ai1.r(context, 2131952738, context, 0);
            return false;
        }
    }

    public w21(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        a.wv.w(str, "activity");
        this.f649a = context;
        this.b = str;
    }
}
