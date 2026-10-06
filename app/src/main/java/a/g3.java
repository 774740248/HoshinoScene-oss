package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g3 implements com.omarea.krscript.model.AutoRunTask {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f168a;
    public final /* synthetic */ com.omarea.vtools.activities.ActivityActionPage b;

    public g3(com.omarea.vtools.activities.ActivityActionPage activityActionPage) {
        this.b = activityActionPage;
        this.f168a = activityActionPage.i;
    }

    @Override // com.omarea.krscript.model.AutoRunTask
    public final java.lang.String getKey() {
        return this.f168a;
    }

    @Override // com.omarea.krscript.model.AutoRunTask
    public final void onCompleted(java.lang.Boolean bool) {
        if (a.wv.e(bool, java.lang.Boolean.TRUE)) {
            return;
        }
        com.omarea.vtools.activities.ActivityActionPage activityActionPage = this.b;
        android.widget.Toast.makeText(activityActionPage, activityActionPage.getString(2131952621), 0).show();
    }
}
