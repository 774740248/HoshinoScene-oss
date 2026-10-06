package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class en1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f130a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;
    public java.io.Serializable f;
    public java.lang.Object g;

    public en1() {
        this.f130a = "/sys/class/thermal/thermal_message/board_sensor_temp";
        this.b = "/sys/kernel/thermal/ttj";
        this.c = "/sys/class/thermal/thermal_message/dynamic_tj";
        this.d = "/sys/devices/virtual/xr_thermal/lpc/throttle";
        this.e = new java.lang.String[]{"/sys/kernel/thermal/ttj", "/sys/class/thermal/thermal_message/dynamic_tj", "/sys/devices/virtual/xr_thermal/lpc/throttle"};
        this.f = new a.vj1(new a.cd1(2, this));
        this.g = "vtools.thermal.disguise";
    }

    public final void a(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (e(str)) {
            return;
        }
        j(str);
        i(str);
        if (((java.lang.String) this.g).length() == 0) {
            this.g = a.ii1.f((java.lang.String) this.d, "=", str);
        } else {
            this.g = a.ii1.f((java.lang.String) this.g, ",", str);
        }
        g();
    }

    public final void b(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (f((java.lang.String) this.e, str) || e(str)) {
            return;
        }
        if (((java.lang.String) this.e).length() == 0) {
            this.e = a.ii1.f((java.lang.String) this.b, "=", str);
        } else {
            this.e = a.ii1.f((java.lang.String) this.e, ",", str);
        }
        g();
    }

    public final void c(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (f((java.lang.String) this.f, str) || e(str)) {
            return;
        }
        if (((java.lang.String) this.f).length() == 0) {
            this.f = a.ii1.f((java.lang.String) this.c, "=", str);
        } else {
            this.f = a.ii1.f((java.lang.String) this.f, ",", str);
        }
        g();
    }

    public final boolean d() {
        java.lang.String property;
        java.lang.Integer c2;
        java.lang.Integer c22;
        a.nu0 nu0Var = a.nu0.f395a;
        a.y31 a2 = a.nu0.a((java.lang.String[]) this.e);
        java.lang.String str = "";
        if (a2 == null) {
            java.lang.String str2 = (java.lang.String) this.g;
            a.wv.w(str2, "prop");
            try {
                property = java.lang.System.getProperty(str2);
            } catch (java.lang.Exception unused) {
            }
            if (property != null && property.length() != 0) {
                str = a.yi1.G2(property).toString();
                return a.wv.e(str, "1");
            }
            a.q10 q10Var = a.q10.f457a;
            java.lang.String L = a.q10.L("get-prop", str2, null);
            if (!a.wv.e(L, "error")) {
                str = a.yi1.G2(L).toString();
            }
            return a.wv.e(str, "1");
        }
        java.lang.String str3 = (java.lang.String) this.b;
        java.lang.Object obj = a2.c;
        boolean e = a.wv.e(obj, str3);
        java.lang.Object obj2 = a2.d;
        if (e) {
            java.lang.String str4 = (java.lang.String) a.qv.g2(a.yi1.y2(a.yi1.v2((java.lang.String) obj2, ",", ""), new java.lang.String[]{" "}));
            int intValue = (str4 == null || (c22 = a.wi1.c2(str4)) == null) ? 0 : c22.intValue();
            return intValue > 95000 && intValue < 666666666;
        }
        if (a.wv.e(obj, (java.lang.String) this.c)) {
            return ((java.lang.String) obj2).length() == 7;
        }
        if (a.wv.e(obj, (java.lang.String) this.d)) {
            java.lang.Integer c23 = a.wi1.c2((java.lang.String) obj2);
            return c23 != null && c23.intValue() > 95;
        }
        java.lang.String str5 = (java.lang.String) a.qv.g2(a.yi1.y2(a.yi1.v2(a.nu0.d(str3), ",", ""), new java.lang.String[]{" "}));
        return (str5 == null || (c2 = a.wi1.c2(str5)) == null || c2.intValue() <= 95000) ? false : true;
    }

    public final boolean e(java.lang.String str) {
        a.wv.w(str, "packageName");
        return f((java.lang.String) this.g, str);
    }

    public final boolean f(java.lang.String str, java.lang.String str2) {
        if (a.yi1.g2(str, "-" + str2)) {
            return false;
        }
        if (a.yi1.g2(str, str2)) {
            return true;
        }
        java.lang.String str3 = (java.lang.String) this.c;
        if (a.yi1.g2(str, str3 + "=*")) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str3);
        sb.append("=apps");
        return a.yi1.g2(str, sb.toString());
    }

    public final boolean g() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (((java.lang.String) this.f).length() != 0) {
            sb.append((java.lang.String) this.f);
        }
        if (((java.lang.String) this.e).length() != 0) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append((java.lang.String) this.e);
        }
        if (((java.lang.String) this.g).length() != 0) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append((java.lang.String) this.g);
        }
        return android.provider.Settings.Global.putString((android.content.ContentResolver) this.f130a, "policy_control", sb.toString());
    }

    public final void h(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (e(str)) {
            java.lang.String str2 = (java.lang.String) this.g;
            java.lang.String str3 = (java.lang.String) this.d;
            if (!a.yi1.g2(str2, str3 + "=*")) {
                if (!a.yi1.g2((java.lang.String) this.f, str3 + "=apps")) {
                    if (a.yi1.g2((java.lang.String) this.g, str)) {
                        this.g = a.yi1.v2(a.yi1.v2((java.lang.String) this.g, ",".concat(str), ""), str, "");
                    }
                    g();
                }
            }
            this.g = a.ii1.f((java.lang.String) this.g, ",-", str);
            g();
        }
    }

    public final void i(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (f((java.lang.String) this.e, str) || e(str)) {
            if (e(str)) {
                h(str);
                c(str);
            }
            java.lang.String str2 = (java.lang.String) this.e;
            java.lang.String str3 = (java.lang.String) this.b;
            if (!a.yi1.g2(str2, str3 + "=*")) {
                if (!a.yi1.g2((java.lang.String) this.e, str3 + "=apps")) {
                    if (a.yi1.g2((java.lang.String) this.e, str)) {
                        this.e = a.yi1.v2(a.yi1.v2((java.lang.String) this.e, ",".concat(str), ""), str, "");
                    }
                    g();
                }
            }
            this.e = a.ii1.f((java.lang.String) this.e, ",-", str);
            g();
        }
    }

    public final void j(java.lang.String str) {
        a.wv.w(str, "packageName");
        if (f((java.lang.String) this.f, str) || e(str)) {
            if (e(str)) {
                h(str);
                b(str);
            }
            java.lang.String str2 = (java.lang.String) this.f;
            java.lang.String str3 = (java.lang.String) this.c;
            if (!a.yi1.g2(str2, str3 + "=*")) {
                if (!a.yi1.g2((java.lang.String) this.f, str3 + "=apps")) {
                    if (a.yi1.g2((java.lang.String) this.f, str)) {
                        this.f = a.yi1.v2(a.yi1.v2((java.lang.String) this.f, ",".concat(str), ""), str, "");
                    }
                    g();
                }
            }
            this.f = a.ii1.f((java.lang.String) this.f, ",-", str);
            g();
        }
    }

    public en1(android.content.ContentResolver contentResolver) {
        this.f130a = contentResolver;
        this.b = "immersive.navigation";
        this.c = "immersive.status";
        this.d = "immersive.full";
        this.e = "";
        this.f = "";
        this.g = "";
        java.lang.String string = android.provider.Settings.Global.getString(contentResolver, "policy_control");
        if (string != null) {
            for (java.lang.String str : (Iterable<java.lang.String>) a.yi1.y2(string, new java.lang.String[]{":"})) {
                if (a.yi1.B2(str, "immersive.full")) {
                    this.g = str;
                } else if (a.yi1.B2(str, "immersive.navigation")) {
                    this.e = str;
                } else if (a.yi1.B2(str, "immersive.status")) {
                    this.f = str;
                }
            }
        }
    }

    public en1(a.kk0 kk0Var) {
        this.f130a = kk0Var;
        this.b = "features/refresh_rate.conf";
        this.c = "features/bypass_power.conf";
        this.d = "features/limiter.conf";
        this.e = "features/fas.conf";
        this.f = "features/cpuset.conf";
        this.g = new a.wc0();
    }
}
