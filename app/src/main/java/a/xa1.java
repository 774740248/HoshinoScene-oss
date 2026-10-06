package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class xa1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f685a;
    public final a.ab1 b;
    public boolean c;
    public java.util.ArrayList d;
    public final a.vj1 e;
    public final a.vj1 f;

    /* JADX WARN: Type inference failed for: r6v6, types: [a.va1, java.lang.Object] */
    public xa1() {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f685a = hashMap;
        this.b = new a.ab1("[ ]+");
        this.e = new a.vj1(a.fz.g);
        this.f = new a.vj1(new a.cd1(6, this));
        java.lang.String str2 = a.pe0.f434a;
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String d = a.pe0.d(a.fs1.t(), "refresh_rate.conf");
        a.wv.w(d, "path");
        f(a.nu0.d(d));
        if (hashMap.size() == 0) {
            a.cp cpVar2 = com.omarea.Scene.c;
            try {
                java.io.InputStream open = a.fs1.t().getAssets().open("refresh_rate.txt");
                a.wv.v(open, "context.assets.open(fileName)");
                byte[] c1 = a.wv.c1(open);
                java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
                a.wv.v(defaultCharset, "defaultCharset()");
                java.lang.String str3 = new java.lang.String(c1, defaultCharset);
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\r\n");
                a.wv.v(compile, "compile(pattern)");
                java.lang.String replaceAll = compile.matcher(str3).replaceAll("\n");
                a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r\t");
                a.wv.v(compile2, "compile(pattern)");
                java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("\t");
                a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("\r");
                a.wv.v(compile3, "compile(pattern)");
                str = compile3.matcher(replaceAll2).replaceAll("\n");
                a.wv.v(str, "nativePattern.matcher(in…).replaceAll(replacement)");
            } catch (java.lang.Exception unused) {
                str = "";
            }
            java.util.List<java.lang.String> y2 = a.yi1.y2(str, new java.lang.String[]{"\n"});
            java.util.List d2 = d();
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(d2, 10));
            java.util.Iterator it = d2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(a.wv.u1(((a.ua1) it.next()).d)));
            }
            int e = e();
            for (java.lang.String str4 : y2) {
                if (!a.yi1.B2(str4, "#")) {
                    java.util.List d3 = this.b.d(str4);
                    if (d3.size() == 3) {
                        int parseInt = java.lang.Integer.parseInt((java.lang.String) d3.get(1));
                        int parseInt2 = java.lang.Integer.parseInt((java.lang.String) d3.get(2));
                        parseInt = arrayList.contains(java.lang.Integer.valueOf(parseInt)) ? parseInt : parseInt >= 90 ? e : 60;
                        parseInt2 = arrayList.contains(java.lang.Integer.valueOf(parseInt2)) ? parseInt2 : parseInt2 >= 90 ? e : 60;
                        java.lang.Object obj = d3.get(0);
                        a.va1 obj2 = new a.va1();
                        obj2.b = parseInt;
                        obj2.f629a = parseInt2;
                        this.f685a.put(obj, obj2);
                    }
                }
            }
            this.c = true;
            i();
        }
    }

    public static boolean a() {
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String d = a.pe0.d(a.fs1.t(), "features/refresh_rate.conf");
        java.util.HashMap hashMap = new java.util.HashMap();
        a.wv.w(d, "path");
        a.nu0 nu0Var = a.nu0.f395a;
        for (java.lang.String str : a.nu0.d(d).split("\n")) {
            if (str.contains("=")) {
                java.lang.String[] split = str.split("=");
                if (split.length > 1) {
                    hashMap.put(split[0], split[1]);
                } else {
                    hashMap.put(split[0], "");
                }
            }
        }
        return (hashMap.containsKey("enable") ? (java.lang.String) hashMap.get("enable") : "0").equals("1");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|(2:14|15)|18|19))|27|6|7|8|(0)(0)|12|(0)|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:11:0x0025, B:12:0x004b, B:14:0x005f, B:23:0x0034), top: B:8:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Type inference failed for: r12v6, types: [a.va1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r11, a.ey r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.wa1
            if (r0 == 0) goto L14
            r0 = r12
            a.wa1 r0 = (a.wa1) r0
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
            a.wa1 r0 = new a.wa1
            r0.<init>(r10, r12)
            goto L12
        L1a:
            a.va1 r12 = r5.f
            a.dz r0 = a.dz.c
            int r1 = r5.h
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 != r7) goto L29
            a.b20.q1(r12)     // Catch: java.lang.Exception -> L7e
            goto L4b
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            a.b20.q1(r12)
            a.q10 r1 = a.q10.f457a     // Catch: java.lang.Exception -> L7e
            r5.h = r7     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = "app-refresh-rate"
            java.lang.Long r4 = new java.lang.Long     // Catch: java.lang.Exception -> L7e
            r8 = 500(0x1f4, double:2.47E-321)
            r4.<init>(r8)     // Catch: java.lang.Exception -> L7e
            r6 = 8
            r3 = r11
            java.lang.Object r12 = a.q10.K(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7e
            if (r12 != r0) goto L4b
            return r0
        L4b:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch: java.lang.Exception -> L7e
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = " "
            r1 = 0
            r11[r1] = r0     // Catch: java.lang.Exception -> L7e
            java.util.List r11 = a.yi1.y2(r12, r11)     // Catch: java.lang.Exception -> L7e
            int r12 = r11.size()     // Catch: java.lang.Exception -> L7e
            r0 = 3
            if (r12 != r0) goto L7e
            a.va1 r12 = new a.va1     // Catch: java.lang.Exception -> L7e
            r12.<init>()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r11.get(r7)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7e
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L7e
            r12.b = r0     // Catch: java.lang.Exception -> L7e
            r0 = 2
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> L7e
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L7e
            r12.f629a = r11     // Catch: java.lang.Exception -> L7e
            return r12
        L7e:
            a.va1 r11 = new a.va1
            r11.<init>()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xa1.b(java.lang.String, a.ey):java.lang.Object");
    }

    public final a.va1 c(java.lang.String str) {
        a.wv.w(str, "app");
        java.util.HashMap hashMap = this.f685a;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        java.lang.Object obj = hashMap.get(str);
        a.wv.s(obj);
        return (a.va1) obj;
    }

    public final java.util.List d() {
        if (((java.lang.Boolean) this.f.a()).booleanValue()) {
            return a.b20.z0(new a.ua1(60.0f, 60, 1440, 3200), new a.ua1(90.0f, 90, 1440, 3200), new a.ua1(120.0f, 120, 1440, 3200));
        }
        if (this.d == null) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.Object systemService = a.fs1.t().getSystemService("window");
            a.wv.t(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            android.view.Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
            a.wv.v(supportedModes, "display.supportedModes");
            java.util.ArrayList arrayList = new java.util.ArrayList(supportedModes.length);
            for (android.view.Display.Mode mode : supportedModes) {
                arrayList.add(new a.ua1(mode.getRefreshRate(), mode.getModeId(), mode.getPhysicalWidth(), mode.getPhysicalHeight()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((a.ua1) next).b == point.x) {
                    arrayList2.add(next);
                }
            }
            this.d = arrayList2;
            if (arrayList2.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    java.lang.Object next2 = it2.next();
                    if (((a.ua1) next2).b != point.x) {
                        arrayList3.add(next2);
                    }
                }
                this.d = arrayList3;
            }
        }
        java.util.ArrayList arrayList4 = this.d;
        a.wv.s(arrayList4);
        return arrayList4;
    }

    public final int e() {
        java.util.Iterator it = d().iterator();
        float f = 60.0f;
        while (it.hasNext()) {
            float f2 = ((a.ua1) it.next()).d;
            if (f2 > f) {
                f = f2;
            }
        }
        return a.wv.u1(f);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a.va1, java.lang.Object] */
    public final void f(java.lang.String str) {
        a.wv.w(str, "content");
        java.util.Iterator it = a.yi1.y2(str, new java.lang.String[]{"\n"}).iterator();
        while (it.hasNext()) {
            java.util.List d = this.b.d((java.lang.String) it.next());
            if (d.size() == 3) {
                a.va1 obj = (va1) d.get(0);
                a.va1 obj2 = new a.va1();
                obj2.b = java.lang.Integer.parseInt((java.lang.String) d.get(1));
                obj2.f629a = java.lang.Integer.parseInt((java.lang.String) d.get(2));
                this.f685a.put(obj, obj2);
            }
        }
    }

    public final java.lang.String g() {
        java.lang.String str = a.pe0.f434a;
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String d = a.pe0.d(a.fs1.t(), "refresh_rate.conf");
        a.wv.w(d, "path");
        a.nu0 nu0Var = a.nu0.f395a;
        return a.nu0.d(d);
    }

    public final boolean h() {
        java.lang.Object obj;
        if (e() > 60) {
            java.util.Iterator it = d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (a.wv.u1(((a.ua1) obj).d) == 60) {
                    break;
                }
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        if (this.c) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) this.f685a.entrySet()) {
                sb.append((java.lang.String) entry.getKey());
                sb.append(" ");
                sb.append(((a.va1) entry.getValue()).b);
                sb.append(" ");
                sb.append(((a.va1) entry.getValue()).f629a);
                sb.append("\n");
            }
            java.lang.String str = a.pe0.f434a;
            java.lang.String sb2 = sb.toString();
            a.wv.v(sb2, "builder.toString()");
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            a.wv.v(defaultCharset, "defaultCharset()");
            byte[] bytes = sb2.getBytes(defaultCharset);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            a.cp cpVar = com.omarea.Scene.c;
            a.pe0.i(a.fs1.t(), "refresh_rate.conf", bytes);
            this.c = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Type inference failed for: r7v2, types: [a.va1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r5, java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r4 = this;
            java.lang.String r0 = "app"
            a.wv.w(r5, r0)
            r0 = 1
            r4.c = r0
            java.util.HashMap r0 = r4.f685a
            if (r6 != 0) goto Ld
            goto L13
        Ld:
            int r1 = r6.intValue()
            if (r1 == 0) goto L5e
        L13:
            if (r7 != 0) goto L16
            goto L1c
        L16:
            int r1 = r7.intValue()
            if (r1 == 0) goto L5e
        L1c:
            if (r6 != 0) goto L21
            if (r7 != 0) goto L21
            goto L5e
        L21:
            a.va1 r1 = r4.c(r5)
            r2 = 0
            r3 = 0
            if (r6 == 0) goto L2e
        L29:
            int r6 = r6.intValue()
            goto L3c
        L2e:
            if (r1 == 0) goto L37
            int r6 = r1.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L38
        L37:
            r6 = r3
        L38:
            if (r6 == 0) goto L3b
            goto L29
        L3b:
            r6 = r2
        L3c:
            if (r7 == 0) goto L43
            int r2 = r7.intValue()
            goto L51
        L43:
            if (r1 == 0) goto L4b
            int r7 = r1.f629a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
        L4b:
            if (r3 == 0) goto L51
            int r2 = r3.intValue()
        L51:
            a.va1 r7 = new a.va1
            r7.<init>()
            r7.b = r6
            r7.f629a = r2
            r0.put(r5, r7)
            goto L61
        L5e:
            r0.remove(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xa1.j(java.lang.String, java.lang.Integer, java.lang.Integer):void");
    }
}
