package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class up0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.apps.Games g;
    public final /* synthetic */ java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(com.omarea.ui.apps.Games games, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = games;
        this.h = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.up0(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b81 b81Var;
        com.omarea.ui.apps.Games games = this.g;
        a.b20.q1(obj);
        try {
            b81Var = games.k;
        } catch (java.lang.Exception unused) {
        }
        if (b81Var == null) {
            a.wv.M1("processBarDialog");
            throw null;
        }
        b81Var.a();
        android.content.Context context = games.getContext();
        a.wv.t(context, "null cannot be cast to non-null type com.omarea.vtools.activities.ActivityBase");
        a.p5 p5Var = (a.p5) context;
        a.a40 a40Var = new a.a40(p5Var.getThemeMode().f442a, this.h, true, new a.tp0(games, 0));
        a40Var.r0 = false;
        android.view.View view = a40Var.H;
        android.widget.CompoundButton compoundButton = view != null ? (android.widget.CompoundButton) view.findViewById(2131363073) : null;
        if (compoundButton != null) {
            compoundButton.setVisibility(8);
        }
        a40Var.V(p5Var.getSupportFragmentManager(), "freeze-app-add");
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.up0 up0Var = (a.up0) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        up0Var.e(no1Var);
        return no1Var;
    }
}
