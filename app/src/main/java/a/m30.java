package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class m30 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ m30(java.lang.Object obj, int i, java.io.Serializable serializable, int i2) {
        this.c = i2;
        this.f = obj;
        this.d = i;
        this.e = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap P;
        java.lang.String sb;
        int i = 2;
        switch (this.c) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                ((a.n30) this.f).b.k(this.d, this.e);
                return;
            case 1:
                ((a.s71) this.f).k(this.d, this.e);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.pm pmVar = (a.pm) this.f;
                a.b91 b91Var = (a.b91) this.e;
                int i2 = this.d;
                java.util.concurrent.ExecutorService executorService = a.b91.q;
                a.wv.w(pmVar, "$buffers");
                a.wv.w(b91Var, "this$0");
                try {
                    try {
                        P = a.b20.P((android.graphics.Bitmap) pmVar.d, b91Var.d, true);
                    } catch (java.lang.Exception unused) {
                        synchronized (b91Var.i) {
                            pmVar.F();
                            b91Var.j = null;
                        }
                    }
                    if (P == null) {
                        throw new java.lang.IllegalStateException("fastBlur returned null");
                    }
                    b91Var.a(P, (android.graphics.Bitmap) pmVar.e);
                    if (!b91Var.f) {
                        b91Var.f = true;
                        int pixel = android.graphics.Bitmap.createScaledBitmap((android.graphics.Bitmap) pmVar.e, 1, 1, true).getPixel(0, 0);
                        android.util.Log.d("RealtimeBlur", "dark=" + b91Var.b + " mixed=#" + java.lang.Integer.toHexString(pixel) + " capture=" + ((android.graphics.Bitmap) pmVar.d).getWidth() + "x" + ((android.graphics.Bitmap) pmVar.d).getHeight());
                    }
                    synchronized (b91Var.i) {
                        try {
                            if (i2 == b91Var.l) {
                                b91Var.j = pmVar;
                            } else {
                                pmVar.F();
                            }
                        } finally {
                        }
                    }
                    b91Var.k = false;
                    b91Var.f35a.post(new a.tb1(i2, b91Var));
                    return;
                } catch (java.lang.Throwable th) {
                    b91Var.k = false;
                    throw th;
                }
            case 3:
                com.omarea.vtools.activities.ActivitySwap activitySwap = (com.omarea.vtools.activities.ActivitySwap) this.f;
                java.lang.String str = (java.lang.String) this.e;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                a.wv.w(str, "$algorithm");
                a.pj1 pj1Var = activitySwap.P;
                pj1Var.getClass();
                boolean g2 = a.yi1.g2(a.nu0.d("/proc/swaps"), "/block/zram0");
                int i3 = this.d;
                if ((g2 && !a.wv.e(str, a.pj1.a())) || i3 != a.pj1.g()) {
                    java.util.Timer v = activitySwap.v();
                    a.q10.l("swapoff /dev/block/zram0\n");
                    v.cancel();
                }
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.L(new a.zf(activitySwap, i));
                if (a.pj1.g() != i3 || ((str.length() > 0 && !a.wv.e(str, a.pj1.a())) || !a.yi1.g2(a.nu0.d("/proc/swaps"), "/block/zram0"))) {
                    a.nu0 nu0Var = a.nu0.f395a;
                    a.nu0.l("/sys/block/zram0/max_comp_streams", "4");
                    java.lang.String j = pj1Var.j();
                    a.q10 q10Var = a.q10.f457a;
                    a.q10.l("swapoff /dev/block/zram0");
                    a.nu0.l("/sys/block/zram0/reset", "1");
                    if (str.length() > 0) {
                        a.nu0.l("/sys/block/zram0/comp_algorithm", str);
                    }
                    if (j.length() > 0 && !a.wv.e(j, "none")) {
                        java.lang.String str2 = pj1Var.c;
                        if (a.gy.n(str2)) {
                            a.nu0.l(str2, j);
                        }
                    }
                    if (i3 > 2047) {
                        sb = a.ai1.c(i3, "M");
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(i3 * 1024 * 1024);
                        sb = sb2.toString();
                    }
                    a.nu0.l("/sys/block/zram0/disksize", sb);
                    a.q10.l("mkswap /dev/block/zram0 >/dev/null 2>&1\nswapon -p 0 /dev/block/zram0 >/dev/null 2>&1\n");
                }
                activitySwap.U.b();
                a.fs1.L(new a.zf(activitySwap, 3));
                return;
            default:
                com.omarea.common.ui.InputView inputView = (com.omarea.common.ui.InputView) this.f;
                a.l1 l1Var = (a.l1) this.e;
                a.wv.w(inputView, "$macInput");
                a.wv.w(l1Var, "this$0");
                java.lang.CharSequence F2 = a.yi1.F2(inputView.getText());
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("-");
                a.wv.v(compile, "compile(pattern)");
                a.wv.w(F2, "input");
                java.lang.String replaceAll = compile.matcher(F2).replaceAll(":");
                a.wv.v(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                java.util.Locale locale = java.util.Locale.ENGLISH;
                java.lang.String k = a.ai1.k(locale, "ENGLISH", replaceAll, locale, "this as java.lang.String).toLowerCase(locale)");
                a.ai1.n(1, "option");
                int b = a.ai1.b(1);
                if ((b & 2) != 0) {
                    b |= 64;
                }
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("[\\w\\d]{2}:[\\w\\d]{2}:[\\w\\d]{2}:[\\w\\d]{2}:[\\w\\d]{2}:[\\w\\d]{2}$", b);
                a.wv.v(compile2, "compile(pattern, ensureUnicodeCase(option.value))");
                if (!compile2.matcher(k).matches()) {
                    android.content.Context context = l1Var.b;
                    a.ai1.r(context, 2131952200, context, 1);
                    return;
                }
                int i4 = this.d;
                java.lang.String str3 = "mac=\"" + k + "\"\n" + (i4 == 1 ? a.b20.m0(l1Var.b, 2131886081) : i4 == 2 ? a.b20.m0(l1Var.b, 2131886082) : a.b20.m0(l1Var.b, 2131886081));
                a.wv.w(str3, "shell");
                a.q10 q10Var2 = a.q10.f457a;
                if (a.wv.e(a.q10.l(str3), "error")) {
                    android.content.Context context2 = l1Var.b;
                    a.ai1.r(context2, 2131952201, context2, 0);
                    return;
                } else {
                    android.content.Context context3 = l1Var.b;
                    a.ai1.r(context3, 2131952202, context3, 0);
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.O("wifi_mac", k);
                    return;
                }
        }
    }

    public /* synthetic */ m30(java.lang.Object obj, java.lang.Object obj2, int i, int i2) {
        this.c = i2;
        this.f = obj;
        this.e = obj2;
        this.d = i;
    }
}
