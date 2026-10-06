package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yi {
    public static java.util.HashMap f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f711a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public final java.lang.Object e;

    public final java.lang.String[] a() {
        java.util.List<android.content.pm.ApplicationInfo> installedApplications = ((android.content.pm.PackageManager) this.c).getInstalledApplications(0);
        a.wv.v(installedApplications, "packageManager.getInstalledApplications(0)");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (android.content.pm.ApplicationInfo applicationInfo : installedApplications) {
            a.wv.v(applicationInfo, "info");
            if (d(applicationInfo) && !a.op.K1((java.lang.String[]) this.b, applicationInfo.packageName)) {
                arrayList.add(applicationInfo.packageName);
            }
        }
        android.content.SharedPreferences.Editor edit = ((android.content.SharedPreferences) this.d).edit();
        for (java.lang.String str : arrayList) {
            if (!((android.content.SharedPreferences) this.d).contains(str)) {
                edit.putBoolean(str, true);
            }
        }
        java.util.Iterator it = ((android.content.SharedPreferences) this.d).getAll().entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (a.op.K1((java.lang.String[]) this.b, entry.getKey())) {
                edit.remove((java.lang.String) entry.getKey());
            }
        }
        edit.apply();
        java.util.Set<java.util.Map.Entry<java.lang.String, ?>> entrySet = ((android.content.SharedPreferences) this.d).getAll().entrySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            if (a.wv.e(((java.util.Map.Entry) obj).getValue(), java.lang.Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(a.op.J1(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getKey());
        }
        return (java.lang.String[]) arrayList3.toArray(new java.lang.String[0]);
    }

    public final void b(android.content.Context context) {
        if (f == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            f = hashMap;
            java.lang.String str = "file:///android_asset/kr-script/executor.sh";
            hashMap.put("executor_core", "file:///android_asset/kr-script/executor.sh");
            f.put("page_list_config", "file:///android_asset/kr-script/pages/more.xml");
            f.put("favorite_config", "file:///android_asset/kr-script/pages/favorites.xml");
            f.put("allow_home_page", "1");
            java.lang.String str2 = "file:///android_asset/kr-script/toolkit";
            f.put("toolkit_dir", "file:///android_asset/kr-script/toolkit");
            f.put("before_start_sh", "");
            try {
                java.io.InputStream open = context.getAssets().open("kr-script.conf");
                byte[] bArr = new byte[open.available()];
                open.read(bArr);
                for (java.lang.String str3 : new java.lang.String(bArr, java.nio.charset.Charset.defaultCharset()).split("\n")) {
                    java.lang.String trim = str3.trim();
                    if (!trim.startsWith("#") && trim.contains("=")) {
                        int indexOf = trim.indexOf("=");
                        java.lang.String trim2 = trim.substring(0, indexOf).trim();
                        java.lang.String trim3 = trim.substring(indexOf + 2, trim.length() - 1).trim();
                        f.remove(trim2);
                        f.put(trim2, trim3);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            java.util.HashMap hashMap2 = f;
            if (hashMap2 != null && hashMap2.containsKey("executor_core")) {
                str = (java.lang.String) f.get("executor_core");
            }
            java.util.HashMap hashMap3 = f;
            if (hashMap3 != null && hashMap3.containsKey("toolkit_dir")) {
                str2 = (java.lang.String) f.get("toolkit_dir");
            }
            a.wv.A0(context, str, str2);
        }
    }

    public final java.lang.Boolean c(java.lang.String str) {
        a.wv.w(str, "app");
        if (((android.content.SharedPreferences) this.d).contains(str)) {
            return java.lang.Boolean.valueOf(((android.content.SharedPreferences) this.d).getBoolean(str, false));
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = ((android.content.pm.PackageManager) this.c).getApplicationInfo(str, 128);
            a.wv.v(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            boolean d = d(applicationInfo);
            ((android.content.SharedPreferences) this.d).edit().putBoolean(str, d).apply();
            return java.lang.Boolean.valueOf(d);
        } catch (java.lang.Exception unused) {
            ((android.content.SharedPreferences) this.d).edit().putBoolean(str, false).apply();
            return null;
        }
    }

    public final boolean d(android.content.pm.ApplicationInfo applicationInfo) {
        java.io.File file;
        java.util.Set<java.lang.String> keySet;
        if (a.op.K1((java.lang.String[]) this.b, applicationInfo.packageName)) {
            return false;
        }
        java.lang.String str = applicationInfo.sourceDir;
        a.wv.v(str, "info.sourceDir");
        if (!a.yi1.B2(str, "/data")) {
            return false;
        }
        boolean z = applicationInfo.category == 0 || (applicationInfo.flags & 33554432) == 33554432;
        java.lang.Object obj = null;
        if (!z) {
            android.content.Intent launchIntentForPackage = ((android.content.pm.PackageManager) this.c).getLaunchIntentForPackage(applicationInfo.packageName);
            android.content.ComponentName component = launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null;
            if (component != null) {
                android.content.pm.ActivityInfo activityInfo = ((android.content.pm.PackageManager) this.c).getActivityInfo(component, 0);
                a.wv.v(activityInfo, "packageManager.getActivityInfo(componentName, 0)");
                int i = activityInfo.screenOrientation;
                if (i == 0 || i == 6 || i == 8 || i == 11) {
                    z = true;
                }
            }
        }
        if (!z) {
            java.io.File[] listFiles = new java.io.File(applicationInfo.nativeLibraryDir).listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                for (int i2 = 0; i2 < length; i2++) {
                    file = listFiles[i2];
                    if (file != null) {
                        java.lang.String[] strArr = (java.lang.String[]) this.e;
                        java.lang.String name = file.getName();
                        a.wv.v(name, "it.name");
                        java.util.Locale locale = java.util.Locale.ENGLISH;
                        if (a.op.K1(strArr, a.ai1.k(locale, "ENGLISH", name, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                            break;
                        }
                    }
                }
            }
            file = null;
            if (file != null) {
                return true;
            }
            android.os.Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                java.util.Iterator it = keySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str2 = (java.lang.String) next;
                    if (str2 != null && a.yi1.g2(str2, "game")) {
                        obj = next;
                        break;
                    }
                }
                obj = (java.lang.String) obj;
            }
            if (obj != null) {
                return true;
            }
        }
        return z;
    }

    public yi() {
        this.f711a = "file:///android_asset/kr-script/executor.sh";
        this.b = "file:///android_asset/kr-script/pages/more.xml";
        this.c = "file:///android_asset/kr-script/pages/favorites.xml";
        this.d = "1";
        this.e = "";
    }

    public yi(android.content.Context context) {
        a.wv.w(context, "context");
        this.f711a = context;
        java.lang.String[] stringArray = context.getResources().getStringArray(2130903050);
        a.wv.v(stringArray, "context.resources.getStr…y.config_games_blacklist)");
        this.b = stringArray;
        android.content.pm.PackageManager packageManager = ((android.content.Context) this.f711a).getPackageManager();
        a.wv.s(packageManager);
        this.c = packageManager;
        android.content.SharedPreferences sharedPreferences = ((android.content.Context) this.f711a).getSharedPreferences("games", 0);
        a.wv.s(sharedPreferences);
        this.d = sharedPreferences;
        this.e = new java.lang.String[]{"libunity.so", "libil2cpp.so", "libue4.so", "libue.so", "libunreal.so", "libcocos2djs.so", "libcocos2dcpp.so"};
    }
}
