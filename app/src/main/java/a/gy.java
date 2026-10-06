package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class gy implements a.sy, a.tk1, a.a5, a.cr1 {

    public gy() {
    }

    public static final /* synthetic */ a.gy c = new a.gy();
    public static final /* synthetic */ a.gy d = new a.gy();
    public static final a.gy e = new a.gy();
    public static final /* synthetic */ a.gy f = new a.gy();
    public static final a.gy g = new a.gy();
    public static final a.gy h = new a.gy();
    public static final a.gy i = new a.gy();
    public static final a.gy j = new a.gy();
    public static final a.gy k = new a.gy();
    public static java.lang.String l = "";
    public static java.util.HashMap m = null;
    public static java.lang.Long n = null;
    public static boolean o = false;
    public static java.lang.Boolean p = null;
    public static float q = -1.0f;
    public static a.gy r;

    public gy(int[] iArr, android.animation.ValueAnimator valueAnimator) {
    }

    public static java.lang.String A(java.lang.String str, java.util.List list) {
        java.lang.Object obj;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (a.yi1.B2((java.lang.String) obj, str.concat("="))) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 != null ? str2.subSequence(str.length() + 1, str2.length()).toString() : "";
    }

    public static boolean C() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        a.wv.v(str, "MANUFACTURER");
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k2 = a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
        return a.wv.e(k2, "vivo") || a.wv.e(k2, "iqoo");
    }

    public static java.lang.CharSequence D(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "str");
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        java.lang.String lowerCase2 = str2.toLowerCase(locale);
        a.wv.v(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int m2 = a.yi1.m2(lowerCase, lowerCase2, 0, false, 6);
        if (m2 < 0) {
            return spannableString;
        }
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#0094ff")), m2, str2.length() + m2, 33);
        return spannableString;
    }

    public static java.lang.String E(double d2) {
        return (((int) (d2 / 6)) / 10.0d) + "h";
    }

    public static boolean F() {
        java.lang.String obj;
        java.lang.String property;
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root")) {
            if (a.ai1.w("/sys/class/kgsl/kgsl-3d0")) {
                return true;
            }
            java.lang.String L = a.q10.L("path-basic-info", "/sys/class/kgsl/kgsl-3d0", 10000L);
            return a.yi1.B2(L, "dir") || a.yi1.B2(L, "file");
        }
        try {
            property = java.lang.System.getProperty("ro.baseband");
        } catch (java.lang.Exception unused) {
        }
        if (property != null && property.length() != 0) {
            obj = a.yi1.G2(property).toString();
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String k2 = a.ai1.k(locale, "ENGLISH", obj, locale, "this as java.lang.String).toLowerCase(locale)");
            return !a.wv.e(k2, "msm") || a.wv.e(k2, "sdm");
        }
        a.q10 q10Var2 = a.q10.f457a;
        java.lang.String L2 = a.q10.L("get-prop", "ro.baseband", null);
        obj = a.wv.e(L2, "error") ? "" : a.yi1.G2(L2).toString();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String k22 = a.ai1.k(locale2, "ENGLISH", obj, locale2, "this as java.lang.String).toLowerCase(locale)");
        if (a.wv.e(k22, "msm")) {
        }
    }

    public static boolean G() {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("mt[0-9]{2,}");
        a.wv.v(compile, "compile(pattern)");
        return compile.matcher(z()).matches();
    }

    public static boolean H(java.lang.String str) {
        a.wv.w(str, "path");
        if (new java.io.File(str).exists()) {
            return true;
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("path-basic-info", str, 10000L);
        return a.yi1.B2(L, "dir") || a.yi1.B2(L, "file");
    }

    public static java.util.ArrayList I(java.lang.String str, boolean z) {
        java.util.ArrayList arrayList;
        a.wv.w(str, "path");
        a.wd0 L = L(str, "", z);
        return (L == null || (arrayList = (java.util.ArrayList) L.d) == null) ? new java.util.ArrayList() : arrayList;
    }

    public static boolean J(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "src");
        a.wv.w(str2, "dst");
        a.q10 q10Var = a.q10.f457a;
        return a.wv.e(a.q10.L("move", str + ":" + str2, null), "true");
    }

    public static java.lang.String K(java.lang.String str) {
        try {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
            a.wv.v(compile, "compile(pattern)");
            java.lang.String replaceAll = compile.matcher(str).replaceAll("\n");
            a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
            a.wv.v(compile2, "compile(pattern)");
            java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
            a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll2;
        } catch (java.lang.Exception e2) {
            android.util.Log.e("Dos2Unix", e2.getMessage());
            return "";
        }
    }

    public static a.wd0 L(java.lang.String str, java.lang.String str2, boolean z) {
        a.wv.w(str, "path");
        a.wv.w(str2, "suffix");
        a.q10 q10Var = a.q10.f457a;
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str, "dir");
        lt0Var.m(str2, "suffix");
        lt0Var.o("getSize", z);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "JSONObject().apply {\n   …ize)\n        }.toString()");
        java.lang.String L = a.q10.L("path-list", lt0Var2, java.lang.Long.valueOf(z ? 120000L : 10000L));
        if (L.length() <= 0 || a.wv.e(L, "error")) {
            return null;
        }
        try {
            return new a.wd0(new a.lt0(L));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.util.HashMap N(java.lang.String str) {
        a.lt0 lt0Var;
        a.wv.w(str, "path");
        try {
            a.q10 q10Var = a.q10.f457a;
            lt0Var = new a.lt0(a.q10.L("path-tree", str, 2000L));
        } catch (java.lang.Exception unused) {
            lt0Var = null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (lt0Var != null) {
            java.util.Iterator i2 = lt0Var.i();
            a.wv.v(i2, "tree.keys()");
            while (i2.hasNext()) {
                java.lang.String str2 = (java.lang.String) i2.next();
                java.lang.Object a2 = lt0Var.a(str2);
                if (a2 instanceof java.lang.String) {
                    hashMap.put(str + "/" + str2, a2);
                }
            }
        }
        return hashMap;
    }

    public static boolean O(android.content.Context context) {
        a.wv.w(context, "context");
        java.lang.Object systemService = context.getSystemService("accessibility");
        a.wv.t(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) systemService).getEnabledAccessibilityServiceList(-1).iterator();
        while (it.hasNext()) {
            java.lang.String id = it.next().getId();
            a.wv.v(id, "serviceInfo.id");
            if (a.yi1.h2(id, "AccessibilitySceneMode", false)) {
                return true;
            }
        }
        return false;
    }

    public static void P(android.content.SharedPreferences sharedPreferences) {
        java.lang.String[] strArr = (java.lang.String[]) a.yi1.y2(a.nu0.d("/data/swap_config.conf"), new java.lang.String[]{"\n"}).toArray(new java.lang.String[0]);
        if (strArr.length > 1) {
            R(strArr, "swap", java.lang.Boolean.valueOf(sharedPreferences.getBoolean("swap", false)));
            R(strArr, "swap_size", java.lang.Integer.valueOf(sharedPreferences.getInt("swap_size", 0)));
            R(strArr, "swap_priority", java.lang.Integer.valueOf(sharedPreferences.getInt("swap_priority", 0)));
            R(strArr, "swap_use_loop", java.lang.Boolean.valueOf(sharedPreferences.getBoolean("swap_use_loop", false)));
            R(strArr, "zram", java.lang.Boolean.valueOf(sharedPreferences.getBoolean("zram", false)));
            R(strArr, "zram_size", java.lang.Integer.valueOf(sharedPreferences.getInt("zram_size", 0)));
            R(strArr, "comp_algorithm", sharedPreferences.getString("comp_algorithm", "lzo"));
            R(strArr, "swappiness", java.lang.Integer.valueOf(sharedPreferences.getInt("swappiness", 100)));
            R(strArr, "extra_free_kbytes", java.lang.Integer.valueOf(sharedPreferences.getInt("extra_free_kbytes", 29615)));
            R(strArr, "watermark_scale_factor", java.lang.Integer.valueOf(sharedPreferences.getInt("watermark_scale", 100)));
            W("/data/swap_config.conf", a.op.P1(strArr, "\n"));
        }
    }

    public static void R(java.lang.String[] strArr, java.lang.String str, java.lang.Object obj) {
        java.lang.String concat = str.concat("=");
        java.lang.String str2 = concat + obj;
        int i2 = 0;
        for (java.lang.String str3 : strArr) {
            if (a.yi1.B2(str3, concat)) {
                strArr[i2] = str2;
                return;
            }
            i2++;
        }
    }

    public static void S(android.content.Context context) {
        java.lang.String str;
        a.wv.w(context, "context");
        java.lang.String str2 = context.getPackageName() + "/" + com.omarea.vtools.AccessibilitySceneMode.class.getName();
        a.wv.w(str2, "serviceName");
        a.q10 q10Var = a.q10.f457a;
        java.lang.String k2 = a.q10.k(2000L, "settings get secure enabled_accessibility_services");
        if (a.yi1.g2(k2, str2)) {
            str = k2;
        } else if (k2 == null || k2.length() == 0) {
            str = str2;
        } else {
            str = k2 + ":" + str2;
        }
        java.lang.String str3 = "settings put secure enabled_accessibility_services " + str + "\nsettings put secure accessibility_enabled 1";
        a.wv.w(str3, "cmd");
        a.q10 q10Var2 = a.q10.f457a;
        a.q10.k(2000L, str3);
    }

    public static int U(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return Integer.MAX_VALUE;
        }
        java.lang.Integer c2 = a.wi1.c2(str);
        if (c2 != null) {
            return c2.intValue();
        }
        java.util.LinkedHashMap linkedHashMap = a.q71.g;
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(a.ai1.k(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)"));
        if (num == null) {
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }

    public static boolean W(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "path");
        a.wv.w(str2, "text");
        try {
            java.io.File file = new java.io.File(str);
            java.nio.charset.Charset charset = a.bu.f53a;
            a.wv.w(charset, "charset");
            byte[] bytes = str2.getBytes(charset);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            a.wv.V1(file, bytes);
            return true;
        } catch (java.lang.Exception unused) {
            a.q10 q10Var = a.q10.f457a;
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(str, "path");
            lt0Var.m(str2, "text");
            java.lang.String lt0Var2 = lt0Var.toString();
            a.wv.v(lt0Var2, "JSONObject().apply {\n   …ext)\n        }.toString()");
            return a.wv.e(a.q10.L("text-write", lt0Var2, 20000L), "true");
        }
    }

    public static void Y(java.io.File file, java.lang.String str, java.util.zip.ZipOutputStream zipOutputStream) {
        if (file.isHidden()) {
            return;
        }
        if (file.isDirectory()) {
            if (!str.isEmpty()) {
                if (str.endsWith("/")) {
                    zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(str));
                    zipOutputStream.closeEntry();
                } else {
                    zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(str.concat("/")));
                    zipOutputStream.closeEntry();
                }
            }
            for (java.io.File file2 : file.listFiles()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str.isEmpty() ? "" : str.concat("/"));
                sb.append(file2.getName());
                Y(file2, sb.toString(), zipOutputStream);
            }
            return;
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry(str));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read < 0) {
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, read);
        }
    }

    public static void e(android.widget.SeekBar seekBar, android.widget.TextView textView, a.o4 o4Var) {
        seekBar.setOnSeekBarChangeListener(new a.n41(textView, o4Var, 1));
        textView.setText((java.lang.CharSequence) o4Var.i(java.lang.Integer.valueOf(seekBar.getProgress())));
    }

    public static java.lang.String g(long j2) {
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm").format(java.lang.Long.valueOf(j2));
        a.wv.v(format, "SimpleDateFormat(\"yyyy-MM-dd HH:mm\").format(time)");
        return format;
    }

    public static boolean h(java.lang.String str) {
        a.wv.w(str, "path");
        if (str.length() <= 0) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        if (file.isFile()) {
            try {
                if (file.canWrite()) {
                    if (file.isDirectory() ? a.qe0.a2(file) : file.delete()) {
                        return true;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        a.q10 q10Var = a.q10.f457a;
        return a.wv.e(a.q10.L("path-remove", str, 60000L), "true");
    }

    public static boolean i(java.lang.String str) {
        a.wv.w(str, "path");
        java.io.File file = new java.io.File(str);
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        a.q10 q10Var = a.q10.f457a;
        return a.yi1.B2(a.q10.L("path-basic-info", str, 10000L), "dir");
    }

    public static void j(a.gy gyVar) {
        java.lang.String h2 = a.ai1.h("pm disable com.google.android.gsf 2> /dev/null\npm disable com.google.android.gsf.login 2> /dev/null\npm disable com.google.android.gms 2> /dev/null\npm disable ", "com.android.vending", " 2> /dev/null\npm disable com.google.android.play.games 2> /dev/null\npm disable com.google.android.syncadapters.contacts 2> /dev/null");
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "adb")) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("disable");
            a.wv.v(compile, "compile(pattern)");
            a.wv.w(h2, "input");
            h2 = compile.matcher(h2).replaceAll("disable-user");
            a.wv.v(h2, "nativePattern.matcher(in…).replaceAll(replacement)");
        }
        a.wv.w(h2, "shell");
        a.q10.l(h2);
    }

    public static a.wd0 l(java.lang.String str) {
        a.wv.w(str, "shell");
        a.wd0 wd0Var = new a.wd0();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("exec-shell2", str, null);
        if (a.wv.e(L, "error")) {
            wd0Var.d = "error";
        } else {
            try {
                a.lt0 lt0Var = new a.lt0(L);
                wd0Var.f658a = lt0Var.h("stdout");
                wd0Var.b = lt0Var.h("stderr");
                wd0Var.d = lt0Var.h("error");
                wd0Var.c = lt0Var.b("succeed");
            } catch (java.lang.Exception unused) {
            }
        }
        return wd0Var;
    }

    public static boolean m(java.lang.String str, boolean z) {
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("path-basic-info", str, 10000L);
        if (!a.yi1.B2(L, "file")) {
            return false;
        }
        if (!z) {
            return true;
        }
        java.lang.String substring = L.substring(a.yi1.l2(L, ',', false, 6) + 1);
        a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
        return java.lang.Long.parseLong(substring) > 0;
    }

    public static boolean n(java.lang.String str) {
        a.wv.w(str, "path");
        java.io.File file = new java.io.File(str);
        if (file.exists() && file.isFile()) {
            return true;
        }
        return m(str, false);
    }

    public static java.lang.String o(double d2) {
        if (d2 >= 1440.0d) {
            double d3 = 1440;
            int i2 = (int) ((d2 % d3) / 60);
            return ((int) (d2 / d3)) + "d" + (i2 > 0 ? a.ai1.c(i2, "h") : "");
        }
        if (d2 > 60.0d) {
            double d4 = 60;
            int i3 = (int) (d2 % d4);
            return ((int) (d2 / d4)) + "h" + (i3 > 0 ? a.ai1.c(i3, "m") : "");
        }
        if (d2 == 0.0d) {
            return "0";
        }
        if (d2 < 1.0d) {
            return a.ai1.c((int) (d2 * 60), "s");
        }
        int i4 = (int) ((d2 % 1) * 60);
        return ((int) d2) + "m" + (i4 > 0 ? a.ai1.c(i4, "s") : "");
    }

    public static double q(android.content.Context context) {
        try {
            return (int) ((java.lang.Double) java.lang.Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new java.lang.Class[0]).invoke(java.lang.Class.forName("com.android.internal.os.PowerProfile").getConstructor(android.content.Context.class).newInstance(context), new java.lang.Object[0])).doubleValue();
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static int r(java.lang.String[] strArr) {
        if (strArr[0].equals("cpu")) {
            return -1;
        }
        return java.lang.Integer.parseInt(strArr[0].substring(3));
    }

    public static java.util.HashMap s() {
        long r11 = 0L;
        double r14 = 0.0d;
        java.lang.String[] strArr;
        synchronized ("/proc/stat") {
            try {
                if (m != null && java.lang.System.currentTimeMillis() - n.longValue() < 500) {
                    return m;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String t = t();
                if (t.equals("error") || !t.startsWith("cpu")) {
                    return hashMap;
                }
                try {
                    if (l.isEmpty()) {
                        l = t;
                        java.lang.Thread.sleep(100L);
                        return s();
                    }
                    java.lang.String[] split = t.split("\n");
                    java.lang.String[] split2 = l.split("\n");
                    int length = split.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < length) {
                        java.lang.String[] split3 = split[i3].replaceAll(" {2}", " ").split(" ");
                        int length2 = split2.length;
                        int i4 = i2;
                        while (true) {
                            if (i4 >= length2) {
                                strArr = null;
                                break;
                            }
                            java.lang.String str = split2[i4];
                            if (str.startsWith(split3[i2] + " ")) {
                                strArr = str.replaceAll(" {2}", " ").split(" ");
                                break;
                            }
                            i4++;
                        }
                        if (strArr == null || strArr.length == 0) {
                            hashMap.put(java.lang.Integer.valueOf(r(split3)), java.lang.Double.valueOf(0.0d));
                        } else {
                            long j2 = 0;
                            if (split3.length == 11) {
                                for (int i5 = 1; i5 < 8; i5++) {
                                    j2 = java.lang.Long.parseLong(split3[i5]) + j2;
                                }
                            }
                            long parseLong = java.lang.Long.parseLong(split3[5]) + java.lang.Long.parseLong(split3[4]);
                            long j3 = 0;
                            if (strArr.length == 11) {
                                for (int i6 = 1; i6 < 8; i6++) {
                                    j3 = java.lang.Long.parseLong(strArr[i6]) + j3;
                                }
                            }
                            long parseLong2 = java.lang.Long.parseLong(strArr[5]) + java.lang.Long.parseLong(strArr[4]);
                            if (j2 - j3 == 0) {
                                hashMap.put(java.lang.Integer.valueOf(r(split3)), java.lang.Double.valueOf(0.0d));
                            } else {
                                if (parseLong - parseLong2 < 1) {
                                    hashMap.put(java.lang.Integer.valueOf(r(split3)), java.lang.Double.valueOf(100.0d));
                                } else {
                                    hashMap.put(java.lang.Integer.valueOf(r(split3)), java.lang.Double.valueOf(((int) ((100.0d - ((r14 * 100.0d) / r11)) * 1000.0d)) / 1000.0d));
                                }
                            }
                        }
                        i3++;
                        i2 = 0;
                    }
                    java.lang.String str2 = l;
                    l = "";
                    n = 0L;
                    m = null;
                    java.util.Iterator it = hashMap.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((java.lang.Double) it.next()).doubleValue() > 0.0d) {
                            l = t;
                            n = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                            m = hashMap;
                            break;
                        }
                        android.util.Log.e("@Scene - prev", str2);
                        android.util.Log.e("@Scene - current", t);
                    }
                    return hashMap;
                } catch (java.lang.Exception e2) {
                    l = "";
                    n = 0L;
                    m = null;
                    android.util.Log.e("@Scene", t + "\n" + e2.getMessage());
                    return hashMap;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static java.lang.String t() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String[] split = a.nu0.d("/proc/stat").split("\n");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : split) {
            if (str.startsWith("cpu")) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r0.equals("cliffsp") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        r0 = "cliffs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        if (r0.equals("cliffs7") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r0.equals("pineapplep") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
    
        r0 = "pineapple";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r0.equals("sm8650") == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.u():java.lang.String");
    }

    public static boolean v() {
        java.lang.String obj;
        java.lang.String property;
        if (p == null) {
            if (n("/data/swap_config.conf")) {
                try {
                    property = java.lang.System.getProperty("vtools.swap.controller");
                } catch (java.lang.Exception unused) {
                }
                if (property != null && property.length() != 0) {
                    obj = a.yi1.G2(property).toString();
                    p = java.lang.Boolean.valueOf(!a.wv.e(obj, "magisk") || a.wv.e(obj, "module"));
                }
                a.q10 q10Var = a.q10.f457a;
                java.lang.String L = a.q10.L("get-prop", "vtools.swap.controller", null);
                obj = a.wv.e(L, "error") ? "" : a.yi1.G2(L).toString();
                p = java.lang.Boolean.valueOf(!a.wv.e(obj, "magisk") || a.wv.e(obj, "module"));
            } else {
                p = java.lang.Boolean.FALSE;
            }
        }
        java.lang.Boolean bool = p;
        a.wv.s(bool);
        return bool.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        r2 = java.lang.System.getProperty("ro.product.marketname");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c5, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cb, code lost:
    
        if (r2.length() != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
    
        r1 = a.yi1.G2(r2).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r0.equals("vivo") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        r2 = java.lang.System.getProperty("ro.vivo.market.name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        if (r2.length() != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        r1 = a.yi1.G2(r2).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003a, code lost:
    
        if (r0.equals("poco") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0044, code lost:
    
        if (r0.equals("iqoo") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r0.equals("xiaomi") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r0.equals("redmi") == false) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String w() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.w():java.lang.String");
    }

    public static a.nb1 x() {
        return (a.nb1) a.nb1.d.a();
    }

    public static boolean y(android.content.Context context) {
        java.util.HashSet hashSet;
        java.lang.Object obj = a.u21.b;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a.u21.b) {
            if (string != null) {
                try {
                    if (!string.equals(a.u21.c)) {
                        java.lang.String[] split = string.split(":", -1);
                        java.util.HashSet hashSet2 = new java.util.HashSet(split.length);
                        for (java.lang.String str : split) {
                            android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        a.u21.d = hashSet2;
                        a.u21.c = string;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            hashSet = a.u21.d;
        }
        a.wv.v(hashSet, "getEnabledListenerPackages(context)");
        return hashSet.contains(context.getPackageName());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String z() {
        /*
            java.lang.String r0 = "error"
            java.lang.String r1 = a.wv.L
            java.lang.String r2 = ""
            if (r1 != 0) goto Lcd
            java.lang.String r1 = "ro.board.platform"
            java.lang.String r3 = java.lang.System.getProperty(r1)     // Catch: java.lang.Exception -> L20
            if (r3 == 0) goto L20
            int r4 = r3.length()     // Catch: java.lang.Exception -> L20
            if (r4 != 0) goto L17
            goto L20
        L17:
            java.lang.CharSequence r3 = a.yi1.G2(r3)     // Catch: java.lang.Exception -> L20
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L20
            goto L39
        L20:
            a.q10 r3 = a.q10.f457a
            java.lang.String r3 = "get-prop"
            r4 = 0
            java.lang.String r1 = a.q10.L(r3, r1, r4)
            boolean r3 = a.wv.e(r1, r0)
            if (r3 == 0) goto L31
            r1 = r2
            goto L39
        L31:
            java.lang.CharSequence r1 = a.yi1.G2(r1)
            java.lang.String r1 = r1.toString()
        L39:
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r4 = "ENGLISH"
            java.lang.String r5 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r1 = a.ai1.k(r3, r4, r1, r3, r5)
            int r3 = r1.length()
            if (r3 <= 0) goto Lcd
            int r3 = r1.hashCode()
            switch(r3) {
                case -1065597082: goto La8;
                case -1065597053: goto L84;
                case -795277737: goto L76;
                case -57782290: goto L5f;
                case 3322040: goto L51;
                default: goto L50;
            }
        L50:
            goto Lb0
        L51:
            java.lang.String r0 = "lito"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            goto Lb0
        L5a:
            java.lang.String r0 = u()
            return r0
        L5f:
            java.lang.String r0 = "lahaina"
            boolean r3 = r1.equals(r0)
            if (r3 != 0) goto L68
            goto Lb0
        L68:
            java.lang.String r1 = u()
            java.lang.String r2 = "sm8350"
            boolean r2 = a.wv.e(r1, r2)
            if (r2 == 0) goto L75
            return r0
        L75:
            return r1
        L76:
            java.lang.String r0 = "waipio"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7f
            goto Lb0
        L7f:
            java.lang.String r0 = "taro"
            a.wv.L = r0
            goto Lcd
        L84:
            java.lang.String r3 = "mt6893"
            boolean r4 = r1.equals(r3)
            if (r4 == 0) goto Lb0
            a.nu0 r1 = a.nu0.f395a
            java.lang.String r1 = "/sys/devices/system/cpu/cpu7/cpufreq/scaling_available_frequencies"
            java.lang.String r1 = a.nu0.d(r1)
            boolean r0 = a.wv.e(r1, r0)
            if (r0 != 0) goto La5
            java.lang.String r0 = "3000000"
            boolean r0 = a.yi1.g2(r1, r0)
            if (r0 == 0) goto La3
            goto La5
        La3:
            java.lang.String r3 = "mt6891"
        La5:
            a.wv.L = r3
            goto Lcd
        La8:
            java.lang.String r3 = "mt6885"
            boolean r4 = r1.equals(r3)
            if (r4 != 0) goto Lb3
        Lb0:
            a.wv.L = r1
            goto Lcd
        Lb3:
            a.nu0 r1 = a.nu0.f395a
            java.lang.String r1 = "/sys/devices/system/cpu/cpu4/cpufreq/scaling_available_frequencies"
            java.lang.String r1 = a.nu0.d(r1)
            boolean r0 = a.wv.e(r1, r0)
            if (r0 != 0) goto Lc9
            java.lang.String r0 = "2600000"
            boolean r0 = a.yi1.g2(r1, r0)
            if (r0 == 0) goto Lcb
        Lc9:
            java.lang.String r3 = "mt6889"
        Lcb:
            a.wv.L = r3
        Lcd:
            java.lang.String r0 = a.wv.L
            if (r0 != 0) goto Ld2
            goto Ld3
        Ld2:
            r2 = r0
        Ld3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.z():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(a.ey r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.ee0
            if (r0 == 0) goto L14
            r0 = r8
            a.ee0 r0 = (a.ee0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            a.ee0 r0 = new a.ee0
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r5.f
            a.dz r0 = a.dz.c
            int r1 = r5.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            a.b20.q1(r8)
            a.q10 r1 = a.q10.f457a
            java.lang.String r8 = "share-status"
            java.lang.String r3 = ""
            r4 = 0
            r6 = 12
            r5.h = r2
            r2 = r8
            java.lang.Object r8 = a.q10.K(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L47
            return r0
        L47:
            java.lang.String r8 = (java.lang.String) r8
            a.rd0 r8 = a.fs1.p(r8)     // Catch: java.lang.Exception -> L4e
            goto L4f
        L4e:
            r8 = 0
        L4f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.B(a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(a.ey r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.fe0
            if (r0 == 0) goto L14
            r0 = r8
            a.fe0 r0 = (a.fe0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            a.fe0 r0 = new a.fe0
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r5.f
            a.dz r0 = a.dz.c
            int r1 = r5.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r8)     // Catch: java.lang.Exception -> L4e
            goto L47
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            a.b20.q1(r8)
            a.q10 r1 = a.q10.f457a     // Catch: java.lang.Exception -> L4e
            java.lang.String r8 = "pull-offer"
            java.lang.String r3 = ""
            r4 = 0
            r6 = 12
            r5.h = r2     // Catch: java.lang.Exception -> L4e
            r2 = r8
            java.lang.Object r8 = a.q10.K(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L4e
            if (r8 != r0) goto L47
            return r0
        L47:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L4e
            a.y21 r8 = a.fs1.q(r8)     // Catch: java.lang.Exception -> L4e
            goto L4f
        L4e:
            r8 = 0
        L4f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.M(a.ey):java.lang.Object");
    }

    public void Q(float f2, a.pm pmVar) {
        a.nc1 nc1Var = (a.nc1) ((android.graphics.drawable.Drawable) pmVar.d);
        boolean useCompatPadding = ((androidx.cardview.widget.CardView) pmVar.e).getUseCompatPadding();
        boolean preventCornerOverlap = ((androidx.cardview.widget.CardView) pmVar.e).getPreventCornerOverlap();
        if (f2 != nc1Var.e || nc1Var.f != useCompatPadding || nc1Var.g != preventCornerOverlap) {
            nc1Var.e = f2;
            nc1Var.f = useCompatPadding;
            nc1Var.g = preventCornerOverlap;
            nc1Var.b(null);
            nc1Var.invalidateSelf();
        }
        if (!((androidx.cardview.widget.CardView) pmVar.e).getUseCompatPadding()) {
            pmVar.G(0, 0, 0, 0);
            return;
        }
        a.nc1 nc1Var2 = (a.nc1) ((android.graphics.drawable.Drawable) pmVar.d);
        float f3 = nc1Var2.e;
        float f4 = nc1Var2.f377a;
        int ceil = (int) java.lang.Math.ceil(a.oc1.a(f3, f4, ((androidx.cardview.widget.CardView) pmVar.e).getPreventCornerOverlap()));
        int ceil2 = (int) java.lang.Math.ceil(a.oc1.b(f3, f4, ((androidx.cardview.widget.CardView) pmVar.e).getPreventCornerOverlap()));
        pmVar.G(ceil, ceil2, ceil, ceil2);
    }

    public void T(a.kk0 kk0Var, java.lang.Runnable runnable) {
        a.wv.M0(a.wv.b(a.z80.b), null, new a.b1(this, kk0Var, runnable, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(java.lang.String r8, java.lang.String r9, a.bp0 r10, a.ey r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof a.ic1
            if (r0 == 0) goto L14
            r0 = r11
            a.ic1 r0 = (a.ic1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.ic1 r0 = new a.ic1
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f
            a.dz r0 = a.dz.c
            int r1 = r6.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r11)
            goto L5c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            a.b20.q1(r11)
            a.zt0 r11 = new a.zt0
            a.jc1 r1 = new a.jc1
            r3 = 0
            r1.<init>(r3, r8, r9)
            r11.<init>(r1)
            a.q10 r1 = a.q10.f457a
            java.lang.String r8 = "path-unzip"
            java.lang.String r3 = r11.toString()
            java.lang.String r9 = "task.toString()"
            a.wv.v(r3, r9)
            r4 = 0
            a.gc1 r5 = new a.gc1
            r5.<init>(r10, r2)
            r6.h = r2
            r2 = r8
            java.lang.Object r11 = r1.J(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L5c
            return r0
        L5c:
            java.lang.String r8 = "true"
            boolean r8 = a.wv.e(r11, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.V(java.lang.String, java.lang.String, a.bp0, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object X(java.util.ArrayList r8, java.lang.String r9, a.bp0 r10, a.ey r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof a.kc1
            if (r0 == 0) goto L14
            r0 = r11
            a.kc1 r0 = (a.kc1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.kc1 r0 = new a.kc1
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f
            a.dz r0 = a.dz.c
            int r1 = r6.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r11)
            goto L5d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            a.b20.q1(r11)
            a.zt0 r11 = new a.zt0
            a.lc1 r1 = new a.lc1
            r3 = 0
            r1.<init>(r8, r3, r9)
            r11.<init>(r1)
            a.q10 r1 = a.q10.f457a
            java.lang.String r8 = "path-zip"
            java.lang.String r3 = r11.toString()
            java.lang.String r9 = "task.toString()"
            a.wv.v(r3, r9)
            r4 = 0
            a.gc1 r5 = new a.gc1
            r9 = 2
            r5.<init>(r10, r9)
            r6.h = r2
            r2 = r8
            java.lang.Object r11 = r1.J(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L5d
            return r0
        L5d:
            java.lang.String r8 = "true"
            boolean r8 = a.wv.e(r11, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.X(java.util.ArrayList, java.lang.String, a.bp0, a.ey):java.lang.Object");
    }

    @Override // a.a5
    public void a() {
    }

    public a.zq1 b(java.lang.Class cls) {
        try {
            java.lang.Object newInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            a.wv.v(newInstance, "{\n                modelC…wInstance()\n            }");
            return (a.zq1) newInstance;
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (java.lang.InstantiationException e3) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (java.lang.NoSuchMethodException e4) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    @Override // a.tk1
    public int c(java.lang.CharSequence charSequence, int i2) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = java.lang.Character.getDirectionality(charSequence.charAt(i4));
            a.vk1 vk1Var = a.wk1.f667a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 0;
            }
            i3 = 1;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r8, java.lang.String r9, a.ec1 r10, a.bp0 r11, a.ey r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof a.fc1
            if (r0 == 0) goto L14
            r0 = r12
            a.fc1 r0 = (a.fc1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.fc1 r0 = new a.fc1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f
            a.dz r0 = a.dz.c
            int r1 = r6.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r12)
            goto L5d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            a.b20.q1(r12)
            a.zt0 r12 = new a.zt0
            a.hc1 r1 = new a.hc1
            r3 = 0
            r1.<init>(r8, r9, r10, r3)
            r12.<init>(r1)
            a.q10 r1 = a.q10.f457a
            java.lang.String r8 = "path-copy"
            java.lang.String r9 = r12.toString()
            java.lang.String r10 = "task.toString()"
            a.wv.v(r9, r10)
            r4 = 0
            a.gc1 r5 = new a.gc1
            r5.<init>(r11, r3)
            r6.h = r2
            r2 = r8
            r3 = r9
            java.lang.Object r12 = r1.J(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5d
            return r0
        L5d:
            java.lang.String r8 = "true"
            boolean r8 = a.wv.e(r12, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.f(java.lang.String, java.lang.String, a.ec1, a.bp0, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.ey r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.k(a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[EDGE_INSN: B:47:0x015b->B:38:0x015b BREAK  A[LOOP:2: B:32:0x0147->B:46:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r12, a.ey r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gy.p(java.lang.String, a.ey):java.lang.Object");
    }
}
