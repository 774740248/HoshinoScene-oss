package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class kh implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ kh(int i, int i2, java.lang.Object obj) {
        this.f290a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        int i = this.f290a;
        int i2 = this.b;
        java.lang.Object obj = this.c;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.nh nhVar = (a.nh) obj;
                a.wv.w(nhVar, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                nhVar.h.put(java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z));
                return;
            default:
                com.omarea.vtools.activities.ActivityMonitorDesigner activityMonitorDesigner = (com.omarea.vtools.activities.ActivityMonitorDesigner) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityMonitorDesigner.m;
                a.wv.w(activityMonitorDesigner, "this$0");
                a.wv.w(compoundButton, "<anonymous parameter 0>");
                com.omarea.ui.fw.FloatMonitorRender p = activityMonitorDesigner.p();
                p.setFlags(z ? p.Q | i2 : p.Q & (~i2));
                activityMonitorDesigner.q();
                return;
        }
    }
}
