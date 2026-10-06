package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nu0 {

    public nu0() {
    }

    public static java.lang.String c;

    /* renamed from: a, reason: collision with root package name */
    public static final a.nu0 f395a = new a.nu0();
    public static final java.util.ArrayList b = new java.util.ArrayList();
    public static java.lang.String d = "";

    public static a.y31 a(java.lang.String[] strArr) {
        a.wv.w(strArr, "files");
        int i = 0;
        for (java.lang.String str : g(strArr)) {
            if (str != null) {
                return new a.y31(strArr[i], str);
            }
            i++;
        }
        return null;
    }

    public static java.lang.String c() {
        java.lang.String str;
        java.util.List list;
        java.lang.String str2 = c;
        if (str2 == null || str2.length() == 0) {
            java.lang.String str3 = (java.lang.String) a.qv.g2(a.yi1.y2(d("/proc/version"), new java.lang.String[]{"-"}));
            if (str3 != null) {
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\s]+");
                a.wv.v(compile, "compile(pattern)");
                int i = 0;
                a.yi1.w2(0);
                java.util.regex.Matcher matcher = compile.matcher(str3);
                if (matcher.find()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(10);
                    do {
                        arrayList.add(str3.subSequence(i, matcher.start()).toString());
                        i = matcher.end();
                    } while (matcher.find());
                    arrayList.add(str3.subSequence(i, str3.length()).toString());
                    list = arrayList;
                } else {
                    list = a.b20.y0(str3.toString());
                }
                java.lang.String str4 = (java.lang.String) a.qv.m2(list);
                if (str4 != null) {
                    str = a.yi1.F2(str4).toString();
                    c = str;
                }
            }
            str = null;
            c = str;
        }
        java.lang.String str5 = c;
        return str5 == null ? "" : str5;
    }

    public static java.lang.String d(java.lang.String str) {
        a.wv.w(str, "propName");
        return (java.lang.String) a.wv.v1(new a.ju0(str, null));
    }

    public static java.lang.String[] g(java.lang.String[] strArr) {
        a.wv.w(strArr, "files");
        return (java.lang.String[]) a.wv.v1(new a.mu0(strArr, null));
    }

    public static boolean h() {
        return ((java.lang.String) a.qv.e2(a.yi1.y2(c(), new java.lang.String[]{"."}))).compareTo("5") > 0;
    }

    public static boolean i(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "propName");
        a.wv.w(str2, "value");
        return j(str, str2, 292, 3000L);
    }

    public static boolean j(java.lang.String str, java.lang.String str2, int i, java.lang.Long l) {
        java.lang.Object r2 = null;
        a.q10 q10Var = a.q10.f457a;
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str, "path");
        lt0Var.m(str2, "text");
        lt0Var.n("mode", i);
        a.wv.v(lt0Var.toString(), "JSONObject().apply {\n   …ode)\n        }.toString()");
        return !a.wv.e(a.q10.L("set-kernel-prop", r2, java.lang.Long.valueOf(l != null ? l.longValue() : 3000L)), "error");
    }

    public static void k(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        a.wv.w(str, "prop");
        a.q10 q10Var = a.q10.f457a;
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str, "path");
        lt0Var.m(str2, "text");
        lt0Var.n("mode", 436);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "JSONObject().apply {\n   …ode)\n        }.toString()");
        a.wv.e(a.q10.L("set-kernel-prop-slow", lt0Var2, java.lang.Long.valueOf(l.longValue())), "error");
    }

    public static boolean l(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "propName");
        a.wv.w(str2, "value");
        return j(str, str2, 436, 3000L);
    }

    public static java.lang.Object m(java.util.List list, a.ey eyVar) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            a.y31 y31Var = (a.y31) it.next();
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(y31Var.c, "path");
            lt0Var.m(y31Var.d, "text");
            lt0Var.n("mode", 436);
            arrayList.add(lt0Var);
        }
        a.q10 q10Var = a.q10.f457a;
        try {
            a.nk nkVar = new a.nk(6, 0);
            a.mt0 mt0Var = a.mt0.c;
            nkVar.I(mt0Var, "[");
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nkVar.W(it2.next());
            }
            nkVar.d(mt0Var, a.mt0.d, "]");
            str = nkVar.toString();
        } catch (a.kt0 unused) {
            str = null;
        }
        java.lang.String str2 = str;
        a.wv.v(str2, "builder.toString()");
        java.lang.Object K = a.q10.K(q10Var, "set-kernel-props", str2, new java.lang.Long(15000L), eyVar, 8);
        return K == a.dz.c ? K : a.no1.f387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, a.ey r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.iu0
            if (r0 == 0) goto L14
            r0 = r10
            a.iu0 r0 = (a.iu0) r0
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
            a.iu0 r0 = new a.iu0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f
            a.dz r0 = a.dz.c
            int r1 = r5.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r10)
            goto L4c
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            a.b20.q1(r10)
            a.q10 r1 = a.q10.f457a
            java.lang.String r10 = "get-kernel-prop"
            java.lang.Long r4 = new java.lang.Long
            r6 = 1000(0x3e8, double:4.94E-321)
            r4.<init>(r6)
            r6 = 8
            r5.h = r2
            r2 = r10
            r3 = r9
            java.lang.Object r10 = a.q10.K(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L4c
            return r0
        L4c:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.CharSequence r9 = a.yi1.F2(r10)
            java.lang.String r9 = r9.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nu0.b(java.lang.String, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, a.ey r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.ku0
            if (r0 == 0) goto L13
            r0 = r7
            a.ku0 r0 = (a.ku0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            a.ku0 r0 = new a.ku0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f
            a.dz r1 = a.dz.c
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.b20.q1(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            a.b20.q1(r7)
            java.util.ArrayList r7 = a.nu0.b
            boolean r2 = r7.contains(r6)
            if (r2 != 0) goto L61
            java.io.File r2 = new java.io.File
            r2.<init>(r6)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L5e
            boolean r4 = r2.canRead()
            if (r4 == 0) goto L5e
            java.nio.charset.Charset r4 = a.bu.f53a     // Catch: java.lang.Exception -> L5a
            java.lang.String r2 = a.wv.i1(r2, r4)     // Catch: java.lang.Exception -> L5a
            java.lang.CharSequence r2 = a.yi1.F2(r2)     // Catch: java.lang.Exception -> L5a
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L5a
            return r6
        L5a:
            r7.add(r6)
            goto L61
        L5e:
            r7.add(r6)
        L61:
            r0.h = r3
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "error"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L77
            java.lang.String r6 = ""
            return r6
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nu0.e(java.lang.String, a.ey):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:10)(2:35|36))(2:37|(1:39))|11|12|13|(6:15|(2:17|(1:19)(4:20|(1:25)|26|27))|29|(2:22|25)|26|27)|30|31|32))|40|6|7|(0)(0)|11|12|13|(0)|30|31|32) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String[] r9, a.ey r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.lu0
            if (r0 == 0) goto L14
            r0 = r10
            a.lu0 r0 = (a.lu0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            a.lu0 r0 = new a.lu0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object[ r10 = r5.g
            a.dz r0 = a.dz.c
            int r1 = r5.i
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.String[] r9 = r5.f
            a.b20.q1(r10)
            goto L55
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            a.b20.q1(r10)
            a.q10 r1 = a.q10.f457a
            java.lang.String r10 = "get-kernel-props"
            java.lang.String r3 = "\n"
            java.lang.String r3 = a.op.P1(r9, r3)
            java.lang.Long r4 = new java.lang.Long
            r6 = 5000(0x1388, double:2.4703E-320)
            r4.<init>(r6)
            r6 = 8
            r5.f = r9
            r5.i = r2
            r2 = r10
            java.lang.Object r10 = a.q10.K(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L55
            return r0
        L55:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.CharSequence r10 = a.yi1.F2(r10)
            java.lang.String r10 = r10.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r9 = r9.length
            r0.<init>(r9)
            r9 = 0
            a.jt0 r1 = new a.jt0     // Catch: java.lang.Exception -> L95
            r1.<init>(r10)     // Catch: java.lang.Exception -> L95
            java.util.List r10 = r1.f269a     // Catch: java.lang.Exception -> L95
            int r2 = r10.size()     // Catch: java.lang.Exception -> L95
            r3 = r9
        L72:
            if (r3 >= r2) goto L95
            r4 = 0
            if (r3 < 0) goto L83
            int r5 = r10.size()     // Catch: java.lang.Exception -> L95
            if (r3 < r5) goto L7e
            goto L83
        L7e:
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Exception -> L95
            goto L84
        L83:
            r5 = r4
        L84:
            if (r5 == 0) goto L8f
            a.fs1 r6 = a.lt0.c     // Catch: java.lang.Exception -> L95
            if (r5 != r6) goto L8b
            goto L8f
        L8b:
            java.lang.String r4 = r1.d(r3)     // Catch: java.lang.Exception -> L95
        L8f:
            r0.add(r4)     // Catch: java.lang.Exception -> L95
            int r3 = r3 + 1
            goto L72
        L95:
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r0.toArray(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nu0.f(java.lang.String[], a.ey):java.io.Serializable");
    }
}
