package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public class jt0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f269a;

    public jt0() {
        this.f269a = new java.util.ArrayList();
    }

    public final java.lang.Object a(int i) {
        java.util.List list = this.f269a;
        try {
            java.lang.Object obj = list.get(i);
            if (obj != null) {
                return obj;
            }
            throw new java.lang.Exception("Value at " + i + " is null.");
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.Exception("Index " + i + " out of range [0.." + list.size() + ")", e);
        }
    }

    public final int b(int i) {
        java.lang.Object a2 = a(i);
        java.lang.Integer w1 = a.b20.w1(a2);
        if (w1 != null) {
            return w1.intValue();
        }
        a.b20.A1(java.lang.Integer.valueOf(i), a2, "int");
        throw null;
    }

    public final a.lt0 c(int i) {
        java.lang.Object a2 = a(i);
        if (a2 instanceof a.lt0) {
            return (a.lt0) a2;
        }
        a.b20.A1(java.lang.Integer.valueOf(i), a2, "JSONObject");
        throw null;
    }

    public final java.lang.String d(int i) {
        java.lang.Object a2 = a(i);
        return a2 instanceof java.lang.String ? (java.lang.String) a2 : java.lang.String.valueOf(a2);
    }

    public final void e(java.lang.Object obj) {
        this.f269a.add(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof a.jt0) && ((a.jt0) obj).f269a.equals(this.f269a);
    }

    public final void f(a.nk nkVar) {
        a.mt0 mt0Var = a.mt0.c;
        nkVar.I(mt0Var, "[");
        java.util.Iterator it = this.f269a.iterator();
        while (it.hasNext()) {
            nkVar.W(it.next());
        }
        nkVar.d(mt0Var, a.mt0.d, "]");
    }

    public final int hashCode() {
        return this.f269a.hashCode();
    }

    public final java.lang.String toString() {
        try {
            a.nk nkVar = new a.nk(6, 0);
            f(nkVar);
            return nkVar.toString();
        } catch (a.kt0 unused) {
            return null;
        }
    }

    public jt0(java.lang.String str) {
        java.lang.Object c = new a.tk(str).c();
        if (c instanceof a.jt0) {
            this.f269a = ((a.jt0) c).f269a;
        } else {
            a.b20.B1(c, "JSONArray");
            throw null;
        }
    }

    public jt0(java.lang.Object obj) {
        if (obj.getClass().isArray()) {
            int length = java.lang.reflect.Array.getLength(obj);
            this.f269a = new java.util.ArrayList(length);
            for (int i = 0; i < length; i++) {
                e(a.lt0.q(java.lang.reflect.Array.get(obj, i)));
            }
            return;
        }
        throw new java.lang.Exception("Not a primitive array: " + obj.getClass());
    }
}
