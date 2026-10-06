package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class ka0 extends a.lj1 implements a.fp0 {
    public int g;
    public final /* synthetic */ a.la0 h;
    public final /* synthetic */ a.la1 i;
    public final /* synthetic */ a.ka1 j;
    public final /* synthetic */ java.util.ArrayList k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(a.la0 la0Var, a.la1 la1Var, a.ka1 ka1Var, java.util.ArrayList arrayList, a.ey eyVar) {
        super(2, eyVar);
        this.h = la0Var;
        this.i = la1Var;
        this.j = ka1Var;
        this.k = arrayList;
    }

    @Override // a.iq
    public final a.ey a(java.lang.Object obj, a.ey eyVar) {
        return new a.ka0(this.h, this.i, this.j, this.k, eyVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0022 -> B:5:0x0025). Please report as a decompilation issue!!! */
    @Override // a.iq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ka0.e(java.lang.Object):java.lang.Object");
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        return ((a.ka0) a((a.cz) obj, (a.ey) obj2)).e(a.no1.f387a);
    }
}
