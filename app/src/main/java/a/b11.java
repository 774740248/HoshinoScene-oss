package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class b11 {

    public b11() {
    }

    public static final a.nk c = new a.nk(15, 0);
    public static java.lang.String d = "";
    public static java.lang.String e = "";
    public static a.lv f;
    public static java.lang.String g;
    public static final a.yi h;
    public static final java.lang.String i;
    public static final java.lang.String j;
    public static final java.lang.String k;
    public static final java.lang.String l;
    public static final java.lang.String m;
    public static final java.lang.String n;
    public static final java.lang.String o;
    public static final java.lang.String p;
    public static final java.lang.String q;
    public static final java.util.ArrayList r;

    static {
        a.cp cpVar = com.omarea.Scene.c;
        h = new a.yi(a.fs1.t());
        i = "powersave";
        j = "performance";
        k = "fast";
        l = "balance";
        m = "pedestal";
        n = "auto";
        o = "igoned";
        p = "balance";
        q = "init";
        r = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(a.b11 r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, a.ey r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof a.a11
            if (r0 == 0) goto L17
            r0 = r15
            a.a11 r0 = (a.a11) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.k = r1
        L15:
            r9 = r0
            goto L1d
        L17:
            a.a11 r0 = new a.a11
            r0.<init>(r11, r15)
            goto L15
        L1d:
            java.lang.Object r15 = r9.i
            a.dz r0 = a.dz.c
            int r1 = r9.k
            a.nk r10 = a.b11.c
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.String r13 = r9.h
            java.lang.String r12 = r9.g
            a.b11 r11 = r9.f
            a.b20.q1(r15)
            goto L8a
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            a.b20.q1(r15)
            java.lang.String r15 = a.b11.o
            boolean r15 = a.wv.e(r12, r15)
            if (r15 != 0) goto L8c
            java.lang.String r6 = a.tg1.k()
            a.yi r15 = a.b11.h
            java.lang.Boolean r15 = r15.c(r13)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r15 = a.wv.e(r15, r1)
            if (r15 == 0) goto L5c
            java.lang.String r15 = "game"
            goto L5e
        L5c:
            java.lang.String r15 = "app"
        L5e:
            java.lang.String r1 = a.b11.d
            boolean r1 = a.wv.e(r1, r6)
            if (r1 != 0) goto L69
            r11.c()
        L69:
            java.lang.String r1 = a.b11.e
            int r1 = r1.length()
            if (r1 != 0) goto L72
            goto L96
        L72:
            a.q10 r1 = a.q10.f457a
            r7 = 0
            r8 = 0
            r9.f = r11
            r9.g = r12
            r9.h = r13
            r9.k = r2
            r2 = r15
            r3 = r13
            r4 = r12
            r5 = r14
            java.lang.Object r14 = r1.C(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r14 != r0) goto L8a
            r11 = r0
            goto L96
        L8a:
            r10.d = r12
        L8c:
            r10.getClass()
            java.lang.String r12 = "value"
            a.wv.w(r13, r12)
            r10.e = r13
        L96:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b11.a(a.b11, java.lang.String, java.lang.String, java.lang.String, a.ey):java.lang.Object");
    }

    public static a.lv b() {
        a.lv lvVar;
        if (a.wv.e(g, a.tg1.k()) && (lvVar = f) != null) {
            return lvVar;
        }
        try {
            java.lang.String str = a.pe0.f434a;
            a.cp cpVar = com.omarea.Scene.c;
            java.io.File file = new java.io.File(a.pe0.d(a.fs1.t(), "manifest.json"));
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            a.wv.v(defaultCharset, "defaultCharset()");
            java.lang.String i1 = a.wv.i1(file, defaultCharset);
            a.lv lvVar2 = new a.lv();
            lvVar2.c(new a.lt0(i1));
            return lvVar2;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean d() {
        if (a.tg1.p()) {
            return true;
        }
        java.lang.String k2 = a.tg1.k();
        if (!a.wv.e(k2, "SOURCE_SCENE_CUSTOM") && !a.wv.e(k2, "SOURCE_SCENE_ONLINE")) {
            return false;
        }
        a.cp cpVar = com.omarea.Scene.c;
        android.app.Application t = a.fs1.t();
        java.lang.String str = a.pe0.f434a;
        if (new java.io.File(a.pe0.d(t, "profile.json")).exists()) {
            a.lv b = b();
            if (a.wv.e(b != null ? b.g : null, "SCENE9")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.tw] */
    public final void c() {
        java.lang.String d2;
        if (a.tg1.p()) {
            d2 = "/data/powercfg.sh";
        } else {
            java.lang.String str = a.pe0.f434a;
            a.cp cpVar = com.omarea.Scene.c;
            d2 = a.pe0.d(a.fs1.t(), "powercfg.sh");
        }
        e = d2;
        if (d2.length() > 0) {
            java.lang.String str2 = a.pe0.f434a;
            a.cp cpVar2 = com.omarea.Scene.c;
            java.lang.String d3 = a.pe0.d(a.fs1.t(), "features/env.conf");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (a.ai1.w(d3)) {
                java.io.File file = new java.io.File(d3);
                java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
                a.wv.v(defaultCharset, "defaultCharset()");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                a.b10 b10Var = new a.b10(12, arrayList);
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), defaultCharset));
                try {
                    a.rq1 rq1Var = new a.rq1(bufferedReader);
                    if (!((tw) rq1Var instanceof a.tw)) {
                        rq1Var = (rq1) new a.tw(rq1Var);
                    }
                    java.util.Iterator it = rq1Var.iterator();
                    while (it.hasNext()) {
                        b10Var.i(it.next());
                    }
                    a.wv.z(bufferedReader, null);
                    java.util.Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a.ai1.u("export ", (java.lang.String) it2.next(), "\n", sb);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        a.wv.z(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            sb.append("sh " + e + " " + q + " > /dev/null 2>&1");
            a.q10 q10Var = a.q10.f457a;
            java.lang.String sb2 = sb.toString();
            a.wv.v(sb2, "cmd.toString()");
            a.q10.k(5000L, sb2);
            c.d = "";
            d = a.tg1.k();
        }
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.ArrayList arrayList;
        a.wv.w(str, "mode");
        a.wv.w(str2, "app");
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root")) {
            while (true) {
                arrayList = r;
                if (arrayList.size() <= 1) {
                    break;
                } else {
                    arrayList.removeLast();
                }
            }
            a.y01 y01Var = new a.y01();
            y01Var.c(str);
            y01Var.a(str2);
            y01Var.d(str3);
            java.lang.String k2 = a.tg1.k();
            if (!a.wv.e(k2, "SOURCE_SCENE_ONLINE") && !a.wv.e(k2, "SOURCE_SCENE_CUSTOM")) {
                a.nk nkVar = c;
                if (!a.wv.e(nkVar.y(), "standby")) {
                    java.lang.String r2 = nkVar.r();
                    java.lang.String str4 = n;
                    if (!a.wv.e(r2, str4) && a.yi1.y2(str2, new java.lang.String[]{"."}).size() < 4) {
                        java.lang.String str5 = i;
                        if (a.wv.e(str, str5)) {
                            y01Var.b();
                        } else {
                            java.lang.String[] strArr = {str5, l, p, j, k, m, str4};
                            if (a.op.O1(strArr, str) <= a.op.O1(strArr, a.tg1.j())) {
                                y01Var.b();
                            }
                        }
                    }
                }
            }
            arrayList.add(y01Var);
            if (arrayList.size() < 2) {
                a.wv.M0(a.wv.b(a.z80.b), null, new a.z01(this, null), 3);
            }
        }
    }
}
