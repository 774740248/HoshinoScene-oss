package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class uz extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f614a = 0;
    public final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz(a.vz vzVar) {
        super(new android.os.Handler());
        this.b = vzVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f614a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, android.net.Uri uri) {
        switch (this.f614a) {
            case 1:
                ((a.ri0) this.b).c();
                return;
            default:
                super.onChange(z, uri);
                return;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        android.database.Cursor cursor;
        switch (this.f614a) {
            case com.omarea.krscript.model.ShellHandlerBase.EVENT_START /* 0 */:
                a.vz vzVar = (a.vz) this.b;
                if (!vzVar.d || (cursor = vzVar.e) == null || cursor.isClosed()) {
                    return;
                }
                vzVar.c = vzVar.e.requery();
                return;
            default:
                super.onChange(z);
                return;
        }
    }
}
