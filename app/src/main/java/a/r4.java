package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class r4 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppRetrieve g;
    public final /* synthetic */ java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = activityAppRetrieve;
        this.h = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.r4(this.g, this.h, eyVar);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.ha1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.ka1, java.lang.Object] */
    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve = this.g;
        a.b81 b81Var = activityAppRetrieve.g;
        if (b81Var == null) {
            a.wv.M1("progressBarDialog");
            throw null;
        }
        b81Var.a();
        activityAppRetrieve.q();
        a.nh nhVar = new a.nh(activityAppRetrieve.getContext(), this.h, "", false);
        activityAppRetrieve.q().setAdapter((android.widget.ListAdapter) nhVar);
        activityAppRetrieve.h = new java.lang.ref.WeakReference(nhVar);
        com.omarea.vtools.activities.ActivityAppRetrieve.o(activityAppRetrieve);
        activityAppRetrieve.q().setOnItemClickListener(new a.og1(3, activityAppRetrieve));
        com.omarea.common.ui.OverScrollListView q = activityAppRetrieve.q();
        int headerViewsCount = activityAppRetrieve.q().getHeaderViewsCount();
        a.b4 b4Var = a.b4.f;
        a.g4 g4Var = new a.g4(1, activityAppRetrieve);
        a.ka1 obj2 = new a.ka1();
        a.ka1 obj3 = new a.ka1();
        a.ka1 obj4 = new a.ka1();
        obj4.c = -1;
        q.setOnTouchListener(new a.yw0(b4Var, q, headerViewsCount, (ha1) obj2, obj3, obj4, g4Var));
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.r4 r4Var = (a.r4) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        r4Var.e(no1Var);
        return no1Var;
    }
}
