package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class po {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f445a;
    public final boolean b;
    public final android.content.pm.PackageManager c;

    public po(android.content.Context context, boolean z) {
        a.wv.w(context, "context");
        this.f445a = context;
        this.b = z;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        a.wv.v(packageManager, "context.packageManager");
        this.c = packageManager;
    }

    public static boolean b(java.lang.String str) {
        return a.yi1.g2(str, ".overlay") || a.yi1.g2(str, "com.android.theme.color") || a.yi1.g2(str, "com.android.theme.icon");
    }

    public static boolean h(android.content.pm.ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 128) != 0;
    }

    public final java.lang.String a(android.content.pm.PackageInfo packageInfo) {
        try {
            android.content.pm.PackageInfo packageInfo2 = this.c.getPackageInfo(packageInfo.packageName, 0);
            if (packageInfo2 == null) {
                return "";
            }
            int i = packageInfo.versionCode;
            int i2 = packageInfo2.versionCode;
            android.content.Context context = this.f445a;
            if (i == i2) {
                return context.getString(2131952005) + " ";
            }
            if (i > i2) {
                return context.getString(2131952007) + " ";
            }
            return context.getString(2131952006) + " ";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public final com.omarea.model.AppInfo c(java.lang.String str) {
        a.wv.w(str, "packageName");
        try {
            android.content.pm.ApplicationInfo applicationInfo = this.c.getApplicationInfo(str, 8192);
            a.wv.v(applicationInfo, "packageManager.getApplic…TCH_UNINSTALLED_PACKAGES)");
            return e(applicationInfo, null, false);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.util.ArrayList d(java.lang.Boolean bool, boolean z) {
        java.util.List<android.content.pm.ApplicationInfo> installedApplications = this.c.getInstalledApplications(0);
        a.wv.v(installedApplications, "packageManager.getInstalledApplications(0)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = installedApplications.size();
        for (int i = 0; i < size; i++) {
            android.content.pm.ApplicationInfo applicationInfo = installedApplications.get(i);
            a.wv.v(applicationInfo, "applicationInfo");
            com.omarea.model.AppInfo e = e(applicationInfo, bool, z);
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (b(r12) != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.omarea.model.AppInfo e(android.content.pm.ApplicationInfo r10, java.lang.Boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.po.e(android.content.pm.ApplicationInfo, java.lang.Boolean, boolean):com.omarea.model.AppInfo");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:25|(1:27)(1:45)|28|(2:30|(8:32|33|(1:35)(1:43)|36|37|38|39|40))|44|33|(0)(0)|36|37|38|39|40) */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.po.f():java.util.ArrayList");
    }

    public final java.lang.String g(android.content.pm.ApplicationInfo applicationInfo) {
        android.content.pm.PackageManager packageManager = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = a.vv.f643a;
        try {
            boolean z = applicationInfo.enabled;
            android.content.Context context = this.f445a;
            if (!z) {
                sb.append(context.getString(2131952003));
                sb.append(" ");
            }
            if ((applicationInfo.flags & 1073741824) != 0) {
                sb.append(context.getString(2131952008));
                sb.append(" ");
            }
            if (h(applicationInfo)) {
                java.lang.String str2 = applicationInfo.sourceDir;
                a.wv.v(str2, "applicationInfo.sourceDir");
                if (a.yi1.B2(str2, "/data")) {
                    sb.append(context.getString(2131952009));
                    sb.append(" ");
                }
            }
            java.lang.String str3 = applicationInfo.packageName;
            java.lang.String str4 = str + str3 + ".apk";
            if (new java.io.File(str4).exists()) {
                android.content.pm.PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str4, 1);
                a.wv.s(packageArchiveInfo);
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(applicationInfo.packageName, 0);
                if (packageInfo == null) {
                    return "";
                }
                int i = packageArchiveInfo.versionCode;
                int i2 = packageInfo.versionCode;
                if (i == i2) {
                    sb.append(context.getString(2131952001));
                    sb.append(" ");
                } else if (i > i2) {
                    sb.append(context.getString(2131952002));
                    sb.append(" ");
                } else {
                    sb.append(context.getString(2131952000));
                    sb.append(" ");
                }
            } else {
                if (new java.io.File(str + str3 + ".tar.gz").exists()) {
                    sb.append(context.getString(2131952004));
                    sb.append(" ");
                }
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "stateTags.toString()");
        return a.yi1.F2(sb2).toString();
    }
}
