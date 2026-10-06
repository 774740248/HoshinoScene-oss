package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class zp0 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.ui.apps.Games g;
    public final /* synthetic */ java.util.ArrayList h;
    public final /* synthetic */ java.lang.String[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(com.omarea.ui.apps.Games games, java.util.ArrayList arrayList, java.lang.String[] strArr, a.ey eyVar) {
        super(2, eyVar);
        this.g = games;
        this.h = arrayList;
        this.i = strArr;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.zp0(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView games;
        a.b20.q1(obj);
        com.omarea.ui.apps.Games games2 = this.g;
        boolean isAttachedToWindow = games2.isAttachedToWindow();
        a.no1 no1Var = a.no1.f387a;
        if (!isAttachedToWindow) {
            return no1Var;
        }
        try {
            android.content.Context applicationContext = games2.getContext().getApplicationContext();
            a.wv.v(applicationContext, "context.applicationContext");
            a.fh fhVar = new a.fh(applicationContext, this.h);
            a.th1 th1Var = new a.th1(fhVar, games2.i);
            a.ct0 ct0Var = new a.ct0(th1Var);
            games = games2.getGames();
            if (!(games.getLayoutManager() instanceof androidx.recyclerview.widget.GridLayoutManager)) {
                games2.g(null);
            }
            games.setAdapter(fhVar);
            ct0Var.g(games);
            fhVar.m = new a.xp0(fhVar, games2);
            fhVar.n = new a.yp0(th1Var, fhVar, games2);
        } catch (java.lang.Exception unused) {
        }
        return no1Var;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.zp0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
