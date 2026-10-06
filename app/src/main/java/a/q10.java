package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class q10 implements a.u10 {

    public q10() {
    }


    /* renamed from: a, reason: collision with root package name */
    public static final a.q10 f457a = new a.q10();
    public static java.lang.String b = "";
    public static int c = 8788;
    public static java.lang.String d = "0.0.0";
    public static java.lang.String e = "";
    public static java.lang.String f = "omarea.com";
    public static a.rd1 g = null;
    public static boolean h = false;
    public static final java.lang.Object i;
    public static final a.oo1 j;
    public static final boolean k;
    public static java.lang.String l = null;
    public static int m = 0;
    public static long n = 0;
    public static final java.util.ArrayList o;
    public static final a.r10 p;
    public static final android.os.Looper q;
    public static final java.util.concurrent.ConcurrentHashMap r;
    public static final java.util.concurrent.ConcurrentHashMap s;
    public static boolean t = false;
    public static boolean u = false;
    public static java.lang.String v = null;
    public static boolean w = false;
    public static int x = 1;
    public static long y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a.q10] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a.r10, java.lang.Object] */
    static {
        a.wv.v("omarea.com".getBytes(a.bu.f53a), "this as java.lang.String).getBytes(charset)");
        i = new a.r10();
        j = new a.oo1();
        k = true;
        l = "basic";
        o = new java.util.ArrayList();
        p = new a.r10();
        q = android.os.Looper.getMainLooper();
        r = new java.util.concurrent.ConcurrentHashMap();
        s = new java.util.concurrent.ConcurrentHashMap();
        v = "";
    }

    public static java.lang.String A(java.lang.String str) {
        a.wv.w(str, "action");
        return L("scheduler-refresh", str, 2000L);
    }

    public static void E(java.lang.Boolean bool) {
        if (bool != null) {
            t = a.wv.e(bool, java.lang.Boolean.TRUE);
        }
        if (r()) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.a10(bool, null), 3);
        }
    }

    public static void F(java.lang.String str, a.t10 t10Var) {
        a.wv.w(t10Var, "config");
        b = str;
        d = t10Var.b;
        int i2 = t10Var.f544a;
        if (1 <= i2 && i2 < 65535) {
            c = i2;
        }
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build());
    }

    public static /* synthetic */ java.lang.Object K(a.q10 q10Var, java.lang.String str, java.lang.String str2, java.lang.Long l2, a.ey eyVar, int i2) {
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        return q10Var.J(str, str2, l2, null, eyVar);
    }

    public static java.lang.String L(java.lang.String str, java.lang.String str2, java.lang.Long l2) {
        java.lang.String str3;
        a.wv.w(str2, "content");
        if ((l2 != null ? l2.longValue() : 9999L) > 5000 && a.wv.e(android.os.Looper.myLooper(), q)) {
            android.util.Log.e("@Scene", "在主线程上执行耗时调用！".concat(str));
        }
        java.lang.String str4 = (java.lang.String) a.wv.v1(new a.f10(str, str2, l2, null));
        if ((str4 == null || str4.length() == 0 || str4.equals("error")) && java.lang.System.currentTimeMillis() - y >= 5000) {
            y = java.lang.System.currentTimeMillis();
            android.util.Log.e("Scene", "S0: empty/error response, restarting daemon...");
            h();
            w = false;
            if (f457a.O(true) && (str3 = (java.lang.String) a.wv.v1(new a.f10(str, str2, l2, null))) != null && str3.length() != 0) {
                return str3;
            }
        }
        return str4;
    }

    public static void M(a.oo1 oo1Var, byte[] bArr) {
        try {
            byte[] bArr2 = new byte[bArr.length + 4];
            java.lang.System.arraycopy(a.b20.v0(bArr.length), 0, bArr2, 0, 4);
            java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
            a.wv.M0(a.wv.b(a.z80.b), null, new a.h10(oo1Var, bArr2, null), 3);
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void P(boolean z) {
        u = z;
        a.wv.M0(a.wv.b(a.z80.b), null, new a.l10(z, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Callable] */
    public static boolean T(long j2) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.FutureTask());
        a.ty tyVar = a.z80.b;
        a.p10 p10Var = new a.p10(j2, futureTask, null);
        int i2 = 2 & 1;
        a.ty tyVar2 = a.ob0.c;
        if (i2 != 0) {
            tyVar = tyVar2;
        }
        int i3 = (2 & 2) != 0 ? 1 : 0;
        a.ty W = a.wv.W(tyVar2, tyVar, true);
        a.u20 u20Var = a.z80.f728a;
        if (W != u20Var && W.g(a.gy.c) == null) {
            W = W.c(u20Var);
        }
        a.f av0Var = i3 == 2 ? new a.av0(W, p10Var) : new a.f(W, true);
        av0Var.S(i3, av0Var, p10Var);
        try {
            java.lang.Boolean bool = (java.lang.Boolean) futureTask.get();
            a.wv.v(bool, "r");
            if (bool.booleanValue()) {
                x = 3;
            }
            return bool.booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:209)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:50)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 9 */
    public static java.lang.String g(java.lang.String r8) {
        /*
            java.lang.String r0 = "success"
            return r0
            java.lang.String r0 = "code"
            a.wv.w(r8, r0)
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r1 = "defaultCharset()"
            a.wv.v(r0, r1)
            byte[] r8 = r8.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            a.wv.v(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
        L1e:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = a.bu.f53a
            r2.<init>(r8, r3)
            r3 = 2500(0x9c4, double:1.235E-320)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "activate"
            java.lang.String r2 = L(r4, r2, r3)
            java.lang.String r3 = "error"
            boolean r4 = a.wv.e(r2, r3)
            if (r4 != 0) goto L3a
            return r2
        L3a:
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            r6 = 6000(0x1770, double:2.9644E-320)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L1e
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.g(java.lang.String):java.lang.String");
    }

    public static void h() {
        java.util.ArrayList arrayList = o;
        java.util.List subList = arrayList.subList(0, arrayList.size());
        a.wv.v(subList, "connectList.subList(0, connectList.size)");
        arrayList.clear();
        m = 0;
        try {
            java.util.Iterator it = subList.iterator();
            while (it.hasNext()) {
                ((java.nio.channels.SocketChannel) it.next()).close();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static byte[] j(java.lang.String str) {
        java.nio.charset.Charset charset = a.bu.f53a;
        byte[] bytes = str.getBytes(charset);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = f.getBytes(charset);
        a.wv.v(bytes2, "this as java.lang.String).getBytes(charset)");
        p.getClass();
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(a.r10.b);
        cipher.init(1, new javax.crypto.spec.SecretKeySpec(bytes2, a.r10.f484a), new javax.crypto.spec.IvParameterSpec(a.r10.c));
        byte[] encode = android.util.Base64.encode(cipher.doFinal(bytes), 11);
        a.wv.v(encode, "encode(\n            daem…Base64.URL_SAFE\n        )");
        return encode;
    }

    public static java.lang.String k(long j2, java.lang.String str) {
        a.wv.w(str, "shell");
        return L("exec-shell", str, java.lang.Long.valueOf(j2));
    }

    public static java.lang.String l(java.lang.String str) {
        a.wv.w(str, "shell");
        return L("exec-shell", str, null);
    }

    public static java.lang.String n() {
        java.lang.String L = L("daemon-version", "", 500L);
        if (L.length() <= 0 || a.wv.e(L, "error")) {
            return null;
        }
        return L;
    }

    public static a.jt0 o(java.lang.String str) {
        java.lang.String L = L("get-threads", str, 2000L);
        if (L.length() > 0 && !a.wv.e(L, "error")) {
            try {
                return new a.jt0(L);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static a.lt0 p(long j2, java.lang.String str, java.lang.String str2) {
        java.lang.String L = L(str, str2, java.lang.Long.valueOf(j2));
        if (L.length() > 0 && !a.wv.e(L, "error")) {
            try {
                return new a.lt0(L);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public static java.nio.channels.SocketChannel q() {
        java.lang.Object obj;
        java.util.Iterator it = o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.nio.channels.SocketChannel) obj).isConnected()) {
                break;
            }
        }
        return (java.nio.channels.SocketChannel) obj;
    }

    public static boolean r() {
        return (q() == null && !j.a() && x == 3 && w) ? true : true;
    }

    public static java.lang.String t() {
        return r() ? l : "basic";
    }

    public static boolean v(a.u10 u10Var, java.lang.String str) {
        a.wv.w(str, "shellCommand");
        a.wv.w(u10Var, "connectHandler");
        if (q() != null) {
            L("connect", "", null);
        }
        java.nio.channels.SocketChannel open = java.nio.channels.SocketChannel.open();
        open.configureBlocking(true);
        java.net.Socket socket = open.socket();
        socket.setTrafficClass(20);
        socket.setSendBufferSize(4096);
        socket.setReceiveBufferSize(40960);
        socket.setTcpNoDelay(true);
        socket.setKeepAlive(true);
        try {
            open.connect(new java.net.InetSocketAddress("127.0.0.1", c));
            u10Var.c(open, new a.n00(open));
            new a.c10(open, u10Var).start();
            byte[] j2 = j(str);
            java.nio.ByteBuffer put = java.nio.ByteBuffer.allocate(j2.length + 4).put(a.b20.v0(j2.length)).put(j2);
            put.flip();
            a.wv.M0(a.wv.b(a.z80.b), null, new a.g10(open, put, null), 3);
            return true;
        } catch (java.io.IOException e2) {
            if ((e2 instanceof java.net.ConnectException) && a.wv.e(e2.getMessage(), "Permission denied") && java.lang.System.currentTimeMillis() - n > 5000) {
                if (g != null) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X("请不要禁止Scene连接网络!\nDo not deny Scene access to the network!", 1);
                }
                n = java.lang.System.currentTimeMillis();
            }
            u10Var.a(open);
            return false;
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = r;
        a.zs zsVar = (a.zs) concurrentHashMap.get(str);
        if (zsVar != null) {
            concurrentHashMap.remove(str);
            s.remove(str);
            ((a.at) zsVar).j(str2);
        } else {
            android.util.Log.e("@Scene", "ApiRequest " + str + " Callback Removed!");
        }
    }

    public static void z(java.lang.String[]... strArr) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String[] strArr2 : strArr) {
            a.jt0 jt0Var = new a.jt0();
            for (java.lang.String str2 : strArr2) {
                jt0Var.e(str2);
            }
            arrayList.add(jt0Var);
        }
        try {
            a.nk nkVar = new a.nk(6, 0);
            a.mt0 mt0Var = a.mt0.c;
            nkVar.I(mt0Var, "[");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nkVar.W(it.next());
            }
            nkVar.d(mt0Var, a.mt0.d, "]");
            str = nkVar.toString();
        } catch (a.kt0 unused) {
            str = null;
        }
        a.wv.v(str, "calls.toString()");
        L("scheduler-func", str, 2000L);
    }

    public final java.lang.Object C(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, a.ey eyVar) {
        a.lt0 lt0Var = new a.lt0();
        lt0Var.m(str5, "source");
        lt0Var.m(str, "category");
        lt0Var.m(str2, "scene");
        lt0Var.m(str3, "mode");
        lt0Var.o("force", z);
        lt0Var.m(str4, "reason");
        lt0Var.o("logger", z2);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "JSONObject().apply {\n   …er)\n        }).toString()");
        return K(this, "mode-switch", lt0Var2, new java.lang.Long(2000L), eyVar, 8);
    }

    public final java.lang.Object G(boolean z, a.ey eyVar) {
        boolean e2 = a.wv.e(t(), "root");
        a.no1 no1Var = a.no1.f387a;
        if (e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(z);
            java.lang.Object K = K(this, "frame-time", sb.toString(), new java.lang.Long(2000L), eyVar, 8);
            if (K == a.dz.c) {
                return K;
            }
        }
        return no1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r6, a.ey r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.d10
            if (r0 == 0) goto L13
            r0 = r7
            a.d10 r0 = (a.d10) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a.d10 r0 = new a.d10
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.g
            a.dz r1 = a.dz.c
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.f
            a.b20.q1(r7)
            goto L70
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            a.b20.q1(r7)
            int r7 = r6.hashCode()
            r2 = 96415(0x1789f, float:1.35106E-40)
            java.lang.String r4 = "basic"
            if (r7 == r2) goto L5a
            r2 = 3506402(0x3580e2, float:4.913516E-39)
            if (r7 == r2) goto L51
            r2 = 93508654(0x592d42e, float:1.3807717E-35)
            if (r7 == r2) goto L4a
            goto L96
        L4a:
            boolean r7 = r6.equals(r4)
            if (r7 != 0) goto L62
            goto L96
        L51:
            java.lang.String r7 = "root"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L62
            goto L96
        L5a:
            java.lang.String r7 = "adb"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L96
        L62:
            r0.getClass()
            r0.f = r6
            r0.i = r3
            java.lang.Object r7 = r5.Q(r6, r0)
            if (r7 != r1) goto L70
            return r1
        L70:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7d
            a.q10.l = r6
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L7d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "setWorkingMode("
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = ") Fail!"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "Scene"
            android.util.Log.e(r7, r6)
            goto L98
        L96:
            a.q10.l = r4
        L98:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.H(java.lang.String, a.ey):java.lang.Object");
    }

    public final java.lang.Object I(int i2, a.ey eyVar) {
        java.lang.Object K = K(this, "short-boost", java.lang.String.valueOf(i2), null, eyVar, 12);
        return K == a.dz.c ? K : a.no1.f387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.fp0, a.lj1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.lang.String r10, java.lang.String r11, java.lang.Long r12, a.bp0 r13, a.ey r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof a.e10
            if (r0 == 0) goto L14
            r0 = r14
            a.e10 r0 = (a.e10) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            a.e10 r0 = new a.e10
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f
            a.dz r0 = a.dz.c
            int r1 = r7.h
            java.lang.String r8 = "error"
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            a.b20.q1(r14)
            goto L74
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            a.b20.q1(r14)
            goto L54
        L3a:
            a.b20.q1(r14)
            a.oo1 r14 = a.q10.j
            boolean r1 = r14.a()
            if (r1 == 0) goto L5b
            r7.h = r3
            r1 = r9
            r2 = r14
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.String r14 = r1.N(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L54
            return r0
        L54:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L59
            goto L5a
        L59:
            r8 = r14
        L5a:
            return r8
        L5b:
            boolean r14 = a.q10.w
            if (r14 != 0) goto L94
            java.nio.channels.SocketChannel r14 = q()
            if (r14 == 0) goto L7b
            r7.h = r2
            r1 = r9
            r2 = r14
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.String r14 = r1.N(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L74
            return r0
        L74:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L79
            goto L7a
        L79:
            r8 = r14
        L7a:
            return r8
        L7b:
            boolean r10 = a.q10.w
            if (r10 != 0) goto L94
            a.q10.w = r3
            h()
            a.k20 r10 = a.z80.b
            a.ay r10 = a.wv.b(r10)
            a.m10 r11 = new a.m10
            r12 = 0
            r11.<init>(r2, r12)
            r13 = 3
            a.wv.M0(r10, r12, r11, r13)
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.J(java.lang.String, java.lang.String, java.lang.Long, a.bp0, a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, a.ma1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.Object r17, java.lang.String r18, java.lang.String r19, java.lang.Long r20, a.bp0 r21, a.ey r22) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.N(java.lang.Object, java.lang.String, java.lang.String, java.lang.Long, a.bp0, a.ey):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0145, code lost:
    
        if (0 == 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O(boolean r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.O(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.String r10, a.ey r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.n10
            if (r0 == 0) goto L13
            r0 = r11
            a.n10 r0 = (a.n10) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.n10 r0 = new a.n10
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.h
            a.dz r1 = a.dz.c
            int r2 = r0.j
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            java.lang.String r7 = "adb"
            r8 = 0
            if (r2 == 0) goto L51
            if (r2 == r3) goto L49
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            a.b20.q1(r11)
            goto Lca
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            a.b20.q1(r11)
            goto Lb6
        L41:
            java.lang.String r10 = r0.g
            a.q10 r2 = r0.f
            a.b20.q1(r11)
            goto L8d
        L49:
            java.lang.String r10 = r0.g
            a.q10 r2 = r0.f
            a.b20.q1(r11)
            goto L6d
        L51:
            a.b20.q1(r11)
            boolean r11 = a.q10.h
            if (r11 == 0) goto L5f
            int r11 = a.q10.x
            if (r11 == r3) goto L5d
            goto L5f
        L5d:
            r2 = r9
            goto L78
        L5f:
            r0.f = r9
            r0.g = r10
            r0.j = r3
            java.lang.Object r11 = r9.S(r10, r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            r2 = r9
        L6d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L78
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L78:
            java.lang.String r11 = "root"
            boolean r11 = a.wv.e(r10, r11)
            if (r11 == 0) goto Lb7
            r0.f = r2
            r0.g = r10
            r0.j = r6
            java.lang.Object r11 = r2.R(r0)
            if (r11 != r1) goto L8d
            return r1
        L8d:
            java.lang.String r11 = (java.lang.String) r11
            boolean r3 = a.wv.e(r11, r7)
            if (r3 == 0) goto L9f
            r2.getClass()
            java.lang.String r3 = "exit"
            java.lang.String r4 = ""
            L(r3, r4, r8)
        L9f:
            boolean r11 = a.wv.e(r11, r7)
            boolean r11 = r2.O(r11)
            if (r11 != 0) goto Lcb
            r0.f = r8
            r0.g = r8
            r0.j = r5
            java.lang.Object r11 = r2.S(r10, r0)
            if (r11 != r1) goto Lb6
            return r1
        Lb6:
            return r11
        Lb7:
            boolean r11 = a.wv.e(r10, r7)
            if (r11 == 0) goto Lcb
            r0.f = r8
            r0.g = r8
            r0.j = r4
            java.lang.Object r11 = r2.S(r10, r0)
            if (r11 != r1) goto Lca
            return r1
        Lca:
            return r11
        Lcb:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.Q(java.lang.String, a.ey):java.lang.Object");
    }

    public final java.lang.Object R(a.ey eyVar) {
        return K(this, "user-group", "", new java.lang.Long(1000L), eyVar, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(java.lang.String r7, a.ey r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.o10
            if (r0 == 0) goto L13
            r0 = r8
            a.o10 r0 = (a.o10) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            a.o10 r0 = new a.o10
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            a.dz r1 = a.dz.c
            int r2 = r0.i
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r7 = r0.f
            a.b20.q1(r8)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            a.b20.q1(r8)
            r4 = 0
            T(r4)
            int r8 = a.q10.x
            r2 = 3
            if (r8 != r2) goto L50
            r0.f = r7
            r0.i = r3
            java.lang.Object r8 = r6.R(r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = a.wv.e(r8, r7)
            goto L51
        L50:
            r7 = 0
        L51:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.S(java.lang.String, a.ey):java.lang.Object");
    }

    @Override // a.u10
    public final void a(java.nio.channels.SocketChannel socketChannel) {
        android.util.Log.e("Scene", "Daemon [onConnectFail]");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, a.ma1] */
    @Override // a.u10
    public final void b(java.lang.String str, java.lang.String str2) {
        if (g != null) {
            try {
                switch (str.hashCode()) {
                    case -884997049:
                        if (str.equals("@Replay")) {
                            a.lt0 lt0Var = new a.lt0(str2);
                            w(lt0Var.h("id"), lt0Var.h("response"));
                            return;
                        }
                        return;
                    case -838369973:
                        if (str.equals("@Notification")) {
                            a.ma1 obj = new a.ma1();
                            obj.c = "";
                            a.ma1 obj2 = new a.ma1();
                            obj2.c = "";
                            try {
                                if (str2.length() > 0) {
                                    if (a.yi1.g2(str2, "|")) {
                                        int m2 = a.yi1.m2(str2, "|", 0, false, 6);
                                        java.lang.String substring = str2.substring(0, m2);
                                        a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        byte[] decode = android.util.Base64.decode(substring, 11);
                                        a.wv.v(decode, "decode(\n                …                        )");
                                        java.nio.charset.Charset charset = a.bu.f53a;
                                        obj.c = new java.lang.String(decode, charset);
                                        java.lang.String substring2 = str2.substring(m2 + 1);
                                        a.wv.v(substring2, "this as java.lang.String).substring(startIndex)");
                                        byte[] decode2 = android.util.Base64.decode(substring2, 11);
                                        a.wv.v(decode2, "decode(\n                …                        )");
                                        obj2.c = new java.lang.String(decode2, charset);
                                    } else {
                                        byte[] decode3 = android.util.Base64.decode(str2, 11);
                                        a.wv.v(decode3, "decode(\n                …                        )");
                                        obj.c = new java.lang.String(decode3, a.bu.f53a);
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.t00(obj, obj2, null), 3);
                            return;
                        }
                        return;
                    case -414679454:
                        if (str.equals("@TaskResult")) {
                            java.lang.String substring3 = str2.substring(a.yi1.m2(str2, ":", 0, false, 6) + 1, a.yi1.m2(str2, "=", 0, false, 6));
                            a.wv.v(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                            java.lang.String substring4 = str2.substring(a.yi1.m2(str2, "=", 0, false, 6) + 1, str2.length());
                            a.wv.v(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.q00(substring3, substring4.length() > 0 ? android.util.Base64.decode(substring4, 11) : new byte[0], null), 3);
                            return;
                        }
                        return;
                    case 1857247803:
                        if (str.equals("@Replaying")) {
                            a.lt0 lt0Var2 = new a.lt0(str2);
                            java.lang.String h2 = lt0Var2.h("id");
                            java.lang.String h3 = lt0Var2.h("response");
                            a.bp0 bp0Var = (a.bp0) s.get(h2);
                            if (bp0Var != null) {
                                bp0Var.i(h3);
                            } else {
                                android.util.Log.e("@Scene", "ApiRequest " + h2 + " Callback Removed!");
                            }
                        }
                        return;
                    case 1911967788:
                        if (str.equals("@Scene")) {
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.s00(str2, null), 3);
                            return;
                        }
                        return;
                    case 1913245127:
                        if (str.equals("@Toast")) {
                            a.wv.M0(a.wv.b(a.z80.b), null, new a.r00(str2, null), 3);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a.fp0, a.lj1] */
    @Override // a.u10
    public final void c(java.nio.channels.SocketChannel socketChannel, a.n00 n00Var) {
        h();
        o.add(0, socketChannel);
        x = 3;
        android.util.Log.i("Scene", "Daemon [onConnected]");
        a.wv.M0(a.wv.b(a.z80.b), null, new a.lj1(2, null), 3);
    }

    @Override // a.u10
    public final void d(java.nio.channels.SocketChannel socketChannel) {
        a.wv.w(socketChannel, "socketChannel");
        java.util.ArrayList arrayList = o;
        if (arrayList.contains(socketChannel)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = r;
            java.util.Collection values = concurrentHashMap.values();
            a.wv.v(values, "replayListening.values");
            if (arrayList.size() == 1 && (!values.isEmpty())) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(values);
                concurrentHashMap.clear();
                new java.lang.Thread(new a.fw(8, arrayList2)).start();
            }
            arrayList.remove(socketChannel);
        }
        if (arrayList.isEmpty()) {
            x = 1;
        }
        android.util.Log.e("Scene", "Daemon [onDisconnect]");
    }

    @Override // a.u10
    public final void e(java.lang.String str, java.lang.String str2) {
        if (a.wv.e(str2, "exit")) {
            x = 1;
        } else if (a.wv.e(str2, "license")) {
            a.wv.e(l, "root");
        }
    }

    @Override // a.u10
    public final void f(int i2) {
    }

    public final java.lang.Object i(java.lang.String str, java.lang.String[] strArr, a.ey eyVar) {
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        for (java.lang.String str3 : strArr) {
            arrayList.add(str3);
        }
        try {
            a.nk nkVar = new a.nk(6, 0);
            a.mt0 mt0Var = a.mt0.c;
            nkVar.I(mt0Var, "[");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nkVar.W(it.next());
            }
            nkVar.d(mt0Var, a.mt0.d, "]");
            str2 = nkVar.toString();
        } catch (a.kt0 unused) {
            str2 = null;
        }
        java.lang.String str4 = str2;
        a.wv.v(str4, "dumpArgs.toString()");
        return K(this, "dumpsys", str4, new java.lang.Long(5000L), eyVar, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[Catch: Exception -> 0x0093, LOOP:0: B:17:0x0075->B:19:0x007b, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x0093, blocks: (B:16:0x0066, B:17:0x0075, B:19:0x007b), top: B:15:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m(a.ey r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof a.l00
            if (r0 == 0) goto L14
            r0 = r11
            a.l00 r0 = (a.l00) r0
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
            a.l00 r0 = new a.l00
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.g
            a.dz r0 = a.dz.c
            int r1 = r5.i
            r7 = 1
            if (r1 == 0) goto L33
            if (r1 != r7) goto L2b
            java.util.ArrayList r0 = r5.f
            a.b20.q1(r11)
            goto L56
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            a.b20.q1(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r2 = "cpu-cycles"
            java.lang.String r3 = ""
            java.lang.Long r4 = new java.lang.Long
            r8 = 2000(0x7d0, double:9.88E-321)
            r4.<init>(r8)
            r6 = 8
            r5.f = r11
            r5.i = r7
            r1 = r10
            java.lang.Object r1 = K(r1, r2, r3, r4, r5, r6)
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = r11
            r11 = r1
        L56:
            java.lang.String r11 = (java.lang.String) r11
            int r1 = r11.length()
            if (r1 <= 0) goto L93
            java.lang.String r1 = "error"
            boolean r1 = a.wv.e(r11, r1)
            if (r1 != 0) goto L93
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L93
            java.lang.String r2 = "\n"
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L93
            java.util.List r11 = a.yi1.y2(r11, r1)     // Catch: java.lang.Exception -> L93
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L93
        L75:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Exception -> L93
            if (r1 == 0) goto L93
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Exception -> L93
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L93
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L93
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3     // Catch: java.lang.Exception -> L93
            long r1 = r1 / r3
            int r1 = (int) r1     // Catch: java.lang.Exception -> L93
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Exception -> L93
            r2.<init>(r1)     // Catch: java.lang.Exception -> L93
            r0.add(r2)     // Catch: java.lang.Exception -> L93
            goto L75
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.m(a.ey):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:10)(2:26|27))(2:28|(1:30))|11|12|13|(1:(1:22)(1:23))(1:17)|18|19))|31|6|7|(0)(0)|11|12|13|(1:15)|(0)(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r9, java.lang.Double r10, a.ey r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof a.o00
            if (r0 == 0) goto L14
            r0 = r11
            a.o00 r0 = (a.o00) r0
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
            a.o00 r0 = new a.o00
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.g
            a.dz r0 = a.dz.c
            int r1 = r5.i
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Double r10 = r5.f
            a.b20.q1(r11)
            goto L4f
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            a.b20.q1(r11)
            java.lang.String r11 = "temperature"
            java.lang.Long r4 = new java.lang.Long
            r6 = 1000(0x3e8, double:4.94E-321)
            r4.<init>(r6)
            r6 = 8
            r5.f = r10
            r5.i = r2
            r1 = r8
            r2 = r11
            r3 = r9
            java.lang.Object r11 = K(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L4f
            return r0
        L4f:
            java.lang.String r11 = (java.lang.String) r11
            int r9 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Exception -> L5b
            r11.<init>(r9)     // Catch: java.lang.Exception -> L5b
            goto L5c
        L5b:
            r11 = 0
        L5c:
            if (r11 == 0) goto L70
            r9 = -1
            int r0 = r11.intValue()
            if (r0 == r9) goto L70
            int r9 = r11.intValue()
            int r9 = r9 / 100
            double r9 = (double) r9
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r9 = r9 / r0
            goto L79
        L70:
            if (r10 == 0) goto L77
            double r9 = r10.doubleValue()
            goto L79
        L77:
            r9 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L79:
            java.lang.Double r11 = new java.lang.Double
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.s(java.lang.String, java.lang.Double, a.ey):java.lang.Object");
    }

    public final boolean u() {
        java.lang.String g2 = a.ai1.g("@version:", d);
        if (k) {
            a.oo1 oo1Var = j;
            android.net.LocalSocket localSocket = oo1Var.f415a;
            if (!localSocket.isConnected()) {
                try {
                    localSocket.connect(new android.net.LocalSocketAddress("Scene", android.net.LocalSocketAddress.Namespace.ABSTRACT));
                    oo1Var.b = new java.io.DataOutputStream(new java.io.BufferedOutputStream(localSocket.getOutputStream()));
                    oo1Var.c = new java.io.DataInputStream(new java.io.BufferedInputStream(localSocket.getInputStream()));
                    oo1Var.d = false;
                    if (oo1Var.a()) {
                        new a.c10(oo1Var, this).start();
                        M(oo1Var, j("@version:" + d));
                        v(this, g2);
                        return true;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return v(this, g2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(a.ey r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof a.v00
            if (r0 == 0) goto L14
            r0 = r11
            a.v00 r0 = (a.v00) r0
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
            a.v00 r0 = new a.v00
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f
            a.dz r0 = a.dz.c
            int r1 = r5.h
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 != r7) goto L29
            a.b20.q1(r11)
            goto L4b
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L31:
            a.b20.q1(r11)
            java.lang.String r2 = "ping"
            java.lang.String r3 = ""
            java.lang.Long r4 = new java.lang.Long
            r8 = 2000(0x7d0, double:9.88E-321)
            r4.<init>(r8)
            r6 = 8
            r5.h = r7
            r1 = r10
            java.lang.Object r11 = K(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L4b
            return r0
        L4b:
            java.lang.String r0 = "error"
            boolean r11 = a.wv.e(r11, r0)
            r11 = r11 ^ r7
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.x(a.ey):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(int r8, java.lang.String r9, a.ey r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof a.x00
            if (r0 == 0) goto L14
            r0 = r10
            a.x00 r0 = (a.x00) r0
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
            a.x00 r0 = new a.x00
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.f
            a.dz r0 = a.dz.c
            int r1 = r5.h
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            a.b20.q1(r10)
            goto L54
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            a.b20.q1(r10)
            java.lang.String r10 = "event"
            java.lang.String r8 = a.ai1.A(r8)
            java.lang.String r1 = "|"
            java.lang.String r3 = a.ii1.f(r8, r1, r9)
            java.lang.Long r4 = new java.lang.Long
            r8 = 1000(0x3e8, double:4.94E-321)
            r4.<init>(r8)
            r6 = 8
            r5.h = r2
            r1 = r7
            r2 = r10
            java.lang.Object r10 = K(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L54
            return r0
        L54:
            java.lang.String r8 = "success"
            boolean r8 = a.wv.e(r10, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q10.y(int, java.lang.String, a.ey):java.lang.Object");
    }
}
