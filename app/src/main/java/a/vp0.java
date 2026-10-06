package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class vp0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ com.omarea.ui.apps.Games h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(com.omarea.ui.apps.Games games, a.ey eyVar) {
        super(2, eyVar);
        this.h = games;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.vp0(this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.dz dzVar = a.dz.c;
        int i = this.g;
        if (i == 0) {
            a.b20.q1(obj);
            com.omarea.ui.apps.Games games = this.h;
            android.content.Context context = games.getContext();
            a.wv.v(context, "context");
            java.util.ArrayList f = new a.po(context, true).f();
            android.content.Context context2 = games.getContext();
            a.wv.v(context2, "context");
            java.lang.String[] a2 = new a.yi(context2).a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = f.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (!a.op.K1(a2, ((com.omarea.model.AppInfo) next).getPackageName())) {
                    arrayList.add(next);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(a.op.J1(arrayList, 10));
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.omarea.model.AppInfo appInfo = (com.omarea.model.AppInfo) it2.next();
                a.tg tgVar = new a.tg();
                tgVar.setAppName(appInfo.getAppName());
                tgVar.setPackageName(appInfo.getPackageName());
                tgVar.setSelected(false);
                arrayList2.add(tgVar);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
            a.u20 u20Var = a.z80.f728a;
            a.zx0 zx0Var = a.by0.f57a;
            a.up0 up0Var = new a.up0(games, arrayList3, null);
            this.g = 1;
            if (a.wv.S1(zx0Var, up0Var, this) == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b20.q1(obj);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.vp0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
