package a;

import java.util.Collection;
/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class b10 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b10(int i, java.lang.Object obj) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    public final java.lang.Integer a(java.nio.ByteBuffer byteBuffer) {
        int i;
        java.io.DataInputStream dataInputStream;
        int i2 = this.d;
        java.lang.Object obj = this.e;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.wv.w(byteBuffer, "readBuffer");
                a.oo1 oo1Var = (a.oo1) obj;
                a.wv.s(oo1Var);
                byte[] bArr = new byte[byteBuffer.capacity()];
                try {
                    dataInputStream = oo1Var.c;
                } catch (java.lang.Exception unused) {
                    try {
                        oo1Var.d = true;
                        oo1Var.f415a.close();
                    } catch (java.lang.Exception unused2) {
                    }
                    i = -1;
                }
                if (dataInputStream == null) {
                    a.wv.M1("input");
                    throw null;
                }
                i = dataInputStream.read(bArr);
                byteBuffer.put(bArr, 0, i);
                return java.lang.Integer.valueOf(i);
            default:
                a.wv.w(byteBuffer, "readBuffer");
                java.nio.channels.SocketChannel socketChannel = (java.nio.channels.SocketChannel) obj;
                a.wv.s(socketChannel);
                return java.lang.Integer.valueOf(socketChannel.read(byteBuffer));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        android.graphics.drawable.Drawable M1;
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        boolean z = true;
        java.lang.Object obj2 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return a((java.nio.ByteBuffer) obj);
            case 1:
                return a((java.nio.ByteBuffer) obj);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                java.lang.String str = (java.lang.String) obj;
                a.wv.w(str, "resourceName");
                if (!a.yi1.B2(str, "mtrl_") && !a.yi1.B2(str, "abc_") && !((a.ab1) obj2).c(str) && !a.yi1.B2(str, "path_password") && !a.yi1.B2(str, "xp_") && !a.yi1.B2(str, "com_google_") && !a.yi1.B2(str, "config_") && !a.yi1.B2(str, "cmd_")) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                a.zt0 zt0Var = (a.zt0) obj;
                a.wv.w(zt0Var, "$this$null");
                zt0Var.u("scenes", (java.util.HashMap) obj2);
                return no1Var;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                com.omarea.model.ChargeStatSession chargeStatSession = (com.omarea.model.ChargeStatSession) obj;
                a.wv.w(chargeStatSession, "it");
                com.omarea.vtools.activities.ActivityChargeStat activityChargeStat = (com.omarea.vtools.activities.ActivityChargeStat) obj2;
                activityChargeStat.r = chargeStatSession.session;
                activityChargeStat.q = false;
                activityChargeStat.o();
                return no1Var;
            case 5:
                a.vn1 vn1Var = (a.vn1) obj;
                a.wv.w(vn1Var, "node");
                java.lang.Object obj3 = vn1Var.e;
                a.mc1 mc1Var = obj3 instanceof a.mc1 ? (a.mc1) obj3 : null;
                if (mc1Var == null || (M1 = ((a.vd0) obj2).M1(mc1Var)) == null) {
                    return null;
                }
                java.lang.String D2 = a.yi1.D2(mc1Var.b, '.', "");
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String k = a.ai1.k(locale, "ROOT", D2, locale, "this as java.lang.String).toLowerCase(locale)");
                if (mc1Var.f343a || (!a.oe0.b.contains(k) && !a.oe0.c.contains(k))) {
                    z = false;
                }
                return new a.tn1(M1, z);
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                int intValue = ((java.lang.Number) obj).intValue();
                if (intValue != 0) {
                    return java.lang.String.valueOf(intValue);
                }
                java.lang.String string = ((com.omarea.vtools.activities.ActivityFreezeApps) obj2).getString(2131952381);
                a.wv.v(string, "getString(R.string.freezer_timeout_unlimited)");
                return string;
            case 7:
                a.x81 x81Var = (a.x81) obj;
                a.wv.w(x81Var, "it");
                int c = x81Var.c();
                if (c == 0) {
                    java.util.Iterator it = ((a.qg1) obj2).iterator();
                    while (it.hasNext()) {
                        ((android.view.View) it.next()).setVisibility(0);
                    }
                } else if (c == 1) {
                    for (android.view.View view : (a.qg1) obj2) {
                        view.setVisibility(a.wv.e(view.getTag(), "chart") ? 0 : 8);
                    }
                } else if (c == 2) {
                    for (android.view.View view2 : (a.qg1) obj2) {
                        view2.setVisibility(a.wv.e(view2.getTag(), "text") ? 0 : 8);
                    }
                }
                return no1Var;
            case 8:
                com.omarea.model.PowerStatSession powerStatSession = (com.omarea.model.PowerStatSession) obj;
                a.wv.w(powerStatSession, "it");
                com.omarea.vtools.activities.ActivityPowerStat activityPowerStat = (com.omarea.vtools.activities.ActivityPowerStat) obj2;
                activityPowerStat.A = powerStatSession.session;
                activityPowerStat.r();
                return no1Var;
            case 9:
                a.am1 am1Var = (a.am1) obj;
                a.wv.w(am1Var, "thread");
                a.rg0 rg0Var = (a.rg0) obj2;
                rg0Var.m = am1Var;
                rg0Var.l = true;
                rg0Var.f.setVisibility(8);
                rg0Var.g.setVisibility(0);
                rg0Var.e.setVisibility(0);
                rg0Var.h.setText("");
                java.lang.String str2 = am1Var.g;
                if (str2 == null) {
                    a.wv.M1("comm");
                    throw null;
                }
                rg0Var.d.setText(str2 + "\nTID " + am1Var.f19a);
                rg0Var.o = 250L;
                rg0Var.e();
                return no1Var;
            case 10:
                java.lang.String str3 = (java.lang.String) obj;
                a.wv.w(str3, "it");
                try {
                    java.lang.CharSequence loadLabel = ((android.content.pm.PackageManager) obj2).getApplicationInfo(str3, 0).loadLabel((android.content.pm.PackageManager) obj2);
                    a.wv.v(loadLabel, "{\n                pm.get…adLabel(pm)\n            }");
                    return loadLabel;
                } catch (java.lang.Exception unused) {
                    return str3;
                }
            case 11:
                return obj == ((a.e) obj2) ? "(this Collection)" : java.lang.String.valueOf(obj);
            case 12:
                java.lang.String str4 = (java.lang.String) obj;
                a.wv.w(str4, "it");
                ((java.util.ArrayList) obj2).add(str4);
                return no1Var;
            case 13:
                int intValue2 = ((java.lang.Number) obj).intValue();
                a.jy0 jy0Var = ((a.iy0) obj2).c;
                java.util.regex.Matcher matcher = jy0Var.f275a;
                int start = matcher.start(intValue2);
                int end = matcher.end(intValue2);
                a.ss0 qs0Var = end <= Integer.MIN_VALUE ? a.ss0.f : new a.qs0(start, end - 1, 1);
                if (java.lang.Integer.valueOf(qs0Var.c).intValue() < 0) {
                    return null;
                }
                java.lang.String group = jy0Var.f275a.group(intValue2);
                a.wv.v(group, "matchResult.group(index)");
                return new a.hy0(group, qs0Var);
            default:
                a.ss0 ss0Var = (a.ss0) obj;
                a.wv.w(ss0Var, "it");
                return a.yi1.C2((java.lang.CharSequence) obj2, ss0Var);
        }
    }
}
