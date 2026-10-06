package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g5 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ java.util.List g;
    public final /* synthetic */ a.w60 h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityApplications i;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityApplications j;
    public final /* synthetic */ a.mo k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(java.util.List list, a.w60 w60Var, com.omarea.vtools.activities.ActivityApplications activityApplications, com.omarea.vtools.activities.ActivityApplications activityApplications2, a.mo moVar, a.ey eyVar) {
        super(2, eyVar);
        this.g = list;
        this.h = w60Var;
        this.i = activityApplications;
        this.j = activityApplications2;
        this.k = moVar;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.g5(this.g, this.h, this.i, this.j, this.k, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        java.util.List list = this.g;
        boolean isEmpty = list.isEmpty();
        a.w60 w60Var = this.h;
        if (isEmpty) {
            w60Var.a();
            a.cp cpVar = com.omarea.Scene.c;
            a.fs1.W(2131951890, 0);
            return a.no1.f387a;
        }
        w60Var.a();
        int i = a.x60.f681a;
        com.omarea.vtools.activities.ActivityApplications activityApplications = this.i;
        com.omarea.vtools.activities.ActivityApplications activityApplications2 = this.j;
        java.lang.String string = activityApplications2.getString(2131951891);
        a.wv.v(string, "getString(R.string.apps_batch_uninstall_title)");
        java.lang.String string2 = activityApplications2.getString(2131951888);
        java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a.io) a.wv.v1(new a.d5(this.k, (java.lang.String) it.next(), null))).f236a);
        }
        return a.fs1.Z(activityApplications, string, a.ii1.e(string2, a.qv.j2(arrayList, "\n", null, null, null, 62)), new a.ua0(this.i, list, w60Var, 14), null, 16);
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.g5) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
