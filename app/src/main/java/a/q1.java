package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class q1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;
    public final /* synthetic */ java.lang.Object h;

    public /* synthetic */ q1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        java.lang.Object obj = this.h;
        java.lang.Object obj2 = this.g;
        java.lang.Object obj3 = this.f;
        java.lang.Object obj4 = this.e;
        java.lang.Object obj5 = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                com.omarea.krscript.model.PickerNode pickerNode = (com.omarea.krscript.model.PickerNode) obj5;
                com.omarea.krscript.model.ActionParamInfo actionParamInfo = (com.omarea.krscript.model.ActionParamInfo) obj4;
                a.a2 a2Var = (a.a2) obj3;
                android.os.Handler handler = (android.os.Handler) obj2;
                java.lang.Runnable runnable = (java.lang.Runnable) obj;
                int i2 = a.a2.d0;
                a.wv.w(pickerNode, "$item");
                a.wv.w(actionParamInfo, "$paramInfo");
                a.wv.w(a2Var, "this$0");
                a.wv.w(handler, "$handler");
                a.wv.w(runnable, "$onCompleted");
                if (pickerNode.getGetState() != null) {
                    java.lang.String getState = pickerNode.getGetState();
                    a.wv.s(getState);
                    java.lang.String V = a.wv.V(a2Var.L(), getState, pickerNode);
                    a.wv.v(V, "executeResultRoot(requir…hellScript, nodeInfoBase)");
                    actionParamInfo.setValueFromShell(V);
                }
                java.util.ArrayList U = a2Var.U(actionParamInfo, pickerNode);
                if (U != null) {
                    java.util.ArrayList A = a.fs1.A(actionParamInfo);
                    int size = U.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        java.lang.Object obj6 = U.get(i3);
                        a.wv.v(obj6, "options[index]");
                        ((a.ng1) U.get(i3)).d = A != null && a.qv.d2(A, ((a.ng1) obj6).c);
                    }
                } else {
                    U = null;
                }
                handler.post(new a.u1(a2Var, U, pickerNode, runnable, 0));
                return;
            case 1:
                android.widget.ListView listView = (android.widget.ListView) obj5;
                a.rg rgVar = (a.rg) obj4;
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj3;
                com.omarea.vtools.activities.ActivityAppContents activityAppContents = (com.omarea.vtools.activities.ActivityAppContents) obj2;
                java.lang.String str = (java.lang.String) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppContents.q;
                a.wv.w(listView, "$lv");
                a.wv.w(rgVar, "$adapterObj");
                a.wv.w(weakReference, "$adapterAppList");
                a.wv.w(activityAppContents, "this$0");
                a.wv.w(str, "$type");
                try {
                    listView.setAdapter((android.widget.ListAdapter) rgVar);
                    listView.setOnItemClickListener(new a.r3(weakReference, activityAppContents, str));
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            default:
                a.la1 la1Var = (a.la1) obj5;
                a.nk nkVar = (a.nk) obj4;
                a.ha1 ha1Var = (a.ha1) obj2;
                android.widget.TextView textView = (android.widget.TextView) obj;
                a.wv.w(la1Var, "$currentNow");
                a.wv.w(nkVar, "this$0");
                a.wv.w((a.ka1) obj3, "$unit");
                a.wv.w(ha1Var, "$double");
                long longProperty = ((android.os.BatteryManager) nkVar.f).getLongProperty(2);
                la1Var.c = longProperty;
                try {
                    long j = (longProperty / r5.c) * (ha1Var.c ? 2 : 1);
                    textView.setText((j >= 0 ? "+" : "") + j + "mA");
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
        }
    }
}
