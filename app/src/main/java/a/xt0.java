package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xt0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f693a;
    public final java.lang.String b;

    public /* synthetic */ xt0(android.content.Context context, java.lang.String str) {
        this.f693a = context;
        this.b = str;
    }

    public static a.lt0 a(a.xt0 xt0Var, a.lt0 lt0Var) {
        if (!a.wv.e("booster_config", "booster_config")) {
            return lt0Var;
        }
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "originData.toString()");
        java.lang.String str = xt0Var.b;
        java.lang.String str2 = "ovrride_config";
        try {
            a.lt0 lt0Var3 = new a.lt0(lt0Var2);
            a.lt0 f = a.wv.e(str, "SmartP.db") ? lt0Var3 : a.wv.e(str, "default_cloud.db") ? lt0Var3.f("booster_config").f("params") : lt0Var3.f("params");
            e(f, new java.lang.String[]{"game_booster", "dynamic_fps_global"});
            if (f.f329a.containsKey("game_booster")) {
                a.lt0 f2 = f.f("game_booster");
                if (f2.f329a.containsKey("booster_config")) {
                    a.lt0 f3 = f2.f("booster_config");
                    java.util.LinkedHashMap linkedHashMap = f3.f329a;
                    g(f2, new java.lang.String[]{"cgame_enable"}, java.lang.Boolean.FALSE);
                    if (!linkedHashMap.containsKey("ovrride_config")) {
                        str2 = "scene_config";
                    }
                    if (linkedHashMap.containsKey(str2)) {
                        a.jt0 e = f3.e(str2);
                        int size = e.f269a.size();
                        for (int i = 0; i < size; i++) {
                            java.util.LinkedHashMap linkedHashMap2 = e.c(i).f329a;
                            java.util.Set keySet = linkedHashMap2.keySet();
                            a.wv.v(keySet, "item.keySet()");
                            for (java.lang.String str3 : (Iterable<java.lang.String>) a.qv.w2(keySet)) {
                                a.wv.v(str3, "key");
                                if (a.yi1.B2(str3, "dynamic_targetfps") || a.yi1.B2(str3, "dynamic_fps") || a.yi1.B2(str3, "dynamicfps_by_battery") || a.wv.e(str3, "PID_T") || a.wv.e(str3, "PID_M") || a.yi1.B2(str3, "PID_RE2_") || a.yi1.B2(str3, "execute_cmd_by_temp")) {
                                    linkedHashMap2.remove(str3);
                                }
                            }
                        }
                    }
                }
            }
            return lt0Var3;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static void d(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("name", str);
        contentValues.put("value", str2);
        long insert = sQLiteDatabase.insert("misc", null, contentValues);
        if (insert == -1) {
            android.util.Log.e("Database", "插入失败: ".concat(str));
            return;
        }
        android.util.Log.d("Database", "成功插入: " + str + ", ID: " + insert);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [a.qs0, a.ss0] */
    public static void e(a.lt0 lt0Var, java.lang.String[] strArr) {
        int length = strArr.length;
        java.util.LinkedHashMap linkedHashMap = lt0Var.f329a;
        if (length <= 1) {
            if (linkedHashMap.containsKey(strArr[0])) {
                linkedHashMap.remove(strArr[0]);
            }
        } else if (linkedHashMap.containsKey(strArr[0])) {
            java.lang.Object a2 = lt0Var.a(strArr[0]);
            if (a2 instanceof a.lt0) {
                e((a.lt0) a2, (java.lang.String[]) a.op.T1(strArr, (ss0) new a.qs0(1, strArr.length - 1, 1)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [a.qs0, a.ss0] */
    public static void g(a.lt0 lt0Var, java.lang.String[] strArr, java.lang.Boolean bool) {
        int length = strArr.length;
        java.util.LinkedHashMap linkedHashMap = lt0Var.f329a;
        if (length <= 1) {
            if (linkedHashMap.containsKey(strArr[0])) {
                lt0Var.m(bool, strArr[0]);
            }
        } else if (linkedHashMap.containsKey(strArr[0])) {
            java.lang.Object a2 = lt0Var.a(strArr[0]);
            if (a2 instanceof a.lt0) {
                g((a.lt0) a2, (java.lang.String[]) a.op.T1(strArr, (ss0) new a.qs0(1, strArr.length - 1, 1)), bool);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        if (r8.moveToNext() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r0 = r8.getString(0);
        a.wv.v(r0, "cursor.getString(0)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r8.moveToNext() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r8.close();
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.b
            java.lang.String r1 = "select rule_content from rules where rule_module = '"
            java.lang.String r2 = "select params from cloud_config where config_name = '"
            java.lang.String r3 = ""
            java.lang.String r4 = "default_cloud.db"
            boolean r4 = a.wv.e(r0, r4)     // Catch: java.lang.Exception -> L77
            if (r4 == 0) goto L15
            java.lang.String r8 = a.b20.K()     // Catch: java.lang.Exception -> L77
            goto L78
        L15:
            android.content.Context r4 = r7.f693a     // Catch: java.lang.Exception -> L77
            r5 = 0
            r6 = 0
            android.database.sqlite.SQLiteDatabase r4 = r4.openOrCreateDatabase(r0, r5, r6)     // Catch: java.lang.Exception -> L77
            java.lang.String r6 = "context.openOrCreateData…ntext.MODE_PRIVATE, null)"
            a.wv.v(r4, r6)     // Catch: java.lang.Exception -> L77
            java.lang.String r6 = "SmartP.db"
            boolean r0 = a.wv.e(r0, r6)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
            r0.<init>(r2)     // Catch: java.lang.Exception -> L77
            r0.append(r8)     // Catch: java.lang.Exception -> L77
            java.lang.String r8 = "' limit 0,1"
            r0.append(r8)     // Catch: java.lang.Exception -> L77
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L77
            goto L4d
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L77
            r0.<init>(r1)     // Catch: java.lang.Exception -> L77
            r0.append(r8)     // Catch: java.lang.Exception -> L77
            java.lang.String r8 = "' order by rule_version desc limit 0,1"
            r0.append(r8)     // Catch: java.lang.Exception -> L77
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L77
        L4d:
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L77
            android.database.Cursor r8 = r4.rawQuery(r8, r0)     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = "rawQuery(sql, arrayOf())"
            a.wv.v(r8, r0)     // Catch: java.lang.Exception -> L77
            boolean r0 = r8.moveToNext()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L71
        L5e:
            java.lang.String r0 = r8.getString(r5)     // Catch: java.lang.Exception -> L77
            java.lang.String r1 = "cursor.getString(0)"
            a.wv.v(r0, r1)     // Catch: java.lang.Exception -> L77
            boolean r1 = r8.moveToNext()     // Catch: java.lang.Exception -> L6f
            r3 = r0
            if (r1 != 0) goto L5e
            goto L71
        L6f:
            r3 = r0
            goto L77
        L71:
            r8.close()     // Catch: java.lang.Exception -> L77
            r4.close()     // Catch: java.lang.Exception -> L77
        L77:
            r8 = r3
        L78:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xt0.b(java.lang.String):java.lang.String");
    }

    public android.database.sqlite.SQLiteDatabase c() {
        android.database.sqlite.SQLiteDatabase openOrCreateDatabase = this.f693a.openOrCreateDatabase(this.b, 0, null);
        a.wv.v(openOrCreateDatabase, "context.openOrCreateData…ntext.MODE_PRIVATE, null)");
        return openOrCreateDatabase;
    }

    public boolean f(a.lt0 lt0Var, java.lang.String str) {
        java.lang.String str2 = this.b;
        boolean e = a.wv.e(str2, "default_cloud.db");
        android.content.Context context = this.f693a;
        if (e) {
            if (a.b20.D0()) {
                byte[] bytes = lt0Var.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII);
                byte[] bArr = {72, 75, 73, 71, 73, 74, 72, 77, 73, 27, 73, 78, 73, 28, 73, 25, 72, 79, 73, 74, 73, 26, 72, 76, 72, 76, 73, 28, 77, 26, 73, 71};
                for (int i = 0; i < 32; i++) {
                    bArr[i] = (byte) (bArr[i] ^ Byte.MAX_VALUE);
                }
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(new java.lang.String(bArr).getBytes("ASCII"), "AES");
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS5Padding");
                cipher.init(1, secretKeySpec);
                byte[] doFinal = cipher.doFinal(bytes);
                java.lang.String d = a.pe0.d(context, "default_cloud.json");
                a.wv.v(doFinal, "bytes");
                if (a.pe0.i(context, "default_cloud.json", doFinal) && a.b20.d1("/odm/etc/default_cloud.json", d)) {
                    new java.io.File(d).delete();
                    return true;
                }
            }
            return false;
        }
        java.lang.String h = a.wv.e(str2, "SmartP.db") ? a.ai1.h("update cloud_config set params = ? where config_name = '", str, "'") : a.ai1.h("update rules set rule_content = ? where rule_module = '", str, "'");
        try {
            android.database.sqlite.SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            a.wv.v(openOrCreateDatabase, "context.openOrCreateData…ntext.MODE_PRIVATE, null)");
            openOrCreateDatabase.execSQL(h, new java.lang.String[]{lt0Var.toString()});
            openOrCreateDatabase.close();
            java.lang.String absolutePath = context.getDatabasePath(str2).getAbsolutePath();
            a.wv.v(absolutePath, "targetPath");
            java.lang.String packageName = context.getPackageName();
            a.wv.v(packageName, "context.packageName");
            java.lang.String v2 = a.yi1.v2(absolutePath, packageName, "com.xiaomi.joyose");
            java.lang.String str3 = "cp -f " + absolutePath + " " + v2 + "\nchmod 0660 " + v2 + "\nrestorecon -DFR " + v2 + "\nchown system:system " + v2 + "\nam force-stop com.xiaomi.joyose";
            a.wv.w(str3, "shell");
            a.q10 q10Var = a.q10.f457a;
            a.q10.l(str3);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
