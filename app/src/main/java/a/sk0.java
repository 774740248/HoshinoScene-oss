package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class sk0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ a.vk0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk0(a.w60 w60Var, a.vk0 vk0Var, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = vk0Var;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.sk0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        a.fa0 fa0Var = a.vk0.g0;
        a.vk0 vk0Var = this.h;
        android.widget.ListView T = vk0Var.T();
        java.util.ArrayList S = vk0Var.S();
        if (S != null) {
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.L(new a.ua0(vk0Var, S, T, 27));
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.sk0 sk0Var = (a.sk0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        sk0Var.e(no1Var);
        return no1Var;
    }
}
