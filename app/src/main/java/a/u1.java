package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class u1 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    public final /* synthetic */ java.lang.Object g;

    public /* synthetic */ u1(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        int i;
        int i2;
        int i3 = this.c;
        int i4 = 0;
        java.lang.Integer num = null;
        java.lang.Object obj = this.g;
        java.lang.Object obj2 = this.f;
        java.lang.Object obj3 = this.e;
        java.lang.Object obj4 = this.d;
        switch (i3) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.a2 a2Var = (a.a2) obj4;
                java.util.ArrayList arrayList = (java.util.ArrayList) obj3;
                com.omarea.krscript.model.PickerNode pickerNode = (com.omarea.krscript.model.PickerNode) obj2;
                java.lang.Runnable runnable = (java.lang.Runnable) obj;
                int i5 = a.a2.d0;
                a.wv.w(a2Var, "this$0");
                a.wv.w(pickerNode, "$item");
                a.wv.w(runnable, "$onCompleted");
                a.b81 b81Var = a2Var.X;
                if (b81Var == null) {
                    a.wv.M1("progressBarDialog");
                    throw null;
                }
                b81Var.a();
                if (arrayList == null) {
                    android.widget.Toast.makeText(a2Var.f(), a2Var.m(2131953207), 0).show();
                    return;
                }
                android.view.Window window = a2Var.K().getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    num = java.lang.Integer.valueOf(decorView.getSystemUiVisibility());
                }
                new a.b70(num != null && (num.intValue() & 8192) == 0, arrayList, pickerNode.getMultiple(), new a.y1(pickerNode, a2Var, runnable, i4), 7).V(a2Var.K().getSupportFragmentManager(), "picker-item-chooser");
                return;
            case 1:
                android.os.Handler handler = (android.os.Handler) obj4;
                a.dw0 dw0Var = (a.dw0) obj3;
                com.omarea.krscript.model.NodeInfoBase nodeInfoBase = (com.omarea.krscript.model.NodeInfoBase) obj2;
                a.mm mmVar = (a.mm) obj;
                a.wv.w(handler, "$handler");
                a.wv.w(dw0Var, "$node");
                a.wv.w(nodeInfoBase, "$item");
                a.wv.w(mmVar, "this$0");
                handler.post(new a.ua0(dw0Var, nodeInfoBase, mmVar, 2));
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                ((android.view.View) obj4).setBackground((android.graphics.drawable.Drawable) obj3);
                ((a.w60) obj2).a();
                a.cp cpVar = com.omarea.Scene.c;
                a.fs1.X("OK ^_^", 0);
                java.lang.Runnable runnable2 = (java.lang.Runnable) ((a.ej1) obj).e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 3:
                com.omarea.vtools.activities.ActivityAppRetrieve activityAppRetrieve = (com.omarea.vtools.activities.ActivityAppRetrieve) obj4;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj3;
                java.util.ArrayList arrayList3 = (java.util.ArrayList) obj2;
                java.util.ArrayList arrayList4 = (java.util.ArrayList) obj;
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppRetrieve.k;
                a.wv.w(activityAppRetrieve, "this$0");
                a.wv.w(arrayList2, "$fail");
                a.wv.w(arrayList4, "$items");
                a.b81 b81Var2 = activityAppRetrieve.g;
                if (b81Var2 == null) {
                    a.wv.M1("progressBarDialog");
                    throw null;
                }
                b81Var2.a();
                activityAppRetrieve.setResult(-1);
                if (arrayList2.size() <= 0) {
                    activityAppRetrieve.r();
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    sb.append(((com.omarea.model.AppInfo) it.next()).getAppName());
                    sb.append("\n");
                }
                int i6 = a.x60.f681a;
                java.lang.String string = activityAppRetrieve.getString(2131951991);
                a.wv.v(string, "getString(R.string.apps_retrieve_fail)");
                a.fs1.F(activityAppRetrieve, string, a.ii1.f(sb.toString(), "\n\n", activityAppRetrieve.getString(2131951991)), null);
                if (arrayList3.size() != arrayList4.size()) {
                    activityAppRetrieve.r();
                    return;
                }
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.ka1 ka1Var = (a.ka1) obj4;
                android.widget.Button button = (android.widget.Button) obj3;
                java.util.Timer timer = (java.util.Timer) obj2;
                com.omarea.vtools.activities.ActivityStartSplash activityStartSplash = (com.omarea.vtools.activities.ActivityStartSplash) obj;
                int i7 = a.x5.h;
                a.wv.w(ka1Var, "$timeout");
                a.wv.w(timer, "$timer");
                a.wv.w(activityStartSplash, "this$0");
                try {
                    int i8 = ka1Var.c;
                    if (i8 > 0) {
                        int i9 = i8 - 1;
                        ka1Var.c = i9;
                        button.setText(i9 + "s");
                    } else {
                        timer.cancel();
                        button.setText(activityStartSplash.getString(2131951846));
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            case 5:
                a.i50 i50Var = (a.i50) obj4;
                try {
                    a.i50.a(i50Var, (a.v60) obj3, (java.lang.String) obj2, (com.omarea.model.ExchangeResponse) obj);
                    return;
                } catch (java.lang.Exception e) {
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.X(i50Var.f225a.getString(2131953683) + " " + e.getMessage(), 0);
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                int i10 = a.x60.f681a;
                ((a.ma1) obj4).c = a.fs1.J(((a.f60) obj3).f145a, null);
                ((a.ha1) obj2).c = true;
                ((a.qo0) obj).b();
                return;
            default:
                android.widget.TextView textView = (android.widget.TextView) obj4;
                a.ka1 ka1Var2 = (a.ka1) obj3;
                a.x70 x70Var = (a.x70) obj2;
                a.ma1 ma1Var = (a.ma1) obj;
                a.wv.w(ka1Var2, "$current");
                a.wv.w(x70Var, "$dialogRequest");
                a.wv.w(ma1Var, "$alertDialog");
                java.lang.String obj5 = textView.getText().toString();
                if (!a.wv.e(obj5, java.lang.String.valueOf(ka1Var2.c))) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("^[-0-9]{1,10}");
                    a.wv.v(compile, "compile(pattern)");
                    a.wv.w(obj5, "input");
                    if (compile.matcher(obj5).matches()) {
                        try {
                            int parseInt = java.lang.Integer.parseInt(textView.getText().toString());
                            a.u5 u5Var = (a.u5) x70Var;
                            int i11 = u5Var.f576a;
                            switch (i11) {
                                case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                                    i = u5Var.b;
                                    break;
                                default:
                                    i = u5Var.b;
                                    break;
                            }
                            if (parseInt >= i) {
                                switch (i11) {
                                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                                        i2 = u5Var.c;
                                        break;
                                    default:
                                        i2 = u5Var.c;
                                        break;
                                }
                                if (parseInt <= i2) {
                                    ka1Var2.c = parseInt;
                                }
                            }
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
                if (!a.wv.e(obj5, java.lang.String.valueOf(ka1Var2.c))) {
                    textView.setText(java.lang.String.valueOf(ka1Var2.c));
                    return;
                }
                int i12 = ka1Var2.c;
                a.u5 u5Var2 = (a.u5) x70Var;
                int i13 = u5Var2.f576a;
                com.omarea.vtools.activities.ActivityChargeControl activityChargeControl = u5Var2.e;
                switch (i13) {
                    case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                        activityChargeControl.G.getClass();
                        a.nu0 nu0Var = a.nu0.f395a;
                        a.nu0.l("/sys/class/power_supply/bms/charge_full", java.lang.String.valueOf(i12 * 1000));
                        activityChargeControl.s();
                        break;
                    default:
                        activityChargeControl.G.getClass();
                        a.nu0 nu0Var2 = a.nu0.f395a;
                        a.nu0.i("/sys/class/power_supply/battery/capacity", java.lang.String.valueOf(i12));
                        a.nu0.i("/sys/class/power_supply/maxfg/capacity", java.lang.String.valueOf(i12));
                        activityChargeControl.s();
                        break;
                }
                a.v60 v60Var = (a.v60) ma1Var.c;
                if (v60Var != null) {
                    v60Var.a();
                    return;
                }
                return;
        }
    }
}
