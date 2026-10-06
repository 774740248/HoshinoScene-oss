package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class s3 extends a.lj1 implements a.fp0 {
    public final /* synthetic */ a.ki g;
    public final /* synthetic */ java.util.ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(a.ki kiVar, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.g = kiVar;
        this.h = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.s3(this.g, this.h, eyVar);
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        a.b20.q1(obj);
        a.ki kiVar = this.g;
        kiVar.getClass();
        java.util.ArrayList arrayList = this.h;
        a.wv.w(arrayList, "list");
        java.util.ArrayList arrayList2 = kiVar.d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        java.lang.String str = kiVar.f;
        a.wv.w(str, "text");
        kiVar.f = str;
        kiVar.h = kiVar.a(str, arrayList2);
        kiVar.notifyDataSetChanged();
        return a.no1.f387a;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.s3 s3Var = (a.s3) a((a.cz) obj, (a.ey) obj2);
        a.no1 no1Var = a.no1.f387a;
        s3Var.e(no1Var);
        return no1Var;
    }
}
