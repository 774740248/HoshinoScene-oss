package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ya implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ya(int i, java.lang.Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Object obj = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.vtools.activities.ActivityImg activityImg = (com.omarea.vtools.activities.ActivityImg) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityImg.l;
                a.wv.w(activityImg, "this$0");
                if (android.os.Build.VERSION.SDK_INT < 30) {
                    android.content.Intent intent = new android.content.Intent(activityImg, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityFileSelector.class);
                    intent.putExtra("extension", "img");
                    activityImg.startActivityForResult(intent, 1);
                    return;
                } else {
                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.GET_CONTENT");
                    intent2.setType("*/*");
                    intent2.addCategory("android.intent.category.OPENABLE");
                    activityImg.startActivityForResult(intent2, 1);
                    return;
                }
            case 1:
                com.omarea.vtools.activities.ActivityOplusORMS activityOplusORMS = (com.omarea.vtools.activities.ActivityOplusORMS) obj;
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityOplusORMS.i;
                a.wv.w(activityOplusORMS, "this$0");
                java.lang.String str = a.v21.b;
                a.wv.v(str, "CloudFile");
                a.gy.h(str);
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.X("OK ^_^", 0);
                activityOplusORMS.finishAfterTransition();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityPowerStat.D;
                ((com.omarea.vtools.activities.ActivityPowerStat) obj).q().invalidate();
                return;
            case 3:
                com.omarea.vtools.activities.ActivityQuickStart activityQuickStart = (com.omarea.vtools.activities.ActivityQuickStart) obj;
                a.wv.w(activityQuickStart, "$this_run");
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityQuickStart.f;
                activityQuickStart.b().setText(activityQuickStart.getString(2131952367));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.g2 g2Var = (a.g2) obj;
                a.wv.w(g2Var, "this$0");
                com.omarea.vtools.activities.ActivityQuickStart activityQuickStart2 = (com.omarea.vtools.activities.ActivityQuickStart) ((java.lang.ref.WeakReference) g2Var.e).get();
                if (activityQuickStart2 != null) {
                    a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityQuickStart.f;
                    activityQuickStart2.c();
                    return;
                }
                return;
            case 5:
                a.v60 v60Var = (a.v60) obj;
                int i2 = a.u30.h;
                a.wv.w(v60Var, "$dialog");
                try {
                    v60Var.a();
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.v40 v40Var = (a.v40) obj;
                a.wv.w(v40Var, "this$0");
                android.widget.EditText editText = v40Var.m;
                if (editText == null) {
                    a.wv.M1("editModel");
                    throw null;
                }
                android.text.Editable text = editText.getText();
                a.wv.v(text, "editModel.text");
                java.lang.String obj2 = a.yi1.F2(text).toString();
                android.widget.EditText editText2 = v40Var.n;
                if (editText2 == null) {
                    a.wv.M1("editBrand");
                    throw null;
                }
                android.text.Editable text2 = editText2.getText();
                a.wv.v(text2, "editBrand.text");
                java.lang.String obj3 = a.yi1.F2(text2).toString();
                android.widget.EditText editText3 = v40Var.o;
                if (editText3 == null) {
                    a.wv.M1("editProductName");
                    throw null;
                }
                android.text.Editable text3 = editText3.getText();
                a.wv.v(text3, "editProductName.text");
                java.lang.String obj4 = a.yi1.F2(text3).toString();
                android.widget.EditText editText4 = v40Var.p;
                if (editText4 == null) {
                    a.wv.M1("editDevice");
                    throw null;
                }
                android.text.Editable text4 = editText4.getText();
                a.wv.v(text4, "editDevice.text");
                java.lang.String obj5 = a.yi1.F2(text4).toString();
                android.widget.EditText editText5 = v40Var.q;
                if (editText5 == null) {
                    a.wv.M1("editManufacturer");
                    throw null;
                }
                android.text.Editable text5 = editText5.getText();
                a.wv.v(text5, "editManufacturer.text");
                java.lang.String obj6 = a.yi1.F2(text5).toString();
                int length = obj2.length();
                a.p5 p5Var = v40Var.f622a;
                if (length <= 0 && obj3.length() <= 0 && obj4.length() <= 0 && obj5.length() <= 0 && obj6.length() <= 0) {
                    android.widget.Toast.makeText(p5Var, p5Var.getString(2131952187), 0).show();
                    return;
                }
                java.lang.String str2 = v40Var.b;
                if (!a.wv.e(a.v40.a(str2, "false"), "true")) {
                    java.lang.String str3 = android.os.Build.BRAND;
                    a.wv.v(str3, "BRAND");
                    a.wv.A1(v40Var.c, str3);
                    java.lang.String str4 = android.os.Build.MODEL;
                    a.wv.v(str4, "MODEL");
                    a.wv.A1(v40Var.d, str4);
                    java.lang.String str5 = android.os.Build.PRODUCT;
                    a.wv.v(str5, "PRODUCT");
                    a.wv.A1(v40Var.e, str5);
                    java.lang.String str6 = android.os.Build.DEVICE;
                    a.wv.v(str6, "DEVICE");
                    a.wv.A1(v40Var.f, str6);
                    java.lang.String str7 = android.os.Build.MANUFACTURER;
                    a.wv.v(str7, "MANUFACTURER");
                    a.wv.A1(v40Var.g, str7);
                    a.wv.A1(str2, "true");
                }
                if (!a.b20.D0()) {
                    a.cp cpVar2 = com.omarea.Scene.c;
                    java.lang.String string = p5Var.getString(2131952861);
                    a.wv.v(string, "context.getString(R.string.magisk_uninstalled)");
                    a.fs1.X(string, 0);
                    return;
                }
                if (obj3.length() == 0) {
                    obj3 = null;
                }
                a.b20.n1(v40Var.h, obj3);
                a.b20.n1(v40Var.i, obj4.length() == 0 ? null : obj4);
                a.b20.n1(v40Var.j, obj2.length() == 0 ? null : obj2);
                if (obj6.length() == 0) {
                    obj6 = null;
                }
                a.b20.n1(v40Var.k, obj6);
                a.b20.n1(v40Var.l, obj5.length() != 0 ? obj5 : null);
                if (obj4.length() > 0) {
                    java.lang.String str8 = android.os.Build.PRODUCT;
                    if (a.gy.n("/system/etc/device_features/" + str8 + ".xml") && !a.wv.e(obj2, str8)) {
                        a.b20.d1(a.ai1.h("/system/etc/device_features/", obj4, ".xml"), "/system/etc/device_features/" + str8 + ".xml");
                    }
                }
                android.widget.Toast.makeText(p5Var, p5Var.getString(2131952182), 0).show();
                return;
            case 7:
                a.qo0 qo0Var = ((a.f60) obj).f;
                if (qo0Var != null) {
                    qo0Var.b();
                    return;
                }
                return;
            default:
                a.jo0 jo0Var = (a.jo0) obj;
                a.gu0[] gu0VarArr6 = a.jo0.v0;
                a.wv.w(jo0Var, "this$0");
                jo0Var.W(new a.wn0(jo0Var, 7));
                return;
        }
    }
}
