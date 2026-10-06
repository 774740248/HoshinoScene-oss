package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class jg0 extends a.fy {
    public com.omarea.ui.fw.FloatMonitorRender f;
    public long g;
    public int h;
    public /* synthetic */ java.lang.Object i;
    public final /* synthetic */ com.omarea.ui.fw.FloatMonitorRender j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(com.omarea.ui.fw.FloatMonitorRender floatMonitorRender, a.ey eyVar) {
        super(eyVar);
        this.j = floatMonitorRender;
    }

    @Override // a.iq
    public final java.lang.Object e(java.lang.Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        a.gu0[] gu0VarArr = com.omarea.ui.fw.FloatMonitorRender.S;
        return this.j.k(this);
    }
}
