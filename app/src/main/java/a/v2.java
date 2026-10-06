package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class v2 extends java.util.TimerTask {
    public static final /* synthetic */ int k = 0;
    public final /* synthetic */ android.app.DownloadManager c;
    public final /* synthetic */ android.app.DownloadManager.Query d;
    public final /* synthetic */ com.omarea.vtools.activities.ActionPageOnline e;
    public final /* synthetic */ android.os.Handler f;
    public final /* synthetic */ a.f90 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ boolean j;

    public v2(android.app.DownloadManager downloadManager, android.app.DownloadManager.Query query, com.omarea.vtools.activities.ActionPageOnline actionPageOnline, android.os.Handler handler, a.f90 f90Var, long j, java.lang.String str, boolean z) {
        this.c = downloadManager;
        this.d = query;
        this.e = actionPageOnline;
        this.f = handler;
        this.g = f90Var;
        this.h = j;
        this.i = str;
        this.j = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, a.ma1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, a.ma1] */
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        android.database.Cursor query = this.c.query(this.d);
        a.ma1 obj = new a.ma1();
        obj.c = "";
        a.ma1 obj2 = new a.ma1();
        obj2.c = "";
        if (query.moveToFirst()) {
            int i = (int) ((query.getLong(query.getColumnIndexOrThrow("bytes_so_far")) * 100) / query.getLong(query.getColumnIndexOrThrow("total_size")));
            int length = ((java.lang.CharSequence) obj.c).length();
            final com.omarea.vtools.activities.ActionPageOnline actionPageOnline = this.e;
            if (length == 0) {
                try {
                    java.lang.String string = query.getString(query.getColumnIndexOrThrow("local_uri"));
                    a.wv.v(string, "cursor.getString(nameColumn)");
                    obj.c = string;
                    java.lang.String B = a.fs1.B(actionPageOnline, android.net.Uri.parse(string));
                    a.wv.v(B, "FilePathResolver().getPa…ine, Uri.parse(fileName))");
                    obj2.c = B;
                    if (B.length() != 0) {
                        obj.c = obj2.c;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            a.bf1 bf1Var = new a.bf1(this.e, obj, i, this.g, this.i, 1);
            android.os.Handler handler = this.f;
            handler.post(bf1Var);
            if (i >= 100) {
                this.g.b(this.h, (java.lang.String) obj2.c);
                final boolean z = this.j;
                handler.post(new a.u2());
            }
        }
    }
}
