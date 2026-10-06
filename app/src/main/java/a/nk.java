package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class nk implements a.w11, a.ks0 {

    public nk() {
    }

    public nk(a.er1 er1Var, a.fa0 fa0Var, int i) {
        this.c = i;
        this.d = er1Var;
        this.e = fa0Var;
    }

    public static a.nk g;
    public static long h;
    public final /* synthetic */ int c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nk(a.er1 er1Var, a.fa0 fa0Var, int i) {
        this(er1Var, fa0Var);
        this.c = 5;
        a.wv.w(er1Var, "store");
        a.wv.w(fa0Var, "factory");
    }

    public static a.nk G(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i) {
        return new a.nk(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void N(final a.nk nkVar) {
        android.view.View inflate = ((android.app.Activity) nkVar.d).getLayoutInflater().inflate(2131558550, (android.view.ViewGroup) null);
        int i = a.x60.f681a;
        android.app.Activity activity = (android.app.Activity) nkVar.d;
        a.wv.v(inflate, "view");
        final int i2 = 1;
        final a.v60 m = a.fs1.m(activity, inflate, true);
        final int i3 = 0;
        inflate.findViewById(2131362800).setOnClickListener(new a.l40());
        inflate.findViewById(2131362788).setOnClickListener(new a.l40());
        final int i4 = 2;
        inflate.findViewById(2131362799).setOnClickListener(new a.l40());
        final int i5 = 3;
        inflate.findViewById(2131362794).setOnClickListener(new a.l40());
        final int i6 = 4;
        inflate.findViewById(2131362792).setOnClickListener(new a.l40());
        final int i7 = 5;
        inflate.findViewById(2131362797).setOnClickListener(new a.l40());
    }

    public final java.lang.CharSequence A(int i) {
        return ((android.content.res.TypedArray) this.e).getText(i);
    }

    public final java.lang.String B(java.lang.String str, java.lang.String str2) {
        return ((java.util.HashMap) this.e).containsKey(str) ? (java.lang.String) ((java.util.HashMap) this.e).get(str) : str2;
    }

    public final boolean C(int i) {
        return ((android.content.res.TypedArray) this.e).hasValue(i);
    }

    public final void D(android.app.Activity activity, boolean z) {
        android.webkit.WebView webView = (android.webkit.WebView) this.d;
        if (webView != null) {
            android.webkit.WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(z);
            settings.setAllowUniversalAccessFromFileURLs(z);
            settings.setAllowFileAccessFromFileURLs(z);
            settings.setAllowContentAccess(true);
            settings.setUseWideViewPort(true);
            ((android.webkit.WebView) this.d).addJavascriptInterface(new a.vs1(this, (android.content.Context) this.e), "KrScriptCore");
            ((android.webkit.WebView) this.d).setDownloadListener(new a.qs1(this, activity));
        }
    }

    public final boolean E(a.zw zwVar, a.ix ixVar, boolean z) {
        a.xq xqVar = (a.xq) this.e;
        int[] iArr = ixVar.c0;
        xqVar.f692a = iArr[0];
        xqVar.b = iArr[1];
        xqVar.c = ixVar.m();
        ((a.xq) this.e).d = ixVar.j();
        a.xq xqVar2 = (a.xq) this.e;
        xqVar2.i = false;
        xqVar2.j = z;
        boolean z2 = xqVar2.f692a == 3;
        boolean z3 = xqVar2.b == 3;
        boolean z4 = z2 && ixVar.L > 0.0f;
        boolean z5 = z3 && ixVar.L > 0.0f;
        int[] iArr2 = ixVar.l;
        if (z4 && iArr2[0] == 4) {
            xqVar2.f692a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            xqVar2.b = 1;
        }
        zwVar.a(ixVar, xqVar2);
        ixVar.z(((a.xq) this.e).e);
        ixVar.w(((a.xq) this.e).f);
        java.lang.Object obj = this.e;
        a.xq xqVar3 = (a.xq) obj;
        ixVar.w = xqVar3.h;
        int i = xqVar3.g;
        ixVar.P = i;
        ixVar.w = i > 0;
        a.xq xqVar4 = (a.xq) obj;
        xqVar4.j = false;
        return xqVar4.i;
    }

    public final void F() {
        if (((java.lang.String) this.f) == null) {
            return;
        }
        ((java.lang.StringBuilder) this.d).append("\n");
        for (int i = 0; i < ((java.util.List) this.e).size(); i++) {
            ((java.lang.StringBuilder) this.d).append((java.lang.String) this.f);
        }
    }

    public final void H(java.lang.String str) {
        if (a.wv.e(str, (java.lang.String) this.e)) {
            return;
        }
        ((a.m40) this.f).a(str);
    }

    public final void I(a.mt0 mt0Var, java.lang.String str) {
        if (((java.util.List) this.e).isEmpty() && ((java.lang.StringBuilder) this.d).length() > 0) {
            throw new java.lang.Exception("Nesting problem: multiple top-level roots");
        }
        a();
        ((java.util.List) this.e).add(mt0Var);
        ((java.lang.StringBuilder) this.d).append(str);
    }

    public final a.mt0 J() {
        if (((java.util.List) this.e).isEmpty()) {
            throw new java.lang.Exception("Nesting problem");
        }
        return (a.mt0) ((java.util.List) this.e).get(((java.util.List) this.e).size() - 1);
    }

    public final void K() {
        ((android.content.res.TypedArray) this.e).recycle();
    }

    public final void L() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) ((java.util.HashMap) this.e).entrySet()) {
            sb.append((java.lang.String) entry.getKey());
            sb.append("=");
            sb.append((java.lang.String) entry.getValue());
            sb.append("\n");
        }
        a.gy.W((java.lang.String) this.d, sb.toString());
    }

    public final void M(java.lang.String str, java.lang.String str2) {
        if (str.isEmpty()) {
            return;
        }
        ((java.util.HashMap) this.e).put(str, str2);
        L();
    }

    public final void O() {
        a.v60 v60Var = (a.v60) this.f;
        if (v60Var != null) {
            v60Var.a();
        }
        this.f = null;
        android.view.View inflate = android.view.LayoutInflater.from((android.content.Context) this.d).inflate(2131558542, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362410);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(2131362412);
        a.cp cpVar = com.omarea.Scene.c;
        textView.setText(a.fs1.D().getString("user_name", ""));
        int i = a.x60.f681a;
        android.content.Context context = (android.content.Context) this.d;
        java.lang.String string = context.getString(2131952077);
        a.wv.v(string, "context.getString(R.string.btn_confirm)");
        this.f = a.fs1.j(context, inflate, new a.u60(string, (java.lang.Runnable) new a.ua0(textView, textView2, this, 26), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r0 > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r0 > 0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.ka1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.la1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nk.P(android.content.Context):void");
    }

    public final void Q(a.jx jxVar, int i, int i2) {
        int i3 = jxVar.Q;
        int i4 = jxVar.R;
        jxVar.Q = 0;
        jxVar.R = 0;
        jxVar.z(i);
        jxVar.w(i2);
        if (i3 < 0) {
            jxVar.Q = 0;
        } else {
            jxVar.Q = i3;
        }
        if (i4 < 0) {
            jxVar.R = 0;
        } else {
            jxVar.R = i4;
        }
        ((a.jx) this.f).F();
    }

    public final boolean R(long j, long j2) {
        if (((java.util.Timer) this.f) != null) {
            return false;
        }
        java.util.Timer timer = new java.util.Timer((java.lang.String) this.e);
        this.f = timer;
        timer.schedule(new a.af1(this, timer), j, j2);
        return true;
    }

    public final long S(java.lang.String str) {
        double parseDouble;
        double d;
        double d2;
        if (str.length() == 0) {
            return 0L;
        }
        if (a.yi1.g2(str, "K")) {
            java.lang.String substring = str.substring(0, a.yi1.m2(str, "K", 0, false, 6));
            a.wv.v(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            d2 = java.lang.Double.parseDouble(substring);
        } else {
            if (a.yi1.g2(str, "M")) {
                java.lang.String substring2 = str.substring(0, a.yi1.m2(str, "M", 0, false, 6));
                a.wv.v(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                parseDouble = java.lang.Double.parseDouble(substring2);
                d = 1024;
            } else {
                if (!a.yi1.g2(str, "G")) {
                    return java.lang.Long.parseLong(str) / 1024;
                }
                java.lang.String substring3 = str.substring(0, a.yi1.m2(str, "G", 0, false, 6));
                a.wv.v(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                parseDouble = java.lang.Double.parseDouble(substring3);
                d = 1048576;
            }
            d2 = parseDouble * d;
        }
        return (long) d2;
    }

    public final void T(java.lang.String str) {
        ((java.lang.StringBuilder) this.d).append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                ((java.lang.StringBuilder) this.d).append("\\f");
            } else if (charAt == '\r') {
                ((java.lang.StringBuilder) this.d).append("\\r");
            } else if (charAt != '\"' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        ((java.lang.StringBuilder) this.d).append("\\b");
                        break;
                    case '\t':
                        ((java.lang.StringBuilder) this.d).append("\\t");
                        break;
                    case '\n':
                        ((java.lang.StringBuilder) this.d).append("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            ((java.lang.StringBuilder) this.d).append(java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(charAt)));
                            break;
                        } else {
                            ((java.lang.StringBuilder) this.d).append(charAt);
                            break;
                        }
                }
            } else {
                java.lang.StringBuilder sb = (java.lang.StringBuilder) this.d;
                sb.append('\\');
                sb.append(charAt);
            }
        }
        ((java.lang.StringBuilder) this.d).append("\"");
    }

    public final void U() {
        this.d = "";
        this.e = "";
        this.f = "";
        a.q10 q10Var = a.q10.f457a;
        if (a.wv.e(a.q10.t(), "root")) {
            try {
                a.lt0 lt0Var = new a.lt0(a.q10.L("scheduler-status", "", 2000L));
                java.util.LinkedHashMap linkedHashMap = lt0Var.f329a;
                if (linkedHashMap.containsKey("mode")) {
                    this.d = lt0Var.h("mode");
                }
                if (linkedHashMap.containsKey("scene")) {
                    this.e = lt0Var.h("scene");
                }
                if (linkedHashMap.containsKey("category")) {
                    this.f = lt0Var.h("category");
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final void V() {
        try {
            if (((a.tr0) this.e) != null) {
                android.content.Context context = (android.content.Context) this.d;
                android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) this.f;
                if (serviceConnection == null) {
                    a.wv.M1("conn");
                    throw null;
                }
                context.unbindService(serviceConnection);
                this.e = null;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void W(java.lang.Object obj) {
        java.lang.String l;
        if (((java.util.List) this.e).isEmpty()) {
            throw new java.lang.Exception("Nesting problem");
        }
        if (obj instanceof a.jt0) {
            ((a.jt0) obj).f(this);
            return;
        }
        if (obj instanceof a.lt0) {
            ((a.lt0) obj).r(this);
            return;
        }
        a();
        if (obj == null || (obj instanceof java.lang.Boolean) || obj == a.lt0.c) {
            ((java.lang.StringBuilder) this.d).append(obj);
            return;
        }
        if (!(obj instanceof java.lang.Number)) {
            T(obj.toString());
            return;
        }
        java.lang.StringBuilder sb = (java.lang.StringBuilder) this.d;
        java.lang.Number number = (java.lang.Number) obj;
        double doubleValue = number.doubleValue();
        a.b20.s(doubleValue);
        if (number.equals(a.lt0.b)) {
            l = "-0";
        } else {
            long longValue = number.longValue();
            l = doubleValue == ((double) longValue) ? java.lang.Long.toString(longValue) : number.toString();
        }
        sb.append(l);
    }

    public final void a() {
        if (((java.util.List) this.e).isEmpty()) {
            return;
        }
        a.mt0 J = J();
        a.mt0 mt0Var = a.mt0.c;
        a.mt0 mt0Var2 = a.mt0.d;
        if (J == mt0Var) {
            ((java.util.List) this.e).set(this.e.size() - 1, mt0Var2);
            F();
        } else if (J == mt0Var2) {
            ((java.lang.StringBuilder) this.d).append(',');
            F();
        } else if (J != a.mt0.f) {
            if (J != a.mt0.h) {
                throw new java.lang.Exception("Nesting problem");
            }
        } else {
            ((java.lang.StringBuilder) this.d).append(((java.lang.String) this.f) == null ? ":" : ": ");
            a.mt0 mt0Var3 = a.mt0.g;
            ((java.util.List) this.e).set(a.mt0.c.size() - 1, mt0Var3);
        }
    }

    @Override // a.ks0
    public final void b() {
    }

    public final void c(java.lang.Runnable runnable) {
        try {
            android.content.pm.PackageManager packageManager = ((android.content.Context) this.d).getPackageManager();
            if ((packageManager != null ? packageManager.getPackageInfo("com.omarea.vaddin", 0) : null) == null) {
                return;
            }
            if (((a.tr0) this.e) != null) {
                runnable.run();
                return;
            }
            try {
                this.f = new a.ru1(this, runnable);
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("com.omarea.vaddin.ConfigUpdateService");
                intent.setComponent(new android.content.ComponentName("com.omarea.vaddin", "com.omarea.vaddin.ConfigUpdateService"));
                android.content.Context context = (android.content.Context) this.d;
                android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) this.f;
                if (serviceConnection == null) {
                    a.wv.M1("conn");
                    throw null;
                }
                if (!context.bindService(intent, serviceConnection, 1)) {
                    throw new java.lang.Exception("");
                }
            } catch (java.lang.Exception unused) {
                android.widget.Toast.makeText((android.content.Context) this.d, "连接到“Scene-高级设定”插件失败，请不要阻止插件自启动！", 1).show();
            }
        } catch (java.lang.Exception unused2) {
            android.widget.Toast.makeText((android.content.Context) this.d, "未安装“Scene-高级设定”插件！", 1).show();
        }
    }

    public final void d(a.mt0 mt0Var, a.mt0 mt0Var2, java.lang.String str) {
        a.mt0 J = J();
        if (J != mt0Var2 && J != mt0Var) {
            throw new java.lang.Exception("Nesting problem");
        }
        ((java.util.List) this.e).remove(r3.size() - 1);
        if (J == mt0Var2) {
            F();
        }
        ((java.lang.StringBuilder) this.d).append(str);
    }

    @Override // a.ks0
    public final android.net.Uri e() {
        return (android.net.Uri) this.f;
    }

    public final a.zq1 f(java.lang.Class cls, java.lang.String str) {
        a.zq1 b;
        a.wv.w(str, "key");
        a.er1 er1Var = (a.er1) this.d;
        er1Var.getClass();
        a.zq1 zq1Var = (a.zq1) er1Var.f132a.get(str);
        if (!cls.isInstance(zq1Var)) {
            a.r11 r11Var = new a.r11((a.tz) this.f);
            r11Var.f571a.put(a.gy.k, str);
            try {
                b = ((a.cr1) this.e).d(cls, r11Var);
            } catch (java.lang.AbstractMethodError unused) {
                b = ((a.cr1) this.e).b(cls);
            }
            a.er1 er1Var2 = (a.er1) this.d;
            er1Var2.getClass();
            a.wv.w(b, "viewModel");
            a.zq1 zq1Var2 = (a.zq1) er1Var2.f132a.put(str, b);
            if (zq1Var2 != null) {
                zq1Var2.b();
            }
            return b;
        }
        java.lang.Object obj = (a.cr1) this.e;
        a.dr1 dr1Var = obj instanceof a.dr1 ? (a.dr1) obj : null;
        if (dr1Var != null) {
            a.wv.s(zq1Var);
            a.ld1 ld1Var = (a.ld1) dr1Var;
            a.gv0 gv0Var = ld1Var.f;
            if (gv0Var != null) {
                a.id1 id1Var = ld1Var.g;
                a.wv.s(id1Var);
                a.b20.g(zq1Var, id1Var, gv0Var);
            }
        }
        a.wv.t(zq1Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return zq1Var;
    }

    public final java.util.ArrayList g() {
        a.l71 l71Var = a.l71.f;
        a.lt0 lt0Var = new a.lt0();
        l71Var.i(lt0Var);
        java.lang.String lt0Var2 = lt0Var.toString();
        a.wv.v(lt0Var2, "json{\n                \"m…\n            }.toString()");
        java.lang.String L = a.q10.L("top", lt0Var2, 1000L);
        if ((L == null || L.length() == 0 || L.equals("error")) && java.lang.System.currentTimeMillis() - h >= 5000) {
            h = java.lang.System.currentTimeMillis();
            android.util.Log.e("Scene", "nk.g: empty/error response, restarting daemon...");
            a.q10.h();
            a.q10.w = false;
            if (a.q10.f457a.O(true)) {
                L = a.q10.L("top", lt0Var2, 1000L);
            }
        }
        if (L == null) {
            return new java.util.ArrayList();
        }
        java.util.List y2 = a.yi1.y2(L, new java.lang.String[]{"\n"});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = y2.iterator();
        while (it.hasNext()) {
            java.util.List y22 = a.yi1.y2((java.lang.String) it.next(), new java.lang.String[]{"|"});
            com.omarea.model.ProcessInfo processInfo = null;
            try {
                com.omarea.model.ProcessInfo processInfo2 = new com.omarea.model.ProcessInfo();
                processInfo2.cpu = java.lang.Float.parseFloat((java.lang.String) y22.get(0));
                processInfo2.res = S((java.lang.String) y22.get(1));
                processInfo2.shr = S((java.lang.String) y22.get(2));
                processInfo2.swap = S((java.lang.String) y22.get(3));
                java.lang.String str = (java.lang.String) y22.get(4);
                processInfo2.name = str;
                if (!((java.util.ArrayList) this.e).contains(str)) {
                    processInfo2.pid = java.lang.Integer.parseInt((java.lang.String) y22.get(5));
                    processInfo2.user = (java.lang.String) y22.get(6);
                    processInfo2.state = (java.lang.String) y22.get(7);
                    processInfo2.command = (java.lang.String) y22.get(8);
                    processInfo2.cmdline = (java.lang.String) y22.get(9);
                    processInfo = processInfo2;
                }
            } catch (java.lang.Exception unused) {
            }
            if (processInfo != null) {
                arrayList.add(processInfo);
            }
        }
        return arrayList;
    }

    public final boolean h(int i, boolean z) {
        return ((android.content.res.TypedArray) this.e).getBoolean(i, z);
    }

    public final android.content.res.ColorStateList i(int i) {
        int resourceId;
        android.content.res.ColorStateList b;
        return (!((android.content.res.TypedArray) this.e).hasValue(i) || (resourceId = ((android.content.res.TypedArray) this.e).getResourceId(i, 0)) == 0 || (b = a.zx.b((android.content.Context) this.d, resourceId)) == null) ? ((android.content.res.TypedArray) this.e).getColorStateList(i) : b;
    }

    public final int j(int i, int i2) {
        return ((android.content.res.TypedArray) this.e).getDimensionPixelOffset(i, i2);
    }

    public final int k(int i, int i2) {
        return ((android.content.res.TypedArray) this.e).getDimensionPixelSize(i, i2);
    }

    public final android.graphics.drawable.Drawable l(int i) {
        int resourceId;
        return (!((android.content.res.TypedArray) this.e).hasValue(i) || (resourceId = ((android.content.res.TypedArray) this.e).getResourceId(i, 0)) == 0) ? ((android.content.res.TypedArray) this.e).getDrawable(i) : a.b20.Y((android.content.Context) this.d, resourceId);
    }

    public final android.graphics.drawable.Drawable m(int i) {
        int resourceId;
        android.graphics.drawable.Drawable e;
        if (!((android.content.res.TypedArray) this.e).hasValue(i) || (resourceId = ((android.content.res.TypedArray) this.e).getResourceId(i, 0)) == 0) {
            return null;
        }
        a.nm a2 = a.nm.a();
        android.content.Context context = (android.content.Context) this.d;
        synchronized (a2) {
            e = a2.f384a.e(resourceId, context, true);
        }
        return e;
    }

    public final android.graphics.Typeface n(int i, int i2, a.mn mnVar) {
        int resourceId = ((android.content.res.TypedArray) this.e).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((android.util.TypedValue) this.f) == null) {
            this.f = new android.util.TypedValue();
        }
        android.content.Context context = (android.content.Context) this.d;
        android.util.TypedValue typedValue = (android.util.TypedValue) this.f;
        java.lang.ThreadLocal threadLocal = a.wb1.f656a;
        if (context.isRestricted()) {
            return null;
        }
        return a.wb1.b(context, resourceId, typedValue, i2, mnVar, true, false);
    }

    public final int o(int i, int i2) {
        return ((android.content.res.TypedArray) this.e).getInt(i, i2);
    }

    @Override // a.ks0
    public final android.content.ClipDescription p() {
        return (android.content.ClipDescription) this.e;
    }

    public final android.location.Location q(java.lang.String str) {
        try {
            if (((android.location.LocationManager) this.e).isProviderEnabled(str)) {
                return ((android.location.LocationManager) this.e).getLastKnownLocation(str);
            }
            return null;
        } catch (java.lang.Exception e) {
            android.util.Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    public final java.lang.String r() {
        if (((java.lang.String) this.d) == null) {
            U();
        }
        return (java.lang.String) this.d;
    }

    @Override // a.ks0
    public final java.lang.Object s() {
        return null;
    }

    @Override // a.ks0
    public final android.net.Uri t() {
        return (android.net.Uri) this.d;
    }

    public final java.lang.String toString() {
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                if (((java.lang.StringBuilder) this.d).length() == 0) {
                    return null;
                }
                return ((java.lang.StringBuilder) this.d).toString();
            default:
                return super.toString();
        }
    }

    public final java.lang.String u(java.lang.Integer num) {
        switch (this.c) {
            case 19:
                if (num != null && num.intValue() == -1) {
                    java.lang.String string = ((android.content.Context) this.d).getString(2131953099);
                    a.wv.v(string, "context.getString(R.string.orientation_default)");
                    return string;
                }
                if (num != null && num.intValue() == 10) {
                    java.lang.String string2 = ((android.content.Context) this.d).getString(2131953102);
                    a.wv.v(string2, "context.getString(R.string.orientation_force_auto)");
                    return string2;
                }
                if (num != null && num.intValue() == 13) {
                    java.lang.String string3 = ((android.content.Context) this.d).getString(2131953097);
                    a.wv.v(string3, "context.getString(R.string.orientation_auto)");
                    return string3;
                }
                if (num != null && num.intValue() == 6) {
                    java.lang.String string4 = ((android.content.Context) this.d).getString(2131953104);
                    a.wv.v(string4, "context.getString(R.string.orientation_horizontal)");
                    return string4;
                }
                if (num != null && num.intValue() == 7) {
                    java.lang.String string5 = ((android.content.Context) this.d).getString(2131953108);
                    a.wv.v(string5, "context.getString(R.string.orientation_vertical)");
                    return string5;
                }
                java.lang.String string6 = ((android.content.Context) this.d).getString(2131953107);
                a.wv.v(string6, "context.getString(R.string.orientation_unknown)");
                return string6;
            default:
                return new a.nk((android.app.Activity) this.d, 19).u(num);
        }
    }

    public final java.lang.String[] v(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        java.lang.String[] strArr;
        a.wv.w(str, "packageName");
        try {
            packageInfo = ((android.content.pm.PackageManager) this.f).getPackageInfo(str, 4096);
        } catch (java.lang.Exception unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (strArr = packageInfo.requestedPermissions) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArr) {
            a.wv.v(str2, "it");
            if (a.yi1.B2(str2, "android.permission")) {
                arrayList.add(str2);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ad, code lost:
    
        r11 = (a.s51) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02af, code lost:
    
        if (r11 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02b1, code lost:
    
        r5 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b3, code lost:
    
        if (r5 == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b6, code lost:
    
        a.wv.M1("mode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02bb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c9, code lost:
    
        r7.c = r5;
        r6.add(r7);
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02bc, code lost:
    
        r5 = r7.f517a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02be, code lost:
    
        if (r5 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c4, code lost:
    
        if (r4.contains(r5) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c6, code lost:
    
        r5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c8, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d1, code lost:
    
        a.wv.M1("name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, a.s51] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, a.s51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList w(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nk.w(java.lang.String):java.util.ArrayList");
    }

    public final int x(int i, int i2) {
        return ((android.content.res.TypedArray) this.e).getResourceId(i, i2);
    }

    public final java.lang.String y() {
        if (((java.lang.String) this.e) == null) {
            U();
        }
        java.lang.String str = (java.lang.String) this.e;
        a.wv.s(str);
        return str;
    }

    public final java.lang.String z(int i) {
        return ((android.content.res.TypedArray) this.e).getString(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nk(a.fr1 r3, a.is0 r4) {
        /*
            r2 = this;
            r0 = 5
            r2.c = r0
            java.lang.String r0 = "owner"
            a.wv.w(r3, r0)
            a.er1 r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof a.er0
            if (r1 == 0) goto L17
            a.er0 r3 = (a.er0) r3
            a.tz r3 = r3.getDefaultViewModelCreationExtras()
            goto L19
        L17:
            a.sz r3 = a.sz.b
        L19:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nk.<init>(a.fr1, a.is0):void");
    }

    public nk(java.lang.String str, a.qo0 qo0Var) {
        this.c = 13;
        this.d = qo0Var;
        this.e = str;
    }

    public nk(a.p5 p5Var, java.lang.String str, a.m40 m40Var) {
        this.c = 21;
        this.d = p5Var;
        this.e = str;
        this.f = m40Var;
    }

    public nk(a.kk0 kk0Var, a.y70 y70Var) {
        this.c = 23;
        a.wv.w(kk0Var, "context");
        this.d = kk0Var;
        this.e = y70Var;
    }

    public nk(com.omarea.krscript.model.ActionParamInfo actionParamInfo, a.kk0 kk0Var, a.w1 w1Var) {
        this.c = 10;
        a.wv.w(kk0Var, "context");
        this.d = actionParamInfo;
        this.e = kk0Var;
        this.f = w1Var;
    }

    public nk(com.omarea.vtools.activities.ActivityAppDetails activityAppDetails, java.lang.Integer num, a.m4 m4Var) {
        this.c = 20;
        this.d = activityAppDetails;
        this.e = num;
        this.f = m4Var;
    }

    public nk(android.content.Context context, int i) {
        this.c = i;
        if (i == 12) {
            a.wv.w(context, "context");
            this.d = context;
            this.e = context.getPackageManager();
            this.f = new a.e3((android.content.Context) this.d, 0);
            return;
        }
        if (i != 14) {
            switch (i) {
                case 17:
                    a.wv.w(context, "context");
                    this.d = context;
                    this.e = context.getSharedPreferences("scene_actions", 0);
                    java.util.ArrayList f = new a.l1((android.content.Context) this.d, 11).f();
                    java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(f, 10));
                    java.util.Iterator it = f.iterator();
                    while (it.hasNext()) {
                        a.s10 s10Var = (a.s10) it.next();
                        a.s10 s10Var2 = new a.s10();
                        s10Var2.b(s10Var.c);
                        s10Var2.a(s10Var.d);
                        arrayList.add(s10Var2);
                    }
                    this.f = arrayList;
                    return;
                case 18:
                    a.wv.w(context, "context");
                    this.d = context;
                    return;
                case 19:
                    a.wv.w(context, "context");
                    this.d = context;
                    this.e = context.getResources();
                    this.f = new java.util.ArrayList();
                    return;
                default:
                    a.wv.w(context, "context");
                    this.d = context;
                    this.e = new a.lt0(a.b20.m0((android.content.Context) this.d, 2131886098));
                    this.f = ((android.content.Context) this.d).getPackageManager();
                    return;
            }
        }
        a.wv.w(context, "context");
        this.d = context;
        this.e = new a.x2(3);
        this.f = new a.ab1(".*\\..*");
    }

    public nk(android.content.Context context, java.lang.String str) {
        this.c = 16;
        if (str.startsWith("/")) {
            this.d = str;
        } else {
            this.d = a.pe0.d(context, str);
        }
        this.f = context;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = (java.lang.String) this.d;
        a.wv.w(str2, "path");
        a.nu0 nu0Var = a.nu0.f395a;
        for (java.lang.String str3 : a.nu0.d(str2).split("\n")) {
            if (str3.contains("=")) {
                java.lang.String[] split = str3.split("=");
                if (split.length > 1) {
                    hashMap.put(split[0], split[1]);
                } else {
                    hashMap.put(split[0], "");
                }
            }
        }
        this.e = hashMap;
    }

    public nk(a.er1 er1Var, a.cr1 cr1Var, a.tz tzVar) {
        this.c = 5;
        a.wv.w(er1Var, "store");
        a.wv.w(cr1Var, "factory");
        a.wv.w(tzVar, "defaultCreationExtras");
        this.d = er1Var;
        this.e = cr1Var;
        this.f = tzVar;
    }

    public nk(android.webkit.WebView webView, a.w1 w1Var) {
        this.c = 8;
        this.d = webView;
        this.e = webView.getContext();
        this.f = w1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk(a.er1 er1Var, a.fa0 fa0Var) {
        this(er1Var, fa0Var, a.sz.b);
        this.c = 5;
    }

    public nk(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.c = 2;
        this.d = context;
        this.e = typedArray;
    }

    public nk(android.content.Context context, android.location.LocationManager locationManager) {
        this.c = 1;
        this.f = new java.lang.Object();
        this.d = context;
        this.e = locationManager;
    }

    public nk(a.jx jxVar) {
        this.c = 3;
        this.d = new java.util.ArrayList();
        this.e = new java.lang.Object();
        this.f = jxVar;
    }

    public nk(int i, int i2) {
        this.c = i;
        if (i != 15) {
            if (i != 22) {
                this.d = new java.lang.StringBuilder();
                this.e = new java.util.ArrayList();
                this.f = null;
            } else {
                a.cp cpVar = com.omarea.Scene.c;
                this.d = a.fs1.t();
                this.e = a.fs1.D();
                java.lang.Object systemService = ((android.app.Application) this.d).getSystemService("batterymanager");
                a.wv.t(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                this.f = (android.os.BatteryManager) systemService;
            }
        }
    }

    public nk(int i) {
        this.c = 6;
        this.d = new java.lang.StringBuilder();
        this.e = new java.util.ArrayList();
        char[] cArr = new char[i];
        java.util.Arrays.fill(cArr, ' ');
        this.f = new java.lang.String(cArr);
    }
}
