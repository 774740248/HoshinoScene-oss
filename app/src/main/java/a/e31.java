package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class e31 implements a.ys {
    public final a.a31 c;
    public final /* synthetic */ androidx.activity.a d;

    public e31(androidx.activity.a aVar, a.a31 a31Var) {
        this.d = aVar;
        this.c = a31Var;
    }

    @Override // a.ys
    public final void cancel() {
        androidx.activity.a aVar = this.d;
        java.util.ArrayDeque arrayDeque = aVar.b;
        a.a31 a31Var = this.c;
        arrayDeque.remove(a31Var);
        a31Var.b.remove(this);
        if (a.es.a()) {
            a31Var.c = null;
            aVar.c();
        }
    }
}
