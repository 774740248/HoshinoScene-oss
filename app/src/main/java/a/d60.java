package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class d60 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ a.f60 h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(a.w60 w60Var, a.f60 f60Var, boolean z, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = f60Var;
        this.i = z;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.d60(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        a.f60 f60Var = this.h;
        a.qo0 qo0Var = f60Var.b;
        if (qo0Var != null) {
            qo0Var.b();
        }
        a.ml mlVar = f60Var.f145a;
        if (this.i) {
            a.cp cpVar = com.omarea.Scene.c;
            a.ai1.o(mlVar, 2131952396, "activity.getString(R.string.fs_compress_done)", 0);
        } else {
            a.cp cpVar2 = com.omarea.Scene.c;
            a.ai1.o(mlVar, 2131952441, "activity.getString(R.string.fs_op_failed)", 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.d60 d60Var = (a.d60) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        d60Var.e(no1Var);
        return no1Var;
    }
}
