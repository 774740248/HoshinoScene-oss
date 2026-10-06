package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class oj0 extends a.uu0 implements a.qo0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.KeyEvent.Callback e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj0(android.view.KeyEvent.Callback callback, java.lang.Object obj, java.lang.Object obj2, int i) {
        super(0);
        this.d = i;
        this.e = callback;
        this.g = obj;
        this.f = obj2;
    }

    public final void a() {
        java.lang.String obj;
        java.lang.String obj2;
        int i = this.d;
        java.lang.String str = "";
        java.lang.Object obj3 = this.f;
        java.lang.Object obj4 = this.g;
        android.view.KeyEvent.Callback callback = this.e;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.text.Editable text = ((android.widget.EditText) callback).getText();
                if (text != null && (obj = text.toString()) != null) {
                    str = obj;
                }
                a.ma1 ma1Var = (a.ma1) obj4;
                if (a.wv.e(str, ma1Var.c)) {
                    return;
                }
                ma1Var.c = str;
                ((a.ij0) obj3).setValue(str);
                return;
            case 1:
                android.widget.EditText editText = (android.widget.EditText) callback;
                android.text.Editable text2 = editText.getText();
                if (text2 != null && (obj2 = text2.toString()) != null) {
                    str = obj2;
                }
                try {
                    double parseDouble = java.lang.Double.parseDouble(str);
                    ((a.ia1) obj4).c = parseDouble;
                    ((a.ij0) obj3).setValue(java.lang.Double.valueOf(parseDouble));
                    return;
                } catch (java.lang.Exception unused) {
                    editText.setText(java.lang.String.valueOf(((a.ia1) obj4).c));
                    return;
                }
            default:
                int i2 = a.x60.f681a;
                com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = (com.omarea.vtools.activities.ActivityFpsSession) callback;
                a.wv.M0(a.wv.b(a.z80.b), null, new a.g9(activityFpsSession, (com.omarea.model.FpsWatchSession) obj4, (java.lang.String) obj3, a.fs1.J(activityFpsSession, null), null), 3);
                return;
        }
    }

    @Override // a.qo0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        a.no1 no1Var = a.no1.f387a;
        switch (this.d) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a();
                return no1Var;
            case 1:
                a();
                return no1Var;
            default:
                a();
                return no1Var;
        }
    }
}
