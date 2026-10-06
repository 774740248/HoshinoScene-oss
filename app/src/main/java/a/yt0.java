package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class yt0 extends a.jt0 {
    public yt0(a.bp0... bp0VarArr) {
        a.wv.w(bp0VarArr, "items");
        for (a.bp0 bp0Var : bp0VarArr) {
            a.lt0 lt0Var = new a.lt0();
            bp0Var.i(lt0Var);
            e(lt0Var);
        }
    }

    public yt0(java.lang.Object... objArr) {
        a.wv.w(objArr, "items");
        for (java.lang.Object obj : objArr) {
            if (!(obj instanceof a.np0)) {
                e(obj);
            } else {
                throw new java.lang.Exception(this + " 函数不能作为数据，请避免将 json{ ... } 写成 { ... }");
            }
        }
    }
}
