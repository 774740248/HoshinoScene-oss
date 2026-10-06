package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class bq0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ android.content.SharedPreferences h;
    public final /* synthetic */ com.omarea.ui.apps.Games i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(android.content.SharedPreferences sharedPreferences, com.omarea.ui.apps.Games games, a.ey eyVar) {
        super(2, eyVar);
        this.h = sharedPreferences;
        this.i = games;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.bq0(this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        com.omarea.ui.apps.Games games = this.i;
        a.dz dzVar = a.dz.c;
        int i = this.g;
        try {
            if (i == 0) {
                a.b20.q1(obj);
                java.lang.String string = this.h.getString(games.j, "");
                a.wv.s(string);
                java.util.List y2 = a.yi1.y2(string, new java.lang.String[]{","});
                android.content.Context context = games.getContext();
                a.wv.v(context, "context");
                java.lang.String[] a2 = new a.yi(context).a();
                int length = a2.length;
                if (a2.length > 1) {
                    a.op.U1(a2, new a.aq0(y2, length, 0));
                }
                android.content.Context context2 = games.getContext();
                a.wv.v(context2, "context");
                a.po poVar = new a.po(context2, true);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str : a2) {
                    com.omarea.model.AppInfo c = poVar.c(str);
                    if (c != null) {
                        arrayList.add(c);
                    }
                }
                a.u20 u20Var = a.z80.f728a;
                a.zx0 zx0Var = a.by0.f57a;
                a.zp0 zp0Var = new a.zp0(games, arrayList, a2, null);
                this.g = 1;
                if (a.wv.S1(zx0Var, zp0Var, this) == dzVar) {
                    return dzVar;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.b20.q1(obj);
            }
        } catch (java.lang.Exception e) {
            e.getStackTrace();
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.bq0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
