package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppDetails f338a;
    public final /* synthetic */ android.view.View b;

    public m4(com.omarea.vtools.activities.ActivityAppDetails activityAppDetails, android.view.View view) {
        this.f338a = activityAppDetails;
        this.b = view;
    }

    public final void a(java.lang.String str, int i) {
        this.f338a.u().screenOrientation = i;
        android.view.View view = this.b;
        a.wv.t(view, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) view).setText(str);
    }
}
