package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sj0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.EditText g;
    public final /* synthetic */ double h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(android.widget.EditText editText, double d, a.ey eyVar) {
        super(2, eyVar);
        this.g = editText;
        this.h = d;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sj0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.setText(java.lang.String.valueOf(this.h));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sj0 sj0Var = (a.sj0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        sj0Var.e(no1Var);
        return no1Var;
    }
}
