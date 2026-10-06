package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zt0 extends a.lt0 {
    public zt0(a.bp0 bp0Var) {
        bp0Var.i(this);
    }

    public final void s(java.lang.String str, a.bp0 bp0Var) {
        a.lt0 lt0Var = new a.lt0();
        bp0Var.i(lt0Var);
        m(lt0Var, str);
    }

    public final void t(java.lang.String str, java.util.Collection collection) {
        a.wv.w(collection, "values");
        a.jt0 jt0Var = new a.jt0();
        for (java.lang.Object obj : collection) {
            if (obj instanceof a.np0) {
                throw new java.lang.Exception(jt0Var + " 函数不能作为数据，请避免将 json{ ... } 写成 { ... }");
            }
            jt0Var.e(obj);
        }
        m(jt0Var, str);
    }

    public final void u(java.lang.String str, java.util.HashMap hashMap) {
        a.wv.w(hashMap, "values");
        a.lt0 lt0Var = new a.lt0();
        for (java.util.Map.Entry entry : (Iterable<java.util.Map.Entry>) hashMap.entrySet()) {
            if (entry.getValue() instanceof a.np0) {
                throw new java.lang.Exception(lt0Var + " 函数不能作为数据，请避免将 json{ ... } 写成 { ... }");
            }
            lt0Var.m(entry.getValue(), (java.lang.String) entry.getKey());
        }
        m(lt0Var, str);
    }

    public final void v(java.lang.String str, java.lang.Object[] objArr) {
        a.wv.w(objArr, "values");
        a.jt0 jt0Var = new a.jt0();
        for (java.lang.Object obj : objArr) {
            if (obj instanceof a.np0) {
                throw new java.lang.Exception(jt0Var + " 函数不能作为数据，请避免将 json{ ... } 写成 { ... }");
            }
            jt0Var.e(obj);
        }
        m(jt0Var, str);
    }

    public final void w(a.bp0[] bp0VarArr) {
        m(new a.yt0((a.bp0[]) java.util.Arrays.copyOf(bp0VarArr, bp0VarArr.length)), "items");
    }
}
