package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m50 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ a.f60 h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ java.util.ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(a.w60 w60Var, a.f60 f60Var, java.lang.String str, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = f60Var;
        this.i = str;
        this.j = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.m50(this.g, this.h, this.i, this.j, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.w60 w60Var = this.g;
        w60Var.a();
        a.f60 f60Var = this.h;
        a.bp0 bp0Var = f60Var.c;
        if (bp0Var != null) {
            bp0Var.i(a.fs1.r(this.i));
        }
        boolean z = !this.j.isEmpty();
        a.ml mlVar = f60Var.f145a;
        if (z) {
            int i = a.x60.f681a;
            java.lang.String string = mlVar.getString(2131952388);
            a.wv.v(string, "activity.getString(R.string.fs_batch_copy_failed)");
            a.fs1.Z(mlVar, string, a.qv.j2(this.j, "\n", null, null, null, 62), new a.xa(f60Var, 14, w60Var), null, 16);
        } else {
            a.qo0 qo0Var = f60Var.f;
            if (qo0Var != null) {
                qo0Var.b();
            }
            w60Var.a();
            a.cp cpVar = com.omarea.Scene.c;
            a.ai1.o(mlVar, 2131952440, "activity.getString(R.string.fs_op_done)", 0);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.m50 m50Var = (a.m50) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        m50Var.e(no1Var);
        return no1Var;
    }
}
