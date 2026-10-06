package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class t8 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityFpsSession d;

    public /* synthetic */ t8(com.omarea.vtools.activities.ActivityFpsSession activityFpsSession, int i) {
        this.c = i;
        this.d = activityFpsSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [a.ng1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [a.ng1, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        int i = this.c;
        int i2 = 0;
        com.omarea.vtools.activities.ActivityFpsSession activityFpsSession = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                activityFpsSession.u().setVisibility(8);
                activityFpsSession.v().setVisibility(0);
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                activityFpsSession.u().setVisibility(8);
                activityFpsSession.v().setVisibility(0);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                activityFpsSession.u().setVisibility(0);
                activityFpsSession.v().setVisibility(8);
                return;
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                activityFpsSession.u().setVisibility(0);
                activityFpsSession.v().setVisibility(8);
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                a.yj0[] values = a.yj0.values();
                activityFpsSession.w().setRightDimension(values[(a.op.O1(values, activityFpsSession.w().getRightDimension()) + 1) % values.length]);
                android.widget.TextView textView = (android.widget.TextView) activityFpsSession.C.a(com.omarea.vtools.activities.ActivityFpsSession.I0[29]);
                int ordinal = activityFpsSession.w().getRightDimension().ordinal();
                if (ordinal == 0) {
                    str = "Temperature(℃)";
                } else if (ordinal != 1) {
                    str = ordinal != 2 ? "" : "Battery(%)";
                } else {
                    a.vj1 vj1Var = a.du.f;
                    android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(a.tg1.h());
                    android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#80fc6bc5"));
                    android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
                    android.text.SpannableString spannableString = new android.text.SpannableString("CPU/GPU Load(%)");
                    spannableString.setSpan(foregroundColorSpan2, 0, 3, 33);
                    spannableString.setSpan(styleSpan, 0, 3, 33);
                    spannableString.setSpan(foregroundColorSpan, 4, 8, 33);
                    spannableString.setSpan(styleSpan, 4, 8, 33);
                    str = (String) spannableString;
                }
                textView.setText(str);
                return;
            case 5:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                java.util.ArrayList<java.lang.String[]> clusters = activityFpsSession.t().getClusters();
                java.util.ArrayList<java.lang.Integer> excludedCores = activityFpsSession.t().getExcludedCores();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                ng1 obj = new ng1();
                /* TODO: jadx type unresolved, defaulted to Object */
                obj.f381a = "MultiCore Total";
                obj.c = "-1";
                obj.d = !excludedCores.contains(-1);
                arrayList.add(obj);
                a.wv.v(clusters, "clusters");
                int i3 = 0;
                for (java.lang.Object obj2 : clusters) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    java.lang.String[] strArr = (java.lang.String[]) obj2;
                    a.wv.v(strArr, "it");
                    int length = strArr.length;
                    int i5 = i2;
                    while (i5 < length) {
                        java.lang.String str2 = strArr[i5];
                        ng1 obj3 = new ng1();
                        /* TODO: jadx type unresolved, defaulted to Object */
                        obj3.f381a = a.ai1.g("CPU Core ", str2);
                        obj3.c = str2;
                        a.wv.v(str2, "it");
                        obj3.d = !excludedCores.contains(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                        arrayList.add(obj3);
                        i5++;
                        i2 = 0;
                    }
                    i3 = i4;
                }
                new a.b70(activityFpsSession.getThemeMode().f442a, arrayList, true, new a.y1(activityFpsSession, arrayList, excludedCores, 2), 999).V(activityFpsSession.getSupportFragmentManager(), "chart-cpu-options");
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                java.util.ArrayList<java.lang.String[]> clusters2 = activityFpsSession.r().getClusters();
                java.util.ArrayList<java.lang.Integer> excludedCores2 = activityFpsSession.r().getExcludedCores();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                a.wv.v(clusters2, "clusters");
                for (java.lang.Object obj4 : clusters2) {
                    int i6 = i2 + 1;
                    if (i2 < 0) {
                        a.b20.p1();
                        throw null;
                    }
                    java.lang.String[] strArr2 = (java.lang.String[]) obj4;
                    ng1 obj5 = new ng1();
                    /* TODO: jadx type unresolved, defaulted to Object */
                    obj5.f381a = strArr2.length > 1 ? "CPU Core " + a.op.N1(strArr2) + "~" + a.op.Q1(strArr2) : "CPU Core " + a.op.N1(strArr2);
                    java.lang.String str3 = (java.lang.String) a.op.N1(strArr2);
                    obj5.c = str3;
                    a.wv.s(str3);
                    obj5.d = !excludedCores2.contains(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
                    arrayList2.add(obj5);
                    i2 = i6;
                }
                new a.b70(activityFpsSession.getThemeMode().f442a, arrayList2, true, new a.l41(clusters2, activityFpsSession, arrayList2, excludedCores2, 1), 999).V(activityFpsSession.getSupportFragmentManager(), "chart-cpu-options");
                return;
            default:
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityFpsSession.I0;
                a.wv.w(activityFpsSession, "this$0");
                if (activityFpsSession.r().getVisibility() == 8) {
                    activityFpsSession.r().setVisibility(0);
                    activityFpsSession.s().setVisibility(8);
                    return;
                } else {
                    activityFpsSession.r().setVisibility(8);
                    activityFpsSession.s().setVisibility(0);
                    return;
                }
        }
    }
}
