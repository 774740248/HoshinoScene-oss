package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public abstract class iq implements a.ey, a.ez, java.io.Serializable {
    public final a.ey c;

    public iq(a.ey eyVar) {
        this.c = eyVar;
    }

    public a.ey a(java.lang.Object obj, a.ey eyVar) {
        a.wv.w(eyVar, "completion");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final java.lang.StackTraceElement c() {
        int i;
        java.lang.String str;
        a.a20 a20Var = (a.a20) getClass().getAnnotation(a.a20.class);
        java.lang.String str2 = null;
        if (a20Var == null) {
            return null;
        }
        int v = a20Var.v();
        if (v > 1) {
            throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? a20Var.l()[i] : -1;
        a.hg1 hg1Var = a.b20.l;
        a.hg1 hg1Var2 = a.b20.k;
        if (hg1Var == null) {
            try {
                a.hg1 hg1Var3 = new a.hg1(java.lang.Class.class.getDeclaredMethod("getModule", new java.lang.Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new java.lang.Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new java.lang.Class[0]));
                a.b20.l = hg1Var3;
                hg1Var = hg1Var3;
            } catch (java.lang.Exception unused2) {
                a.b20.l = hg1Var2;
                hg1Var = hg1Var2;
            }
        }
        if (hg1Var != hg1Var2) {
            java.lang.reflect.Method method = hg1Var.f203a;
            java.lang.Object invoke = method != null ? method.invoke(getClass(), new java.lang.Object[0]) : null;
            if (invoke != null) {
                java.lang.reflect.Method method2 = hg1Var.b;
                java.lang.Object invoke2 = method2 != null ? method2.invoke(invoke, new java.lang.Object[0]) : null;
                if (invoke2 != null) {
                    java.lang.reflect.Method method3 = hg1Var.c;
                    java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, new java.lang.Object[0]) : null;
                    if (invoke3 instanceof java.lang.String) {
                        str2 = (java.lang.String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = a20Var.c();
        } else {
            str = str2 + '/' + a20Var.c();
        }
        return new java.lang.StackTraceElement(str, a20Var.m(), a20Var.f(), i2);
    }

    public abstract java.lang.Object e(java.lang.Object obj);

    @Override // a.ez
    public final a.ez f() {
        a.ey eyVar = this.c;
        if (eyVar instanceof a.ez) {
            return (a.ez) eyVar;
        }
        return null;
    }

    @Override // a.ey
    public final void j(java.lang.Object obj) {
        a.ey eyVar = this;
        while (true) {
            a.iq iqVar = (a.iq) eyVar;
            a.ey eyVar2 = iqVar.c;
            a.wv.s(eyVar2);
            try {
                obj = iqVar.e(obj);
                if (obj == a.dz.c) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = a.b20.I(th);
            }
            iqVar.k();
            if (!(eyVar2 instanceof a.iq)) {
                eyVar2.j(obj);
                return;
            }
            eyVar = eyVar2;
        }
    }

    public void k() {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object c = c();
        if (c == null) {
            c = getClass().getName();
        }
        sb.append(c);
        return sb.toString();
    }
}
