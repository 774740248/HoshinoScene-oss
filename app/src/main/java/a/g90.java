package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class g90 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static a.g90 f171a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            return;
        }
        try {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            android.app.DownloadManager downloadManager = (android.app.DownloadManager) context.getSystemService("download");
            android.text.TextUtils.isEmpty(downloadManager.getMimeTypeForDownloadedFile(longExtra));
            java.lang.String B = a.fs1.B(context, downloadManager.getUriForDownloadedFile(longExtra));
            if (B == null || B.isEmpty()) {
                return;
            }
            new a.f90(context).b(longExtra, B);
            try {
                int i = a.x60.f681a;
                a.fs1.F(context, context.getString(2131952668), B, null);
            } catch (java.lang.Exception unused) {
                android.widget.Toast.makeText(context, context.getString(2131952668) + "\n" + B, 1).show();
            }
        } catch (java.lang.Exception unused2) {
        }
    }
}
