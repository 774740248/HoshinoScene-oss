package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qp0 {

    public qp0() {
    }

    public static java.lang.String b = null;
    public static java.lang.String c = null;
    public static boolean d = true;
    public static java.lang.Boolean e;
    public static java.lang.Boolean f;
    public static java.lang.Boolean g;
    public static java.lang.String h;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String[] f473a;

    static {
        java.lang.System.currentTimeMillis();
    }

    public static java.lang.String a() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String trim = a.nu0.d("/proc/mtk_mali/gpu_memory").trim().split("\n")[0].replace("\t", " ").trim();
        return trim.contains(" ") ? trim.substring(trim.indexOf(" ")).trim() : "";
    }

    public static java.lang.String b() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String trim = a.nu0.d("/proc/mali/memory_usage").trim().split("\n")[0].replace("\t", " ").trim();
        if (!trim.contains(" ") || !trim.contains("bytes") || !trim.contains("(")) {
            return "";
        }
        java.lang.String trim2 = trim.substring(trim.indexOf(" ")).trim();
        return trim2.substring(trim2.indexOf("(") + 1, trim2.indexOf("b")).trim();
    }

    public static java.lang.String d() {
        a.nu0 nu0Var = a.nu0.f395a;
        return a.nu0.d(f() + "/governor");
    }

    public static java.lang.String[] e() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d2 = a.nu0.d(f() + "/available_governors");
        return d2.isEmpty() ? new java.lang.String[0] : d2.split("[ ]+");
    }

    public static java.lang.String f() {
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.t().equals("basic")) {
            return "";
        }
        if (h == null) {
            if (i()) {
                if (f.booleanValue()) {
                    h = "/sys/class/kgsl/kgsl-3d0";
                } else {
                    h = "/sys/class/kgsl/kgsl-3d0/devfreq";
                }
            } else if (k()) {
                h = "/sys/class/devfreq/gpufreq";
            } else {
                h = "";
            }
        }
        return h;
    }

    public static boolean i() {
        a.q10 q10Var = a.q10.f457a;
        boolean z = false;
        if (!a.q10.t().equals("root")) {
            return false;
        }
        if (e == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a.gy.i("/sys/class/kgsl/kgsl-3d0"));
            e = valueOf;
            if (valueOf.booleanValue() && !a.gy.i("/sys/class/kgsl/kgsl-3d0/devfreq")) {
                z = true;
            }
            f = java.lang.Boolean.valueOf(z);
        }
        return e.booleanValue();
    }

    public static boolean j() {
        if (c == null) {
            c = a.gy.z();
        }
        return c.startsWith("mt");
    }

    public static boolean k() {
        a.q10 q10Var = a.q10.f457a;
        if (a.q10.t().equals("basic")) {
            return false;
        }
        if (g == null) {
            g = java.lang.Boolean.valueOf(a.gy.n("/sys/kernel/ged/hal/custom_boost_gpu_freq") || a.gy.H("/sys/class/devfreq/gpufreq"));
        }
        return g.booleanValue();
    }

    public static boolean l(java.lang.String str) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9]{1,}");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(str, "input");
        return compile.matcher(str).matches();
    }

    public final java.lang.String[] c() {
        if (this.f473a == null) {
            if (j()) {
                a.nu0 nu0Var = a.nu0.f395a;
                a.y31 a2 = a.nu0.a(new java.lang.String[]{"/proc/gpufreq/gpufreq_opp_dump", "/proc/gpufreqv2/stack_working_opp_table", "/proc/gpufreqv2/gpu_working_opp_table"});
                if (a2 != null) {
                    java.lang.String str = ((java.lang.String) a2.c).equals("/proc/gpufreq/gpufreq_opp_dump") ? "=" : ":";
                    java.lang.String[] split = ((java.lang.String) a2.d).split("\n");
                    int i = 0;
                    for (java.lang.String str2 : split) {
                        java.lang.String str3 = str2.split(",")[0];
                        split[i] = str3.substring(str3.indexOf(str) + 1).trim();
                        i++;
                    }
                    this.f473a = split;
                } else {
                    this.f473a = new java.lang.String[0];
                }
            } else if (i() || k()) {
                a.nu0 nu0Var2 = a.nu0.f395a;
                a.y31 a3 = a.nu0.a(new java.lang.String[]{f() + "/available_frequencies", f() + "/gpu_available_frequencies"});
                java.lang.String[] split2 = a3 == null ? new java.lang.String[0] : ((java.lang.String) a3.d).split("[ ]+");
                this.f473a = split2;
                int i2 = 0;
                for (java.lang.String str4 : split2) {
                    if (str4.length() > 3) {
                        this.f473a[i2] = str4.substring(0, str4.length() - 3);
                    }
                    i2++;
                }
            }
        }
        return this.f473a;
    }

    public final java.lang.String g() {
        if (!i() && (!k() || j())) {
            return m("/sys/kernel/ged/hal/custom_upbound_gpu_freq");
        }
        if (f.booleanValue()) {
            a.nu0 nu0Var = a.nu0.f395a;
            java.lang.String d2 = a.nu0.d(f() + "/max_clock_mhz");
            return !d2.isEmpty() ? d2.concat("000") : d2;
        }
        a.nu0 nu0Var2 = a.nu0.f395a;
        java.lang.String d3 = a.nu0.d(f() + "/max_freq");
        return d3.length() > 3 ? d3.substring(0, d3.length() - 3) : d3;
    }

    public final java.lang.String h() {
        if (!i() && (!k() || j())) {
            return m("/sys/kernel/ged/hal/custom_boost_gpu_freq");
        }
        if (f.booleanValue()) {
            a.nu0 nu0Var = a.nu0.f395a;
            java.lang.String d2 = a.nu0.d(f() + "/min_clock_mhz");
            return !d2.isEmpty() ? d2.concat("000") : d2;
        }
        a.nu0 nu0Var2 = a.nu0.f395a;
        java.lang.String d3 = a.nu0.d(f() + "/min_freq");
        return d3.length() > 3 ? d3.substring(0, d3.length() - 3) : d3;
    }

    public final java.lang.String m(java.lang.String str) {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String[] split = a.nu0.d(str).split("\n");
        if (split.length <= 0) {
            return "";
        }
        try {
            return c()[java.lang.Integer.parseInt(split[0])];
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
