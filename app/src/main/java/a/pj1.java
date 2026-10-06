package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pj1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f439a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final a.vj1 h;
    public final a.vj1 i;
    public final a.vj1 j;
    public final a.vj1 k;
    public final java.lang.String l;
    public final java.lang.String m;
    public final java.lang.String n;

    public pj1(android.content.Context context) {
        a.wv.w(context, "context");
        this.f439a = context;
        this.b = "/data/swapfile";
        this.c = "/sys/block/zram0/backing_dev";
        this.d = "/sys/block/zram0/hybridswap_loop_device";
        this.e = "/sys/block/zram0/smartswap_loop_device";
        this.f = "/sys/kernel/mm/memcompress/stat";
        this.g = "/sys/kernel/mm/memcompress/compressor";
        this.h = new a.vj1(new a.mj1(this, 2));
        this.i = new a.vj1(new a.mj1(this, 0));
        this.j = new a.vj1(new a.mj1(this, 1));
        this.k = new a.vj1(new a.mj1(this, 3));
        this.l = "/proc/sys/vm/swappiness";
        this.m = "/sys/module/oplus_bsp_zram_opt/parameters";
        this.n = "/proc/oplus_mem/swappiness_para";
    }

    public static java.lang.String a() {
        java.lang.Object obj;
        a.nu0 nu0Var = a.nu0.f395a;
        java.util.Iterator it = a.yi1.y2(a.nu0.d("/sys/block/zram0/comp_algorithm"), new java.lang.String[]{" "}).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.lang.String str = (java.lang.String) obj;
            if (a.yi1.B2(str, "[") && a.yi1.h2(str, "]", false)) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 != null ? a.yi1.F2(a.yi1.v2(a.yi1.v2(str2, "[", ""), "]", "")).toString() : "";
    }

    public static java.util.ArrayList b() {
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String v2 = a.yi1.v2(a.yi1.v2(a.nu0.d("/proc/swaps"), "\t\t", "\t"), "\t", " ");
        while (a.yi1.g2(v2, "  ")) {
            v2 = a.yi1.v2(v2, "  ", " ");
        }
        return a.qv.x2(a.yi1.y2(v2, new java.lang.String[]{"\n"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f() {
        /*
            java.lang.String r0 = "vtools.swap.loop"
            r1 = 0
            java.lang.String r2 = java.lang.System.getProperty(r0)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L19
            int r3 = r2.length()     // Catch: java.lang.Exception -> L19
            if (r3 != 0) goto L10
            goto L19
        L10:
            java.lang.CharSequence r2 = a.yi1.G2(r2)     // Catch: java.lang.Exception -> L19
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L19
            goto L34
        L19:
            a.q10 r2 = a.q10.f457a
            java.lang.String r2 = "get-prop"
            java.lang.String r0 = a.q10.L(r2, r0, r1)
            java.lang.String r2 = "error"
            boolean r2 = a.wv.e(r0, r2)
            if (r2 == 0) goto L2c
            java.lang.String r0 = ""
            goto L34
        L2c:
            java.lang.CharSequence r0 = a.yi1.G2(r0)
            java.lang.String r0 = r0.toString()
        L34:
            java.lang.String r2 = "/"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r0 = a.yi1.y2(r0, r2)
            java.lang.String r0 = a.qv.m2(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4f
            java.lang.String r2 = "loop"
            boolean r2 = a.yi1.g2(r0, r2)
            if (r2 != 0) goto L4f
            goto L50
        L4f:
            r1 = r0
        L50:
            java.util.ArrayList r0 = b()
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "/swapfile "
            boolean r3 = a.yi1.B2(r2, r3)
            if (r3 != 0) goto L7c
            java.lang.String r3 = "/data/swapfile "
            boolean r3 = a.yi1.B2(r2, r3)
            if (r3 != 0) goto L7c
            if (r1 == 0) goto L58
            boolean r3 = a.yi1.g2(r2, r1)
            if (r3 == 0) goto L58
        L7c:
            java.lang.String r0 = " "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = a.yi1.y2(r2, r0)
            java.util.ArrayList r0 = a.qv.x2(r0)
            r1 = 2
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1 = 3
            java.lang.String r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L9f
            int r0 = r0 / 1024
            return r0
        L9f:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pj1.f():int");
    }

    public static int g() {
        a.nu0 nu0Var = a.nu0.f395a;
        try {
            long j = 1024;
            return (int) ((java.lang.Long.parseLong(a.nu0.d("/sys/block/zram0/disksize")) / j) / j);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static int i() {
        java.util.Iterator it = b().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (a.yi1.B2(str, "/block/zram0 ") || a.yi1.B2(str, "/dev/block/zram0 ")) {
                java.util.ArrayList x2 = a.qv.x2(a.yi1.y2(str, new java.lang.String[]{" "}));
                try {
                    return java.lang.Integer.parseInt((java.lang.String) x2.get(3)) / 1024;
                } catch (java.lang.Exception unused) {
                    return -1;
                }
            }
        }
        return -1;
    }

    public static com.omarea.model.ZramMMStat l(java.lang.String str) {
        java.util.List list;
        a.wv.w(str, "zram");
        a.q10 q10Var = a.q10.f457a;
        if (!a.wv.e(a.q10.t(), "root")) {
            return null;
        }
        com.omarea.model.ZramMMStat zramMMStat = new com.omarea.model.ZramMMStat();
        a.nu0 nu0Var = a.nu0.f395a;
        java.lang.String d = a.nu0.d("/sys/block/" + str + "/mm_stat");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[ ]+");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(d, "input");
        a.yi1.w2(0);
        java.util.regex.Matcher matcher = compile.matcher(d);
        if (matcher.find()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(10);
            int i = 0;
            do {
                arrayList.add(d.subSequence(i, matcher.start()).toString());
                i = matcher.end();
            } while (matcher.find());
            arrayList.add(d.subSequence(i, d.length()).toString());
            list = arrayList;
        } else {
            list = a.b20.y0(d.toString());
        }
        if (list.size() > 1) {
            zramMMStat.setOrigDataSize((java.lang.String) list.get(0));
            zramMMStat.setComprDataSize((java.lang.String) list.get(1));
            zramMMStat.setMemUsed((java.lang.String) list.get(2));
            zramMMStat.setMemLimit((java.lang.String) list.get(3));
            if (zramMMStat.getMemUsed().length() > 0) {
                if (zramMMStat.getComprDataSize().length() > zramMMStat.getMemUsed().length()) {
                    zramMMStat.setAbnormal(true);
                    zramMMStat.setComprDataSize(zramMMStat.getMemUsed());
                } else {
                    java.lang.Long d2 = a.wi1.d2(zramMMStat.getComprDataSize());
                    long longValue = d2 != null ? d2.longValue() : 0L;
                    java.lang.Long d22 = a.wi1.d2(zramMMStat.getMemUsed());
                    if (((long) ((longValue * 1.15d) + 31457280)) < (d22 != null ? d22.longValue() : 0L) && a.yi1.B2(a.nu0.c(), "5.")) {
                        zramMMStat.setAbnormal(true);
                        zramMMStat.setComprDataSize(zramMMStat.getMemUsed());
                    }
                }
            }
        } else {
            if (a.gy.n("/sys/block/" + str + "/mem_used_total")) {
                zramMMStat.setOrigDataSize(a.nu0.d("/sys/block/" + str + "/orig_data_size"));
                zramMMStat.setComprDataSize(a.nu0.d("/sys/block/" + str + "/compr_data_size"));
                zramMMStat.setMemUsed("");
                zramMMStat.setAbnormal(false);
                zramMMStat.setMemUsed(a.nu0.d("/sys/block/" + str + "/mem_used_total"));
                zramMMStat.setMemLimit(a.nu0.d("/sys/block/" + str + "/mem_limit"));
                zramMMStat.setMemUsedMax(a.nu0.d("/sys/block/" + str + "/mem_used_max"));
            }
        }
        return zramMMStat;
    }

    public final java.lang.String c() {
        java.lang.String obj;
        java.lang.String str;
        java.lang.String property;
        if (d()) {
            a.nu0 nu0Var = a.nu0.f395a;
            java.lang.String v2 = a.yi1.v2(a.yi1.v2(a.nu0.d("/proc/swaps"), "\t\t", "\t"), "\t", " ");
            if (a.yi1.g2(v2, "/swapfile")) {
                return this.b;
            }
            try {
                property = java.lang.System.getProperty("vtools.swap.loop");
            } catch (java.lang.Exception unused) {
            }
            if (property != null && property.length() != 0) {
                obj = a.yi1.G2(property).toString();
                str = (java.lang.String) a.qv.m2(a.yi1.y2(obj, new java.lang.String[]{"/"}));
                if (str == null && !a.wv.e(str, "error") && a.yi1.g2(v2, str)) {
                    return str;
                }
            }
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("get-prop", "vtools.swap.loop", null);
            obj = a.wv.e(L, "error") ? "" : a.yi1.G2(L).toString();
            str = (java.lang.String) a.qv.m2(a.yi1.y2(obj, new java.lang.String[]{"/"}));
            if (str == null) {
            }
        }
        return "";
    }

    public final boolean d() {
        java.lang.String str = this.b;
        a.wv.w(str, "path");
        if (new java.io.File(str).exists()) {
            return true;
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("path-basic-info", str, 10000L);
        return a.yi1.B2(L, "dir") || a.yi1.B2(L, "file");
    }

    public final int e() {
        long j;
        if (!d()) {
            return 0;
        }
        try {
            java.lang.String str = this.b;
            a.wv.w(str, "path");
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("path-basic-info", str, 10000L);
            if (a.yi1.g2(L, ",")) {
                java.lang.String substring = L.substring(a.yi1.m2(L, ",", 0, false, 6) + 1);
                a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                j = java.lang.Long.parseLong(substring);
            } else {
                j = -1;
            }
        } catch (java.lang.Exception unused) {
            j = 0;
        }
        long j2 = 1024;
        return (int) ((j / j2) / j2);
    }

    public final java.lang.Long h() {
        java.lang.String memUsed;
        java.lang.Long l = null;
        for (java.lang.String str : (java.lang.String[]) this.k.a()) {
            com.omarea.model.ZramMMStat l2 = l(str);
            if (l2 != null && (memUsed = l2.getMemUsed()) != null) {
                long longValue = l != null ? l.longValue() : 0L;
                java.lang.Long d2 = a.wi1.d2(memUsed);
                l = java.lang.Long.valueOf(((d2 != null ? d2.longValue() : 0L) / 1024) + longValue);
            }
        }
        return l;
    }

    public final java.lang.String j() {
        java.lang.String str;
        a.nu0 nu0Var = a.nu0.f395a;
        a.y31 a2 = a.nu0.a(new java.lang.String[]{this.c, this.d, this.e});
        if (a2 == null || (str = (java.lang.String) a2.d) == null) {
            str = "";
        }
        return a.yi1.v2(a.yi1.v2(str, "(", ""), ")", "");
    }

    public final java.lang.String k(int i, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        a.ai1.u("sh ", (java.lang.String) this.h.a(), " enable_swap ", sb);
        sb.append(z ? "1" : "0");
        if (i > -2) {
            sb.append(" " + i);
        }
        a.lh1 lh1Var = new a.lh1(this.f439a);
        java.lang.String sb2 = sb.toString();
        a.wv.v(sb2, "sb.toString()");
        a.q10 q10Var = a.q10.f457a;
        return lh1Var.a(a.q10.l(sb2), false);
    }
}
