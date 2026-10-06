package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class lt0 {
    public static final java.lang.Double b = java.lang.Double.valueOf(-0.0d);
    public static final a.fs1 c = new a.fs1(4);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f329a;

    public lt0() {
        this.f329a = new java.util.LinkedHashMap();
    }

    public static java.lang.Object q(java.lang.Object obj) {
        a.fs1 fs1Var = c;
        if (obj == null) {
            return fs1Var;
        }
        if ((obj instanceof a.jt0) || (obj instanceof a.lt0) || obj.equals(fs1Var)) {
            return obj;
        }
        if (obj instanceof java.util.Collection) {
            a.jt0 jt0Var = new a.jt0();
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                jt0Var.e(q(it.next()));
            }
            return jt0Var;
        }
        if (obj.getClass().isArray()) {
            return new a.jt0(obj);
        }
        if (obj instanceof java.util.Map) {
            return new a.lt0((java.util.Map) obj);
        }
        if (!(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public final java.lang.Object a(java.lang.String str) {
        java.lang.Object obj = this.f329a.get(str);
        if (obj != null) {
            return obj;
        }
        throw new java.lang.Exception(a.ai1.g("No value for ", str));
    }

    public final boolean b(java.lang.String str) {
        java.lang.Object a2 = a(str);
        java.lang.Boolean t1 = a.b20.t1(a2);
        if (t1 != null) {
            return t1.booleanValue();
        }
        a.b20.A1(str, a2, "boolean");
        throw null;
    }

    public final double c(java.lang.String str) {
        java.lang.Object a2 = a(str);
        java.lang.Double v1 = a.b20.v1(a2);
        if (v1 != null) {
            return v1.doubleValue();
        }
        a.b20.A1(str, a2, "double");
        throw null;
    }

    public final int d(java.lang.String str) {
        java.lang.Object a2 = a(str);
        java.lang.Integer w1 = a.b20.w1(a2);
        if (w1 != null) {
            return w1.intValue();
        }
        a.b20.A1(str, a2, "int");
        throw null;
    }

    public final a.jt0 e(java.lang.String str) {
        java.lang.Object a2 = a(str);
        if (a2 instanceof a.jt0) {
            return (a.jt0) a2;
        }
        a.b20.A1(str, a2, "JSONArray");
        throw null;
    }

    public final a.lt0 f(java.lang.String str) {
        java.lang.Object a2 = a(str);
        if (a2 instanceof a.lt0) {
            return (a.lt0) a2;
        }
        a.b20.A1(str, a2, "JSONObject");
        throw null;
    }

    public final long g(java.lang.String str) {
        java.lang.Object a2 = a(str);
        java.lang.Long x1 = a.b20.x1(a2);
        if (x1 != null) {
            return x1.longValue();
        }
        a.b20.A1(str, a2, "long");
        throw null;
    }

    public final java.lang.String h(java.lang.String str) {
        java.lang.Object a2 = a(str);
        return a2 instanceof java.lang.String ? (java.lang.String) a2 : java.lang.String.valueOf(a2);
    }

    public final java.util.Iterator i() {
        return this.f329a.keySet().iterator();
    }

    public final int j(java.lang.String str, int i) {
        java.lang.Integer w1 = a.b20.w1(this.f329a.get(str));
        return w1 != null ? w1.intValue() : i;
    }

    public final long k(java.lang.String str) {
        java.lang.Long x1 = a.b20.x1(this.f329a.get(str));
        if (x1 != null) {
            return x1.longValue();
        }
        return 0L;
    }

    public final java.lang.String l(java.lang.String str) {
        java.lang.Object obj = this.f329a.get(str);
        java.lang.String valueOf = obj instanceof java.lang.String ? (java.lang.String) obj : obj != null ? java.lang.String.valueOf(obj) : null;
        return valueOf != null ? valueOf : "";
    }

    public final void m(java.lang.Object obj, java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = this.f329a;
        if (obj == null) {
            linkedHashMap.remove(str);
            return;
        }
        if (obj instanceof java.lang.Number) {
            a.b20.s(((java.lang.Number) obj).doubleValue());
        }
        if (str == null) {
            throw new java.lang.Exception("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
    }

    public final void n(java.lang.String str, int i) {
        this.f329a.put(str, java.lang.Integer.valueOf(i));
    }

    public final void o(java.lang.String str, boolean z) {
        this.f329a.put(str, java.lang.Boolean.valueOf(z));
    }

    public final java.lang.String p(int i) {
        a.nk nkVar = new a.nk(i);
        r(nkVar);
        return nkVar.toString();
    }

    public final void r(a.nk nkVar) {
        a.mt0 mt0Var = a.mt0.e;
        nkVar.I(mt0Var, "{");
        java.util.Iterator it = this.f329a.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a.mt0 mt0Var2 = a.mt0.g;
            if (!hasNext) {
                nkVar.d(mt0Var, mt0Var2, "}");
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            if (str == null) {
                throw new java.lang.Exception("Names must be non-null");
            }
            a.mt0 J = nkVar.J();
            if (J == mt0Var2) {
                ((java.lang.StringBuilder) nkVar.d).append(',');
            } else if (J != mt0Var) {
                throw new java.lang.Exception("Nesting problem");
            }
            nkVar.F();
            a.mt0 mt0Var3 = a.mt0.f;
            ((java.util.List) nkVar.e).set(e.size() - 1, mt0Var3);
            nkVar.T(str);
            nkVar.W(entry.getValue());
        }
    }

    public final java.lang.String toString() {
        try {
            a.nk nkVar = new a.nk(6, 0);
            r(nkVar);
            return nkVar.toString();
        } catch (a.kt0 unused) {
            return null;
        }
    }

    public lt0(java.util.Map map) {
        this();
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (str != null) {
                this.f329a.put(str, q(entry.getValue()));
            } else {
                throw new java.lang.NullPointerException("key == null");
            }
        }
    }

    public lt0(java.lang.String str) {
        java.lang.Object c2 = new a.tk(str).c();
        if (c2 instanceof a.lt0) {
            this.f329a = ((a.lt0) c2).f329a;
        } else {
            a.b20.B1(c2, "JSONObject");
            throw null;
        }
    }
}
