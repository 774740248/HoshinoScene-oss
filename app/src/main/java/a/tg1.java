package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class tg1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f556a;

    public /* synthetic */ tg1(int i) {
        this.f556a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(a.tg1 r9, a.ey r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tg1.a(a.tg1, a.ey):java.io.Serializable");
    }

    public static void b(a.tg1 tg1Var, android.content.Context context, int i) {
        a.wv.w(context, "context");
        new java.lang.Thread(new a.bf1(tg1Var, i, null, context, new android.os.Handler(android.os.Looper.getMainLooper()))).start();
    }

    public static boolean c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo.getActionList().contains(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK)) {
            return accessibilityNodeInfo.performAction(16);
        }
        return false;
    }

    public static android.view.accessibility.AccessibilityNodeInfo d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo.isClickable()) {
            android.view.accessibility.AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent();
            return (parent == null || !a.wv.e(parent.getClassName(), "android.widget.Button")) ? accessibilityNodeInfo : parent;
        }
        android.view.accessibility.AccessibilityNodeInfo parent2 = accessibilityNodeInfo.getParent();
        if (parent2 != null) {
            return d(parent2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [a.gy, java.lang.Object] */
    public static void e(java.lang.String str) {
        a.wv.w(str, "app");
        if (a.me1.o.c(str)) {
            if (a.wv.e(str, "com.android.vending")) {
                a.gy.j((gy) (new java.lang.Object()));
                return;
            }
            a.q10 q10Var = a.q10.f457a;
            java.lang.String h = a.wv.e(a.q10.t(), "adb") ? a.ai1.h("pm disable-user ", str, " 2>/dev/null") : a.ai1.h("pm disable ", str, " 2>/dev/null");
            a.wv.w(h, "shell");
            a.q10.l(h);
        }
    }

    public static java.lang.String f() {
        java.lang.Object obj;
        a.q10 q10Var = a.q10.f457a;
        a.lt0 p = a.q10.p(1000L, "device-id", "");
        if (p != null) {
            java.lang.String[] strArr = {"serial_id", "serial_no", "cpu_id", "gid"};
            java.util.ArrayList arrayList = new java.util.ArrayList(4);
            for (int i = 0; i < 4; i++) {
                java.lang.String str = strArr[i];
                arrayList.add(p.f329a.containsKey(str) ? p.h(str) : "");
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str2 = (java.lang.String) obj;
                a.wv.v(str2, "it");
                if (str2.length() > 0) {
                    break;
                }
            }
            java.lang.String str3 = (java.lang.String) obj;
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public static int g() {
        return ((java.lang.Number) a.du.f.a()).intValue();
    }

    public static int h() {
        return ((java.lang.Number) a.du.g.a()).intValue();
    }

    public static java.lang.String i() {
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E("area", "cn");
        return a.wv.e(E, "gb") ? "https://vtools.online" : a.wv.e(E, "cn2") ? "http://scene7.omarea.com:8080" : "https://omarea.com";
    }

    public static java.lang.String j() {
        java.lang.String obj;
        a.nk nkVar = a.b11.c;
        if (nkVar.r() == null) {
            a.lv b = a.b11.b();
            java.lang.String str = b != null ? b.i : null;
            if (str == null || str.length() == 0) {
                nkVar.U();
            } else {
                if (a.yi1.B2(str, "/")) {
                    a.nu0 nu0Var = a.nu0.f395a;
                    obj = a.nu0.d(str);
                } else {
                    try {
                        java.lang.String property = java.lang.System.getProperty(str);
                        if (property != null && property.length() != 0) {
                            obj = a.yi1.G2(property).toString();
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    a.q10 q10Var = a.q10.f457a;
                    java.lang.String L = a.q10.L("get-prop", str, null);
                    obj = a.wv.e(L, "error") ? "" : a.yi1.G2(L).toString();
                }
                nkVar.d = obj;
            }
        }
        java.lang.String r = nkVar.r();
        return r == null ? "" : r;
    }

    public static java.lang.String k() {
        if (p()) {
            return "SOURCE_OUTSIDE";
        }
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E("scene_profile_source", "UNKNOWN");
        if (!a.wv.e(E, "UNKNOWN")) {
            a.wv.s(E);
            return E;
        }
        android.app.Application t = a.fs1.t();
        java.lang.String str = a.pe0.f434a;
        return (new java.io.File(a.pe0.d(t, "profile.json")).exists() || new java.io.File(a.pe0.d(a.fs1.t(), "manifest.json")).exists()) ? "SOURCE_OUTSIDE" : "SOURCE_NONE";
    }

    public static android.graphics.drawable.Drawable l(java.lang.String str) {
        if (a.wv.e(str, a.b11.i)) {
            a.cp cpVar = com.omarea.Scene.c;
            return a.fs1.t().getDrawable(2131231233);
        }
        if (a.wv.e(str, a.b11.l)) {
            a.cp cpVar2 = com.omarea.Scene.c;
            return a.fs1.t().getDrawable(2131231227);
        }
        if (a.wv.e(str, a.b11.j)) {
            a.cp cpVar3 = com.omarea.Scene.c;
            return a.fs1.t().getDrawable(2131231232);
        }
        if (a.wv.e(str, a.b11.k)) {
            a.cp cpVar4 = com.omarea.Scene.c;
            return a.fs1.t().getDrawable(2131231229);
        }
        if (!a.wv.e(str, a.b11.m)) {
            return null;
        }
        a.cp cpVar5 = com.omarea.Scene.c;
        return a.fs1.t().getDrawable(2131231231);
    }

    public static a.xt0 m(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        if (!a.wv.e(str, "default_cloud.db")) {
            java.lang.String absolutePath = context.getDatabasePath(str).getAbsolutePath();
            a.wv.v(absolutePath, "targetPath");
            java.lang.String packageName = context.getPackageName();
            a.wv.v(packageName, "context.packageName");
            java.lang.String v2 = a.yi1.v2(absolutePath, packageName, "com.xiaomi.joyose");
            java.lang.String str2 = "cp -f " + v2 + " " + absolutePath + " && chmod 777 " + absolutePath + "\ncp -f " + v2 + "-journal " + absolutePath + "-journal && chmod 777 " + absolutePath + "-journal";
            a.wv.w(str2, "shell");
            a.q10 q10Var = a.q10.f457a;
            a.q10.l(str2);
        }
        return new a.xt0(context, str);
    }

    public static java.lang.String n(java.lang.String str) {
        a.wv.w(str, "mode");
        if (a.wv.e(str, a.b11.i)) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = a.fs1.t().getString(2131953250);
            a.wv.v(string, "Scene.context.getString(R.string.powersave)");
            return string;
        }
        if (a.wv.e(str, a.b11.j)) {
            a.cp cpVar2 = com.omarea.Scene.c;
            java.lang.String string2 = a.fs1.t().getString(2131953202);
            a.wv.v(string2, "Scene.context.getString(R.string.performance)");
            return string2;
        }
        if (a.wv.e(str, a.b11.k)) {
            a.cp cpVar3 = com.omarea.Scene.c;
            java.lang.String string3 = a.fs1.t().getString(2131952259);
            a.wv.v(string3, "Scene.context.getString(R.string.fast)");
            return string3;
        }
        if (a.wv.e(str, a.b11.l)) {
            a.cp cpVar4 = com.omarea.Scene.c;
            java.lang.String string4 = a.fs1.t().getString(2131952012);
            a.wv.v(string4, "Scene.context.getString(R.string.balance)");
            return string4;
        }
        if (a.wv.e(str, a.b11.m)) {
            a.cp cpVar5 = com.omarea.Scene.c;
            java.lang.String string5 = a.fs1.t().getString(2131953171);
            a.wv.v(string5, "Scene.context.getString(R.string.pedestal)");
            return string5;
        }
        if (a.wv.e(str, a.b11.o)) {
            a.cp cpVar6 = com.omarea.Scene.c;
            java.lang.String string6 = a.fs1.t().getString(2131952547);
            a.wv.v(string6, "Scene.context.getString(R.string.kepp_state)");
            return string6;
        }
        if (a.wv.e(str, a.b11.n)) {
            a.cp cpVar7 = com.omarea.Scene.c;
            java.lang.String string7 = a.fs1.t().getString(2131953657);
            a.wv.v(string7, "Scene.context.getString(R.string.uperf_auto)");
            return string7;
        }
        if (a.wv.e(str, "")) {
            a.cp cpVar8 = com.omarea.Scene.c;
            java.lang.String string8 = a.fs1.t().getString(2131952499);
            a.wv.v(string8, "Scene.context.getString(R.string.global_default)");
            return string8;
        }
        if (str.length() == 0) {
            return str;
        }
        a.cp cpVar9 = com.omarea.Scene.c;
        java.lang.String string9 = a.fs1.t().getString(2131953656);
        a.wv.v(string9, "Scene.context.getString(R.string.unknown_mode)");
        return string9;
    }

    public static void o(android.app.Activity activity, android.graphics.Bitmap bitmap, boolean z) {
        a.wv.w(activity, "activity");
        int hashCode = activity.hashCode();
        if (bitmap == null) {
            a.wr.f = null;
            a.wr.h.put(java.lang.Integer.valueOf(hashCode), null);
            return;
        }
        int hashCode2 = bitmap.hashCode();
        a.wr.h.put(java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(hashCode2));
        android.util.LruCache lruCache = a.wr.g;
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) lruCache.get(java.lang.Integer.valueOf(hashCode2));
        if (bitmap2 != null) {
            a.wr.f = bitmap2;
            return;
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, 192, (int) (bitmap.getHeight() / (bitmap.getWidth() / 192.0f)), false);
        a.wv.v(createScaledBitmap, "createScaledBitmap(\n    …lse\n                    )");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        int height = createScaledBitmap.getHeight();
        int width = createScaledBitmap.getWidth();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        float f = valueOf.booleanValue() ? 0.7f : 1.2f;
        colorMatrix.set(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(valueOf.booleanValue() ? -16777216 : android.graphics.Color.rgb(220, 220, 220));
        paint.setAlpha(valueOf.booleanValue() ? 80 : 120);
        canvas.drawRect(0.0f, 0.0f, width, height, paint);
        if (z) {
            a.wr.k.setColor(a.wr.i);
        } else {
            a.wr.k.setColor(a.wr.j);
        }
        a.wr.f = a.b20.P(createBitmap, 16, false);
        lruCache.put(java.lang.Integer.valueOf(hashCode2), a.wr.f);
    }

    public static boolean p() {
        if (a.u71.b == null) {
            a.q10 q10Var = a.q10.f457a;
            if (a.wv.e(a.q10.t(), "root")) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a.gy.m("/data/powercfg.sh", true));
                if (a.wv.e(valueOf, java.lang.Boolean.TRUE)) {
                    a.u71.b = valueOf;
                    a.u71 u71Var = new a.u71();
                    u71Var.a();
                    new a.gb0(false);
                    a.lt0 lt0Var = new a.lt0();
                    lt0Var.m(new a.lt0(), "alias");
                    lt0Var.m(new a.lt0(), "presets");
                    a.lt0 lt0Var2 = new a.lt0();
                    java.lang.String str = a.b11.i;
                    a.lt0 lt0Var3 = new a.lt0();
                    lt0Var3.m(a.gb0.f(str), "call");
                    lt0Var2.m(lt0Var3, str);
                    java.lang.String str2 = a.b11.l;
                    a.lt0 lt0Var4 = new a.lt0();
                    lt0Var4.m(a.gb0.f(str2), "call");
                    lt0Var2.m(lt0Var4, str2);
                    java.lang.String str3 = a.b11.j;
                    a.lt0 lt0Var5 = new a.lt0();
                    lt0Var5.m(a.gb0.f(str3), "call");
                    lt0Var2.m(lt0Var5, str3);
                    java.lang.String str4 = a.b11.k;
                    a.lt0 lt0Var6 = new a.lt0();
                    lt0Var6.m(a.gb0.f(str4), "call");
                    lt0Var2.m(lt0Var6, str4);
                    java.lang.String str5 = a.b11.m;
                    a.lt0 lt0Var7 = new a.lt0();
                    lt0Var7.m(new a.jt0(), "call");
                    lt0Var2.m(lt0Var7, str5);
                    lt0Var.m(lt0Var2, "schemes");
                    lt0Var.m(a.gb0.d(), "apps");
                    lt0Var.m(a.gb0.d(), "games");
                    java.lang.String p = lt0Var.p(2);
                    a.wv.v(p, "json");
                    java.lang.String str6 = a.pe0.f434a;
                    java.nio.charset.Charset charset = a.bu.f53a;
                    byte[] bytes = p.getBytes(charset);
                    a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                    android.app.Application application = u71Var.f581a;
                    a.pe0.i(application, "profile.json", bytes);
                    if (a.gy.n("/data/powercfg.json")) {
                        byte[] bytes2 = a.nu0.d("/data/powercfg.json").getBytes(charset);
                        a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
                        a.pe0.i(application, "manifest.json", bytes2);
                    } else {
                        a.pe0.h(application, "outside.json", "manifest.json");
                    }
                    byte[] bytes3 = "sh /data/powercfg.sh \"$@\"".getBytes(charset);
                    a.wv.v(bytes3, "this as java.lang.String).getBytes(charset)");
                    a.pe0.i(application, "powercfg.sh", bytes3);
                    a.u71.c(u71Var);
                }
            }
        }
        return a.wv.e(a.u71.b, java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [a.gy, java.lang.Object] */
    public static void q(java.lang.String str) {
        a.wv.w(str, "app");
        if (a.me1.o.c(str)) {
            if (a.wv.e(str, "com.android.vending")) {
                a.gy.j((gy) (new java.lang.Object()));
                return;
            }
            java.lang.String str2 = "pm suspend " + str + "\nam force-stop " + str + " || am kill current " + str;
            a.wv.w(str2, "shell");
            a.q10 q10Var = a.q10.f457a;
            a.q10.l(str2);
        }
    }

    public static boolean r() {
        if (a.ai1.w("/sbin/busybox") || a.ai1.w("/system/xbin/busybox") || a.ai1.w("/system/sbin/busybox") || a.ai1.w("/system/bin/busybox") || a.ai1.w("/vendor/bin/busybox") || a.ai1.w("/vendor/xbin/busybox") || a.ai1.w("/odm/bin/busybox")) {
            return true;
        }
        try {
            java.lang.Runtime.getRuntime().exec("busybox --help").destroy();
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean s(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.accessibilityservice.AccessibilityService accessibilityService) {
        a.wv.w(accessibilityService, "service");
        android.graphics.Rect rect = new android.graphics.Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        android.graphics.Point point = new android.graphics.Point(((rect.right - rect.left) / 2) + rect.left, ((rect.bottom - rect.top) / 2) + rect.top);
        android.accessibilityservice.GestureDescription.Builder builder = new android.accessibilityservice.GestureDescription.Builder();
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(point.x, point.y);
        builder.addStroke(new android.accessibilityservice.GestureDescription.StrokeDescription(path, 0L, 20L));
        android.accessibilityservice.GestureDescription build = builder.build();
        a.wv.v(build, "gesture");
        return accessibilityService.dispatchGesture(build, new android.accessibilityservice.AccessibilityService.GestureResultCallback(), null);
    }

    public static void t(java.lang.String str) {
        a.wv.w(str, "app");
        if (a.me1.o.c(str)) {
            a.me1 me1Var = a.me1.p;
            if (me1Var != null) {
                me1Var.m(str);
            }
            if (a.wv.e(str, "com.android.vending") || a.wv.e(str, "com.google.android.googlequicksearchbox")) {
                java.lang.String i = a.ai1.i("pm enable com.google.android.gsf 2> /dev/null\npm enable com.google.android.gsf.login 2> /dev/null\npm enable com.google.android.gms 2> /dev/null\npm enable ", str, " 2> /dev/null\npm enable-user ", str, " 2> /dev/null\npm enable com.google.android.play.games 2> /dev/null\npm enable com.google.android.syncadapters.contacts 2> /dev/null");
                a.wv.w(i, "shell");
                a.q10 q10Var = a.q10.f457a;
                a.q10.l(i);
            }
            java.lang.String str2 = "pm unsuspend " + str + "\nsu 1000 -c 'pm unsuspend " + str + "' 2>/dev/null\npm enable " + str;
            a.wv.w(str2, "shell");
            a.q10 q10Var2 = a.q10.f457a;
            a.q10.l(str2);
        }
    }

    public static void u(android.content.Context context, a.lt0 lt0Var) {
        int i = a.x60.f681a;
        a.fs1.i(context, a.ai1.h("下载新版本", lt0Var.h("versionName"), " ？"), "更新内容：\n\n".concat(lt0Var.h("message")), new a.so(lt0Var, 7, context), null).b(false);
    }

    public final java.lang.String toString() {
        switch (this.f556a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return f();
            default:
                return super.toString();
        }
    }

    /* [修复] 从 smali 还原：tg1(II) 为 R8 合成构造器。
       净效果 c = (i∈{3,4,6,9..13,15..29}) ? i : 1 */
    public /* synthetic */ tg1(int i, int i2) {
        this(switch (i) {
            case 3, 4, 6, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 -> i;
            default -> 1;
        });
    }
}
