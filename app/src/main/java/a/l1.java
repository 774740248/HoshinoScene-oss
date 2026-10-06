package a;

import java.io.File;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class l1 implements a.sa0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;
    public final android.content.Context b;

    public l1(android.content.Context context, int i) {
        this.f305a = i;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 3:
            default:
                this.b = context.getApplicationContext();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 5:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 7:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 8:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 9:
                a.wv.w(context, "ctx");
                this.b = context;
                return;
            case 10:
                a.wv.w(context, "ctx");
                this.b = context;
                return;
            case 11:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 12:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 13:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 14:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 15:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 16:
                a.wv.w(context, "context");
                this.b = context;
                return;
            case 17:
                a.wv.w(context, "context");
                this.b = context;
                return;
        }
    }

    public static final a.yt0 b(a.l1 l1Var) {
        l1Var.getClass();
        new a.ls();
        java.lang.String[] split = a.nu0.d("/sys/devices/system/cpu/cpu0/cpufreq/scaling_available_governors").split("[ ]+");
        java.lang.String z = a.gy.z();
        java.lang.String[] strArr = (a.wv.e(z, "mt6991") || a.wv.e(z, "mt6993")) ? new java.lang.String[]{"sugov_ext", "performance", "conservative"} : new java.lang.String[]{"uag", "walt", "sugov_ext", "schedutil", "performance", "conservative"};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            a.wv.v(split, "availableGovernors");
            if (a.op.K1(split, str)) {
                arrayList.add(str);
            }
        }
        java.util.ArrayList x2 = a.qv.x2(arrayList);
        x2.add(0, "auto");
        java.lang.String[] strArr2 = (java.lang.String[]) x2.toArray(new java.lang.String[0]);
        return new a.yt0(java.util.Arrays.copyOf(strArr2, strArr2.length));
    }

    public static java.lang.String i(java.lang.String str) {
        return a.ai1.h("'", a.yi1.v2(str, "'", "'\\''"), "'");
    }

    public static java.lang.String l(java.lang.String str) {
        int p2 = a.yi1.p2(str, '.');
        if (a.yi1.B2(str, "split_") && p2 > 6) {
            java.lang.String substring = str.substring(6, p2);
            a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        if (a.wv.e(str, "base.apk")) {
            return "master";
        }
        if (p2 <= 0) {
            return str;
        }
        java.lang.String substring2 = str.substring(0, p2);
        a.wv.v(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring2;
    }

    @Override // a.sa0
    public final void a(a.b20 b20Var) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new a.rw("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new a.ua0(this, b20Var, threadPoolExecutor, 0));
    }

    public final java.util.ArrayList c() {
        try {
            java.lang.String string = android.provider.Settings.Secure.getString(this.b.getContentResolver(), "enabled_input_methods");
            if (string != null && string.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.List y2 = a.yi1.y2(string, new java.lang.String[]{":"});
                java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(y2, 10));
                java.util.Iterator it = y2.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) a.qv.e2(a.yi1.y2((java.lang.String) it.next(), new java.lang.String[]{"/"})));
                }
                a.qv.v2(arrayList2, arrayList);
                return arrayList;
            }
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.b.getSystemService("input_method");
        if (inputMethodManager != null) {
            java.util.List<android.view.inputmethod.InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            a.wv.v(inputMethodList, "im.inputMethodList");
            java.util.Iterator<android.view.inputmethod.InputMethodInfo> it2 = inputMethodList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getPackageName());
            }
        }
        return arrayList3;
    }

    public final a.yt0 d() {
        boolean z;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        int i4 = 4;
        switch (this.f305a) {
            case 9:
                java.lang.String u = a.gy.u();
                boolean K1 = a.op.K1(new java.lang.String[]{"waipio", "lahaina", "cliffs", "mt6893", "mt6895", "mt6897", "mt6899", "mt6983", "mt6985", "zuma", "kera", "kona", "msmnile"}, u);
                a.q10 q10Var = a.q10.f457a;
                java.lang.String L = a.q10.L("fas-supported", "", 1000L);
                if (L.length() <= 0 || a.wv.e(L, "error")) {
                    L = null;
                }
                java.lang.String str = a.wv.e(L != null ? L : "", "FASLite") ? "never" : "always";
                java.lang.String str2 = android.os.Build.MANUFACTURER;
                if (str2 != null) {
                    java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
                    a.wv.v(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (a.wv.e(lowerCase, "xiaomi") || a.wv.e(lowerCase, "poco")) {
                        z = true;
                        return new a.yt0(new a.yc0(str, this, i3), new a.yc0(str, this, i2), new a.ad0(str, this, u, z, K1), new a.xc0(this, 19), new a.xc0(this, 21));
                    }
                }
                z = false;
                return new a.yt0(new a.yc0(str, this, i3), new a.yc0(str, this, i2), new a.ad0(str, this, u, z, K1), new a.xc0(this, 19), new a.xc0(this, 21));
            default:
                a.xa1 xa1Var = new a.xa1();
                int e = xa1Var.e();
                java.util.List d = xa1Var.d();
                java.lang.Object[] objArr = new a.zt0[4];
                a.lt0 lt0Var = new a.lt0();
                lt0Var.m(o(2131953287) + " (" + e + "Hz)", "label");
                lt0Var.m("peak", "value");
                if (e <= 120) {
                    lt0Var = null;
                }
                objArr[0] = lt0Var;
                a.ra1 ra1Var = new a.ra1(this, 7);
                a.lt0 lt0Var2 = new a.lt0();
                ra1Var.i(lt0Var2);
                java.util.Iterator it = d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (a.wv.u1(((a.ua1) obj).d) == 120) {
                        }
                    } else {
                        obj = null;
                    }
                }
                if (obj == null) {
                    lt0Var2 = null;
                }
                objArr[1] = lt0Var2;
                a.ra1 ra1Var2 = new a.ra1(this, 8);
                a.lt0 lt0Var3 = new a.lt0();
                ra1Var2.i(lt0Var3);
                java.util.Iterator it2 = d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (a.wv.u1(((a.ua1) obj2).d) == 90) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    lt0Var3 = null;
                }
                objArr[2] = lt0Var3;
                int i5 = 9;
                a.ra1 ra1Var3 = new a.ra1(this, i5);
                a.lt0 lt0Var4 = new a.lt0();
                ra1Var3.i(lt0Var4);
                java.util.Iterator it3 = d.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (a.wv.u1(((a.ua1) obj3).d) == 60) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 == null) {
                    lt0Var4 = null;
                }
                objArr[3] = lt0Var4;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i6 = 0; i6 < 4; i6++) {
                    fl obj4 = (fl) objArr[i6];
                    if (obj4 != null) {
                        arrayList.add(obj4);
                    }
                }
                java.lang.String str3 = android.os.Build.MANUFACTURER;
                a.wv.v(str3, "MANUFACTURER");
                java.util.Locale locale = java.util.Locale.ENGLISH;
                a.wv.e(a.ai1.k(locale, "ENGLISH", str3, locale, "this as java.lang.String).toLowerCase(locale)"), "xiaomi");
                return new a.yt0(new a.qa1(this, arrayList, i), new a.qa1(this, arrayList, i4), new a.qa1(this, arrayList, 6), new a.qa1(this, arrayList, i5), new a.qa1(this, arrayList, 11), new a.ra1(this, i4), new a.sa1(this, a.gy.G() && android.os.Build.VERSION.SDK_INT > 34, i));
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, a.fl] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, a.fl] */
    public final a.tk e(java.lang.String str) {
        int i;
        java.lang.Object obj;
        a.wv.w(str, "apks");
        java.util.zip.ZipFile zipFile = new java.util.zip.ZipFile(str);
        try {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = zipFile.entries();
            a.wv.v(entries, "zip.entries()");
            java.util.ArrayList<java.util.zip.ZipEntry> list = java.util.Collections.list(entries);
            a.wv.v(list, "list(this)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.util.zip.ZipEntry zipEntry = (java.util.zip.ZipEntry) obj;
                if (a.wv.e(zipEntry.getName(), "toc.json")) {
                    break;
                }
                java.lang.String name = zipEntry.getName();
                a.wv.v(name, "it.name");
                if (a.yi1.h2(name, "/toc.json", false)) {
                    break;
                }
            }
            java.util.zip.ZipEntry zipEntry2 = (java.util.zip.ZipEntry) obj;
            a.tk tkVar = new a.tk(6);
            if (zipEntry2 != null) {
                try {
                    java.io.InputStream inputStream = zipFile.getInputStream(zipEntry2);
                    a.wv.v(inputStream, "zip.getInputStream(tocEntry)");
                    java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, a.bu.f53a);
                    java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
                    try {
                        java.lang.String j1 = a.wv.j1(bufferedReader);
                        a.wv.z(bufferedReader, null);
                        a.lt0 lt0Var = new a.lt0(j1);
                        tkVar.d = lt0Var.j("formatVersion", 1);
                        java.lang.Object obj2 = lt0Var.f329a.get("splits");
                        a.jt0 jt0Var = obj2 instanceof a.jt0 ? (a.jt0) obj2 : null;
                        if (jt0Var != null) {
                            int size = jt0Var.f269a.size();
                            for (i = 0; i < size; i++) {
                                a.lt0 c = jt0Var.c(i);
                                java.lang.String l = c.l("fileName");
                                if (l.length() != 0) {
                                    java.lang.String l2 = c.l("id");
                                    if (l2.length() == 0) {
                                        java.lang.String name2 = new java.io.File(l).getName();
                                        a.wv.v(name2, "File(fileName).name");
                                        l2 = l(name2);
                                    }
                                    java.lang.String l3 = c.l("targeting");
                                    if (l3.length() == 0) {
                                        l3 = m(l2);
                                    }
                                    java.util.ArrayList arrayList = (java.util.ArrayList) tkVar.e;
                                    fl obj3 = new fl();
                                    obj3.f153a = l;
                                    obj3.b = l2;
                                    obj3.c = l3;
                                    arrayList.add(obj3);
                                }
                            }
                        }
                    } finally {
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it2 = ((java.util.ArrayList) tkVar.e).iterator();
            while (it2.hasNext()) {
                java.lang.String str2 = ((a.fl) it2.next()).f153a;
                if (str2 != null) {
                    hashSet.add(str2);
                    hashSet.add(new java.io.File(str2).getName());
                }
            }
            for (java.util.zip.ZipEntry zipEntry3 : list) {
                if (!zipEntry3.isDirectory()) {
                    java.lang.String name3 = zipEntry3.getName();
                    a.wv.v(name3, "entry.name");
                    if (a.yi1.h2(name3, ".apk", true)) {
                        java.lang.String name4 = new java.io.File(zipEntry3.getName()).getName();
                        if (!hashSet.contains(zipEntry3.getName()) && !hashSet.contains(name4)) {
                            a.wv.v(name4, "name");
                            java.lang.String l4 = l(name4);
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) tkVar.e;
                            fl obj4 = new fl();
                            /* TODO: jadx type unresolved, defaulted to Object */
                            obj4.f153a = zipEntry3.getName();
                            obj4.b = l4;
                            obj4.c = m(l4);
                            arrayList2.add(obj4);
                            hashSet.add(zipEntry3.getName());
                            hashSet.add(name4);
                        }
                    }
                }
            }
            java.util.ArrayList arrayList3 = (java.util.ArrayList) tkVar.e;
            if (arrayList3.size() > 1) {
                a.ov.Z1(arrayList3, new a.py(7));
            }
            a.wv.z(zipFile, null);
            return tkVar;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                a.wv.z(zipFile, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.FilenameFilter, java.lang.Object] */
    public final java.util.ArrayList f() {
        java.util.List list;
        new a.vc0(this.b).c("custom-command");
        java.lang.String str = a.pe0.f434a;
        java.io.File file = new java.io.File(a.pe0.d(this.b, "custom-command"));
        if (!file.exists()) {
            return new java.util.ArrayList();
        }
        java.io.File[] listFiles = file.listFiles(new java.io.FilenameFilter());
        if (listFiles != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(listFiles.length);
            for (java.io.File file2 : listFiles) {
                a.s10 s10Var = new a.s10();
                java.lang.String decode = java.net.URLDecoder.decode(file2.getName());
                a.wv.v(decode, "decode(it.name)");
                s10Var.c = decode;
                java.lang.String absolutePath = file2.getAbsolutePath();
                a.wv.v(absolutePath, "it.absolutePath");
                s10Var.d = absolutePath;
                arrayList.add(s10Var);
            }
            list = a.qv.s2(arrayList, new a.py(8));
        } else {
            list = null;
        }
        return new java.util.ArrayList(list);
    }

    public final void g(final int i) {
        android.view.View inflate = android.view.LayoutInflater.from(this.b).inflate(2131558498, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(2131362397);
        a.wv.t(findViewById, "null cannot be cast to non-null type com.omarea.common.ui.InputView");
        com.omarea.common.ui.InputView inputView = (com.omarea.common.ui.InputView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(2131362396);
        a.wv.t(findViewById2, "null cannot be cast to non-null type android.widget.CheckBox");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById2;
        a.cp cpVar = com.omarea.Scene.c;
        java.lang.String E = a.fs1.E("wifi_mac", "ec:d0:9f:af:95:01");
        if (E == null) {
            E = "";
        }
        inputView.setText(E);
        checkBox.setChecked(java.lang.Integer.valueOf(a.fs1.D().getInt("wifi_mac_autochange_mode", 0)).equals(java.lang.Integer.valueOf(i)));
        checkBox.setOnCheckedChangeListener(new a.t40());
        int i2 = a.x60.f681a;
        android.content.Context context = this.b;
        java.lang.String string = context.getString(2131952199);
        a.wv.v(string, "context.getString(R.string.dialog_mac_custom)");
        a.fs1.h(context, string, "", inflate, new a.m30(inputView, this, i, 4), null);
    }

    public final void h(java.lang.String str) {
        android.content.Context context = this.b;
        try {
            if (a.yi1.B2(str, "alipayqr://") || a.yi1.B2(str, "alipays://")) {
                context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
            } else {
                try {
                    java.lang.String encode = java.net.URLEncoder.encode(str, "utf-8");
                    a.wv.v(encode, "encode(qrcode, \"utf-8\")");
                    str = encode;
                } catch (java.lang.Exception unused) {
                }
                context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("alipayqr://platformapi/startapp?saId=10000007&qrcode=".concat(str) + "%3F_s%3Dweb-other&_t=" + java.lang.System.currentTimeMillis())));
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public final void j() {
        org.w3c.dom.Node namedItem;
        switch (this.f305a) {
            case 13:
                java.lang.String str = android.os.Build.VERSION.SDK_INT >= 30 ? "/data/misc/apexdata/com.android.wifi/WifiConfigStore.xml" : "/data/misc/wifi/WifiConfigStore.xml";
                a.nu0 nu0Var = a.nu0.f395a;
                java.lang.String d = a.nu0.d(str);
                if (d.length() > 0) {
                    javax.xml.parsers.DocumentBuilder newDocumentBuilder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    byte[] bytes = d.getBytes(a.bu.f53a);
                    a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
                    org.w3c.dom.NodeList elementsByTagName = newDocumentBuilder.parse(new java.io.ByteArrayInputStream(bytes)).getElementsByTagName("WifiConfiguration");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int length = elementsByTagName.getLength();
                    for (int i = 0; i < length; i++) {
                        org.w3c.dom.NodeList childNodes = elementsByTagName.item(i).getChildNodes();
                        int length2 = childNodes.getLength();
                        for (int i2 = 0; i2 < length2; i2++) {
                            if (childNodes.item(i2).hasChildNodes() && (namedItem = childNodes.item(i2).getAttributes().getNamedItem("name")) != null) {
                                if (a.wv.e(namedItem.getNodeValue(), "SSID")) {
                                    sb.append(this.b.getString(2131952194));
                                    sb.append(childNodes.item(i2).getTextContent());
                                    sb.append("\n");
                                } else if (a.wv.e(namedItem.getNodeValue(), "PreSharedKey")) {
                                    sb.append(this.b.getString(2131952193));
                                    sb.append(childNodes.item(i2).getTextContent());
                                    sb.append("\n");
                                }
                            }
                        }
                        sb.append("\n\n");
                    }
                    int i3 = a.x60.f681a;
                    android.content.Context context = this.b;
                    java.lang.String string = context.getString(2131952191);
                    a.wv.v(string, "context.getString(R.string.dialog_addin_wlan_log)");
                    java.lang.String sb2 = sb.toString();
                    a.wv.v(sb2, "stringBuild.toString()");
                    a.fs1.F(context, string, a.yi1.F2(sb2).toString(), null);
                    return;
                }
                java.lang.String d2 = a.nu0.d("/data/misc/wifi/wpa_supplicant.conf");
                if (d2.length() <= 0) {
                    android.content.Context context2 = this.b;
                    a.ai1.r(context2, 2131952192, context2, 1);
                    return;
                }
                java.util.List<java.lang.String> y2 = a.yi1.y2(d2, new java.lang.String[]{"\n\n"});
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                for (java.lang.String str2 : y2) {
                    if (a.yi1.B2(a.yi1.F2(str2).toString(), "network=")) {
                        sb3.append(str2);
                    }
                }
                java.lang.String sb4 = sb3.toString();
                a.wv.v(sb4, "sb.toString()");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\s\\t]{0,}network=\\{");
                a.wv.v(compile, "compile(pattern)");
                java.lang.String replaceAll = compile.matcher(sb4).replaceAll("\n");
                a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("[\\s\\t]{0,}bssid=.*");
                a.wv.v(compile2, "compile(pattern)");
                java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
                a.wv.v(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile3 = java.util.regex.Pattern.compile("[\\s\\t]{0,}ssid=");
                a.wv.v(compile3, "compile(pattern)");
                java.lang.String str3 = "\n" + this.b.getString(2131952194);
                a.wv.w(str3, "replacement");
                java.lang.String replaceAll3 = compile3.matcher(replaceAll2).replaceAll(str3);
                a.wv.v(replaceAll3, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile4 = java.util.regex.Pattern.compile("[\\s\\t]{0,}psk=");
                a.wv.v(compile4, "compile(pattern)");
                java.lang.String str4 = "\n" + this.b.getString(2131952193);
                a.wv.w(str4, "replacement");
                java.lang.String replaceAll4 = compile4.matcher(replaceAll3).replaceAll(str4);
                a.wv.v(replaceAll4, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile5 = java.util.regex.Pattern.compile("[\\s\\t]{0,}priority=.*");
                a.wv.v(compile5, "compile(pattern)");
                java.lang.String replaceAll5 = compile5.matcher(replaceAll4).replaceAll("");
                a.wv.v(replaceAll5, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile6 = java.util.regex.Pattern.compile("[\\s\\t]{0,}priority=.*");
                a.wv.v(compile6, "compile(pattern)");
                java.lang.String replaceAll6 = compile6.matcher(replaceAll5).replaceAll("");
                a.wv.v(replaceAll6, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile7 = java.util.regex.Pattern.compile("[\\s\\t]{0,}key_mgmt=.*");
                a.wv.v(compile7, "compile(pattern)");
                java.lang.String replaceAll7 = compile7.matcher(replaceAll6).replaceAll("");
                a.wv.v(replaceAll7, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.regex.Pattern compile8 = java.util.regex.Pattern.compile("[\\s\\t]{0,}disabled=.*");
                a.wv.v(compile8, "compile(pattern)");
                java.lang.String replaceAll8 = compile8.matcher(replaceAll7).replaceAll("");
                a.wv.v(replaceAll8, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.lang.String obj = a.yi1.F2(a.yi1.v2(a.yi1.v2(replaceAll8, "}", ""), "\"", "")).toString();
                sb3.setLength(0);
                for (java.lang.String str5 : (Iterable<java.lang.String>) a.yi1.y2(obj, new java.lang.String[]{"\n"})) {
                    if (a.yi1.B2(a.yi1.F2(str5).toString(), "id_str=")) {
                        java.lang.String substring = str5.substring(a.yi1.m2(str5, "=", 0, false, 6));
                        a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                        try {
                            a.lt0 lt0Var = new a.lt0(java.net.URLDecoder.decode(substring, "UTF-8"));
                            if (lt0Var.f329a.containsKey("configKey")) {
                                sb3.append("IDStr:");
                                sb3.append(lt0Var.h("configKey"));
                                sb3.append("\n");
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    } else {
                        sb3.append(str5);
                        sb3.append("\n");
                    }
                }
                int i4 = a.x60.f681a;
                android.content.Context context3 = this.b;
                java.lang.String string2 = context3.getString(2131952191);
                a.wv.v(string2, "context.getString(R.string.dialog_addin_wlan_log)");
                java.lang.String sb5 = sb3.toString();
                a.wv.v(sb5, "sb.toString()");
                a.fs1.F(context3, string2, sb5, null);
                return;
            default:
                android.view.View inflate = android.view.LayoutInflater.from(this.b).inflate(2131558522, (android.view.ViewGroup) null);
                int i5 = a.x60.f681a;
                android.content.Context context4 = this.b;
                a.wv.v(inflate, "view");
                inflate.findViewById(2131362097).setOnClickListener(new a.q60(a.fs1.m(context4, inflate, true), 19));
                inflate.findViewById(2131362098).setOnClickListener(new a.gv(27, this));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, a.ma1] */
    public final void k(final a.u5 u5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        a.ma1 obj = new a.ma1();
        android.view.View inflate = android.view.LayoutInflater.from(this.b).inflate(2131558541, (android.view.ViewGroup) null);
        final android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362933);
        a.ka1 obj2 = new a.ka1();
        int i5 = u5Var.f576a;
        switch (i5) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                i = u5Var.d;
                break;
            default:
                i = u5Var.d;
                break;
        }
        obj2.c = i;
        final int i6 = 0;
        inflate.findViewById(2131362931).setOnClickListener(new a.w70());
        final int i7 = 1;
        inflate.findViewById(2131362932).setOnClickListener(new a.w70());
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(2131362930);
        switch (i5) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                i2 = u5Var.b;
                break;
            default:
                i2 = u5Var.b;
                break;
        }
        switch (i5) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                i3 = u5Var.c;
                break;
            default:
                i3 = u5Var.c;
                break;
        }
        textView2.setText(i2 + " ~ " + i3);
        switch (i5) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                i4 = u5Var.d;
                break;
            default:
                i4 = u5Var.d;
                break;
        }
        textView.setText(java.lang.String.valueOf(i4));
        int i8 = a.x60.f681a;
        android.content.Context context = this.b;
        java.lang.String string = context.getString(2131952077);
        a.wv.v(string, "context.getString(R.string.btn_confirm)");
        obj.c = a.fs1.j(context, inflate, new a.u60(string, (java.lang.Runnable) new a.u1(textView, obj2, u5Var, obj, 7), false));
    }

    public final java.lang.String m(java.lang.String str) {
        if (a.wv.e(str, "master")) {
            java.lang.String string = this.b.getString(2131951870);
            a.wv.v(string, "{\n            context.ge…s_split_master)\n        }");
            return string;
        }
        java.lang.String str2 = (java.lang.String) a.qv.m2(a.yi1.y2(str, new java.lang.String[]{"."}));
        if (str2 == null) {
            str2 = "";
        }
        if (a.yi1.g2(str2, "dpi")) {
            str = this.b.getString(2131951868, str2);
        } else if (a.yi1.B2(str2, "arm") || a.yi1.B2(str2, "x86") || a.yi1.B2(str2, "mips")) {
            str = this.b.getString(2131951867, str2);
        } else if (a.wv.e(str2, "zh") || a.wv.e(str2, "en")) {
            str = this.b.getString(2131951869, str2);
        } else if (a.wv.e(str, "workload_pack")) {
            str = this.b.getString(2131951872);
        }
        a.wv.v(str, "{\n            val subId …d\n            }\n        }");
        return str;
    }

    public final void n(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.content.ComponentName component = intent.getComponent();
        java.lang.String className = component != null ? component.getClassName() : null;
        android.content.ComponentName component2 = intent.getComponent();
        java.lang.String packageName = component2 != null ? component2.getPackageName() : null;
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root") && className != null) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.va(packageName, className, null), 3);
            return;
        }
        intent.setFlags((intent.getFlags() & (-2097153)) | 268500992);
        intent.addFlags(1048576);
        intent.setPackage(null);
        this.b.startActivity(intent);
    }

    public final java.lang.String o(int i) {
        switch (this.f305a) {
            case 9:
                java.lang.String string = this.b.getString(i);
                a.wv.v(string, "ctx.getString(id)");
                return string;
            default:
                java.lang.String string2 = this.b.getString(i);
                a.wv.v(string2, "ctx.getString(id)");
                return string2;
        }
    }
}
