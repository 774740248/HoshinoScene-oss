package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class zf implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivitySwap d;

    public /* synthetic */ zf(com.omarea.vtools.activities.ActivitySwap activitySwap, int i) {
        this.c = i;
        this.d = activitySwap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        int i = this.c;
        com.omarea.vtools.activities.ActivitySwap activitySwap = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                android.content.SharedPreferences sharedPreferences = activitySwap.N;
                if (sharedPreferences == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                sharedPreferences.edit().putBoolean("swap", false).apply();
                android.content.SharedPreferences sharedPreferences2 = activitySwap.N;
                if (sharedPreferences2 == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                activitySwap.Q.getClass();
                a.gy.P(sharedPreferences2);
                a.q10 q10Var = a.q10.f457a;
                a.q10.l("sync\nsleep 2\nsvc power reboot || reboot");
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                activitySwap.U.b();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                a.b81 b81Var = activitySwap.M;
                if (b81Var == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                java.lang.String string = activitySwap.getString(2131953753);
                a.wv.v(string, "getString(R.string.zram_resizing)");
                b81Var.b(string);
                return;
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                a.b81 b81Var2 = activitySwap.M;
                if (b81Var2 != null) {
                    b81Var2.a();
                    return;
                } else {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                a.b81 b81Var3 = activitySwap.M;
                if (b81Var3 == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                java.lang.String string2 = activitySwap.getString(2131952263);
                a.wv.v(string2, "getString(R.string.file_creating)");
                b81Var3.b(string2);
                return;
            case 5:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                android.content.SharedPreferences sharedPreferences3 = activitySwap.N;
                if (sharedPreferences3 == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                int i2 = sharedPreferences3.getInt("swap_priority", -2);
                a.pj1 pj1Var = activitySwap.P;
                if (i2 == 0) {
                    pj1Var.getClass();
                    java.util.Iterator it = a.pj1.b().iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (a.yi1.B2(str, "/block/zram0 ") || a.yi1.B2(str, "/dev/block/zram0 ")) {
                            try {
                                num = java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) a.qv.x2(a.yi1.y2(str, new java.lang.String[]{" "})).get(4)));
                            } catch (java.lang.Exception unused) {
                            }
                            if (num != null && num.intValue() < 0) {
                                java.util.Timer v = activitySwap.v();
                                a.q10.l("swapoff /dev/block/zram0\n");
                                v.cancel();
                            }
                        }
                    }
                    num = null;
                    if (num != null) {
                        java.util.Timer v2 = activitySwap.v();
                        a.q10.l("swapoff /dev/block/zram0\n");
                        v2.cancel();
                    }
                }
                android.content.SharedPreferences sharedPreferences4 = activitySwap.N;
                if (sharedPreferences4 == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                java.lang.String k = pj1Var.k(i2, sharedPreferences4.getBoolean("swap_use_loop", false));
                int i3 = 1;
                if (k.length() > 0) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.X(k, 1);
                }
                activitySwap.U.b();
                a.cp cpVar2 = com.omarea.Scene.c;
                a.fs1.L(new a.xc(activitySwap.V, i3));
                a.b81 b81Var4 = activitySwap.M;
                if (b81Var4 != null) {
                    b81Var4.a();
                    return;
                } else {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
            default:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivitySwap.W;
                a.wv.w(activitySwap, "this$0");
                android.content.SharedPreferences sharedPreferences5 = activitySwap.N;
                if (sharedPreferences5 == null) {
                    a.wv.M1("swapConfig");
                    throw null;
                }
                sharedPreferences5.edit().putBoolean("swap", false).apply();
                a.b81 b81Var5 = activitySwap.M;
                if (b81Var5 == null) {
                    a.wv.M1("processBarDialog");
                    throw null;
                }
                b81Var5.a();
                activitySwap.U.b();
                return;
        }
    }
}
