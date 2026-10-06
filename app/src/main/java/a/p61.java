package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class p61 extends a.uu0 implements a.bp0 {
    public final /* synthetic */ java.lang.Long d;
    public final /* synthetic */ double e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(java.lang.Long l, double d, float f) {
        super(1);
        this.d = l;
        this.e = d;
        this.f = f;
    }

    @Override // a.bp0
    public final java.lang.Object i(java.lang.Object obj) {
        return java.lang.Float.valueOf(((float) ((((float) (((java.lang.Number) obj).longValue() - this.d.longValue())) / 60000.0f) * this.e)) + this.f);
    }
}
