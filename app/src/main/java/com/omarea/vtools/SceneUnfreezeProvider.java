package com.omarea.vtools;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class SceneUnfreezeProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        a.wv.w(uri, "uri");
        int i = 0;
        if (str != null) {
            a.au auVar = new a.au(getContext(), 2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                android.database.sqlite.SQLiteDatabase readableDatabase = auVar.getReadableDatabase();
                android.database.Cursor query = readableDatabase.query("scene_config3", new java.lang.String[]{"*"}, str, strArr, null, null, null);
                while (query.moveToNext()) {
                    arrayList.add(a.au.b(query));
                }
                query.close();
                readableDatabase.close();
            } catch (java.lang.Exception unused) {
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.omarea.model.SceneConfigInfo sceneConfigInfo = (com.omarea.model.SceneConfigInfo) it.next();
                if (sceneConfigInfo.freeze) {
                    a.tg1 tg1Var = a.me1.m;
                    java.lang.String str2 = sceneConfigInfo.packageName;
                    a.wv.v(str2, "app.packageName");
                    a.tg1.e(str2);
                    i++;
                }
            }
            auVar.close();
        }
        return i;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        a.wv.w(uri, "uri");
        return "application/json";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        a.wv.w(uri, "uri");
        if (contentValues == null || !contentValues.containsKey("packageName")) {
            return null;
        }
        java.lang.String obj = contentValues.get("packageName").toString();
        a.tg1 tg1Var = a.me1.m;
        a.tg1.t(obj);
        return uri;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        a.wv.w(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        a.wv.w(uri, "uri");
        return 0;
    }
}
