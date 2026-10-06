package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class w4 implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.omarea.vtools.activities.ActivityAppXposedDetails f651a;

    public w4(com.omarea.vtools.activities.ActivityAppXposedDetails activityAppXposedDetails) {
        this.f651a = activityAppXposedDetails;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, a.rr0] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        a.tr0 tr0Var;
        int i = a.sr0.f536a;
        if (iBinder == null) {
            tr0Var = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.omarea.vaddin.IAppConfigAidlInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a.tr0)) {
                rr0 obj = new rr0();
                obj.f503a = iBinder;
                tr0Var = obj;
            } else {
                tr0Var = (a.tr0) queryLocalInterface;
            }
        }
        com.omarea.vtools.activities.ActivityAppXposedDetails activityAppXposedDetails = this.f651a;
        activityAppXposedDetails.q = tr0Var;
        activityAppXposedDetails.t();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f651a.q = null;
    }
}
