package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m11 {
    public static long c;
    public static a.h11 d;

    /* renamed from: a, reason: collision with root package name */
    public final a.em1 f336a = new a.em1();
    public final a.vj1 b = new a.vj1(a.kr.g);

    public static a.h11 a() {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("adb-monitor-full", "", null);
        if (a.wv.e(L, "error") || L.length() <= 0) {
            return null;
        }
        a.lt0 lt0Var = new a.lt0(L);
        a.h11 h11Var = new a.h11();
        h11Var.f278a = a.b20.X(lt0Var);
        h11Var.g = a.b20.c0(lt0Var, "cpu_cycles");
        h11Var.b = a.b20.c0(lt0Var, "cpu_freq");
        h11Var.c = lt0Var.d("gpu_freq") / 1000;
        h11Var.d = lt0Var.d("gpu_load");
        h11Var.f = lt0Var.d("ddr_freq");
        double d2 = 10;
        h11Var.h = ((int) (lt0Var.c("cpu_temp") * d2)) / 10.0d;
        h11Var.e = ((int) (lt0Var.c("fps") * d2)) / 10.0d;
        c = elapsedRealtime;
        d = h11Var;
        return h11Var;
    }

    public static a.k11 b() {
        a.h11 h11Var;
        if (android.os.SystemClock.elapsedRealtime() - c < 500 && (h11Var = d) != null) {
            return h11Var;
        }
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("adb-monitor-min", "", null);
        if (a.wv.e(L, "error")) {
            return null;
        }
        a.lt0 lt0Var = new a.lt0(L);
        a.k11 k11Var = new a.k11();
        k11Var.f278a = a.b20.X(lt0Var);
        k11Var.b = a.b20.c0(lt0Var, "cpu_freq");
        k11Var.c = lt0Var.d("gpu_freq") / 1000;
        k11Var.d = lt0Var.d("gpu_load");
        k11Var.e = ((int) (lt0Var.c("fps") * 10)) / 10.0d;
        return k11Var;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [a.e11, java.lang.Object] */
    public static a.e11[] c() {
        java.lang.Integer c2;
        java.lang.Integer c22;
        java.lang.Integer c23;
        java.lang.Integer c24;
        java.lang.Integer c25;
        java.lang.Integer c26;
        java.lang.Integer c27;
        java.lang.Integer c28;
        a.q10 q10Var = a.q10.f457a;
        java.lang.String L = a.q10.L("perf-mem", "", null);
        if (a.wv.e(L, "error") || L.length() <= 0) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = a.yi1.z2(L, new char[]{'\n'}).iterator();
            boolean z = false;
            while (it.hasNext()) {
                java.lang.String obj = a.yi1.F2((java.lang.String) it.next()).toString();
                if (obj.length() != 0) {
                    if (z) {
                        java.util.List z2 = a.yi1.z2(obj, new char[]{','});
                        a.e11 obj2 = new a.e11();
                        java.lang.String str = (java.lang.String) a.qv.h2(z2, 0);
                        obj2.f115a = (str == null || (c28 = a.wi1.c2(str)) == null) ? 0 : c28.intValue();
                        java.lang.String str2 = (java.lang.String) a.qv.h2(z2, 1);
                        obj2.b = (str2 == null || (c27 = a.wi1.c2(str2)) == null) ? 0 : c27.intValue();
                        java.lang.String str3 = (java.lang.String) a.qv.h2(z2, 2);
                        obj2.c = (str3 == null || (c26 = a.wi1.c2(str3)) == null) ? 0 : c26.intValue();
                        java.lang.String str4 = (java.lang.String) a.qv.h2(z2, 3);
                        obj2.d = (str4 == null || (c25 = a.wi1.c2(str4)) == null) ? 0 : c25.intValue();
                        java.lang.String str5 = (java.lang.String) a.qv.h2(z2, 4);
                        obj2.e = (str5 == null || (c24 = a.wi1.c2(str5)) == null) ? 0 : c24.intValue();
                        java.lang.String str6 = (java.lang.String) a.qv.h2(z2, 5);
                        obj2.f = (str6 == null || (c23 = a.wi1.c2(str6)) == null) ? 0 : c23.intValue();
                        java.lang.String str7 = (java.lang.String) a.qv.h2(z2, 6);
                        obj2.g = (str7 == null || (c22 = a.wi1.c2(str7)) == null) ? 0 : c22.intValue();
                        java.lang.String str8 = (java.lang.String) a.qv.h2(z2, 7);
                        obj2.h = (str8 == null || (c2 = a.wi1.c2(str8)) == null) ? 0 : c2.intValue();
                        arrayList.add(obj2);
                    } else {
                        z = true;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (a.e11[]) arrayList.toArray(new a.e11[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
