package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class go extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.nk g;
    public final /* synthetic */ android.content.pm.PackageInfo h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(a.nk nkVar, android.content.pm.PackageInfo packageInfo, int i, a.ey eyVar) {
        super(2, eyVar);
        this.g = nkVar;
        this.h = packageInfo;
        this.i = i;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.go(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        java.lang.Object r6 = null;
        java.lang.Number num;
        long longVersionCode;
        a.b20.q1(obj);
        a.nk nkVar = this.g;
        a.e3 e3Var = (a.e3) nkVar.f;
        android.content.pm.PackageInfo packageInfo = this.h;
        try {
            android.database.Cursor rawQuery = e3Var.getWritableDatabase().rawQuery("select version from apps where package_name = ?", new java.lang.String[]{packageInfo.packageName});
            r6 = rawQuery.moveToNext() ? rawQuery.getLong(0) : 0L;
            rawQuery.close();
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            num = new java.lang.Long(longVersionCode);
        } else {
            num = new java.lang.Integer(packageInfo.versionCode);
        }
        if (!(num instanceof java.lang.Long) || r6 != num.longValue()) {
            android.content.pm.PackageInfo packageInfo2 = ((android.content.pm.PackageManager) nkVar.e).getPackageInfo(packageInfo.packageName, this.i);
            ((a.e3) nkVar.f).getWritableDatabase().delete("activities", "package_name = ?", new java.lang.String[]{packageInfo.packageName});
            android.content.pm.ActivityInfo[] activityInfoArr = packageInfo2.activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (i < length) {
                    android.content.pm.ActivityInfo activityInfo = activityInfoArr[i];
                    java.lang.CharSequence loadLabel = activityInfo.loadLabel((android.content.pm.PackageManager) nkVar.e);
                    a.wv.v(loadLabel, "activity.loadLabel(packageManager)");
                    a.e3 e3Var2 = (a.e3) nkVar.f;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append((java.lang.Object) loadLabel);
                    java.lang.String sb2 = sb.toString();
                    e3Var2.getClass();
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("name", activityInfo.name);
                    contentValues.put("package_name", activityInfo.packageName);
                    contentValues.put("exported", java.lang.Integer.valueOf(activityInfo.exported ? 1 : 0));
                    contentValues.put("enabled", java.lang.Integer.valueOf(activityInfo.isEnabled() ? 1 : 0));
                    contentValues.put("label", sb2);
                    e3Var2.getWritableDatabase().insert("activities", "name", contentValues);
                    i++;
                    activityInfoArr = activityInfoArr;
                }
            }
            ((a.e3) nkVar.f).getWritableDatabase().delete("services", "package_name = ?", new java.lang.String[]{packageInfo.packageName});
            android.content.pm.ServiceInfo[] serviceInfoArr = packageInfo2.services;
            if (serviceInfoArr != null) {
                for (android.content.pm.ServiceInfo serviceInfo : serviceInfoArr) {
                    a.e3 e3Var3 = (a.e3) nkVar.f;
                    e3Var3.getClass();
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("name", serviceInfo.name);
                    contentValues2.put("package_name", serviceInfo.packageName);
                    contentValues2.put("exported", java.lang.Integer.valueOf(serviceInfo.exported ? 1 : 0));
                    contentValues2.put("enabled", java.lang.Integer.valueOf(serviceInfo.isEnabled() ? 1 : 0));
                    e3Var3.getWritableDatabase().insert("services", "name", contentValues2);
                }
            }
            ((a.e3) nkVar.f).getWritableDatabase().delete("providers", "package_name = ?", new java.lang.String[]{packageInfo.packageName});
            android.content.pm.ProviderInfo[] providerInfoArr = packageInfo2.providers;
            if (providerInfoArr != null) {
                for (android.content.pm.ProviderInfo providerInfo : providerInfoArr) {
                    a.e3 e3Var4 = (a.e3) nkVar.f;
                    e3Var4.getClass();
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    contentValues3.put("name", providerInfo.name);
                    contentValues3.put("package_name", providerInfo.packageName);
                    contentValues3.put("exported", java.lang.Integer.valueOf(providerInfo.exported ? 1 : 0));
                    contentValues3.put("enabled", java.lang.Integer.valueOf(providerInfo.isEnabled() ? 1 : 0));
                    contentValues3.put("authority", providerInfo.authority);
                    e3Var4.getWritableDatabase().insert("providers", "name", contentValues3);
                }
            }
            ((a.e3) nkVar.f).getWritableDatabase().delete("receivers", "package_name = ?", new java.lang.String[]{packageInfo.packageName});
            android.content.pm.ActivityInfo[] activityInfoArr2 = packageInfo2.receivers;
            if (activityInfoArr2 != null) {
                for (android.content.pm.ActivityInfo activityInfo2 : activityInfoArr2) {
                    a.e3 e3Var5 = (a.e3) nkVar.f;
                    e3Var5.getClass();
                    android.content.ContentValues contentValues4 = new android.content.ContentValues();
                    contentValues4.put("name", activityInfo2.name);
                    contentValues4.put("package_name", activityInfo2.packageName);
                    contentValues4.put("exported", java.lang.Integer.valueOf(activityInfo2.exported ? 1 : 0));
                    contentValues4.put("enabled", java.lang.Integer.valueOf(activityInfo2.isEnabled() ? 1 : 0));
                    e3Var5.getWritableDatabase().insert("receivers", "name", contentValues4);
                }
            }
            a.e3 e3Var6 = (a.e3) nkVar.f;
            e3Var6.getWritableDatabase().delete("apps", "package_name = ?", new java.lang.String[]{packageInfo.packageName});
            android.content.ContentValues contentValues5 = new android.content.ContentValues();
            contentValues5.put("package_name", packageInfo.packageName);
            contentValues5.put("version", java.lang.Long.valueOf(android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            e3Var6.getWritableDatabase().insert("apps", "", contentValues5);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.go goVar = (a.go) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        goVar.e(no1Var);
        return no1Var;
    }
}
