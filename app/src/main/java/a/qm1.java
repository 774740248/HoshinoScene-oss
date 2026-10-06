package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qm1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f472a;
    public final java.lang.String b;

    public qm1(int i) {
        this.f472a = i;
        if (i == 1) {
            this.b = "/sys/module/lowmemorykiller/parameters/minfree";
        } else if (i != 2) {
            this.b = "yyyy-MM-dd";
        } else {
            this.b = "JSONHelper";
        }
    }

    public static boolean b(java.lang.Object obj) {
        return obj instanceof a.lt0 ? a.lt0.c.equals(obj) : obj == null;
    }

    public static boolean c(java.lang.Class cls) {
        return (cls != null && (java.lang.Boolean.TYPE.isAssignableFrom(cls) || java.lang.Boolean.class.isAssignableFrom(cls))) || (cls != null && (java.lang.Byte.TYPE.isAssignableFrom(cls) || java.lang.Short.TYPE.isAssignableFrom(cls) || java.lang.Integer.TYPE.isAssignableFrom(cls) || java.lang.Long.TYPE.isAssignableFrom(cls) || java.lang.Float.TYPE.isAssignableFrom(cls) || java.lang.Double.TYPE.isAssignableFrom(cls) || java.lang.Number.class.isAssignableFrom(cls))) || (cls != null && (java.lang.String.class.isAssignableFrom(cls) || java.lang.Character.TYPE.isAssignableFrom(cls) || java.lang.Character.class.isAssignableFrom(cls)));
    }

    public static boolean d(long j) {
        java.util.Date date = new java.util.Date(j);
        java.util.Date date2 = new java.util.Date();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public static java.lang.Object e(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isInterface()) {
            try {
                return cls.newInstance();
            } catch (java.lang.Exception unused) {
                throw new java.lang.Exception("unknown class type: " + cls);
            }
        }
        if (cls.equals(java.util.Map.class)) {
            return new java.util.HashMap();
        }
        if (cls.equals(java.util.List.class)) {
            return new java.util.ArrayList();
        }
        if (cls.equals(java.util.Set.class)) {
            return new java.util.HashSet();
        }
        throw new java.lang.Exception("unknown interface: " + cls);
    }

    public static java.lang.Object f(a.lt0 lt0Var, java.lang.Class cls) {
        java.lang.Object e;
        if (cls == null || b(lt0Var) || (e = e(cls)) == null) {
            return null;
        }
        if (java.util.Map.class.isAssignableFrom(cls)) {
            try {
                java.util.Iterator i = lt0Var.i();
                java.util.Map map = (java.util.Map) e;
                while (i.hasNext()) {
                    java.lang.String str = (java.lang.String) i.next();
                    map.put(str, lt0Var.a(str));
                }
            } catch (a.kt0 e2) {
                e2.printStackTrace();
            }
        } else {
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                java.lang.String name = field.getName();
                java.lang.String str2 = (name == null || "".equals(name)) ? null : "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (str2.equals(declaredMethods[i2].getName())) {
                        try {
                            h(e, cls.getMethod(str2, field.getType()), field, lt0Var);
                            break;
                        } catch (java.lang.Exception e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        return e;
    }

    public static void g(java.lang.Object obj, java.lang.reflect.Method method, java.lang.String str, java.lang.Object obj2) {
        if (obj2 != null) {
            try {
                if (!"".equals(obj2)) {
                    if ("String".equals(str)) {
                        method.invoke(obj, obj2.toString());
                    } else if ("Date".equals(str)) {
                        method.invoke(obj, new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.CHINA).parse(obj2.toString()));
                    } else {
                        if (!"Integer".equals(str) && !"int".equals(str)) {
                            if ("Long".equalsIgnoreCase(str)) {
                                method.invoke(obj, java.lang.Long.valueOf(java.lang.Long.parseLong(obj2.toString())));
                            } else if ("Double".equalsIgnoreCase(str)) {
                                method.invoke(obj, java.lang.Double.valueOf(java.lang.Double.parseDouble(obj2.toString())));
                            } else if ("Boolean".equalsIgnoreCase(str)) {
                                method.invoke(obj, java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(obj2.toString())));
                            } else {
                                method.invoke(obj, obj2);
                                android.util.Log.e("JSONHelper", "JSONHelper>>>>setFiedlValue -> not supper type".concat(str));
                            }
                        }
                        method.invoke(obj, java.lang.Integer.valueOf(java.lang.Integer.parseInt(obj2.toString())));
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012e, code lost:
    
        if (java.util.List.class.isAssignableFrom(r1) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017 A[Catch: Exception -> 0x0062, TryCatch #2 {Exception -> 0x0062, blocks: (B:107:0x000b, B:6:0x0017, B:8:0x0025, B:9:0x0029, B:12:0x0031, B:15:0x0038, B:18:0x0047, B:21:0x0056, B:23:0x0053, B:30:0x0059, B:36:0x0069, B:38:0x006f, B:40:0x0077, B:42:0x007f, B:44:0x0082, B:45:0x0088, B:47:0x0092, B:48:0x0096, B:52:0x00a0, B:55:0x00a7, B:56:0x00ae, B:59:0x00b6, B:62:0x00c6, B:64:0x00c3, B:67:0x00c9, B:72:0x00d2, B:74:0x00d8, B:76:0x00e0, B:80:0x00ea, B:82:0x00f0, B:85:0x00f7, B:88:0x00fe, B:91:0x0107, B:93:0x0111, B:94:0x0114, B:96:0x011a, B:100:0x0128, B:104:0x0131, B:105:0x0138), top: B:106:0x000b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.reflect.Field r8, a.lt0 r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qm1.h(java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Field, a.lt0):void");
    }

    public final void a(long j) {
        float f = j > 8589934592L ? 2.0f : j > 6442450944L ? 1.5f : (j <= 4294967296L && j <= 3221225472L) ? j > 2147483648L ? 0.7f : j > 1073741824 ? 0.5f : j > 1073741824 ? 0.25f : 0.2f : 1.0f;
        a.nu0 nu0Var = a.nu0.f395a;
        a.nu0.l(this.b, ((int) (10240 * f)) + "," + ((int) (16384 * f)) + "," + ((int) (18432 * f)) + "," + ((int) (20480 * f)) + "," + ((int) (30720 * f)) + "," + ((int) (33280 * f)));
        a.nu0.l("/sys/module/lowmemorykiller/parameters/enable_adaptive_lmk", "0");
    }

    public final java.lang.String toString() {
        switch (this.f472a) {
            case 3:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public qm1(java.lang.String str) {
        this.f472a = 3;
        this.b = str;
    }
}
