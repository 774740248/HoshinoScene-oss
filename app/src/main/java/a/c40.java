package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class c40 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ a.k40 d;

    public /* synthetic */ c40(a.k40 k40Var, int i) {
        this.c = i;
        this.d = k40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        a.k40 k40Var = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(k40Var, "this$0");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("chown -R sdcard_rw:sdcard_rw \"");
                java.lang.String str = k40Var.d;
                sb2.append(str);
                sb2.append("\" 2>/dev/null\n");
                sb.append(sb2.toString());
                sb.append("chmod -R 777 \"" + str + "\" 2>/dev/null\n");
                java.util.Iterator it = k40Var.b.iterator();
                while (it.hasNext()) {
                    com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it.next();
                    java.lang.String packageName = appInfo.getPackageName();
                    java.lang.String obj = appInfo.path.toString();
                    sb.append("echo '[install " + appInfo.getAppName() + "]'\n");
                    sb.append("rm -f /data/local/tmp/app_install_cache.apk\n");
                    if (a.ai1.w(obj)) {
                        sb.append("cp \"" + obj + "\" /data/local/tmp/app_install_cache.apk\n");
                        sb.append("pm install -r /data/local/tmp/app_install_cache.apk 1> /dev/null\n");
                    } else if (new java.io.File(a.ii1.f(str, packageName, ".apk")).exists()) {
                        sb.append("cp \"" + str + packageName + ".apk\" /data/local/tmp/app_install_cache.apk\n");
                        sb.append("pm install -r /data/local/tmp/app_install_cache.apk 1> /dev/null\n");
                    }
                    sb.append("rm -f /data/local/tmp/app_install_cache.apk\n");
                    if (new java.io.File(a.ii1.f(str, packageName, ".appops")).exists()) {
                        sb.append("cat " + str + packageName + ".appops | sed 's/\\:/ /' | while read op; do\n");
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("  appops set ");
                        sb3.append(packageName);
                        sb3.append(" $op\n");
                        sb.append(sb3.toString());
                        sb.append("done\n");
                    }
                }
                sb.append("sync\nsleep 2\necho '[operation completed]'\n");
                k40Var.k(sb);
                return;
            case 1:
                a.wv.w(k40Var, "this$0");
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                java.util.Iterator it2 = k40Var.b.iterator();
                while (it2.hasNext()) {
                    com.omarea.model.AppInfo appInfo2 = (com.omarea.model.AppInfo) it2.next();
                    java.lang.String packageName2 = appInfo2.getPackageName();
                    a.ai1.u("echo '[delete ", appInfo2.getAppName(), "]'\n", sb4);
                    java.lang.CharSequence charSequence = appInfo2.path;
                    java.lang.String str2 = k40Var.d;
                    if (charSequence != null) {
                        sb4.append("rm -rf '" + ((java.lang.Object) charSequence) + "'\n");
                        if (a.wv.e(appInfo2.path, str2 + packageName2 + ".apk")) {
                            sb4.append("rm -rf " + str2 + packageName2 + ".tar.gz\n");
                        }
                    } else {
                        sb4.append("rm -rf " + str2 + packageName2 + ".apk\n");
                        sb4.append("rm -rf " + str2 + packageName2 + ".tar.gz\n");
                    }
                }
                sb4.append("echo '[operation completed]'\n");
                k40Var.k(sb4);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(k40Var, "this$0");
                if (!a.k40.l() || a.b20.D0() || (!a.k40.m("/system/app") && !a.k40.m("/system/priv-app"))) {
                    k40Var.a();
                    return;
                }
                int i2 = a.x60.f681a;
                android.app.Activity activity = k40Var.f281a;
                java.lang.String string = activity.getString(2131951938);
                a.wv.v(string, "context.getString(R.string.apps_op_magisk_clash)");
                java.lang.String string2 = activity.getString(2131951939);
                a.wv.v(string2, "context.getString(R.stri…pps_op_magisk_clash_desc)");
                java.lang.String string3 = activity.getString(2131952078);
                a.wv.v(string3, "context.getString(R.string.btn_continue)");
                a.fs1.f(activity, string, string2, new a.u60(string3, new a.c40(k40Var, 3), 4), null);
                return;
            default:
                a.wv.w(k40Var, "this$0");
                k40Var.a();
                return;
        }
    }
}
