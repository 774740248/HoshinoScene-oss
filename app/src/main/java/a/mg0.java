package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class mg0 extends a.fy {
    public com.omarea.ui.fw.FloatMonitorRender f;
    public a.k11 g;
    public a.ia1 h;
    public a.ka1 i;
    public int j;
    public /* synthetic */ java.lang.Object k;
    public final /* synthetic */ com.omarea.ui.fw.FloatMonitorRender l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(com.omarea.ui.fw.FloatMonitorRender floatMonitorRender, a.ey eyVar) {
        super(eyVar);
        this.l = floatMonitorRender;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return com.omarea.ui.fw.FloatMonitorRender.c(this.l, this);
    }
}
