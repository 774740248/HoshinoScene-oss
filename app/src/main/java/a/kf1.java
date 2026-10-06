package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class kf1 extends a.qr0 {
    public final android.content.Context e;

    public kf1(android.content.Context context) {
        a.wv.w(context, "context");
        this.e = context;
    }

    public static a.lt0 n() {
        a.q10 q10Var = a.q10.f457a;
        a.lt0 p = a.q10.p(1000L, "device-id", "");
        if (p != null) {
            p.m(android.os.Build.MODEL, "product_model");
            p.m(android.os.Build.PRODUCT, "product_name");
            p.m(android.os.Build.BRAND, "product_brand");
            p.m(android.os.Build.MANUFACTURER, "product_manufacturer");
            p.m(android.os.Build.DEVICE, "product_device");
            p.m(a.gy.u(), "machine");
        }
        return p;
    }

    public static java.lang.String r(java.lang.String str) {
        a.wv.w(str, "password");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            a.wv.v(messageDigest, "getInstance(\"MD5\")");
            byte[] bytes = str.getBytes(a.bu.f53a);
            a.wv.v(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            a.wv.v(digest, "instance.digest(password.toByteArray())");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b : digest) {
                java.lang.String hexString = java.lang.Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            java.lang.String stringBuffer2 = stringBuffer.toString();
            a.wv.v(stringBuffer2, "sb.toString()");
            return stringBuffer2;
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public final java.util.concurrent.FutureTask m(java.lang.String str) {
        a.wv.w(str, "uid");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new a.or0(this, str, "", 1));
        a.wv.M0(a.wv.b(a.z80.b), null, new a.ef1(futureTask, null), 3);
        return futureTask;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [a.be1, a.qr0] */
    public final com.omarea.model.ActivationCodeResponse o() {
        a.lt0 n = n();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String n2 = a.q10.n();
        long time = new java.util.Date().getTime();
        java.lang.Object obj = null;
        if (n != null) {
            a.lt0 lt0Var = new a.lt0();
            lt0Var.m(n, "device");
            java.util.Locale p = p();
            if (p != null) {
                lt0Var.m(p.getLanguage(), "locale");
            }
            if (n2 != null) {
                lt0Var.m(n2, "scene_version");
            }
            lt0Var.f329a.put("request_time", java.lang.Long.valueOf(time));
            java.lang.String i = i(a.tg1.i() + "/release-activate2?t=" + time, lt0Var, 5L);
            if (i != null) {
                java.lang.String f = f(i);
                new com.omarea.model.ActivationCodeResponse();
                if (f.length() != 0) {
                    a.lt0 lt0Var2 = new a.lt0(f);
                    if (!a.qm1.b(lt0Var2)) {
                        obj = a.qm1.f(lt0Var2, com.omarea.model.ActivationCodeResponse.class);
                    }
                }
                com.omarea.model.ActivationCodeResponse activationCodeResponse = (com.omarea.model.ActivationCodeResponse) obj;
                activationCodeResponse.setDetail(f);
                return activationCodeResponse;
            }
            new a.qr0().m(true);
        }
        return null;
    }

    public final java.util.Locale p() {
        return this.e.getResources().getConfiguration().getLocales().get(0);
    }

    public final com.omarea.model.LoginResponse q(java.lang.String str, java.lang.String str2) {
        a.wv.w(str, "uid");
        a.wv.w(str2, "password");
        a.lt0 n = n();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String n2 = a.q10.n();
        if (n == null) {
            com.omarea.model.LoginResponse loginResponse = new com.omarea.model.LoginResponse();
            loginResponse.setError("无法获取设备标识");
            return loginResponse;
        }
        long time = new java.util.Date().getTime();
        java.lang.String str3 = a.tg1.i() + "/account-bind?t=" + time;
        a.lt0 lt0Var = new a.lt0();
        java.util.Locale p = p();
        if (p != null) {
            lt0Var.m(p.getLanguage(), "locale");
        }
        if (n2 != null) {
            lt0Var.m(n2, "scene_version");
        }
        lt0Var.m(str, "uid");
        lt0Var.m(r(str2), "password");
        lt0Var.m(n, "device_info");
        lt0Var.f329a.put("request_time", java.lang.Long.valueOf(time));
        a.lt0 h = a.qr0.h(this, str3, lt0Var);
        if (h != null) {
            try {
                new com.omarea.model.LoginResponse();
                com.omarea.model.LoginResponse f = (com.omarea.model.LoginResponse) a.qm1.f(h, com.omarea.model.LoginResponse.class);
                java.lang.String lt0Var2 = h.toString();
                a.wv.v(lt0Var2, "response.toString()");
                ((com.omarea.model.LoginResponse) f).setDetail(lt0Var2);
                return (com.omarea.model.LoginResponse) f;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }
}
