package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class o8 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.w60 g;
    public final /* synthetic */ java.util.List h;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFiles i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(a.w60 w60Var, java.util.List list, com.omarea.vtools.activities.ActivityFiles activityFiles, a.ey eyVar) {
        super(2, eyVar);
        this.g = w60Var;
        this.h = list;
        this.i = activityFiles;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.o8(this.g, this.h, this.i, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        this.g.a();
        java.util.List<java.lang.String> list = this.h;
        boolean z = !list.isEmpty();
        com.omarea.vtools.activities.ActivityFiles activityFiles = this.i;
        if (z) {
            int i = a.x60.f681a;
            java.lang.String string = activityFiles.getString(2131952404);
            a.wv.v(string, "getString(R.string.fs_delete_failed)");
            java.util.ArrayList arrayList = new java.util.ArrayList(a.op.J1(list, 10));
            for (java.lang.String str : list) {
                java.lang.String substring = str.substring(a.yi1.q2(str, "/", 6) + 1);
                a.wv.v(substring, "this as java.lang.String).substring(startIndex)");
                arrayList.add(substring);
            }
            a.fs1.F(activityFiles, string, a.qv.j2(arrayList, "\n", null, null, null, 62), new a.h8(activityFiles, 2));
        } else {
            com.omarea.vtools.activities.ActivityFiles.p(activityFiles);
        }
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.o8 o8Var = (a.o8) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        o8Var.e(no1Var);
        return no1Var;
    }
}
