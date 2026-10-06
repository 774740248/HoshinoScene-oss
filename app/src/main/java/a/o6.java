package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class o6 implements java.lang.Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl d;

    public /* synthetic */ o6(com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, int i) {
        this.c = i;
        this.d = activityCpuControl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.gu0[] gu0VarArr = com.omarea.vtools.activities.ActivityCpuControl.J;
                a.wv.w(activityCpuControl, "this$0");
                try {
                    ((com.omarea.ui.BlurView) activityCpuControl.r.a(gu0VarArr[14])).setVisibility(activityCpuControl.y ? 0 : 8);
                    int i2 = activityCpuControl.w - 1;
                    if (i2 >= 0) {
                        int i3 = 0;
                        while (true) {
                            android.widget.CheckBox checkBox = new android.widget.CheckBox(activityCpuControl.getContext());
                            checkBox.setText("CPU" + i3);
                            activityCpuControl.x.add(checkBox);
                            android.widget.GridLayout gridLayout = (android.widget.GridLayout) activityCpuControl.g.a(gu0VarArr[3]);
                            android.widget.GridLayout.LayoutParams layoutParams = new android.widget.GridLayout.LayoutParams();
                            layoutParams.height = -2;
                            layoutParams.width = 0;
                            layoutParams.columnSpec = android.widget.GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                            gridLayout.addView(checkBox, layoutParams);
                            if (i3 != i2) {
                                i3++;
                            }
                        }
                    }
                    activityCpuControl.t();
                    activityCpuControl.B = true;
                } catch (java.lang.Exception unused) {
                }
                activityCpuControl.F();
                ((com.omarea.common.ui.OverScrollView) activityCpuControl.t.a(com.omarea.vtools.activities.ActivityCpuControl.J[16])).setVisibility(0);
                return;
            default:
                activityCpuControl.finish();
                return;
        }
    }
}
