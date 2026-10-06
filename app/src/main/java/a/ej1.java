package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ej1 implements a.n2, a.bt, a.rq0 {
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public ej1() {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public ej1(int i, android.content.Context context, java.lang.String str) {
        if (i != 9) {
            a.wv.w(context, "context");
            a.wv.w(str, "zipOutPath");
            this.d = context;
            this.c = str;
            this.f = new java.util.HashSet();
            java.io.File file = new java.io.File((java.lang.String) this.c);
            if (file.exists()) {
                file.delete();
            }
            this.e = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream((java.lang.String) this.c)));
            return;
        }
        a.wv.w(context, "context");
        a.wv.w(str, "parentDir");
        this.d = context;
        this.c = str;
        this.e = "file:///android_asset/";
        this.f = "";
    }

    @Override // a.n2
    public final boolean a(a.o2 o2Var, a.pz0 pz0Var) {
        return ((android.view.ActionMode.Callback) this.c).onPrepareActionMode(o(o2Var), q(pz0Var));
    }

    @Override // a.n2
    public final void b(a.o2 o2Var) {
        ((android.view.ActionMode.Callback) this.c).onDestroyActionMode(o(o2Var));
    }

    @Override // a.rq0
    public final void c(a.pq0 pq0Var) {
        ((android.view.ViewGroup) this.c).getRootView().post(new a.g2(this, 13, pq0Var));
    }

    @Override // a.bt
    public final void d() {
        ((android.view.View) this.c).clearAnimation();
        ((android.view.ViewGroup) this.d).endViewTransition((android.view.View) this.c);
        ((a.y20) this.e).b();
    }

    @Override // a.n2
    public final boolean e(a.o2 o2Var, android.view.MenuItem menuItem) {
        return ((android.view.ActionMode.Callback) this.c).onActionItemClicked(o(o2Var), new a.d01((android.content.Context) this.d, (a.kj1) menuItem));
    }

    @Override // a.n2
    public final boolean f(a.o2 o2Var, a.pz0 pz0Var) {
        return ((android.view.ActionMode.Callback) this.c).onCreateActionMode(o(o2Var), q(pz0Var));
    }

    public final void g(java.lang.String str, java.io.FileInputStream fileInputStream) {
        if (a.yi1.B2(str, "/")) {
            str = str.substring(1);
            a.wv.v(str, "this as java.lang.String).substring(startIndex)");
        }
        ((java.util.zip.ZipOutputStream) this.e).putNextEntry(new java.util.zip.ZipEntry(str));
        try {
            a.wv.F(fileInputStream, (java.util.zip.ZipOutputStream) this.e);
            a.wv.z(fileInputStream, null);
            ((java.util.zip.ZipOutputStream) this.e).closeEntry();
        } finally {
        }
    }

    public final void h(java.lang.String str, java.lang.String str2) {
        if (a.yi1.B2(str, "/")) {
            str = str.substring(1);
            a.wv.v(str, "this as java.lang.String).substring(startIndex)");
        }
        ((java.util.zip.ZipOutputStream) this.e).putNextEntry(new java.util.zip.ZipEntry(str));
        java.util.zip.ZipOutputStream zipOutputStream = (java.util.zip.ZipOutputStream) this.e;
        byte[] bytes = str2.getBytes(a.bu.f53a);
        a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
        zipOutputStream.write(bytes);
        ((java.util.zip.ZipOutputStream) this.e).closeEntry();
    }

    public final void i(int[] iArr, android.animation.ValueAnimator valueAnimator) {
        a.gy gyVar = new a.gy(iArr, valueAnimator);
        valueAnimator.addListener((android.animation.Animator.AnimatorListener) this.f);
        ((java.util.ArrayList) this.e).add(gyVar);
    }

    public final void j(java.lang.String str) {
        android.app.AlertDialog alertDialog;
        a.v60 v60Var = (a.v60) this.f;
        if (v60Var == null || (alertDialog = v60Var.f625a) == null) {
            return;
        }
        android.view.Window window = alertDialog.getWindow();
        a.wv.s(window);
        android.widget.Button button = (android.widget.Button) window.getDecorView().findViewById(2131362098);
        java.lang.Object tag = button.getTag();
        if ((tag != null ? tag.toString() : null) == str) {
            return;
        }
        button.setTag(str);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$");
        a.wv.v(compile, "compile(pattern)");
        a.wv.w(str, "input");
        if (compile.matcher(str).matches()) {
            a.wv.M0(a.wv.b(a.z80.b), null, new a.q70(alertDialog, str, button, null), 3);
        } else {
            button.setText(2131952077);
        }
    }

    public final void k(java.lang.Object obj, java.util.ArrayList arrayList, java.util.HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new java.lang.RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((a.rh1) this.f).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                k(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final void l(android.view.View view, java.lang.String str) {
        a.wv.w(view, "view");
        a.wv.w(str, "fileName");
        if (android.os.Build.VERSION.SDK_INT < 29 && a.zx.a((android.content.Context) this.d, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            a.cp cpVar = com.omarea.Scene.c;
            java.lang.String string = ((android.content.Context) this.d).getString(2131952777);
            a.wv.v(string, "context.getString(R.stri…r_write_external_storage)");
            a.fs1.X(string, 0);
            return;
        }
        java.lang.Runnable runnable = (java.lang.Runnable) this.f;
        if (runnable != null) {
            runnable.run();
        }
        a.wr.m = true;
        int i = a.x60.f681a;
        a.w60 J = a.fs1.J((android.content.Context) this.d, null);
        android.graphics.drawable.Drawable background = view.getBackground();
        view.setBackground(new android.graphics.drawable.ColorDrawable(((a.pl1) this.c).f442a ? android.graphics.Color.rgb(30, 30, 30) : android.graphics.Color.rgb(240, 240, 240)));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.qc0(view, str, this, background, J, null), 3);
    }

    public final java.io.InputStream m(java.lang.String str) {
        java.lang.String u = u((java.lang.String) this.c, str);
        try {
            try {
                java.lang.String substring = u.substring(((java.lang.String) this.e).length());
                a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                java.io.InputStream open = ((android.content.Context) this.d).getAssets().open(substring);
                this.f = u;
                return open;
            } catch (java.lang.Exception unused) {
                return null;
            }
        } catch (java.lang.Exception unused2) {
            java.io.InputStream open2 = ((android.content.Context) this.d).getAssets().open(str);
            this.f = ((java.lang.String) this.e) + str;
            return open2;
        }
    }

    public final java.io.FileInputStream n(java.lang.String str) {
        if (((java.lang.String) this.c).length() > 0) {
            java.lang.String u = u((java.lang.String) this.c, str);
            java.io.File file = new java.io.File(u);
            if (file.exists() && file.canRead()) {
                java.lang.String absolutePath = file.getAbsolutePath();
                a.wv.v(absolutePath, "absolutePath");
                this.f = absolutePath;
                return new java.io.FileInputStream(file);
            }
            java.io.FileInputStream x = x(u);
            if (x != null) {
                return x;
            }
        }
        java.lang.String str2 = a.pe0.f434a;
        java.lang.String absolutePath2 = new java.io.File(u(a.pe0.c((android.content.Context) this.d), str)).getAbsolutePath();
        java.io.File file2 = new java.io.File(absolutePath2);
        if (file2.exists() && file2.canRead()) {
            java.lang.String absolutePath3 = file2.getAbsolutePath();
            a.wv.v(absolutePath3, "absolutePath");
            this.f = absolutePath3;
            return new java.io.FileInputStream(file2);
        }
        a.wv.v(absolutePath2, "privatePath");
        java.io.FileInputStream x2 = x(absolutePath2);
        if (x2 != null) {
            return x2;
        }
        return null;
    }

    public final a.fj1 o(a.o2 o2Var) {
        int size = ((java.util.ArrayList) this.e).size();
        for (int i = 0; i < size; i++) {
            a.fj1 fj1Var = (a.fj1) ((java.util.ArrayList) this.e).get(i);
            if (fj1Var != null && fj1Var.b == o2Var) {
                return fj1Var;
            }
        }
        a.fj1 fj1Var2 = new a.fj1((android.content.Context) this.d, o2Var);
        ((java.util.ArrayList) this.e).add(fj1Var2);
        return fj1Var2;
    }

    public final java.io.InputStream p(java.lang.String str) {
        try {
            if (!a.yi1.B2(str, "/")) {
                return (((java.lang.String) this.c).length() <= 0 || !a.yi1.B2((java.lang.String) this.c, (java.lang.String) this.e)) ? n(str) : m(str);
            }
            this.f = str;
            java.io.File file = new java.io.File(str);
            return (file.exists() && file.canRead()) ? new java.io.FileInputStream(file) : x(str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final android.view.Menu q(a.pz0 pz0Var) {
        android.view.Menu menu = (android.view.Menu) ((a.rh1) this.f).getOrDefault(pz0Var, null);
        if (menu != null) {
            return menu;
        }
        a.s01 s01Var = new a.s01((android.content.Context) this.d, pz0Var);
        ((a.rh1) this.f).put(pz0Var, s01Var);
        return s01Var;
    }

    public final boolean r() {
        if (!s() || ((android.app.KeyguardManager) this.c).isDeviceLocked()) {
            return true;
        }
        try {
            return ((android.app.KeyguardManager) this.c).isKeyguardLocked();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final boolean s() {
        android.view.Display defaultDisplay;
        java.lang.Integer[] numArr = (java.lang.Integer[]) this.f;
        android.content.Context context = (android.content.Context) this.d;
        if (!(context instanceof android.app.Activity) || android.os.Build.VERSION.SDK_INT <= 29) {
            defaultDisplay = ((android.view.WindowManager) this.e).getDefaultDisplay();
            a.wv.v(defaultDisplay, "windowManager.defaultDisplay");
        } else {
            defaultDisplay = context.getDisplay();
            if (defaultDisplay == null) {
                defaultDisplay = ((android.view.WindowManager) this.e).getDefaultDisplay();
                a.wv.v(defaultDisplay, "windowManager.defaultDisplay");
            }
        }
        return !a.op.K1(numArr, java.lang.Integer.valueOf(defaultDisplay.getState()));
    }

    public final java.io.InputStream t(java.lang.String str) {
        a.wv.w(str, "filePath");
        try {
            if (!a.yi1.B2(str, (java.lang.String) this.e)) {
                return p(str);
            }
            this.f = str;
            android.content.res.AssetManager assets = ((android.content.Context) this.d).getAssets();
            java.lang.String substring = str.substring(((java.lang.String) this.e).length());
            a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
            return assets.open(substring);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r6 = (java.lang.String) r13.e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String u(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.e
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = a.yi1.B2(r14, r0)
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            if (r0 == 0) goto L1b
            java.lang.Object r2 = r13.e
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            java.lang.String r14 = r14.substring(r2)
            a.wv.v(r14, r1)
        L1b:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.lang.String r3 = "/"
            java.lang.String[] r4 = new java.lang.String[]{r3}
            java.util.List r4 = a.yi1.y2(r14, r4)
            r2.<init>(r4)
            java.lang.String r4 = "../"
            boolean r4 = a.yi1.B2(r15, r4)
            r5 = 0
            java.lang.String r6 = ""
            if (r4 == 0) goto L93
            int r4 = r2.size()
            if (r4 <= 0) goto L93
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.String[] r1 = new java.lang.String[]{r3}
            java.util.List r15 = a.yi1.y2(r15, r1)
            r14.<init>(r15)
        L48:
            java.lang.Object r15 = a.qv.g2(r14)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L6b
            java.lang.String r1 = ".."
            boolean r15 = a.wv.e(r15, r1)
            if (r15 == 0) goto L6b
            int r15 = r2.size()
            if (r15 <= 0) goto L6b
            int r15 = r2.size()
            int r15 = r15 + (-1)
            r2.remove(r15)
            r14.remove(r5)
            goto L48
        L6b:
            if (r0 == 0) goto L72
            java.lang.Object r15 = r13.e
            r6 = r15
            java.lang.String r6 = (java.lang.String) r6
        L72:
            r15 = r6
            java.lang.String r3 = "/"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            java.lang.String r0 = a.qv.j2(r2, r3, r4, r5, r6, r7)
            java.lang.String r15 = a.ii1.e(r15, r0)
            java.lang.String r8 = "/"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 62
            r7 = r14
            java.lang.String r14 = a.qv.j2(r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = r13.u(r15, r14)
            return r14
        L93:
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r13.e
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L9a:
            int r0 = r14.length()
            if (r0 != 0) goto La1
            goto Lab
        La1:
            boolean r0 = a.yi1.h2(r14, r3, r5)
            if (r0 != 0) goto Lab
            java.lang.String r14 = r14.concat(r3)
        Lab:
            java.lang.String r0 = "./"
            boolean r0 = a.yi1.B2(r15, r0)
            if (r0 == 0) goto Lbb
            r0 = 2
            java.lang.String r15 = r15.substring(r0)
            a.wv.v(r15, r1)
        Lbb:
            java.lang.String r14 = a.ii1.f(r6, r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ej1.u(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void v() {
        java.lang.Object obj = this.c;
        if (((android.view.View) obj) != null) {
            ((android.view.WindowManager) this.f).removeViewImmediate((android.view.View) obj);
        }
        this.c = null;
        ((android.view.WindowManager.LayoutParams) this.e).screenOrientation = -1;
    }

    public final void w() {
        a.v60 v60Var = (a.v60) this.f;
        if (v60Var != null) {
            v60Var.a();
        }
        this.f = null;
        android.view.View inflate = android.view.LayoutInflater.from((android.content.Context) this.d).inflate(2131558539, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362410);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(2131362412);
        a.cp cpVar = com.omarea.Scene.c;
        textView.setText(a.fs1.D().getString("user_name", ""));
        final int i = 0;
        inflate.findViewById(2131363013).setOnClickListener(new a.m70(this));
        final int i2 = 1;
        inflate.findViewById(2131363334).setOnClickListener(new a.m70(this));
        int i3 = a.x60.f681a;
        android.content.Context context = (android.content.Context) this.d;
        java.lang.String string = context.getString(2131952077);
        a.wv.v(string, "context.getString(R.string.btn_confirm)");
        a.v60 j = a.fs1.j(context, inflate, new a.u60(string, (java.lang.Runnable) new a.ua0(textView, textView2, this, 25), false));
        j.b(false);
        this.f = j;
        textView.setOnFocusChangeListener(new a.gj0(this, i2, textView));
        textView.setOnEditorActionListener(new a.x4(this, i2, textView));
        java.lang.String obj = textView.getText().toString();
        if (obj.length() > 0) {
            j(obj);
        }
    }

    public final java.io.FileInputStream x(java.lang.String str) {
        int i;
        if (!a.gy.n(str)) {
            return null;
        }
        java.lang.String str2 = a.pe0.f434a;
        java.io.File file = new java.io.File(a.pe0.d((android.content.Context) this.d, "kr-script"));
        if (!file.exists()) {
            file.mkdirs();
        }
        java.lang.String d = a.pe0.d((android.content.Context) this.d, "kr-script/outside_file.cache");
        try {
            i = (int) ((android.os.UserManager) ((android.content.Context) this.d).getSystemService("user")).getSerialNumberForUser(android.os.Process.myUserHandle());
        } catch (java.lang.Exception unused) {
            i = 0;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("u");
        sb.append(i);
        sb.append("_a");
        sb.append((android.os.Process.myUid() % 100000) - 10000);
        java.lang.String sb2 = sb.toString();
        java.lang.String str3 = "cp -f \"" + str + "\" \"" + d + "\"\nchmod 777 \"" + d + "\"\nchown " + sb2 + ":" + sb2 + " \"" + d + "\"\n";
        a.wv.w(str3, "shell");
        a.q10 q10Var = a.q10.f457a;
        a.q10.l(str3);
        java.io.File file2 = new java.io.File(d);
        if (file2.exists() && file2.canRead()) {
            return new java.io.FileInputStream(file2);
        }
        return null;
    }

    public ej1(android.content.Context context, int i) {
        if (i != 15) {
            a.wv.w(context, "context");
            this.d = context;
            java.lang.Object systemService = context.getSystemService("keyguard");
            a.wv.t(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
            this.c = (android.app.KeyguardManager) systemService;
            java.lang.Object systemService2 = ((android.content.Context) this.d).getSystemService("window");
            a.wv.t(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
            this.e = (android.view.WindowManager) systemService2;
            int[] iArr = {1, 3, 4, 6};
            java.lang.Integer[] numArr = new java.lang.Integer[4];
            for (int i2 = 0; i2 < 4; i2++) {
                numArr[i2] = java.lang.Integer.valueOf(iArr[i2]);
            }
            this.f = numArr;
            return;
        }
        a.wv.w(context, "mContext");
        this.d = context;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.height = 0;
        layoutParams.width = 0;
        layoutParams.screenOrientation = -1;
        if (((android.content.Context) this.d) instanceof android.accessibilityservice.AccessibilityService) {
            layoutParams.type = 2032;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = -3;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.flags = 56;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        this.e = layoutParams;
        java.lang.Object systemService3 = ((android.content.Context) this.d).getSystemService("window");
        a.wv.t(systemService3, "null cannot be cast to non-null type android.view.WindowManager");
        this.f = (android.view.WindowManager) systemService3;
    }

    public /* synthetic */ ej1(java.lang.Object obj, android.view.View view, android.view.View view2, java.lang.Object obj2) {
        this.f = obj;
        this.c = view;
        this.d = view2;
        this.e = obj2;
    }

    public ej1(int i) {
        if (i == 2) {
            this.c = new a.a61(10, 1);
            this.f = new a.rh1();
            this.e = new java.util.ArrayList();
            this.d = new java.util.HashSet();
            return;
        }
        if (i == 5) {
            this.c = new a.rh1();
            this.d = new android.util.SparseArray();
            this.e = new a.sx0();
            this.f = new a.rh1();
            return;
        }
        int i2 = 6;
        if (i != 6) {
            this.c = new a.a61(256, 0);
            this.d = new a.a61(256, 0);
            this.e = new a.a61(256, 0);
            this.f = new a.bi1[32];
            return;
        }
        this.e = new java.util.ArrayList();
        this.c = null;
        this.d = null;
        this.f = new a.h1(i2, this);
    }

    public ej1(android.app.Activity activity, a.b81 b81Var, a.n70 n70Var) {
        a.wv.w(activity, "context");
        a.wv.w(b81Var, "progressBarDialog");
        a.wv.w(n70Var, "callback");
        this.d = activity;
        this.c = b81Var;
        this.e = n70Var;
    }

    public ej1(a.p5 p5Var, a.pl1 pl1Var) {
        a.wv.w(p5Var, "context");
        a.wv.w(pl1Var, "themeMode");
        this.d = p5Var;
        this.c = pl1Var;
    }

    public ej1(android.graphics.Typeface typeface, a.u01 u01Var) {
        int i;
        int i2;
        this.f = typeface;
        this.c = u01Var;
        this.e = new a.w01(1024);
        a.u01 u01Var2 = (a.u01) this.c;
        int a2 = u01Var2.a(6);
        if (a2 != 0) {
            int i3 = a2 + u01Var2.f295a;
            i = u01Var2.b.getInt(u01Var2.b.getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.d = new char[i * 2];
        a.u01 u01Var3 = (a.u01) this.c;
        int a3 = u01Var3.a(6);
        if (a3 != 0) {
            int i4 = a3 + u01Var3.f295a;
            i2 = u01Var3.b.getInt(u01Var3.b.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            a.eb0 eb0Var = new a.eb0(this, i5);
            a.t01 c = eb0Var.c();
            int a4 = c.a(4);
            java.lang.Character.toChars(a4 != 0 ? c.b.getInt(a4 + c.f295a) : 0, (char[]) this.d, i5 * 2);
            a.wv.q("invalid metadata codepoint length", eb0Var.b() > 0);
            ((a.w01) this.e).a(eb0Var, 0, eb0Var.b() - 1);
        }
    }
}
