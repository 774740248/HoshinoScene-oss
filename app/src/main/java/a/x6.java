package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final /* synthetic */ class x6 implements android.view.View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ android.widget.TextView d;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityCpuControl e;

    public /* synthetic */ x6(android.widget.TextView textView, com.omarea.vtools.activities.ActivityCpuControl activityCpuControl, int i) {
        this.c = i;
        this.d = textView;
        this.e = activityCpuControl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.c;
        com.omarea.vtools.activities.ActivityCpuControl activityCpuControl = this.e;
        android.widget.TextView textView = this.d;
        switch (i) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                android.content.Intent intent = new android.content.Intent(textView.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPerfOptions.class);
                intent.putExtra("config", 2131886093);
                intent.putExtra("title", "CpuCtl");
                activityCpuControl.startActivity(intent);
                return;
            default:
                android.content.Intent intent2 = new android.content.Intent(textView.getContext(), (java.lang.Class<?>) com.omarea.vtools.activities.ActivityPerfOptions.class);
                intent2.putExtra("config", 2131886092);
                intent2.putExtra("title", "SchedTune");
                activityCpuControl.startActivity(intent2);
                return;
        }
    }
}
