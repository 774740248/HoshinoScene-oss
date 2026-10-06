package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vj1 implements a.yu0, java.io.Serializable {
    public a.qo0 c;
    public volatile java.lang.Object d = a.gy.i;
    public final java.lang.Object e = this;

    public vj1(a.qo0 qo0Var) {
        this.c = qo0Var;
    }

    public final java.lang.Object a() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.d;
        a.gy gyVar = a.gy.i;
        if (obj2 != gyVar) {
            return obj2;
        }
        synchronized (this.e) {
            obj = this.d;
            if (obj == gyVar) {
                a.qo0 qo0Var = this.c;
                a.wv.s(qo0Var);
                obj = qo0Var.b();
                this.d = obj;
                this.c = null;
            }
        }
        return obj;
    }

    public final java.lang.String toString() {
        return this.d != a.gy.i ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
