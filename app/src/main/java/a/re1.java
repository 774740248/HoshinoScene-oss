package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class re1 extends a.qr0 {
    public static boolean i;
    public final android.content.Context e;
    public final int f;
    public final int g;
    public final java.lang.String h;

    public re1(android.content.Context context) {
        a.wv.w(context, "context");
        this.e = context;
        this.f = 8000;
        this.g = 15000;
        this.h = "http://download.omarea.com/toolkit/";
    }

    public static final java.lang.String m(a.re1 re1Var) {
        re1Var.getClass();
        java.lang.String z = a.gy.z();
        java.lang.String u = a.gy.u();
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String k = a.ai1.k(locale, "ENGLISH", u, locale, "this as java.lang.String).toLowerCase(locale)");
        return a.op.K1(new java.lang.String[]{"waipio", "waipiop", "cape", "capep", "ukee"}, k) ? k : z;
    }

    public static final java.lang.String n(a.re1 re1Var) {
        re1Var.getClass();
        a.ls lsVar = new a.ls();
        java.lang.String o = a.ls.o("");
        if (a.gy.G()) {
            return lsVar.a() ? a.ai1.h("dimensity-", o, "-ppm") : a.ai1.g("dimensity-", o);
        }
        new a.ls();
        return a.gy.F() ? a.ai1.g("snapdragon-", o) : a.ai1.g("unknown-", o);
    }

    @Override // a.qr0
    public final int c() {
        return this.f;
    }

    @Override // a.qr0
    public final int d() {
        return this.g;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [a.qp0, java.lang.Object] */
    public final void o() {
        java.lang.String[] strArr;
        if (i) {
            return;
        }
        new a.ls();
        java.lang.String u = a.gy.u();
        java.lang.String z = a.gy.z();
        if (u.length() > 0 || z.length() > 0) {
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(u, "machine");
            lt0Var.m(z, "platform");
            lt0Var.m(android.os.Build.MANUFACTURER, "manufacturer");
            lt0Var.m(a.gy.w(), "marketName");
            a.cp cpVar = com.omarea.Scene.c;
            java.util.Locale locale = a.fs1.t().getResources().getConfiguration().getLocales().get(0);
            if (locale != null) {
                lt0Var.m(locale.getLanguage(), "locale");
            }
            java.util.ArrayList d = a.ls.d();
            if (d != null) {
                java.util.Iterator it = d.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    a.qp0 next = (qp0) it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    a.lt0 lt0Var2 = new a.lt0();
                    lt0Var2.m(a.ls.m(i2), "governor");
                    lt0Var2.m(new a.jt0(a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_governors").split("[ ]+")), "governors");
                    lt0Var2.m(new a.jt0((java.lang.String[]) next), "related_cpus");
                    lt0Var2.m(new a.jt0(a.ls.c(i2)), "frequencies");
                    a.lt0 lt0Var3 = new a.lt0();
                    for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) a.ls.l(i2).entrySet()) {
                        lt0Var3.m(entry.getValue(), (java.lang.String) entry.getKey());
                    }
                    lt0Var2.m(lt0Var3, "governor_params");
                    lt0Var.m(lt0Var2, "cluster" + i2);
                    i2 = i3;
                }
            }
            a.qp0 obj = new a.qp0();
            if (a.qp0.i()) {
                a.lt0 lt0Var4 = new a.lt0();
                lt0Var4.m(new a.jt0(obj.c()), "frequencies");
                lt0Var4.m(new a.jt0(a.qp0.e()), "governors");
                lt0Var4.m(a.qp0.d(), "governor");
                if (a.qp0.i()) {
                    a.nu0 nu0Var = a.nu0.f395a;
                    java.lang.String d2 = a.nu0.d("/sys/class/kgsl/kgsl-3d0/freq_table_mhz");
                    if (!d2.isEmpty()) {
                        strArr = d2.split("[ ]+");
                        lt0Var4.m(new a.jt0(strArr), "freq_table_mhz");
                        lt0Var.m(lt0Var4, "adreno-gpu");
                    }
                }
                strArr = new java.lang.String[0];
                lt0Var4.m(new a.jt0(strArr), "freq_table_mhz");
                lt0Var.m(lt0Var4, "adreno-gpu");
            } else if (a.gy.n("/proc/gpufreq/gpufreq_opp_dump")) {
                lt0Var.m(a.nu0.d("/proc/gpufreq/gpufreq_opp_dump"), "mali-gpu");
            } else if (a.gy.n("/proc/gpufreqv2/stack_signed_opp_table")) {
                lt0Var.m(a.nu0.d("/proc/gpufreqv2/stack_signed_opp_table"), "mali-gpu-v2");
            }
            a.nu0 nu0Var2 = a.nu0.f395a;
            lt0Var.m(a.nu0.d("/proc/cpuinfo"), "cpuInfo");
            java.lang.String concat = a.tg1.i().concat("/hardware-properties2");
            java.lang.String lt0Var5 = lt0Var.toString();
            a.wv.v(lt0Var5, "json.toString()");
            byte[] bytes = lt0Var5.getBytes(a.bu.f53a);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            a.yi1.F2(a.qr0.j(this, concat, bytes)).toString();
        }
        i = true;
    }
}
