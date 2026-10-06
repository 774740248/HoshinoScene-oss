package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ls {

    public ls() {
    }

    public static final java.util.ArrayList c = new java.util.ArrayList();
    public static int d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final com.omarea.vtools.SceneJNI f326a = new com.omarea.vtools.SceneJNI();
    public int b = -1;

    public static void b(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (str.equals("touch_boost")) {
                a.q10 q10Var = a.q10.f457a;
                a.q10.l("stop ".concat(str));
            } else {
                a.nu0 nu0Var = a.nu0.f395a;
                a.nu0.i(str, "0");
            }
        }
        if (a.gy.G()) {
            a.q10 q10Var2 = a.q10.f457a;
            a.q10.z(new java.lang.String[]{"@mtk_reset"});
        } else if (a.gy.F()) {
            a.q10 q10Var3 = a.q10.f457a;
            a.q10.z(new java.lang.String[]{"@msm_reset"});
        }
    }

    public static java.lang.String[] c(int i) {
        if (i >= d().size()) {
            return new java.lang.String[0];
        }
        java.lang.String str = "cpu" + ((java.lang.String[]) d().get(i))[0];
        java.lang.String replace = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_frequencies".replace("cpu0", str);
        if (!a.ai1.w(replace)) {
            if (!new java.io.File(a.ai1.e("/sys/devices/system/cpu/cpufreq/mp-cpufreq/cluster", i, "_freq_table")).exists()) {
                return new java.lang.String[0];
            }
            a.nu0 nu0Var = a.nu0.f395a;
            return a.nu0.d("/sys/devices/system/cpu/cpufreq/mp-cpufreq/cluster" + i + "_freq_table").split(" +");
        }
        a.nu0 nu0Var2 = a.nu0.f395a;
        java.lang.String[] split = a.nu0.d(replace).split(" +");
        if (split.length < 2) {
            return new java.lang.String[0];
        }
        java.lang.String replace2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_boost_frequencies".replace("cpu0", str);
        if (!a.ai1.w(replace2)) {
            return split;
        }
        java.lang.String trim = a.nu0.d(replace2).trim();
        if (trim.isEmpty()) {
            return split;
        }
        java.lang.String[] split2 = trim.split(" +");
        java.lang.String[] strArr = new java.lang.String[split.length + split2.length];
        java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
        java.lang.System.arraycopy(split2, 0, strArr, split.length, split2.length);
        return strArr;
    }

    public static java.util.ArrayList d() {
        java.util.ArrayList arrayList = c;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    int i = 0;
                    while (true) {
                        java.lang.String replace = "/sys/devices/system/cpu/cpu0/cpufreq/related_cpus".replace("0", "" + i);
                        if (!new java.io.File(replace).exists()) {
                            break;
                        }
                        a.nu0 nu0Var = a.nu0.f395a;
                        java.lang.String trim = a.nu0.d(replace).trim();
                        if (trim.isEmpty()) {
                            return e();
                        }
                        java.lang.String[] split = trim.split(" +");
                        int parseInt = java.lang.Integer.parseInt(split[split.length - 1]) + 1;
                        c.add(split);
                        i = parseInt;
                    }
                }
                return c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static java.util.ArrayList e() {
        int parseInt;
        int i = 0;
        java.util.Iterator it = a.gy.I("/sys/devices/system/cpu", false).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((a.mc1) it.next()).b.matches("cpu\\d")) {
                i2++;
            }
        }
        java.util.ArrayList arrayList = c;
        arrayList.clear();
        java.util.Iterator it2 = a.gy.I("/sys/devices/system/cpu/cpufreq", false).iterator();
        while (it2.hasNext()) {
            java.lang.String str = ((a.mc1) it2.next()).b;
            if (str.startsWith("policy") && (parseInt = java.lang.Integer.parseInt(str.substring(6))) != 0) {
                java.lang.String str2 = "";
                while (i < parseInt) {
                    str2 = str2 + i;
                    i++;
                }
                arrayList.add(str2.split(""));
                i = parseInt;
            }
        }
        if (i2 != 0) {
            java.lang.String str3 = "";
            while (i < i2) {
                str3 = str3 + i;
                i++;
            }
            arrayList.add(str3.split(""));
        }
        return arrayList;
    }

    public static int f() {
        if (d < 1) {
            java.util.Iterator it = d().iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((java.lang.String[]) it.next()).length;
            }
            d = i;
        }
        return d;
    }

    public static boolean[] g() {
        int f = f();
        java.lang.String[] strArr = new java.lang.String[f];
        boolean[] zArr = new boolean[f];
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d2 = a.nu0.d("/sys/devices/system/cpu/online");
        if (d2.isEmpty() || d2.equals("error")) {
            for (int i = 0; i < f; i++) {
                strArr[i] = a.ai1.e("/sys/devices/system/cpu/cpu", i, "/online");
            }
            a.nu0 nu0Var2 = a.nu0.f395a;
            int i2 = 0;
            for (java.lang.String str : a.nu0.g(strArr)) {
                zArr[i2] = str.startsWith("1");
                i2++;
            }
            return zArr;
        }
        java.lang.String[] split = d2.split(",");
        for (java.lang.String str2 : split) {
            if (str2.contains("-")) {
                java.lang.String[] split2 = str2.split("-");
                int parseInt = java.lang.Integer.parseInt(split2[1]);
                for (int parseInt2 = java.lang.Integer.parseInt(split2[0]); parseInt2 <= parseInt; parseInt2++) {
                    zArr[parseInt2] = true;
                }
            } else {
                zArr[java.lang.Integer.parseInt(str2)] = true;
            }
        }
        return zArr;
    }

    public static int h(int i) {
        a.nu0 nu0Var = a.nu0.f395a;
        try {
            return java.lang.Integer.parseInt(a.nu0.d("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq"));
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static java.lang.String j(int i) {
        if (i >= d().size()) {
            return "";
        }
        java.lang.String str = "cpu" + ((java.lang.String[]) d().get(i))[0];
        a.nu0 nu0Var = a.nu0.f395a;
        return a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq".replace("cpu0", str));
    }

    public static java.lang.String k(int i) {
        if (i >= d().size()) {
            return "";
        }
        java.lang.String str = "cpu" + ((java.lang.String[]) d().get(i))[0];
        a.nu0 nu0Var = a.nu0.f395a;
        return a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq".replace("cpu0", str));
    }

    public static java.util.HashMap l(int i) {
        java.lang.String d2 = a.ii1.d("cpu", i);
        a.nu0 nu0Var = a.nu0.f395a;
        return a.gy.N("/sys/devices/system/cpu/cpu0/".replace("cpu0", d2) + "cpufreq/" + a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor".replace("cpu0", d2)));
    }

    public static java.lang.String m(int i) {
        if (i >= d().size()) {
            return "";
        }
        java.lang.String str = "cpu" + ((java.lang.String[]) d().get(i))[0];
        a.nu0 nu0Var = a.nu0.f395a;
        return a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor".replace("cpu0", str));
    }

    public static java.lang.String n(int i) {
        if (i >= d().size()) {
            return null;
        }
        java.lang.String str = "cpu" + ((java.lang.String[]) d().get(i))[0];
        a.nu0 nu0Var = a.nu0.f395a;
        return "/sys/devices/system/cpu/cpu0/".replace("cpu0", str) + "cpufreq/" + a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor".replace("cpu0", str));
    }

    public static java.lang.String o(java.lang.String str) {
        java.util.Iterator it = d().iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + ((java.lang.String[]) it.next()).length + str;
        }
        return (str2.isEmpty() || str.isEmpty()) ? str2 : str2.substring(0, str2.length() - str.length());
    }

    public static java.lang.String[] p() {
        java.lang.String[] strArr = {"/sys/module/cpufreq_bouncing/parameters/enable", "/sys/module/migt/parameters/glk_freq_limit_walt", "/sys/devices/platform/soc/soc:oplus-omrg/oplus-omrg0/ruler_enable"};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 3; i++) {
            java.lang.String str = strArr[i];
            a.nu0 nu0Var = a.nu0.f395a;
            java.lang.String lowerCase = a.nu0.d(str).toLowerCase();
            if (lowerCase.equals("1") || lowerCase.equals("y") || lowerCase.equals("enabled")) {
                arrayList.add(str);
            }
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("pidof", "touch_boost", null);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9]+");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(L, "input");
        if (compile.matcher(L).matches()) {
            arrayList.add("touch_boost");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static java.lang.String q(int i) {
        java.util.ArrayList d2 = d();
        if (i >= d2.size()) {
            return "";
        }
        java.lang.String str = "cpu" + ((java.lang.String[]) d2.get(i))[0];
        a.nu0 nu0Var = a.nu0.f395a;
        return a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state".replace("cpu0", str));
    }

    public static java.util.HashMap r(int i) {
        int indexOf;
        java.util.HashMap hashMap = new java.util.HashMap(30);
        java.lang.String q = q(i);
        if (q.isEmpty()) {
            return hashMap;
        }
        for (java.lang.String str : q.split("\n")) {
            java.lang.String trim = str.trim();
            if (!trim.isEmpty() && (indexOf = trim.indexOf(32)) != -1) {
                try {
                    hashMap.put(java.lang.Integer.valueOf(java.lang.Integer.parseInt(trim.substring(0, indexOf))), java.lang.Long.valueOf(java.lang.Long.parseLong(trim.substring(indexOf + 1)) * 10));
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        return hashMap;
    }

    public static void s(int i) {
        if (a.gy.n("/proc/cpudvfs/cpufreq_debug")) {
            java.lang.String[] c2 = c(i);
            java.lang.String str = ((java.lang.String[]) d().get(i))[0] + " " + c2[c2.length - 1] + " " + c2[0];
            a.nu0 nu0Var = a.nu0.f395a;
            a.nu0.l("/proc/cpudvfs/cpufreq_debug", str);
            return;
        }
        if (a.gy.n("/proc/powerhal_cpu_ctrl/perfserv_freq")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int size = d().size();
            for (int i2 = 0; i2 < size; i2++) {
                java.lang.String[] c3 = c(i2);
                sb.append(c3[c3.length - 1]);
                sb.append(" ");
                sb.append(c3[0]);
                sb.append(" ");
            }
            a.nu0 nu0Var2 = a.nu0.f395a;
            a.nu0.l("/proc/powerhal_cpu_ctrl/perfserv_freq", sb.toString().trim());
        }
    }

    public static void t(int i, boolean z) {
        int i2;
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.t().equals("root")) {
            a.nu0 nu0Var = a.nu0.f395a;
            a.nu0.i("/sys/devices/system/cpu/cpu0/online".replace("cpu0", "cpu" + i), z ? "1" : "0");
            return;
        }
        if (a.gy.G()) {
            boolean z2 = !z;
            java.lang.String str = a.vx0.E;
            switch (i) {
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                    i2 = 8438016;
                    break;
                case 1:
                    i2 = 8438272;
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                    i2 = 8438528;
                    break;
                case 3:
                    i2 = 8438784;
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                    i2 = 8439040;
                    break;
                case 5:
                    i2 = 8439296;
                    break;
                case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                    i2 = 8439552;
                    break;
                case 7:
                    i2 = 8439808;
                    break;
                default:
                    return;
            }
            if (z2) {
                a.vx0.L1(i2, 1);
                return;
            }
            java.lang.Integer num = (java.lang.Integer) a.vx0.G.get(java.lang.Integer.valueOf(i2));
            if (num != null) {
                a.vx0.J1(num.intValue());
            }
        }
    }

    public static void u(java.lang.String str, int i) {
        if (i >= d().size()) {
            return;
        }
        java.lang.String[] strArr = (java.lang.String[]) d().get(i);
        if (str == null || strArr.length <= 0) {
            return;
        }
        a.nu0 nu0Var = a.nu0.f395a;
        a.nu0.i("/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor".replace("cpu0", "cpu" + strArr[0]), str);
    }

    public final boolean a() {
        if (this.b < 0) {
            if (!a.ai1.w("/proc/ppm")) {
                a.q10 q10Var = a.q10.f457a;
                java.lang.String L = a.q10.L("path-basic-info", "/proc/ppm", 10000L);
                if (!a.yi1.B2(L, "dir") && !a.yi1.B2(L, "file")) {
                    this.b = 0;
                }
            }
            this.b = 1;
        }
        return this.b > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.ks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [a.ks, java.lang.Object] */
    public final a.ks[] i() {
        java.lang.String[] g;
        java.util.ArrayList d2 = d();
        java.lang.String[] strArr = new java.lang.String[d2.size() * 3];
        java.util.Iterator it = d2.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            java.lang.String str = "cpu" + ((java.lang.String[]) it.next())[0];
            strArr[i2] = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq".replace("cpu0", str);
            strArr[i2 + 1] = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq".replace("cpu0", str);
            strArr[i2 + 2] = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq".replace("cpu0", str);
            i2 += 3;
        }
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.t().equals("basic")) {
            g = new java.lang.String[0];
        } else {
            a.nu0 nu0Var = a.nu0.f395a;
            g = a.nu0.g(strArr);
        }
        int size = d2.size();
        a.ks[] ksVarArr = new a.ks[size];
        if (g.length < size) {
            while (i < size) {
                a.ks obj = new a.ks();
                long kernelPropLong = this.f326a.getKernelPropLong(strArr[i * 3]);
                java.lang.String str2 = "";
                if (kernelPropLong > -1) {
                    str2 = "" + kernelPropLong;
                }
                obj.c = str2;
                ksVarArr[i] = obj;
                i++;
            }
        } else {
            while (i < g.length) {
                a.ks obj2 = new a.ks();
                obj2.c = g[i];
                obj2.b = g[i + 1];
                obj2.f302a = g[i + 2];
                ksVarArr[i / 3] = obj2;
                i += 3;
            }
        }
        return ksVarArr;
    }

    public final void v(java.lang.String str, int i) {
        int i2;
        int i3;
        if (i >= d().size()) {
            return;
        }
        a.q10 q10Var = a.q10.f457a;
        if (!a.q10.t().equals("root")) {
            if (a.gy.G()) {
                int parseInt = java.lang.Integer.parseInt(str);
                java.lang.String str2 = a.vx0.E;
                if (i == 0) {
                    i3 = 4210688;
                } else if (i == 1) {
                    i3 = 4210944;
                } else if (i != 2) {
                    return;
                } else {
                    i3 = 4211200;
                }
                a.vx0.L1(i3, parseInt);
                return;
            }
            if (a.gy.F()) {
                int parseInt2 = java.lang.Integer.parseInt(str);
                java.lang.String str3 = a.f81.E;
                if (i == 0) {
                    i2 = 1082147072;
                } else if (i == 1) {
                    i2 = 1082146816;
                } else if (i != 2) {
                    return;
                } else {
                    i2 = 1082147328;
                }
                a.f81.K1(i2, parseInt2 / 1000);
                return;
            }
            return;
        }
        if (a.gy.G() && a()) {
            a.nu0 nu0Var = a.nu0.f395a;
            a.nu0.l("/proc/ppm/policy/hard_userlimit_max_cpu_freq", i + " " + str);
            return;
        }
        java.lang.String[] strArr = (java.lang.String[]) d().get(i);
        if (str == null || strArr.length <= 0) {
            return;
        }
        if (a.gy.F()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.String str4 : strArr) {
                sb.append(str4);
                sb.append(":");
                sb.append(str);
                sb.append(" ");
            }
            java.lang.String trim = sb.toString().trim();
            a.nu0 nu0Var2 = a.nu0.f395a;
            if (!a.nu0.i("/sys/module/msm_performance/parameters/cpu_max_freq", trim)) {
                a.nu0.i("/sys/kernel/msm_performance/parameters/cpu_max_freq", trim);
            }
        } else if (a.gy.G()) {
            s(i);
        }
        a.nu0 nu0Var3 = a.nu0.f395a;
        if (a.nu0.i("/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq".replace("cpu0", "cpu" + strArr[0]), str)) {
            return;
        }
        a.nu0.i("/sys/devices/system/cpu/cpufreq/policy" + strArr[0] + "/scaling_max_freq", str);
    }

    public final void w(java.lang.String str, int i) {
        if (i >= d().size()) {
            return;
        }
        a.q10 q10Var = a.q10.f457a;
        if (!a.q10.t().equals("root")) {
            if (a.gy.G()) {
                a.vx0.K1(i, java.lang.Integer.parseInt(str));
                return;
            } else {
                if (a.gy.F()) {
                    a.f81.J1(i, java.lang.Integer.parseInt(str));
                    return;
                }
                return;
            }
        }
        if (a.gy.G() && a()) {
            a.nu0 nu0Var = a.nu0.f395a;
            a.nu0.l("/proc/ppm/policy/hard_userlimit_min_cpu_freq", i + " " + str);
            return;
        }
        java.lang.String[] strArr = (java.lang.String[]) d().get(i);
        if (str == null || strArr.length <= 0) {
            return;
        }
        if (a.gy.F()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.String str2 : strArr) {
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                sb.append(" ");
            }
            java.lang.String trim = sb.toString().trim();
            a.nu0 nu0Var2 = a.nu0.f395a;
            if (!a.nu0.i("/sys/module/msm_performance/parameters/cpu_min_freq", trim)) {
                a.nu0.i("/sys/kernel/msm_performance/parameters/cpu_min_freq", trim);
            }
        } else if (a.gy.G()) {
            s(i);
        }
        a.nu0 nu0Var3 = a.nu0.f395a;
        if (a.nu0.i("/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq".replace("cpu0", "cpu" + strArr[0]), str)) {
            return;
        }
        a.nu0.i("/sys/devices/system/cpu/cpufreq/policy" + strArr[0] + "/scaling_min_freq", str);
    }
}
