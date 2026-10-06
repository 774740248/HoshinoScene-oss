package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ a.f60 h;
    public final /* synthetic */ a.b81 i;
    public final /* synthetic */ java.lang.String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(boolean z, a.f60 f60Var, a.b81 b81Var, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = z;
        this.h = f60Var;
        this.i = b81Var;
        this.j = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.w50(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        boolean z = this.g;
        a.b81 b81Var = this.i;
        a.f60 f60Var = this.h;
        if (z) {
            a.qo0 qo0Var = f60Var.f;
            if (qo0Var != null) {
                qo0Var.b();
            }
            b81Var.a();
            a.bp0 bp0Var = f60Var.c;
            if (bp0Var != null) {
                java.lang.String parent = new java.io.File(this.j).getParent();
                if (parent == null) {
                    parent = "/";
                }
                bp0Var.i(a.fs1.r(parent));
            }
        } else {
            a.qo0 qo0Var2 = f60Var.f;
            if (qo0Var2 != null) {
                qo0Var2.b();
            }
            b81Var.a();
            a.cp cpVar = com.omarea.Scene.c;
            a.ai1.o(f60Var.f145a, 2131952441, "activity.getString(R.string.fs_op_failed)", 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.w50 w50Var = (a.w50) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        w50Var.e(no1Var);
        return no1Var;
    }
}
