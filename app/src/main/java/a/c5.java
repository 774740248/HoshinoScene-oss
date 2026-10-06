package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class c5 extends a.uu0 implements a.fp0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(java.lang.Object obj, int i, java.lang.Object obj2) {
        super(2);
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // a.fp0
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        a.no1 no1Var = a.no1.f387a;
        int i = this.d;
        java.lang.Object obj3 = this.f;
        java.lang.Object obj4 = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.mg1 mg1Var = (a.mg1) obj;
                ((java.lang.Number) obj2).intValue();
                a.wv.w(mg1Var, "item");
                a.ma1 ma1Var = (a.ma1) obj4;
                ma1Var.c = a.rk0.valueOf(mg1Var.b);
                com.omarea.vtools.activities.ActivityApplications activityApplications = (com.omarea.vtools.activities.ActivityApplications) obj3;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityApplications.n;
                android.text.Editable text = activityApplications.o().getText();
                a.wv.v(text, "apps_search_box.text");
                activityApplications.q(text, (a.rk0) ma1Var.c);
                return no1Var;
            default:
                ((java.lang.Number) obj).intValue();
                ((java.lang.Boolean) obj2).booleanValue();
                a.vk0 vk0Var = (a.vk0) obj4;
                a.fa0 fa0Var = a.vk0.g0;
                android.widget.CheckBox V = vk0Var.V();
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj3;
                a.nh nhVar = (a.nh) weakReference.get();
                V.setChecked(nhVar != null && nhVar.a());
                android.view.View U = vk0Var.U();
                a.nh nhVar2 = (a.nh) weakReference.get();
                U.setVisibility((nhVar2 == null || !nhVar2.d()) ? 8 : 0);
                return no1Var;
        }
    }
}
