package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o70 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.lang.Boolean g;
    public final /* synthetic */ android.widget.Button h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(java.lang.Boolean bool, android.widget.Button button, a.ey eyVar) {
        super(2, eyVar);
        this.g = bool;
        this.h = button;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.o70(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.lang.Boolean bool = this.g;
        a.wv.v(bool, "result");
        boolean booleanValue = bool.booleanValue();
        android.widget.Button button = this.h;
        if (booleanValue) {
            button.setText(2131953660);
        } else {
            button.setText(2131953661);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.o70 o70Var = (a.o70) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        o70Var.e(no1Var);
        return no1Var;
    }
}
