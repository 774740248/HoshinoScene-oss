package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class fs1 {
    public static java.lang.reflect.Field b;
    public static boolean c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    public /* synthetic */ fs1(int i) {
        this.f157a = i;
    }

    public static java.util.ArrayList A(com.omarea.krscript.model.ActionParamInfo actionParamInfo) {
        a.wv.w(actionParamInfo, "actionParamInfo");
        java.lang.String valueFromShell = actionParamInfo.getValueFromShell() != null ? actionParamInfo.getValueFromShell() : actionParamInfo.getValue();
        java.util.ArrayList x2 = valueFromShell != null ? a.qv.x2(a.yi1.y2(valueFromShell, new java.lang.String[]{actionParamInfo.getSeparator()})) : null;
        if (x2 != null && a.wv.e(actionParamInfo.getSeparator(), "\n")) {
            int i = 0;
            for (java.lang.Object obj : x2) {
                int i2 = i + 1;
                if (i < 0) {
                    a.b20.p1();
                    throw null;
                }
                x2.set(i, a.yi1.v2((java.lang.String) obj, "\r", ""));
                i = i2;
            }
        }
        return x2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ec, code lost:
    
        if (r5.createNewFile() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String B(android.content.Context r9, android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fs1.B(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static java.lang.String C(android.content.Context context, java.lang.String str) {
        return "34ea0e93b18c7df94decd663857bb3bf";
    }

    public static android.content.SharedPreferences D() {
        java.lang.Object a2 = com.omarea.Scene.h.a();
        a.wv.v(a2, "<get-spf>(...)");
        return (android.content.SharedPreferences) a2;
    }

    public static java.lang.String E(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "key");
        return D().getString(str, str2);
    }

    public static a.v60 F(android.content.Context context, java.lang.String str, java.lang.CharSequence charSequence, java.lang.Runnable runnable) {
        a.wv.w(context, "context");
        a.wv.w(str, "title");
        a.wv.w(charSequence, "message");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558531, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(2131362256);
        a.wv.s(findViewById);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        int i = 0;
        if (str.length() > 0) {
            textView.setText(str);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.view.View findViewById2 = inflate.findViewById(2131362255);
        a.wv.s(findViewById2);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        if (charSequence.length() > 0) {
            textView2.setText(charSequence);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        a.v60 m = m(context, inflate, runnable == null);
        android.view.View findViewById3 = inflate.findViewById(2131362098);
        a.wv.s(findViewById3);
        if (runnable != null) {
            m.b.add(new a.p60(i, runnable));
        }
        findViewById3.setOnClickListener(new a.q60(m, i));
        return m;
    }

    public static a.v60 G(android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        a.wv.w(context, "context");
        java.lang.String string = context.getString(2131952501);
        a.wv.v(string, "context.getString(R.string.help_title)");
        return F(context, string, str, runnable);
    }

    public static void H(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, a.bp0 bp0Var) {
        int i = a.x60.f681a;
        a.wv.w(context, "context");
        a.wv.w(str3, "initialValue");
        java.lang.Runnable runnable = null;
        android.view.View u = u(context, 2131558517, str, str2, null);
        android.widget.EditText editText = (android.widget.EditText) u.findViewById(2131362649);
        editText.setText(str3);
        android.text.Editable text = editText.getText();
        int i2 = 0;
        editText.setSelection(text != null ? text.length() : 0);
        a.v60 m = m(context, u, true);
        u.findViewById(2131362097).setOnClickListener(new a.o60(m, runnable, i2));
        u.findViewById(2131362098).setOnClickListener(new a.sg(bp0Var, editText, m, 3));
        android.view.Window window = m.f625a.getWindow();
        if (window != null) {
            window.setSoftInputMode(37);
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        a.fw fwVar = new a.fw(9, editText);
        if (editText.hasWindowFocus()) {
            editText.post(fwVar);
        } else {
            editText.getViewTreeObserver().addOnWindowFocusChangeListener(new a.s60(editText, fwVar));
        }
    }

    public static android.graphics.drawable.Drawable I(android.content.Context context, com.omarea.krscript.model.ClickableNode clickableNode, boolean z) {
        if (clickableNode.getLogoPath().length() != 0) {
            java.lang.String pageConfigDir = clickableNode.getPageConfigDir();
            a.wv.v(pageConfigDir, "clickableNode.pageConfigDir");
            java.io.InputStream t = new a.ej1(9, context, pageConfigDir).t(clickableNode.getLogoPath());
            if (t != null) {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(t);
                a.wv.v(decodeStream, "decodeStream(this)");
                return new android.graphics.drawable.BitmapDrawable(decodeStream);
            }
        }
        if (clickableNode.getIconPath().length() != 0) {
            java.lang.String pageConfigDir2 = clickableNode.getPageConfigDir();
            a.wv.v(pageConfigDir2, "clickableNode.pageConfigDir");
            java.io.InputStream t2 = new a.ej1(9, context, pageConfigDir2).t(clickableNode.getIconPath());
            if (t2 != null) {
                android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream(t2);
                a.wv.v(decodeStream2, "decodeStream(this)");
                return new android.graphics.drawable.BitmapDrawable(decodeStream2);
            }
        }
        if (!z) {
            return null;
        }
        android.graphics.drawable.Drawable drawable = context.getDrawable(2131231107);
        a.wv.s(drawable);
        return drawable;
    }

    public static a.w60 J(android.content.Context context, java.lang.String str) {
        a.wv.w(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558537, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362413);
        if (str != null) {
            textView.setText(str);
        }
        a.v60 m = m(context, inflate, false);
        a.wv.v(textView, "textView");
        return new a.w60(m, textView);
    }

    public static a.v60 K(android.content.Context context, int i, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        android.view.View u = u(context, i, str, str2, null);
        int i2 = 1;
        a.v60 m = m(context, u, true);
        android.view.View findViewById = u.findViewById(2131362097);
        if (findViewById != null) {
            findViewById.setOnClickListener(new a.o60(m, runnable2, i2));
        }
        android.view.View findViewById2 = u.findViewById(2131362098);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new a.o60(m, runnable, 2));
        }
        return m;
    }

    public static void L(java.lang.Runnable runnable) {
        a.wv.w(runnable, "runnable");
        com.omarea.Scene.d.post(runnable);
    }

    public static void M(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.Boolean bool) {
        java.io.File file = new java.io.File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            java.io.File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            if (bool.booleanValue()) {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            }
            fileOutputStream.close();
            java.lang.System.out.println("----------save success-------------------");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void N(java.lang.String str, boolean z) {
        D().edit().putBoolean(str, z).apply();
    }

    public static void O(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "key");
        if (str2 == null) {
            D().edit().remove(str).apply();
        } else {
            D().edit().putString(str, str2).apply();
        }
    }

    public static void P(android.view.View view) {
        a.wv.w(view, "view");
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            android.content.Context context = view.getContext();
            a.wv.v(context, "view.context");
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void R(android.view.Window r13, android.app.Activity r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fs1.R(android.view.Window, android.app.Activity):void");
    }

    public static a.e70 S(android.content.Context context, java.util.ArrayList arrayList, int i, a.lc1 lc1Var) {
        java.util.ArrayList arrayList2;
        a.wv.w(context, "context");
        if (i > -1) {
            arrayList2 = new java.util.ArrayList();
            arrayList2.add(arrayList.get(i));
        } else {
            arrayList2 = new java.util.ArrayList();
        }
        a.e70 e70Var = new a.e70(context, arrayList, arrayList2, false);
        e70Var.l = new a.d70(lc1Var, 0);
        return e70Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [a.ng1, java.lang.Object] */
    public static a.e70 T(android.content.Context context, java.lang.String[] strArr, int i, a.lc1 lc1Var) {
        a.wv.w(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            a.ng1 obj = new a.ng1();
            obj.f381a = str;
            obj.c = str;
            arrayList.add(obj);
        }
        return S(context, new java.util.ArrayList(arrayList), i, lc1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    public static java.lang.String V(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1924668703:
                    if (str.equals("tar,taz,tgz")) {
                        return "application/x-tar";
                    }
                    break;
                case -218280442:
                    if (str.equals("jpg,jpeg,jpe")) {
                        return "image/jpeg";
                    }
                    break;
                case 3315:
                    if (str.equals("gz")) {
                        return "application/x-gzip";
                    }
                    break;
                case 96796:
                    if (str.equals("apk")) {
                        return "application/vnd.android";
                    }
                    break;
                case 104387:
                    if (str.equals("img")) {
                        return "application/x-img";
                    }
                    break;
                case 111145:
                    if (str.equals("png")) {
                        return "image/png";
                    }
                    break;
                case 112675:
                    if (str.equals("rar")) {
                        return "application/x-rar-compressed";
                    }
                    break;
                case 115312:
                    if (str.equals("txt")) {
                        return "text/plain";
                    }
                    break;
                case 118807:
                    if (str.equals("xml")) {
                        return "text/xml";
                    }
                    break;
                case 120609:
                    if (str.equals("zip")) {
                        return "application/zip";
                    }
                    break;
                case 246323538:
                    if (str.equals("html,htm,shtml")) {
                        return "text/html";
                    }
                    break;
            }
        }
        return "";
    }

    public static void W(final int i, final int i2) {
        com.omarea.Scene.d.post(new a.nd1());
    }

    public static void X(java.lang.String str, int i) {
        a.wv.w(str, "message");
        com.omarea.Scene.d.post(new a.tb1(i, 2, str));
    }

    public static a.v60 Z(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, a.hs hsVar, int i) {
        java.lang.String str3 = (i & 2) != 0 ? "" : str;
        java.lang.String str4 = (i & 4) == 0 ? str2 : "";
        java.lang.Runnable runnable2 = (i & 8) != 0 ? null : runnable;
        a.hs hsVar2 = (i & 16) != 0 ? null : hsVar;
        a.wv.w(context, "context");
        a.wv.w(str3, "title");
        a.wv.w(str4, "message");
        return K(context, 2131558560, str3, str4, runnable2, hsVar2);
    }

    public static a.v60 a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable) {
        a.wv.w(context, "context");
        a.wv.w(str, "title");
        a.wv.w(str2, "message");
        return K(context, 2131558499, str, str2, runnable, null);
    }

    public static a.v60 b(android.app.AlertDialog alertDialog) {
        if (alertDialog != null && !alertDialog.isShowing()) {
            android.view.Window window = alertDialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(2132018325);
            }
            alertDialog.show();
        }
        if (alertDialog != null) {
            return new a.v60(alertDialog);
        }
        return null;
    }

    public static void c(a.bp0 bp0Var) {
        a.wv.M0(a.wv.b(a.z80.b), null, new a.pd1(bp0Var, null), 3);
    }

    public static java.lang.String d(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static android.graphics.RectF e(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view) {
        if (view == null) {
            return new android.graphics.RectF();
        }
        // [修复] smali 为 obfuscated 字段 TabLayout.G:Z（真实 material 无此字段），
        // 依语义推断为 isTabIndicatorFullWidth()
        if (tabLayout.isTabIndicatorFullWidth() || !(view instanceof a.ik1)) {
            return new android.graphics.RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        a.ik1 ik1Var = (a.ik1) view;
        int contentWidth = ik1Var.getContentWidth();
        int contentHeight = ik1Var.getContentHeight();
        int T = (int) a.wv.T(ik1Var.getContext(), 24);
        if (contentWidth < T) {
            contentWidth = T;
        }
        int right = (ik1Var.getRight() + ik1Var.getLeft()) / 2;
        int bottom = (ik1Var.getBottom() + ik1Var.getTop()) / 2;
        int i = contentWidth / 2;
        return new android.graphics.RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static a.v60 f(android.content.Context context, java.lang.String str, java.lang.String str2, a.u60 u60Var, a.u60 u60Var2) {
        a.wv.w(context, "context");
        a.wv.w(str, "title");
        a.wv.w(str2, "message");
        return g(context, str, str2, null, u60Var, u60Var2);
    }

    public static a.v60 g(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, final a.u60 u60Var, final a.u60 u60Var2) {
        a.wv.w(context, "context");
        a.wv.w(str, "title");
        a.wv.w(str2, "message");
        android.view.View u = u(context, 2131558515, str, str2, view);
        final int i = 1;
        final a.v60 m = m(context, u, true);
        android.widget.TextView textView = (android.widget.TextView) u.findViewById(2131362098);
        if (u60Var != null && textView != null) {
            textView.setText(u60Var.f578a);
        }
        if (textView != null) {
            final int i2 = 0;
            textView.setOnClickListener(new a.r60());
        }
        android.widget.TextView textView2 = (android.widget.TextView) u.findViewById(2131362097);
        if (u60Var2 != null && textView2 != null) {
            textView2.setText(u60Var2.f578a);
        }
        textView2.setOnClickListener(new a.r60());
        return m;
    }

    public static a.v60 h(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        a.wv.w(context, "context");
        a.wv.w(str, "title");
        a.wv.w(str2, "message");
        android.view.View u = u(context, 2131558515, str, str2, view);
        a.v60 m = m(context, u, true);
        u.findViewById(2131362097).setOnClickListener(new a.o60(m, runnable2, 4));
        u.findViewById(2131362098).setOnClickListener(new a.o60(m, runnable, 5));
        return m;
    }

    public static a.v60 i(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        a.wv.w(context, "context");
        a.wv.w(str, "title");
        a.wv.w(str2, "message");
        return K(context, 2131558515, str, str2, runnable, runnable2);
    }

    public static a.v60 j(android.content.Context context, android.view.View view, a.u60 u60Var) {
        int i = a.x60.f681a;
        a.wv.w(context, "context");
        return g(context, "", "", view, u60Var, null);
    }

    public static void k(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable) {
        int i = a.x60.f681a;
        a.wv.w(activity, "context");
        a.wv.w(str2, "message");
        K(activity, 2131558515, str, str2, runnable, null);
    }

    public static a.l70 l(com.omarea.krscript.model.RunnableNode runnableNode, java.lang.Runnable runnable, java.lang.Runnable runnable2, java.lang.String str, java.util.HashMap hashMap, boolean z) {
        a.wv.w(runnableNode, "nodeInfo");
        a.wv.w(runnable, "onExit");
        a.wv.w(str, "script");
        a.l70 l70Var = new a.l70();
        l70Var.u0 = runnableNode;
        l70Var.v0 = runnable;
        l70Var.w0 = str;
        l70Var.x0 = hashMap;
        l70Var.y0 = z ? 2132018313 : 2132018314;
        l70Var.z0 = runnable2;
        return l70Var;
    }

    public static a.v60 m(android.content.Context context, android.view.View view, boolean z) {
        a.wv.w(context, "context");
        boolean z2 = context instanceof android.app.Activity;
        android.app.AlertDialog create = ((z2 && (((android.app.Activity) context).getWindow().getAttributes().flags & 1048576) == 0) ? new android.app.AlertDialog.Builder(context, 2132018299) : new android.app.AlertDialog.Builder(context)).setView(view).setCancelable(z).create();
        if (z2) {
            create.show();
            android.view.Window window = create.getWindow();
            if (window != null) {
                int i = a.x60.f681a;
                android.app.Activity activity = (android.app.Activity) context;
                R(window, activity);
                android.view.View decorView = window.getDecorView();
                a.wv.v(decorView, "decorView");
                P(decorView);
                window.getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility());
            }
        } else {
            android.view.Window window2 = create.getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(2132018326);
            }
            create.show();
            android.view.Window window3 = create.getWindow();
            if (window3 != null) {
                window3.setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        a.wv.v(create, "dialog");
        a.v60 v60Var = new a.v60(create);
        v60Var.b(z);
        android.view.Window window4 = v60Var.f625a.getWindow();
        android.view.View decorView2 = window4 != null ? window4.getDecorView() : null;
        if (decorView2 != null) {
            decorView2.setOnTouchListener(new a.t60(v60Var, view));
        }
        return v60Var;
    }

    public static void o(android.app.Activity activity, int i) {
        int i2 = a.x60.f681a;
        a.wv.w(activity, "context");
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(i, (android.view.ViewGroup) null);
        a.wv.v(inflate, "from(context).inflate(view, null)");
        m(activity, inflate, true);
    }

    public static a.rd0 p(java.lang.String str) {
        a.od0 od0Var;
        a.pd0 pd0Var;
        a.sd0 sd0Var;
        a.qd0 qd0Var;
        a.wv.w(str, "json");
        a.lt0 lt0Var = new a.lt0(str);
        java.lang.String l = lt0Var.l("mode");
        a.pd0[] values = a.pd0.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            od0Var = null;
            if (i2 >= length) {
                pd0Var = null;
                break;
            }
            pd0Var = values[i2];
            if (a.wv.e(pd0Var.c, l)) {
                break;
            }
            i2++;
        }
        a.pd0 pd0Var2 = pd0Var == null ? a.pd0.d : pd0Var;
        java.lang.String l2 = lt0Var.l("transport");
        a.sd0[] values2 = a.sd0.values();
        int length2 = values2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                sd0Var = null;
                break;
            }
            sd0Var = values2[i3];
            if (a.wv.e(sd0Var.c, l2)) {
                break;
            }
            i3++;
        }
        a.sd0 sd0Var2 = sd0Var == null ? a.sd0.d : sd0Var;
        java.lang.String l3 = lt0Var.l("projectId");
        java.lang.String l4 = lt0Var.l("phase");
        a.qd0[] values3 = a.qd0.values();
        int length3 = values3.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                qd0Var = null;
                break;
            }
            qd0Var = values3[i4];
            if (a.wv.e(qd0Var.c, l4)) {
                break;
            }
            i4++;
        }
        if (qd0Var == null) {
            qd0Var = a.qd0.d;
        }
        java.lang.String l5 = lt0Var.l("exit");
        a.od0[] values4 = a.od0.values();
        int length4 = values4.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            a.od0 od0Var2 = values4[i];
            if (a.wv.e(od0Var2.c, l5)) {
                od0Var = od0Var2;
                break;
            }
            i++;
        }
        if (od0Var == null) {
            od0Var = a.od0.d;
        }
        return new a.rd0(pd0Var2, sd0Var2, l3, qd0Var, od0Var, lt0Var.l("err"), lt0Var.k("totalSize"), lt0Var.k("transSize"), lt0Var.k("speed"));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [a.y21, java.lang.Object] */
    public static a.y21 q(java.lang.String str) {
        a.wv.w(str, "json");
        a.lt0 lt0Var = new a.lt0(str);
        java.lang.String l = lt0Var.l("projectId");
        int j = lt0Var.j("files", 0);
        long k = lt0Var.k("totalSize");
        java.lang.String l2 = lt0Var.l("dest");
        java.lang.Boolean t1 = a.b20.t1(lt0Var.f329a.get("isApp"));
        boolean booleanValue = t1 != null ? t1.booleanValue() : false;
        a.y21 obj = new a.y21();
        obj.f701a = l;
        obj.b = j;
        obj.c = k;
        obj.d = l2;
        obj.e = booleanValue;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [a.mc1, java.lang.Object] */
    public static a.mc1 r(java.lang.String str) {
        a.wv.w(str, "path");
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("path-detail-info", str, 10000L);
        a.mc1 mc1Var = null;
        if (L.length() > 0 && !a.wv.e(L, "error")) {
            try {
                mc1Var = new a.mc1(new a.lt0(L));
            } catch (java.lang.Exception unused) {
            }
        }
        if (mc1Var != null) {
            return mc1Var;
        }
        a.mc1 obj = new a.mc1();
        obj.b = "";
        obj.c = "";
        java.io.File file = new java.io.File(str);
        java.lang.String name = file.getName();
        a.wv.v(name, "f.name");
        obj.b = name;
        java.lang.String absolutePath = file.getAbsolutePath();
        a.wv.v(absolutePath, "f.absolutePath");
        obj.c = absolutePath;
        obj.e = false;
        return obj;
    }

    public static boolean s(java.lang.String str, boolean z) {
        a.wv.w(str, "key");
        return D().getBoolean(str, z);
    }

    public static android.app.Application t() {
        android.app.Application application = com.omarea.Scene.e;
        if (application != null) {
            return application;
        }
        a.wv.M1("context");
        throw null;
    }

    public static android.view.View u(android.content.Context context, int i, java.lang.String str, java.lang.String str2, android.view.View view) {
        android.widget.FrameLayout frameLayout;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131362256);
        if (textView != null) {
            if (str.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(2131362255);
        if (textView2 != null) {
            if (str2.length() == 0) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(str2);
            }
        }
        if (view != null && (frameLayout = (android.widget.FrameLayout) inflate.findViewById(2131362254)) != null) {
            frameLayout.addView(view);
        }
        return inflate;
    }

    public static a.t10 v() {
        return (a.t10) a.ep1.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r8 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String w(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            if (r8 == 0) goto L2a
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            if (r9 == 0) goto L2a
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            r8.close()
            return r9
        L27:
            r9 = move-exception
            r7 = r8
            goto L34
        L2a:
            if (r8 == 0) goto L3d
        L2c:
            r8.close()
            goto L3d
        L30:
            r9 = move-exception
            goto L34
        L32:
            r8 = r7
            goto L3a
        L34:
            if (r7 == 0) goto L39
            r7.close()
        L39:
            throw r9
        L3a:
            if (r8 == 0) goto L3d
            goto L2c
        L3d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fs1.w(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static java.lang.String x(java.io.File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    fileInputStream.close();
                    return d(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.String y(android.content.Context context, android.net.Uri uri) {
        if (context.getContentResolver().getType(uri) == null) {
            java.lang.String B = B(context, uri);
            if (B != null) {
                return new java.io.File(B).getName();
            }
            java.lang.String uri2 = uri.toString();
            if (uri2 == null) {
                return null;
            }
            return uri2.substring(uri2.lastIndexOf(47) + 1);
        }
        android.database.Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        if (query == null) {
            return null;
        }
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        java.lang.String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    public static int z(com.omarea.krscript.model.ActionParamInfo actionParamInfo, java.util.ArrayList arrayList) {
        a.wv.w(actionParamInfo, "actionParamInfo");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (actionParamInfo.getValueFromShell() != null) {
            java.lang.String valueFromShell = actionParamInfo.getValueFromShell();
            a.wv.s(valueFromShell);
            arrayList2.add(valueFromShell);
        }
        if (actionParamInfo.getValue() != null) {
            java.lang.String value = actionParamInfo.getValue();
            a.wv.s(value);
            arrayList2.add(value);
        }
        if (arrayList2.size() <= 0) {
            return -1;
        }
        int size = arrayList2.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            java.util.Iterator it = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (a.wv.e(((a.ng1) it.next()).c, arrayList2.get(i2))) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i > -1) {
                break;
            }
        }
        return i;
    }

    public void Q(android.view.View view, int i) {
        if (!c) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
                android.util.Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            c = true;
        }
        java.lang.reflect.Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (java.lang.IllegalAccessException unused2) {
            }
        }
    }

    public final void U(android.content.Context context, java.lang.String str, java.util.HashMap hashMap, com.omarea.krscript.model.RunnableNode runnableNode, final java.lang.Runnable runnable, final a.r1 r1Var) {
        final int i = 1;
        switch (this.f157a) {
            case 21:
                a.wv.w(runnableNode, "nodeInfo");
                a.wv.w(runnable, "onExit");
                android.content.Context applicationContext = context.getApplicationContext();
                a.pr.e++;
                a.wv.v(applicationContext, "applicationContext");
                final int i2 = 0;
                new a.kh1().a(context, runnableNode, str, new a.nr(), hashMap, new a.or(applicationContext, runnableNode, a.pr.e));
                android.os.Bundle bundle = new android.os.Bundle();
                if (hashMap != null) {
                    bundle.putSerializable("params", hashMap);
                }
                int i3 = a.x60.f681a;
                java.lang.String string = context.getString(2131952631);
                a.wv.v(string, "context.getString(R.string.kr_bg_task_start)");
                java.lang.String string2 = context.getString(2131952632);
                a.wv.v(string2, "context.getString(R.string.kr_bg_task_start_desc)");
                F(context, string, string2, null);
                return;
            default:
                a.wv.w(runnableNode, "nodeInfo");
                a.wv.w(runnable, "onExit");
                android.content.Context applicationContext2 = context.getApplicationContext();
                a.fs1 fs1Var = a.mr0.c;
                a.wv.v(applicationContext2, "applicationContext");
                new a.kh1().a(context, runnableNode, str, new a.nr(), hashMap, new a.lr0(applicationContext2));
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (hashMap != null) {
                    bundle2.putSerializable("params", hashMap);
                    return;
                }
                return;
        }
    }

    public void Y(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        android.graphics.RectF e = e(tabLayout, view);
        android.graphics.RectF e2 = e(tabLayout, view2);
        drawable.setBounds(a.el.c(f, (int) e.left, (int) e2.left), drawable.getBounds().top, a.el.c(f, (int) e.right, (int) e2.right), drawable.getBounds().bottom);
    }

    public final boolean equals(java.lang.Object obj) {
        switch (this.f157a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return obj == this || obj == null;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.f157a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return 0;
            default:
                return super.hashCode();
        }
    }

    public final java.lang.String toString() {
        switch (this.f157a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                return "null";
            default:
                return super.toString();
        }
    }

    /* [修复] 从 smali 还原：fs1(II) 为 R8 合成构造器，packed-switch 映射到 this(N)，default→this(2)。
       净效果 c = (i∈{3,5,6,7,8,9,10,11,15..22,25,27,28,29}) ? i : 2 */
    public /* synthetic */ fs1(int i, int i2) {
        this(switch (i) {
            case 3, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 20, 21, 22, 25, 27, 28, 29 -> i;
            default -> 2;
        });
    }
}
