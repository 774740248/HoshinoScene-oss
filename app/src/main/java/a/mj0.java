package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mj0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ android.widget.EditText g;
    public final /* synthetic */ java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(android.widget.EditText editText, java.lang.String str, a.ey eyVar) {
        super(2, eyVar);
        this.g = editText;
        this.h = str;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.mj0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.setText(this.h);
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.mj0 mj0Var = (a.mj0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        mj0Var.e(no1Var);
        return no1Var;
    }
}
