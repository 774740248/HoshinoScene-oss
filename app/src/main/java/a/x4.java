package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class x4 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f680a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ x4(java.lang.Object obj, int i, java.lang.Object obj2) {
        this.f680a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        int i2 = this.f680a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (i2) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.vtools.activities.ActivityApplications activityApplications = (com.omarea.vtools.activities.ActivityApplications) obj2;
                a.ma1 ma1Var = (a.ma1) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityApplications.n;
                a.wv.w(activityApplications, "this$0");
                a.wv.w(ma1Var, "$appState");
                if (i != 3 && i != 5 && i != 6) {
                    return true;
                }
                android.text.Editable text = activityApplications.o().getText();
                a.wv.v(text, "apps_search_box.text");
                activityApplications.q(text, (a.rk0) ma1Var.c);
                return true;
            default:
                a.ej1 ej1Var = (a.ej1) obj2;
                android.widget.TextView textView2 = (android.widget.TextView) obj;
                a.wv.w(ej1Var, "this$0");
                if (i != 5 && i != 6) {
                    return false;
                }
                ej1Var.j(textView2.getText().toString());
                return false;
        }
    }
}
