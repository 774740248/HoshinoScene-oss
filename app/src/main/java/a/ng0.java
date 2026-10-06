package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class ng0 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ ng0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Object obj = this.f;
        java.lang.Object obj2 = this.e;
        java.lang.Object obj3 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj3;
                a.ma1 ma1Var = (a.ma1) obj2;
                a.rg0 rg0Var = (a.rg0) obj;
                a.wv.w(arrayList, "$threadsRealtimeState");
                a.wv.w(ma1Var, "$text");
                a.wv.w(rg0Var, "this$0");
                boolean isEmpty = arrayList.isEmpty();
                a.hk hkVar = rg0Var.p;
                if (isEmpty) {
                    java.lang.Object obj4 = ma1Var.c;
                    int i2 = a.rg0.v;
                    android.content.Context context = rg0Var.f495a;
                    ma1Var.c = obj4 + ((i2 > 0 || a.oq0.j.length() > 0) ? context.getString(2131953006) : context.getString(2131953005));
                    hkVar.g = new java.util.ArrayList();
                    hkVar.f();
                } else {
                    hkVar.g = arrayList;
                    hkVar.f();
                }
                java.lang.Object obj5 = ma1Var.c;
                rg0Var.n = (java.lang.String) obj5;
                rg0Var.d.setText((java.lang.CharSequence) obj5);
                return;
            default:
                a.jo0 jo0Var = (a.jo0) obj3;
                java.lang.String str = (java.lang.String) obj;
                a.wv.w(jo0Var, "this$0");
                a.wv.w(str, "$uid");
                new a.nk(jo0Var.K(), new a.go0((android.view.View) obj2, jo0Var, str)).O();
                return;
        }
    }
}
