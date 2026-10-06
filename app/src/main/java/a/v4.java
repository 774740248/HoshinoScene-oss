package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class v4 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppXposedDetails d;

    public /* synthetic */ v4(com.omarea.vtools.activities.ActivityAppXposedDetails activityAppXposedDetails, int i) {
        this.c = i;
        this.d = activityAppXposedDetails;
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, a.ma1] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityAppXposedDetails activityAppXposedDetails = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                activityAppXposedDetails.r();
                return;
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                activityAppXposedDetails.getOnBackPressedDispatcher().b();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                try {
                    activityAppXposedDetails.s();
                    activityAppXposedDetails.startActivity(activityAppXposedDetails.getPackageManager().getLaunchIntentForPackage(activityAppXposedDetails.m));
                    return;
                } catch (java.lang.Exception unused) {
                    android.widget.Toast.makeText(activityAppXposedDetails.getApplicationContext(), activityAppXposedDetails.getString(2131953524), 0).show();
                    return;
                }
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                a.pu1 q = activityAppXposedDetails.q();
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                q.c = ((android.widget.Switch) view).isChecked();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                a.pu1 q2 = activityAppXposedDetails.q();
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                q2.d = ((android.widget.Switch) view).isChecked();
                return;
            case 5:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                a.pu1 q3 = activityAppXposedDetails.q();
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Switch");
                q3.e = ((android.widget.Switch) view).isChecked();
                return;
            default:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityAppXposedDetails.s;
                a.wv.w(activityAppXposedDetails, "this$0");
                ma1 obj = new ma1();
                android.view.View inflate = activityAppXposedDetails.getLayoutInflater().inflate(2131558520, (android.view.ViewGroup) null);
                android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(2131362650);
                editText.setFilters(new a.ps0[]{new a.ps0()});
                if (activityAppXposedDetails.q().b >= 96) {
                    editText.setText(java.lang.String.valueOf(activityAppXposedDetails.q().b));
                }
                int i2 = a.x60.f681a;
                java.lang.String string = activityAppXposedDetails.getString(2131953739);
                a.wv.v(string, "getString(R.string.xp_dpi_input)");
                java.lang.String string2 = activityAppXposedDetails.getString(2131952077);
                a.wv.v(string2, "getString(R.string.btn_confirm)");
                a.u60 u60Var = new a.u60(string2, (java.lang.Runnable) new a.ua0(editText, activityAppXposedDetails, obj, 12), false);
                java.lang.String string3 = activityAppXposedDetails.getString(2131952076);
                a.wv.v(string3, "getString(R.string.btn_cancel)");
                obj.c = a.fs1.g(activityAppXposedDetails, string, "", inflate, u60Var, new a.u60(string3, (java.lang.Runnable) null, 6));
                return;
        }
    }
}
