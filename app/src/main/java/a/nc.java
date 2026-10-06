package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class nc implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityOtherSettings d;

    public /* synthetic */ nc(int i, com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings) {
        this.c = i;
        this.d = activityOtherSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable th;
        java.lang.String lt0Var;
        int i = this.c;
        int i2 = 2;
        com.omarea.vtools.activities.ActivityOtherSettings activityOtherSettings = this.d;
        boolean z = true;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.w(activityOtherSettings, "this$0");
                activityOtherSettings.finishAffinity();
                java.lang.System.exit(0);
                throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.w(activityOtherSettings, "this$0");
                a.ze1 ze1Var = new a.ze1(activityOtherSettings);
                java.lang.String f = a.tg1.f();
                if (f.length() > 0) {
                    java.lang.String concat = a.tg1.i().concat("/sync-download");
                    a.ne1 ne1Var = new a.ne1(f, 2);
                    a.lt0 lt0Var2 = new a.lt0();
                    ne1Var.i(lt0Var2);
                    a.lt0 h = a.qr0.h(ze1Var, concat, lt0Var2);
                    if (h != null) {
                        java.util.Iterator i3 = h.i();
                        a.wv.v(i3, "response.keys()");
                        while (i3.hasNext()) {
                            java.lang.String str = (java.lang.String) i3.next();
                            a.lt0 a2 = (lt0) h.a(str);
                            if ((a2 instanceof a.lt0) && str != null) {
                                switch (str.hashCode()) {
                                    case -1274708295:
                                        boolean z2 = z;
                                        if (str.equals("fields")) {
                                            a.lt0 lt0Var3 = (a.lt0) a2;
                                            java.util.Iterator i4 = lt0Var3.i();
                                            a.wv.v(i4, "subItem.keys()");
                                            while (i4.hasNext()) {
                                                java.lang.String str2 = (java.lang.String) i4.next();
                                                java.lang.Object a3 = lt0Var3.a(str2);
                                                try {
                                                    if (a.wv.e(str2, "refresh")) {
                                                        new a.xa1().f((java.lang.String) a3);
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    a.b20.I(th);
                                                }
                                            }
                                        }
                                        z = z2;
                                        continue;
                                    case 107868:
                                        if (str.equals("map")) {
                                            a.lt0 lt0Var4 = (a.lt0) a2;
                                            java.util.Iterator i5 = lt0Var4.i();
                                            a.wv.v(i5, "subItem.keys()");
                                            while (i5.hasNext()) {
                                                java.lang.String str3 = (java.lang.String) i5.next();
                                                a.lt0 a4 = (lt0) lt0Var4.a(str3);
                                                try {
                                                    if (a.wv.e(str3, "scenes")) {
                                                        a.au auVar = new a.au(ze1Var.e, 2);
                                                        java.util.Iterator i6 = ((a.lt0) a4).i();
                                                        a.wv.v(i6, "value as JSONObject).keys()");
                                                        while (i6.hasNext()) {
                                                            java.lang.String str4 = (java.lang.String) i6.next();
                                                            try {
                                                                java.util.List y2 = a.yi1.y2(((a.lt0) a4).h(str4), new java.lang.String[]{","});
                                                                com.omarea.model.SceneConfigInfo c = auVar.c(str4);
                                                                c.freeze = y2.contains("F");
                                                                c.gpsOn = y2.contains("L");
                                                                auVar.o(c);
                                                            } catch (java.lang.Throwable th2) {
                                                                th = th2;
                                                                a.b20.I(th);
                                                            }
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    case 114089:
                                        if (str.equals("spf")) {
                                            a.lt0 lt0Var5 = (a.lt0) a2;
                                            java.util.Iterator i7 = lt0Var5.i();
                                            a.wv.v(i7, "subItem.keys()");
                                            while (i7.hasNext()) {
                                                java.lang.String str5 = (java.lang.String) i7.next();
                                                a.lt0 f2 = lt0Var5.f(str5);
                                                a.wv.v(str5, "spf");
                                                a.cp cpVar = com.omarea.Scene.c;
                                                android.content.SharedPreferences.Editor edit = a.fs1.t().getSharedPreferences(str5, 0).edit();
                                                java.util.Iterator i8 = f2.i();
                                                a.wv.v(i8, "obj.keys()");
                                                while (i8.hasNext()) {
                                                    java.lang.String str6 = (java.lang.String) i8.next();
                                                    java.lang.Number a5 = (Number) f2.a(str6);
                                                    if ((String) ((String) ((String) ((String) (String) ((String) a5 instanceof java.lang.String))))) {
                                                        edit.putString(str6, (java.lang.String) (String) (String) (String) (String) ((((a5)))));
                                                    } else if ((Boolean) ((Boolean) ((Boolean) ((Boolean) (Boolean) ((Boolean) a5 instanceof java.lang.Boolean))))) {
                                                        edit.putBoolean(str6, ((java.lang.Boolean) (Boolean) (Boolean) (Boolean) (Boolean) ((((a5))))).booleanValue());
                                                    } else if (a5 instanceof java.lang.Integer) {
                                                        edit.putInt(str6, ((java.lang.Number) a5).intValue());
                                                    } else if (a5 instanceof java.lang.Long) {
                                                        edit.putLong(str6, ((java.lang.Number) a5).longValue());
                                                    } else if (a5 instanceof java.lang.Float) {
                                                        edit.putFloat(str6, ((java.lang.Number) a5).floatValue());
                                                    }
                                                }
                                                edit.apply();
                                            }
                                            break;
                                        }
                                        break;
                                    case 93090393:
                                        if (str.equals("array")) {
                                            a.lt0 lt0Var6 = (a.lt0) a2;
                                            java.util.Iterator i9 = lt0Var6.i();
                                            a.wv.v(i9, "subItem.keys()");
                                            while (i9.hasNext()) {
                                                java.lang.String str7 = (java.lang.String) i9.next();
                                                a.jt0 a6 = (jt0) lt0Var6.a(str7);
                                                if (str7 != null) {
                                                    try {
                                                        int hashCode = str7.hashCode();
                                                        if (hashCode != -873090890) {
                                                            if (hashCode == 97486081) {
                                                                str7.equals("uninstalled");
                                                            } else if (hashCode == 435013600 && str7.equals("fas_whitelist")) {
                                                                a.nk nkVar = new a.wc0().c;
                                                                java.lang.Object[] n = a.ze1.n((a.jt0) a6);
                                                                java.util.ArrayList arrayList = new java.util.ArrayList(n.length);
                                                                for (java.lang.Object obj : n) {
                                                                    arrayList.add(java.lang.String.valueOf(obj));
                                                                }
                                                                nkVar.getClass();
                                                                java.util.Iterator it = arrayList.iterator();
                                                                while (it.hasNext()) {
                                                                    ((java.util.HashMap) nkVar.e).put((java.lang.String) it.next(), "1");
                                                                }
                                                                nkVar.L();
                                                            }
                                                        } else if (str7.equals("fas_blacklist")) {
                                                            a.nk nkVar2 = new a.wc0().b;
                                                            java.lang.Object[] n2 = a.ze1.n((a.jt0) a6);
                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList(n2.length);
                                                            for (java.lang.Object obj2 : n2) {
                                                                arrayList2.add(java.lang.String.valueOf(obj2));
                                                            }
                                                            nkVar2.getClass();
                                                            java.util.Iterator it2 = arrayList2.iterator();
                                                            while (it2.hasNext()) {
                                                                ((java.util.HashMap) nkVar2.e).put((java.lang.String) it2.next(), "1");
                                                            }
                                                            nkVar2.L();
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        a.b20.I(th4);
                                                    }
                                                }
                                                z = true;
                                            }
                                            break;
                                        } else {
                                            continue;
                                        }
                                }
                                z = true;
                            }
                        }
                    }
                }
                a.q10.A("custom-cache");
                java.lang.System.exit(0);
                throw new java.lang.RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            default:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityOtherSettings.t;
                a.wv.w(activityOtherSettings, "this$0");
                a.ze1 ze1Var2 = new a.ze1(activityOtherSettings);
                java.lang.String f3 = a.tg1.f();
                if (f3.length() > 0) {
                    a.au auVar2 = new a.au(ze1Var2.e, 2);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.util.Iterator it3 = auVar2.d().iterator();
                    while (true) {
                        java.lang.String str8 = "";
                        if (it3.hasNext()) {
                            java.lang.String str9 = (java.lang.String) it3.next();
                            a.wv.v(str9, "app");
                            java.lang.String str10 = (java.lang.String) hashMap.get(str9);
                            if (str10 != null) {
                                str8 = str10;
                            }
                            hashMap.put(str9, str8.concat("F,"));
                        } else {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            try {
                                android.database.sqlite.SQLiteDatabase readableDatabase = auVar2.getReadableDatabase();
                                android.database.Cursor rawQuery = readableDatabase.rawQuery("select * from scene_config3 where gps_on == 1", null);
                                while (rawQuery.moveToNext()) {
                                    arrayList3.add(rawQuery.getString(0));
                                }
                                rawQuery.close();
                                readableDatabase.close();
                            } catch (java.lang.Exception unused) {
                            }
                            java.util.Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                java.lang.String str11 = (java.lang.String) it4.next();
                                a.wv.v(str11, "app");
                                java.lang.String str12 = (java.lang.String) hashMap.get(str11);
                                if (str12 == null) {
                                    str12 = "";
                                }
                                hashMap.put(str11, str12.concat("L,"));
                            }
                            java.lang.String concat2 = a.tg1.i().concat("/sync-upload");
                            a.hc1 hc1Var = new a.hc1(f3, hashMap, ze1Var2, i2);
                            a.lt0 lt0Var7 = new a.lt0();
                            hc1Var.i(lt0Var7);
                            a.lt0 h2 = a.qr0.h(ze1Var2, concat2, lt0Var7);
                            if (h2 != null && (lt0Var = h2.toString()) != null && a.yi1.g2(lt0Var, "true")) {
                                a.cp cpVar2 = com.omarea.Scene.c;
                                a.fs1.X("^_^", 0);
                                return;
                            }
                        }
                    }
                }
                a.cp cpVar3 = com.omarea.Scene.c;
                a.fs1.X(">_<!", 0);
                return;
        }
    }
}
