package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class q5 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityChargeControl d;

    public /* synthetic */ q5(com.omarea.vtools.activities.ActivityChargeControl activityChargeControl, int i) {
        this.c = i;
        this.d = activityChargeControl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        final int i2 = 0;
        final int i3 = 1;
        final com.omarea.vtools.activities.ActivityChargeControl activityChargeControl = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                boolean isChecked = ((android.widget.CompoundButton) view).isChecked();
                android.content.SharedPreferences sharedPreferences = activityChargeControl.H;
                if (sharedPreferences == null) {
                    a.wv.M1("spf");
                    throw null;
                }
                sharedPreferences.edit().putBoolean("qc_booster", isChecked).apply();
                if (!isChecked) {
                    a.cp cpVar = com.omarea.Scene.c;
                    a.fs1.W(2131952040, 1);
                    return;
                } else {
                    com.omarea.vtools.activities.ActivityChargeControl.r();
                    a.cp cpVar2 = com.omarea.Scene.c;
                    a.fs1.W(2131952015, 1);
                    return;
                }
            case 1:
                a.gu0[] gu0VarArr2 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                android.content.SharedPreferences sharedPreferences2 = activityChargeControl.H;
                if (sharedPreferences2 == null) {
                    a.wv.M1("spf");
                    throw null;
                }
                int i4 = sharedPreferences2.getInt("time_get_up", 420);
                new android.app.TimePickerDialog(activityChargeControl.getContext(), new a.s5(), i4 / 60, i4 % 60, true).show();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_REDE /* 2 */:
                a.gu0[] gu0VarArr3 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                android.content.SharedPreferences sharedPreferences3 = activityChargeControl.H;
                if (sharedPreferences3 == null) {
                    a.wv.M1("spf");
                    throw null;
                }
                int i5 = sharedPreferences3.getInt("time_slepp", 1350);
                new android.app.TimePickerDialog(activityChargeControl.getContext(), new a.s5(), i5 / 60, i5 % 60, true).show();
                return;
            case 3:
                a.gu0[] gu0VarArr4 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                android.widget.CompoundButton compoundButton = (android.widget.CompoundButton) view;
                boolean isChecked2 = compoundButton.isChecked();
                if (isChecked2) {
                    android.content.SharedPreferences sharedPreferences4 = activityChargeControl.H;
                    if (sharedPreferences4 == null) {
                        a.wv.M1("spf");
                        throw null;
                    }
                    if (!sharedPreferences4.getBoolean("qc_booster", false)) {
                        android.widget.Toast.makeText(activityChargeControl.getContext(), activityChargeControl.getString(2131952042) + " " + activityChargeControl.getString(2131952038), 1).show();
                        compoundButton.setChecked(false);
                        return;
                    }
                }
                android.content.SharedPreferences sharedPreferences5 = activityChargeControl.H;
                if (sharedPreferences5 == null) {
                    a.wv.M1("spf");
                    throw null;
                }
                sharedPreferences5.edit().putBoolean("sleep_time", isChecked2).apply();
                com.omarea.vtools.activities.ActivityChargeControl.r();
                return;
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_READ_ERROR /* 4 */:
                a.gu0[] gu0VarArr5 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                android.content.SharedPreferences sharedPreferences6 = activityChargeControl.H;
                if (sharedPreferences6 == null) {
                    a.wv.M1("spf");
                    throw null;
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences6.edit();
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                android.widget.CompoundButton compoundButton2 = (android.widget.CompoundButton) view;
                edit.putBoolean("bp", compoundButton2.isChecked()).apply();
                if (!compoundButton2.isChecked()) {
                    activityChargeControl.G.getClass();
                    a.mr.g();
                    return;
                } else {
                    com.omarea.vtools.activities.ActivityChargeControl.r();
                    a.cp cpVar3 = com.omarea.Scene.c;
                    a.fs1.W(2131952015, 1);
                    return;
                }
            case 5:
                a.gu0[] gu0VarArr6 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                android.content.SharedPreferences sharedPreferences7 = activityChargeControl.H;
                if (sharedPreferences7 == null) {
                    a.wv.M1("spf");
                    throw null;
                }
                android.content.SharedPreferences.Editor edit2 = sharedPreferences7.edit();
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                android.widget.CompoundButton compoundButton3 = (android.widget.CompoundButton) view;
                edit2.putBoolean("cdp_disable", compoundButton3.isChecked()).apply();
                if (!compoundButton3.isChecked()) {
                    activityChargeControl.G.getClass();
                    a.mr.g();
                    return;
                } else {
                    com.omarea.vtools.activities.ActivityChargeControl.r();
                    a.cp cpVar4 = com.omarea.Scene.c;
                    a.fs1.W(2131952015, 1);
                    return;
                }
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_WRITE /* 6 */:
                a.gu0[] gu0VarArr7 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.CompoundButton");
                boolean isChecked3 = ((android.widget.CompoundButton) view).isChecked();
                activityChargeControl.G.getClass();
                a.nu0 nu0Var = a.nu0.f395a;
                if (a.nu0.l("/sys/class/power_supply/usb/pd_allowed", isChecked3 ? "1" : "0")) {
                    a.nu0.l("/sys/class/power_supply/usb/pd_active", "1");
                    return;
                }
                return;
            case 7:
                a.gu0[] gu0VarArr8 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                a.wv.t(view, "null cannot be cast to non-null type android.widget.Checkable");
                boolean isChecked4 = ((android.widget.Checkable) view).isChecked();
                activityChargeControl.G.getClass();
                a.nu0 nu0Var2 = a.nu0.f395a;
                a.nu0.l("/sys/class/power_supply/battery/step_charging_enabled", isChecked4 ? "1" : "0");
                return;
            case 8:
                a.gu0[] gu0VarArr9 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                activityChargeControl.G.getClass();
                a.wv.e(a.q10.L("charge-control", "pause", null), "true");
                return;
            case 9:
                a.gu0[] gu0VarArr10 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                activityChargeControl.G.getClass();
                a.mr.g();
                return;
            case 10:
                a.gu0[] gu0VarArr11 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                new a.l1(activityChargeControl, 17).k(new a.u5(activityChargeControl, 1));
                return;
            case 11:
                a.gu0[] gu0VarArr12 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                android.widget.Toast.makeText(activityChargeControl, activityChargeControl.getString(2131952166), 0).show();
                return;
            case 12:
                a.gu0[] gu0VarArr13 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                new a.l1(activityChargeControl, 17).k(new a.u5(activityChargeControl, 0));
                return;
            default:
                a.gu0[] gu0VarArr14 = com.omarea.vtools.activities.ActivityChargeControl.L;
                a.wv.w(activityChargeControl, "this$0");
                android.widget.Toast.makeText(activityChargeControl, activityChargeControl.getString(2131952166), 0).show();
                return;
        }
    }
}
