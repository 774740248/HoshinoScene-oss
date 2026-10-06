package a;

/* loaded from: /tmp/jadx-10340276197810293799.dex */
public final class qs1 implements android.webkit.DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f479a;
    public final /* synthetic */ a.nk b;

    public qs1(a.nk nkVar, android.app.Activity activity) {
        this.b = nkVar;
        this.f479a = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.DialogInterface.OnClickListener, java.lang.Object] */
    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        a.nk nkVar = this.b;
        if (((android.content.Context) nkVar.e).checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            this.f479a.requestPermissions(new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            android.widget.Toast.makeText((android.content.Context) nkVar.e, 2131952777, 1).show();
            return;
        }
        int i = a.x60.f681a;
        android.app.AlertDialog.Builder negativeButton = new android.app.AlertDialog.Builder((android.content.Context) nkVar.e).setTitle(2131952669).setMessage(str + "\n\n" + str4 + "\n" + j + "Bytes").setPositiveButton(2131952077, new a.en(this, str, str3, str4)).setNegativeButton(2131952076, new android.content.DialogInterface.OnClickListener());
        a.wv.w(negativeButton, "builder");
        android.app.AlertDialog create = negativeButton.create();
        a.fs1.b(create);
        a.wv.v(create, "dialog");
        new a.v60(create).b(false);
    }
}
