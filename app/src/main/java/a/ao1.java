package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ao1 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.jq g;
    public final /* synthetic */ android.content.SharedPreferences h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao1(a.jq jqVar, android.content.SharedPreferences sharedPreferences, a.ey eyVar) {
        super(2, eyVar);
        this.g = jqVar;
        this.h = sharedPreferences;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ao1(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.jq jqVar = this.g;
        java.lang.String o = jqVar.o();
        if (!a.wv.e((java.lang.String) jqVar.d, o)) {
            jqVar.d = o;
            android.content.SharedPreferences sharedPreferences = this.h;
            if (o == null || o.length() <= 0 || a.wv.e((java.lang.String) jqVar.d, "error")) {
                sharedPreferences.edit().remove((java.lang.String) jqVar.c).apply();
            } else {
                sharedPreferences.edit().putString((java.lang.String) jqVar.c, o).apply();
            }
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.ao1 ao1Var = (a.ao1) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        ao1Var.e(no1Var);
        return no1Var;
    }
}
