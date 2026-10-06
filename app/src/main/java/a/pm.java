package a;
import de.robv.android.xposed.XposedBridge;



/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class pm implements a.bt, a.z21 {
    public final /* synthetic */ int c;
    public java.lang.Object d;
    public java.lang.Object e;

    /* JADX WARN: Type inference failed for: r0v15, types: [a.hs1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [a.vs, java.lang.Object] */
    public pm(int i) {
        this.c = i;
        if (i == 16) {
            this.d = a.pm.class.getSimpleName();
            this.e = new java.util.ArrayList();
            return;
        }
        if (i == 21) {
            a.cp cpVar = com.omarea.Scene.c;
            this.d = a.fs1.t().getSharedPreferences("powercfg", 0);
            this.e = a.fs1.t().getResources();
            return;
        }
        if (i == 24) {
            this.d = new hs1();
            this.e = new int[]{5, 10, 15, 30, 45, 60, 90, 120, 150, 250, 300, 450, 600, 900, 1200, 1800, 2400};
            return;
        }
        if (i != 26) {
            this.d = new android.graphics.Rect();
            this.e = new android.graphics.Rect();
            return;
        }
        a.vs obj = (vs) new hs1();
        char c = 65535;
        obj.b = -1;
        obj.c = false;
        java.lang.String str = android.os.Build.MODEL;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 2365109) {
            if (hashCode != 193560386) {
                if (hashCode == 654956528 && str.equals("Mi 10 Pro")) {
                    c = 2;
                }
            } else if (str.equals("MI CC9 Pro")) {
                c = 1;
            }
        } else if (str.equals("MI 9")) {
            c = 0;
        }
        if (c == 0) {
            obj.f641a = new a.hs1[]{new a.hs1("❶", 0), new a.hs1("❷", 2)};
        } else if (c == 1) {
            obj.f641a = new a.hs1[]{new a.hs1("❶", 0), new a.hs1("❷", 2), new a.hs1("❹", 5)};
        } else if (c != 2) {
            hs1 obj2 = new hs1();
            obj2.f215a = 0;
            obj2.b = "1.0×";
            obj.f641a = new a.hs1[]{obj2};
            XposedBridge.log("Scene: 摄像头数量 " + android.hardware.Camera.getNumberOfCameras());
            for (int i2 = 0; i2 < android.hardware.Camera.getNumberOfCameras(); i2++) {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 0) {
                    XposedBridge.log("Scene [Dump CameraInfo] cameraId: " + i2);
                }
            }
        } else {
            obj.f641a = new a.hs1[]{new a.hs1("❶", 0)};
        }
        this.d = obj;
        this.e = new a.fa0(3);
    }

    public static boolean I(a.jt0 jt0Var) {
        int size = jt0Var.f269a.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            java.lang.String d = jt0Var.d(i);
            if (a.wv.e(a.gy.z(), d) || a.wv.e(a.gy.u(), d)) {
                z = true;
            }
        }
        return z;
    }

    public static double q(a.lt0 lt0Var, java.lang.String str, double d) {
        if (lt0Var.f329a.containsKey(str)) {
            try {
                return java.lang.Double.parseDouble(lt0Var.a(str).toString());
            } catch (java.lang.Exception unused) {
            }
        }
        return d;
    }

    public final void A(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray obtainStyledAttributes = ((android.widget.EditText) this.d).getContext().obtainStyledAttributes(attributeSet, a.u81.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((a.ya0) this.e).f705a.D(z);
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final android.view.inputmethod.InputConnection B(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        a.ya0 ya0Var = (a.ya0) this.e;
        if (inputConnection != null) {
            return ya0Var.f705a.G(inputConnection, editorInfo);
        }
        ya0Var.getClass();
        return null;
    }

    public final void C(a.vi0 vi0Var) {
        int i = vi0Var.b;
        if (i != 0) {
            ((android.os.Handler) this.e).post(new a.iw(this, (a.vu0) this.d, i, 3));
        } else {
            a.vu0 vu0Var = (a.vu0) this.d;
            ((android.os.Handler) this.e).post(new a.ts(this, vu0Var, vi0Var.f634a, 0));
        }
    }

    public final void D(com.omarea.krscript.model.PageNode pageNode, java.lang.String str) {
        android.content.Intent intent;
        a.wv.w(pageNode, "pageNode");
        if (!a.wv.P) {
            new a.yi().b(((android.app.Activity) this.d).getApplicationContext());
        }
        try {
            if (pageNode.getOnlineHtmlPage().length() == 0) {
                intent = null;
            } else {
                intent = new android.content.Intent((android.app.Activity) this.d, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityAddinOnline.class);
                intent.addFlags(268435456);
                intent.putExtra("url", pageNode.getOnlineHtmlPage());
            }
            if (pageNode.getPageConfigSh().length() != 0) {
                if (intent == null) {
                    intent = new android.content.Intent((android.app.Activity) this.d, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityActionPage.class);
                }
                intent.addFlags(268435456);
            }
            if (pageNode.getPageConfigPath().length() != 0) {
                if (intent == null) {
                    intent = new android.content.Intent((android.app.Activity) this.d, (java.lang.Class<?>) com.omarea.vtools.activities.ActivityActionPage.class);
                }
                intent.addFlags(268435456);
            }
            if (intent != null) {
                intent.putExtra("page", pageNode);
                if (str != null) {
                    intent.putExtra("autoRunItemId", str);
                }
                ((android.app.Activity) this.d).startActivity(intent);
            }
        } catch (java.lang.Exception e) {
            android.widget.Toast.makeText((android.app.Activity) this.d, e.getMessage(), 0).show();
        }
    }

    public final com.omarea.model.ProcessInfo E(java.lang.String str) {
        java.util.List y2 = a.yi1.y2(str, new java.lang.String[]{"|"});
        try {
            com.omarea.model.ProcessInfo processInfo = new com.omarea.model.ProcessInfo();
            processInfo.cpu = java.lang.Float.parseFloat((java.lang.String) y2.get(0));
            processInfo.res = J((java.lang.String) y2.get(1));
            processInfo.shr = J((java.lang.String) y2.get(2));
            processInfo.swap = J((java.lang.String) y2.get(3));
            java.lang.String str2 = (java.lang.String) y2.get(4);
            processInfo.name = str2;
            if (((java.util.ArrayList) this.e).contains(str2)) {
                return null;
            }
            processInfo.pid = java.lang.Integer.parseInt((java.lang.String) y2.get(5));
            processInfo.user = (java.lang.String) y2.get(6);
            processInfo.state = (java.lang.String) y2.get(7);
            processInfo.command = (java.lang.String) y2.get(8);
            processInfo.cmdline = (java.lang.String) y2.get(9);
            return processInfo;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void F() {
        ((android.graphics.Bitmap) this.d).recycle();
        ((android.graphics.Bitmap) this.e).recycle();
    }

    public final void G(int i, int i2, int i3, int i4) {
        ((androidx.cardview.widget.CardView) this.e).mShadowBounds.set(i, i2, i3, i4);
        java.lang.Object obj = this.e;
        androidx.cardview.widget.CardView.setPadding((androidx.cardview.widget.CardView) obj, i + ((androidx.cardview.widget.CardView) obj).mContentPadding.left, i2 + ((androidx.cardview.widget.CardView) obj).mContentPadding.top, i3 + ((androidx.cardview.widget.CardView) obj).mContentPadding.right, i4 + ((androidx.cardview.widget.CardView) obj).mContentPadding.bottom);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.ng1, java.lang.Object] */
    public final void H(java.lang.Integer num, a.l4 l4Var) {
        java.lang.String str;
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        java.util.List<a.ua1> list = (java.util.List) this.e;
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
        for (a.ua1 ua1Var : list) {
            a.ng1 obj = new a.ng1();
            obj.f381a = a.ai1.c(java.lang.Math.round(ua1Var.d), "Hz");
            obj.c = java.lang.String.valueOf(java.lang.Math.round(ua1Var.d));
            arrayList.add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        a.ng1 obj2 = new a.ng1();
        obj2.f381a = ((android.content.Context) this.d).getString(2131951791);
        obj2.c = "";
        arrayList2.add(0, obj2);
        android.content.Context context = (android.content.Context) this.d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.ng1 next = (ng1) it.next();
            if (a.wv.e(((a.ng1) next).c, str)) {
                arrayList3.add(next);
            }
        }
        a.e70 e70Var = new a.e70(context, arrayList2, new java.util.ArrayList(arrayList3), false);
        java.lang.String string = ((android.content.Context) this.d).getString(2131952155);
        a.wv.v(string, "context.getString(R.string.detail_refresh_rate)");
        e70Var.j = string;
        e70Var.e();
        e70Var.l = new a.d70(l4Var, 1);
        e70Var.c();
    }

    public final long J(java.lang.String str) {
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

    public final void K() {
        switch (this.c) {
            case 14:
                return;
            default:
                java.lang.Process process = (java.lang.Process) this.e;
                if (process == null) {
                    return;
                }
                java.io.OutputStream outputStream = process.getOutputStream();
                a.wv.v(outputStream, "outputStream");
                java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(outputStream, a.bu.f53a);
                java.io.BufferedWriter bufferedWriter = outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192);
                bufferedWriter.write("exit\nexit\nexit\n");
                bufferedWriter.write("\n\n");
                bufferedWriter.flush();
                new java.lang.Thread(new a.pp(this, 2)).start();
                return;
        }
    }

    public final void a(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.a(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void b(boolean z) {
        a.am0 am0Var = (a.am0) this.e;
        android.content.Context context = am0Var.q.X;
        a.gk0 gk0Var = am0Var.s;
        if (gk0Var != null) {
            gk0Var.h().n.b(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void c(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.c(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // a.bt
    public final void d() {
        ((android.animation.Animator) this.d).end();
    }

    public final void e(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.e(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void f(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.f(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void g(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.g(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void h(boolean z) {
        a.am0 am0Var = (a.am0) this.e;
        android.content.Context context = am0Var.q.X;
        a.gk0 gk0Var = am0Var.s;
        if (gk0Var != null) {
            gk0Var.h().n.h(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void i(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.i(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void j(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.j(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void k(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.k(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void l(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.l(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void m(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.m(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.n(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(boolean z) {
        a.gk0 gk0Var = ((a.am0) this.e).s;
        if (gk0Var != null) {
            gk0Var.h().n.o(true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.d).iterator();
        if (it.hasNext()) {
            a.ai1.t(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void p(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        a.wv.w(str2, "contentDisposition");
        try {
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(str));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setAllowedOverMetered(true);
            request.setVisibleInDownloadsUi(true);
            request.setAllowedOverRoaming(true);
            if (str3.length() == 0) {
                str3 = android.webkit.URLUtil.guessFileName(str, str2, "application/zip");
            }
            request.setDescription(str3);
            request.setTitle(str3);
            java.lang.Object obj = this.d;
            android.widget.Toast.makeText((android.content.Context) obj, ((android.content.Context) obj).getString(2131952671), 0).show();
            a.wx0 wx0Var = a.wx0.f676a;
            android.content.Context applicationContext = ((android.content.Context) this.d).getApplicationContext();
            a.wv.v(applicationContext, "context.applicationContext");
            if (a.wx0.f676a == null) {
                a.wx0.f676a = new a.wx0();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
                applicationContext.registerReceiver(a.wx0.f676a, intentFilter);
            }
            java.lang.Object systemService = ((android.content.Context) this.d).getSystemService("download");
            a.wv.t(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            android.app.DownloadManager downloadManager = (android.app.DownloadManager) systemService;
            if (!z) {
                request.setDestinationInExternalPublicDir(android.os.Environment.DIRECTORY_DOWNLOADS, str3);
                downloadManager.enqueue(request);
                return;
            }
            long enqueue = downloadManager.enqueue(request);
            android.content.SharedPreferences.Editor edit = ((android.content.Context) this.d).getSharedPreferences("MagiskReCompress", 0).edit();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(enqueue);
            edit.putString(sb.toString(), str3).apply();
        } catch (java.lang.Exception e) {
            int i = a.x60.f681a;
            android.content.Context context = (android.content.Context) this.d;
            java.lang.String string = context.getString(2131952670);
            a.wv.v(string, "context.getString(R.stri….kr_download_create_fail)");
            a.fs1.F(context, string, e.getMessage(), null);
        }
    }

    public final java.lang.String r(java.io.File file, android.content.Context context) {
        java.lang.String[] strArr;
        if (((java.util.List) this.e).size() > 0) {
            strArr = (java.lang.String[]) ((java.util.List) this.e).toArray(new java.lang.String[0]);
        } else {
            for (java.io.File file2 : context.getExternalFilesDirs("external")) {
                if (file2 != null && !file2.equals(context.getExternalFilesDir("external"))) {
                    int lastIndexOf = file2.getAbsolutePath().lastIndexOf("/Android/data");
                    if (lastIndexOf < 0) {
                        android.util.Log.w((java.lang.String) this.d, "Unexpected external file dir: " + file2.getAbsolutePath());
                    } else {
                        java.lang.String substring = file2.getAbsolutePath().substring(0, lastIndexOf);
                        try {
                            substring = new java.io.File(substring).getCanonicalPath();
                        } catch (java.io.IOException unused) {
                        }
                        ((java.util.List) this.e).add(substring);
                    }
                }
            }
            if (((java.util.List) this.e).isEmpty()) {
                ((java.util.List) this.e).add("/storage/sdcard1");
            }
            strArr = (java.lang.String[]) ((java.util.List) this.e).toArray(new java.lang.String[0]);
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                if (file.getCanonicalPath().startsWith(strArr[i])) {
                    return strArr[i];
                }
            } catch (java.io.IOException unused2) {
            }
        }
        return null;
    }

    public final android.text.method.KeyListener s(android.text.method.KeyListener keyListener) {
        return (keyListener instanceof android.text.method.NumberKeyListener) ^ true ? ((a.ya0) this.e).f705a.F(keyListener) : keyListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.gm1 t(double r8) {
        /*
            r7 = this;
            double r0 = r7.e
            int[] r0 = (int[]) r0
            java.lang.String r1 = "<this>"
            a.wv.w(r0, r1)
            int r1 = r0.length
            if (r1 == 0) goto L8f
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            double r1 = (double) r0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1e
        L16:
            int r0 = r0 + 600
            double r1 = (double) r0
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L16
            goto L34
        L1e:
            double r0 = r7.e
            int[] r0 = (int[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r1) goto L33
            r4 = r0[r3]
            double r5 = (double) r4
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L30
            r0 = r4
            goto L34
        L30:
            int r3 = r3 + 1
            goto L25
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L37
            int r0 = (int) r8
        L37:
            r8 = 10
            r9 = 5
            r1 = 2
            if (r0 == r9) goto L89
            r2 = 15
            if (r0 == r2) goto L82
            r9 = 30
            r2 = 12
            r3 = 4
            if (r0 == r9) goto L7c
            r9 = 45
            if (r0 == r9) goto L74
            r9 = 60
            if (r0 == r9) goto L6e
            r9 = 90
            r4 = 6
            r5 = 3
            if (r0 == r9) goto L66
            r9 = 120(0x78, float:1.68E-43)
            if (r0 == r9) goto L60
            a.gm1 r9 = new a.gm1
            r9.<init>(r0, r8, r1, r3)
            goto L8e
        L60:
            a.gm1 r9 = new a.gm1
            r9.<init>(r0, r2, r5, r4)
            goto L8e
        L66:
            a.gm1 r9 = new a.gm1
            r8 = 18
            r9.<init>(r0, r8, r5, r4)
            goto L8e
        L6e:
            a.gm1 r9 = new a.gm1
            r9.<init>(r0, r2, r1, r3)
            goto L8e
        L74:
            a.gm1 r9 = new a.gm1
            r8 = 9
            r9.<init>(r0, r8, r1, r1)
            goto L8e
        L7c:
            a.gm1 r9 = new a.gm1
            r9.<init>(r0, r2, r1, r3)
            goto L8e
        L82:
            a.gm1 r8 = new a.gm1
            r8.<init>(r0, r2, r9, r9)
            r9 = r8
            goto L8e
        L89:
            a.gm1 r9 = new a.gm1
            r9.<init>(r0, r8, r1, r1)
        L8e:
            return r9
        L8f:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r9 = "Array is empty."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pm.t(double):a.gm1");
    }

    public final java.lang.String toString() {
        switch (this.c) {
            case 5:
                return "Bounds{lower=" + ((a.ns0) this.d) + " upper=" + ((a.ns0) this.e) + "}";
            case 28:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RomInfo{name=");
                sb.append((java.lang.String) this.d);
                sb.append(", version=");
                return a.ai1.j(sb, (java.lang.String) this.e, "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r11 != false) goto L37;
     */
    @Override // a.z21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a.du1 u(android.view.View r18, a.du1 r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pm.u(android.view.View, a.du1):a.du1");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(int r18, a.ey r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pm.v(int, a.ey):java.lang.Object");
    }

    public final java.lang.String w(a.lt0 lt0Var, java.lang.String str, java.lang.String str2) {
        return lt0Var.f329a.containsKey(str) ? ((a.ob1) this.d).a(lt0Var.a(str).toString(), false) : str2;
    }

    public final java.lang.Object x(a.ey eyVar) {
        java.net.URLConnection openConnection = new java.net.URL("https://magisk-modules-repo.github.io/submission/modules.json").openConnection();
        openConnection.connect();
        java.io.InputStream inputStream = openConnection.getInputStream();
        a.wv.v(inputStream, "connection.getInputStream()");
        a.jt0 e = new a.lt0(new java.lang.String(a.wv.c1(inputStream), a.bu.f53a)).e("modules");
        int size = e.f269a.size();
        a.e3 e3Var = (a.e3) this.e;
        e3Var.getClass();
        try {
            e3Var.getWritableDatabase().delete("modules", " 1 = 1", new java.lang.String[0]);
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            a.lt0 c = e.c(i);
            a.c11 c11Var = new a.c11();
            c11Var.setId(c.h("id"));
            c11Var.setLastUpdate(c.g("last_update"));
            c11Var.setPropUrl(c.h("prop_url"));
            c11Var.setZipUrl(c.h("zip_url"));
            c11Var.setNotesUrl(c.h("notes_url"));
            arrayList.add(c11Var);
        }
        java.lang.Object S1 = a.wv.S1(a.z80.b, new a.yx0(arrayList, this, null), eyVar);
        return S1 == a.dz.c ? S1 : a.no1.f387a;
    }

    public final void y() {
        android.content.SharedPreferences.Editor edit = ((android.content.SharedPreferences) this.d).edit();
        java.lang.String[] stringArray = ((android.content.res.Resources) this.e).getStringArray(2130903054);
        a.wv.v(stringArray, "res.getStringArray(R.array.config_powercfg_igoned)");
        for (java.lang.String str : stringArray) {
            a.nk nkVar = a.b11.c;
            edit.putString(str, a.b11.o);
        }
        java.lang.String[] stringArray2 = ((android.content.res.Resources) this.e).getStringArray(2130903052);
        a.wv.v(stringArray2, "res.getStringArray(R.array.config_powercfg_fast)");
        for (java.lang.String str2 : stringArray2) {
            a.nk nkVar2 = a.b11.c;
            edit.putString(str2, a.b11.k);
        }
        java.lang.String[] stringArray3 = ((android.content.res.Resources) this.e).getStringArray(2130903055);
        a.wv.v(stringArray3, "res.getStringArray(R.arr…fig_powercfg_performance)");
        for (java.lang.String str3 : stringArray3) {
            a.nk nkVar3 = a.b11.c;
            edit.putString(str3, a.b11.j);
        }
        java.lang.String[] stringArray4 = ((android.content.res.Resources) this.e).getStringArray(2130903051);
        a.wv.v(stringArray4, "res.getStringArray(R.arr….config_powercfg_balance)");
        for (java.lang.String str4 : stringArray4) {
            a.nk nkVar4 = a.b11.c;
            edit.putString(str4, a.b11.l);
        }
        java.lang.String[] stringArray5 = ((android.content.res.Resources) this.e).getStringArray(2130903056);
        a.wv.v(stringArray5, "res.getStringArray(R.arr…onfig_powercfg_powersave)");
        for (java.lang.String str5 : stringArray5) {
            a.nk nkVar5 = a.b11.c;
            edit.putString(str5, a.b11.i);
        }
        edit.apply();
    }

    public final java.util.ArrayList z() {
        a.e3 e3Var = (a.e3) this.e;
        e3Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = e3Var.getReadableDatabase();
            android.database.Cursor rawQuery = readableDatabase.rawQuery("select id, name, description, version_name, version_code, author, prop_url, zip_url, notes_url from modules", new java.lang.String[0]);
            a.wv.v(rawQuery, "sqLiteDatabase.rawQuery(…from modules\", arrayOf())");
            while (rawQuery.moveToNext()) {
                a.d11 d11Var = new a.d11();
                java.lang.String string = rawQuery.getString(0);
                a.wv.v(string, "cursor.getString(0)");
                d11Var.setId(string);
                d11Var.setName(rawQuery.getString(1));
                d11Var.setDescription(rawQuery.getString(2));
                d11Var.setVersionName(rawQuery.getString(3));
                d11Var.setVersionCode(rawQuery.getString(4));
                d11Var.setAuthor(rawQuery.getString(5));
                java.lang.String string2 = rawQuery.getString(6);
                a.wv.v(string2, "cursor.getString(6)");
                d11Var.setPropUrl(string2);
                java.lang.String string3 = rawQuery.getString(7);
                a.wv.v(string3, "cursor.getString(7)");
                d11Var.setZipUrl(string3);
                java.lang.String string4 = rawQuery.getString(8);
                a.wv.v(string4, "cursor.getString(8)");
                d11Var.setNotesUrl(string4);
                arrayList.add(d11Var);
            }
            rawQuery.close();
            readableDatabase.close();
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    public /* synthetic */ pm(int i, java.lang.Object obj) {
        this.c = i;
    }

    public /* synthetic */ pm(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    public /* synthetic */ pm(java.lang.Object obj, android.animation.Animator animator) {
        this.c = 6;
        this.e = obj;
        this.d = animator;
    }

    public pm(com.omarea.vtools.activities.ActivityAppDetails activityAppDetails, java.util.List list) {
        this.c = 25;
        this.d = activityAppDetails;
        this.e = list;
    }

    public pm(android.os.Handler handler) {
        this.c = 15;
        this.d = handler;
    }

    public pm(android.content.Context context, int i) {
        this.c = i;
        if (i == 19) {
            a.wv.w(context, "context");
            this.d = context;
            this.e = context.getSharedPreferences("GeneralPermissions", 0);
        } else if (i != 20) {
            a.wv.w(context, "context");
            this.d = context;
            this.e = new a.e3((android.content.Context) this.d, 2);
        } else {
            a.wv.w(context, "context");
            this.d = context;
            this.e = new a.x2(2);
        }
    }

    public pm(a.f40 f40Var, java.lang.String str) {
        this.c = 14;
        this.d = f40Var;
        this.e = str;
    }

    public pm(a.ob1 ob1Var, a.nk nkVar) {
        this.c = 22;
        this.d = ob1Var;
        this.e = nkVar;
    }

    public pm(a.kk0 kk0Var) {
        this.c = 27;
        a.wv.w(kk0Var, "activity");
        this.d = kk0Var;
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public pm(android.content.Context context, android.app.Activity activity) {
        this.c = 17;
        a.wv.w(context, "context");
        this.d = context;
        this.e = activity;
    }

    public pm(android.widget.TextView textView) {
        this.c = 1;
        textView.getClass();
        this.d = textView;
    }

    public pm(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        this.c = 23;
        this.d = bitmap;
        this.e = bitmap2;
    }

    public pm(android.widget.EditText editText) {
        this.c = 0;
        this.d = editText;
        this.e = new a.ya0(editText);
    }

    public pm(a.am0 am0Var) {
        this.c = 7;
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.e = am0Var;
    }

    public pm(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.c = 3;
        int size = arrayList.size();
        this.d = new int[size];
        this.e = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.d)[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
            ((float[]) this.e)[i] = ((java.lang.Float) arrayList2.get(i)).floatValue();
        }
    }

    public pm(int i, int i2) {
        this.c = 3;
        this.d = new int[]{i, i2};
        this.e = new float[]{0.0f, 1.0f};
    }

    public pm(int i, int i2, int i3) {
        this.c = 3;
        this.d = new int[]{i, i2, i3};
        this.e = new float[]{0.0f, 0.5f, 1.0f};
    }

    public pm(androidx.viewpager.widget.ViewPager viewPager) {
        this.c = 8;
        this.e = viewPager;
        this.d = new android.graphics.Rect();
    }

    public pm(androidx.cardview.widget.CardView cardView) {
        this.c = 2;
        this.e = cardView;
    }

    public pm(a.pu0 pu0Var, a.pu0 pu0Var2) {
        this.c = 10;
        pu0Var.getClass();
        pu0Var2.getClass();
        if (0.0f > 0.0f) {
            throw new java.lang.IllegalArgumentException();
        }
        this.d = pu0Var;
        this.e = pu0Var2;
    }
}
