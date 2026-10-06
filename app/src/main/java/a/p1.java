package a;

import android.os.Handler;
import android.widget.LinearLayout;
import com.omarea.krscript.model.ActionNode;
import com.omarea.krscript.model.ActionParamInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /tmp/jadx-9051527860862319108.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Handler d;
    public final /* synthetic */ a2 e;
    public final /* synthetic */ ActionNode f;
    public final /* synthetic */ LinearLayout g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Runnable i;

    public /* synthetic */ p1(ArrayList arrayList, Handler handler, a2 a2Var, ActionNode actionNode, LinearLayout linearLayout, String str, Runnable runnable) {
        this.c = arrayList;
        this.d = handler;
        this.e = a2Var;
        this.f = actionNode;
        this.g = linearLayout;
        this.h = str;
        this.i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = a2.d0;
        ArrayList arrayList = this.c;
        wv.w(arrayList, "$actionParamInfos");
        Handler handler = this.d;
        wv.w(handler, "$handler");
        final a2 a2Var = this.e;
        wv.w(a2Var, "this$0");
        ActionNode actionNode = this.f;
        wv.w(actionNode, "$action");
        LinearLayout linearLayout = this.g;
        wv.w(linearLayout, "$linearLayout");
        String str = this.h;
        wv.w(str, "$script");
        Runnable runnable = this.i;
        wv.w(runnable, "$onExit");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final ActionParamInfo actionParamInfo = (ActionParamInfo) it.next();
            final int i2 = 0;
            handler.post(new Runnable() { // from class: a.s1
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    ActionParamInfo actionParamInfo2 = actionParamInfo;
                    a2 a2Var2 = a2Var;
                    switch (i3) {
                        case 0:
                            int i4 = a2.d0;
                            wv.w(a2Var2, "this$0");
                            wv.w(actionParamInfo2, "$actionParamInfo");
                            b81 b81Var = a2Var2.X;
                            if (b81Var == null) {
                                wv.M1("progressBarDialog");
                                throw null;
                            }
                            String string = a2Var2.L().getString(2131952713);
                            String label = actionParamInfo2.getLabel();
                            b81Var.b(string + ((label == null || label.length() == 0) ? actionParamInfo2.getName() : actionParamInfo2.getLabel()));
                            return;
                        default:
                            int i5 = a2.d0;
                            wv.w(a2Var2, "this$0");
                            wv.w(actionParamInfo2, "$actionParamInfo");
                            b81 b81Var2 = a2Var2.X;
                            if (b81Var2 == null) {
                                wv.M1("progressBarDialog");
                                throw null;
                            }
                            String string2 = a2Var2.L().getString(2131952714);
                            String label2 = actionParamInfo2.getLabel();
                            b81Var2.b(string2 + ((label2 == null || label2.length() == 0) ? actionParamInfo2.getName() : actionParamInfo2.getLabel()));
                            return;
                    }
                }
            });
            if (actionParamInfo.getValueShell() != null) {
                String valueShell = actionParamInfo.getValueShell();
                wv.s(valueShell);
                String V = wv.V(a2Var.L(), valueShell, actionNode);
                wv.v(V, "executeResultRoot(requir…hellScript, nodeInfoBase)");
                actionParamInfo.setValueFromShell(V);
            }
            final int i3 = 1;
            handler.post(new Runnable() { // from class: a.s1
                @Override // java.lang.Runnable
                public final void run() {
                    int i32 = i3;
                    ActionParamInfo actionParamInfo2 = actionParamInfo;
                    a2 a2Var2 = a2Var;
                    switch (i32) {
                        case 0:
                            int i4 = a2.d0;
                            wv.w(a2Var2, "this$0");
                            wv.w(actionParamInfo2, "$actionParamInfo");
                            b81 b81Var = a2Var2.X;
                            if (b81Var == null) {
                                wv.M1("progressBarDialog");
                                throw null;
                            }
                            String string = a2Var2.L().getString(2131952713);
                            String label = actionParamInfo2.getLabel();
                            b81Var.b(string + ((label == null || label.length() == 0) ? actionParamInfo2.getName() : actionParamInfo2.getLabel()));
                            return;
                        default:
                            int i5 = a2.d0;
                            wv.w(a2Var2, "this$0");
                            wv.w(actionParamInfo2, "$actionParamInfo");
                            b81 b81Var2 = a2Var2.X;
                            if (b81Var2 == null) {
                                wv.M1("progressBarDialog");
                                throw null;
                            }
                            String string2 = a2Var2.L().getString(2131952714);
                            String label2 = actionParamInfo2.getLabel();
                            b81Var2.b(string2 + ((label2 == null || label2.length() == 0) ? actionParamInfo2.getName() : actionParamInfo2.getLabel()));
                            return;
                    }
                }
            });
            actionParamInfo.setOptionsFromShell(a2Var.U(actionParamInfo, actionNode));
        }
        handler.post(new fw(16, a2Var));
        handler.post(new t1(linearLayout, a2Var, arrayList, actionNode, str, runnable, 0));
    }
}
