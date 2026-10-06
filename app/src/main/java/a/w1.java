package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w1 implements a.i41, a.c50, a.bt, a.y60 {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ w1(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // a.y60
    public void a(java.util.ArrayList arrayList, boolean[] zArr) {
        java.lang.Object r3 = null;
        java.lang.String str;
        int i = this.c;
        int i2 = 1;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.lang.String str2 = ((a.ng1) a.qv.e2(arrayList)).c;
                a.wv.s(str2);
                ((a.bp0) obj).i(str2);
                return;
            case 1:
                if (!arrayList.isEmpty()) {
                    ((a.s6) obj).a(((a.ng1) a.qv.e2(arrayList)).c);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                if (((zArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                    ((a.r6) obj).a(zArr);
                    return;
                }
                return;
            case 3:
                if (arrayList.size() > 0) {
                    a.ng1 ng1Var = (a.ng1) a.qv.e2(arrayList);
                    com.omarea.vtools.activities.ActivityImg activityImg = (com.omarea.vtools.activities.ActivityImg) obj;
                    a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityImg.l;
                    activityImg.getClass();
                    int i3 = a.x60.f681a;
                    java.lang.String string = activityImg.getString(2131952528);
                    a.wv.v(string, "getString(R.string.img_export_confirm)");
                    java.lang.String string2 = activityImg.getString(2131952529);
                    a.wv.v(string2, "getString(R.string.img_export_warn)");
                    java.lang.CharSequence charSequence = ng1Var.f381a;
                    a.fs1.i(activityImg, string, a.ai1.l(new java.lang.Object[]{charSequence, charSequence}, 2, string2, "format(format, *args)"), new a.xa(activityImg, r3, ng1Var), null);
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.ng1 ng1Var2 = (a.ng1) a.qv.g2(arrayList);
                if (ng1Var2 != null) {
                    a.p30 p30Var = (a.p30) obj;
                    java.lang.String str3 = ng1Var2.c;
                    if (str3 != null) {
                        java.util.LinkedHashMap linkedHashMap = a.b81.e;
                        p30Var.getClass();
                        p30Var.a();
                        android.app.Activity activity = p30Var.f33a;
                        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(2131558537, (android.view.ViewGroup) null);
                        android.view.View findViewById = inflate.findViewById(2131362413);
                        a.wv.v(findViewById, "dialog.findViewById(R.id.dialog_text)");
                        ((android.widget.TextView) findViewById).setText(activity.getString(2131952231));
                        int i4 = a.x60.f681a;
                        p30Var.c = a.fs1.m(activity, inflate, false);
                        a.pm pmVar = new a.pm(new a.qk(p30Var.c));
                        java.lang.Process obj2 = (Process) pmVar.e;
                        if (((java.lang.Process) obj2) == null) {
                            try {
                                if (((java.lang.Process) obj2) == null) {
                                    pmVar.e = a.wv.l0(a.wv.s0(false));
                                }
                                new java.lang.Thread(new a.pp(pmVar, r3)).start();
                                new java.lang.Thread(new a.pp(pmVar, i2)).start();
                                java.lang.Object obj3 = pmVar.d;
                                ((android.os.Handler) obj3).sendMessage(((android.os.Handler) obj3).obtainMessage(0, java.lang.Boolean.TRUE));
                            } catch (java.lang.Exception unused) {
                                android.os.Handler handler = (android.os.Handler) pmVar.d;
                                handler.sendMessage(handler.obtainMessage(0, java.lang.Boolean.FALSE));
                            }
                        }
                        java.lang.Process process = (java.lang.Process) pmVar.e;
                        if (process == null) {
                            android.os.Handler handler2 = (android.os.Handler) pmVar.d;
                            handler2.handleMessage(handler2.obtainMessage(-1));
                        } else {
                            java.io.OutputStream outputStream = process.getOutputStream();
                            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
                            a.wv.v(forName, "forName(\"UTF-8\")");
                            byte[] bytes = "\n\n".getBytes(forName);
                            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                            outputStream.write(bytes);
                            java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName("UTF-8");
                            a.wv.v(forName2, "forName(\"UTF-8\")");
                            byte[] bytes2 = str3.getBytes(forName2);
                            a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
                            outputStream.write(bytes2);
                            java.nio.charset.Charset forName3 = java.nio.charset.Charset.forName("UTF-8");
                            a.wv.v(forName3, "forName(\"UTF-8\")");
                            byte[] bytes3 = "\n\n".getBytes(forName3);
                            a.wv.v(bytes3, "this as java.lang.String).getBytes(charset)");
                            outputStream.write(bytes3);
                            outputStream.flush();
                        }
                        pmVar.K();
                        return;
                    }
                    return;
                }
                return;
            default:
                java.lang.String str4 = ((a.ng1) a.qv.e2(arrayList)).c;
                a.wv.s(str4);
                java.lang.String str5 = a.vx0.E;
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File("/vendor/etc/thermal/".concat(str4)));
                    int available = fileInputStream.available();
                    byte[] bArr = new byte[available];
                    fileInputStream.read(bArr);
                    byte[] bArr2 = new byte[available];
                    int i5 = 0;
                    for (int i6 = 0; i6 < available; i6++) {
                        byte b = bArr[i6];
                        int i7 = b & 255;
                        if (i7 > 31 && i7 <= 122) {
                            b = (byte) ((((i7 + 59) - (i5 % 10)) % 91) + 32);
                        }
                        bArr2[i6] = b;
                        i5 = bArr[i6] == 10 ? 0 : i5 + 1;
                    }
                    str = new java.lang.String(bArr2);
                } catch (java.lang.Exception unused2) {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X("温控配置解析失败", 0);
                    return;
                } else {
                    int i8 = a.x60.f681a;
                    a.v70 v70Var = (a.v70) obj;
                    a.fs1.i(v70Var.f626a, "确定切换到该配置？", str, new a.xa(str4, 15, v70Var), null);
                    return;
                }
        }
    }

    public void b() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return;
            default:
                a.jo0 jo0Var = (a.jo0) this.d;
                jo0Var.u0.p();
                a.kk0 d = jo0Var.d();
                if (d != null) {
                    d.finish();
                    return;
                }
                return;
        }
    }

    public boolean c(a.j41 j41Var) {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.krscript.model.KrScriptActionHandler krScriptActionHandler = ((a.a2) obj).Y;
                if (krScriptActionHandler == null) {
                    return false;
                }
                return krScriptActionHandler.openFileChooser(j41Var);
            case 1:
                com.omarea.vtools.activities.ActionPageOnline actionPageOnline = (com.omarea.vtools.activities.ActionPageOnline) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActionPageOnline.p;
                if (actionPageOnline.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    actionPageOnline.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
                    android.widget.Toast.makeText(actionPageOnline, actionPageOnline.getString(2131952777), 1).show();
                } else {
                    try {
                        android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
                        intent.setType("*/*");
                        intent.addCategory("android.intent.category.OPENABLE");
                        actionPageOnline.startActivityForResult(intent, actionPageOnline.n);
                        actionPageOnline.m = j41Var;
                        return true;
                    } catch (java.lang.Exception unused) {
                    }
                }
                return false;
            default:
                com.omarea.vtools.activities.ActivityAddinOnline activityAddinOnline = (com.omarea.vtools.activities.ActivityAddinOnline) obj;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAddinOnline.g;
                if (activityAddinOnline.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    activityAddinOnline.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
                    android.widget.Toast.makeText(activityAddinOnline, activityAddinOnline.getString(2131952777), 1).show();
                } else {
                    try {
                        android.content.Intent intent2 = new android.content.Intent("android.intent.action.GET_CONTENT");
                        intent2.setType("*/*");
                        intent2.addCategory("android.intent.category.OPENABLE");
                        activityAddinOnline.startActivityForResult(intent2, activityAddinOnline.f);
                        activityAddinOnline.e = j41Var;
                        return true;
                    } catch (java.lang.Exception unused2) {
                    }
                }
                return false;
        }
    }

    @Override // a.bt
    public void d() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case 1:
                a.gk0 gk0Var = (a.gk0) obj;
                a.ek0 ek0Var = gk0Var.K;
                if ((ek0Var == null ? null : ek0Var.f125a) != null) {
                    android.view.View view = ek0Var == null ? null : ek0Var.f125a;
                    gk0Var.c().f125a = null;
                    view.clearAnimation();
                }
                gk0Var.c().b = null;
                return;
            default:
                ((a.hi1) obj).a();
                return;
        }
    }
}
