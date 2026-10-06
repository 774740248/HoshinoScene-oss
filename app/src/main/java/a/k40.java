package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class k40 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f281a;
    public final java.util.ArrayList b;
    public final a.a5 c;
    public final java.lang.String d;

    public k40(a.kk0 kk0Var, java.util.ArrayList arrayList, a.a5 a5Var) {
        java.lang.Object r2 = null;
        a.wv.w(a5Var, "handler");
        this.f281a = kk0Var;
        this.b = arrayList;
        this.c = a5Var;
        this.d = a.vv.f643a;
        java.lang.String absolutePath = kk0Var.getFilesDir().getAbsolutePath();
        a.wv.v(absolutePath, "context.filesDir.absolutePath");
        a.wv.v(kk0Var.getPackageName(), "context.packageName");
        a.wv.v(absolutePath.substring(0, a.yi1.m2(absolutePath, r2, 0, false, 6) - 1), "this as java.lang.String…ing(startIndex, endIndex)");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r8v4, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0215 -> B:18:0x0221). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(a.k40 r23, boolean r24, a.ey r25) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k40.c(a.k40, boolean, a.ey):java.lang.Object");
    }

    public static boolean l() {
        a.q10 q10Var = a.q10.f457a;
        java.lang.String l = a.q10.l("su -v");
        java.util.Locale locale = java.util.Locale.getDefault();
        a.wv.v(locale, "getDefault()");
        java.lang.String upperCase = l.toUpperCase(locale);
        a.wv.v(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return a.yi1.g2(upperCase, "MAGISKSU");
    }

    public static boolean m(java.lang.String str) {
        java.lang.String str2 = "df | grep tmpfs | grep \"" + str + "\"";
        a.wv.w(str2, "shell");
        a.q10 q10Var = a.q10.f457a;
        java.lang.String l = a.q10.l(str2);
        java.util.Locale locale = java.util.Locale.getDefault();
        a.wv.v(locale, "getDefault()");
        java.lang.String upperCase = l.toUpperCase(locale);
        a.wv.v(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return a.yi1.F2(upperCase).toString().length() > 0;
    }

    public final void a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it.next();
            java.lang.String packageName = appInfo.getPackageName();
            sb.append("echo '[disable " + appInfo.getAppName() + "]'\n");
            sb.append("pm disable " + packageName + "\n");
            sb.append("echo '[delete " + appInfo.getAppName() + "]'\n");
            if (a.b20.D0()) {
                java.lang.String obj = appInfo.path.toString();
                a.wv.w(obj, "orginPath");
                if (a.gy.H(obj)) {
                    a.gy.W(a.b20.g0(obj), "");
                }
                z = true;
            } else {
                java.lang.String obj2 = appInfo.dir.toString();
                sb.append("busybox mount -o rw,remount / 2>/dev/null\nmount -o rw,remount /system 2>/dev/null\nbusybox mount -o rw,remount / 2>/dev/null\nmount -o rw,remount /system 2>/dev/null\nbusybox mount -o remount,rw /dev/block/bootdevice/by-name/system /system 2>/dev/null\nmount -o remount,rw /dev/block/bootdevice/by-name/system /system 2>/dev/null\nbusybox mount -o rw,remount /vendor 2>/dev/null\nmount -o rw,remount /vendor 2>/dev/null\n");
                sb.append("rm -rf " + obj2 + "/oat\n");
                a.ai1.u("rm -rf ", obj2, "/lib\n", sb);
                sb.append("rm -rf '" + ((java.lang.Object) appInfo.path) + "'\n");
            }
        }
        sb.append("echo '[operation completed]'\n");
        k(sb);
        if (z) {
            int i = a.x60.f681a;
            android.app.Activity activity = this.f281a;
            java.lang.String string = activity.getString(2131951941);
            a.wv.v(string, "context.getString(R.string.apps_op_magisk_reboot)");
            a.fs1.F(activity, string, "", null);
        }
    }

    public final void b(boolean z, boolean z2) {
        java.util.ArrayList arrayList = this.b;
        if (!z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it.next();
                java.lang.String packageName = appInfo.getPackageName();
                a.ai1.u("echo '[uninstall ", appInfo.getAppName(), "]'\n", sb);
                if (z2) {
                    a.ai1.u("pm uninstall -k ", packageName, "\n", sb);
                } else {
                    a.ai1.u("pm uninstall ", packageName, "\n", sb);
                }
            }
            sb.append("echo '[operation completed]'\n");
            k(sb);
            return;
        }
        android.app.Activity activity = this.f281a;
        android.os.UserManager userManager = (android.os.UserManager) activity.getSystemService("user");
        android.os.UserHandle myUserHandle = android.os.Process.myUserHandle();
        if (userManager == null) {
            android.widget.Toast.makeText(activity, "获取用户ID失败！", 0).show();
            return;
        }
        long serialNumberForUser = userManager.getSerialNumberForUser(myUserHandle);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.omarea.model.AppInfo appInfo2 = (com.omarea.model.AppInfo) it2.next();
            java.lang.String packageName2 = appInfo2.getPackageName();
            a.ai1.u("echo '[uninstall ", appInfo2.getAppName(), "]'\n", sb2);
            if (z2) {
                sb2.append("pm uninstall -k --user " + serialNumberForUser + " " + packageName2 + "\n");
            } else {
                sb2.append("pm uninstall --user " + serialNumberForUser + " " + packageName2 + "\n");
            }
        }
        sb2.append("echo '[operation completed]'\n");
        k(sb2);
    }

    public final void d() {
        android.app.Activity activity = this.f281a;
        android.view.View inflate = activity.getLayoutInflater().inflate(2131558500, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362255);
        java.lang.String string = activity.getString(2131951899);
        a.wv.v(string, "context.getString(R.string.apps_op_backup_confirm)");
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(this.b.size())}, 1, string, "format(format, *args)", textView);
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(this.f281a, inflate, true);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362045);
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 15));
        inflate.findViewById(2131362098).setOnClickListener(new a.sg(m, this, switchOptionItemView, 19));
    }

    public final boolean e(java.lang.String str) {
        a.wv.w(str, "packageName");
        return new java.io.File(this.d + str + ".tar.gz").exists();
    }

    public final void f() {
        android.app.Activity activity = this.f281a;
        android.view.View inflate = activity.getLayoutInflater().inflate(2131558502, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362255);
        java.lang.String string = activity.getString(2131951930);
        a.wv.v(string, "context.getString(R.string.apps_op_frozen_confirm)");
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(this.b.size())}, 1, string, "format(format, *args)", textView);
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(this.f281a, inflate, true);
        android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) inflate.findViewById(2131362223);
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 13));
        inflate.findViewById(2131362098).setOnClickListener(new a.sg(m, this, compoundButton, 18));
    }

    public final void g() {
        android.app.Activity activity = this.f281a;
        java.lang.String string = activity.getString(2131951910);
        a.wv.v(string, "context.getString(R.string.apps_op_delete)");
        java.lang.String string2 = activity.getString(2131951914);
        a.wv.v(string2, "context.getString(R.string.apps_op_delete_confirm)");
        java.lang.String l = a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(this.b.size())}, 1, string2, "format(format, *args)");
        a.c40 c40Var = new a.c40(this, 2);
        int i = a.x60.f681a;
        a.fs1.k(this.f281a, string, l, c40Var);
    }

    public final void h() {
        android.app.Activity activity = this.f281a;
        java.lang.String string = activity.getString(2131951911);
        a.wv.v(string, "context.getString(R.string.apps_op_delete_backup)");
        java.lang.String string2 = activity.getString(2131951912);
        a.wv.v(string2, "context.getString(R.stri…op_delete_backup_confirm)");
        a.c40 c40Var = new a.c40(this, 1);
        int i = a.x60.f681a;
        a.fs1.k(this.f281a, string, string2, c40Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        android.app.Activity activity = this.f281a;
        android.view.View inflate = activity.getLayoutInflater().inflate(2131558503, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362255);
        java.lang.String string = activity.getString(2131951919);
        a.wv.v(string, "context.getString(R.stri….apps_op_dex2oat_confirm)");
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(this.b.size())}, 1, string, "format(format, *args)", textView);
        com.omarea.ui.SwitchOptionItemView[] switchOptionItemViewArr = new com.omarea.ui.SwitchOptionItemView[3];
        switchOptionItemViewArr[0] = inflate.findViewById(2131362387);
        switchOptionItemViewArr[1] = inflate.findViewById(2131362385);
        android.view.View findViewById = inflate.findViewById(2131362384);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) findViewById;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            switchOptionItemView.setEnabled(false);
        }
        switchOptionItemViewArr[2] = (com.omarea.ui.SwitchOptionItemView) findViewById;
        a.x81 x81Var = new a.x81(switchOptionItemViewArr);
        x81Var.d(0);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362386);
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(this.f281a, inflate, true);
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 17));
        inflate.findViewById(2131362098).setOnClickListener(new a.d41(m, x81Var, this, switchOptionItemView2, 5));
    }

    public final void j(java.lang.String str, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it.next();
            java.lang.String str2 = appInfo.getPackageName().toString();
            a.ai1.u("echo '[compile ", appInfo.getAppName(), "]'\n", sb);
            if (z) {
                sb.append(a.ai1.i("cmd package compile -f -m ", str, " ", str2, "\n\n"));
            } else {
                sb.append(a.ai1.i("cmd package compile -m ", str, " ", str2, "\n\n"));
            }
        }
        sb.append("echo '[operation completed]'\n\n");
        k(sb);
    }

    public final void k(java.lang.StringBuilder sb) {
        java.lang.Boolean bool;
        a.wv.w(sb, "sb");
        android.app.Activity activity = this.f281a;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(2131558537, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(2131362413);
        a.wv.t(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) findViewById).setText(activity.getText(2131953213));
        int i = a.x60.f681a;
        a.f40 f40Var = new a.f40(activity, inflate, a.fs1.m(activity, inflate, false), this.c);
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "sb.toString()");
        a.pm pmVar = new a.pm(f40Var, sb2);
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new a.df1(pmVar, (java.lang.String) pmVar.e));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.qp(futureTask, null), 3);
        try {
            bool = (java.lang.Boolean) futureTask.get(100L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception unused) {
            bool = java.lang.Boolean.FALSE;
        }
        a.wv.v(bool, "connected");
        bool.booleanValue();
        pmVar.K();
    }

    public final void n() {
        android.app.Activity activity = this.f281a;
        android.view.View inflate = activity.getLayoutInflater().inflate(2131558504, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        android.app.Activity activity2 = this.f281a;
        a.wv.v(inflate, "view");
        a.v60 m = a.fs1.m(activity2, inflate, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362255);
        java.lang.String string = activity.getString(2131951930);
        a.wv.v(string, "context.getString(R.string.apps_op_frozen_confirm)");
        java.util.ArrayList arrayList = this.b;
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(arrayList.size())}, 1, string, "format(format, *args)", textView);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362422);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362420);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView3 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131362421);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            switchOptionItemView.setEnabled(false);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            java.lang.Boolean bool = ((com.omarea.model.AppInfo) obj).suspended;
            a.wv.v(bool, "it.suspended");
            if (bool.booleanValue()) {
                arrayList2.add(obj);
            }
        }
        switchOptionItemView.setChecked(arrayList2.size() == arrayList.size());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (!((com.omarea.model.AppInfo) obj2).enabled.booleanValue()) {
                arrayList3.add(obj2);
            }
        }
        switchOptionItemView2.setChecked(arrayList3.size() == arrayList.size());
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "adb")) {
            switchOptionItemView3.setEnabled(false);
        }
        inflate.findViewById(2131362098).setOnClickListener(new a.x8(m, (java.lang.Object) switchOptionItemView, (java.lang.Object) switchOptionItemView2, (java.lang.Object) switchOptionItemView3, (java.lang.Object) this, 6));
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 16));
    }

    public final void o() {
        android.app.Activity activity = this.f281a;
        java.lang.String string = activity.getString(2131951943);
        a.wv.v(string, "context.getString(R.string.apps_op_restore)");
        java.lang.String string2 = activity.getString(2131951948);
        a.wv.v(string2, "context.getString(R.stri….apps_op_restore_confirm)");
        java.lang.String l = a.ai1.l(new java.lang.Object[]{java.lang.Integer.valueOf(this.b.size())}, 1, string2, "format(format, *args)");
        a.c40 c40Var = new a.c40(this, 0);
        int i = a.x60.f681a;
        a.fs1.k(this.f281a, string, l, c40Var);
    }

    public final void p() {
        a.q10 q10Var = a.q10.f457a;
        boolean e = a.wv.e(a.q10.t(), "basic");
        java.util.ArrayList arrayList = this.b;
        android.app.Activity activity = this.f281a;
        if (e) {
            android.net.Uri parse = android.net.Uri.parse("package:" + ((com.omarea.model.AppInfo) a.qv.e2(arrayList)).getPackageName());
            a.wv.v(parse, "parse(\"package:$packageName\")");
            activity.startActivityForResult(new android.content.Intent("android.intent.action.DELETE", parse), 0);
            return;
        }
        android.view.View inflate = activity.getLayoutInflater().inflate(2131558512, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362255);
        java.lang.String string = activity.getString(2131951976);
        a.wv.v(string, "context.getString(R.stri…pps_op_uninstall_confirm)");
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(arrayList.size())}, 1, string, "format(format, *args)", textView);
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(this.f281a, inflate, true);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363326);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363325);
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 12));
        inflate.findViewById(2131362098).setOnClickListener(new a.d40(m, this, switchOptionItemView, switchOptionItemView2, 0));
    }

    public final void q(boolean z) {
        a.q10 q10Var = a.q10.f457a;
        boolean e = a.wv.e(a.q10.t(), "basic");
        java.util.ArrayList arrayList = this.b;
        android.app.Activity activity = this.f281a;
        if (e) {
            android.net.Uri parse = android.net.Uri.parse("package:" + ((com.omarea.model.AppInfo) a.qv.e2(arrayList)).getPackageName());
            a.wv.v(parse, "parse(\"package:$packageName\")");
            activity.startActivityForResult(new android.content.Intent("android.intent.action.DELETE", parse), 0);
            return;
        }
        android.view.View inflate = activity.getLayoutInflater().inflate(2131558512, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362255);
        java.lang.String string = activity.getString(2131951981);
        a.wv.v(string, "context.getString(R.stri…ninstall_updated_confirm)");
        a.ai1.v(new java.lang.Object[]{java.lang.Integer.valueOf(arrayList.size())}, 1, string, "format(format, *args)", textView);
        int i = a.x60.f681a;
        a.v60 m = a.fs1.m(this.f281a, inflate, true);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363326);
        com.omarea.ui.SwitchOptionItemView switchOptionItemView2 = (com.omarea.ui.SwitchOptionItemView) inflate.findViewById(2131363325);
        switchOptionItemView.setEnabled(false);
        if (z) {
            switchOptionItemView.setEnabled(false);
            switchOptionItemView2.setEnabled(false);
            switchOptionItemView.setChecked(false);
            switchOptionItemView2.setChecked(false);
        } else {
            switchOptionItemView.setEnabled(false);
            switchOptionItemView.setChecked(true);
        }
        inflate.findViewById(2131362097).setOnClickListener(new a.q60(m, 14));
        inflate.findViewById(2131362098).setOnClickListener(new a.d40(m, this, switchOptionItemView, switchOptionItemView2, 1));
    }
}
